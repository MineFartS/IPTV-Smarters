package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04314f {
    public static byte[] A02;
    public static String[] A03;

    @VisibleForTesting
    public final SU<C4X, C04294d> A00 = new SU<>();

    @VisibleForTesting
    public final C2J<C4X> A01 = new C2J<>();

    static {
        A03();
        A02();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-99, -59, -61, -60, 112, -64, -62, -65, -58, -71, -76, -75, 112, -74, -68, -79, -73, 112, -96, -94, -107, 112, -65, -62, 112, -96, -97, -93, -92};
    }

    public static void A03() {
        A03 = new String[]{"WXpxlTya5H7kpLIT7UUfzIgXOYds4Vfk", "JVDNa5tAOP", "C1CZfaM4quGDjTOWU4x6KBGTC5pPu33J", "VymAVHyd", "K8p7KG0zsDoAf7GmBTiUCUpdPzk9iS4o", "MydLOSuorekD0WEADrXIrTB2aFx1Ufvf", "1zIVUT6Fxq52O6VZbnoN9TsXnO1jN3fj", "z9Q03TMU5lxkReREt3I6AE4mCa6N3G46"};
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r5 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        r3.A00 &= r9 ^ (-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r9 != 4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r5 = r3.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        r6 = r3.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (com.facebook.ads.redexgen.X.C04314f.A03[5].charAt(20) == 'R') goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C04314f.A03;
        r2[0] = "LDlhycQGZBtlD6IMRSONBH11SqKxQWfy";
        r2[6] = "DCgYh9gvbnrpKHe96mnmPCff01xTtOfJ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if ((r6 & 12) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        r7.A00.A0B(r4);
        com.facebook.ads.redexgen.X.C04294d.A02(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C04314f.A03;
        r2[7] = "9mfdPnfY5V3FVy8Q2gQ6uDsmmOIXndsz";
        r2[2] = "ekMjHGebRREBiMI4gT56rHDvbCCByAvd";
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
    
        if ((r6 & 12) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C04314f.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if (r2[7].charAt(19) == r2[2].charAt(19)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C04314f.A03;
        r2[1] = "AZoo0ocwP6";
        r2[3] = "Mxzo3dXJ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
    
        if (r9 != 8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
    
        r5 = r3.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00da, code lost:
    
        throw new java.lang.IllegalArgumentException(A01(0, 29, 9));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.ads.redexgen.X.C4A A00(com.facebook.ads.redexgen.X.C4X r8, int r9) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C04314f.A00(com.facebook.ads.redexgen.X.4X, int):com.facebook.ads.redexgen.X.4A");
    }

    @Nullable
    public final C4A A04(C4X c4x) {
        return A00(c4x, 8);
    }

    @Nullable
    public final C4A A05(C4X c4x) {
        return A00(c4x, 4);
    }

    public final C4X A06(long j2) {
        return this.A01.A08(j2);
    }

    public final void A07() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A08() {
        C04294d.A01();
    }

    public final void A09(long j2, C4X c4x) {
        this.A01.A0B(j2, c4x);
    }

    public final void A0A(C4X c4x) {
        C04294d c04294dA00 = this.A00.get(c4x);
        if (c04294dA00 == null) {
            c04294dA00 = C04294d.A00();
            this.A00.put(c4x, c04294dA00);
        }
        c04294dA00.A00 |= 1;
    }

    public final void A0B(C4X c4x) {
        C04294d c04294d = this.A00.get(c4x);
        if (c04294d == null) {
            return;
        }
        c04294d.A00 &= -2;
    }

    public final void A0C(C4X c4x) {
        int iA06 = this.A01.A06() - 1;
        while (true) {
            if (iA06 < 0) {
                break;
            }
            if (c4x == this.A01.A07(iA06)) {
                this.A01.A0A(iA06);
                break;
            }
            iA06--;
        }
        C04294d c04294dRemove = this.A00.remove(c4x);
        if (c04294dRemove != null) {
            C04294d.A02(c04294dRemove);
        }
    }

    public final void A0D(C4X c4x) {
        A0B(c4x);
    }

    public final void A0E(C4X c4x, C4A c4a) {
        C04294d c04294dA00 = this.A00.get(c4x);
        if (c04294dA00 == null) {
            c04294dA00 = C04294d.A00();
            this.A00.put(c4x, c04294dA00);
        }
        c04294dA00.A00 |= 2;
        c04294dA00.A02 = c4a;
    }

    public final void A0F(C4X c4x, C4A c4a) {
        C04294d c04294dA00 = this.A00.get(c4x);
        if (c04294dA00 == null) {
            c04294dA00 = C04294d.A00();
            this.A00.put(c4x, c04294dA00);
        }
        c04294dA00.A01 = c4a;
        c04294dA00.A00 |= 8;
    }

    public final void A0G(C4X c4x, C4A c4a) {
        C04294d c04294dA00 = this.A00.get(c4x);
        if (c04294dA00 == null) {
            c04294dA00 = C04294d.A00();
            this.A00.put(c4x, c04294dA00);
        }
        c04294dA00.A02 = c4a;
        c04294dA00.A00 |= 4;
    }

    public final void A0H(InterfaceC04304e interfaceC04304e) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            C4X c4xA0A = this.A00.A0A(size);
            C04294d c04294dA0B = this.A00.A0B(size);
            if ((c04294dA0B.A00 & 3) == 3) {
                interfaceC04304e.ADg(c4xA0A);
            } else if ((c04294dA0B.A00 & 1) != 0) {
                if (c04294dA0B.A02 == null) {
                    interfaceC04304e.ADg(c4xA0A);
                } else {
                    C4A c4a = c04294dA0B.A02;
                    C4A c4a2 = c04294dA0B.A01;
                    if (A03[5].charAt(20) == 'R') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A03;
                    strArr[1] = "fJVAe19tdP";
                    strArr[3] = "3fJsXDGb";
                    interfaceC04304e.ABs(c4xA0A, c4a, c4a2);
                }
            } else if ((c04294dA0B.A00 & 14) == 14) {
                interfaceC04304e.ABq(c4xA0A, c04294dA0B.A02, c04294dA0B.A01);
            } else if ((c04294dA0B.A00 & 12) == 12) {
                interfaceC04304e.ABu(c4xA0A, c04294dA0B.A02, c04294dA0B.A01);
            } else if ((c04294dA0B.A00 & 4) != 0) {
                interfaceC04304e.ABs(c4xA0A, c04294dA0B.A02, null);
            } else if ((c04294dA0B.A00 & 8) != 0) {
                interfaceC04304e.ABq(c4xA0A, c04294dA0B.A02, c04294dA0B.A01);
            }
            C04294d.A02(c04294dA0B);
        }
    }

    public final boolean A0I(C4X c4x) {
        C04294d c04294d = this.A00.get(c4x);
        return (c04294d == null || (c04294d.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0J(C4X c4x) {
        C04294d c04294d = this.A00.get(c4x);
        return (c04294d == null || (c04294d.A00 & 4) == 0) ? false : true;
    }
}
