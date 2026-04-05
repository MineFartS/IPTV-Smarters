package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YD implements InterfaceC0593Ay {
    public static String[] A0E;
    public int A00;
    public int A02;
    public int A03;
    public int A05;
    public long A06;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public ByteBuffer A07 = InterfaceC0593Ay.A00;
    public ByteBuffer A08 = InterfaceC0593Ay.A00;
    public int A01 = -1;
    public int A04 = -1;
    public byte[] A0C = new byte[0];
    public byte[] A0D = new byte[0];

    static {
        A03();
    }

    public static void A03() {
        A0E = new String[]{"tvm2mqRs7a3ehYHdc1yBQoSNsWCnK", "tOWfSaULM8EnbecBF3SZtCA", "iNgvpQne2", "1AcoT6GEPIUQ3JZIKBz6KhI4GHeuy79P", "lryhUlLd6yxpw4rz006xnThMb", "3cZRB", "VTjWgXugqiR9aqruhTtZOoVTfcJyB76i", "EEKliZG5v6PVzs3xPcyqxwhc3FAivYta"};
    }

    private int A00(long j2) {
        return (int) ((((long) this.A04) * j2) / 1000000);
    }

    private int A01(ByteBuffer byteBuffer) {
        for (int iLimit = byteBuffer.limit() - 1; iLimit >= byteBuffer.position(); iLimit -= 2) {
            if (Math.abs((int) byteBuffer.get(iLimit)) > 4) {
                int i2 = this.A00;
                return ((iLimit / i2) * i2) + i2;
            }
        }
        int iPosition = byteBuffer.position();
        String[] strArr = A0E;
        if (strArr[5].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[5] = "KbmXU";
        strArr2[1] = "sStp2WQndpDzY5UDNElAkrU";
        return iPosition;
    }

    private int A02(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position() + 1; iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.get(iPosition)) > 4) {
                int i2 = this.A00;
                return i2 * (iPosition / i2);
            }
        }
        return byteBuffer.limit();
    }

    private void A04(int i2) {
        if (this.A07.capacity() < i2) {
            this.A07 = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.A07.clear();
        }
        if (i2 > 0) {
            this.A0A = true;
        }
    }

    private void A05(ByteBuffer byteBuffer) {
        A04(byteBuffer.remaining());
        this.A07.put(byteBuffer);
        this.A07.flip();
        this.A08 = this.A07;
    }

    private void A06(ByteBuffer byteBuffer) {
        int maybeSilenceInputSize = byteBuffer.limit();
        int iA02 = A02(byteBuffer);
        int iPosition = iA02 - byteBuffer.position();
        byte[] bArr = this.A0C;
        int length = bArr.length;
        int maybeSilenceBufferRemaining = this.A02;
        int i2 = length - maybeSilenceBufferRemaining;
        if (iA02 < maybeSilenceInputSize && iPosition < i2) {
            A0A(bArr, maybeSilenceBufferRemaining);
            this.A02 = 0;
            this.A05 = 0;
            return;
        }
        int iMin = Math.min(iPosition, i2);
        byteBuffer.limit(byteBuffer.position() + iMin);
        String[] strArr = A0E;
        if (strArr[0].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[6] = "wWIHZuTOncQcUu5TT4FAsoGOHgVjS7Hw";
        strArr2[3] = "FL1HwHnzDnNmmMdWBTP73LL49pAAT75M";
        byteBuffer.get(this.A0C, this.A02, iMin);
        this.A02 += iMin;
        int i3 = this.A02;
        byte[] bArr2 = this.A0C;
        if (i3 == bArr2.length) {
            if (this.A0A) {
                A0A(bArr2, this.A03);
                this.A06 += (long) ((this.A02 - (this.A03 * 2)) / this.A00);
            } else {
                this.A06 += (long) ((i3 - this.A03) / this.A00);
            }
            A09(byteBuffer, this.A0C, this.A02);
            this.A02 = 0;
            this.A05 = 2;
        }
        byteBuffer.limit(maybeSilenceInputSize);
    }

    private void A07(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.A0C.length));
        int iA01 = A01(byteBuffer);
        if (iA01 == byteBuffer.position()) {
            this.A05 = 1;
        } else {
            byteBuffer.limit(iA01);
            A05(byteBuffer);
        }
        byteBuffer.limit(iLimit);
    }

    private void A08(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iA02 = A02(byteBuffer);
        byteBuffer.limit(iA02);
        this.A06 += (long) (byteBuffer.remaining() / this.A00);
        A09(byteBuffer, this.A0D, this.A03);
        if (iA02 < iLimit) {
            A0A(this.A0D, this.A03);
            this.A05 = 0;
            byteBuffer.limit(iLimit);
        }
    }

    private void A09(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int iMin = Math.min(byteBuffer.remaining(), this.A03);
        int i3 = this.A03 - iMin;
        System.arraycopy(bArr, i2 - i3, this.A0D, 0, i3);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.A0D, i3, iMin);
    }

    private void A0A(byte[] bArr, int i2) {
        A04(i2);
        this.A07.put(bArr, 0, i2);
        this.A07.flip();
        this.A08 = this.A07;
    }

    public final long A0B() {
        return this.A06;
    }

    public final void A0C(boolean z) {
        this.A09 = z;
        flush();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final boolean A47(int i2, int i3, int i4) throws C0592Ax {
        if (i4 == 2) {
            if (this.A04 == i2) {
                int i5 = this.A01;
                if (A0E[4].length() != 25) {
                    throw new RuntimeException();
                }
                String[] strArr = A0E;
                strArr[0] = "H8XMnFWveFctl2wFWM9cW2gP9UHr1";
                strArr[2] = "PgSQZHBtM";
                if (i5 == i3) {
                    return false;
                }
            }
            this.A04 = i2;
            this.A01 = i3;
            this.A00 = i3 * 2;
            return true;
        }
        throw new C0592Ax(i2, i3, i4);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final ByteBuffer A6d() {
        ByteBuffer byteBuffer = this.A08;
        this.A08 = InterfaceC0593Ay.A00;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final int A6e() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final int A6f() {
        return 2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final int A6g() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final boolean A7a() {
        return this.A04 != -1 && this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final boolean A7e() {
        return this.A0B && this.A08 == InterfaceC0593Ay.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final void ABx() {
        this.A0B = true;
        int i2 = this.A02;
        if (i2 > 0) {
            A0A(this.A0C, i2);
        }
        if (!this.A0A) {
            this.A06 += (long) (this.A03 / this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final void ABy(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.A08.hasRemaining()) {
            int i2 = this.A05;
            if (i2 != 0) {
                String[] strArr = A0E;
                if (strArr[5].length() == strArr[1].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0E;
                strArr2[4] = "AiWUvfGcxq4zga3HVbzIicdLH";
                strArr2[4] = "AiWUvfGcxq4zga3HVbzIicdLH";
                if (i2 == 1) {
                    A06(byteBuffer);
                } else if (i2 == 2) {
                    A08(byteBuffer);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                A07(byteBuffer);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final void flush() {
        if (A7a()) {
            int iA00 = A00(150000L) * this.A00;
            if (this.A0C.length != iA00) {
                this.A0C = new byte[iA00];
            }
            this.A03 = A00(20000L) * this.A00;
            int length = this.A0D.length;
            int i2 = this.A03;
            if (length != i2) {
                this.A0D = new byte[i2];
            }
        }
        this.A05 = 0;
        this.A08 = InterfaceC0593Ay.A00;
        this.A0B = false;
        this.A06 = 0L;
        String[] strArr = A0E;
        if (strArr[5].length() == strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[5] = "CYbGl";
        strArr2[1] = "FkXGzwkTO5dsiSfEVL3DvOQ";
        this.A02 = 0;
        this.A0A = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0593Ay
    public final void reset() {
        this.A09 = false;
        flush();
        this.A07 = InterfaceC0593Ay.A00;
        this.A01 = -1;
        this.A04 = -1;
        this.A03 = 0;
        this.A0C = new byte[0];
        this.A0D = new byte[0];
    }
}
