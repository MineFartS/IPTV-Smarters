package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05408v {
    public static byte[] A05;
    public C05418w A01;

    @Nullable
    public String A02;

    @Nullable
    public String A03;
    public int A00 = 0;
    public List<C05388t> A04 = new ArrayList();

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 109);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{79, 88};
    }

    public C05408v(C05418w c05418w, @Nullable String str, @Nullable String str2) {
        this.A01 = c05418w;
        this.A03 = str;
        this.A02 = str2;
    }

    public final int A02() {
        return this.A04.size();
    }

    public final long A03() {
        C05418w c05418w = this.A01;
        if (c05418w != null) {
            return c05418w.A0C() + ((long) this.A01.A03());
        }
        return -1L;
    }

    public final C05388t A04() {
        if (this.A00 < this.A04.size()) {
            this.A00++;
            return this.A04.get(this.A00 - 1);
        }
        return null;
    }

    public final C05418w A05() {
        return this.A01;
    }

    @Nullable
    public final String A06() {
        return this.A02;
    }

    @Nullable
    public final String A07() {
        int i2 = this.A00;
        if (i2 > 0 && i2 <= this.A04.size()) {
            return this.A04.get(this.A00 - 1).A06().optString(A00(0, 2, 65));
        }
        return null;
    }

    @Nullable
    public final String A08() {
        return this.A03;
    }

    public final void A09(C05388t c05388t) {
        this.A04.add(c05388t);
    }

    public final boolean A0A() {
        return this.A01 == null || C0848Lr.A00() > this.A01.A0C() + ((long) this.A01.A03());
    }
}
