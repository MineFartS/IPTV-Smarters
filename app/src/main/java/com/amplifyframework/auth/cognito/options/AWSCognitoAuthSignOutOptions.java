package com.amplifyframework.auth.cognito.options;

import a.i.q.d;
import com.amplifyframework.auth.options.AuthSignOutOptions;

/* JADX INFO: loaded from: classes.dex */
public final class AWSCognitoAuthSignOutOptions extends AuthSignOutOptions {
    private final String browserPackage;

    public static final class CognitoBuilder extends AuthSignOutOptions.Builder<CognitoBuilder> {
        private String browserPackage;

        public CognitoBuilder browserPackage(String str) {
            this.browserPackage = str;
            return this;
        }

        @Override // com.amplifyframework.auth.options.AuthSignOutOptions.Builder
        public AWSCognitoAuthSignOutOptions build() {
            return new AWSCognitoAuthSignOutOptions(super.isGlobalSignOut(), this.browserPackage);
        }

        @Override // com.amplifyframework.auth.options.AuthSignOutOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }
    }

    public AWSCognitoAuthSignOutOptions(boolean z, String str) {
        super(z);
        this.browserPackage = str;
    }

    public static CognitoBuilder builder() {
        return new CognitoBuilder();
    }

    @Override // com.amplifyframework.auth.options.AuthSignOutOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AWSCognitoAuthSignOutOptions.class != obj.getClass()) {
            return false;
        }
        AWSCognitoAuthSignOutOptions aWSCognitoAuthSignOutOptions = (AWSCognitoAuthSignOutOptions) obj;
        return d.a(Boolean.valueOf(isGlobalSignOut()), Boolean.valueOf(aWSCognitoAuthSignOutOptions.isGlobalSignOut())) && d.a(getBrowserPackage(), aWSCognitoAuthSignOutOptions.getBrowserPackage());
    }

    public String getBrowserPackage() {
        return this.browserPackage;
    }

    @Override // com.amplifyframework.auth.options.AuthSignOutOptions
    public int hashCode() {
        return d.b(Boolean.valueOf(isGlobalSignOut()), getBrowserPackage());
    }

    @Override // com.amplifyframework.auth.options.AuthSignOutOptions
    public String toString() {
        return "AWSCognitoAuthSignOutOptions{isGlobalSignOut=" + isGlobalSignOut() + ", browserPackage=" + getBrowserPackage() + '}';
    }
}
