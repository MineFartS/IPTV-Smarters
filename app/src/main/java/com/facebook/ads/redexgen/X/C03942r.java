package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTimeFieldType;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03942r extends AQ {
    public static byte[] A0C;
    public static String[] A0D;
    public static final int[] A0E;
    public static final int[] A0F;
    public static final int[] A0G;
    public static final int[] A0H;
    public static final int[] A0I;
    public static final int[] A0J;
    public static final int[] A0K;
    public byte A00;
    public byte A01;
    public int A02;
    public int A03;
    public List<C0707Ga> A05;
    public List<C0707Ga> A06;
    public boolean A07;
    public final int A08;
    public final int A09;
    public final C0768Il A0A = new C0768Il();
    public final ArrayList<C0714Gh> A0B = new ArrayList<>();
    public C0714Gh A04 = new C0714Gh(0, 4);

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 105);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0C = new byte[]{88, 73, 73, 85, 80, 90, 88, 77, 80, 86, 87, DateTimeFieldType.MILLIS_OF_DAY, 65, DateTimeFieldType.SECOND_OF_DAY, 84, 73, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 90, 92, 88, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 9, 1};
    }

    public static void A08() {
        A0D = new String[]{"23YoP", "C5PaKb5CuNZ88jAQuKda3Ijqs42X0e51", "UjAKU", "ig9eEatozIbUeilu6P8PDlGI40FLnJQN", "3", "3yPqbEimTjK1Te0jzRxw8Mq4WDJCEE6c", "iulf573S2lPMND7gJrZX6jdv4yAWs7sY", "6"};
    }

    static {
        A08();
        A07();
        A0G = new int[]{11, 1, 3, 12, 14, 5, 7, 9};
        A0F = new int[]{0, 4, 8, 12, 16, 20, 24, 28};
        A0K = new int[]{-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
        A0E = new int[]{32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
        A0H = new int[]{174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 251};
        A0I = new int[]{193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
        A0J = new int[]{195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    }

    public C03942r(String str, int i2) {
        this.A08 = A04(0, 25, 80).equals(str) ? 2 : 3;
        if (i2 != 3 && i2 != 4) {
            this.A09 = 1;
        } else {
            this.A09 = 2;
        }
        A0C(0);
        A06();
    }

    public static char A00(byte b2) {
        int index = (b2 & 127) - 32;
        return (char) A0E[index];
    }

    public static char A01(byte b2) {
        int index = b2 & 31;
        return (char) A0I[index];
    }

    public static char A02(byte b2) {
        int index = b2 & 31;
        return (char) A0J[index];
    }

    public static char A03(byte b2) {
        int index = b2 & 15;
        return (char) A0H[index];
    }

    private List<C0707Ga> A05() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.A0B.size(); i2++) {
            C0707Ga c0707GaA06 = this.A0B.get(i2).A06();
            if (c0707GaA06 != null) {
                arrayList.add(c0707GaA06);
            }
        }
        return arrayList;
    }

    private void A06() {
        this.A04.A0A(this.A02);
        this.A0B.clear();
        this.A0B.add(this.A04);
    }

    private void A09(byte b2) {
        this.A04.A09(' ');
        this.A04.A0F((b2 >> 1) & 7, (b2 & 1) == 1);
    }

    private void A0A(byte b2) {
        if (b2 == 32) {
            A0C(2);
            return;
        }
        String[] strArr = A0D;
        if (strArr[4].length() == strArr[7].length()) {
            String[] strArr2 = A0D;
            strArr2[1] = "VpP0XbxTm16oYjwBPQX9pkQBfCeMI0LC";
            strArr2[5] = "MOPRimaIhpXtOf0evsEmKI44xylzjAWv";
            if (b2 != 41) {
                switch (b2) {
                    case 37:
                        A0C(1);
                        A0D(2);
                        String[] strArr3 = A0D;
                        if (strArr3[3].charAt(24) == strArr3[6].charAt(24)) {
                            String[] strArr4 = A0D;
                            strArr4[4] = "Y";
                            strArr4[7] = "Z";
                            return;
                        }
                        break;
                    case 38:
                        A0C(1);
                        A0D(3);
                        return;
                    case 39:
                        A0C(1);
                        A0D(4);
                        return;
                    default:
                        int i2 = this.A02;
                        if (i2 == 0) {
                            return;
                        }
                        if (b2 == 33) {
                            this.A04.A07();
                            return;
                        }
                        if (b2 == 36) {
                            return;
                        }
                        switch (b2) {
                            case 44:
                                this.A05 = null;
                                if (i2 != 1 && i2 != 3) {
                                    return;
                                }
                                A06();
                                return;
                            case 45:
                                if (i2 != 1 || this.A04.A0G()) {
                                    return;
                                }
                                this.A04.A08();
                                return;
                            case 46:
                                A06();
                                return;
                            case 47:
                                this.A05 = A05();
                                A06();
                                return;
                            default:
                                return;
                        }
                }
            } else {
                A0C(3);
                return;
            }
        }
        throw new RuntimeException();
    }

    private void A0B(byte b2, byte b3) {
        int i2 = A0G[b2 & 7];
        if ((b3 & 32) != 0) {
            i2++;
        }
        if (i2 != this.A04.A05()) {
            int i3 = this.A02;
            String[] strArr = A0D;
            if (strArr[3].charAt(24) != strArr[6].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[2] = "0Lleg";
            strArr2[0] = "zZ088";
            if (i3 != 1 && !this.A04.A0G()) {
                this.A04 = new C0714Gh(this.A02, this.A03);
                this.A0B.add(this.A04);
            }
            this.A04.A0D(i2);
        }
        boolean z = (b3 & DateTimeFieldType.CLOCKHOUR_OF_DAY) == 16;
        int i4 = (b3 >> 1) & 7;
        this.A04.A0F(z ? 8 : i4, (b3 & 1) == 1);
        if (z) {
            this.A04.A0C(A0F[i4]);
        }
    }

    private void A0C(int i2) {
        if (this.A02 == i2) {
            return;
        }
        int i3 = this.A02;
        this.A02 = i2;
        A06();
        if (i3 == 3 || i2 == 1 || i2 == 0) {
            this.A05 = null;
        }
    }

    private void A0D(int i2) {
        this.A03 = i2;
        this.A04.A0B(i2);
    }

    public static boolean A0E(byte b2) {
        return (b2 & 240) == 16;
    }

    private boolean A0F(byte b2, byte b3) {
        boolean zA0E = A0E(b2);
        if (zA0E) {
            if (this.A07 && this.A00 == b2 && this.A01 == b3) {
                this.A07 = false;
                return true;
            }
            this.A07 = true;
            this.A00 = b2;
            this.A01 = b3;
        }
        if (A0G(b2, b3)) {
            A09(b3);
        } else if (A0I(b2, b3)) {
            A0B(b2, b3);
        } else if (A0J(b2, b3)) {
            this.A04.A0E(b3 - 32);
        } else if (A0H(b2, b3)) {
            A0A(b3);
        }
        return zA0E;
    }

    public static boolean A0G(byte b2, byte b3) {
        return (b2 & 247) == 17 && (b3 & 240) == 32;
    }

    public static boolean A0H(byte b2, byte b3) {
        return (b2 & 247) == 20 && (b3 & 240) == 32;
    }

    public static boolean A0I(byte b2, byte b3) {
        return (b2 & 240) == 16 && (b3 & 192) == 64;
    }

    public static boolean A0J(byte b2, byte b3) {
        return (b2 & 247) == 23 && b3 >= 33 && b3 <= 35;
    }

    @Override // com.facebook.ads.redexgen.X.AQ
    public final InterfaceC0708Gb A0N() {
        List<C0707Ga> list = this.A05;
        this.A06 = list;
        return new C1269au(list);
    }

    @Override // com.facebook.ads.redexgen.X.AQ
    /* JADX INFO: renamed from: A0O */
    public final /* bridge */ /* synthetic */ C0580Al A4i() throws C0709Gc {
        return super.A4i();
    }

    @Override // com.facebook.ads.redexgen.X.AQ
    /* JADX INFO: renamed from: A0P */
    public final /* bridge */ /* synthetic */ AW A4j() throws C0709Gc {
        return super.A4j();
    }

    @Override // com.facebook.ads.redexgen.X.AQ
    /* JADX INFO: renamed from: A0Q */
    public final /* bridge */ /* synthetic */ void ABz(C0580Al c0580Al) throws C0709Gc {
        super.ABz(c0580Al);
    }

    @Override // com.facebook.ads.redexgen.X.AQ
    public final void A0R(C0580Al c0580Al) {
        this.A0A.A0c(c0580Al.A01.array(), c0580Al.A01.limit());
        boolean z = false;
        boolean zA0F = false;
        while (true) {
            int iA05 = this.A0A.A05();
            int i2 = this.A08;
            if (iA05 >= i2) {
                byte bA0F = i2 == 2 ? (byte) -4 : (byte) this.A0A.A0F();
                byte bA0F2 = (byte) (this.A0A.A0F() & 127);
                byte bA0F3 = (byte) (this.A0A.A0F() & 127);
                if ((bA0F & 6) == 4 && (this.A09 != 1 || (bA0F & 1) == 0)) {
                    if (this.A09 != 2 || (bA0F & 1) == 1) {
                        if (bA0F2 != 0 || bA0F3 != 0) {
                            z = true;
                            if ((bA0F2 & 247) == 17 && (bA0F3 & 240) == 48) {
                                C0714Gh c0714Gh = this.A04;
                                char cA03 = A03(bA0F3);
                                String[] strArr = A0D;
                                if (strArr[4].length() != strArr[7].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A0D;
                                strArr2[4] = "p";
                                strArr2[7] = "B";
                                c0714Gh.A09(cA03);
                            } else if ((bA0F2 & 246) == 18 && (bA0F3 & 224) == 32) {
                                this.A04.A07();
                                int i3 = bA0F2 & 1;
                                String[] strArr3 = A0D;
                                if (strArr3[4].length() != strArr3[7].length()) {
                                    String[] strArr4 = A0D;
                                    strArr4[2] = "9HiUv";
                                    strArr4[0] = "jgZGy";
                                    if (i3 == 0) {
                                        this.A04.A09(A01(bA0F3));
                                    } else {
                                        this.A04.A09(A02(bA0F3));
                                    }
                                } else {
                                    String[] strArr5 = A0D;
                                    strArr5[3] = "JTanLGl8juahhTvO0cevOVMW4Tf5Dblj";
                                    strArr5[6] = "p0GbhYKTQLQ9v5Vn33otxdnR4fUxZFvy";
                                    if (i3 == 0) {
                                        this.A04.A09(A01(bA0F3));
                                    } else {
                                        this.A04.A09(A02(bA0F3));
                                    }
                                }
                            } else if ((bA0F2 & 224) == 0) {
                                zA0F = A0F(bA0F2, bA0F3);
                            } else {
                                this.A04.A09(A00(bA0F2));
                                if ((bA0F3 & 224) != 0) {
                                    this.A04.A09(A00(bA0F3));
                                }
                            }
                        }
                    }
                }
            } else {
                if (z) {
                    if (!zA0F) {
                        this.A07 = false;
                    }
                    int i4 = this.A02;
                    if (i4 == 1 || i4 == 3) {
                        this.A05 = A05();
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AQ
    public final boolean A0T() {
        return this.A05 != this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.AQ, com.facebook.ads.redexgen.X.BY
    public final void ACG() {
    }

    @Override // com.facebook.ads.redexgen.X.AQ, com.facebook.ads.redexgen.X.InterfaceC1265aq
    public final /* bridge */ /* synthetic */ void AD7(long j2) {
        super.AD7(j2);
    }

    @Override // com.facebook.ads.redexgen.X.AQ, com.facebook.ads.redexgen.X.BY
    public final void flush() {
        super.flush();
        this.A05 = null;
        this.A06 = null;
        A0C(0);
        A0D(4);
        A06();
        this.A07 = false;
        this.A00 = (byte) 0;
        this.A01 = (byte) 0;
    }
}
