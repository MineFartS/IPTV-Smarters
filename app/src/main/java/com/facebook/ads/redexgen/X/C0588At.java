package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.At, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0588At extends AbstractC1211Zx<C1257ai, GQ> {
    public static byte[] A00;
    public static String[] A01;

    static {
        A05();
        A04();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 34);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        byte[] bArr = {DateTimeFieldType.MILLIS_OF_SECOND, 51, 41, 41, 51, 52, 61, 122, 41, 63, 61, 55, 63, 52, 46, 122, 51, 52, 62, 63, 34, 76, 119, 123, 118, 108, 119, 125, 124, 125, 57, 106, 124, 126, 116, 124, 119, 109, 57, 112, 119, 125, 124, 97};
        if (A01[0].charAt(30) != 'S') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[2] = "5nBjUCgBMQ9PXdlRCTx";
        strArr[2] = "5nBjUCgBMQ9PXdlRCTx";
        A00 = bArr;
    }

    public static void A05() {
        A01 = new String[]{"8i9ut1dY0QoY2IeGLReHlEIW2BRjHZSP", "E", "lxixVbvIDCSA3NJrTyB", "QPmoMoC53Gbzxz6tTB", "QZOuGxTCk05HNgvLYFLVeb", "6KLfmRyk0kKt9", "HAIKc85yYcFyMypNoW", "0wjZl5OpTS4FxgeRBRX5Qn"};
    }

    public C0588At(Uri uri, List<GQ> list, C0667Ei c0667Ei) {
        super(uri, list, c0667Ei);
    }

    @Nullable
    public static GC A00(InterfaceC0740Hh interfaceC0740Hh, int i2, GP gp) throws InterruptedException, IOException {
        GC gcA05 = gp.A05();
        if (gcA05 != null) {
            return gcA05;
        }
        YX seekMap = GD.A00(interfaceC0740Hh, i2, gp);
        if (seekMap == null) {
            return null;
        }
        GC index = new C1253ae(seekMap, gp.A00);
        return index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1211Zx
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C1257ai A0B(InterfaceC0740Hh interfaceC0740Hh, Uri uri) throws IOException {
        return GD.A03(interfaceC0740Hh, uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000c */
    @Override // com.facebook.ads.redexgen.X.AbstractC1211Zx
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.facebook.ads.redexgen.X.Ek> A0C(com.facebook.ads.redexgen.X.InterfaceC0740Hh r15, com.facebook.ads.redexgen.X.C1257ai r16, boolean r17) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r14 = this;
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r5 = 0
        L6:
            r3 = r16
            int r0 = r3.A04()
            if (r5 >= r0) goto L5b
            com.facebook.ads.redexgen.X.GM r2 = r3.A06(r5)
            long r0 = r2.A00
            long r8 = com.facebook.ads.redexgen.X.C05639t.A00(r0)
            long r10 = r3.A05(r5)
            java.util.List<com.facebook.ads.redexgen.X.GI> r4 = r2.A02
            r3 = 0
        L1f:
            int r6 = r4.size()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0588At.A01
            r0 = 7
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L3b
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0588At.A01
            java.lang.String r1 = "e3ghKrxMSQ6HqMRjRDmm86"
            r0 = 7
            r2[r0] = r1
            java.lang.String r1 = "GNUD0jrDpFSalGqoPcVEYG"
            r0 = 4
            r2[r0] = r1
            if (r3 >= r6) goto L58
            java.lang.Object r7 = r4.get(r3)
            com.facebook.ads.redexgen.X.GI r7 = (com.facebook.ads.redexgen.X.GI) r7
            r12 = r17
            r6 = r15
            A07(r6, r7, r8, r10, r12, r13)
            int r3 = r3 + 1
            goto L1f
        L58:
            int r5 = r5 + 1
            goto L6
        L5b:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0588At.A0C(com.facebook.ads.redexgen.X.Hh, com.facebook.ads.redexgen.X.ai, boolean):java.util.List");
    }

    public static void A06(long j2, String str, GN gn, ArrayList<Ek> arrayList) {
        arrayList.add(new Ek(j2, new C0744Hl(gn.A04(str), gn.A02, gn.A01, null)));
    }

    public static void A07(InterfaceC0740Hh interfaceC0740Hh, GI gi, long j2, long j3, boolean z, ArrayList<Ek> arrayList) throws InterruptedException, IOException {
        GC gcA00;
        for (int i2 = 0; i2 < gi.A03.size(); i2++) {
            GP gp = gi.A03.get(i2);
            String[] strArr = A01;
            if (strArr[5].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "aUyUbDA09rzuSQKS45g";
            strArr2[2] = "aUyUbDA09rzuSQKS45g";
            GP gp2 = gp;
            try {
                gcA00 = A00(interfaceC0740Hh, gi.A01, gp2);
            } catch (IOException e2) {
                e = e2;
            }
            if (gcA00 != null) {
                int iA6w = gcA00.A6w(j3);
                if (iA6w != -1) {
                    String str = gp2.A03;
                    GN gnA06 = gp2.A06();
                    if (gnA06 != null) {
                        A06(j2, str, gnA06, arrayList);
                    }
                    GN gnA07 = gp2.A07();
                    if (gnA07 != null) {
                        A06(j2, str, gnA07, arrayList);
                    }
                    long j4 = gcA00.A6L();
                    long j5 = (((long) iA6w) + j4) - 1;
                    while (true) {
                        String[] strArr3 = A01;
                        if (strArr3[5].length() == strArr3[1].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr4 = A01;
                        strArr4[3] = "nZV1IQGtD66yoZygtH";
                        strArr4[6] = "WDe10iMZIQl11SF1C1";
                        if (j4 <= j5) {
                            A06(j2 + gcA00.A7B(j4), str, gcA00.A6x(j4), arrayList);
                            j4++;
                        }
                    }
                } else {
                    throw new EM(A02(21, 23, 59));
                }
            } else {
                try {
                    throw new EM(A02(0, 21, 120));
                } catch (IOException e3) {
                    e = e3;
                    if (!z) {
                        throw e;
                    }
                }
            }
        }
    }
}
