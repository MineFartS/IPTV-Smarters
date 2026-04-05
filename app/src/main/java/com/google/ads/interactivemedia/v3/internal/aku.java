package com.google.ads.interactivemedia.v3.internal;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class aku {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20014a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f20015b = {0, 0, 0, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f20016c = {BuildConfig.FLAVOR, "A", "B", "C"};

    public static String a(int i2, int i3, int i4) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static String b(aly alyVar) {
        alyVar.f(24);
        int iA = alyVar.a(2);
        boolean zI = alyVar.i();
        int iA2 = alyVar.a(5);
        int i2 = 0;
        for (int i3 = 0; i3 < 32; i3++) {
            if (alyVar.i()) {
                i2 |= 1 << i3;
            }
        }
        int i4 = 6;
        int[] iArr = new int[6];
        for (int i5 = 0; i5 < 6; i5++) {
            iArr[i5] = alyVar.a(8);
        }
        int iA3 = alyVar.a(8);
        Object[] objArr = new Object[5];
        objArr[0] = f20016c[iA];
        objArr[1] = Integer.valueOf(iA2);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Character.valueOf(true != zI ? 'L' : 'H');
        objArr[4] = Integer.valueOf(iA3);
        StringBuilder sb = new StringBuilder(amn.B("hvc1.%s%d.%X.%c%d", objArr));
        while (i4 > 0) {
            int i6 = i4 - 1;
            if (iArr[i6] != 0) {
                break;
            }
            i4 = i6;
        }
        for (int i7 = 0; i7 < i4; i7++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i7])));
        }
        return sb.toString();
    }

    public static byte[] c(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3 + 4];
        System.arraycopy(f20015b, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i2, bArr2, 4, i3);
        return bArr2;
    }
}
