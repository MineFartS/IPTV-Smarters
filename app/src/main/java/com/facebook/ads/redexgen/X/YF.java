package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YF implements InterfaceC0593Ay {
    public static String[] A0D;
    public long A06;
    public long A07;

    @Nullable
    public BT A08;
    public boolean A0C;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public int A02 = -1;
    public int A05 = -1;
    public int A03 = -1;
    public ByteBuffer A09 = InterfaceC0593Ay.A00;
    public ShortBuffer A0B = this.A09.asShortBuffer();
    public ByteBuffer A0A = InterfaceC0593Ay.A00;
    public int A04 = -1;

    static {
        A00();
    }

    public static void A00() {
        A0D = new String[]{"iVI49d2ZLsEdnN", "8nt9Mx90pYcLgm8jwIqfRxnuNB", "N5EnT7xPV04alRStuSSEb4qxGw0ypgBS", "CZFk7KMkAj1VPwfzqXgnV4RMFN6v0v1b", "0r4SPeKqFHrxpG", "Bbc1ECWkbstPDX5EGN6JJHjdPo9FJmAx", "C6RSY0Y2UTdbfyI9HBBCvYbiYc", "niyGYsc3TbIZXUeN92sM43TjCNQsZLKY"};
    }

    public final float A01(float f2) {
        float fA00 = J1.A00(f2, 0.1f, 8.0f);
        if (this.A00 != fA00) {
            this.A00 = fA00;
            this.A08 = null;
        }
        flush();
        return fA00;
    }

    public final float A02(float f2) {
        float fA00 = J1.A00(f2, 0.1f, 8.0f);
        if (this.A01 != fA00) {
            this.A01 = fA00;
            this.A08 = null;
        }
        flush();
        return fA00;
    }

    public final long A03(long j2) {
        long j3 = this.A07;
        if (j3 >= 1024) {
            int i2 = this.A03;
            int i3 = this.A05;
            if (i2 == i3) {
                return J1.A0G(j2, this.A06, j3);
            }
            return J1.A0G(j2, this.A06 * ((long) i2), j3 * ((long) i3));
        }
        return (long) (((double) this.A01) * j2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final boolean A47(int i2, int i3, int i4) throws C0592Ax {
        if (i4 == 2) {
            int i5 = this.A04;
            if (i5 == -1) {
                i5 = i2;
            }
            if (this.A05 == i2 && this.A02 == i3 && this.A03 == i5) {
                return false;
            }
            this.A05 = i2;
            this.A02 = i3;
            this.A03 = i5;
            this.A08 = null;
            return true;
        }
        throw new C0592Ax(i2, i3, i4);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final ByteBuffer A6d() {
        ByteBuffer byteBuffer = this.A0A;
        this.A0A = InterfaceC0593Ay.A00;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final int A6e() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final int A6f() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final int A6g() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final boolean A7a() {
        if (this.A05 != -1) {
            if (Math.abs(this.A01 - 1.0f) < 0.01f) {
                float fAbs = Math.abs(this.A00 - 1.0f);
                String[] strArr = A0D;
                if (strArr[6].length() != strArr[1].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0D;
                strArr2[4] = "vE55EECrsMoThx";
                strArr2[0] = "BaJHYxULwHsid1";
                if (fAbs >= 0.01f || this.A03 != this.A05) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final boolean A7e() {
        BT bt;
        return this.A0C && ((bt = this.A08) == null || bt.A0I() == 0);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final void ABx() {
        IM.A04(this.A08 != null);
        this.A08.A0K();
        this.A0C = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final void ABy(ByteBuffer byteBuffer) {
        IM.A04(this.A08 != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.A06 += (long) iRemaining;
            this.A08.A0M(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
        int iA0I = this.A08.A0I() * this.A02 * 2;
        if (iA0I > 0) {
            if (this.A09.capacity() < iA0I) {
                this.A09 = ByteBuffer.allocateDirect(iA0I).order(ByteOrder.nativeOrder());
                this.A0B = this.A09.asShortBuffer();
            } else {
                this.A09.clear();
                this.A0B.clear();
            }
            this.A08.A0L(this.A0B);
            this.A07 += (long) iA0I;
            this.A09.limit(iA0I);
            this.A0A = this.A09;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final void flush() {
        if (A7a()) {
            BT bt = this.A08;
            if (bt == null) {
                this.A08 = new BT(this.A05, this.A02, this.A01, this.A00, this.A03);
            } else {
                bt.A0J();
            }
        }
        this.A0A = InterfaceC0593Ay.A00;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final void reset() {
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        this.A02 = -1;
        this.A05 = -1;
        this.A03 = -1;
        this.A09 = InterfaceC0593Ay.A00;
        this.A0B = this.A09.asShortBuffer();
        this.A0A = InterfaceC0593Ay.A00;
        this.A04 = -1;
        this.A08 = null;
        this.A06 = 0L;
        this.A07 = 0L;
        this.A0C = false;
    }
}
