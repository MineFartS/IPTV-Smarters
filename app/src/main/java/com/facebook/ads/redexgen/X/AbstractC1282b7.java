package com.facebook.ads.redexgen.X;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1282b7 extends HW {
    public static String[] A01;

    @Nullable
    public HR A00;

    static {
        A0S();
    }

    public static void A0S() {
        A01 = new String[]{"26JblF4b6dorFS8jU2vwriUxZ0G71mwq", "Xnpi2o2sUEOze", "R71e3dTOAhzB09tZHggtqRTS0V3by", "x11tshWAsx1g8", "baPvwG8wSWpB2aFi4", "NgcUJ4cAOsbj9", "II", "FdNrM275eXYBmZtzCUl1db95x7ONP"};
    }

    public abstract Pair<AY[], HT[]> A0X(HR hr, int[][][] iArr, int[] iArr2) throws C05699z;

    public static int A0R(AX[] axArr, TrackGroup trackGroup) throws C05699z {
        int rendererIndex = axArr.length;
        int i2 = 0;
        for (int trackIndex = 0; trackIndex < axArr.length; trackIndex++) {
            AX ax = axArr[trackIndex];
            for (int i3 = 0; i3 < trackGroup.A01; i3++) {
                int formatSupportLevel = ax.ADV(trackGroup.A02(i3)) & 7;
                if (formatSupportLevel > i2) {
                    rendererIndex = trackIndex;
                    i2 = formatSupportLevel;
                    if (i2 == 4) {
                        return rendererIndex;
                    }
                }
            }
        }
        return rendererIndex;
    }

    public static int[] A0T(AX ax, TrackGroup trackGroup) throws C05699z {
        int[] iArr = new int[trackGroup.A01];
        for (int i2 = 0; i2 < trackGroup.A01; i2++) {
            iArr[i2] = ax.ADV(trackGroup.A02(i2));
        }
        return iArr;
    }

    public static int[] A0U(AX[] axArr) throws C05699z {
        int[] iArr = new int[axArr.length];
        int i2 = 0;
        while (true) {
            int length = iArr.length;
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[5];
            int length2 = str.length();
            int i3 = str2.length();
            if (length2 == i3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "xB4ZDOqJN2K9OUw5kZCJNg4ll7dteaQM";
            strArr2[0] = "xB4ZDOqJN2K9OUw5kZCJNg4ll7dteaQM";
            if (i2 < length) {
                int i4 = axArr[i2].ADX();
                iArr[i2] = i4;
                i2++;
            } else {
                return iArr;
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:16:0x005c */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0011 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0029 */
    @Override // com.facebook.ads.redexgen.X.HW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.HX A0V(com.facebook.ads.redexgen.X.AX[] r12, com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r13) throws com.facebook.ads.redexgen.X.C05699z {
        /*
            r11 = this;
            int r0 = r12.length
            int r0 = r0 + 1
            int[] r4 = new int[r0]
            int r0 = r12.length
            int r0 = r0 + 1
            com.facebook.ads.internal.exoplayer2.source.TrackGroup[][] r2 = new com.facebook.ads.internal.exoplayer2.source.TrackGroup[r0][]
            int r0 = r12.length
            int r0 = r0 + 1
            int[][][] r9 = new int[r0][][]
            r1 = 0
        L10:
            int r0 = r2.length
            if (r1 >= r0) goto L22
            int r0 = r13.A01
            com.facebook.ads.internal.exoplayer2.source.TrackGroup[] r0 = new com.facebook.ads.internal.exoplayer2.source.TrackGroup[r0]
            r2[r1] = r0
            int r0 = r13.A01
            int[][] r0 = new int[r0][]
            r9[r1] = r0
            int r1 = r1 + 1
            goto L10
        L22:
            int[] r8 = A0U(r12)
            r7 = 0
        L27:
            int r0 = r13.A01
            if (r7 >= r0) goto L54
            com.facebook.ads.internal.exoplayer2.source.TrackGroup r6 = r13.A02(r7)
            int r5 = A0R(r12, r6)
            int r0 = r12.length
            if (r5 != r0) goto L4d
            int r0 = r6.A01
            int[] r3 = new int[r0]
        L3a:
            r1 = r4[r5]
            r0 = r2[r5]
            r0[r1] = r6
            r0 = r9[r5]
            r0[r1] = r3
            r0 = r4[r5]
            int r0 = r0 + 1
            r4[r5] = r0
            int r7 = r7 + 1
            goto L27
        L4d:
            r0 = r12[r5]
            int[] r3 = A0T(r0, r6)
            goto L3a
        L54:
            int r0 = r12.length
            com.facebook.ads.internal.exoplayer2.source.TrackGroupArray[] r7 = new com.facebook.ads.internal.exoplayer2.source.TrackGroupArray[r0]
            int r0 = r12.length
            int[] r6 = new int[r0]
            r5 = 0
        L5b:
            int r0 = r12.length
            if (r5 >= r0) goto L84
            r3 = r4[r5]
            com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r1 = new com.facebook.ads.internal.exoplayer2.source.TrackGroupArray
            r0 = r2[r5]
            java.lang.Object[] r0 = com.facebook.ads.redexgen.X.J1.A0o(r0, r3)
            com.facebook.ads.internal.exoplayer2.source.TrackGroup[] r0 = (com.facebook.ads.internal.exoplayer2.source.TrackGroup[]) r0
            r1.<init>(r0)
            r7[r5] = r1
            r0 = r9[r5]
            java.lang.Object[] r0 = com.facebook.ads.redexgen.X.J1.A0o(r0, r3)
            int[][] r0 = (int[][]) r0
            r9[r5] = r0
            r0 = r12[r5]
            int r0 = r0.A7F()
            r6[r5] = r0
            int r5 = r5 + 1
            goto L5b
        L84:
            int r0 = r12.length
            r1 = r4[r0]
            com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r10 = new com.facebook.ads.internal.exoplayer2.source.TrackGroupArray
            int r0 = r12.length
            r0 = r2[r0]
            java.lang.Object[] r0 = com.facebook.ads.redexgen.X.J1.A0o(r0, r1)
            com.facebook.ads.internal.exoplayer2.source.TrackGroup[] r0 = (com.facebook.ads.internal.exoplayer2.source.TrackGroup[]) r0
            r10.<init>(r0)
            com.facebook.ads.redexgen.X.HR r5 = new com.facebook.ads.redexgen.X.HR
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = r11
            android.util.Pair r0 = r0.A0X(r5, r9, r8)
            com.facebook.ads.redexgen.X.HX r2 = new com.facebook.ads.redexgen.X.HX
            java.lang.Object r1 = r0.first
            com.facebook.ads.redexgen.X.AY[] r1 = (com.facebook.ads.redexgen.X.AY[]) r1
            java.lang.Object r0 = r0.second
            com.facebook.ads.redexgen.X.HT[] r0 = (com.facebook.ads.redexgen.X.HT[]) r0
            r2.<init>(r1, r0, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC1282b7.A0V(com.facebook.ads.redexgen.X.AX[], com.facebook.ads.internal.exoplayer2.source.TrackGroupArray):com.facebook.ads.redexgen.X.HX");
    }

    @Override // com.facebook.ads.redexgen.X.HW
    public final void A0W(Object obj) {
        this.A00 = (HR) obj;
    }
}
