package com.google.ads.interactivemedia.v3.internal;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class bkb extends bka {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f21260a;

    public bkb(byte[] bArr) {
        bArr.getClass();
        this.f21260a = bArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkd
    public byte a(int i2) {
        return this.f21260a[i2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkd
    public byte b(int i2) {
        return this.f21260a[i2];
    }

    public int c() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkd
    public int d() {
        return this.f21260a.length;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkd
    public void e(byte[] bArr, int i2) {
        System.arraycopy(this.f21260a, 0, bArr, 0, i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkd
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bkd) || d() != ((bkd) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof bkb)) {
            return obj.equals(this);
        }
        bkb bkbVar = (bkb) obj;
        int iM = m();
        int iM2 = bkbVar.m();
        if (iM != 0 && iM2 != 0 && iM != iM2) {
            return false;
        }
        int iD = d();
        if (iD > bkbVar.d()) {
            int iD2 = d();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(iD);
            sb.append(iD2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (iD > bkbVar.d()) {
            int iD3 = bkbVar.d();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(0);
            sb2.append(", ");
            sb2.append(iD);
            sb2.append(", ");
            sb2.append(iD3);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.f21260a;
        byte[] bArr2 = bkbVar.f21260a;
        bkbVar.c();
        int i2 = 0;
        int i3 = 0;
        while (i2 < iD) {
            if (bArr[i2] != bArr2[i3]) {
                return false;
            }
            i2++;
            i3++;
        }
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkd
    public final bke f() {
        return bke.c(this.f21260a, 0, d(), true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkd
    public final String g(Charset charset) {
        return new String(this.f21260a, 0, d(), charset);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkd
    public final boolean h() {
        return bnm.f(this.f21260a, 0, d());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkd
    public final int i(int i2, int i3) {
        return bld.d(i2, this.f21260a, 0, i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkd
    public final bkd j(int i2) {
        int iL = bkd.l(0, i2, d());
        return iL == 0 ? bkd.f21262b : new bjx(this.f21260a, 0, iL);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkd
    public final void k(avq avqVar) throws bkh {
        ((bki) avqVar).V(this.f21260a, 0, d());
    }
}
