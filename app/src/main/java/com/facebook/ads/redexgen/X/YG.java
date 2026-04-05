package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YG implements InterfaceC0593Ay {
    public static String[] A0B;
    public int A01;
    public int A02;
    public int A04;
    public int A05;
    public boolean A08;
    public boolean A09;
    public ByteBuffer A06 = InterfaceC0593Ay.A00;
    public ByteBuffer A07 = InterfaceC0593Ay.A00;
    public int A00 = -1;
    public int A03 = -1;
    public byte[] A0A = new byte[0];

    static {
        A00();
    }

    public static void A00() {
        A0B = new String[]{"r", "4", "I5O53mReJYgY4Jy6Te4gmLvwKot1lmjj", "5S", "zkj4NaHy3qG", "EJmI2pRz04", "Xqte5C1rywD", "1UQbdYDvzSk5pKr4kl4SZHHNZLcQI2bC"};
    }

    public final void A01(int i2, int i3) {
        this.A05 = i2;
        this.A04 = i3;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final boolean A47(int i2, int i3, int i4) throws C0592Ax {
        if (i4 == 2) {
            this.A00 = i3;
            this.A03 = i2;
            int i5 = this.A04;
            this.A0A = new byte[i5 * i3 * 2];
            this.A01 = 0;
            int i6 = this.A05;
            this.A02 = i6 * i3 * 2;
            boolean z = this.A09;
            this.A09 = (i6 == 0 && i5 == 0) ? false : true;
            return z != this.A09;
        }
        throw new C0592Ax(i2, i3, i4);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final ByteBuffer A6d() {
        ByteBuffer byteBuffer = this.A07;
        this.A07 = InterfaceC0593Ay.A00;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final int A6e() {
        return this.A00;
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
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final boolean A7e() {
        return this.A08 && this.A07 == InterfaceC0593Ay.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final void ABx() {
        this.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final void ABy(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.position();
        int trimBytes = byteBuffer.limit();
        int i2 = trimBytes - remaining;
        int iMin = Math.min(i2, this.A02);
        this.A02 -= iMin;
        byteBuffer.position(remaining + iMin);
        if (this.A02 > 0) {
            return;
        }
        int remainingBytesToOutput = i2 - iMin;
        int length = (this.A01 + remainingBytesToOutput) - this.A0A.length;
        if (this.A06.capacity() < length) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(length);
            if (A0B[3].length() == 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[3] = "Xd8Hzn34smT7X798Wj1HPKCywQ0V";
            strArr[3] = "Xd8Hzn34smT7X798Wj1HPKCywQ0V";
            this.A06 = byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        } else {
            this.A06.clear();
        }
        int remaining2 = J1.A06(length, 0, this.A01);
        this.A06.put(this.A0A, 0, remaining2);
        int iA06 = J1.A06(length - remaining2, 0, remainingBytesToOutput);
        int inputBufferBytesToOutput = byteBuffer.position();
        byteBuffer.limit(inputBufferBytesToOutput + iA06);
        this.A06.put(byteBuffer);
        byteBuffer.limit(trimBytes);
        int remainingBytesToOutput2 = remainingBytesToOutput - iA06;
        int inputBufferBytesToOutput2 = this.A01;
        this.A01 = inputBufferBytesToOutput2 - remaining2;
        byte[] bArr = this.A0A;
        int inputBufferBytesToOutput3 = this.A01;
        System.arraycopy(bArr, remaining2, bArr, 0, inputBufferBytesToOutput3);
        byte[] bArr2 = this.A0A;
        int inputBufferBytesToOutput4 = this.A01;
        byteBuffer.get(bArr2, inputBufferBytesToOutput4, remainingBytesToOutput2);
        int inputBufferBytesToOutput5 = this.A01;
        this.A01 = inputBufferBytesToOutput5 + remainingBytesToOutput2;
        this.A06.flip();
        this.A07 = this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final void flush() {
        this.A07 = InterfaceC0593Ay.A00;
        this.A08 = false;
        this.A02 = 0;
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final void reset() {
        flush();
        this.A06 = InterfaceC0593Ay.A00;
        this.A00 = -1;
        this.A03 = -1;
        this.A0A = new byte[0];
    }
}
