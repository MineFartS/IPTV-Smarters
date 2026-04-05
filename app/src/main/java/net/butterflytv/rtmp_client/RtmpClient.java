package net.butterflytv.rtmp_client;

import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class RtmpClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f31233a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31234b = Constants.MAXIMUM_UPLOAD_PARTS;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31235c = Constants.MAXIMUM_UPLOAD_PARTS;

    public static class a extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f31236b;

        public a(int i2) {
            super("RTMP error: " + i2);
            this.f31236b = i2;
        }
    }

    static {
        System.loadLibrary("rtmp-jni");
    }

    public void a() {
        nativeClose(this.f31233a);
        this.f31233a = 0L;
    }

    public void b(String str, boolean z) throws a {
        long jNativeAlloc = nativeAlloc();
        this.f31233a = jNativeAlloc;
        if (jNativeAlloc == 0) {
            throw new a(-2);
        }
        int iNativeOpen = nativeOpen(str, z, jNativeAlloc, this.f31234b, this.f31235c);
        if (iNativeOpen == 0) {
            return;
        }
        this.f31233a = 0L;
        throw new a(iNativeOpen);
    }

    public int c(byte[] bArr, int i2, int i3) throws a {
        int iNativeRead = nativeRead(bArr, i2, i3, this.f31233a);
        if (iNativeRead >= 0 || iNativeRead == -1) {
            return iNativeRead;
        }
        throw new a(iNativeRead);
    }

    public final native long nativeAlloc();

    public final native void nativeClose(long j2);

    public final native int nativeOpen(String str, boolean z, long j2, int i2, int i3);

    public final native int nativeRead(byte[] bArr, int i2, int i3, long j2);
}
