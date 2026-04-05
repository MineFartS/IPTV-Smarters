package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class aig extends aip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f19827a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f19828b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ave<Integer> f19829c = ave.b(ahx.f19758a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ave<Integer> f19830d = ave.b(ahx.f19760c);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference<aia> f19831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ahu f19832f;

    @Deprecated
    public aig() {
        aia aiaVar = aia.f19779a;
        throw null;
    }

    public aig(Context context) {
        ahu ahuVar = new ahu();
        aia aiaVarA = aia.a(context);
        super(null);
        this.f19832f = ahuVar;
        this.f19831e = new AtomicReference<>(aiaVarA);
    }

    public static int a(ke keVar, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(keVar.f22147c)) {
            return 4;
        }
        String strD = d(str);
        String strD2 = d(keVar.f22147c);
        if (strD2 == null || strD == null) {
            return (z && strD2 == null) ? 1 : 0;
        }
        if (strD2.startsWith(strD) || strD.startsWith(strD2)) {
            return 3;
        }
        return amn.ae(strD2, "-")[0].equals(amn.ae(strD, "-")[0]) ? 2 : 0;
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean e(int i2, boolean z) {
        int iD = fq.d(i2);
        if (iD != 4) {
            return z && iD == 3;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<java.lang.Integer> j(com.google.ads.interactivemedia.v3.internal.acr r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.f19202a
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L9:
            int r3 = r12.f19202a
            if (r2 >= r3) goto L17
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L9
        L17:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto La3
            if (r14 == r2) goto La3
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L22:
            int r5 = r12.f19202a
            if (r3 >= r5) goto L7d
            com.google.ads.interactivemedia.v3.internal.ke r5 = r12.b(r3)
            int r6 = r5.q
            if (r6 <= 0) goto L7a
            int r7 = r5.r
            if (r7 <= 0) goto L7a
            if (r15 == 0) goto L42
            r8 = 1
            if (r6 > r7) goto L39
            r9 = 0
            goto L3a
        L39:
            r9 = 1
        L3a:
            if (r13 > r14) goto L3d
            r8 = 0
        L3d:
            if (r9 == r8) goto L42
            r8 = r13
            r9 = r14
            goto L44
        L42:
            r9 = r13
            r8 = r14
        L44:
            int r10 = r6 * r8
            int r11 = r7 * r9
            if (r10 < r11) goto L54
            android.graphics.Point r7 = new android.graphics.Point
            int r6 = com.google.ads.interactivemedia.v3.internal.amn.b(r11, r6)
            r7.<init>(r9, r6)
            goto L5e
        L54:
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = com.google.ads.interactivemedia.v3.internal.amn.b(r10, r7)
            r6.<init>(r7, r8)
            r7 = r6
        L5e:
            int r6 = r5.q
            int r5 = r5.r
            int r8 = r6 * r5
            int r9 = r7.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r6 < r9) goto L7a
            int r6 = r7.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L7a
            if (r8 >= r4) goto L7a
            r4 = r8
        L7a:
            int r3 = r3 + 1
            goto L22
        L7d:
            if (r4 == r2) goto La3
            int r13 = r0.size()
            r14 = -1
            int r13 = r13 + r14
        L85:
            if (r13 < 0) goto La3
            java.lang.Object r15 = r0.get(r13)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            com.google.ads.interactivemedia.v3.internal.ke r15 = r12.b(r15)
            int r15 = r15.a()
            if (r15 == r14) goto L9d
            if (r15 <= r4) goto La0
        L9d:
            r0.remove(r13)
        La0:
            int r13 = r13 + (-1)
            goto L85
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aig.j(com.google.ads.interactivemedia.v3.internal.acr, int, int, boolean):java.util.List");
    }

    private static boolean k(ke keVar, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if ((keVar.f22149e & 16384) == 0 && e(i2, false) && (i2 & i3) != 0 && ((str == null || amn.O(keVar.f22156l, str)) && (((i12 = keVar.q) == -1 || (i8 <= i12 && i12 <= i4)) && ((i13 = keVar.r) == -1 || (i9 <= i13 && i13 <= i5))))) {
            float f2 = keVar.s;
            if ((f2 == -1.0f || (i10 <= f2 && f2 <= i6)) && (i14 = keVar.f22152h) != -1 && i11 <= i14 && i14 <= i7) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f A[LOOP:1: B:23:0x0041->B:65:0x017f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0226  */
    @Override // com.google.ads.interactivemedia.v3.internal.aip
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.google.ads.interactivemedia.v3.internal.ls[], com.google.ads.interactivemedia.v3.internal.aii[]> f(com.google.ads.interactivemedia.v3.internal.aik r40, int[][][] r41, int[] r42) {
        /*
            Method dump skipped, instruction units count: 1512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aig.f(com.google.ads.interactivemedia.v3.internal.aik, int[][][], int[]):android.util.Pair");
    }
}
