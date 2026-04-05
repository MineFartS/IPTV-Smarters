package com.facebook.ads.redexgen.X;

import com.amazonaws.event.ProgressEvent;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YY implements CG {
    public int A00;
    public int A01;
    public long A02;
    public final long A04;
    public final InterfaceC0740Hh A05;
    public byte[] A03 = new byte[65536];
    public final byte[] A06 = new byte[ProgressEvent.PART_FAILED_EVENT_CODE];

    public YY(InterfaceC0740Hh interfaceC0740Hh, long j2, long j3) {
        this.A05 = interfaceC0740Hh;
        this.A02 = j2;
        this.A04 = j3;
    }

    private int A00(int i2) {
        int iMin = Math.min(this.A00, i2);
        A05(iMin);
        return iMin;
    }

    private int A01(byte[] bArr, int i2, int i3) {
        int i4 = this.A00;
        if (i4 == 0) {
            return 0;
        }
        int iMin = Math.min(i4, i3);
        System.arraycopy(this.A03, 0, bArr, i2, iMin);
        A05(iMin);
        return iMin;
    }

    private int A02(byte[] bArr, int i2, int i3, int i4, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int i5 = this.A05.read(bArr, i2 + i4, i3 - i4);
            if (i5 == -1) {
                if (i4 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i4 + i5;
        }
        throw new InterruptedException();
    }

    private void A03(int i2) {
        if (i2 != -1) {
            this.A02 += (long) i2;
        }
    }

    private void A04(int i2) {
        int i3 = this.A01 + i2;
        byte[] bArr = this.A03;
        if (i3 > bArr.length) {
            this.A03 = Arrays.copyOf(this.A03, J1.A06(bArr.length * 2, 65536 + i3, 524288 + i3));
        }
    }

    private void A05(int i2) {
        this.A00 -= i2;
        this.A01 = 0;
        byte[] bArr = this.A03;
        int i3 = this.A00;
        if (i3 < this.A03.length - 524288) {
            bArr = new byte[i3 + 65536];
        }
        System.arraycopy(this.A03, i2, bArr, 0, this.A00);
        this.A03 = bArr;
    }

    public final boolean A06(int i2, boolean z) throws InterruptedException, IOException {
        A04(i2);
        int iMin = Math.min(this.A00 - this.A01, i2);
        while (iMin < i2) {
            iMin = A02(this.A03, this.A01, i2, iMin, z);
            if (iMin == -1) {
                return false;
            }
        }
        this.A01 += i2;
        this.A00 = Math.max(this.A00, this.A01);
        return true;
    }

    public final boolean A07(int i2, boolean z) throws InterruptedException, IOException {
        int iA00 = A00(i2);
        while (iA00 < i2 && iA00 != -1) {
            iA00 = A02(this.A06, -iA00, Math.min(i2, this.A06.length + iA00), iA00, z);
        }
        A03(iA00);
        return iA00 != -1;
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final void A3M(int i2) throws InterruptedException, IOException {
        A06(i2, false);
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final long A6W() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final long A6k() {
        return this.A02 + ((long) this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final long A6p() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final void ABc(byte[] bArr, int i2, int i3) throws InterruptedException, IOException {
        ABd(bArr, i2, i3, false);
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final boolean ABd(byte[] bArr, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!A06(i3, z)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i3, bArr, i2, i3);
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final boolean AC5(byte[] bArr, int i2, int i3, boolean z) throws InterruptedException, IOException {
        int iA01 = A01(bArr, i2, i3);
        while (iA01 < i3 && iA01 != -1) {
            iA01 = A02(bArr, i2, i3, iA01, z);
        }
        A03(iA01);
        return iA01 != -1;
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final void ACd() {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final int ADG(int i2) throws InterruptedException, IOException {
        int iA00 = A00(i2);
        if (iA00 == 0) {
            byte[] bArr = this.A06;
            iA00 = A02(bArr, 0, Math.min(i2, bArr.length), 0, true);
        }
        A03(iA00);
        return iA00;
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final void ADJ(int i2) throws InterruptedException, IOException {
        A07(i2, false);
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final int read(byte[] bArr, int i2, int i3) throws InterruptedException, IOException {
        int iA01 = A01(bArr, i2, i3);
        if (iA01 == 0) {
            iA01 = A02(bArr, i2, i3, 0, true);
        }
        A03(iA01);
        return iA01;
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final void readFully(byte[] bArr, int i2, int i3) throws InterruptedException, IOException {
        AC5(bArr, i2, i3, false);
    }
}
