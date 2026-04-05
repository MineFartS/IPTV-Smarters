package com.facebook.ads.redexgen.X;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1278b3 implements InterfaceC0708Gb {
    public static byte[] A04;
    public final int A00;
    public final List<C1277b2> A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 125);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{5};
    }

    public C1278b3(List<C1277b2> list) {
        this.A01 = list;
        this.A00 = list.size();
        this.A02 = new long[this.A00 * 2];
        for (int i2 = 0; i2 < this.A00; i2++) {
            C1277b2 c1277b2 = list.get(i2);
            int i3 = i2 * 2;
            this.A02[i3] = c1277b2.A01;
            this.A02[i3 + 1] = c1277b2.A00;
        }
        long[] jArr = this.A02;
        this.A03 = Arrays.copyOf(jArr, jArr.length);
        Arrays.sort(this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final List<C0707Ga> A5r(long j2) {
        ArrayList arrayList = null;
        C1277b2 cue = null;
        SpannableStringBuilder normalCueTextBuilder = null;
        for (int i2 = 0; i2 < this.A00; i2++) {
            long[] jArr = this.A02;
            if (jArr[i2 * 2] <= j2 && j2 < jArr[(i2 * 2) + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C1277b2 c1277b2 = this.A01.get(i2);
                if (c1277b2.A00()) {
                    if (cue == null) {
                        cue = c1277b2;
                    } else {
                        String strA00 = A00(0, 1, 126);
                        if (normalCueTextBuilder == null) {
                            normalCueTextBuilder = new SpannableStringBuilder();
                            normalCueTextBuilder.append(cue.A0C).append((CharSequence) strA00).append(c1277b2.A0C);
                        } else {
                            normalCueTextBuilder.append((CharSequence) strA00).append(c1277b2.A0C);
                        }
                    }
                } else {
                    arrayList.add(c1277b2);
                }
            }
        }
        if (normalCueTextBuilder != null) {
            arrayList.add(new C1277b2(normalCueTextBuilder));
        } else if (cue != null) {
            arrayList.add(cue);
        }
        if (arrayList != null) {
            return arrayList;
        }
        return Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final long A6G(int i2) {
        boolean z = true;
        IM.A03(i2 >= 0);
        if (i2 >= this.A03.length) {
            z = false;
        }
        IM.A03(z);
        return this.A03[i2];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final int A6H() {
        return this.A03.length;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0708Gb
    public final int A6b(long j2) {
        int iA0A = J1.A0A(this.A03, j2, false, false);
        if (iA0A < this.A03.length) {
            return iA0A;
        }
        return -1;
    }
}
