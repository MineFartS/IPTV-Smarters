package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZC implements CF {
    public static byte[] A04;
    public static String[] A05;
    public static final CI A06;
    public static final int A07;
    public boolean A00;
    public final long A01;
    public final ZD A02;
    public final C0768Il A03;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 2, 117};
    }

    public static void A02() {
        A05 = new String[]{"P5w0t5YmbfCx1ojda5KKDsEMO6jqUmnr", "UdOatSKcJailVD", BuildConfig.FLAVOR, "xAiF", "epl8GGi5jyNsT2QZHjLNLopZqyhNzplR", "TY8pRi4pa4JcG30Kuv61m", "fOMFGQDuqjq2usuY2YJ2oGF", "ObZwfJQfEiVxl"};
    }

    static {
        A02();
        A01();
        A06 = new ZB();
        A07 = J1.A08(A00(0, 3, 127));
    }

    public ZC() {
        this(0L);
    }

    public ZC(long j2) {
        this.A01 = j2;
        this.A02 = new ZD();
        this.A03 = new C0768Il(2786);
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void A7V(CH ch) {
        this.A02.A4V(ch, new DZ(0, 1));
        ch.A4x();
        ch.ACn(new C1167Yc(-9223372036854775807L));
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final int AC0(CG cg, CM cm) throws InterruptedException, IOException {
        int i2 = cg.read(this.A03.A00, 0, 2786);
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
        int i2 = 0;
        while (true) {
            cg.ABc(c0768Il.A00, 0, 10);
            if (A05[7].length() != 13) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[5] = "IuOldmz1qGC5b";
            strArr[5] = "IuOldmz1qGC5b";
            c0768Il.A0Z(0);
            if (c0768Il.A0H() != A07) {
                cg.ACd();
                cg.A3M(i2);
                int validFramesCount = i2;
                int i3 = 0;
                while (true) {
                    cg.ABc(c0768Il.A00, 0, 5);
                    c0768Il.A0Z(0);
                    if (c0768Il.A0J() != 2935) {
                        i3 = 0;
                        cg.ACd();
                        validFramesCount++;
                        if (validFramesCount - i2 >= 8192) {
                            return false;
                        }
                        cg.A3M(validFramesCount);
                    } else {
                        i3++;
                        if (A05[5].length() != 29) {
                            String[] strArr2 = A05;
                            strArr2[3] = "a4rI";
                            strArr2[6] = "EnE3h5gngskpWhoTVRGnZEO";
                            if (i3 >= 4) {
                                return true;
                            }
                        } else if (i3 >= 4) {
                            return true;
                        }
                        int iA05 = C0582An.A05(c0768Il.A00);
                        if (iA05 == -1) {
                            return false;
                        }
                        int syncBytes = iA05 - 5;
                        cg.A3M(syncBytes);
                    }
                }
            } else {
                c0768Il.A0a(3);
                int iA0E = c0768Il.A0E();
                int syncBytes2 = iA0E + 10;
                i2 += syncBytes2;
                cg.A3M(iA0E);
            }
        }
    }
}
