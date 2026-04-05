package com.amplifyframework.storage.result;

import a.i.q.d;

/* JADX INFO: loaded from: classes.dex */
public final class StorageUploadInputStreamResult extends StorageUploadResult {
    private StorageUploadInputStreamResult(String str) {
        super(str);
    }

    public static StorageUploadInputStreamResult fromKey(String str) {
        str.getClass();
        return new StorageUploadInputStreamResult(str);
    }

    @Override // com.amplifyframework.storage.result.StorageUploadResult
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StorageUploadInputStreamResult.class != obj.getClass()) {
            return false;
        }
        return d.a(super.getKey(), ((StorageUploadInputStreamResult) obj).getKey());
    }

    @Override // com.amplifyframework.storage.result.StorageUploadResult
    public int hashCode() {
        return super.hashCode();
    }
}
