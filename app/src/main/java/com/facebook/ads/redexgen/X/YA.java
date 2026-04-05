package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YA implements InterfaceC0593Ay {
    public static String[] A06;
    public static final int A07;
    public boolean A05;
    public int A01 = -1;
    public int A00 = -1;
    public int A02 = 0;
    public ByteBuffer A03 = InterfaceC0593Ay.A00;
    public ByteBuffer A04 = InterfaceC0593Ay.A00;

    public static void A00() {
        A06 = new String[]{"grqzXl31Ib3CwgbOGLAhXGiUSybb3G6k", "HqCRL2sDmMVhvd9OffyzWNuXpbgyFlqg", "IpTiYMxyYV6xHW6l8ixVEePHdVdY3VZ5", "ZRTEafxouxRK9cmvY3V1KAxZT1cXIFF2", "yUYM5z5ItqNmKdZaBdfrwPcFTl5oQFEz", "Jf72zunVfpVe04eAXULupQi0ZX1Zqvmv", "BX9HD2aywQJTDQtUbY1GrFeREy6of4gh", "vYXD58apfp8PH7rmktr19THixNAKPTAD"};
    }

    static {
        A00();
        A07 = Float.floatToIntBits(Float.NaN);
    }

    public static void A01(int i2, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i2) * 4.656612875245797E-10d));
        if (iFloatToIntBits == A07) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final boolean A47(int i2, int i3, int i4) throws C0592Ax {
        if (J1.A0f(i4)) {
            int i5 = this.A01;
            String[] strArr = A06;
            if (strArr[1].charAt(10) != strArr[5].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[0] = "leVPKBI8NIDC3IwFclJng7rkdIPGoQ7e";
            strArr2[0] = "leVPKBI8NIDC3IwFclJng7rkdIPGoQ7e";
            if (i5 == i2 && this.A00 == i3 && this.A02 == i4) {
                return false;
            }
            this.A01 = i2;
            this.A00 = i3;
            this.A02 = i4;
            return true;
        }
        throw new C0592Ax(i2, i3, i4);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final ByteBuffer A6d() {
        ByteBuffer byteBuffer = this.A04;
        this.A04 = InterfaceC0593Ay.A00;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final int A6e() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final int A6f() {
        return 4;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final int A6g() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final boolean A7a() {
        return J1.A0f(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final boolean A7e() {
        return this.A05 && this.A04 == InterfaceC0593Ay.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final void ABx() {
        this.A05 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final void ABy(ByteBuffer byteBuffer) {
        int resampledSize = this.A02 == 1073741824 ? 1 : 0;
        int i2 = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i3 = iLimit - i2;
        if (resampledSize == 0) {
            int size = i3 / 3;
            i3 = size * 4;
        }
        int iCapacity = this.A03.capacity();
        String[] strArr = A06;
        String str = strArr[1];
        String str2 = strArr[5];
        int limit = str.charAt(10);
        int size2 = str2.charAt(10);
        if (limit != size2) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[2] = "93WHocDEPVvmBm0SxxEdEuUxxAP6dl6i";
        strArr2[2] = "93WHocDEPVvmBm0SxxEdEuUxxAP6dl6i";
        if (iCapacity < i3) {
            this.A03 = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
        } else {
            this.A03.clear();
        }
        if (resampledSize != 0) {
            while (i2 < iLimit) {
                int size3 = byteBuffer.get(i2);
                int limit2 = size3 & 255;
                int size4 = i2 + 1;
                int limit3 = limit2 | ((byteBuffer.get(size4) & 255) << 8);
                int size5 = i2 + 2;
                int limit4 = limit3 | ((byteBuffer.get(size5) & 255) << 16);
                int size6 = i2 + 3;
                A01(limit4 | ((byteBuffer.get(size6) & 255) << 24), this.A03);
                i2 += 4;
            }
        } else {
            while (i2 < iLimit) {
                int size7 = byteBuffer.get(i2);
                int limit5 = (size7 & 255) << 8;
                int size8 = i2 + 1;
                int limit6 = limit5 | ((byteBuffer.get(size8) & 255) << 16);
                int size9 = i2 + 2;
                A01(limit6 | ((byteBuffer.get(size9) & 255) << 24), this.A03);
                i2 += 3;
            }
        }
        int size10 = byteBuffer.limit();
        byteBuffer.position(size10);
        this.A03.flip();
        this.A04 = this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final void flush() {
        this.A04 = InterfaceC0593Ay.A00;
        this.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final void reset() {
        flush();
        this.A01 = -1;
        this.A00 = -1;
        this.A02 = 0;
        this.A03 = InterfaceC0593Ay.A00;
    }
}
