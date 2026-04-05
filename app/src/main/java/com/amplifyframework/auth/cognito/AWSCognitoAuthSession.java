package com.amplifyframework.auth.cognito;

import a.i.q.d;
import com.amazonaws.auth.AWSCredentials;
import com.amplifyframework.auth.AuthSession;
import com.amplifyframework.auth.result.AuthSessionResult;

/* JADX INFO: loaded from: classes.dex */
public final class AWSCognitoAuthSession extends AuthSession {
    private final AuthSessionResult<AWSCredentials> awsCredentials;
    private final AuthSessionResult<String> identityId;
    private final AuthSessionResult<AWSCognitoUserPoolTokens> userPoolTokens;
    private final AuthSessionResult<String> userSub;

    public AWSCognitoAuthSession(boolean z, AuthSessionResult<String> authSessionResult, AuthSessionResult<AWSCredentials> authSessionResult2, AuthSessionResult<String> authSessionResult3, AuthSessionResult<AWSCognitoUserPoolTokens> authSessionResult4) {
        super(z);
        authSessionResult.getClass();
        this.identityId = authSessionResult;
        authSessionResult2.getClass();
        this.awsCredentials = authSessionResult2;
        authSessionResult3.getClass();
        this.userSub = authSessionResult3;
        authSessionResult4.getClass();
        this.userPoolTokens = authSessionResult4;
    }

    @Override // com.amplifyframework.auth.AuthSession
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AWSCognitoAuthSession.class != obj.getClass()) {
            return false;
        }
        AWSCognitoAuthSession aWSCognitoAuthSession = (AWSCognitoAuthSession) obj;
        return d.a(Boolean.valueOf(isSignedIn()), Boolean.valueOf(aWSCognitoAuthSession.isSignedIn())) && d.a(getAWSCredentials(), aWSCognitoAuthSession.getAWSCredentials()) && d.a(getUserSub(), aWSCognitoAuthSession.getUserSub()) && d.a(getIdentityId(), aWSCognitoAuthSession.getIdentityId()) && d.a(getUserPoolTokens(), aWSCognitoAuthSession.getUserPoolTokens());
    }

    public AuthSessionResult<AWSCredentials> getAWSCredentials() {
        return this.awsCredentials;
    }

    public AuthSessionResult<String> getIdentityId() {
        return this.identityId;
    }

    public AuthSessionResult<AWSCognitoUserPoolTokens> getUserPoolTokens() {
        return this.userPoolTokens;
    }

    public AuthSessionResult<String> getUserSub() {
        return this.userSub;
    }

    @Override // com.amplifyframework.auth.AuthSession
    public int hashCode() {
        return d.b(Boolean.valueOf(isSignedIn()), getAWSCredentials(), getUserSub(), getIdentityId(), getUserPoolTokens());
    }

    @Override // com.amplifyframework.auth.AuthSession
    public String toString() {
        return "AWSCognitoAuthSession{isSignedIn=" + isSignedIn() + ", awsCredentials=" + getAWSCredentials() + ", userSub='" + getUserSub() + "', identityId='" + getIdentityId() + "', userPoolTokens='" + getUserPoolTokens() + "'}";
    }
}
