package com.amplifyframework.storage.options;

import a.i.q.d;
import com.amplifyframework.storage.options.StorageOptions;
import com.amplifyframework.util.Immutable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class StorageUploadOptions extends StorageOptions {
    private final String contentType;
    private final Map<String, String> metadata;

    public static abstract class Builder<B extends Builder<B, O>, O extends StorageOptions> extends StorageOptions.Builder<B, O> {
        private String contentType;
        private Map<String, String> metadata = new HashMap();

        public final B contentType(String str) {
            this.contentType = str;
            return this;
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final Map<String, String> getMetadata() {
            return Immutable.of(this.metadata);
        }

        public final B metadata(Map<String, String> map) {
            map.getClass();
            this.metadata = new HashMap(map);
            return this;
        }
    }

    public <B extends Builder<B, O>, O extends StorageUploadOptions> StorageUploadOptions(Builder<B, O> builder) {
        super(builder.getAccessLevel(), builder.getTargetIdentityId());
        this.contentType = builder.getContentType();
        this.metadata = builder.getMetadata();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageUploadOptions)) {
            return false;
        }
        StorageUploadOptions storageUploadOptions = (StorageUploadOptions) obj;
        return d.a(getAccessLevel(), storageUploadOptions.getAccessLevel()) && d.a(getTargetIdentityId(), storageUploadOptions.getTargetIdentityId()) && d.a(getContentType(), storageUploadOptions.getContentType()) && d.a(getMetadata(), storageUploadOptions.getMetadata());
    }

    public String getContentType() {
        return this.contentType;
    }

    public Map<String, String> getMetadata() {
        return Immutable.of(this.metadata);
    }

    public int hashCode() {
        return d.b(getAccessLevel(), getTargetIdentityId(), getContentType(), getMetadata());
    }

    public String toString() {
        return "StorageUploadOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", contentType=" + getContentType() + ", metadata=" + getMetadata() + '}';
    }
}
