package com.google.android.exoplayer2.ext.opus;

import c.f.a.b.i1;
import c.f.a.b.j3.x;
import c.f.a.b.j3.x0;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;

/* JADX INFO: loaded from: classes2.dex */
public final class OpusLibrary {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f23909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class<? extends ExoMediaCrypto> f23910b;

    static {
        i1.a("goog.exo.opus");
        f23909a = new x("opusV2JNI");
    }

    public static String a() {
        if (b()) {
            return opusGetVersion();
        }
        return null;
    }

    public static boolean b() {
        return f23909a.a();
    }

    public static boolean c(Class<? extends ExoMediaCrypto> cls) {
        return x0.b(f23910b, cls);
    }

    public static native String opusGetVersion();

    public static native boolean opusIsSecureDecodeSupported();
}
