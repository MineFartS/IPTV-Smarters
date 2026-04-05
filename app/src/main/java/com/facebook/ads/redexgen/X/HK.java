package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HK implements Comparable<HK> {
    public static String[] A07;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final DefaultTrackSelector$Parameters A06;

    static {
        A00();
    }

    public static void A00() {
        A07 = new String[]{"UOhnAWHUvWrKh39blc2", "rJoZ4rjs3", "mwxErCj8CFXQtRdeT7I", "OMBsSVN1m", "xKR0iM7hb", "rY23JmNnbt4", "7JhRM9", "FTdecT"};
    }

    public HK(Format format, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, int i2) {
        this.A06 = defaultTrackSelector$Parameters;
        this.A05 = AM.A0I(i2, false) ? 1 : 0;
        this.A03 = AM.A0L(format, defaultTrackSelector$Parameters.A07) ? 1 : 0;
        this.A02 = (format.A0D & 1) != 0 ? 1 : 0;
        this.A01 = format.A05;
        this.A04 = format.A0C;
        this.A00 = format.A04;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compareTo(HK hk) {
        int i2 = this.A05;
        int i3 = hk.A05;
        if (i2 != i3) {
            return AM.A01(i2, i3);
        }
        int i4 = this.A03;
        int i5 = hk.A03;
        if (i4 != i5) {
            return AM.A01(i4, i5);
        }
        int i6 = this.A02;
        int i7 = hk.A02;
        if (i6 != i7) {
            return AM.A01(i6, i7);
        }
        if (this.A06.A0D) {
            return AM.A01(hk.A00, this.A00);
        }
        int i8 = this.A05 != 1 ? -1 : 1;
        int i9 = this.A01;
        int i10 = hk.A01;
        String[] strArr = A07;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[3] = "q1nzmC2W0";
        strArr2[3] = "q1nzmC2W0";
        if (i9 != i10) {
            return AM.A01(i9, i10) * i8;
        }
        int i11 = this.A04;
        int i12 = hk.A04;
        return i11 != i12 ? AM.A01(i11, i12) * i8 : AM.A01(this.A00, hk.A00) * i8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HK hk = (HK) obj;
        if (this.A05 == hk.A05 && this.A03 == hk.A03 && this.A02 == hk.A02 && this.A01 == hk.A01 && this.A04 == hk.A04) {
            int i2 = this.A00;
            if (A07[5].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[0] = "5gFFNpUtyAKNtlVcilC";
            strArr[2] = "oFDw9vE2Y7jHYxyqfLD";
            if (i2 == hk.A00) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = ((this.A05 * 31) + this.A03) * 31;
        int result = this.A02;
        int i3 = (((i2 + result) * 31) + this.A01) * 31;
        int result2 = this.A04;
        return ((i3 + result2) * 31) + this.A00;
    }
}
