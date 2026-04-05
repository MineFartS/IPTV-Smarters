package c.f.a.b.z2.j0;

import c.f.a.b.j3.z;
import c.f.a.b.z2.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0.a f11008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f11010e;

    public p(boolean z, String str, int i2, byte[] bArr, int i3, int i4, byte[] bArr2) {
        c.f.a.b.j3.g.a((bArr2 == null) ^ (i2 == 0));
        this.f11006a = z;
        this.f11007b = str;
        this.f11009d = i2;
        this.f11010e = bArr2;
        this.f11008c = new a0.a(a(str), bArr, i3, i4);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int a(String str) {
        if (str == null) {
            return 1;
        }
        byte b2 = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    b2 = 0;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    b2 = 1;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    b2 = 2;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    b2 = 3;
                }
                break;
        }
        switch (b2) {
            case 0:
            case 1:
                return 2;
            default:
                z.i("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
