package com.amplifyframework.storage.options;

import a.i.q.d;
import android.annotation.SuppressLint;
import com.amplifyframework.storage.options.StorageOptions;

/* JADX INFO: loaded from: classes.dex */
public class StorageListOptions extends StorageOptions {

    public static class Builder<B extends Builder<B>> extends StorageOptions.Builder<B, StorageListOptions> {
        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        @SuppressLint({"SyntheticAccessor"})
        public StorageListOptions build() {
            return new StorageListOptions(this);
        }
    }

    public StorageListOptions(Builder<?> builder) {
        super(builder.getAccessLevel(), builder.getTargetIdentityId());
    }

    public static Builder<?> builder() {
        return new Builder<>();
    }

    public static StorageListOptions defaultInstance() {
        return builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder<?> from(StorageListOptions storageListOptions) {
        return (Builder) ((Builder) builder().accessLevel(storageListOptions.getAccessLevel())).targetIdentityId(storageListOptions.getTargetIdentityId());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageListOptions)) {
            return false;
        }
        StorageListOptions storageListOptions = (StorageListOptions) obj;
        return d.a(getAccessLevel(), storageListOptions.getAccessLevel()) && d.a(getTargetIdentityId(), storageListOptions.getTargetIdentityId());
    }

    public int hashCode() {
        return d.b(getAccessLevel(), getTargetIdentityId());
    }

    public String toString() {
        return "StorageListOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + '}';
    }
}
