package com.amplifyframework.storage.options;

import a.i.q.d;
import android.annotation.SuppressLint;
import com.amplifyframework.storage.options.StorageOptions;

/* JADX INFO: loaded from: classes.dex */
public class StorageRemoveOptions extends StorageOptions {

    public static class Builder<B extends Builder<B>> extends StorageOptions.Builder<B, StorageRemoveOptions> {
        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        @SuppressLint({"SyntheticAccessor"})
        public StorageRemoveOptions build() {
            return new StorageRemoveOptions(this);
        }
    }

    public StorageRemoveOptions(Builder<?> builder) {
        super(builder.getAccessLevel(), builder.getTargetIdentityId());
    }

    public static Builder<?> builder() {
        return new Builder<>();
    }

    public static StorageRemoveOptions defaultInstance() {
        return builder().build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Builder<?> from(StorageRemoveOptions storageRemoveOptions) {
        return (Builder) ((Builder) builder().accessLevel(storageRemoveOptions.getAccessLevel())).targetIdentityId(storageRemoveOptions.getTargetIdentityId());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageRemoveOptions)) {
            return false;
        }
        StorageRemoveOptions storageRemoveOptions = (StorageRemoveOptions) obj;
        return d.a(getAccessLevel(), storageRemoveOptions.getAccessLevel()) && d.a(getTargetIdentityId(), storageRemoveOptions.getTargetIdentityId());
    }

    public int hashCode() {
        return d.b(getAccessLevel(), getTargetIdentityId());
    }

    public String toString() {
        return "StorageRemoveOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + '}';
    }
}
