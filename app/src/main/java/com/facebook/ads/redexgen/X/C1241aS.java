package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.Format;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1241aS implements CH {
    public static String[] A08;
    public CO A00;
    public G0 A01;
    public boolean A02;
    public Format[] A03;
    public final CF A04;
    public final int A05;
    public final SparseArray<C1240aR> A06 = new SparseArray<>();
    public final Format A07;

    static {
        A00();
    }

    public static void A00() {
        A08 = new String[]{"9AgGxbF2PnXMW850J79baLuRNSn", "0RW4iFiTcND7V7aOImrXD0wRPeoZ1zLG", "1xHckKpPUOToshADzl4JLY1c7M7", "meFW53GZPeeKUJ1o53ZEJ9BrhLTR1vp6", "ZODM75AIvfjX9mXtO2EcsYUlL2ZjkRs1", "EkRuVLWI2MkZHiIEOJmpUJfRXNZZ35jr", "79zDbwv3HJZgMiWNIsRhm8isSNpdNh2J", "UgKs6UjNXVBuUp3SkOyu8jDi8UPRq7Ac"};
    }

    public C1241aS(CF cf, int i2, Format format) {
        this.A04 = cf;
        this.A05 = i2;
        this.A07 = format;
    }

    public final CO A01() {
        return this.A00;
    }

    public final void A02(G0 g0, long j2) {
        this.A01 = g0;
        if (!this.A02) {
            this.A04.A7V(this);
            if (j2 != -9223372036854775807L) {
                this.A04.ACm(0L, j2);
            }
            String[] strArr = A08;
            if (strArr[0].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[5] = "ANdg3I4IQyBwkyTt5qvPCa1rPpcvpPK0";
            strArr2[4] = "1psBRBIIRvsQ1xYnSkb96sSnYYaJXCQp";
            this.A02 = true;
            return;
        }
        CF cf = this.A04;
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        cf.ACm(0L, j2);
        int i2 = 0;
        while (i2 < this.A06.size()) {
            C1240aR c1240aRValueAt = this.A06.valueAt(i2);
            String[] strArr3 = A08;
            if (strArr3[0].length() != strArr3[2].length()) {
                c1240aRValueAt.A01(g0);
                i2++;
            } else {
                String[] strArr4 = A08;
                strArr4[1] = "APNVIU1DnAPNkwqFC4aa2Drc31cD0sK2";
                strArr4[3] = "MuGSCySU5PPJZKFnemfI9lIl8v62rhiH";
                c1240aRValueAt.A01(g0);
                i2++;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    @Override // com.facebook.ads.redexgen.X.CH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A4x() {
        /*
            r3 = this;
            android.util.SparseArray<com.facebook.ads.redexgen.X.aR> r0 = r3.A06
            int r0 = r0.size()
            com.facebook.ads.internal.exoplayer2.Format[] r2 = new com.facebook.ads.internal.exoplayer2.Format[r0]
            r1 = 0
        L9:
            android.util.SparseArray<com.facebook.ads.redexgen.X.aR> r0 = r3.A06
            int r0 = r0.size()
            if (r1 >= r0) goto L20
            android.util.SparseArray<com.facebook.ads.redexgen.X.aR> r0 = r3.A06
            java.lang.Object r0 = r0.valueAt(r1)
            com.facebook.ads.redexgen.X.aR r0 = (com.facebook.ads.redexgen.X.C1240aR) r0
            com.facebook.ads.internal.exoplayer2.Format r0 = r0.A00
            r2[r1] = r0
            int r1 = r1 + 1
            goto L9
        L20:
            r3.A03 = r2
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1241aS.A08
            r0 = 7
            r1 = r1[r0]
            r0 = 24
            char r1 = r1.charAt(r0)
            r0 = 56
            if (r1 == r0) goto L37
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L37:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1241aS.A08
            java.lang.String r1 = "Ub91FLJNb6dHpMChEvauohuKUbq"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "krMdxtzKPTj1GbHQ4qd1779uIO4"
            r0 = 2
            r2[r0] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1241aS.A4x():void");
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final void ACn(CO co) {
        this.A00 = co;
    }

    @Override // com.facebook.ads.redexgen.X.CH
    public final CR ADb(int i2, int i3) {
        C1240aR c1240aR = this.A06.get(i2);
        if (c1240aR == null) {
            IM.A04(this.A03 == null);
            c1240aR = new C1240aR(i2, i3, i3 == this.A05 ? this.A07 : null);
            c1240aR.A01(this.A01);
            this.A06.put(i2, c1240aR);
        }
        return c1240aR;
    }
}
