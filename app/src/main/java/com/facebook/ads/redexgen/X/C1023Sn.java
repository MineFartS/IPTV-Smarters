package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1023Sn implements InterfaceC04233x {
    public static byte[] A08;
    public static String[] A09;
    public int A00;
    public C2Q<C04013a> A01;
    public final C3Z A02;
    public final C04243y A03;
    public final Runnable A04;
    public final ArrayList<C04013a> A05;
    public final ArrayList<C04013a> A06;
    public final boolean A07;

    static {
        A04();
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{-100, -75, -78, -75, -74, -66, -75, 103, -68, -73, -85, -88, -69, -84, 103, -74, -73, 103, -69, -64, -73, -84, 103, -83, -74, -71, 103, -44, -45, -47, -34, -123, -41, -54, -46, -44, -37, -54, -123, -58, -45, -55, -123, -38, -43, -55, -58, -39, -54, -123, -44, -43, -40, -123, -56, -58, -45, -123, -57, -54, -123, -55, -50, -40, -43, -58, -39, -56, -51, -54, -55, -123, -50, -45, -123, -53, -50, -41, -40, -39, -123, -43, -58, -40, -40, -24, -23, -103, -20, -31, -24, -18, -27, -35, -103, -37, -34, -103, -21, -34, -26, -24, -17, -34, -103, -24, -21, -103, -18, -23, -35, -38, -19, -34, -89, 30, DateTimeFieldType.MINUTE_OF_HOUR, 26, 32, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -53, 25, 26, 31, -53, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_DAY, 30, 27, 12, 31, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_HOUR, -53, 12, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -53, 26, 29, -53, 24, 26, 33, DateTimeFieldType.CLOCKHOUR_OF_DAY, -53, DateTimeFieldType.HOUR_OF_DAY, 26, 29, -53, 27, 29, DateTimeFieldType.CLOCKHOUR_OF_DAY, -53, DateTimeFieldType.MILLIS_OF_SECOND, 12, 36, 26, 32, 31};
    }

    public static void A04() {
        A09 = new String[]{"X1JWoRd1RTsi5LXg3YfkE890Z0SkAp6s", "8cHG76lMVFwKxBGRg2kgut24eHhxfbd", "G9TzZa55JFGh4eGgvGtqHGY1m3qrW6LM", "T7A4lgHZzGr7V1uQcw7LfDSO4lerGRH7", "wT7nveBXif1G6UL4LkiEJi9kfhK", "XR1Jqmc9zxsTs7lfyBsyi3NvUHLKhP3K", "pVA6ZWYUVwE4UScIoRBBosOqE3FsfWwK", "nWmw"};
    }

    public C1023Sn(C3Z c3z) {
        this(c3z, false);
    }

    public C1023Sn(C3Z c3z, boolean z) {
        this.A01 = new SV(30);
        this.A05 = new ArrayList<>();
        this.A06 = new ArrayList<>();
        this.A00 = 0;
        this.A02 = c3z;
        this.A07 = z;
        this.A03 = new C04243y(this);
    }

    private int A00(int i2, int start) {
        int i3;
        int i4;
        for (int end = this.A06.size() - 1; end >= 0; end--) {
            C04013a c04013a = this.A06.get(end);
            if (c04013a.A00 == 8) {
                if (c04013a.A02 < c04013a.A01) {
                    i3 = c04013a.A02;
                    i4 = c04013a.A01;
                } else {
                    i3 = c04013a.A01;
                    i4 = c04013a.A02;
                }
                if (i2 >= i3 && i2 <= i4) {
                    if (i3 == c04013a.A02) {
                        if (start == 1) {
                            c04013a.A01++;
                        } else if (start == 2) {
                            c04013a.A01--;
                        }
                        i2++;
                    } else {
                        if (start == 1) {
                            c04013a.A02++;
                        } else if (start == 2) {
                            c04013a.A02--;
                        }
                        i2--;
                    }
                } else if (i2 < c04013a.A02) {
                    if (start == 1) {
                        c04013a.A02++;
                        c04013a.A01++;
                    } else if (start == 2) {
                        c04013a.A02--;
                        c04013a.A01--;
                    }
                }
            } else if (c04013a.A02 <= i2) {
                if (c04013a.A00 == 1) {
                    int i5 = c04013a.A01;
                    if (A09[7].length() != 4) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A09;
                    strArr[7] = "N0sU";
                    strArr[7] = "N0sU";
                    i2 -= i5;
                } else if (c04013a.A00 == 2) {
                    i2 += c04013a.A01;
                }
            } else if (start == 1) {
                c04013a.A02++;
            } else if (start == 2) {
                c04013a.A02--;
            }
        }
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            C04013a c04013a2 = this.A06.get(size);
            if (c04013a2.A00 == 8) {
                if (c04013a2.A01 == c04013a2.A02 || c04013a2.A01 < 0) {
                    this.A06.remove(size);
                    ACB(c04013a2);
                }
            } else if (c04013a2.A01 <= 0) {
                this.A06.remove(size);
                ACB(c04013a2);
            }
        }
        return i2;
    }

    private final int A01(int i2, int i3) {
        int size = this.A06.size();
        while (i3 < size) {
            C04013a c04013a = this.A06.get(i3);
            if (c04013a.A00 == 8) {
                if (c04013a.A02 == i2) {
                    i2 = c04013a.A01;
                } else {
                    if (c04013a.A02 < i2) {
                        i2--;
                    }
                    if (c04013a.A01 <= i2) {
                        i2++;
                    }
                }
            } else if (c04013a.A02 > i2) {
                continue;
            } else if (c04013a.A00 == 2) {
                if (i2 < c04013a.A02 + c04013a.A01) {
                    return -1;
                }
                i2 -= c04013a.A01;
            } else {
                int i4 = c04013a.A00;
                String[] strArr = A09;
                if (strArr[6].charAt(31) != strArr[5].charAt(31)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A09;
                strArr2[1] = "6d2Cvy1MfGwOem3AHh21iiz4RwVuOhP";
                strArr2[1] = "6d2Cvy1MfGwOem3AHh21iiz4RwVuOhP";
                if (i4 == 1) {
                    i2 += c04013a.A01;
                }
            }
            i3++;
        }
        return i2;
    }

    private void A05(C04013a c04013a) {
        A0A(c04013a);
    }

    private void A06(C04013a c04013a) {
        A0A(c04013a);
    }

    private void A07(C04013a c04013a) {
        int tmpEnd = c04013a.A02;
        int type = 0;
        int position = c04013a.A02 + c04013a.A01;
        byte b2 = -1;
        int i2 = c04013a.A02;
        while (i2 < position) {
            boolean z = false;
            if (this.A02.A58(i2) != null || A0D(i2)) {
                if (b2 == 0) {
                    A09(A8j(2, tmpEnd, type, null));
                    z = true;
                }
                b2 = 1;
            } else {
                if (b2 == 1) {
                    C04013a newOp = A8j(2, tmpEnd, type, null);
                    A0A(newOp);
                    z = true;
                }
                b2 = 0;
            }
            if (z) {
                i2 -= type;
                position -= type;
                type = 1;
            } else {
                type++;
            }
            i2++;
        }
        if (type != c04013a.A01) {
            ACB(c04013a);
            c04013a = A8j(2, tmpEnd, type, null);
        }
        if (b2 == 0) {
            A09(c04013a);
        } else {
            A0A(c04013a);
        }
    }

    private void A08(C04013a c04013a) {
        int tmpEnd = c04013a.A02;
        int type = 0;
        int position = c04013a.A02 + c04013a.A01;
        byte b2 = -1;
        int i2 = c04013a.A02;
        while (true) {
            String[] strArr = A09;
            if (strArr[6].charAt(31) != strArr[5].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[0] = "QVMb2fRXyzWHiAZPpRD1aZXDVthvAAWC";
            strArr2[0] = "QVMb2fRXyzWHiAZPpRD1aZXDVthvAAWC";
            if (i2 < position) {
                if (this.A02.A58(i2) != null || A0D(i2)) {
                    if (b2 == 0) {
                        A09(A8j(4, tmpEnd, type, c04013a.A03));
                        type = 0;
                        tmpEnd = i2;
                    }
                    b2 = 1;
                } else {
                    if (b2 == 1) {
                        C04013a newOp = A8j(4, tmpEnd, type, c04013a.A03);
                        A0A(newOp);
                        type = 0;
                        tmpEnd = i2;
                    }
                    b2 = 0;
                }
                type++;
                i2++;
            } else {
                if (type != c04013a.A01) {
                    Object obj = c04013a.A03;
                    ACB(c04013a);
                    c04013a = A8j(4, tmpEnd, type, obj);
                }
                if (b2 == 0) {
                    A09(c04013a);
                    return;
                } else {
                    A0A(c04013a);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A09(com.facebook.ads.redexgen.X.C04013a r12) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1023Sn.A09(com.facebook.ads.redexgen.X.3a):void");
    }

    private void A0A(C04013a c04013a) {
        this.A06.add(c04013a);
        int i2 = c04013a.A00;
        if (i2 == 1) {
            this.A02.A8k(c04013a.A02, c04013a.A01);
            return;
        }
        if (i2 == 2) {
            this.A02.A8n(c04013a.A02, c04013a.A01);
            return;
        }
        if (i2 == 4) {
            this.A02.A8W(c04013a.A02, c04013a.A01, c04013a.A03);
        } else {
            if (i2 == 8) {
                this.A02.A8l(c04013a.A02, c04013a.A01);
                return;
            }
            throw new IllegalArgumentException(A02(0, 27, 5) + c04013a);
        }
    }

    private final void A0B(C04013a c04013a, int i2) {
        this.A02.A9O(c04013a);
        int i3 = c04013a.A00;
        if (i3 == 2) {
            this.A02.A8m(i2, c04013a.A01);
        } else {
            if (i3 == 4) {
                this.A02.A8W(i2, c04013a.A01, c04013a.A03);
                return;
            }
            throw new IllegalArgumentException(A02(27, 58, 35));
        }
    }

    private final void A0C(List<C04013a> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ACB(list.get(i2));
        }
        list.clear();
    }

    private boolean A0D(int i2) {
        int size = this.A06.size();
        for (int pos = 0; pos < size; pos++) {
            C04013a c04013a = this.A06.get(pos);
            if (c04013a.A00 == 8) {
                if (A01(c04013a.A01, pos + 1) == i2) {
                    return true;
                }
            } else {
                int i3 = c04013a.A00;
                if (A09[4].length() == 28) {
                    throw new RuntimeException();
                }
                String[] strArr = A09;
                strArr[7] = "h3FT";
                strArr[7] = "h3FT";
                if (i3 == 1) {
                    int i4 = c04013a.A02 + c04013a.A01;
                    for (int i5 = c04013a.A02; i5 < i4; i5++) {
                        if (A01(i5, pos + 1) == i2) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public final int A0E(int i2) {
        return A01(i2, 0);
    }

    public final int A0F(int i2) {
        int size = this.A05.size();
        for (int i3 = 0; i3 < size; i3++) {
            C04013a c04013a = this.A05.get(i3);
            int i4 = c04013a.A00;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 8) {
                        if (c04013a.A02 == i2) {
                            i2 = c04013a.A01;
                        } else {
                            if (c04013a.A02 < i2) {
                                i2--;
                            }
                            if (c04013a.A01 <= i2) {
                                i2++;
                            }
                        }
                    }
                } else if (c04013a.A02 > i2) {
                    continue;
                } else {
                    if (c04013a.A02 + c04013a.A01 > i2) {
                        return -1;
                    }
                    i2 -= c04013a.A01;
                }
            } else if (c04013a.A02 <= i2) {
                i2 += c04013a.A01;
            }
        }
        return i2;
    }

    public final void A0G() {
        int size = this.A06.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.A02.A9Q(this.A06.get(i2));
        }
        A0C(this.A06);
        this.A00 = 0;
    }

    public final void A0H() {
        A0G();
        int size = this.A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            C04013a c04013a = this.A05.get(i2);
            int i3 = c04013a.A00;
            if (i3 == 1) {
                this.A02.A9Q(c04013a);
                C3Z c3z = this.A02;
                int i4 = c04013a.A02;
                int i5 = c04013a.A01;
                c3z.A8k(i4, i5);
            } else if (i3 == 2) {
                this.A02.A9Q(c04013a);
                C3Z c3z2 = this.A02;
                int i6 = c04013a.A02;
                int i7 = c04013a.A01;
                if (A09[0].charAt(28) != 'A') {
                    String[] strArr = A09;
                    strArr[0] = "CM7MK7KhSxDopOj0YrHNMoPSB3hYAvlM";
                    strArr[0] = "CM7MK7KhSxDopOj0YrHNMoPSB3hYAvlM";
                    c3z2.A8m(i6, i7);
                } else {
                    String[] strArr2 = A09;
                    strArr2[0] = "0a4GBd0juwjU6ZOPGBL8pgIRsQZTAwEC";
                    strArr2[0] = "0a4GBd0juwjU6ZOPGBL8pgIRsQZTAwEC";
                    c3z2.A8m(i6, i7);
                }
            } else if (i3 == 4) {
                this.A02.A9Q(c04013a);
                C3Z c3z3 = this.A02;
                int i8 = c04013a.A02;
                int i9 = c04013a.A01;
                if (A09[0].charAt(28) != 'A') {
                    throw new RuntimeException();
                }
                String[] strArr3 = A09;
                strArr3[1] = "6Qpi3zwbHCTXm3nhA4JhLro11ECL3LU";
                strArr3[1] = "6Qpi3zwbHCTXm3nhA4JhLro11ECL3LU";
                c3z3.A8W(i8, i9, c04013a.A03);
            } else if (i3 == 8) {
                this.A02.A9Q(c04013a);
                C3Z c3z4 = this.A02;
                int i10 = c04013a.A02;
                int i11 = c04013a.A01;
                c3z4.A8l(i10, i11);
            }
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
        }
        A0C(this.A05);
        this.A00 = 0;
    }

    public final void A0I() {
        this.A03.A06(this.A05);
        int size = this.A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            C04013a c04013a = this.A05.get(i2);
            int i3 = c04013a.A00;
            String[] strArr = A09;
            String str = strArr[6];
            String str2 = strArr[5];
            int i4 = str.charAt(31);
            if (i4 != str2.charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A09;
            strArr2[1] = "1BDdKJQJlsgxETOK14Gjs1hC7fjbuKK";
            strArr2[1] = "1BDdKJQJlsgxETOK14Gjs1hC7fjbuKK";
            if (i3 == 1) {
                A05(c04013a);
            } else if (i3 == 2) {
                A07(c04013a);
            } else if (i3 == 4) {
                A08(c04013a);
            } else if (i3 == 8) {
                A06(c04013a);
            }
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.A05.clear();
    }

    public final void A0J() {
        A0C(this.A05);
        A0C(this.A06);
        this.A00 = 0;
    }

    public final boolean A0K() {
        return this.A05.size() > 0;
    }

    public final boolean A0L() {
        return (this.A06.isEmpty() || this.A05.isEmpty()) ? false : true;
    }

    public final boolean A0M(int i2) {
        return (this.A00 & i2) != 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04233x
    public final C04013a A8j(int i2, int i3, int i4, Object obj) {
        C04013a c04013aA2P = this.A01.A2P();
        if (c04013aA2P == null) {
            return new C04013a(i2, i3, i4, obj);
        }
        c04013aA2P.A00 = i2;
        c04013aA2P.A02 = i3;
        c04013aA2P.A01 = i4;
        c04013aA2P.A03 = obj;
        return c04013aA2P;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04233x
    public final void ACB(C04013a c04013a) {
        if (!this.A07) {
            c04013a.A03 = null;
            this.A01.ACJ(c04013a);
        }
    }
}
