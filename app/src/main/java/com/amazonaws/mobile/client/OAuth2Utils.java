package com.amazonaws.mobile.client;

import a.d.b.b;
import a.d.b.c;
import a.d.b.d;
import a.d.b.e;
import a.d.b.f;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.amazonaws.mobileconnectors.cognitoauth.util.Pkce;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class OAuth2Utils {
    private b customTabsCallback = new b();
    private final Context mContext;
    private c mCustomTabsClient;
    private e mCustomTabsServiceConnection;
    private f mCustomTabsSession;
    private String mError;
    private String mErrorDescription;
    private final Uri mSignInRedirectUri;
    private String mState;

    public OAuth2Utils(Context context, Uri uri) {
        this.mContext = context;
        this.mSignInRedirectUri = uri;
    }

    public void authorize(String str, String str2, Map<String, String> map) {
        this.mState = Pkce.generateRandom();
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        if (!map.containsKey("code")) {
            builderBuildUpon.appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_RESPONSE_TYPE, "code");
        }
        if (!map.containsKey(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID)) {
            if (str2 == null) {
                throw new IllegalArgumentException("Client id must be specified for an authorization request.");
            }
            builderBuildUpon.appendQueryParameter(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID, str2);
        }
        builderBuildUpon.appendQueryParameter("state", this.mState);
        navigate(builderBuildUpon.build());
    }

    public Uri exchangeCode(String str) {
        return null;
    }

    public void navigate(Uri uri) {
        d dVarA = new d.a(this.mCustomTabsSession).a();
        dVarA.f1167a.setPackage("com.android.chrome");
        dVarA.f1167a.addFlags(1073741824);
        dVarA.f1167a.addFlags(268435456);
        dVarA.a(this.mContext, uri);
    }

    public boolean parse(Uri uri) {
        if (uri.getScheme().equals(this.mSignInRedirectUri.getScheme()) && uri.getAuthority().equals(this.mSignInRedirectUri.getAuthority()) && uri.getPath().equals(this.mSignInRedirectUri.getPath()) && uri.getQueryParameterNames().containsAll(this.mSignInRedirectUri.getQueryParameterNames())) {
            uri.getQueryParameter("code");
            if (!this.mState.equals(uri.getQueryParameter("state"))) {
                return false;
            }
            this.mError = uri.getQueryParameter("error");
            this.mErrorDescription = uri.getQueryParameter("error_description");
            if (this.mError != null) {
                return true;
            }
        }
        return false;
    }

    public void preWarm() {
        e eVar = new e() { // from class: com.amazonaws.mobile.client.OAuth2Utils.1
            @Override // a.d.b.e
            public void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
                OAuth2Utils.this.mCustomTabsClient = cVar;
                OAuth2Utils.this.mCustomTabsClient.e(0L);
                OAuth2Utils oAuth2Utils = OAuth2Utils.this;
                oAuth2Utils.mCustomTabsSession = oAuth2Utils.mCustomTabsClient.c(OAuth2Utils.this.customTabsCallback);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                OAuth2Utils.this.mCustomTabsClient = null;
            }
        };
        this.mCustomTabsServiceConnection = eVar;
        c.a(this.mContext, "com.android.chrome", eVar);
    }
}
