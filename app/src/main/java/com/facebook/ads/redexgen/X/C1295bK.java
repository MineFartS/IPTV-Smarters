package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1295bK implements InterfaceC0740Hh {
    public static byte[] A05;
    public static String[] A06;
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;
    public final I2<? super C1295bK> A04;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{37};
    }

    public static void A02() {
        A06 = new String[]{"l2rBvT9KAEY6yl2SIp", "0cRN39km0cT", "q9WvQr", "pX7zul93kCJ6F7tIXqRnEpKrjeNmhaPh", "ddKujtHDPllkfb3cyYepVcXFvJyDikdo", "gNoa3Z", "AdKzyhJyCrP", "aoyUT4m5l2MLf3LhSWprSpj54sdxW1uC"};
    }

    public C1295bK() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I2 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.FileDataSource> */
    public C1295bK(I2<? super C1295bK> i2) {
        this.A04 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final Uri A7H() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final long ABR(C0744Hl c0744Hl) throws C0746Ho {
        long length;
        try {
            this.A01 = c0744Hl.A04;
            this.A02 = new RandomAccessFile(c0744Hl.A04.getPath(), A00(0, 1, 72));
            this.A02.seek(c0744Hl.A03);
            if (c0744Hl.A02 == -1) {
                length = this.A02.length() - c0744Hl.A03;
            } else {
                length = c0744Hl.A02;
            }
            this.A00 = length;
            if (this.A00 >= 0) {
                this.A03 = true;
                I2<? super C1295bK> i2 = this.A04;
                if (i2 != null) {
                    i2.ABC(this, c0744Hl);
                }
                long j2 = this.A00;
                if (A06[0].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[7] = "qz0up6ppIELboyns2CZBgMvSr8RDOOhA";
                strArr[3] = "iQKzkqELqDYakLKWZdfSUnFo9DHl6nVv";
                return j2;
            }
            throw new EOFException();
        } catch (IOException e2) {
            throw new C0746Ho(e2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final void close() throws C0746Ho {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
            } catch (IOException e2) {
                throw new C0746Ho(e2);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                I2<? super C1295bK> i2 = this.A04;
                if (i2 != null) {
                    i2.ABB(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0740Hh
    public final int read(byte[] bArr, int i2, int i3) throws C0746Ho {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.A00;
        if (j2 == 0) {
            return -1;
        }
        try {
            int i4 = this.A02.read(bArr, i2, (int) Math.min(j2, i3));
            if (i4 > 0) {
                this.A00 -= (long) i4;
                I2<? super C1295bK> i22 = this.A04;
                if (i22 != null) {
                    i22.A99(this, i4);
                }
            }
            return i4;
        } catch (IOException e2) {
            throw new C0746Ho(e2);
        }
    }
}
