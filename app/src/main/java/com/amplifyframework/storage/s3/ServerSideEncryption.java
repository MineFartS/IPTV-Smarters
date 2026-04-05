package com.amplifyframework.storage.s3;

/* JADX INFO: loaded from: classes.dex */
public enum ServerSideEncryption {
    MANAGED_KEYS("AES256"),
    KMS_KEYS("aws:kms"),
    NONE(me.zhanghai.android.materialprogressbar.BuildConfig.FLAVOR);

    private final String name;

    ServerSideEncryption(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
