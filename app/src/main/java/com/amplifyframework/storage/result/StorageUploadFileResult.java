package com.amplifyframework.storage.result;

import a.i.q.d;

/* JADX INFO: loaded from: classes.dex */
public final class StorageUploadFileResult extends StorageUploadResult {
    private StorageUploadFileResult(String str) {
        super(str);
    }

    public static StorageUploadFileResult fromKey(String str) {
        str.getClass();
        return new StorageUploadFileResult(str);
    }

    @Override // com.amplifyframework.storage.result.StorageUploadResult
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StorageUploadFileResult.class != obj.getClass()) {
            return false;
        }
        return d.a(super.getKey(), ((StorageUploadFileResult) obj).getKey());
    }

    @Override // com.amplifyframework.storage.result.StorageUploadResult
    public int hashCode() {
        return super.hashCode();
    }
}
