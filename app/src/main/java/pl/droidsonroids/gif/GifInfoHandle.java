package pl.droidsonroids.gif;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.IOException;
import m.a.a.c;
import m.a.a.h;

/* JADX INFO: loaded from: classes2.dex */
public final class GifInfoHandle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f31377a;

    static {
        h.b();
    }

    public GifInfoHandle(AssetFileDescriptor assetFileDescriptor) {
        try {
            this.f31377a = n(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), false);
        } finally {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    public static native int createTempNativeFileDescriptor();

    public static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z);

    public static native void free(long j2);

    public static native int getCurrentFrameIndex(long j2);

    public static native int getCurrentLoop(long j2);

    public static native int getCurrentPosition(long j2);

    public static native int getDuration(long j2);

    public static native int getHeight(long j2);

    public static native int getLoopCount(long j2);

    public static native int getNativeErrorCode(long j2);

    public static native int getNumberOfFrames(long j2);

    public static native long[] getSavedState(long j2);

    public static native int getWidth(long j2);

    public static int h(FileDescriptor fileDescriptor, boolean z) throws ErrnoException {
        try {
            int iCreateTempNativeFileDescriptor = createTempNativeFileDescriptor();
            Os.dup2(fileDescriptor, iCreateTempNativeFileDescriptor);
            return iCreateTempNativeFileDescriptor;
        } finally {
            if (z) {
                Os.close(fileDescriptor);
            }
        }
    }

    public static native boolean isOpaque(long j2);

    public static long n(FileDescriptor fileDescriptor, long j2, boolean z) throws GifIOException {
        int iH;
        if (Build.VERSION.SDK_INT > 27) {
            try {
                iH = h(fileDescriptor, z);
            } catch (Exception e2) {
                throw new GifIOException(c.OPEN_FAILED.errorCode, e2.getMessage());
            }
        } else {
            iH = extractNativeFileDescriptor(fileDescriptor, z);
        }
        return openNativeFileDescriptor(iH, j2);
    }

    public static native long openNativeFileDescriptor(int i2, long j2);

    public static native long renderFrame(long j2, Bitmap bitmap);

    public static native boolean reset(long j2);

    public static native long restoreRemainder(long j2);

    public static native int restoreSavedState(long j2, long[] jArr, Bitmap bitmap);

    public static native void saveRemainder(long j2);

    public static native void seekToTime(long j2, int i2, Bitmap bitmap);

    public static native void setLoopCount(long j2, char c2);

    public synchronized int a() {
        return getCurrentFrameIndex(this.f31377a);
    }

    public synchronized int b() {
        return getCurrentLoop(this.f31377a);
    }

    public synchronized int c() {
        return getCurrentPosition(this.f31377a);
    }

    public synchronized int d() {
        return getDuration(this.f31377a);
    }

    public synchronized int e() {
        return getHeight(this.f31377a);
    }

    public synchronized int f() {
        return getLoopCount(this.f31377a);
    }

    public void finalize() throws Throwable {
        try {
            o();
        } finally {
            super.finalize();
        }
    }

    public synchronized int g() {
        return getNativeErrorCode(this.f31377a);
    }

    public synchronized int i() {
        return getNumberOfFrames(this.f31377a);
    }

    public synchronized long[] j() {
        return getSavedState(this.f31377a);
    }

    public synchronized int k() {
        return getWidth(this.f31377a);
    }

    public synchronized boolean l() {
        return isOpaque(this.f31377a);
    }

    public synchronized boolean m() {
        return this.f31377a == 0;
    }

    public synchronized void o() {
        free(this.f31377a);
        this.f31377a = 0L;
    }

    public synchronized long p(Bitmap bitmap) {
        return renderFrame(this.f31377a, bitmap);
    }

    public synchronized boolean q() {
        return reset(this.f31377a);
    }

    public synchronized long r() {
        return restoreRemainder(this.f31377a);
    }

    public synchronized int s(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f31377a, jArr, bitmap);
    }

    public synchronized void t() {
        saveRemainder(this.f31377a);
    }

    public synchronized void u(int i2, Bitmap bitmap) {
        seekToTime(this.f31377a, i2, bitmap);
    }

    public void v(int i2) {
        if (i2 < 0 || i2 > 65535) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized (this) {
            setLoopCount(this.f31377a, (char) i2);
        }
    }
}
