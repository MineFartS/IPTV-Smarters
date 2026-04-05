package com.amplifyframework.auth.cognito.options;

import a.i.q.d;
import com.amplifyframework.auth.options.AuthSignInOptions;
import com.amplifyframework.util.Immutable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AWSCognitoAuthSignInOptions extends AuthSignInOptions {
    private final Map<String, String> metadata;

    public static final class CognitoBuilder extends AuthSignInOptions.Builder<CognitoBuilder> {
        private Map<String, String> metadata = new HashMap();

        @Override // com.amplifyframework.auth.options.AuthSignInOptions.Builder
        public AWSCognitoAuthSignInOptions build() {
            return new AWSCognitoAuthSignInOptions(Immutable.of(this.metadata));
        }

        @Override // com.amplifyframework.auth.options.AuthSignInOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        public CognitoBuilder metadata(Map<String, String> map) {
            map.getClass();
            this.metadata.clear();
            this.metadata.putAll(map);
            return getThis();
        }
    }

    public AWSCognitoAuthSignInOptions(Map<String, String> map) {
        this.metadata = map;
    }

    public static CognitoBuilder builder() {
        return new CognitoBuilder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AWSCognitoAuthSignInOptions.class != obj.getClass()) {
            return false;
        }
        return d.a(getMetadata(), ((AWSCognitoAuthSignInOptions) obj).getMetadata());
    }

    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return d.b(getMetadata());
    }

    public String toString() {
        return "AWSCognitoAuthSignInOptions{metadata=" + this.metadata + '}';
    }
}
