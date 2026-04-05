package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class amw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f20184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20186c;

    private amw(List<byte[]> list, int i2, String str) {
        this.f20184a = list;
        this.f20185b = i2;
        this.f20186c = str;
    }

    public static amw a(alx alxVar) throws lb {
        try {
            alxVar.J(21);
            int iK = alxVar.k() & 3;
            int iK2 = alxVar.k();
            int iC = alxVar.c();
            int i2 = 0;
            for (int i3 = 0; i3 < iK2; i3++) {
                alxVar.J(1);
                int iO = alxVar.o();
                for (int i4 = 0; i4 < iO; i4++) {
                    int iO2 = alxVar.o();
                    i2 += iO2 + 4;
                    alxVar.J(iO2);
                }
            }
            alxVar.I(iC);
            byte[] bArr = new byte[i2];
            String strB = null;
            int i5 = 0;
            for (int i6 = 0; i6 < iK2; i6++) {
                int iK3 = alxVar.k() & 127;
                int iO3 = alxVar.o();
                int i7 = 0;
                while (i7 < iO3) {
                    int iO4 = alxVar.o();
                    System.arraycopy(alr.f20069a, 0, bArr, i5, 4);
                    int i8 = i5 + 4;
                    System.arraycopy(alxVar.K(), alxVar.c(), bArr, i8, iO4);
                    if (iK3 == 33 && i7 == 0) {
                        strB = aku.b(new aly(bArr, i8, i8 + iO4));
                        i7 = 0;
                    }
                    i5 = i8 + iO4;
                    alxVar.J(iO4);
                    i7++;
                }
            }
            return new amw(i2 == 0 ? null : Collections.singletonList(bArr), iK + 1, strB);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new lb("Error parsing HEVC config", e2);
        }
    }
}
