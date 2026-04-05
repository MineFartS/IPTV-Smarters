package com.amazonaws;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class AbortedException extends AmazonClientException {
    private static final long serialVersionUID = 1;

    public AbortedException() {
        super(BuildConfig.FLAVOR);
    }

    public AbortedException(String str) {
        super(str);
    }

    public AbortedException(String str, Throwable th) {
        super(str, th);
    }

    public AbortedException(Throwable th) {
        super(BuildConfig.FLAVOR, th);
    }

    @Override // com.amazonaws.AmazonClientException
    public boolean isRetryable() {
        return false;
    }
}
