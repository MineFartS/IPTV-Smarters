package com.google.android.exoplayer2.ext.vp9;

import c.f.a.b.i1;
import c.f.a.b.j3.x;
import c.f.a.b.j3.x0;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;

/* JADX INFO: loaded from: classes2.dex */
public final class VpxLibrary {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f23913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class<? extends ExoMediaCrypto> f23914b;

    static {
        i1.a("goog.exo.vpx");
        f23913a = new x("vpx", "vpxV2JNI");
    }

    public static String a() {
        if (b()) {
            return vpxGetVersion();
        }
        return null;
    }

    public static boolean b() {
        return f23913a.a();
    }

    public static boolean c(Class<? extends ExoMediaCrypto> cls) {
        return x0.b(f23914b, cls);
    }

    public static native String vpxGetVersion();

    public static native boolean vpxIsSecureDecodeSupported();
}
