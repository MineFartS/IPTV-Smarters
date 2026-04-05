package de.blinkt.openvpn.core;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public class NativeUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f30307a = {16, 64, 256, 1024, 8192, 16384};

    static {
        if (b()) {
            return;
        }
        System.loadLibrary("ovpnutil");
        if (Build.VERSION.SDK_INT == 16) {
            System.loadLibrary("jbcrypto");
        }
        System.loadLibrary("osslspeedtest");
    }

    public static String a() {
        return b() ? "ROBO" : getJNIAPI();
    }

    public static boolean b() {
        return "robolectric".equals(Build.FINGERPRINT);
    }

    public static native String[] getIfconfig();

    public static native String getJNIAPI();

    public static native void jniclose(int i2);

    public static native byte[] rsasign(byte[] bArr, int i2, boolean z);
}
