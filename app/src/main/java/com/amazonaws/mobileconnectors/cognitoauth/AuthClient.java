package com.amazonaws.mobileconnectors.cognitoauth;

import a.d.b.c;
import a.d.b.d;
import a.d.b.e;
import a.d.b.f;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.amazonaws.cognito.clientcontext.data.UserContextDataProvider;
import com.amazonaws.mobileconnectors.cognitoauth.activities.CustomTabsManagerActivity;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthInvalidGrantException;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthNavigationException;
import com.amazonaws.mobileconnectors.cognitoauth.exceptions.AuthServiceException;
import com.amazonaws.mobileconnectors.cognitoauth.handlers.AuthHandler;
import com.amazonaws.mobileconnectors.cognitoauth.util.AuthHttpClient;
import com.amazonaws.mobileconnectors.cognitoauth.util.AuthHttpResponseParser;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.cognitoauth.util.LocalDataManager;
import com.amazonaws.mobileconnectors.cognitoauth.util.Pkce;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class AuthClient {
    public static final int CUSTOM_TABS_ACTIVITY_CODE = 49281;
    private static final String DEFAULT_BROWSER_PACKAGE = "com.android.chrome";
    private static final String REDIRECT_ACTIVITY_NAME = "HostedUIRedirectActivity";
    private static final long REDIRECT_TIMEOUT_SECONDS = 10;
    private static final String TAG = "AuthClient";
    private final Context context;
    private CountDownLatch cookiesCleared;
    private boolean isRedirectActivityDeclared;
    private c mCustomTabsClient;
    private d mCustomTabsIntent;
    private e mCustomTabsServiceConnection;
    private f mCustomTabsSession;
    private final Auth pool;
    private String proofKey;
    private String proofKeyHash;
    private String state;
    private AuthHandler userHandler;
    private String userId;

    public AuthClient(Context context, Auth auth) {
        this(context, auth, null);
    }

    public AuthClient(Context context, Auth auth, String str) {
        this.context = context;
        this.pool = auth;
        this.userId = str;
        this.isRedirectActivityDeclared = false;
        preWarmChrome();
    }

    private void endSession(String str) {
        try {
            this.cookiesCleared = new CountDownLatch(1);
            launchSignOut(this.pool.getSignOutRedirectUri(), str);
            if (!isRedirectActivityDeclared()) {
                this.cookiesCleared.countDown();
            }
            if (!this.cookiesCleared.await(REDIRECT_TIMEOUT_SECONDS, TimeUnit.SECONDS)) {
                throw new AuthServiceException("Timed out while waiting for sign-out redirect response.");
            }
        } catch (InterruptedException unused) {
            throw new AuthNavigationException("User cancelled sign-out.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> generateTokenExchangeRequest(Uri uri, String str) {
        HashMap map = new HashMap();
        map.put("grant_type", ClientConstants.TOKEN_GRANT_TYPE_AUTH_CODE);
        map.put(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID, this.pool.getAppId());
        map.put(ClientConstants.DOMAIN_QUERY_PARAM_REDIRECT_URI, this.pool.getSignInRedirectUri());
        map.put(ClientConstants.DOMAIN_QUERY_PARAM_CODE_VERIFIER, str);
        map.put("code", uri.getQueryParameter("code"));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> generateTokenRefreshRequest(String str, AuthUserSession authUserSession) {
        HashMap map = new HashMap();
        map.put("grant_type", "refresh_token");
        map.put(ClientConstants.DOMAIN_QUERY_PARAM_REDIRECT_URI, str);
        map.put(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID, this.pool.getAppId());
        map.put("refresh_token", authUserSession.getRefreshToken().getToken());
        String userContextData = getUserContextData();
        if (userContextData != null) {
            map.put(ClientConstants.DOMAIN_QUERY_PARAM_USERCONTEXTDATA, userContextData);
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getHttpHeader() {
        HashMap map = new HashMap();
        map.put("Content-Type", ClientConstants.HTTP_HEADER_PROP_CONTENT_TYPE_DEFAULT);
        if (this.pool.getAppSecret() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Basic ");
            sb.append(Pkce.encodeBase64(this.pool.getAppId() + ":" + this.pool.getAppSecret()));
            map.put("Authorization", sb.toString());
        }
        return map;
    }

    private void getTokens(final Uri uri, final AuthHandler authHandler) {
        new Thread(new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.1
            public final Handler handler;
            public Runnable returnCallback = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.1.1
                @Override // java.lang.Runnable
                public void run() {
                    authHandler.onFailure(new InvalidParameterException());
                }
            };

            {
                this.handler = new Handler(AuthClient.this.context.getMainLooper());
            }

            @Override // java.lang.Runnable
            public void run() {
                Runnable runnable;
                Uri uriBuild = new Uri.Builder().scheme(ClientConstants.DOMAIN_SCHEME).authority(AuthClient.this.pool.getAppWebDomain()).appendPath(ClientConstants.DOMAIN_PATH_OAUTH2).appendPath("token").build();
                String queryParameter = uri.getQueryParameter("state");
                if (queryParameter != null) {
                    Set<String> cachedScopes = LocalDataManager.getCachedScopes(AuthClient.this.pool.awsKeyValueStore, AuthClient.this.context, queryParameter);
                    String cachedProofKey = LocalDataManager.getCachedProofKey(AuthClient.this.pool.awsKeyValueStore, AuthClient.this.context, queryParameter);
                    if (cachedProofKey == null) {
                        return;
                    }
                    final String queryParameter2 = uri.getQueryParameter("error");
                    if (queryParameter2 == null) {
                        try {
                            final AuthUserSession httpResponse = AuthHttpResponseParser.parseHttpResponse(new AuthHttpClient().httpPost(new URL(uriBuild.toString()), AuthClient.this.getHttpHeader(), AuthClient.this.generateTokenExchangeRequest(uri, cachedProofKey)));
                            AuthClient.this.userId = httpResponse.getUsername();
                            LocalDataManager.cacheSession(AuthClient.this.pool.awsKeyValueStore, AuthClient.this.context, AuthClient.this.pool.getAppId(), AuthClient.this.userId, httpResponse, cachedScopes);
                            this.returnCallback = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.1.3
                                @Override // java.lang.Runnable
                                public void run() {
                                    authHandler.onSuccess(httpResponse);
                                }
                            };
                        } catch (Exception e2) {
                            this.returnCallback = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.1.4
                                @Override // java.lang.Runnable
                                public void run() {
                                    authHandler.onFailure(e2);
                                }
                            };
                        }
                        this.handler.post(this.returnCallback);
                    }
                    runnable = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            authHandler.onFailure(new AuthServiceException(queryParameter2));
                        }
                    };
                } else {
                    if (AuthClient.this.cookiesCleared != null) {
                        AuthClient.this.cookiesCleared.countDown();
                        Log.d(AuthClient.TAG, "Sign-out was successful.");
                    }
                    runnable = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.1.5
                        @Override // java.lang.Runnable
                        public void run() {
                            authHandler.onSignout();
                        }
                    };
                }
                this.returnCallback = runnable;
                this.handler.post(this.returnCallback);
            }
        }).start();
    }

    private String getUserContextData() {
        if (this.pool.isAdvancedSecurityDataCollectionEnabled()) {
            return UserContextDataProvider.getInstance().getEncodedContextData(this.context, this.userId, this.pool.getUserPoolId(), this.pool.getAppId());
        }
        return null;
    }

    private boolean isRedirectActivityDeclared() {
        if (this.isRedirectActivityDeclared) {
            return true;
        }
        Context context = this.context;
        if (context == null) {
            Log.w(TAG, "Context is null. Failed to inspect packages.");
            return false;
        }
        try {
            Iterator<PackageInfo> it = context.getPackageManager().getInstalledPackages(1).iterator();
            while (it.hasNext()) {
                ActivityInfo[] activityInfoArr = it.next().activities;
                if (activityInfoArr != null) {
                    for (ActivityInfo activityInfo : activityInfoArr) {
                        if (activityInfo.name.contains(REDIRECT_ACTIVITY_NAME)) {
                            this.isRedirectActivityDeclared = true;
                            return true;
                        }
                    }
                }
            }
            Log.w(TAG, "HostedUIRedirectActivity is not declared in AndroidManifest.");
        } catch (Exception unused) {
            Log.w(TAG, "Failed to inspect packages.");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void launchCognitoAuth(String str, Set<String> set, Activity activity, String str2) {
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(ClientConstants.DOMAIN_SCHEME).authority(this.pool.getAppWebDomain()).appendPath(ClientConstants.DOMAIN_PATH_OAUTH2).appendPath(ClientConstants.DOMAIN_PATH_SIGN_IN).appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID, this.pool.getAppId()).appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_REDIRECT_URI, str).appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_RESPONSE_TYPE, "code").appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE, this.proofKeyHash).appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE_METHOD, ClientConstants.DOMAIN_QUERY_PARAM_CODE_CHALLENGE_METHOD_SHA256).appendQueryParameter("state", this.state).appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_USERCONTEXTDATA, getUserContextData());
        if (!TextUtils.isEmpty(this.pool.getIdentityProvider())) {
            builderAppendQueryParameter.appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_IDENTITY_PROVIDER, this.pool.getIdentityProvider());
        }
        if (!TextUtils.isEmpty(this.pool.getIdpIdentifier())) {
            builderAppendQueryParameter.appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_IDP_IDENTIFIER, this.pool.getIdpIdentifier());
        }
        int size = set.size();
        if (size > 0) {
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                int i3 = i2 + 1;
                if (i2 < size - 1) {
                    sb.append(" ");
                }
                i2 = i3;
            }
            builderAppendQueryParameter.appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_SCOPES, sb.toString());
        }
        Uri uriBuild = builderAppendQueryParameter.build();
        LocalDataManager.cacheState(this.pool.awsKeyValueStore, this.context, this.state, this.proofKey, set);
        launchCustomTabs(uriBuild, activity, str2);
    }

    private void launchCustomTabs(Uri uri, Activity activity, String str) {
        try {
            this.mCustomTabsIntent = new d.a(this.mCustomTabsSession).a();
            if (this.pool.getCustomTabExtras() != null) {
                this.mCustomTabsIntent.f1167a.putExtras(this.pool.getCustomTabExtras());
            }
            Intent intent = this.mCustomTabsIntent.f1167a;
            if (str == null) {
                str = "com.android.chrome";
            }
            intent.setPackage(str);
            this.mCustomTabsIntent.f1167a.setData(uri);
            if (activity != null) {
                activity.startActivityForResult(CustomTabsManagerActivity.createStartIntent(this.context, this.mCustomTabsIntent.f1167a), 49281);
                return;
            }
            Intent intentCreateStartIntent = CustomTabsManagerActivity.createStartIntent(this.context, this.mCustomTabsIntent.f1167a);
            intentCreateStartIntent.addFlags(1342177280);
            this.context.startActivity(intentCreateStartIntent);
        } catch (Exception e2) {
            this.userHandler.onFailure(e2);
        }
    }

    private void launchSignOut(String str, String str2) {
        launchCustomTabs(new Uri.Builder().scheme(ClientConstants.DOMAIN_SCHEME).authority(this.pool.getAppWebDomain()).appendPath(ClientConstants.DOMAIN_PATH_SIGN_OUT).appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID, this.pool.getAppId()).appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_LOGOUT_URI, str).build(), null, str2);
    }

    private void preWarmChrome() {
        this.mCustomTabsServiceConnection = new e() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.3
            @Override // a.d.b.e
            public void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
                AuthClient.this.mCustomTabsClient = cVar;
                AuthClient.this.mCustomTabsClient.e(0L);
                AuthClient authClient = AuthClient.this;
                authClient.mCustomTabsSession = authClient.mCustomTabsClient.c(null);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                AuthClient.this.mCustomTabsClient = null;
            }
        };
    }

    private void refreshSession(final AuthUserSession authUserSession, final String str, final Set<String> set, final AuthHandler authHandler, final boolean z, final String str2, final Activity activity) {
        new Thread(new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.2
            public final Handler handler;
            public Runnable returnCallback;

            {
                this.handler = new Handler(AuthClient.this.context.getMainLooper());
            }

            @Override // java.lang.Runnable
            public void run() {
                Runnable runnable;
                Uri uriBuild = new Uri.Builder().scheme(ClientConstants.DOMAIN_SCHEME).authority(AuthClient.this.pool.getAppWebDomain()).appendPath(ClientConstants.DOMAIN_PATH_OAUTH2).appendPath("token").build();
                try {
                    AuthUserSession httpResponse = AuthHttpResponseParser.parseHttpResponse(new AuthHttpClient().httpPost(new URL(uriBuild.toString()), AuthClient.this.getHttpHeader(), AuthClient.this.generateTokenRefreshRequest(str, authUserSession)));
                    final AuthUserSession authUserSession2 = new AuthUserSession(httpResponse.getIdToken(), httpResponse.getAccessToken(), authUserSession.getRefreshToken());
                    LocalDataManager.cacheSession(AuthClient.this.pool.awsKeyValueStore, AuthClient.this.context, AuthClient.this.pool.getAppId(), authUserSession2.getUsername(), authUserSession2, AuthClient.this.pool.getScopes());
                    this.returnCallback = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            authHandler.onSuccess(authUserSession2);
                        }
                    };
                } catch (AuthInvalidGrantException e2) {
                    if (z) {
                        this.returnCallback = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.2.2
                            @Override // java.lang.Runnable
                            public void run() {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                AuthClient.this.launchCognitoAuth(str, set, activity, str2);
                            }
                        };
                    } else {
                        runnable = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.2.3
                            @Override // java.lang.Runnable
                            public void run() {
                                AuthClient.this.userHandler.onFailure(e2);
                            }
                        };
                        this.returnCallback = runnable;
                    }
                } catch (Exception e3) {
                    runnable = new Runnable() { // from class: com.amazonaws.mobileconnectors.cognitoauth.AuthClient.2.4
                        @Override // java.lang.Runnable
                        public void run() {
                            authHandler.onFailure(e3);
                        }
                    };
                    this.returnCallback = runnable;
                }
                this.handler.post(this.returnCallback);
            }
        }).start();
    }

    public void getSession(boolean z, Activity activity) {
        getSession(z, activity, "com.android.chrome");
    }

    public void getSession(boolean z, Activity activity, String str) {
        try {
            String strGenerateRandom = Pkce.generateRandom();
            this.proofKey = strGenerateRandom;
            this.proofKeyHash = Pkce.generateHash(strGenerateRandom);
            this.state = Pkce.generateRandom();
        } catch (Exception e2) {
            this.userHandler.onFailure(e2);
        }
        Auth auth = this.pool;
        AuthUserSession cachedSession = LocalDataManager.getCachedSession(auth.awsKeyValueStore, this.context, auth.getAppId(), this.userId, this.pool.getScopes());
        if (cachedSession.isValidForThreshold()) {
            this.userHandler.onSuccess(cachedSession);
            return;
        }
        if (cachedSession.getRefreshToken() != null && cachedSession.getRefreshToken().getToken() != null) {
            refreshSession(cachedSession, this.pool.getSignInRedirectUri(), this.pool.getScopes(), this.userHandler, z, str, activity);
        } else if (z) {
            launchCognitoAuth(this.pool.getSignInRedirectUri(), this.pool.getScopes(), activity, str);
        } else {
            this.userHandler.onFailure(new Exception("No cached session"));
        }
    }

    public void getTokens(Uri uri) {
        if (uri == null) {
            return;
        }
        getTokens(uri, this.userHandler);
    }

    public String getUsername() {
        return this.userId;
    }

    public void handleCustomTabsCancelled() {
        this.userHandler.onFailure(new AuthNavigationException("user cancelled"));
    }

    public boolean isAuthenticated() {
        Auth auth = this.pool;
        return LocalDataManager.getCachedSession(auth.awsKeyValueStore, this.context, auth.getAppId(), this.userId, this.pool.getScopes()).isValidForThreshold();
    }

    public void setUserHandler(AuthHandler authHandler) {
        if (authHandler == null) {
            throw new InvalidParameterException("Callback handler cannot be null");
        }
        this.userHandler = authHandler;
    }

    public void setUsername(String str) {
        this.userId = str;
    }

    public void signOut() {
        signOut("com.android.chrome");
    }

    public void signOut(String str) {
        signOut(false, str);
    }

    public void signOut(boolean z) {
        signOut(z, "com.android.chrome");
    }

    public void signOut(boolean z, String str) {
        if (!z) {
            endSession(str);
        }
        Auth auth = this.pool;
        LocalDataManager.clearCache(auth.awsKeyValueStore, this.context, auth.getAppId(), this.userId);
    }

    public void unbindServiceConnection() {
        e eVar = this.mCustomTabsServiceConnection;
        if (eVar != null) {
            this.context.unbindService(eVar);
        }
    }
}
