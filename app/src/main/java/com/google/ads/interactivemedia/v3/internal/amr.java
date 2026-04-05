package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.model.InstructionFileId;

/* JADX INFO: loaded from: classes.dex */
public final class amr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20160a;

    private amr(String str) {
        this.f20160a = str;
    }

    public static amr a(alx alxVar) {
        String str;
        alxVar.J(2);
        int iK = alxVar.k();
        int i2 = iK >> 1;
        int iK2 = (alxVar.k() >> 3) | ((iK & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7) {
            str = "dvhe";
        } else if (i2 == 8) {
            str = "hev1";
        } else {
            if (i2 != 9) {
                return null;
            }
            str = "avc3";
        }
        String str2 = iK2 < 10 ? ".0" : InstructionFileId.DOT;
        StringBuilder sb = new StringBuilder(str.length() + 24 + str2.length());
        sb.append(str);
        sb.append(".0");
        sb.append(i2);
        sb.append(str2);
        sb.append(iK2);
        return new amr(sb.toString());
    }
}
