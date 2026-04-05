package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class amo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f20149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f20153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f20154f;

    private amo(List<byte[]> list, int i2, int i3, int i4, float f2, String str) {
        this.f20149a = list;
        this.f20150b = i2;
        this.f20151c = i3;
        this.f20152d = i4;
        this.f20153e = f2;
        this.f20154f = str;
    }

    public static amo a(alx alxVar) throws lb {
        String strA;
        int i2;
        int i3;
        float f2;
        try {
            alxVar.J(4);
            int iK = (alxVar.k() & 3) + 1;
            if (iK == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iK2 = alxVar.k() & 31;
            for (int i4 = 0; i4 < iK2; i4++) {
                arrayList.add(b(alxVar));
            }
            int iK3 = alxVar.k();
            for (int i5 = 0; i5 < iK3; i5++) {
                arrayList.add(b(alxVar));
            }
            if (iK2 > 0) {
                alq alqVarC = alr.c((byte[]) arrayList.get(0), iK, ((byte[]) arrayList.get(0)).length);
                int i6 = alqVarC.f20060e;
                int i7 = alqVarC.f20061f;
                float f3 = alqVarC.f20062g;
                strA = aku.a(alqVarC.f20056a, alqVarC.f20057b, alqVarC.f20058c);
                i2 = i6;
                i3 = i7;
                f2 = f3;
            } else {
                strA = null;
                i2 = -1;
                i3 = -1;
                f2 = 1.0f;
            }
            return new amo(arrayList, iK, i2, i3, f2, strA);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new lb("Error parsing AVC config", e2);
        }
    }

    private static byte[] b(alx alxVar) {
        int iO = alxVar.o();
        int iC = alxVar.c();
        alxVar.J(iO);
        return aku.c(alxVar.K(), iC, iO);
    }
}
