package com.amazonaws.event;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class ProgressReportingInputStream extends SdkFilterInputStream {
    private static final int BYTES_IN_KB = 1024;
    private static final int THRESHOLD_IN_KB = 8;
    private boolean fireCompletedEvent;
    private final ProgressListenerCallbackExecutor listenerCallbackExecutor;
    private int notificationThreshold;
    private int unnotifiedByteCount;

    public ProgressReportingInputStream(InputStream inputStream, ProgressListenerCallbackExecutor progressListenerCallbackExecutor) {
        super(inputStream);
        this.notificationThreshold = 8192;
        this.listenerCallbackExecutor = progressListenerCallbackExecutor;
    }

    private void notify(int i2) {
        int i3 = this.unnotifiedByteCount + i2;
        this.unnotifiedByteCount = i3;
        if (i3 >= this.notificationThreshold) {
            this.listenerCallbackExecutor.progressChanged(new ProgressEvent(i3));
            this.unnotifiedByteCount = 0;
        }
    }

    private void notifyCompleted() {
        if (this.fireCompletedEvent) {
            ProgressEvent progressEvent = new ProgressEvent(this.unnotifiedByteCount);
            progressEvent.setEventCode(4);
            this.unnotifiedByteCount = 0;
            this.listenerCallbackExecutor.progressChanged(progressEvent);
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i2 = this.unnotifiedByteCount;
        if (i2 > 0) {
            this.listenerCallbackExecutor.progressChanged(new ProgressEvent(i2));
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
        } else {
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
        this.listenerCallbackExecutor.progressChanged(progressEvent);
        this.unnotifiedByteCount = 0;
    }

    public void setFireCompletedEvent(boolean z) {
        this.fireCompletedEvent = z;
    }

    public void setNotificationThreshold(int i2) {
        this.notificationThreshold = i2 * 1024;
    }
}
