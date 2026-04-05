package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RunnableC04173q implements Runnable {
    public static Comparator<C04163p> A04;
    public static byte[] A05;
    public static String[] A06;
    public static final ThreadLocal<RunnableC04173q> A07;
    public long A00;
    public long A01;
    public ArrayList<C0660Eb> A02 = new ArrayList<>();
    public ArrayList<C04163p> A03 = new ArrayList<>();

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{97, 101, 47, 93, 116, -126, -125, 116, 115, 47, 95, -127, 116, 117, 116, -125, 114, 119, 92, 96, 42, 90, 124, 111, 112, 111, 126, 109, 114};
    }

    public static void A04() {
        A06 = new String[]{"C", "g", "thIgEQWd9nx", "UJ", "nKFIv9xSQBz", "WKzZJ6F0j2u08DpGCnjDR9E", "2Nt4JwZoKXCf4OpJNcF1oxTto7W5gJbD", "RW"};
    }

    static {
        A04();
        A03();
        A07 = new ThreadLocal<>();
        A04 = new Comparator<C04163p>() { // from class: com.facebook.ads.redexgen.X.3o
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(C04163p c04163p, C04163p c04163p2) {
                if ((c04163p.A03 == null) != (c04163p2.A03 == null)) {
                    return c04163p.A03 == null ? 1 : -1;
                }
                if (c04163p.A04 != c04163p2.A04) {
                    return c04163p.A04 ? -1 : 1;
                }
                int i2 = c04163p2.A02 - c04163p.A02;
                if (i2 != 0) {
                    return i2;
                }
                int i3 = c04163p.A00 - c04163p2.A00;
                if (i3 != 0) {
                    return i3;
                }
                return 0;
            }
        };
    }

    private C4X A00(C0660Eb c0660Eb, int i2, long j2) {
        if (A09(c0660Eb, i2)) {
            return null;
        }
        C4N c4n = c0660Eb.A0r;
        try {
            c0660Eb.A1M();
            C4X c4xA0J = c4n.A0J(i2, false, j2);
            if (c4xA0J != null) {
                if (c4xA0J.A0b() && !c4xA0J.A0c()) {
                    c4n.A0Y(c4xA0J.A0H);
                } else {
                    c4n.A0e(c4xA0J, false);
                }
            }
            return c4xA0J;
        } finally {
            c0660Eb.A1r(false);
        }
    }

    private void A02() {
        C04163p task;
        int i2 = this.A02.size();
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            C0660Eb c0660Eb = this.A02.get(i4);
            int totalTaskCount = c0660Eb.getWindowVisibility();
            if (totalTaskCount == 0) {
                c0660Eb.A02.A05(c0660Eb, false);
                int totalTaskCount2 = c0660Eb.A02.A00;
                i3 += totalTaskCount2;
            }
        }
        this.A03.ensureCapacity(i3);
        int i5 = 0;
        String[] strArr = A06;
        String str = strArr[3];
        String str2 = strArr[7];
        int length = str.length();
        int totalTaskCount3 = str2.length();
        if (length != totalTaskCount3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[3] = "OH";
        strArr2[7] = "7S";
        for (int i6 = 0; i6 < i2; i6++) {
            C0660Eb c0660Eb2 = this.A02.get(i6);
            int totalTaskCount4 = c0660Eb2.getWindowVisibility();
            if (totalTaskCount4 == 0) {
                C1024So c1024So = c0660Eb2.A02;
                int iAbs = Math.abs(c1024So.A01) + Math.abs(c1024So.A02);
                for (int i7 = 0; i7 < c1024So.A00 * 2; i7 += 2) {
                    if (i5 >= this.A03.size()) {
                        task = new C04163p();
                        this.A03.add(task);
                    } else {
                        task = this.A03.get(i5);
                    }
                    int j2 = i7 + 1;
                    int i8 = c1024So.A03[j2];
                    task.A04 = i8 <= iAbs;
                    task.A02 = iAbs;
                    task.A00 = i8;
                    task.A03 = c0660Eb2;
                    int j3 = c1024So.A03[i7];
                    task.A01 = j3;
                    i5++;
                }
            }
        }
        Collections.sort(this.A03, A04);
    }

    private void A05(long j2) {
        for (int i2 = 0; i2 < this.A03.size(); i2++) {
            C04163p c04163p = this.A03.get(i2);
            if (c04163p.A03 == null) {
                return;
            }
            A07(c04163p, j2);
            c04163p.A00();
        }
    }

    private final void A06(long j2) {
        A02();
        A05(j2);
    }

    private void A07(C04163p c04163p, long j2) {
        C4X c4xA00 = A00(c04163p.A03, c04163p.A01, c04163p.A04 ? Long.MAX_VALUE : j2);
        if (c4xA00 != null && c4xA00.A09 != null && c4xA00.A0b() && !c4xA00.A0c()) {
            A08(c4xA00.A09.get(), j2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(@androidx.annotation.Nullable com.facebook.ads.redexgen.X.C0660Eb r7, long r8) {
        /*
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            boolean r0 = r7.A0C
            if (r0 == 0) goto L2b
            com.facebook.ads.redexgen.X.3d r3 = r7.A01
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.RunnableC04173q.A06
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 17
            if (r1 == r0) goto L7c
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.RunnableC04173q.A06
            java.lang.String r1 = "t2x0aSlbBonOFe0N5m1ttILNz4IaYpUW"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "t2x0aSlbBonOFe0N5m1ttILNz4IaYpUW"
            r0 = 6
            r2[r0] = r1
            int r0 = r3.A07()
            if (r0 == 0) goto L2b
            r7.A1P()
        L2b:
            com.facebook.ads.redexgen.X.So r4 = r7.A02
            r0 = 1
            r4.A05(r7, r0)
            int r0 = r4.A00
            if (r0 == 0) goto L7b
            r2 = 0
            r1 = 18
            r0 = 7
            java.lang.String r0 = A01(r2, r1, r0)     // Catch: java.lang.Throwable -> L73
            com.facebook.ads.redexgen.X.C2H.A01(r0)     // Catch: java.lang.Throwable -> L73
            com.facebook.ads.redexgen.X.4U r1 = r7.A0s     // Catch: java.lang.Throwable -> L73
            com.facebook.ads.redexgen.X.43 r0 = r7.A04     // Catch: java.lang.Throwable -> L73
            r1.A05(r0)     // Catch: java.lang.Throwable -> L73
            r3 = 0
        L48:
            int r0 = r4.A00     // Catch: java.lang.Throwable -> L73
            int r5 = r0 * 2
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.RunnableC04173q.A06
            r0 = 6
            r1 = r1[r0]
            r0 = 8
            char r1 = r1.charAt(r0)
            r0 = 73
            if (r1 == r0) goto L7c
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.RunnableC04173q.A06
            java.lang.String r1 = "nG"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "TD"
            r0 = 7
            r2[r0] = r1
            if (r3 >= r5) goto L78
            int[] r0 = r4.A03     // Catch: java.lang.Throwable -> L73
            r0 = r0[r3]     // Catch: java.lang.Throwable -> L73
            r6.A00(r7, r0, r8)     // Catch: java.lang.Throwable -> L73
            int r3 = r3 + 2
            goto L48
        L73:
            r0 = move-exception
            com.facebook.ads.redexgen.X.C2H.A00()
            throw r0
        L78:
            com.facebook.ads.redexgen.X.C2H.A00()
        L7b:
            return
        L7c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.RunnableC04173q.A08(com.facebook.ads.redexgen.X.Eb, long):void");
    }

    public static boolean A09(C0660Eb c0660Eb, int i2) {
        int iA07 = c0660Eb.A01.A07();
        for (int i3 = 0; i3 < iA07; i3++) {
            View attachedView = c0660Eb.A01.A0B(i3);
            C4X c4xA0G = C0660Eb.A0G(attachedView);
            if (c4xA0G.A03 == i2 && !c4xA0G.A0c()) {
                return true;
            }
        }
        return false;
    }

    public final void A0A(C0660Eb c0660Eb) {
        this.A02.add(c0660Eb);
    }

    public final void A0B(C0660Eb c0660Eb) {
        this.A02.remove(c0660Eb);
    }

    public final void A0C(C0660Eb c0660Eb, int i2, int i3) {
        if (c0660Eb.isAttachedToWindow() && this.A01 == 0) {
            this.A01 = c0660Eb.getNanoTime();
            c0660Eb.post(this);
        }
        c0660Eb.A02.A04(i2, i3);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C2H.A01(A01(18, 11, 2));
            if (this.A02.isEmpty()) {
                return;
            }
            int size = this.A02.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C0660Eb c0660Eb = this.A02.get(i2);
                int i3 = c0660Eb.getWindowVisibility();
                if (i3 == 0) {
                    jMax = Math.max(c0660Eb.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.A01 = 0L;
                if (A06[5].length() == 17) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[5] = "H4nD1dOrFb1";
                strArr[5] = "H4nD1dOrFb1";
                C2H.A00();
                return;
            }
            long latestFrameVsyncMs = TimeUnit.MILLISECONDS.toNanos(jMax);
            A06(latestFrameVsyncMs + this.A00);
        } finally {
            this.A01 = 0L;
            C2H.A00();
        }
    }
}
