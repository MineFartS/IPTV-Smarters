package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class D0 implements Y0, AX {
    public int A00;
    public int A01;
    public long A02;
    public AY A03;
    public FY A04;
    public boolean A05 = true;
    public boolean A06;
    public Format[] A07;
    public final int A08;

    public D0(int i2) {
        this.A08 = i2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bz != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<?> */
    public static boolean A0z(@Nullable InterfaceC0612Bz<?> interfaceC0612Bz, @Nullable DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (interfaceC0612Bz == null) {
            return false;
        }
        return interfaceC0612Bz.A3x(drmInitData);
    }

    public final int A10() {
        return this.A00;
    }

    public final int A11(long j2) {
        return this.A04.ADI(j2 - this.A02);
    }

    public final int A12(AC ac, YH yh, boolean z) {
        int iAC3 = this.A04.AC3(ac, yh, z);
        if (iAC3 == -4) {
            if (yh.A04()) {
                this.A05 = true;
                return this.A06 ? -4 : -3;
            }
            yh.A00 += this.A02;
        } else if (iAC3 == -5) {
            Format format = ac.A00;
            if (format.A0G != Long.MAX_VALUE) {
                ac.A00 = format.A0M(format.A0G + this.A02);
            }
        }
        return iAC3;
    }

    public final AY A13() {
        return this.A03;
    }

    public void A14() {
    }

    public void A15() throws C05699z {
    }

    public void A16() throws C05699z {
    }

    public void A17(long j2, boolean z) throws C05699z {
    }

    public void A18(boolean z) throws C05699z {
    }

    public void A19(Format[] formatArr, long j2) throws C05699z {
    }

    public final boolean A1A() {
        return this.A05 ? this.A06 : this.A04.A7m();
    }

    public final Format[] A1B() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final void A4l() {
        IM.A04(this.A01 == 1);
        this.A01 = 0;
        this.A04 = null;
        this.A07 = null;
        this.A06 = false;
        A14();
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final void A4u(AY ay, Format[] formatArr, FY fy, long j2, boolean z, long j3) throws C05699z {
        IM.A04(this.A01 == 0);
        this.A03 = ay;
        this.A01 = 1;
        A18(z);
        ACV(formatArr, fy, j3);
        A17(j2, z);
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final AX A5e() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public InterfaceC0759Ic A6Y() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final int A75() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final FY A7A() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.Y0, com.facebook.ads.redexgen.X.AX
    public final int A7F() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.AU
    public void A7M(int i2, Object obj) throws C05699z {
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final boolean A7P() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final boolean A7b() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final void A8b() throws IOException {
        this.A04.A8Y();
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final void ACV(Format[] formatArr, FY fy, long j2) throws C05699z {
        IM.A04(!this.A06);
        this.A04 = fy;
        this.A05 = false;
        this.A07 = formatArr;
        this.A02 = j2;
        A19(formatArr, j2);
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final void ACe(long j2) throws C05699z {
        this.A06 = false;
        this.A05 = false;
        A17(j2, false);
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final void ACy() {
        this.A06 = true;
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final void AD0(int i2) {
        this.A00 = i2;
    }

    public int ADX() throws C05699z {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final void start() throws C05699z {
        IM.A04(this.A01 == 1);
        this.A01 = 2;
        A15();
    }

    @Override // com.facebook.ads.redexgen.X.Y0
    public final void stop() throws C05699z {
        IM.A04(this.A01 == 2);
        this.A01 = 1;
        A16();
    }
}
