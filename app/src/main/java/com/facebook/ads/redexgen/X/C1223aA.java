package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1223aA implements InterfaceC0751Hu {
    public static String[] A0C;
    public long A00;
    public long A02;
    public C0744Hl A03;
    public final Uri A05;
    public final F7 A07;
    public final InterfaceC0740Hh A08;
    public final IS A09;
    public volatile boolean A0A;
    public final /* synthetic */ BQ A0B;
    public final CM A06 = new CM();
    public boolean A04 = true;
    public long A01 = -1;

    static {
        A04();
    }

    public static void A04() {
        A0C = new String[]{"nBGgOhUJr5w54zk2FcSY", "YYZuUd", "gwBohD1o6c6DfEcFdJm47xfjaEoVukk3", "3TNnSL", "hJWvKqQqk09hkKqv49F3L8Ilz7Jhye22", "G8FOHrMAxxSNQBngbaVWxtAhYQnldn5N", "v6FRbmkBAKb4FwdIpHjrHHJWg4k1tULi", "7hirQzfzNIRD79h7knAyc8"};
    }

    public C1223aA(BQ bq, Uri uri, InterfaceC0740Hh interfaceC0740Hh, F7 f7, IS is) {
        this.A0B = bq;
        this.A05 = (Uri) IM.A01(uri);
        this.A08 = (InterfaceC0740Hh) IM.A01(interfaceC0740Hh);
        this.A07 = (F7) IM.A01(f7);
        this.A09 = is;
    }

    public final void A05(long j2, long j3) {
        this.A06.A00 = j2;
        this.A02 = j3;
        this.A04 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0751Hu
    public final void A3y() {
        this.A0A = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0751Hu
    public final void A7u() throws InterruptedException, IOException {
        int iAC0 = 0;
        while (iAC0 == 0) {
            boolean z = this.A0A;
            if (A0C[0].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "6lKOSY";
            strArr[1] = "aO7eUD";
            if (!z) {
                CG cg = null;
                try {
                    long jA6p = this.A06.A00;
                    this.A03 = new C0744Hl(this.A05, jA6p, -1L, this.A0B.A0b);
                    this.A01 = this.A08.ABR(this.A03);
                    if (this.A01 != -1) {
                        this.A01 += jA6p;
                    }
                    YY yy = new YY(this.A08, jA6p, this.A01);
                    CF cfA03 = this.A07.A03(yy, this.A08.A7H());
                    if (this.A04) {
                        cfA03.ACm(jA6p, this.A02);
                        this.A04 = false;
                    }
                    while (iAC0 == 0 && !this.A0A) {
                        this.A09.A01();
                        iAC0 = cfA03.AC0(yy, this.A06);
                        if (yy.A6p() > this.A0B.A0P + jA6p) {
                            jA6p = yy.A6p();
                            this.A09.A02();
                            this.A0B.A0R.post(this.A0B.A0a);
                        }
                    }
                    if (iAC0 == 1) {
                        iAC0 = 0;
                    } else {
                        this.A06.A00 = yy.A6p();
                        this.A00 = this.A06.A00 - this.A03.A01;
                    }
                    J1.A0a(this.A08);
                } catch (Throwable th) {
                    if (iAC0 != 1 && 0 != 0) {
                        this.A06.A00 = cg.A6p();
                        this.A00 = this.A06.A00 - this.A03.A01;
                    }
                    J1.A0a(this.A08);
                    throw th;
                }
            } else {
                return;
            }
        }
    }
}
