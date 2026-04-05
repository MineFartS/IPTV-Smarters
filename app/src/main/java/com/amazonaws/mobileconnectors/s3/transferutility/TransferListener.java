package com.amazonaws.mobileconnectors.s3.transferutility;

/* JADX INFO: loaded from: classes.dex */
public interface TransferListener {
    void onError(int i2, Exception exc);

    void onProgressChanged(int i2, long j2, long j3);

    void onStateChanged(int i2, TransferState transferState);
}
