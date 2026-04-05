package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZY implements CF {
    public static byte[] A0C;
    public static String[] A0D;
    public static final CI A0E;
    public static final long A0F;
    public static final long A0G;
    public static final long A0H;
    public int A00;
    public int A01;
    public CH A02;
    public InterfaceC0635Da A03;
    public boolean A04;
    public final int A05;
    public final SparseArray<InterfaceC0635Da> A06;
    public final SparseBooleanArray A07;
    public final SparseIntArray A08;
    public final DY A09;
    public final C0768Il A0A;
    public final List<C0780Ix> A0B;

    public static String A0D(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0G() {
        A0C = new byte[]{-90, -88, -110, -104, -12, DateTimeFieldType.MINUTE_OF_DAY, 31, 31, 32, 37, -47, DateTimeFieldType.MILLIS_OF_SECOND, 26, 31, DateTimeFieldType.SECOND_OF_MINUTE, -47, 36, 42, 31, DateTimeFieldType.SECOND_OF_DAY, -47, DateTimeFieldType.MINUTE_OF_HOUR, 42, 37, DateTimeFieldType.MILLIS_OF_DAY, -33, -47, -2, 32, 36, 37, -47, 29, 26, 28, DateTimeFieldType.MILLIS_OF_DAY, 29, 42, -47, 31, 32, 37, -47, DateTimeFieldType.MINUTE_OF_DAY, -47, 5, 35, DateTimeFieldType.MINUTE_OF_DAY, 31, 36, 33, 32, 35, 37, -47, 4, 37, 35, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 30, -33, -98, -102, -100, -116, -61, -64, -47, -66};
    }

    public static void A0H() {
        A0D = new String[]{"1wQJeguTcmzEzlcqQISF6uciTtBYCHEI", "1z5HoD8RnfRsH4NGqOJrgtDb3AvWKmRf", "OZb5z3fyn7DmUcX5PD2FSiUNDYO3SJGv", "xysXnf11fptxvGLEVlqKxNXP96VBbPb9", "B9gj7Y4phCIGiISa5KNqUW4wq7x20Uai", "0XWjmjuElj7dnGBGcTqheWJCaJtkSIxV", "xem2h", "3rpnxRNe64JCaC2IexlmS1y9p5GeiPOv"};
    }

    static {
        A0H();
        A0G();
        A0E = new ZV();
        A0F = J1.A08(A0D(0, 4, 26));
        A0G = J1.A08(A0D(62, 4, 14));
        A0H = J1.A08(A0D(66, 4, 48));
    }

    public ZY() {
        this(0);
    }

    public ZY(int i2) {
        this(1, i2);
    }

    public ZY(int i2, int i3) {
        this(i2, new C0780Ix(0L), new ZH(i3));
    }

    public ZY(int i2, C0780Ix c0780Ix, DY dy) {
        this.A09 = (DY) IM.A01(dy);
        this.A05 = i2;
        if (i2 == 1 || i2 == 2) {
            this.A0B = Collections.singletonList(c0780Ix);
        } else {
            this.A0B = new ArrayList();
            this.A0B.add(c0780Ix);
        }
        this.A0A = new C0768Il(new byte[9400], 0);
        this.A07 = new SparseBooleanArray();
        this.A06 = new SparseArray<>();
        this.A08 = new SparseIntArray();
        A0F();
    }

    public static /* synthetic */ int A01(ZY zy) {
        int i2 = zy.A01;
        zy.A01 = i2 + 1;
        return i2;
    }

    private void A0F() {
        this.A07.clear();
        this.A06.clear();
        SparseArray<InterfaceC0635Da> sparseArrayA4K = this.A09.A4K();
        int size = sparseArrayA4K.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.A06.put(sparseArrayA4K.keyAt(i2), sparseArrayA4K.valueAt(i2));
        }
        this.A06.put(0, new ZT(new ZW(this)));
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void A7V(CH ch) {
        this.A02 = ch;
        ch.ACn(new C1167Yc(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0117, code lost:
    
        if (r8 == r9) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
    
        r13.A0A.A0Z(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011f, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0125, code lost:
    
        if (r8 == r9) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0128, code lost:
    
        r0 = r8 + 1;
        r8 = r0 & 15;
        r1 = com.facebook.ads.redexgen.X.ZY.A0D[1].charAt(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0138, code lost:
    
        if (r1 == 72) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013f, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0140, code lost:
    
        r2 = com.facebook.ads.redexgen.X.ZY.A0D;
        r2[3] = "dSZ0cSzoMmmORQANAKDw4NsHeD3mI6Jb";
        r2[3] = "dSZ0cSzoMmmORQANAKDw4NsHeD3mI6Jb";
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
    
        if (r9 == r8) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014e, code lost:
    
        r3.ACl();
     */
    @Override // com.facebook.ads.redexgen.X.CF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int AC0(com.facebook.ads.redexgen.X.CG r14, com.facebook.ads.redexgen.X.CM r15) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZY.AC0(com.facebook.ads.redexgen.X.CG, com.facebook.ads.redexgen.X.CM):int");
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void ACm(long j2, long j3) {
        int size = this.A0B.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.A0B.get(i2).A09();
        }
        this.A0A.A0W();
        this.A08.clear();
        A0F();
        this.A00 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        r3 = r3 + 1;
     */
    @Override // com.facebook.ads.redexgen.X.CF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean ADK(com.facebook.ads.redexgen.X.CG r8) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r7 = this;
            com.facebook.ads.redexgen.X.Il r0 = r7.A0A
            byte[] r5 = r0.A00
            r4 = 0
            r0 = 940(0x3ac, float:1.317E-42)
            r8.ABc(r5, r4, r0)
            r3 = 0
        Lb:
            r6 = 188(0xbc, float:2.63E-43)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.ZY.A0D
            r0 = 1
            r1 = r1[r0]
            r0 = 3
            char r1 = r1.charAt(r0)
            r0 = 72
            if (r1 == r0) goto L21
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L21:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.ZY.A0D
            java.lang.String r1 = "vUfHgSsJvwNFwwToyev4j8iiTP0xmLzC"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "vUfHgSsJvwNFwwToyev4j8iiTP0xmLzC"
            r0 = 1
            r2[r0] = r1
            if (r3 >= r6) goto L47
            r2 = 0
        L30:
            r0 = 5
            if (r2 != r0) goto L38
            r8.ADJ(r3)
            r0 = 1
            return r0
        L38:
            int r0 = r2 * 188
            int r0 = r0 + r3
            r1 = r5[r0]
            r0 = 71
            if (r1 == r0) goto L44
            int r3 = r3 + 1
            goto Lb
        L44:
            int r2 = r2 + 1
            goto L30
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZY.ADK(com.facebook.ads.redexgen.X.CG):boolean");
    }
}
