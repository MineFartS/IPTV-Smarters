package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1179Yo implements CF {
    public static byte[] A0p;
    public static String[] A0q;
    public static final CI A0r;
    public static final UUID A0s;
    public static final byte[] A0t;
    public static final byte[] A0u;
    public static final byte[] A0v;
    public static final byte[] A0w;
    public static final byte[] A0x;
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public CH A0N;
    public Cb A0O;
    public C0758Ib A0P;
    public C0758Ib A0Q;
    public ByteBuffer A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public int[] A0b;
    public final SparseArray<Cb> A0c;
    public final CX A0d;
    public final C0614Ce A0e;
    public final C0768Il A0f;
    public final C0768Il A0g;
    public final C0768Il A0h;
    public final C0768Il A0i;
    public final C0768Il A0j;
    public final C0768Il A0k;
    public final C0768Il A0l;
    public final C0768Il A0m;
    public final C0768Il A0n;
    public final boolean A0o;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0p, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0p = new byte[]{34, 108, 109, 118, 34, 113, 119, 114, 114, 109, 112, 118, 103, 102, 104, 125, 124, 41, 119, 104, 125, 127, 41, 119, 104, 125, 127, 41, 119, 104, 125, 127, 41, 84, 65, 67, DateTimeFieldType.SECOND_OF_MINUTE, 75, 84, 65, 67, DateTimeFieldType.SECOND_OF_MINUTE, 75, 84, 65, 67, DateTimeFieldType.SECOND_OF_MINUTE, 93, 84, 65, 66, DateTimeFieldType.SECOND_OF_MINUTE, 86, 82, 68, 68, 114, 99, 99, 126, 121, 112, 100, 84, 126, 103, 127, 114, 101, 90, 120, 115, 114, 55, 25, 7, 25, 25, 27, 55, 41, 55, 53, 69, 57, 39, 60, 44, 43, 73, 87, 76, 92, 91, 39, 77, 80, 88, 90, 77, 91, 91, 111, 113, 106, 122, 125, 1, 98, 97, 125, 125, 98, 107, 125, 125, 28, 2, 24, 28, 30, 110, 9, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HOUR_OF_HALFDAY, 4, 9, 11, 58, 36, 54, 43, 62, 60, 84, 55, 73, 80, 78, 92, 65, 84, 86, 62, 93, 34, 8, DateTimeFieldType.MILLIS_OF_DAY, 4, 26, 102, 8, 10, 4, 27, 5, DateTimeFieldType.SECOND_OF_MINUTE, 10, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 9, 37, 59, 52, 39, 41, 75, 45, 42, 48, 75, 40, 45, 48, 6, 24, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_DAY, 2, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 3, 74, 84, 93, 68, 89, 73, 66, 88, 88, 122, 117, 60, 111, 59, 104, 120, 122, 119, 126, 59, 111, 114, 118, 126, 120, 116, 127, 126, 59, 107, 105, 114, 116, 105, 59, 111, 116, 59, 111, 114, 118, 126, 120, 116, 127, 126, 72, 120, 122, 119, 126, 59, 121, 126, 114, 117, 124, 59, 104, 126, 111, 53, 34, DateTimeFieldType.HOUR_OF_HALFDAY, 12, 3, 8, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 8, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 6, 65, 4, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 2, DateTimeFieldType.MINUTE_OF_HOUR, 24, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 8, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 65, 0, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 5, 65, 2, DateTimeFieldType.HOUR_OF_HALFDAY, 12, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 4, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 8, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 65, 8, DateTimeFieldType.MINUTE_OF_DAY, 65, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_MINUTE, 65, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_MINUTE, 4, 5, 9, 37, 36, 62, 47, 36, 62, 9, 37, 39, 58, 11, 38, 45, 37, 106, 99, 79, 78, 84, 69, 78, 84, 101, 78, 67, 97, 76, 71, 79, 0, 79, 99, 98, 120, 105, 98, 120, 73, 98, 111, 99, 104, 101, 98, 107, 67, 126, 104, 105, 126, 44, 75, 103, 102, 124, 109, 102, 124, 77, 102, 107, 103, 108, 97, 102, 111, 91, 107, 103, 120, 109, 40, 40, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 56, DateTimeFieldType.SECOND_OF_MINUTE, 28, 9, 76, 1, 42, 38, DateTimeFieldType.HOUR_OF_DAY, 60, 53, 32, DateTimeFieldType.MILLIS_OF_SECOND, 32, 36, 33, DateTimeFieldType.MINUTE_OF_HOUR, 32, 55, 54, 44, 42, 43, 101, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 24, 25, 117, 57, 52, 54, 60, 59, 50, 117, 38, 52, 56, 37, 57, 48, 117, 38, 60, 47, 48, 117, 58, 32, 33, 117, 58, 51, 117, 39, 52, 59, 50, 48, 123, 74, 77, 66, 67, 93, 106, 110, 107, 89, 106, 125, 124, 102, 96, 97, 47, 61, DateTimeFieldType.MILLIS_OF_DAY, 27, 10, 1, 8, 12, 29, 28, 88, 44, 10, 25, 27, DateTimeFieldType.MINUTE_OF_HOUR, 88, 30, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 28, 88, 26, DateTimeFieldType.HALFDAY_OF_DAY, 12, 88, 59, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MILLIS_OF_DAY, 12, 29, DateTimeFieldType.MILLIS_OF_DAY, 12, 61, DateTimeFieldType.MILLIS_OF_DAY, 27, 51, 29, 1, 49, 60, 88, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 25, 11, 88, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 12, 88, 30, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 28, 95, 98, 110, 127, 116, 105, 115, 117, 116, 58, 120, 115, 110, 58, 115, 105, 58, 105, 127, 110, 58, 115, 116, 58, 105, 115, 125, 116, 123, 118, 58, 120, 99, 110, 127, 105, 64, 93, 66, 78, 91, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 124, 91, 78, 93, 91, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 106, 65, 75, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 125, 74, 78, 75, 96, 93, 75, 74, 93, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 99, 78, 86, 74, 93, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 124, 91, 86, 67, 74, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 97, 78, 66, 74, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 98, 78, 93, 72, 70, 65, 99, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 98, 78, 93, 72, 70, 65, 125, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 98, 78, 93, 72, 70, 65, 121, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 106, 73, 73, 74, 76, 91, 3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 123, 74, 87, 91, 48, 29, 31, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_DAY, 27, 92, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 5, 92, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 9, 12, 12, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_HALFDAY, 8, 25, 24, 92, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_DAY, 92, 47, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.HOUR_OF_DAY, 12, DateTimeFieldType.CLOCKHOUR_OF_DAY, 25, 62, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 31, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 82, 31, 51, 60, 54, 51, 38, 61, 32, 43, 114, 55, 62, 55, 63, 55, 60, 38, 114, 1, 55, 55, 57, 27, DateTimeFieldType.MILLIS_OF_DAY, 114, 61, 32, 114, 1, 55, 55, 57, 2, 61, 33, 59, 38, 59, 61, 60, 114, 60, 61, 38, 114, 52, 61, 39, 60, 54, 122, 66, 91, 67, 94, 71, 91, 82, DateTimeFieldType.MILLIS_OF_SECOND, 100, 82, 80, 90, 82, 89, 67, DateTimeFieldType.MILLIS_OF_SECOND, 82, 91, 82, 90, 82, 89, 67, 68, DateTimeFieldType.MILLIS_OF_SECOND, 89, 88, 67, DateTimeFieldType.MILLIS_OF_SECOND, 68, 66, 71, 71, 88, 69, 67, 82, 83, 54, DateTimeFieldType.MILLIS_OF_SECOND, 88, DateTimeFieldType.HOUR_OF_HALFDAY, 25, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 28, 88, 12, 10, 25, 27, DateTimeFieldType.MINUTE_OF_HOUR, 11, 88, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 29, 10, 29, 88, 30, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 28, 68, 101, 42, 124, 107, 102, 99, 110, 42, 124, 107, 120, 99, 100, 126, 42, 102, 111, 100, 109, 126, 98, 42, 103, 107, 121, 97, 42, 108, 101, 127, 100, 110, 96, 108, 119, 101, 113, 96, 102, 113, 43, 39, 48, 60, 53, 46, 87, 40, 63, 43, 68, 72, 67, 82, 79, 67, 56, 86, 68, 68, 81, 93, 86, 71, 90, 86, 45, 87, 86, 68, 58, 69, 73, 64, 89, 84, 69, 67, 84, 51, 8, 3, 30, DateTimeFieldType.MILLIS_OF_DAY, 3, 5, DateTimeFieldType.MINUTE_OF_DAY, 3, 2, 70, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 2, 92, 70, 24, 35, 40, 53, 61, 40, 46, 57, 40, 41, 109, 33, 44, 46, 36, 35, 42, 109, 59, 44, 33, 56, 40, 119, 109, 60, 53, 39, 58, 47, 45, 88, 5, 12, 30, 3, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 103, 124, 26, 0, 28, 124, DateTimeFieldType.MINUTE_OF_DAY, 3, 75, 66, 80, 77, 88, 90, 41, 50, 84, 78, 82, 50, 92, 78, 77, 44, 37, 55, 42, 63, 61, 78, 85, 51, 41, 53, 85, 59, 44, 57, 86, 95, 77, 80, 69, 71, 52, 47, 73, 83, 79, 47, 83, 80, 6, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 29, 0, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MILLIS_OF_SECOND, 24, 127, 25, 3, 31, 127, 24, DateTimeFieldType.SECOND_OF_MINUTE, 6, DateTimeFieldType.MINUTE_OF_HOUR, 53, 60, 46, 48, 76, 53, 37, 52, 76, 37, 44, 54, 49, 32, 32, 97, 104, 
        99, 127, 114, 120, 101, 118, 68, 77, 68, 66, 42, 12, 5, 12, 10, 99, 113, 125, 104, 110, 115, 111, 119, 125, 116, 107, 102, 103, 109, 45, 117, 103, 96, 111, 63, 45, 42, 37};
    }

    public static void A07() {
        A0q = new String[]{"PtjeSixlQpPnp33LbTolurfrF5aBxWMN", "zsPWFAYo6WN4WLRLivc6JVSph6JkIRth", "XheyHWRN6othIFLpaes4AkwCM0c9DMBL", "WLz3vbqVAvFNW8GJMAEq6yPWbMM9CaUw", "Xodlb2gLYburpvZCOlf7Ugos4D", "3NxGJ5nCydCtg30cLxHhJHXlDiPWCbyN", "QrznFntGQRtbXA7cSaAHWbiKbufqFBbd", "iW7nVRcCTDgQKTtcLRaOezFHTOIda"};
    }

    static {
        A07();
        A06();
        A0r = new C1177Ym();
        A0w = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        A0x = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0t = J1.A0m(A03(539, 90, 21));
        A0u = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        A0v = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0s = new UUID(72057594037932032L, -9223371306706625679L);
    }

    public C1179Yo() {
        this(0);
    }

    public C1179Yo(int i2) {
        this(new C1176Yl(), i2);
    }

    public C1179Yo(CX cx, int i2) {
        this.A0K = -1L;
        this.A0M = -9223372036854775807L;
        this.A0G = -9223372036854775807L;
        this.A0H = -9223372036854775807L;
        this.A0F = -1L;
        this.A0J = -1L;
        this.A0E = -9223372036854775807L;
        this.A0d = cx;
        this.A0d.A7W(new C1178Yn(this, null));
        this.A0o = (i2 & 1) == 0;
        this.A0e = new C0614Ce();
        this.A0c = new SparseArray<>();
        this.A0k = new C0768Il(4);
        this.A0n = new C0768Il(ByteBuffer.allocate(4).putInt(-1).array());
        this.A0l = new C0768Il(4);
        this.A0i = new C0768Il(C0764Ih.A03);
        this.A0h = new C0768Il(4);
        this.A0j = new C0768Il();
        this.A0m = new C0768Il();
        this.A0f = new C0768Il(8);
        this.A0g = new C0768Il();
    }

    private int A00(CG cg, CR cr, int i2) throws InterruptedException, IOException {
        int iACg;
        int iA05 = this.A0j.A05();
        if (iA05 > 0) {
            iACg = Math.min(i2, iA05);
            if (A0q[7].length() == 22) {
                throw new RuntimeException();
            }
            String[] strArr = A0q;
            strArr[2] = "aDvj6xsBYLtfkWvKOvjAJhuXcdkZRgYf";
            strArr[6] = "uG0ceA84GetZ2PjOc8Op6VIqDQh3bhN9";
            cr.ACh(this.A0j, iACg);
        } else {
            iACg = cr.ACg(cg, i2, false);
        }
        this.A07 += iACg;
        this.A08 += iACg;
        return iACg;
    }

    private long A01(long j2) throws AI {
        long j3 = this.A0M;
        if (j3 != -9223372036854775807L) {
            return J1.A0G(j2, j3, 1000L);
        }
        throw new AI(A03(189, 54, 33));
    }

    /* JADX WARN: Incorrect condition in loop: B:21:0x0064 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.ads.redexgen.X.CO A02() {
        /*
            r11 = this;
            long r3 = r11.A0K
            r8 = 0
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L2e
            long r3 = r11.A0H
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L2e
            com.facebook.ads.redexgen.X.Ib r0 = r11.A0Q
            if (r0 == 0) goto L2e
            int r0 = r0.A02()
            if (r0 == 0) goto L2e
            com.facebook.ads.redexgen.X.Ib r0 = r11.A0P
            if (r0 == 0) goto L2e
            int r1 = r0.A02()
            com.facebook.ads.redexgen.X.Ib r0 = r11.A0Q
            int r0 = r0.A02()
            if (r1 == r0) goto L3a
        L2e:
            r11.A0Q = r8
            r11.A0P = r8
            com.facebook.ads.redexgen.X.Yc r2 = new com.facebook.ads.redexgen.X.Yc
            long r0 = r11.A0H
            r2.<init>(r0)
            return r2
        L3a:
            com.facebook.ads.redexgen.X.Ib r0 = r11.A0Q
            int r7 = r0.A02()
            int[] r9 = new int[r7]
            long[] r6 = new long[r7]
            long[] r5 = new long[r7]
            long[] r4 = new long[r7]
            r10 = 0
        L49:
            if (r10 >= r7) goto L61
            com.facebook.ads.redexgen.X.Ib r0 = r11.A0Q
            long r0 = r0.A03(r10)
            r4[r10] = r0
            long r0 = r11.A0K
            com.facebook.ads.redexgen.X.Ib r2 = r11.A0P
            long r2 = r2.A03(r10)
            long r0 = r0 + r2
            r6[r10] = r0
            int r10 = r10 + 1
            goto L49
        L61:
            r10 = 0
        L62:
            int r0 = r7 + (-1)
            if (r10 >= r0) goto L7c
            int r0 = r10 + 1
            r0 = r6[r0]
            r2 = r6[r10]
            long r0 = r0 - r2
            int r2 = (int) r0
            r9[r10] = r2
            int r0 = r10 + 1
            r2 = r4[r0]
            r0 = r4[r10]
            long r2 = r2 - r0
            r5[r10] = r2
            int r10 = r10 + 1
            goto L62
        L7c:
            int r10 = r7 + (-1)
            long r2 = r11.A0K
            long r0 = r11.A0L
            long r2 = r2 + r0
            int r0 = r7 + (-1)
            r0 = r6[r0]
            long r2 = r2 - r0
            int r0 = (int) r2
            r9[r10] = r0
            int r10 = r7 + (-1)
            long r0 = r11.A0H
            int r2 = r7 + (-1)
            r2 = r4[r2]
            long r0 = r0 - r2
            r5[r10] = r0
            r11.A0Q = r8
            r11.A0P = r8
            com.facebook.ads.redexgen.X.YX r0 = new com.facebook.ads.redexgen.X.YX
            r0.<init>(r9, r6, r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1179Yo.A02():com.facebook.ads.redexgen.X.CO");
    }

    private void A05() {
        this.A07 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0S = false;
        this.A0X = false;
        this.A0U = false;
        this.A0A = 0;
        this.A00 = (byte) 0;
        this.A0T = false;
        this.A0j.A0W();
    }

    private void A08(CG cg, int i2) throws InterruptedException, IOException {
        if (this.A0k.A08() >= i2) {
            return;
        }
        if (this.A0k.A06() < i2) {
            C0768Il c0768Il = this.A0k;
            c0768Il.A0c(Arrays.copyOf(c0768Il.A00, Math.max(this.A0k.A00.length * 2, i2)), this.A0k.A08());
        }
        cg.readFully(this.A0k.A00, this.A0k.A08(), i2 - this.A0k.A08());
        this.A0k.A0Y(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A09(com.facebook.ads.redexgen.X.CG r11, com.facebook.ads.redexgen.X.Cb r12, int r13) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1179Yo.A09(com.facebook.ads.redexgen.X.CG, com.facebook.ads.redexgen.X.Cb, int):void");
    }

    private void A0A(CG cg, byte[] bArr, int i2) throws InterruptedException, IOException {
        int length = bArr.length + i2;
        if (this.A0m.A06() < length) {
            this.A0m.A00 = Arrays.copyOf(bArr, length + i2);
        } else {
            System.arraycopy(bArr, 0, this.A0m.A00, 0, bArr.length);
        }
        cg.readFully(this.A0m.A00, bArr.length, i2);
        this.A0m.A0X(length);
    }

    private void A0B(CG cg, byte[] bArr, int i2, int i3) throws InterruptedException, IOException {
        int iMin = Math.min(i3, this.A0j.A05());
        cg.readFully(bArr, i2 + iMin, i3 - iMin);
        if (iMin > 0) {
            this.A0j.A0d(bArr, i2, iMin);
        }
        this.A07 += i3;
    }

    private void A0C(Cb cb, long j2) {
        if (cb.A0X != null) {
            cb.A0X.A03(cb, j2);
        } else {
            if (A03(843, 11, 56).equals(cb.A0Y)) {
                A0D(cb, A03(33, 19, 75), 19, 1000L, A0x);
            } else {
                if (A03(833, 10, 45).equals(cb.A0Y)) {
                    A0D(cb, A03(14, 19, 119), 21, 10000L, A0v);
                }
            }
            cb.A0W.ACi(j2, this.A01, this.A08, 0, cb.A0V);
        }
        this.A0V = true;
        A05();
    }

    private void A0D(Cb cb, String str, int i2, long j2, byte[] bArr) {
        A0E(this.A0m.A00, this.A0C, str, i2, j2, bArr);
        CR cr = cb.A0W;
        C0768Il c0768Il = this.A0m;
        cr.ACh(c0768Il, c0768Il.A08());
        this.A08 += this.A0m.A08();
    }

    public static void A0E(byte[] bArr, long j2, String str, int i2, long j3, byte[] bArr2) {
        byte[] bArrA0m;
        if (j2 == -9223372036854775807L) {
            bArrA0m = bArr2;
        } else {
            int i3 = (int) (j2 / 3600000000L);
            long j4 = j2 - (((long) (i3 * 3600)) * 1000000);
            int i4 = (int) (j4 / 60000000);
            long j5 = j4 - (((long) (i4 * 60)) * 1000000);
            int lastValue = (int) (j5 / 1000000);
            bArrA0m = J1.A0m(String.format(Locale.US, str, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(lastValue), Integer.valueOf((int) ((j5 - (((long) lastValue) * 1000000)) / j3))));
        }
        System.arraycopy(bArrA0m, 0, bArr, i2, bArr2.length);
    }

    private boolean A0F(CM cm, long j2) {
        if (this.A0Y) {
            this.A0J = j2;
            cm.A00 = this.A0F;
            this.A0Y = false;
            return true;
        }
        if (this.A0a) {
            long j3 = this.A0J;
            if (j3 != -1) {
                cm.A00 = j3;
                this.A0J = -1L;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0G(java.lang.String r4) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1179Yo.A0G(java.lang.String):boolean");
    }

    public static int[] A0I(int[] iArr, int i2) {
        if (iArr == null) {
            return new int[i2];
        }
        if (iArr.length >= i2) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i2)];
    }

    public final void A0J(int i2) throws AI {
        if (i2 == 160) {
            if (this.A04 != 2) {
                return;
            }
            if (!this.A0W) {
                this.A01 |= 1;
            }
            A0C(this.A0c.get(this.A05), this.A0D);
            this.A04 = 0;
            return;
        }
        if (A0q[3].charAt(28) == 'C') {
            String[] strArr = A0q;
            strArr[2] = "rbl1Q01lKztgjfT5AU1HA1uCy8pKF6Jb";
            strArr[6] = "0IgewP00Z0tSvfgvmyCD0no1Nhaiy8Yj";
            if (i2 == 174) {
                if (A0G(this.A0O.A0Y)) {
                    Cb cb = this.A0O;
                    cb.A0A(this.A0N, cb.A0N);
                    this.A0c.put(this.A0O.A0N, this.A0O);
                }
                this.A0O = null;
                return;
            }
            if (i2 == 19899) {
                int i3 = this.A0B;
                if (i3 != -1) {
                    long j2 = this.A0I;
                    if (j2 != -1) {
                        if (i3 == 475249515) {
                            this.A0F = j2;
                            return;
                        }
                        return;
                    }
                }
                throw new AI(A03(667, 50, 104));
            }
            if (i2 == 25152) {
                if (this.A0O.A0c) {
                    if (this.A0O.A0V != null) {
                        this.A0O.A0U = new DrmInitData(new DrmInitData.SchemeData(C05639t.A04, A03(1024, 10, 56), this.A0O.A0V.A03));
                        return;
                    }
                    throw new AI(A03(449, 55, 66));
                }
                return;
            }
            if (A0q[7].length() != 22) {
                String[] strArr2 = A0q;
                strArr2[4] = "mvRw2Aey0bC26pGUqGZgnnTCCn";
                strArr2[4] = "mvRw2Aey0bC26pGUqGZgnnTCCn";
                if (i2 == 28032) {
                    if (this.A0O.A0c && this.A0O.A0f != null) {
                        throw new AI(A03(243, 53, 91));
                    }
                    return;
                }
                if (i2 == 357149030) {
                    if (this.A0M == -9223372036854775807L) {
                        this.A0M = 1000000L;
                    }
                    long j3 = this.A0G;
                    if (j3 != -9223372036854775807L) {
                        this.A0H = A01(j3);
                        return;
                    }
                    return;
                }
                if (i2 != 374648427) {
                    if (i2 == 475249515 && !this.A0a) {
                        this.A0N.ACn(A02());
                        this.A0a = true;
                        return;
                    }
                    return;
                }
                if (this.A0c.size() != 0) {
                    this.A0N.A4x();
                    return;
                }
                throw new AI(A03(756, 26, 66));
            }
        }
        throw new RuntimeException();
    }

    public final void A0K(int i2, double d2) {
        if (i2 == 181) {
            this.A0O.A0O = (int) d2;
            return;
        }
        if (i2 != 17545) {
            switch (i2) {
                case 21969:
                    this.A0O.A06 = (float) d2;
                    break;
                case 21970:
                    this.A0O.A07 = (float) d2;
                    break;
                case 21971:
                    this.A0O.A04 = (float) d2;
                    break;
                case 21972:
                    this.A0O.A05 = (float) d2;
                    break;
                case 21973:
                    this.A0O.A02 = (float) d2;
                    break;
                case 21974:
                    this.A0O.A03 = (float) d2;
                    break;
                case 21975:
                    this.A0O.A08 = (float) d2;
                    break;
                case 21976:
                    this.A0O.A09 = (float) d2;
                    break;
                case 21977:
                    this.A0O.A00 = (float) d2;
                    break;
                case 21978:
                    this.A0O.A01 = (float) d2;
                    break;
            }
            return;
        }
        this.A0G = (long) d2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x02df, code lost:
    
        if (r2 < (-2147483648L)) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e6, code lost:
    
        if (r2 > 2147483647L) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02e8, code lost:
    
        r12 = (int) r2;
        r1 = r18.A0b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02eb, code lost:
    
        if (r13 != 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02ed, code lost:
    
        r1[r13] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02fc, code lost:
    
        if (com.facebook.ads.redexgen.X.C1179Yo.A0q[3].charAt(28) == 'C') goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02fe, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C1179Yo.A0q;
        r2[3] = "z0Au1LkbuRNouNVheQnfVlMARF4HCclD";
        r2[3] = "z0Au1LkbuRNouNVheQnfVlMARF4HCclD";
        r17 = r17 + r18.A0b[r13];
        r13 = r13 + 0;
        r2 = 0;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0316, code lost:
    
        r12 = r12 + r1[r13 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x031c, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C1179Yo.A0q;
        r2[3] = "Jxw4JkcEKQdQjQ2wbghJK6p5EXksCnqX";
        r2[3] = "Jxw4JkcEKQdQjQ2wbghJK6p5EXksCnqX";
        r17 = r17 + r18.A0b[r13];
        r13 = r13 + 1;
        r2 = 0;
        r12 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0L(int r19, int r20, com.facebook.ads.redexgen.X.CG r21) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 941
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1179Yo.A0L(int, int, com.facebook.ads.redexgen.X.CG):void");
    }

    public final void A0M(int i2, long j2) throws AI {
        String strA03 = A03(0, 14, 56);
        if (i2 == 20529) {
            if (j2 == 0) {
                return;
            }
            throw new AI(A03(327, 21, 54) + j2 + strA03);
        }
        if (i2 != 20530) {
            switch (i2) {
                case 131:
                    this.A0O.A0Q = (int) j2;
                    return;
                case 136:
                    this.A0O.A0Z = j2 == 1;
                    return;
                case 155:
                    this.A0C = A01(j2);
                    return;
                case 159:
                    this.A0O.A0B = (int) j2;
                    return;
                case 176:
                    this.A0O.A0R = (int) j2;
                    return;
                case 179:
                    this.A0Q.A04(A01(j2));
                    return;
                case 186:
                    this.A0O.A0J = (int) j2;
                    return;
                case 215:
                    this.A0O.A0N = (int) j2;
                    return;
                case 231:
                    this.A0E = A01(j2);
                    return;
                case 241:
                    if (this.A0Z) {
                        return;
                    }
                    this.A0P.A04(j2);
                    this.A0Z = true;
                    return;
                case 251:
                    this.A0W = true;
                    return;
                case 16980:
                    if (j2 == 3) {
                        return;
                    }
                    throw new AI(A03(296, 16, 112) + j2 + strA03);
                case 17029:
                    if (j2 >= 1 && j2 <= 2) {
                        return;
                    }
                    throw new AI(A03(377, 19, 127) + j2 + strA03);
                case 17143:
                    if (j2 == 1) {
                        return;
                    }
                    throw new AI(A03(433, 16, 53) + j2 + strA03);
                case 18401:
                    if (j2 == 5) {
                        return;
                    }
                    throw new AI(A03(312, 15, 26) + j2 + strA03);
                case 18408:
                    if (j2 == 1) {
                        return;
                    }
                    throw new AI(A03(52, 22, 45) + j2 + strA03);
                case 21420:
                    this.A0I = this.A0K + j2;
                    return;
                case 21432:
                    int i3 = (int) j2;
                    if (i3 == 0) {
                        this.A0O.A0P = 0;
                        return;
                    }
                    if (i3 == 1) {
                        this.A0O.A0P = 2;
                        return;
                    } else if (i3 == 3) {
                        this.A0O.A0P = 1;
                        return;
                    } else {
                        if (i3 != 15) {
                            return;
                        }
                        this.A0O.A0P = 3;
                        return;
                    }
                case 21680:
                    this.A0O.A0I = (int) j2;
                    return;
                case 21682:
                    this.A0O.A0H = (int) j2;
                    return;
                case 21690:
                    this.A0O.A0G = (int) j2;
                    return;
                case 21930:
                    this.A0O.A0a = j2 == 1;
                    return;
                case 22186:
                    this.A0O.A0S = j2;
                    return;
                case 22203:
                    this.A0O.A0T = j2;
                    return;
                case 25188:
                    this.A0O.A0A = (int) j2;
                    return;
                case 2352003:
                    this.A0O.A0F = (int) j2;
                    return;
                case 2807729:
                    this.A0M = j2;
                    return;
                default:
                    switch (i2) {
                        case 21945:
                            int i4 = (int) j2;
                            if (i4 == 1) {
                                this.A0O.A0C = 2;
                                return;
                            } else {
                                if (i4 != 2) {
                                    return;
                                }
                                this.A0O.A0C = 1;
                                return;
                            }
                        case 21946:
                            int i5 = (int) j2;
                            if (i5 != 1) {
                                if (A0q[4].length() != 26) {
                                    throw new RuntimeException();
                                }
                                String[] strArr = A0q;
                                strArr[7] = "BNY";
                                strArr[7] = "BNY";
                                if (i5 == 16) {
                                    Cb cb = this.A0O;
                                    String[] strArr2 = A0q;
                                    if (strArr2[2].charAt(10) != strArr2[6].charAt(10)) {
                                        cb.A0E = 6;
                                        return;
                                    }
                                    String[] strArr3 = A0q;
                                    strArr3[2] = "2BcX3syCXJtWqdpX1qkuhAX2qE5R3ro0";
                                    strArr3[6] = "aMiDNxLEmFtOjuqrXAq5lyKODggVFywu";
                                    cb.A0E = 6;
                                    return;
                                }
                                if (i5 == 18) {
                                    this.A0O.A0E = 7;
                                    return;
                                } else if (i5 != 6 && i5 != 7) {
                                    return;
                                }
                            }
                            this.A0O.A0E = 3;
                            return;
                        case 21947:
                            Cb cb2 = this.A0O;
                            cb2.A0b = true;
                            int i6 = (int) j2;
                            if (i6 == 1) {
                                cb2.A0D = 1;
                                return;
                            }
                            if (i6 == 9) {
                                cb2.A0D = 6;
                                return;
                            } else {
                                if (i6 != 4 && i6 != 5 && i6 != 6 && i6 != 7) {
                                    return;
                                }
                                this.A0O.A0D = 2;
                                return;
                            }
                        case 21948:
                            this.A0O.A0K = (int) j2;
                            return;
                        case 21949:
                            this.A0O.A0L = (int) j2;
                            return;
                        default:
                            return;
                    }
            }
        }
        if (A0q[7].length() != 22) {
            String[] strArr4 = A0q;
            strArr4[1] = "hD31tqXIhnGrFxqSOgo1vvmOI12OLqRQ";
            strArr4[1] = "hD31tqXIhnGrFxqSOgo1vvmOI12OLqRQ";
            if (j2 == 1) {
                return;
            }
        } else if (j2 == 1) {
            return;
        }
        throw new AI(A03(348, 21, 50) + j2 + strA03);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0N(int r8, long r9, long r11) throws com.facebook.ads.redexgen.X.AI {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1179Yo.A0N(int, long, long):void");
    }

    public final void A0O(int i2, String str) throws AI {
        if (i2 == 134) {
            this.A0O.A0Y = str;
            return;
        }
        if (i2 != 17026) {
            if (i2 == 2274716) {
                this.A0O.A0g = str;
            }
        } else {
            if (A03(1034, 4, 114).equals(str) || A03(1016, 8, 38).equals(str)) {
                return;
            }
            throw new AI(A03(369, 8, 86) + str + A03(0, 14, 56));
        }
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void A7V(CH ch) {
        this.A0N = ch;
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final int AC0(CG cg, CM cm) throws InterruptedException, IOException {
        this.A0V = false;
        boolean zAC2 = true;
        while (zAC2 && !this.A0V) {
            zAC2 = this.A0d.AC2(cg);
            if (zAC2 && A0F(cm, cg.A6p())) {
                return 1;
            }
        }
        if (zAC2) {
            return 0;
        }
        for (int i2 = 0; i2 < this.A0c.size(); i2++) {
            this.A0c.valueAt(i2).A08();
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void ACm(long j2, long j3) {
        this.A0E = -9223372036854775807L;
        this.A04 = 0;
        this.A0d.reset();
        this.A0e.A06();
        A05();
        for (int i2 = 0; i2 < this.A0c.size(); i2++) {
            this.A0c.valueAt(i2).A09();
        }
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final boolean ADK(CG cg) throws InterruptedException, IOException {
        return new Cd().A02(cg);
    }
}
