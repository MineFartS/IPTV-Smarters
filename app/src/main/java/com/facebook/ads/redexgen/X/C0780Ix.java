package com.facebook.ads.redexgen.X;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0780Ix {
    public static String[] A03;
    public long A00;
    public long A01;
    public volatile long A02 = -9223372036854775807L;

    static {
        A02();
    }

    public static void A02() {
        A03 = new String[]{"65cMlekakVUIMLtYd2qVn8RcZ0adnk1M", "UjyIGuEYWfjJHNBaVK1tpUnDezxozlQO", "8TtcshNmMrpBHoTy3Jx7PSsI4WaoiE", "opOgbEamfowehMTo5e", "TsJIn0", "EhVZCkSBDk6mMyTg5zdzmerfhGbFv5ld", "Eri8EAzeqOX6dLYscfL5OJU1HmdTNDem", "nefT9Ttk6cyPRqOW12bbBLbtHnReAUgq"};
    }

    public C0780Ix(long j2) {
        A03(j2);
    }

    public static long A00(long j2) {
        return (1000000 * j2) / 90000;
    }

    public static long A01(long j2) {
        return (90000 * j2) / 1000000;
    }

    private final synchronized void A03(long j2) {
        long j3 = this.A02;
        if (A03[4].length() != 6) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[4] = "LzgDaR";
        strArr[4] = "LzgDaR";
        IM.A04(j3 == -9223372036854775807L);
        this.A00 = j2;
    }

    public final long A04() {
        return this.A00;
    }

    public final long A05() {
        if (this.A02 != -9223372036854775807L) {
            long j2 = this.A02;
            String[] strArr = A03;
            if (strArr[1].charAt(3) == strArr[7].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "a2e4BTQtBTIbtdID7RtsbeiIoOOOiE5j";
            strArr2[7] = "T6brmwdtMhRZgX81oiPgAK3x7yaW2pG8";
            return this.A01 + j2;
        }
        long j3 = this.A00;
        String[] strArr3 = A03;
        if (strArr3[6].charAt(9) == strArr3[0].charAt(9)) {
            throw new RuntimeException();
        }
        String[] strArr4 = A03;
        strArr4[4] = "vWaoyi";
        strArr4[4] = "vWaoyi";
        if (j3 != Long.MAX_VALUE) {
            return j3;
        }
        return -9223372036854775807L;
    }

    public final long A06() {
        if (this.A00 == Long.MAX_VALUE) {
            return 0L;
        }
        long j2 = this.A02;
        if (A03[4].length() != 6) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[1] = "iob8LfiWSdIXeaYrhNgyOnbM2i0L2mJ3";
        strArr[7] = "rhCREaYiIoksCalrOiAV4Z6SpW6PjrFh";
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.A01;
    }

    public final long A07(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.A02 != -9223372036854775807L) {
            this.A02 = j2;
        } else {
            long j3 = this.A00;
            if (j3 != Long.MAX_VALUE) {
                this.A01 = j3 - j2;
            }
            synchronized (this) {
                this.A02 = j2;
                notifyAll();
            }
        }
        return this.A01 + j2;
    }

    public final long A08(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.A02 != -9223372036854775807L) {
            long jA01 = A01(this.A02);
            long closestWrapCount = (IjkMediaMeta.AV_CH_WIDE_RIGHT + jA01) / IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT;
            long j3 = ((closestWrapCount - 1) * IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT) + j2;
            long j4 = (IjkMediaMeta.AV_CH_SURROUND_DIRECT_LEFT * closestWrapCount) + j2;
            long jAbs = Math.abs(j3 - jA01);
            long ptsWrapBelow = Math.abs(j4 - jA01);
            if (jAbs >= ptsWrapBelow) {
                j3 = j4;
            }
            j2 = j3;
        }
        return A07(A00(j2));
    }

    public final void A09() {
        this.A02 = -9223372036854775807L;
    }
}
