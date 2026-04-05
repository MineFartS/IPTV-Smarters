package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkFilterInputStream;
import com.amazonaws.services.s3.model.ProgressEvent;
import com.amazonaws.services.s3.model.ProgressListener;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ProgressReportingInputStream extends SdkFilterInputStream {
    private static final int NOTIFICATION_THRESHOLD = 8192;
    private boolean fireCompletedEvent;
    private final ProgressListener listener;
    private int unnotifiedByteCount;

    public ProgressReportingInputStream(InputStream inputStream, ProgressListener progressListener) {
        super(inputStream);
        this.listener = progressListener;
    }

    private void notify(int i2) {
        int i3 = this.unnotifiedByteCount + i2;
        this.unnotifiedByteCount = i3;
        if (i3 >= NOTIFICATION_THRESHOLD) {
            this.listener.progressChanged(new ProgressEvent(i3));
            this.unnotifiedByteCount = 0;
        }
    }

    private void notifyCompleted() {
        if (this.fireCompletedEvent) {
            ProgressEvent progressEvent = new ProgressEvent(this.unnotifiedByteCount);
            progressEvent.setEventCode(4);
            this.unnotifiedByteCount = 0;
            this.listener.progressChanged(progressEvent);
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i2 = this.unnotifiedByteCount;
        if (i2 > 0) {
            this.listener.progressChanged(new ProgressEvent(i2));
            this.unnotifiedByteCount = 0;
        }
        super.close();
    }

    public boolean getFireCompletedEvent() {
        return this.fireCompletedEvent;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i2 = super.read();
        if (i2 == -1) {
            notifyCompleted();
        }
        if (i2 != -1) {
            notify(1);
        }
        return i2;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        int i4 = super.read(bArr, i2, i3);
        if (i4 == -1) {
            notifyCompleted();
        }
        if (i4 != -1) {
            notify(i4);
        }
        return i4;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        super.reset();
        ProgressEvent progressEvent = new ProgressEvent(this.unnotifiedByteCount);
        progressEvent.setEventCode(32);
        this.listener.progressChanged(progressEvent);
        this.unnotifiedByteCount = 0;
    }

    public void setFireCompletedEvent(boolean z) {
        this.fireCompletedEvent = z;
    }
}
