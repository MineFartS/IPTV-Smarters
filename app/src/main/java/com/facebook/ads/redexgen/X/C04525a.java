package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04525a {
    public static byte[] A00;
    public static String[] A01;
    public static final AtomicReference<C5Y> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-98, -90, -95, -100, -84, -77, -94, -81, -81, -90, -95, -94, -95, -97, -88, -97, -84, -93, -99, -20, -25, -23, -28, -30, -14, -7, -24, -11, -11, -20, -25, -24};
    }

    public static void A06() {
        A01 = new String[]{"zJ7sRo3sU3MwvYkxVq5sKXU", "uwqdBBQkb", "sk1pAaPClwmr1DZFuM4XEVJDjMgj4luU", "2DEAuAVf", "LM1sVeBw6DNfIdZzIYsj5hqYQDPEhJFy", "hYSBjzGCwuKpFZFqojmwIwdxMJLMCyYz", "BWOi5Qn34m6VEGTMmYfzcDYeX0GTjOOy", "rscTiGR64sMWr7IEiXLU0M2EjoTwZlLg"};
    }

    static {
        A06();
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 68));
    }

    public static C5Y A00() {
        C5Y c5y = A02.get();
        if (A01[6].charAt(15) == 'M') {
            String[] strArr = A01;
            strArr[3] = "GQnQs3ZS";
            strArr[1] = "yTwJu7KeR";
            C5Y c5y2 = c5y;
            if (c5y2 == null) {
                C5Y c5yA00 = C5Y.A00();
                String[] strArr2 = A01;
                if (strArr2[3].length() != strArr2[1].length()) {
                    String[] strArr3 = A01;
                    strArr3[0] = "yvynwBtI7EoQ7kGRkYf58OE";
                    strArr3[0] = "yvynwBtI7EoQ7kGRkYf58OE";
                    return c5yA00;
                }
            } else {
                return c5y2;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L5;
     */
    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C5Y A01(com.facebook.ads.redexgen.X.C8C r5, com.facebook.ads.redexgen.X.C5Y r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L28
        Lc:
            com.facebook.ads.redexgen.X.5Y r0 = com.facebook.ads.redexgen.X.C04575g.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.8c r5 = r5.A04()
            int r4 = com.facebook.ads.redexgen.X.C05228d.A17
            com.facebook.ads.redexgen.X.8e r3 = new com.facebook.ads.redexgen.X.8e
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 6
            java.lang.String r0 = A04(r2, r1, r0)
            r5.A86(r0, r4, r3)
        L28:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C04525a.A01(com.facebook.ads.redexgen.X.8C, com.facebook.ads.redexgen.X.5Y):com.facebook.ads.redexgen.X.5Y");
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static C5Y A02(C8C c8c, C5Y c5y, C5Z c5z) {
        C04535b c04535bA00 = null;
        try {
            if (JS.A07(c8c) && (c5y == null || TextUtils.isEmpty(c5y.A03()))) {
                c04535bA00 = C04545c.A00(c8c.getContentResolver());
            }
        } catch (Throwable th) {
            c8c.A04().A86(A04(12, 7, 6), C05228d.A19, new C05238e(th));
        }
        if (c04535bA00 != null && c04535bA00.A01 != null) {
            A03.set(c04535bA00.A01);
            c5z.A05(c04535bA00.A01);
        }
        if (c5y == null && c04535bA00 != null && !TextUtils.isEmpty(c04535bA00.A00)) {
            return new C5Y(c04535bA00.A00, c04535bA00.A02, C5X.A05);
        }
        return c5y;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 68);
        }
        return attributionId;
    }

    public static void A07(C5Z c5z) {
        A02.set(c5z.A02());
        A03.set(c5z.A03());
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A08(C8C c8c) {
        long jA01;
        C5Y upToDateAdInfo;
        try {
            C5Z c5z = new C5Z(c8c);
            A07(c5z);
            if (A09()) {
                return;
            }
            C5Y c5y = A02.get();
            if (c5y != null && !TextUtils.isEmpty(c5y.A03())) {
                jA01 = c5y.A01();
            } else {
                jA01 = -1;
            }
            if (jA01 > 0 && System.currentTimeMillis() - jA01 < JS.A00(c8c)) {
                return;
            }
            if (JS.A08(c8c)) {
                upToDateAdInfo = A01(c8c, A02(c8c, null, c5z));
            } else {
                upToDateAdInfo = A02(c8c, A01(c8c, null), c5z);
            }
            if (upToDateAdInfo != null && !TextUtils.isEmpty(upToDateAdInfo.A03())) {
                A02.set(upToDateAdInfo);
                c5z.A04(upToDateAdInfo);
            }
        } catch (Throwable th) {
            c8c.A04().A86(A04(12, 7, 6), C05228d.A18, new C05238e(th));
        }
    }

    public static boolean A09() {
        boolean updated = false;
        if (LI.A04()) {
            if (A01[0].length() != 23) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "OqjdKmMb";
            strArr[1] = "Sbvi0a9C0";
            String strA04 = A04(0, 12, 9);
            if (LI.A05(strA04)) {
                A03.set(LI.A01(strA04));
                updated = true;
            }
        }
        boolean zA04 = LI.A04();
        String[] strArr2 = A01;
        if (strArr2[5].charAt(29) != strArr2[4].charAt(29)) {
            String[] strArr3 = A01;
            strArr3[6] = "1QSggKSi3jrfAw1MbHCsavUz8mNGSj1M";
            strArr3[6] = "1QSggKSi3jrfAw1MbHCsavUz8mNGSj1M";
            if (!zA04) {
                return updated;
            }
        } else {
            String[] strArr4 = A01;
            strArr4[6] = "SqTb5lTJEle7YRZML8ItyxwGEN07wws1";
            strArr4[6] = "SqTb5lTJEle7YRZML8ItyxwGEN07wws1";
            if (!zA04) {
                return updated;
            }
        }
        String strA042 = A04(19, 13, 79);
        if (LI.A05(strA042)) {
            String strA01 = LI.A01(strA042);
            AtomicReference<C5Y> atomicReference = A02;
            if (strA01 == null) {
                strA01 = A04(0, 0, 68);
            }
            atomicReference.set(new C5Y(strA01, false, C5X.A04));
            return true;
        }
        return updated;
    }
}
