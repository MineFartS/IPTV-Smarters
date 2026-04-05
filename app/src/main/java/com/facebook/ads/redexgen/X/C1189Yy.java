package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1189Yy implements CF {
    public static byte[] A0X;
    public static String[] A0Y;
    public static final CI A0Z;
    public static final int A0a;
    public static final Format A0b;
    public static final byte[] A0c;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public CH A0C;
    public Cs A0D;
    public C0768Il A0E;
    public boolean A0F;
    public boolean A0G;
    public CR[] A0H;
    public CR[] A0I;
    public final int A0J;
    public final SparseArray<Cs> A0K;

    @Nullable
    public final DrmInitData A0L;

    @Nullable
    public final CR A0M;

    @Nullable
    public final D1 A0N;
    public final C0768Il A0O;
    public final C0768Il A0P;
    public final C0768Il A0Q;
    public final C0768Il A0R;

    @Nullable
    public final C0780Ix A0S;
    public final ArrayDeque<C1183Ys> A0T;
    public final ArrayDeque<C0627Cr> A0U;
    public final List<Format> A0V;
    public final byte[] A0W;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, YX> A04(C0768Il c0768Il, long j2) throws AI {
        long jA0O;
        long jA0O2;
        c0768Il.A0Z(8);
        int iA01 = AbstractC0616Cg.A01(c0768Il.A09());
        c0768Il.A0a(4);
        long jA0N = c0768Il.A0N();
        if (iA01 == 0) {
            jA0O = c0768Il.A0N();
            jA0O2 = j2 + c0768Il.A0N();
        } else {
            jA0O = c0768Il.A0O();
            jA0O2 = j2 + c0768Il.A0O();
        }
        long jA0G = J1.A0G(jA0O, 1000000L, jA0N);
        c0768Il.A0a(2);
        int iA0J = c0768Il.A0J();
        int[] iArr = new int[iA0J];
        long[] jArr = new long[iA0J];
        long[] jArr2 = new long[iA0J];
        long[] jArr3 = new long[iA0J];
        if (A0Y[2].charAt(18) != 'K') {
            throw new RuntimeException();
        }
        String[] strArr = A0Y;
        strArr[5] = "s";
        strArr[5] = "s";
        int i2 = 0;
        long jA0G2 = jA0G;
        while (i2 < iA0J) {
            int iA09 = c0768Il.A09();
            if ((Integer.MIN_VALUE & iA09) != 0) {
                throw new AI(A0A(581, 28, 75));
            }
            long jA0N2 = c0768Il.A0N();
            iArr[i2] = Integer.MAX_VALUE & iA09;
            jArr[i2] = jA0O2;
            jArr3[i2] = jA0G2;
            jA0O += jA0N2;
            jA0G2 = J1.A0G(jA0O, 1000000L, jA0N);
            jArr2[i2] = jA0G2 - jArr3[i2];
            c0768Il.A0a(4);
            int i3 = iArr[i2];
            if (A0Y[3].length() != 6) {
                String[] strArr2 = A0Y;
                strArr2[1] = "dhc";
                strArr2[1] = "dhc";
                jA0O2 += (long) i3;
                i2 += 0;
            } else {
                String[] strArr3 = A0Y;
                strArr3[5] = "h";
                strArr3[5] = "h";
                jA0O2 += (long) i3;
                i2++;
            }
        }
        return Pair.create(Long.valueOf(jA0G), new YX(iArr, jArr, jArr2, jArr3));
    }

    public static String A0A(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0X, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 85);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0X = new byte[]{76, 64, 11, 62, 37, 39, 106, 57, 35, 48, 47, 106, 38, 47, 57, 57, 106, 62, 34, 43, 36, 106, 34, 47, 43, 46, 47, 56, 106, 38, 47, 36, 45, 62, 34, 106, 98, 63, 36, 57, 63, 58, 58, 37, 56, 62, 47, 46, 99, 100, 104, 67, 89, 95, 84, DateTimeFieldType.HALFDAY_OF_DAY, 78, 66, 88, 67, 89, DateTimeFieldType.HALFDAY_OF_DAY, 68, 67, DateTimeFieldType.HALFDAY_OF_DAY, 94, 79, 74, 93, DateTimeFieldType.HALFDAY_OF_DAY, 12, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 28, DateTimeFieldType.HALFDAY_OF_DAY, 5, 88, 67, 94, 88, 93, 93, 66, 95, 89, 72, 73, 4, 3, 5, 46, 52, 50, 57, 96, 35, 47, 53, 46, 52, 96, 41, 46, 96, 51, 39, 48, 36, 96, 97, 125, 96, 113, 96, 104, 53, 46, 51, 53, 48, 48, 47, 50, 52, 37, 36, 105, 110, 29, 41, 58, 60, 54, 62, 53, 47, 62, 63, DateTimeFieldType.MILLIS_OF_DAY, 43, 111, 30, 35, 47, 41, 58, 56, 47, 52, 41, 4, 42, 35, 34, 63, 36, 35, 42, 109, 35, 40, 42, 44, 57, 36, 59, 40, 109, 34, 43, 43, 62, 40, 57, 109, 57, 34, 109, 62, 44, 32, 61, 33, 40, 109, 41, 44, 57, 44, 99, 110, 71, 67, 68, 2, 67, 86, 77, 79, 2, 70, 71, 68, 75, 76, 71, 81, 2, 71, 90, 86, 71, 76, 70, 71, 70, 2, 67, 86, 77, 79, 2, 81, 75, 88, 71, 2, 10, 87, 76, 81, 87, 82, 82, 77, 80, 86, 71, 70, 11, 12, 38, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 11, 12, 74, 11, 30, 5, 7, 74, 29, 3, 30, 2, 74, 6, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 4, DateTimeFieldType.HALFDAY_OF_DAY, 30, 2, 74, 84, 74, 88, 91, 94, 93, 94, 82, 89, 92, 94, 93, 74, 66, 31, 4, 25, 31, 26, 26, 5, 24, 30, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, 67, 68, 97, 72, 67, 74, 89, 69, DateTimeFieldType.HALFDAY_OF_DAY, 64, 68, 94, 64, 76, 89, 78, 69, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HALFDAY_OF_DAY, 88, 113, 113, 100, 114, 99, 55, 99, 120, 55, 114, 121, 116, 101, 110, 103, 99, 126, 120, 121, 55, 115, 118, 99, 118, 55, 96, 118, 100, 55, 121, 114, 112, 118, 99, 126, 97, 114, 57, DateTimeFieldType.MILLIS_OF_DAY, 63, 63, 42, 60, 45, 121, 45, 54, 121, 60, 55, 61, 121, 54, 63, 121, 52, 61, 56, 45, 121, 46, 56, 42, 121, 55, 60, 62, 56, 45, 48, 47, 60, 119, 84, 109, 126, 105, 105, 114, 127, 114, 117, 124, 59, 79, 105, 122, 120, 112, 94, 117, 120, 105, 98, 107, 111, 114, 116, 117, 89, 116, 99, 59, 107, 122, 105, 122, 118, 126, 111, 126, 105, 104, 59, 114, 104, 59, 110, 117, 104, 110, 107, 107, 116, 105, 111, 126, 127, 53, 107, 83, 81, 72, 72, 93, 92, 24, 72, 75, 75, 80, 24, 89, 76, 87, 85, 24, DateTimeFieldType.CLOCKHOUR_OF_DAY, 94, 89, 81, 84, 93, 92, 24, 76, 87, 24, 93, 64, 76, 74, 89, 91, 76, 24, 77, 77, 81, 92, DateTimeFieldType.HOUR_OF_DAY, 105, 81, 83, 74, 74, 83, 84, 93, 26, 91, 78, 85, 87, 26, 77, 83, 78, 82, 26, 86, 95, 84, 93, 78, 82, 26, 4, 26, 8, 11, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 2, 9, 12, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, 26, DateTimeFieldType.MINUTE_OF_DAY, 79, 84, 73, 79, 74, 74, 85, 72, 78, 95, 94, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_DAY, 11, 48, 59, 38, 46, 59, 61, 42, 59, 58, 126, 51, 49, 49, 40, 126, 60, 49, 38, 112, 95, 100, 111, 114, 122, 111, 105, 126, 111, 110, 42, 121, 107, 99, 101, 42, 111, 100, 126, 120, 115, 42, 105, 101, 127, 100, 126, 48, 42, 75, 112, 118, 127, 112, 122, 114, 123, 122, 62, 119, 112, 122, 119, 108, 123, 125, 106, 62, 108, 123, 120, 123, 108, 123, 112, 125, 123, 41, 30, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 30, 29, DateTimeFieldType.MINUTE_OF_HOUR, 26, 95, DateTimeFieldType.MINUTE_OF_HOUR, 26, DateTimeFieldType.HOUR_OF_DAY, 24, 11, DateTimeFieldType.MILLIS_OF_SECOND, 95, 27, 26, 12, 28, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 11, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 95, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, 95, 12, 24, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 27, 95, 25, DateTimeFieldType.CLOCKHOUR_OF_DAY, 10, DateTimeFieldType.HOUR_OF_DAY, 27, 95, 87, 10, DateTimeFieldType.HOUR_OF_DAY, 12, 10, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 11, 26, 27, 86, 3, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 11, 1, 3, DateTimeFieldType.MILLIS_OF_DAY, 11, DateTimeFieldType.HALFDAY_OF_DAY, 12, 77, 26, 79, 7, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_DAY, 5, 62, 40, 36, 42, 46, 49, 60, 61, 55, 119, 48, 61, 46, 59, 61, 34, 47, 46, 36, 100, 38, 59, 127};
    }

    public static void A0E() {
        A0Y = new String[]{"bw2Pz5UYSLOOesGIJaWlA3GOzVLZPAg", "gG3", "yjdYoV9UEi8qMqqcqGKRK6SXbov0CwAj", "4kzePG", "OMn6r0AgRGwk9BJzU", "o", "aMFqcwP4FMZJ2yTkvuTBoGT2vGZy4ax", "h66GloOgbywQ1e6PB204dGM9vAJrPucq"};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0N(C1183Ys c1183Ys, SparseArray<Cs> sparseArray, int i2, byte[] bArr) throws AI {
        Cs csA09 = A09(c1183Ys.A07(AbstractC0616Cg.A1I).A00, sparseArray);
        if (csA09 == null) {
            return;
        }
        D3 d3 = csA09.A07;
        long jA02 = d3.A06;
        csA09.A05();
        if (c1183Ys.A07(AbstractC0616Cg.A1H) != null && (i2 & 2) == 0) {
            jA02 = A02(c1183Ys.A07(AbstractC0616Cg.A1H).A00);
        }
        A0O(c1183Ys, csA09, jA02, i2);
        D2 d2A00 = csA09.A05.A00(d3.A07.A02);
        C1184Yt c1184YtA07 = c1183Ys.A07(AbstractC0616Cg.A0u);
        if (c1184YtA07 != null) {
            A0Q(d2A00, c1184YtA07.A00, d3);
        }
        C1184Yt c1184YtA072 = c1183Ys.A07(AbstractC0616Cg.A0t);
        if (c1184YtA072 != null) {
            A0T(c1184YtA072.A00, d3);
        }
        C1184Yt c1184YtA073 = c1183Ys.A07(AbstractC0616Cg.A10);
        if (c1184YtA073 != null) {
            A0U(c1184YtA073.A00, d3);
        }
        C1184Yt c1184YtA074 = c1183Ys.A07(AbstractC0616Cg.A0x);
        C1184Yt c1184YtA075 = c1183Ys.A07(AbstractC0616Cg.A11);
        if (c1184YtA074 != null && c1184YtA075 != null) {
            A0W(c1184YtA074.A00, c1184YtA075.A00, d2A00 != null ? d2A00.A02 : null, d3);
        }
        int size = c1183Ys.A02.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1184Yt c1184Yt = c1183Ys.A02.get(i3);
            int i4 = ((AbstractC0616Cg) c1184Yt).A00;
            int i5 = AbstractC0616Cg.A1Q;
            if (A0Y[7].charAt(27) != 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[6] = "tWuQt3qCpORkhzaHtCNFkUwj420xxTd";
            strArr[4] = "yKRRCTery0iDoE3P4";
            if (i4 == i5) {
                A0V(c1184Yt.A00, d3, bArr);
            }
        }
    }

    static {
        A0E();
        A0D();
        A0Z = new C1188Yx();
        A0a = J1.A08(A0A(682, 4, 24));
        A0c = new byte[]{-94, 57, 79, 82, 90, -101, 79, DateTimeFieldType.SECOND_OF_DAY, -94, 68, 108, 66, 124, 100, -115, -12};
        A0b = Format.A02(null, A0A(664, 18, 55), Long.MAX_VALUE);
    }

    public C1189Yy() {
        this(0);
    }

    public C1189Yy(int i2) {
        this(i2, null);
    }

    public C1189Yy(int i2, @Nullable C0780Ix c0780Ix) {
        this(i2, c0780Ix, null, null);
    }

    public C1189Yy(int i2, @Nullable C0780Ix c0780Ix, @Nullable D1 d1, @Nullable DrmInitData drmInitData) {
        this(i2, c0780Ix, d1, drmInitData, Collections.emptyList());
    }

    public C1189Yy(int i2, @Nullable C0780Ix c0780Ix, @Nullable D1 d1, @Nullable DrmInitData drmInitData, List<Format> closedCaptionFormats) {
        this(i2, c0780Ix, d1, drmInitData, closedCaptionFormats, null);
    }

    public C1189Yy(int i2, @Nullable C0780Ix c0780Ix, @Nullable D1 d1, @Nullable DrmInitData drmInitData, List<Format> list, @Nullable CR cr) {
        this.A0J = (d1 != null ? 8 : 0) | i2;
        this.A0S = c0780Ix;
        this.A0N = d1;
        this.A0L = drmInitData;
        List<Format> closedCaptionFormats = Collections.unmodifiableList(list);
        this.A0V = closedCaptionFormats;
        this.A0M = cr;
        this.A0O = new C0768Il(16);
        this.A0R = new C0768Il(C0764Ih.A03);
        this.A0Q = new C0768Il(5);
        this.A0P = new C0768Il();
        this.A0W = new byte[16];
        this.A0T = new ArrayDeque<>();
        this.A0U = new ArrayDeque<>();
        this.A0K = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        A0B();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(com.facebook.ads.redexgen.X.Cs r28, int r29, long r30, int r32, com.facebook.ads.redexgen.X.C0768Il r33, int r34) {
        /*
            Method dump skipped, instruction units count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1189Yy.A00(com.facebook.ads.redexgen.X.Cs, int, long, int, com.facebook.ads.redexgen.X.Il, int):int");
    }

    public static long A01(C0768Il c0768Il) {
        c0768Il.A0Z(8);
        int version = AbstractC0616Cg.A01(c0768Il.A09());
        return version == 0 ? c0768Il.A0N() : c0768Il.A0O();
    }

    public static long A02(C0768Il c0768Il) {
        c0768Il.A0Z(8);
        return AbstractC0616Cg.A01(c0768Il.A09()) == 1 ? c0768Il.A0O() : c0768Il.A0N();
    }

    public static Pair<Integer, C0622Cm> A03(C0768Il c0768Il) {
        c0768Il.A0Z(12);
        int defaultSampleDuration = c0768Il.A09();
        int defaultSampleFlags = c0768Il.A0I() - 1;
        return Pair.create(Integer.valueOf(defaultSampleDuration), new C0622Cm(defaultSampleFlags, c0768Il.A0I(), c0768Il.A0I(), c0768Il.A09()));
    }

    public static DrmInitData A05(List<C1184Yt> list) {
        ArrayList arrayList = null;
        int i2 = list.size();
        for (int i3 = 0; i3 < i2; i3++) {
            C1184Yt c1184Yt = list.get(i3);
            if (((AbstractC0616Cg) c1184Yt).A00 == AbstractC0616Cg.A0r) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c1184Yt.A00.A00;
                UUID uuidA03 = C0633Cy.A03(bArr);
                if (uuidA03 == null) {
                    Log.w(A0A(128, 22, 14), A0A(437, 42, 109));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidA03, A0A(696, 9, 30), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private C0622Cm A06(SparseArray<C0622Cm> sparseArray, int i2) {
        if (sparseArray.size() != 1) {
            return (C0622Cm) IM.A01(sparseArray.get(i2));
        }
        if (A0Y[7].charAt(27) != 'r') {
            throw new RuntimeException();
        }
        String[] strArr = A0Y;
        strArr[3] = "nw8rk4";
        strArr[3] = "nw8rk4";
        return sparseArray.valueAt(0);
    }

    public static Cs A07(SparseArray<Cs> sparseArray) {
        Cs cs = null;
        long j2 = Long.MAX_VALUE;
        int i2 = sparseArray.size();
        for (int i3 = 0; i3 < i2; i3++) {
            Cs csValueAt = sparseArray.valueAt(i3);
            if (csValueAt.A02 != csValueAt.A07.A02) {
                long j3 = csValueAt.A07.A0G[csValueAt.A02];
                if (j3 < j2) {
                    cs = csValueAt;
                    j2 = j3;
                }
            }
        }
        return cs;
    }

    @Nullable
    public static Cs A08(SparseArray<Cs> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        Cs cs = sparseArray.get(i2);
        if (A0Y[0].length() == 21) {
            throw new RuntimeException();
        }
        String[] strArr = A0Y;
        strArr[1] = "fYJ";
        strArr[1] = "fYJ";
        return cs;
    }

    public static Cs A09(C0768Il c0768Il, SparseArray<Cs> sparseArray) {
        int iA0I;
        int iA0I2;
        int iA0I3;
        int iA0I4;
        c0768Il.A0Z(8);
        int iA00 = AbstractC0616Cg.A00(c0768Il.A09());
        int trackId = c0768Il.A09();
        Cs csA08 = A08(sparseArray, trackId);
        if (csA08 == null) {
            return null;
        }
        if ((iA00 & 1) != 0) {
            long jA0O = c0768Il.A0O();
            csA08.A07.A05 = jA0O;
            csA08.A07.A04 = jA0O;
        }
        C0622Cm c0622Cm = csA08.A04;
        if ((iA00 & 2) != 0) {
            iA0I = c0768Il.A0I() - 1;
        } else {
            iA0I = c0622Cm.A02;
        }
        int defaultSampleDescriptionIndex = iA00 & 8;
        if (defaultSampleDescriptionIndex != 0) {
            iA0I2 = c0768Il.A0I();
        } else {
            iA0I2 = c0622Cm.A00;
        }
        int defaultSampleDescriptionIndex2 = iA00 & 16;
        if (defaultSampleDescriptionIndex2 != 0) {
            iA0I3 = c0768Il.A0I();
        } else {
            iA0I3 = c0622Cm.A03;
        }
        int defaultSampleSize = iA00 & 32;
        if (defaultSampleSize != 0) {
            iA0I4 = c0768Il.A0I();
        } else {
            iA0I4 = c0622Cm.A01;
        }
        csA08.A07.A07 = new C0622Cm(iA0I, iA0I2, iA0I3, iA0I4);
        return csA08;
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    private void A0C() {
        if (this.A0I == null) {
            this.A0I = new CR[2];
            int i2 = 0;
            CR cr = this.A0M;
            if (cr != null) {
                int emsgTrackOutputCount = 0 + 1;
                this.A0I[0] = cr;
                i2 = emsgTrackOutputCount;
            }
            int emsgTrackOutputCount2 = this.A0J;
            if ((emsgTrackOutputCount2 & 4) != 0) {
                CR[] crArr = this.A0I;
                CH ch = this.A0C;
                int emsgTrackOutputCount3 = this.A0K.size();
                crArr[i2] = ch.ADb(emsgTrackOutputCount3, 4);
                i2++;
            }
            this.A0I = (CR[]) Arrays.copyOf(this.A0I, i2);
            for (CR cr2 : this.A0I) {
                cr2.A5B(A0b);
            }
        }
        if (this.A0H == null) {
            this.A0H = new CR[this.A0V.size()];
            for (int i3 = 0; i3 < this.A0H.length; i3++) {
                CR crADb = this.A0C.ADb(this.A0K.size() + 1 + i3, 3);
                crADb.A5B(this.A0V.get(i3));
                this.A0H[i3] = crADb;
                String[] strArr = A0Y;
                if (strArr[6].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0Y;
                strArr2[7] = "E0z9VN5IoStoNoHPwfepvpkncforV8p8";
                strArr2[7] = "E0z9VN5IoStoNoHPwfepvpkncforV8p8";
            }
        }
    }

    private void A0F(long j2) {
        while (!this.A0U.isEmpty()) {
            C0627Cr c0627CrRemoveFirst = this.A0U.removeFirst();
            this.A03 -= c0627CrRemoveFirst.A00;
            long jA07 = j2 + c0627CrRemoveFirst.A01;
            C0780Ix c0780Ix = this.A0S;
            if (c0780Ix != null) {
                jA07 = c0780Ix.A07(jA07);
            }
            for (CR cr : this.A0I) {
                cr.ACi(jA07, 1, c0627CrRemoveFirst.A00, this.A03, null);
            }
        }
    }

    private void A0G(long j2) throws AI {
        while (!this.A0T.isEmpty() && this.A0T.peek().A00 == j2) {
            A0J(this.A0T.pop());
        }
        A0B();
    }

    private void A0H(CG cg) throws InterruptedException, IOException {
        int i2 = ((int) this.A07) - this.A00;
        C0768Il c0768Il = this.A0E;
        if (c0768Il != null) {
            cg.readFully(c0768Il.A00, 8, i2);
            A0P(new C1184Yt(this.A01, this.A0E), cg.A6p());
        } else {
            cg.ADJ(i2);
        }
        A0G(cg.A6p());
    }

    private void A0I(CG cg) throws InterruptedException, IOException {
        Cs csValueAt = null;
        long j2 = Long.MAX_VALUE;
        int size = this.A0K.size();
        for (int i2 = 0; i2 < size; i2++) {
            D3 d3 = this.A0K.valueAt(i2).A07;
            if (d3.A0B) {
                long j3 = d3.A04;
                if (A0Y[2].charAt(18) != 'K') {
                    throw new RuntimeException();
                }
                String[] strArr = A0Y;
                strArr[3] = "TcDom5";
                strArr[3] = "TcDom5";
                if (j3 < j2) {
                    j2 = d3.A04;
                    csValueAt = this.A0K.valueAt(i2);
                }
            }
        }
        if (csValueAt == null) {
            if (A0Y[3].length() != 6) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Y;
            strArr2[2] = "BU1FqSGZUKIp3lmSYzKBGxc2Z86jKcpe";
            strArr2[2] = "BU1FqSGZUKIp3lmSYzKBGxc2Z86jKcpe";
            this.A02 = 3;
            return;
        }
        long jA6p = j2 - cg.A6p();
        if (A0Y[3].length() != 6) {
            throw new RuntimeException();
        }
        String[] strArr3 = A0Y;
        strArr3[0] = "Cvsa72edMITB5GhT";
        strArr3[0] = "Cvsa72edMITB5GhT";
        int bytesToSkip = (int) jA6p;
        if (bytesToSkip >= 0) {
            cg.ADJ(bytesToSkip);
            csValueAt.A07.A05(cg);
            return;
        }
        throw new AI(A0A(307, 39, 66));
    }

    private void A0J(C1183Ys c1183Ys) throws AI {
        if (((AbstractC0616Cg) c1183Ys).A00 == AbstractC0616Cg.A0j) {
            A0L(c1183Ys);
            return;
        }
        if (((AbstractC0616Cg) c1183Ys).A00 == AbstractC0616Cg.A0i) {
            A0K(c1183Ys);
            return;
        }
        if (this.A0T.isEmpty()) {
            return;
        }
        ArrayDeque<C1183Ys> arrayDeque = this.A0T;
        if (A0Y[1].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A0Y;
        strArr[7] = "6RjYlEZz613sKxZIpZ2APlvoVeArWnyB";
        strArr[7] = "6RjYlEZz613sKxZIpZ2APlvoVeArWnyB";
        arrayDeque.peek().A08(c1183Ys);
    }

    private void A0K(C1183Ys c1183Ys) throws AI {
        A0M(c1183Ys, this.A0K, this.A0J, this.A0W);
        DrmInitData drmInitDataA05 = this.A0L != null ? null : A05(c1183Ys.A02);
        if (drmInitDataA05 != null) {
            int i2 = this.A0K.size();
            for (int i3 = 0; i3 < i2; i3++) {
                this.A0K.valueAt(i3).A07(drmInitDataA05);
            }
        }
        if (this.A0A != -9223372036854775807L) {
            int size = this.A0K.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.A0K.valueAt(i4).A06(this.A0A);
            }
            this.A0A = -9223372036854775807L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A0L(C1183Ys c1183Ys) throws AI {
        IM.A06(this.A0N == null, A0A(532, 20, 11));
        DrmInitData drmInitDataA05 = this.A0L;
        if (drmInitDataA05 == null) {
            drmInitDataA05 = A05(c1183Ys.A02);
        }
        C1183Ys c1183YsA06 = c1183Ys.A06(AbstractC0616Cg.A0m);
        SparseArray sparseArray = new SparseArray();
        long jA01 = -9223372036854775807L;
        int size = c1183YsA06.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1184Yt c1184Yt = c1183YsA06.A02.get(i2);
            int i3 = ((AbstractC0616Cg) c1184Yt).A00;
            if (i3 == AbstractC0616Cg.A1M) {
                Pair<Integer, C0622Cm> pairA03 = A03(c1184Yt.A00);
                int i4 = ((Integer) pairA03.first).intValue();
                sparseArray.put(i4, pairA03.second);
            } else {
                int i5 = ((AbstractC0616Cg) c1184Yt).A00;
                if (i5 == AbstractC0616Cg.A0f) {
                    jA01 = A01(c1184Yt.A00);
                }
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = c1183Ys.A01.size();
        for (int i6 = 0; i6 < size2; i6++) {
            C1183Ys c1183Ys2 = c1183Ys.A01.get(i6);
            int i7 = ((AbstractC0616Cg) c1183Ys2).A00;
            if (i7 == AbstractC0616Cg.A1L) {
                D1 d1A0C = C0621Cl.A0C(c1183Ys2, c1183Ys.A07(AbstractC0616Cg.A0n), jA01, drmInitDataA05, (this.A0J & 16) != 0, false);
                if (d1A0C != null) {
                    int i8 = d1A0C.A00;
                    sparseArray2.put(i8, d1A0C);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.A0K.size() == 0) {
            for (int i9 = 0; i9 < size3; i9++) {
                D1 d1 = (D1) sparseArray2.valueAt(i9);
                CH ch = this.A0C;
                int i10 = d1.A03;
                Cs cs = new Cs(ch.ADb(i9, i10));
                int i11 = d1.A00;
                cs.A08(d1, A06(sparseArray, i11));
                SparseArray<Cs> sparseArray3 = this.A0K;
                int i12 = d1.A00;
                sparseArray3.put(i12, cs);
                this.A08 = Math.max(this.A08, d1.A04);
            }
            A0C();
            if (A0Y[5].length() != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[5] = "d";
            strArr[5] = "d";
            this.A0C.A4x();
            return;
        }
        IM.A04(this.A0K.size() == size3);
        for (int i13 = 0; i13 < size3; i13++) {
            D1 d12 = (D1) sparseArray2.valueAt(i13);
            this.A0K.get(d12.A00).A08(d12, A06(sparseArray, d12.A00));
        }
    }

    public static void A0M(C1183Ys c1183Ys, SparseArray<Cs> sparseArray, int i2, byte[] bArr) throws AI {
        int size = c1183Ys.A01.size();
        for (int i3 = 0; i3 < size; i3++) {
            C1183Ys c1183Ys2 = c1183Ys.A01.get(i3);
            if (((AbstractC0616Cg) c1183Ys2).A00 == AbstractC0616Cg.A1K) {
                A0N(c1183Ys2, sparseArray, i2, bArr);
            }
        }
    }

    public static void A0O(C1183Ys c1183Ys, Cs cs, long j2, int i2) {
        int totalSampleCount = 0;
        int trunSampleCount = 0;
        List<C1184Yt> list = c1183Ys.A02;
        int leafChildrenSize = list.size();
        for (int totalSampleCount2 = 0; totalSampleCount2 < leafChildrenSize; totalSampleCount2++) {
            C1184Yt c1184Yt = list.get(totalSampleCount2);
            int i3 = ((AbstractC0616Cg) c1184Yt).A00;
            int i4 = AbstractC0616Cg.A1N;
            if (A0Y[2].charAt(18) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[0] = "HX3CrwnoNkNpp8Diq6RFqVXtJKh";
            strArr[0] = "HX3CrwnoNkNpp8Diq6RFqVXtJKh";
            if (i3 == i4) {
                C0768Il c0768Il = c1184Yt.A00;
                c0768Il.A0Z(12);
                int iA0I = c0768Il.A0I();
                if (iA0I > 0) {
                    trunSampleCount += iA0I;
                    totalSampleCount++;
                }
            }
        }
        cs.A02 = 0;
        cs.A00 = 0;
        cs.A01 = 0;
        cs.A07.A04(totalSampleCount, trunSampleCount);
        int i5 = 0;
        int iA00 = 0;
        if (A0Y[7].charAt(27) == 'r') {
            String[] strArr2 = A0Y;
            strArr2[1] = "K2a";
            strArr2[1] = "K2a";
        }
        for (int i6 = 0; i6 < leafChildrenSize; i6++) {
            C1184Yt c1184Yt2 = list.get(i6);
            if (((AbstractC0616Cg) c1184Yt2).A00 == AbstractC0616Cg.A1N) {
                iA00 = A00(cs, i5, j2, i2, c1184Yt2.A00, iA00);
                i5++;
            }
        }
    }

    private void A0P(C1184Yt c1184Yt, long j2) throws AI {
        if (!this.A0T.isEmpty()) {
            this.A0T.peek().A09(c1184Yt);
            return;
        }
        if (((AbstractC0616Cg) c1184Yt).A00 == AbstractC0616Cg.A12) {
            Pair<Long, YX> pairA04 = A04(c1184Yt.A00, j2);
            this.A0B = ((Long) pairA04.first).longValue();
            this.A0C.ACn((CO) pairA04.second);
            this.A0F = true;
            return;
        }
        if (((AbstractC0616Cg) c1184Yt).A00 != AbstractC0616Cg.A0P) {
            return;
        }
        A0R(c1184Yt.A00);
    }

    public static void A0Q(D2 d2, C0768Il c0768Il, D3 d3) throws AI {
        int flags = d2.A00;
        c0768Il.A0Z(8);
        if ((AbstractC0616Cg.A00(c0768Il.A09()) & 1) == 1) {
            c0768Il.A0a(8);
        }
        int vectorSize = c0768Il.A0F();
        int iA0I = c0768Il.A0I();
        String[] strArr = A0Y;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0Y;
        strArr2[3] = "qY4fk5";
        strArr2[3] = "qY4fk5";
        if (iA0I == d3.A00) {
            int i2 = 0;
            if (vectorSize == 0) {
                boolean[] zArr = d3.A0H;
                for (int sampleCount = 0; sampleCount < iA0I; sampleCount++) {
                    int totalSize = c0768Il.A0F();
                    i2 += totalSize;
                    zArr[sampleCount] = totalSize > flags;
                }
            } else {
                boolean z = vectorSize > flags;
                int i3 = vectorSize * iA0I;
                i2 = 0 + i3;
                Arrays.fill(d3.A0H, 0, iA0I, z);
            }
            d3.A03(i2);
            return;
        }
        throw new AI(A0A(290, 17, 120) + iA0I + A0A(0, 2, 53) + d3.A00);
    }

    private void A0R(C0768Il c0768Il) {
        CR[] crArr = this.A0I;
        if (crArr == null || crArr.length == 0) {
            return;
        }
        c0768Il.A0Z(12);
        int iA05 = c0768Il.A05();
        c0768Il.A0R();
        c0768Il.A0R();
        long jA0N = c0768Il.A0N();
        long timescale = c0768Il.A0N();
        long jA0G = J1.A0G(timescale, 1000000L, jA0N);
        for (CR cr : this.A0I) {
            c0768Il.A0Z(12);
            cr.ACh(c0768Il, iA05);
        }
        long j2 = this.A0B;
        if (j2 != -9223372036854775807L) {
            long jA07 = j2 + jA0G;
            C0780Ix c0780Ix = this.A0S;
            if (c0780Ix != null) {
                jA07 = c0780Ix.A07(jA07);
            }
            for (CR cr2 : this.A0I) {
                cr2.ACi(jA07, 1, iA05, 0, null);
            }
            return;
        }
        this.A0U.addLast(new C0627Cr(jA0G, iA05));
        this.A03 += iA05;
    }

    public static void A0S(C0768Il c0768Il, int i2, D3 d3) throws AI {
        c0768Il.A0Z(i2 + 8);
        int iA00 = AbstractC0616Cg.A00(c0768Il.A09());
        if ((iA00 & 1) == 0) {
            boolean z = (iA00 & 2) != 0;
            int iA0I = c0768Il.A0I();
            int i3 = d3.A00;
            if (A0Y[2].charAt(18) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[6] = "UNCiZzJs5PDRpvixsYfSSk1mhxuZgiq";
            strArr[4] = "wrSUtL8XPGusZqeHm";
            if (iA0I == i3) {
                Arrays.fill(d3.A0H, 0, iA0I, z);
                int sampleCount = c0768Il.A05();
                d3.A03(sampleCount);
                d3.A06(c0768Il);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(A0A(290, 17, 120));
            sb.append(iA0I);
            sb.append(A0A(0, 2, 53));
            int sampleCount2 = d3.A00;
            sb.append(sampleCount2);
            throw new AI(sb.toString());
        }
        throw new AI(A0A(381, 56, 78));
    }

    public static void A0T(C0768Il c0768Il, D3 d3) throws AI {
        long jA0O;
        c0768Il.A0Z(8);
        int iA09 = c0768Il.A09();
        if ((AbstractC0616Cg.A00(iA09) & 1) == 1) {
            c0768Il.A0a(8);
        }
        int iA0I = c0768Il.A0I();
        int flags = A0Y[3].length();
        if (flags != 6) {
            throw new RuntimeException();
        }
        String[] strArr = A0Y;
        strArr[3] = "xMtqR0";
        strArr[3] = "xMtqR0";
        if (iA0I == 1) {
            int iA01 = AbstractC0616Cg.A01(iA09);
            long j2 = d3.A04;
            if (iA01 == 0) {
                jA0O = c0768Il.A0N();
            } else {
                jA0O = c0768Il.A0O();
            }
            long j3 = j2 + jA0O;
            String[] strArr2 = A0Y;
            String str = strArr2[6];
            String str2 = strArr2[4];
            int flags2 = str.length();
            if (flags2 != str2.length()) {
                String[] strArr3 = A0Y;
                strArr3[6] = "QBYjlSuWWzNHcmXjWc7avhw4MqaHk82";
                strArr3[4] = "P5zbNSbq1MUS3wdHf";
                d3.A04 = j3;
                return;
            }
            String[] strArr4 = A0Y;
            strArr4[7] = "vg5EJJPWiTbIFzTVTJFrvfHkMClrP8RJ";
            strArr4[7] = "vg5EJJPWiTbIFzTVTJFrvfHkMClrP8RJ";
            d3.A04 = j3;
            return;
        }
        throw new AI(A0A(552, 29, 95) + iA0I);
    }

    public static void A0U(C0768Il c0768Il, D3 d3) throws AI {
        A0S(c0768Il, 0, d3);
    }

    public static void A0V(C0768Il c0768Il, D3 d3, byte[] bArr) throws AI {
        c0768Il.A0Z(8);
        c0768Il.A0d(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0c)) {
            return;
        }
        A0S(c0768Il, 16, d3);
    }

    public static void A0W(C0768Il c0768Il, C0768Il c0768Il2, String str, D3 d3) throws AI {
        c0768Il.A0Z(8);
        int iA09 = c0768Il.A09();
        if (c0768Il.A09() != A0a) {
            return;
        }
        if (AbstractC0616Cg.A01(iA09) == 1) {
            c0768Il.A0a(4);
        }
        int iA092 = c0768Il.A09();
        String[] strArr = A0Y;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0Y;
        strArr2[3] = "cve2FA";
        strArr2[3] = "cve2FA";
        if (iA092 == 1) {
            c0768Il2.A0Z(8);
            int iA093 = c0768Il2.A09();
            if (c0768Il2.A09() != A0a) {
                return;
            }
            int iA01 = AbstractC0616Cg.A01(iA093);
            if (A0Y[1].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0Y;
            strArr3[7] = "iX8BjoZjE8Q6Igd9BCVMMRG15zWrcCbA";
            strArr3[7] = "iX8BjoZjE8Q6Igd9BCVMMRG15zWrcCbA";
            if (iA01 == 1) {
                if (c0768Il2.A0N() == 0) {
                    throw new AI(A0A(609, 55, 42));
                }
            } else if (iA01 >= 2) {
                c0768Il2.A0a(4);
            }
            if (c0768Il2.A0N() == 1) {
                c0768Il2.A0a(1);
                int iA0F = c0768Il2.A0F();
                int i2 = (iA0F & 240) >> 4;
                int i3 = iA0F & 15;
                boolean z = c0768Il2.A0F() == 1;
                if (!z) {
                    return;
                }
                int iA0F2 = c0768Il2.A0F();
                byte[] bArr = new byte[16];
                int perSampleIvSize = bArr.length;
                c0768Il2.A0d(bArr, 0, perSampleIvSize);
                int skipByteBlock = A0Y[7].charAt(27);
                if (skipByteBlock != 114) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0Y;
                strArr4[0] = "v2evuoi5ipUorqJI1yS0NRy";
                strArr4[0] = "v2evuoi5ipUorqJI1yS0NRy";
                byte[] bArr2 = null;
                if (z && iA0F2 == 0) {
                    int iA0F3 = c0768Il2.A0F();
                    bArr2 = new byte[iA0F3];
                    c0768Il2.A0d(bArr2, 0, iA0F3);
                }
                d3.A0A = true;
                d3.A08 = new D2(z, str, iA0F2, bArr, i2, i3, bArr2);
                return;
            }
            throw new AI(A0A(89, 39, 21));
        }
        throw new AI(A0A(50, 39, 120));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0X(int r4) {
        /*
            int r0 = com.facebook.ads.redexgen.X.AbstractC0616Cg.A0j
            if (r4 == r0) goto L79
            int r3 = com.facebook.ads.redexgen.X.AbstractC0616Cg.A1L
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1189Yy.A0Y
            r0 = 2
            r1 = r1[r0]
            r0 = 18
            char r1 = r1.charAt(r0)
            r0 = 75
            if (r1 == r0) goto L1b
        L15:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L1b:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1189Yy.A0Y
            java.lang.String r1 = "T3RhZdPh4OhUklIpt3KHsdu4Qu4SXFxX"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "T3RhZdPh4OhUklIpt3KHsdu4Qu4SXFxX"
            r0 = 2
            r2[r0] = r1
            if (r4 == r3) goto L79
            int r3 = com.facebook.ads.redexgen.X.AbstractC0616Cg.A0d
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1189Yy.A0Y
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 3
            if (r1 == r0) goto L58
            if (r4 == r3) goto L79
        L39:
            int r0 = com.facebook.ads.redexgen.X.AbstractC0616Cg.A0h
            if (r4 == r0) goto L79
            int r0 = com.facebook.ads.redexgen.X.AbstractC0616Cg.A16
            if (r4 == r0) goto L79
            int r0 = com.facebook.ads.redexgen.X.AbstractC0616Cg.A0i
            if (r4 == r0) goto L79
            int r0 = com.facebook.ads.redexgen.X.AbstractC0616Cg.A1K
            if (r4 == r0) goto L79
            int r3 = com.facebook.ads.redexgen.X.AbstractC0616Cg.A0m
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1189Yy.A0Y
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L67
            goto L15
        L58:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1189Yy.A0Y
            java.lang.String r1 = "W"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "W"
            r0 = 0
            r2[r0] = r1
            if (r4 == r3) goto L79
            goto L39
        L67:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1189Yy.A0Y
            java.lang.String r1 = "P"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "P"
            r0 = 5
            r2[r0] = r1
            if (r4 == r3) goto L79
            int r0 = com.facebook.ads.redexgen.X.AbstractC0616Cg.A0N
            if (r4 != r0) goto L7b
        L79:
            r0 = 1
        L7a:
            return r0
        L7b:
            r0 = 0
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1189Yy.A0X(int):boolean");
    }

    public static boolean A0Y(int i2) {
        return i2 == AbstractC0616Cg.A0V || i2 == AbstractC0616Cg.A0c || i2 == AbstractC0616Cg.A0n || i2 == AbstractC0616Cg.A12 || i2 == AbstractC0616Cg.A1A || i2 == AbstractC0616Cg.A1H || i2 == AbstractC0616Cg.A1I || i2 == AbstractC0616Cg.A1J || i2 == AbstractC0616Cg.A1M || i2 == AbstractC0616Cg.A1N || i2 == AbstractC0616Cg.A0r || i2 == AbstractC0616Cg.A0u || i2 == AbstractC0616Cg.A0t || i2 == AbstractC0616Cg.A10 || i2 == AbstractC0616Cg.A1Q || i2 == AbstractC0616Cg.A0x || i2 == AbstractC0616Cg.A11 || i2 == AbstractC0616Cg.A0O || i2 == AbstractC0616Cg.A0f || i2 == AbstractC0616Cg.A0P;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0Z(com.facebook.ads.redexgen.X.CG r11) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1189Yy.A0Z(com.facebook.ads.redexgen.X.CG):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean A0a(CG cg) throws InterruptedException, IOException {
        int iACg;
        int i2 = 4;
        int i3 = 1;
        int i4 = 0;
        if (this.A02 == 3) {
            if (this.A0D == null) {
                Cs csA07 = A07(this.A0K);
                if (csA07 == null) {
                    int iA6p = (int) (this.A09 - cg.A6p());
                    if (iA6p >= 0) {
                        cg.ADJ(iA6p);
                        A0B();
                        return false;
                    }
                    throw new AI(A0A(346, 35, 12));
                }
                int iA6p2 = (int) (csA07.A07.A0G[csA07.A02] - cg.A6p());
                if (iA6p2 < 0) {
                    Log.w(A0A(128, 22, 14), A0A(150, 40, 24));
                    iA6p2 = 0;
                }
                cg.ADJ(iA6p2);
                this.A0D = csA07;
            }
            this.A06 = this.A0D.A07.A0D[this.A0D.A01];
            if (this.A0D.A01 < this.A0D.A03) {
                cg.ADJ(this.A06);
                this.A0D.A01();
                if (!this.A0D.A09()) {
                    this.A0D = null;
                }
                this.A02 = 3;
                return true;
            }
            Cs cs = this.A0D;
            if (A0Y[3].length() != 6) {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[3] = "st8dZG";
            strArr[3] = "st8dZG";
            if (cs.A05.A02 == 1) {
                this.A06 -= 8;
                cg.ADJ(8);
            }
            this.A04 = this.A0D.A04();
            this.A06 += this.A04;
            this.A02 = 4;
            this.A05 = 0;
        }
        D3 d3 = this.A0D.A07;
        D1 d1 = this.A0D.A05;
        CR cr = this.A0D.A06;
        int i5 = this.A0D.A01;
        long jA01 = d3.A01(i5) * 1000;
        C0780Ix c0780Ix = this.A0S;
        if (c0780Ix != null) {
            jA01 = c0780Ix.A07(jA01);
        }
        if (d1.A01 == 0) {
            while (true) {
                int i6 = this.A04;
                int i7 = this.A06;
                if (i6 >= i7) {
                    break;
                }
                this.A04 += cr.ACg(cg, i7 - i6, false);
            }
        } else {
            byte[] bArr = this.A0Q.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i8 = d1.A01 + 1;
            int i9 = 4 - d1.A01;
            while (this.A04 < this.A06) {
                int i10 = this.A05;
                if (i10 == 0) {
                    cg.readFully(bArr, i9, i8);
                    this.A0Q.A0Z(i4);
                    this.A05 = this.A0Q.A0I() - i3;
                    this.A0R.A0Z(i4);
                    cr.ACh(this.A0R, i2);
                    cr.ACh(this.A0Q, i3);
                    this.A0G = this.A0H.length > 0 && C0764Ih.A0D(d1.A07.A0O, bArr[i2]);
                    this.A04 += 5;
                    this.A06 += i9;
                } else {
                    if (this.A0G) {
                        this.A0P.A0X(i10);
                        cg.readFully(this.A0P.A00, i4, this.A05);
                        cr.ACh(this.A0P, this.A05);
                        iACg = this.A05;
                        int iA02 = C0764Ih.A02(this.A0P.A00, this.A0P.A08());
                        this.A0P.A0Z(A0A(686, 10, 13).equals(d1.A07.A0O) ? 1 : 0);
                        this.A0P.A0Y(iA02);
                        C0718Gl.A04(jA01, this.A0P, this.A0H);
                    } else {
                        iACg = cr.ACg(cg, i10, false);
                    }
                    this.A04 += iACg;
                    this.A05 -= iACg;
                    i2 = 4;
                    i3 = 1;
                    i4 = 0;
                }
            }
        }
        boolean z = d3.A0I[i5];
        CQ cq = null;
        int i11 = z;
        if (d3.A0A) {
            int i12 = (z ? 1 : 0) | 1073741824;
            cq = (d3.A08 != null ? d3.A08 : d1.A00(d3.A07.A02)).A01;
            i11 = i12;
        }
        cr.ACi(jA01, i11, this.A06, 0, cq);
        A0F(jA01);
        if (!this.A0D.A09()) {
            this.A0D = null;
        }
        this.A02 = 3;
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void A7V(CH ch) {
        this.A0C = ch;
        D1 d1 = this.A0N;
        if (d1 != null) {
            Cs cs = new Cs(ch.ADb(0, d1.A03));
            cs.A08(this.A0N, new C0622Cm(0, 0, 0, 0));
            this.A0K.put(0, cs);
            A0C();
            this.A0C.A4x();
        }
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final int AC0(CG cg, CM cm) throws InterruptedException, IOException {
        while (true) {
            int i2 = this.A02;
            if (i2 != 0) {
                if (A0Y[2].charAt(18) != 'K') {
                    throw new RuntimeException();
                }
                String[] strArr = A0Y;
                strArr[2] = "Ub8SUYMnE0bQG8CZo0KwdlTNogw2mbM0";
                strArr[2] = "Ub8SUYMnE0bQG8CZo0KwdlTNogw2mbM0";
                if (i2 == 1) {
                    A0H(cg);
                } else if (i2 != 2) {
                    boolean zA0a = A0a(cg);
                    if (A0Y[7].charAt(27) == 'r') {
                        String[] strArr2 = A0Y;
                        strArr2[5] = "b";
                        strArr2[5] = "b";
                        if (zA0a) {
                            return 0;
                        }
                    } else if (zA0a) {
                        return 0;
                    }
                } else {
                    A0I(cg);
                }
            } else if (!A0Z(cg)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final void ACm(long j2, long j3) {
        int size = this.A0K.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.A0K.valueAt(i2).A05();
        }
        this.A0U.clear();
        this.A03 = 0;
        this.A0A = j3;
        this.A0T.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.X.CF
    public final boolean ADK(CG cg) throws InterruptedException, IOException {
        return C0634Cz.A04(cg);
    }
}
