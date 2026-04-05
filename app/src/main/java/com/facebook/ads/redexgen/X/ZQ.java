package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZQ implements InterfaceC0635Da {
    public static byte[] A0C;
    public static String[] A0D;
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public C0780Ix A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final DL A0A;
    public final C0767Ik A0B = new C0767Ik(new byte[10]);
    public int A03 = 0;

    static {
        A03();
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0C = new byte[]{-29, 48, 50, 53, 40, -29, 37, 60, 55, 40, 54, -58, -37, -23, -56, -37, -41, -38, -37, -24, -28, -3, -12, 7, -1, -12, -14, 3, -12, -13, -81, 2, 3, -16, 1, 3, -81, -14, -2, -13, -12, -81, -1, 1, -12, -11, -8, 7, -55, -81, -20, 5, -4, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 7, -4, -6, 11, -4, -5, -73, 10, 11, -8, 9, 11, -73, 0, 5, -5, 0, -6, -8, 11, 6, 9, -73, 9, -4, -8, -5, 0, 5, -2, -73, -4, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 11, -4, 5, -5, -4, -5, -73, -1, -4, -8, -5, -4, 9, -47, -22, -31, -12, -20, -31, -33, -16, -31, -32, -100, -17, -16, -35, -18, -16, -100, -27, -22, -32, -27, -33, -35, -16, -21, -18, -74, -100, -31, -12, -20, -31, -33, -16, -31, -32, -100};
    }

    public static void A03() {
        A0D = new String[]{"yUSRg3C4669fvLzuOHW1XSLd3PantLKL", "TfD3AbKeF9VAaUscqyzwwU3jFt7tVTiq", "g0WIbq4DK90SLCQEiKu8stzXkqWEOBgJ", "mQ9LzXZ", "LtvBgOfO2pmZDU6uCsowjLyYxKVOoB", "Sd9ouEoM5pzgzW5N1jQmDkMiOeFHRcqL", "5alPEFiVNlXDBdXEKmvVdaMyQKz58nOe", "TNFmsx2lI6S26ML"};
    }

    public ZQ(DL dl) {
        this.A0A = dl;
    }

    private void A01() {
        this.A0B.A08(0);
        this.A04 = -9223372036854775807L;
        if (this.A08) {
            this.A0B.A09(4);
            long jA05 = ((long) this.A0B.A05(3)) << 30;
            this.A0B.A09(1);
            long jA052 = jA05 | ((long) (this.A0B.A05(15) << 15));
            this.A0B.A09(1);
            long jA053 = jA052 | ((long) this.A0B.A05(15));
            this.A0B.A09(1);
            if (!this.A09 && this.A07) {
                this.A0B.A09(4);
                long jA054 = ((long) this.A0B.A05(3)) << 30;
                this.A0B.A09(1);
                long jA055 = jA054 | ((long) (this.A0B.A05(15) << 15));
                this.A0B.A09(1);
                long jA056 = jA055 | ((long) this.A0B.A05(15));
                this.A0B.A09(1);
                this.A05.A08(jA056);
                this.A09 = true;
            }
            long pts = this.A05.A08(jA053);
            this.A04 = pts;
        }
    }

    private void A04(int i2) {
        this.A03 = i2;
        this.A00 = 0;
    }

    private boolean A05() {
        this.A0B.A08(0);
        int iA05 = this.A0B.A05(24);
        if (iA05 != 1) {
            Log.w(A00(11, 9, 46), A00(20, 30, 71) + iA05);
            this.A02 = -1;
            return false;
        }
        this.A0B.A09(8);
        int iA052 = this.A0B.A05(16);
        this.A0B.A09(5);
        this.A06 = this.A0B.A0G();
        this.A0B.A09(2);
        this.A08 = this.A0B.A0G();
        this.A07 = this.A0B.A0G();
        this.A0B.A09(6);
        int packetLength = this.A0B.A05(8);
        this.A01 = packetLength;
        if (iA052 == 0) {
            this.A02 = -1;
        } else {
            int packetLength2 = iA052 + 6;
            int i2 = packetLength2 - 9;
            int packetLength3 = this.A01;
            int i3 = i2 - packetLength3;
            String[] strArr = A0D;
            String str = strArr[1];
            String str2 = strArr[5];
            int iCharAt = str.charAt(17);
            int packetLength4 = str2.charAt(17);
            if (iCharAt == packetLength4) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "TxtnMsOUgyy3Igc1MGFXcQorbec0OOLJ";
            strArr2[5] = "FqrtTSnP7VIKT9cq1hMIyK6Edo6EUePi";
            this.A02 = i3;
        }
        return true;
    }

    private boolean A06(C0768Il c0768Il, byte[] bArr, int i2) {
        int iMin = Math.min(c0768Il.A05(), i2 - this.A00);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c0768Il.A0a(iMin);
        } else {
            int i3 = this.A00;
            if (A0D[0].charAt(8) != '6') {
                String[] strArr = A0D;
                strArr[6] = "H8KMS8SQgkToBAcEgsGMIMEmcDOAfjD3";
                strArr[2] = "pG8ynHzO3ynvgwiEM6LVA0Wbsu12g974";
                c0768Il.A0d(bArr, i3, iMin);
            } else {
                String[] strArr2 = A0D;
                strArr2[1] = "SlJVAlpzWDTlfjZlG24yfuiEgxBIsDod";
                strArr2[5] = "YxSVdBM1mtROHF0F5NUzvc6S3n3WzSYI";
                c0768Il.A0d(bArr, i3, iMin);
            }
        }
        this.A00 += iMin;
        if (A0D[4].length() == 4) {
            throw new RuntimeException();
        }
        String[] strArr3 = A0D;
        strArr3[1] = "9iVHE5UHbJVR9dQ85oXJ8gpCzJ6PDaiT";
        strArr3[5] = "Vd59evKFs4P6sMun7tv1zskusbuvsqU9";
        return this.A00 == i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0635Da
    public final void A49(C0768Il c0768Il, boolean z) throws AI {
        if (z) {
            int i2 = this.A03;
            if (i2 != 0 && i2 != 1) {
                String strA00 = A00(11, 9, 46);
                if (i2 == 2) {
                    Log.w(strA00, A00(50, 50, 79));
                } else if (i2 == 3) {
                    if (this.A02 != -1) {
                        Log.w(strA00, A00(100, 37, 52) + this.A02 + A00(0, 11, 123));
                    }
                    this.A0A.ABX();
                }
            }
            A04(1);
        }
        while (c0768Il.A05() > 0) {
            int i3 = this.A03;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (A06(c0768Il, this.A0B.A00, Math.min(10, this.A01)) && A06(c0768Il, null, this.A01)) {
                            A01();
                            this.A0A.ABY(this.A04, this.A06);
                            A04(3);
                        }
                    } else if (i3 != 3) {
                        continue;
                    } else {
                        int iA05 = c0768Il.A05();
                        int i4 = this.A02;
                        int i5 = i4 != -1 ? iA05 - i4 : 0;
                        if (i5 > 0) {
                            iA05 -= i5;
                            c0768Il.A0Y(c0768Il.A07() + iA05);
                        }
                        this.A0A.A48(c0768Il);
                        int i6 = this.A02;
                        if (i6 != -1) {
                            this.A02 = i6 - iA05;
                            if (this.A02 == 0) {
                                DL dl = this.A0A;
                                if (A0D[0].charAt(8) != '6') {
                                    throw new RuntimeException();
                                }
                                String[] strArr = A0D;
                                strArr[6] = "x0jdU4oJLyfE062EEYlQTVcdLSkaU5Sb";
                                strArr[2] = "VBdeZUL1F1jcYz7E9oLJeT0FLHfAjfLP";
                                dl.ABX();
                                A04(1);
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (A06(c0768Il, this.A0B.A00, 9)) {
                    A04(A05() ? 2 : 0);
                }
            } else {
                c0768Il.A0a(c0768Il.A05());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0635Da
    public final void A7X(C0780Ix c0780Ix, CH ch, DZ dz) {
        this.A05 = c0780Ix;
        this.A0A.A4V(ch, dz);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0635Da
    public final void ACl() {
        this.A03 = 0;
        this.A00 = 0;
        this.A09 = false;
        this.A0A.ACl();
    }
}
