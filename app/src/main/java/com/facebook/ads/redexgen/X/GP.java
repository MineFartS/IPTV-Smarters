package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class GP {
    public static byte[] A07;
    public static String[] A08;
    public final long A00;
    public final long A01;
    public final Format A02;
    public final String A03;
    public final String A04;
    public final List<GK> A05;
    public final GN A06;

    static {
        A04();
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-11, -25, -23, -17, -25, -16, -10, -60, -29, -11, -25, -94, -17, -9, -11, -10, -94, -28, -25, -94, -15, -24, -94, -10, -5, -14, -25, -94, -43, -21, -16, -23, -18, -25, -43, -25, -23, -17, -25, -16, -10, -60, -29, -11, -25, -94, -15, -12, -94, -49, -9, -18, -10, -21, -43, -25, -23, -17, -25, -16, -10, -60, -29, -11, -25};
        if (A08[0].length() == 24) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[1] = "HSR1AlegXFyx6Ykof879UyMIHg1PZ4XD";
        strArr[4] = "o6R8bRVJcf7anRZIfEJxcS1nYJRlrVIE";
    }

    public static void A04() {
        A08 = new String[]{"EXBmz1XQ6SezJdcLyJUFrH0cj", "MWo3y3hb0MBWDkSxf3yLlfYNeqli5rg1", "qLfrhkjowUJwOfly5BnGf78e1AF6747u", "P7b2VY2tZmDMmJAa9ErVeAhYgVhaxvVN", "uwRNkM0YCJHsxJiKfLrY7gIxnVUeA5do", "raTQlm4cfg7vGpKCb1rXGyza0cFhmMYO", "b06MI1QmqfC", "xjnunb8R7S5ForI8Cs6WK8D"};
    }

    public abstract GC A05();

    public abstract GN A07();

    public abstract String A08();

    public GP(String str, long j2, Format format, String str2, GS gs, List<GK> list) {
        List<GK> listUnmodifiableList;
        this.A04 = str;
        this.A01 = j2;
        this.A02 = format;
        this.A03 = str2;
        if (list == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list);
        }
        this.A05 = listUnmodifiableList;
        this.A06 = gs.A01(this);
        this.A00 = gs.A00();
    }

    public static GP A00(String str, long j2, Format format, String str2, GS gs, List<GK> list) {
        return A01(str, j2, format, str2, gs, list, null);
    }

    public static GP A01(String str, long j2, Format format, String str2, GS gs, List<GK> list, String str3) {
        if (gs instanceof C1262an) {
            return new C1260al(str, j2, format, str2, (C1262an) gs, list, str3, -1L);
        }
        if (gs instanceof AbstractC1261am) {
            return new C1259ak(str, j2, format, str2, (AbstractC1261am) gs, list);
        }
        throw new IllegalArgumentException(A02(0, 65, 91));
    }

    public final GN A06() {
        return this.A06;
    }
}
