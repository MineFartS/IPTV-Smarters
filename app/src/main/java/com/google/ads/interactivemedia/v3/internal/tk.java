package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tk {
    public byte[] M;
    public tl S;
    public boolean T;
    public sf V;
    public int W;
    private int X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f23068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public se f23069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f23070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public qg f23071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23072l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f23073m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23074n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23075o = -1;
    public int p = 0;
    public int q = -1;
    public float r = 0.0f;
    public float s = 0.0f;
    public float t = 0.0f;
    public byte[] u = null;
    public int v = -1;
    public boolean w = false;
    public int x = -1;
    public int y = -1;
    public int z = -1;
    public int A = 1000;
    public int B = 200;
    public float C = -1.0f;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public int N = 1;
    public int O = -1;
    public int P = 8000;
    public long Q = 0;
    public long R = 0;
    public boolean U = true;
    private String Y = "eng";

    private tk() {
    }

    public /* synthetic */ tk(byte[] bArr) {
    }

    public static /* synthetic */ void b(tk tkVar) {
        ajr.b(tkVar.V);
    }

    private static Pair<String, List<byte[]>> f(alx alxVar) throws lb {
        try {
            alxVar.J(16);
            long jQ = alxVar.q();
            if (jQ == 1482049860) {
                return new Pair<>("video/divx", null);
            }
            if (jQ == 859189832) {
                return new Pair<>("video/3gpp", null);
            }
            if (jQ != 826496599) {
                Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", null);
            }
            int iC = alxVar.c() + 20;
            byte[] bArrK = alxVar.K();
            while (true) {
                int length = bArrK.length;
                if (iC >= length - 4) {
                    throw new lb("Failed to find FourCC VC1 initialization data");
                }
                if (bArrK[iC] == 0 && bArrK[iC + 1] == 0 && bArrK[iC + 2] == 1 && bArrK[iC + 3] == 15) {
                    return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrK, iC, length)));
                }
                iC++;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new lb("Error parsing FourCC private data");
        }
    }

    private static List<byte[]> g(byte[] bArr) throws lb {
        int i2;
        int i3;
        try {
            if (bArr[0] != 2) {
                throw new lb("Error parsing vorbis codec private");
            }
            int i4 = 1;
            int i5 = 0;
            while (true) {
                i2 = bArr[i4] & 255;
                if (i2 != 255) {
                    break;
                }
                i5 += 255;
                i4++;
            }
            int i6 = i4 + 1;
            int i7 = i5 + i2;
            int i8 = 0;
            while (true) {
                i3 = bArr[i6] & 255;
                if (i3 != 255) {
                    break;
                }
                i8 += 255;
                i6++;
            }
            int i9 = i6 + 1;
            int i10 = i8 + i3;
            if (bArr[i9] != 1) {
                throw new lb("Error parsing vorbis codec private");
            }
            byte[] bArr2 = new byte[i7];
            System.arraycopy(bArr, i9, bArr2, 0, i7);
            int i11 = i9 + i7;
            if (bArr[i11] != 3) {
                throw new lb("Error parsing vorbis codec private");
            }
            int i12 = i11 + i10;
            if (bArr[i12] != 5) {
                throw new lb("Error parsing vorbis codec private");
            }
            int length = bArr.length - i12;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i12, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new lb("Error parsing vorbis codec private");
        }
    }

    private static boolean h(alx alxVar) throws lb {
        try {
            int i2 = alxVar.i();
            if (i2 == 1) {
                return true;
            }
            if (i2 == 65534) {
                alxVar.I(24);
                if (alxVar.r() == tm.f23087e.getMostSignificantBits()) {
                    if (alxVar.r() == tm.f23087e.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new lb("Error parsing MS/ACM codec private");
        }
    }

    private final byte[] i(String str) throws lb {
        byte[] bArr = this.f23070j;
        if (bArr != null) {
            return bArr;
        }
        String strValueOf = String.valueOf(str);
        throw new lb(strValueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(strValueOf) : new String("Missing CodecPrivate for codec "));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0576  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.ads.interactivemedia.v3.internal.rm r21, int r22) throws com.google.ads.interactivemedia.v3.internal.lb {
        /*
            Method dump skipped, instruction units count: 1662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.tk.c(com.google.ads.interactivemedia.v3.internal.rm, int):void");
    }
}
