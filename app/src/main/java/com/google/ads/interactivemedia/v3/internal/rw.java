package com.google.ads.interactivemedia.v3.internal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class rw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f22921c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22922a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22923b = -1;

    private final boolean c(String str) {
        Matcher matcher = f22921c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i2 = amn.f20135a;
            int i3 = Integer.parseInt(strGroup, 16);
            int i4 = Integer.parseInt(matcher.group(2), 16);
            if (i3 <= 0 && i4 <= 0) {
                return false;
            }
            this.f22922a = i3;
            this.f22923b = i4;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean a() {
        return (this.f22922a == -1 || this.f22923b == -1) ? false : true;
    }

    public final void b(ys ysVar) {
        for (int i2 = 0; i2 < ysVar.a(); i2++) {
            yr yrVarB = ysVar.b(i2);
            if (yrVarB instanceof zi) {
                zi ziVar = (zi) yrVarB;
                if ("iTunSMPB".equals(ziVar.f23858b) && c(ziVar.f23859c)) {
                    return;
                }
            } else if (yrVarB instanceof zp) {
                zp zpVar = (zp) yrVarB;
                if ("com.apple.iTunes".equals(zpVar.f23871a) && "iTunSMPB".equals(zpVar.f23872b) && c(zpVar.f23873c)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }
}
