package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1159Xu implements InterfaceC0759Ic {
    public static byte[] A04;

    @Nullable
    public Y0 A00;

    @Nullable
    public InterfaceC0759Ic A01;
    public final InterfaceC05669w A02;
    public final C1323bm A03;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{95, 103, 126, 102, 123, 98, 126, 119, 50, 96, 119, 124, 118, 119, 96, 119, 96, 50, 127, 119, 118, 123, 115, 50, 113, 126, 125, 113, 121, 97, 50, 119, 124, 115, 112, 126, 119, 118, 60};
    }

    public C1159Xu(InterfaceC05669w interfaceC05669w, IP ip) {
        this.A02 = interfaceC05669w;
        this.A03 = new C1323bm(ip);
    }

    private void A01() {
        this.A03.A03(this.A01.A6r());
        AK playbackParameters = this.A01.A6o();
        if (!playbackParameters.equals(this.A03.A6o())) {
            this.A03.AD6(playbackParameters);
            this.A02.AAV(playbackParameters);
        }
    }

    private boolean A03() {
        Y0 y0 = this.A00;
        return (y0 == null || y0.A7e() || (!this.A00.A7m() && this.A00.A7P())) ? false : true;
    }

    public final long A04() {
        if (A03()) {
            A01();
            return this.A01.A6r();
        }
        return this.A03.A6r();
    }

    public final void A05() {
        this.A03.A01();
    }

    public final void A06() {
        this.A03.A02();
    }

    public final void A07(long j2) {
        this.A03.A03(j2);
    }

    public final void A08(Y0 y0) {
        if (y0 == this.A00) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A09(Y0 y0) throws C05699z {
        InterfaceC0759Ic interfaceC0759Ic;
        InterfaceC0759Ic interfaceC0759IcA6Y = y0.A6Y();
        if (interfaceC0759IcA6Y != null && interfaceC0759IcA6Y != (interfaceC0759Ic = this.A01)) {
            if (interfaceC0759Ic == null) {
                this.A01 = interfaceC0759IcA6Y;
                this.A00 = y0;
                this.A01.AD6(this.A03.A6o());
                A01();
                return;
            }
            throw C05699z.A02(new IllegalStateException(A00(0, 39, 41)));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0759Ic
    public final AK A6o() {
        InterfaceC0759Ic interfaceC0759Ic = this.A01;
        if (interfaceC0759Ic != null) {
            return interfaceC0759Ic.A6o();
        }
        return this.A03.A6o();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0759Ic
    public final long A6r() {
        if (A03()) {
            return this.A01.A6r();
        }
        return this.A03.A6r();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0759Ic
    public final AK AD6(AK ak) {
        InterfaceC0759Ic interfaceC0759Ic = this.A01;
        if (interfaceC0759Ic != null) {
            ak = interfaceC0759Ic.AD6(ak);
        }
        this.A03.AD6(ak);
        this.A02.AAV(ak);
        return ak;
    }
}
