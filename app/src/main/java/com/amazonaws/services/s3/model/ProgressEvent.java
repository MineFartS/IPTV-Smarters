package com.amazonaws.services.s3.model;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ProgressEvent extends com.amazonaws.event.ProgressEvent {
    public ProgressEvent(int i2) {
        super(i2);
    }

    public ProgressEvent(int i2, long j2) {
        super(i2, j2);
    }

    @Deprecated
    public int getBytesTransfered() {
        return (int) getBytesTransferred();
    }

    @Deprecated
    public void setBytesTransfered(int i2) {
        setBytesTransferred(i2);
    }
}
