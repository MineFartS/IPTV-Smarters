package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1311ba implements InterfaceC0738Hf {
    public static String[] A0B;
    public long A00;
    public long A01;
    public C0744Hl A02;
    public C0775Is A03;
    public File A04;
    public FileOutputStream A05;
    public OutputStream A06;
    public final int A07;
    public final long A08;
    public final I6 A09;
    public final boolean A0A;

    static {
        A02();
    }

    public static void A02() {
        A0B = new String[]{"w20bAWjYMNQBWlbon1lxwLvvC2Wc6aDw", "lwUY3oAzCyDGvzazHVXOHQ3zY7kbNweW", "UaweMkDBVxVyODuJAIk0oAizBiXulMgw", "HCwWhWYnSwS9lU8hovQ66gM", "BSrpyguVpFJpaQafc1NdT7mO3uIgLmFW", "PMiNqiQ4kgs0VWuHsJy6tm47yNuoSJAG", "LFxM2Smyc2PeWHZihlec1nFmzNKIeMAJ", "CwFpegEhQfdxfTMnj3Ot7m2"};
    }

    public C1311ba(I6 i6, long j2) {
        this(i6, j2, 20480, true);
    }

    public C1311ba(I6 i6, long j2, int i2, boolean z) {
        this.A09 = (I6) IM.A01(i6);
        this.A08 = j2;
        this.A07 = i2;
        this.A0A = z;
    }

    private void A00() throws IOException {
        OutputStream outputStream = this.A06;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            boolean success = this.A0A;
            if (success) {
                this.A05.getFD().sync();
            }
            J1.A0b(this.A06);
            this.A06 = null;
            File file = this.A04;
            this.A04 = null;
            if (1 != 0) {
                this.A09.A44(file);
            } else {
                file.delete();
            }
        } catch (Throwable th) {
            J1.A0b(this.A06);
            this.A06 = null;
            File file2 = this.A04;
            this.A04 = null;
            if (0 != 0) {
                this.A09.A44(file2);
            } else {
                file2.delete();
            }
            throw th;
        }
    }

    private void A01() throws IOException {
        long jMin;
        if (this.A02.A02 == -1) {
            jMin = this.A08;
        } else {
            long j2 = this.A02.A02;
            long maxLength = this.A00;
            long j3 = j2 - maxLength;
            long maxLength2 = this.A08;
            jMin = Math.min(j3, maxLength2);
        }
        I6 i6 = this.A09;
        String str = this.A02.A05;
        long maxLength3 = this.A02.A01;
        this.A04 = i6.ADM(str, this.A00 + maxLength3, jMin);
        this.A05 = new FileOutputStream(this.A04);
        int i2 = this.A07;
        if (i2 > 0) {
            C0775Is c0775Is = this.A03;
            if (c0775Is == null) {
                this.A03 = new C0775Is(this.A05, i2);
            } else {
                c0775Is.A00(this.A05);
            }
            this.A06 = this.A03;
        } else {
            this.A06 = this.A05;
        }
        this.A01 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0738Hf
    public final void ABT(C0744Hl c0744Hl) throws C1310bZ {
        if (c0744Hl.A02 == -1 && !c0744Hl.A04(2)) {
            this.A02 = null;
            return;
        }
        this.A02 = c0744Hl;
        this.A00 = 0L;
        try {
            A01();
        } catch (IOException e2) {
            throw new C1310bZ(e2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0738Hf
    public final void close() throws C1310bZ {
        if (this.A02 == null) {
            return;
        }
        try {
            A00();
        } catch (IOException e2) {
            throw new C1310bZ(e2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0738Hf
    public final void write(byte[] bArr, int bytesToWrite, int i2) throws C1310bZ {
        if (this.A02 == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                long j2 = this.A01;
                long j3 = this.A08;
                if (A0B[0].charAt(30) != 'D') {
                    throw new RuntimeException();
                }
                String[] strArr = A0B;
                strArr[6] = "jgYsfafqQwydOQ8BdugE0IR3OVOgVMqo";
                strArr[6] = "jgYsfafqQwydOQ8BdugE0IR3OVOgVMqo";
                if (j2 == j3) {
                    A00();
                    A01();
                }
                int iMin = (int) Math.min(i2 - i3, this.A08 - this.A01);
                this.A06.write(bArr, bytesToWrite + i3, iMin);
                i3 += iMin;
                this.A01 += (long) iMin;
                this.A00 += (long) iMin;
            } catch (IOException e2) {
                throw new C1310bZ(e2);
            }
        }
    }
}
