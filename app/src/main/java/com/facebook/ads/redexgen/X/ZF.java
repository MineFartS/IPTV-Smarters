package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZF implements CF {
    public static byte[] A04;
    public static String[] A05;
    public static final CI A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final ZG A02;
    public final C0768Il A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 120);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{27, DateTimeFieldType.MILLIS_OF_DAY, 97};
    }

    public static void A02() {
        A05 = new String[]{"6Yd3MlxO6zs0On0JMF5Pwnois3aNTjpE", "MmQBoaYzrmdPmtEAYQ3R1Y6Mcsh6By7B", "7RUBoC8KCwVWfiCX9SWb", "GS41ND25W7ytYawGpGonJQP9IOOENLXr", "lL4oomLzy5vPLaNFQ0K", "J26", "emQAR3GMgLzBn72fJq6a", "GcSIxJRAUXsHB0u2DOmppTTbOqtsj228"};
    }

    static {
        A02();
        A01();
        A06 = new ZE();
        A07 = J1.A08(A00(0, 3, 42));
    }

    public ZF() {
        this(0L);
    }

    public ZF(long j2) {
        this.A01 = j2;
        this.A02 = new ZG(true);
        this.A03 = new C0768Il(200);
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void A7V(CH ch) {
        this.A02.A4V(ch, new DZ(0, 1));
        ch.A4x();
        ch.ACn(new C1167Yc(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final int AC0(CG cg, CM cm) throws InterruptedException, IOException {
        int i2 = cg.read(this.A03.A00, 0, 200);
        if (i2 == -1) {
            return -1;
        }
        this.A03.A0Z(0);
        this.A03.A0Y(i2);
        if (!this.A00) {
            this.A02.ABY(this.A01, true);
            this.A00 = true;
        }
        this.A02.A48(this.A03);
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void ACm(long j2, long j3) {
        this.A00 = false;
        this.A02.ACl();
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final boolean ADK(CG cg) throws InterruptedException, IOException {
        C0768Il c0768Il = new C0768Il(10);
        C0767Ik c0767Ik = new C0767Ik(c0768Il.A00);
        int validFramesCount = 0;
        while (true) {
            cg.ABc(c0768Il.A00, 0, 10);
            c0768Il.A0Z(0);
            if (c0768Il.A0H() != A07) {
                break;
            }
            c0768Il.A0a(3);
            int iA0E = c0768Il.A0E();
            int syncBytes = iA0E + 10;
            validFramesCount += syncBytes;
            cg.A3M(iA0E);
        }
        cg.ACd();
        cg.A3M(validFramesCount);
        int i2 = validFramesCount;
        int i3 = 0;
        if (A05[4].length() == 20) {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[1] = "mY90xJHLqPMDpFXgmiZe2UkYD68ZyI7P";
        strArr[1] = "mY90xJHLqPMDpFXgmiZe2UkYD68ZyI7P";
        int startPosition = 0;
        while (true) {
            cg.ABc(c0768Il.A00, 0, 2);
            c0768Il.A0Z(0);
            int syncBytes2 = c0768Il.A0J();
            if ((65526 & syncBytes2) != 65520) {
                startPosition = 0;
                i3 = 0;
                cg.ACd();
                i2++;
                if (i2 - validFramesCount >= 8192) {
                    return false;
                }
                cg.A3M(i2);
            } else {
                startPosition++;
                if (startPosition >= 4 && i3 > 188) {
                    return true;
                }
                cg.ABc(c0768Il.A00, 0, 4);
                c0767Ik.A08(14);
                int iA05 = c0767Ik.A05(13);
                if (iA05 <= 6) {
                    return false;
                }
                int syncBytes3 = iA05 - 6;
                cg.A3M(syncBytes3);
                i3 += iA05;
            }
        }
    }
}
