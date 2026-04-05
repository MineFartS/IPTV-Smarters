package com.amplifyframework.storage.result;

import a.i.q.d;

/* JADX INFO: loaded from: classes.dex */
public class StorageUploadResult {
    private final String key;

    public StorageUploadResult(String str) {
        this.key = str;
    }

    public static StorageUploadResult fromKey(String str) {
        str.getClass();
        return new StorageUploadResult(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return d.a(this.key, ((StorageUploadResult) obj).key);
    }

    public String getKey() {
        return this.key;
    }

    public int hashCode() {
        String str = this.key;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
