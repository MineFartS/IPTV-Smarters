package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1240aR implements CR {
    public static String[] A05;
    public Format A00;
    public CR A01;
    public final int A02;
    public final int A03;
    public final Format A04;

    static {
        A00();
    }

    public static void A00() {
        A05 = new String[]{"fiy", "F0U9PakMRwCfzGJgihvncpZxCDQ90vXF", "gjso", "yF7UWL", "V0EB98jgLlNveRwuPHEwcLB4Y2MBSLBH", "J8iBwEklEhXrFuUPyx99GyZ8oCIjfyK5", "LOq6sssInC8yBcYmfVp8yo4eapP", "4"};
    }

    public C1240aR(int i2, int i3, Format format) {
        this.A02 = i2;
        this.A03 = i3;
        this.A04 = format;
    }

    public final void A01(G0 g0) {
        if (g0 == null) {
            this.A01 = new C1165Ya();
            return;
        }
        int i2 = this.A02;
        int i3 = this.A03;
        String[] strArr = A05;
        if (strArr[1].charAt(16) == strArr[4].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[3] = "P3fFfO";
        strArr2[3] = "P3fFfO";
        this.A01 = g0.track(i2, i3);
        Format format = this.A00;
        if (format != null) {
            CR cr = this.A01;
            String[] strArr3 = A05;
            if (strArr3[6].length() != strArr3[7].length()) {
                String[] strArr4 = A05;
                strArr4[5] = "UHhVF2ffYkoRFQPCPmyzbiAbTFVrbRpn";
                strArr4[5] = "UHhVF2ffYkoRFQPCPmyzbiAbTFVrbRpn";
                cr.A5B(format);
                return;
            }
            cr.A5B(format);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final void A5B(Format format) {
        Format format2 = this.A04;
        if (format2 != null) {
            format = format.A0N(format2);
        }
        this.A00 = format;
        this.A01.A5B(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final int ACg(CG cg, int i2, boolean z) throws InterruptedException, IOException {
        return this.A01.ACg(cg, i2, z);
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final void ACh(C0768Il c0768Il, int i2) {
        this.A01.ACh(c0768Il, i2);
    }

    @Override // com.facebook.ads.redexgen.X.CR
    public final void ACi(long j2, int i2, int i3, int i4, CQ cq) {
        this.A01.ACi(j2, i2, i3, i4, cq);
    }
}
