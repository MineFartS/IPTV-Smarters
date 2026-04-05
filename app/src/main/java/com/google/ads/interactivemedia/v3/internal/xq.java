package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class xq {
    public static xo a(rk rkVar) {
        xp xpVarA;
        byte[] bArr;
        ajr.b(rkVar);
        alx alxVar = new alx(16);
        if (xp.a(rkVar, alxVar).f23741a != 1380533830) {
            return null;
        }
        rkVar.g(alxVar.K(), 0, 4);
        alxVar.I(0);
        int iE = alxVar.e();
        if (iE != 1463899717) {
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unsupported RIFF format: ");
            sb.append(iE);
            Log.e("WavHeaderReader", sb.toString());
            return null;
        }
        while (true) {
            xpVarA = xp.a(rkVar, alxVar);
            if (xpVarA.f23741a == 1718449184) {
                break;
            }
            rkVar.f((int) xpVarA.f23742b);
        }
        ajr.f(xpVarA.f23742b >= 16);
        rkVar.g(alxVar.K(), 0, 16);
        alxVar.I(0);
        int i2 = alxVar.i();
        int i3 = alxVar.i();
        int iH = alxVar.h();
        alxVar.h();
        int i4 = alxVar.i();
        int i5 = alxVar.i();
        int i6 = ((int) xpVarA.f23742b) - 16;
        if (i6 > 0) {
            byte[] bArr2 = new byte[i6];
            rkVar.g(bArr2, 0, i6);
            bArr = bArr2;
        } else {
            bArr = amn.f20140f;
        }
        return new xo(i2, i3, iH, i4, i5, bArr);
    }
}
