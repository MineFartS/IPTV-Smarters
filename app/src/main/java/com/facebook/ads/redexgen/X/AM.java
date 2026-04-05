package com.facebook.ads.redexgen.X;

import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AM extends AbstractC1282b7 {
    public static byte[] A02;
    public static String[] A03;
    public static final int[] A04;

    @Nullable
    public final HS A00;
    public final AtomicReference<DefaultTrackSelector$Parameters> A01;

    public static String A0C(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 92);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        if (A03[6].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[6] = "oTI";
        strArr[6] = "oTI";
        A02 = new byte[]{-26, -33, -43};
    }

    public static void A0F() {
        A03 = new String[]{"1W0E1A", "gmqFy6ZQaP5ka1WITOse6lKCqSKhRNov", "yPEYbIXQTZij2dUvfHyn6qa5Z66I89l5", "Xhoxo0MeXbgag07m9diWTgmUhgioDUlF", "BIkkp", "x2Y7ova5yP2MY4Z3NAONKiEwX", "ON8", "BctZyAj3hw00k98sEs0CoZ2k5"};
    }

    static {
        A0F();
        A0E();
        A04 = new int[0];
    }

    public AM() {
        this((HS) null);
    }

    public AM(@Nullable HS hs) {
        this.A00 = hs;
        this.A01 = new AtomicReference<>(DefaultTrackSelector$Parameters.A0J);
    }

    public static int A00(int i2, int i3) {
        if (i2 == -1) {
            return i3 == -1 ? 0 : -1;
        }
        if (i3 == -1) {
            return 1;
        }
        return i2 - i3;
    }

    public static int A01(int i2, int i3) {
        if (i2 > i3) {
            return 1;
        }
        return i3 > i2 ? -1 : 0;
    }

    public static int A03(TrackGroup trackGroup, int[] iArr, int i2, @Nullable String str, int i3, int i4, int i5, List<Integer> list) {
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            Integer num = list.get(i7);
            if (A03[2].charAt(31) == 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "3Iv8b3o73oRbqkF65Z5c5dFgz";
            strArr[5] = "e7BsWd0zc9qEfvrmMSkcTfHGf";
            int iIntValue = num.intValue();
            if (A0M(trackGroup.A02(iIntValue), str, iArr[iIntValue], i2, i3, i4, i5)) {
                i6++;
            }
        }
        return i6;
    }

    public static int A04(TrackGroup trackGroup, int[] iArr, HJ hj) {
        int i2 = 0;
        for (int i3 = 0; i3 < trackGroup.A01; i3++) {
            if (A0K(trackGroup.A02(i3), iArr[i3], hj)) {
                i2++;
            }
        }
        return i2;
    }

    public static Point A05(boolean z, int i2, int i3, int i4, int i5) {
        if (z) {
            if ((i4 > i5) != (i2 > i3)) {
                i2 = i3;
                i3 = i2;
            }
        }
        int tempViewportWidth = i4 * i3;
        int i6 = i5 * i2;
        if (A03[2].charAt(31) == 'o') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[6] = "nfw";
        strArr[6] = "nfw";
        if (tempViewportWidth >= i6) {
            return new Point(i2, J1.A04(i2 * i5, i4));
        }
        return new Point(J1.A04(i3 * i4, i5), i3);
    }

    @Nullable
    private final HT A06(int i2, TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C05699z {
        TrackGroup trackGroup = null;
        int trackIndex = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = trackGroupArray.A01;
            if (A03[3].charAt(2) == 'E') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[3] = "VerUiBJDpf251zcJKkmQW7r5SVlKN9oM";
            strArr[3] = "VerUiBJDpf251zcJKkmQW7r5SVlKN9oM";
            if (i4 < i5) {
                TrackGroup trackGroupA02 = trackGroupArray.A02(i4);
                int[] iArr2 = iArr[i4];
                for (int i6 = 0; i6 < trackGroupA02.A01; i6++) {
                    if (A0I(iArr2[i6], defaultTrackSelector$Parameters.A0B)) {
                        int i7 = (trackGroupA02.A02(i6).A0D & 1) != 0 ? 2 : 1;
                        if (A0I(iArr2[i6], false)) {
                            i7 += 1000;
                        }
                        if (i7 > i3) {
                            trackGroup = trackGroupA02;
                            trackIndex = i6;
                            i3 = i7;
                        }
                    }
                }
                i4++;
            } else {
                if (trackGroup == null) {
                    return null;
                }
                return new AL(trackGroup, trackIndex);
            }
        }
    }

    @Nullable
    public static HT A07(TrackGroupArray trackGroupArray, int[][] iArr, int requiredAdaptiveSupport, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, HS hs) throws C05699z {
        int i2 = defaultTrackSelector$Parameters.A0A ? 24 : 16;
        boolean z = defaultTrackSelector$Parameters.A09 && (requiredAdaptiveSupport & i2) != 0;
        for (int i3 = 0; i3 < trackGroupArray.A01; i3++) {
            TrackGroup trackGroupA02 = trackGroupArray.A02(i3);
            int[] iArrA0P = A0P(trackGroupA02, iArr[i3], z, i2, defaultTrackSelector$Parameters.A03, defaultTrackSelector$Parameters.A02, defaultTrackSelector$Parameters.A01, defaultTrackSelector$Parameters.A06, defaultTrackSelector$Parameters.A05, defaultTrackSelector$Parameters.A0F);
            if (iArrA0P.length > 0) {
                return ((HS) IM.A01(hs)).A4U(trackGroupA02, iArrA0P);
            }
        }
        return null;
    }

    @Nullable
    private final HT A08(TrackGroupArray trackGroupArray, int[][] iArr, int i2, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, @Nullable HS hs) throws C05699z {
        int trackIndex = -1;
        int i3 = -1;
        HK trackScore = null;
        for (int i4 = 0; i4 < trackGroupArray.A01; i4++) {
            TrackGroup trackGroupA02 = trackGroupArray.A02(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < trackGroupA02.A01; i5++) {
                if (A0I(iArr2[i5], defaultTrackSelector$Parameters.A0B)) {
                    HK hk = new HK(trackGroupA02.A02(i5), defaultTrackSelector$Parameters, iArr2[i5]);
                    if (trackScore == null || hk.A01(trackScore) > 0) {
                        i3 = i4;
                        trackIndex = i5;
                        trackScore = hk;
                    }
                }
            }
        }
        if (i3 == -1) {
            return null;
        }
        TrackGroup trackGroupA022 = trackGroupArray.A02(i3);
        if (!defaultTrackSelector$Parameters.A0D && hs != null) {
            int[] iArrA0O = A0O(trackGroupA022, iArr[i3], defaultTrackSelector$Parameters.A09);
            if (iArrA0O.length > 0) {
                return hs.A4U(trackGroupA022, iArrA0O);
            }
        }
        return new AL(trackGroupA022, trackIndex);
    }

    @Nullable
    private final HT A09(TrackGroupArray trackGroupArray, int[][] iArr, int i2, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters, @Nullable HS hs) throws C05699z {
        HT htA07 = null;
        if (!defaultTrackSelector$Parameters.A0D && hs != null) {
            htA07 = A07(trackGroupArray, iArr, i2, defaultTrackSelector$Parameters, hs);
        }
        if (htA07 == null) {
            return A0A(trackGroupArray, iArr, defaultTrackSelector$Parameters);
        }
        return htA07;
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0021 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d8 A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.HT A0A(com.facebook.ads.internal.exoplayer2.source.TrackGroupArray r18, int[][] r19, com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters r20) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AM.A0A(com.facebook.ads.internal.exoplayer2.source.TrackGroupArray, int[][], com.facebook.ads.internal.exoplayer2.trackselection.DefaultTrackSelector$Parameters):com.facebook.ads.redexgen.X.HT");
    }

    @Nullable
    private final HT A0B(TrackGroupArray trackGroupArray, int[][] iArr, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C05699z {
        int i2;
        int i3;
        TrackGroup trackGroup = null;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < trackGroupArray.A01; i6++) {
            TrackGroup trackGroupA02 = trackGroupArray.A02(i6);
            int[] iArr2 = iArr[i6];
            for (int i7 = 0; i7 < trackGroupA02.A01; i7++) {
                if (A0I(iArr2[i7], defaultTrackSelector$Parameters.A0B)) {
                    Format formatA02 = trackGroupA02.A02(i7);
                    int i8 = formatA02.A0D & (defaultTrackSelector$Parameters.A00 ^ (-1));
                    boolean z = (i8 & 1) != 0;
                    boolean z2 = (i8 & 2) != 0;
                    boolean zA0L = A0L(formatA02, defaultTrackSelector$Parameters.A08);
                    if (zA0L || (defaultTrackSelector$Parameters.A0E && A0J(formatA02))) {
                        if (z) {
                            i2 = 8;
                        } else if (!z2) {
                            i2 = 6;
                        } else {
                            i2 = 4;
                        }
                        i3 = i2 + (zA0L ? 1 : 0);
                    } else if (z) {
                        i3 = 3;
                    } else if (!z2) {
                        continue;
                    } else if (A0L(formatA02, defaultTrackSelector$Parameters.A07)) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    if (A0I(iArr2[i7], false)) {
                        i3 += 1000;
                    }
                    if (i3 > i5) {
                        trackGroup = trackGroupA02;
                        i4 = i7;
                        if (A03[6].length() != 3) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[2] = "ytO6VNlSXI4nyu5127ZVkMBSWij4cMOM";
                        strArr[2] = "ytO6VNlSXI4nyu5127ZVkMBSWij4cMOM";
                        i5 = i3;
                    } else {
                        continue;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new AL(trackGroup, i4);
    }

    public static List<Integer> A0D(TrackGroup trackGroup, int i2, int maxVideoPixelsToRetain, boolean z) {
        ArrayList arrayList = new ArrayList(trackGroup.A01);
        for (int i3 = 0; i3 < trackGroup.A01; i3++) {
            arrayList.add(Integer.valueOf(i3));
        }
        if (i2 == Integer.MAX_VALUE || maxVideoPixelsToRetain == Integer.MAX_VALUE) {
            return arrayList;
        }
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < trackGroup.A01; i5++) {
            Format formatA02 = trackGroup.A02(i5);
            if (formatA02.A0F > 0) {
                int i6 = formatA02.A08;
                if (A03[3].charAt(2) == 'E') {
                    throw new RuntimeException();
                }
                String[] strArr = A03;
                strArr[2] = "kSz4FX5ZHsEkHeXGD1Cn3cbmsF2hLdtD";
                strArr[2] = "kSz4FX5ZHsEkHeXGD1Cn3cbmsF2hLdtD";
                if (i6 > 0) {
                    Point pointA05 = A05(z, i2, maxVideoPixelsToRetain, formatA02.A0F, formatA02.A08);
                    int i7 = formatA02.A0F * formatA02.A08;
                    int videoPixels = formatA02.A0F;
                    if (videoPixels >= ((int) (pointA05.x * 0.98f))) {
                        int videoPixels2 = formatA02.A08;
                        if (videoPixels2 >= ((int) (pointA05.y * 0.98f)) && i7 < i4) {
                            i4 = i7;
                        }
                    }
                }
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                int iA0J = trackGroup.A02(((Integer) arrayList.get(size)).intValue()).A0J();
                if (iA0J == -1 || iA0J > i4) {
                    arrayList.remove(size);
                }
            }
        }
        return arrayList;
    }

    public static void A0G(TrackGroup trackGroup, int[] iArr, int trackIndex, @Nullable String str, int i2, int i3, int i4, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!A0M(trackGroup.A02(iIntValue), str, iArr[iIntValue], trackIndex, i2, i3, i4)) {
                list.remove(size);
            }
        }
    }

    public static void A0H(HR hr, int[][][] iArr, AY[] ayArr, HT[] htArr, int rendererType) {
        if (rendererType == 0) {
            return;
        }
        int i2 = -1;
        int i3 = -1;
        if (A03[1].charAt(3) != 'F') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[4] = "rTjwD";
        strArr[0] = "uX38vm";
        boolean z = true;
        int i4 = 0;
        while (true) {
            if (i4 >= hr.A00()) {
                break;
            }
            int iA01 = hr.A01(i4);
            HT ht = htArr[i4];
            if ((iA01 == 1 || iA01 == 2) && ht != null && A0N(iArr[i4], hr.A02(i4), ht)) {
                if (iA01 == 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i4;
                } else {
                    if (i3 != -1) {
                        z = false;
                        break;
                    }
                    i3 = i4;
                }
            }
            i4++;
        }
        boolean z2 = z & ((i2 == -1 || i3 == -1) ? false : true);
        if (A03[3].charAt(2) != 'E') {
            String[] strArr2 = A03;
            strArr2[4] = "aY4hR";
            strArr2[0] = "2v7HMH";
            if (!z2) {
                return;
            }
        } else if (!z2) {
            return;
        }
        AY ay = new AY(rendererType);
        ayArr[i2] = ay;
        ayArr[i3] = ay;
    }

    public static boolean A0I(int i2, boolean z) {
        int maskedSupport = i2 & 7;
        return maskedSupport == 4 || (z && maskedSupport == 3);
    }

    public static boolean A0J(Format format) {
        return TextUtils.isEmpty(format.A0N) || A0L(format, A0C(0, 3, 21));
    }

    public static boolean A0K(Format format, int i2, HJ hj) {
        if (A0I(i2, false) && format.A05 == hj.A00 && format.A0C == hj.A01) {
            return hj.A02 == null || TextUtils.equals(hj.A02, format.A0O);
        }
        return false;
    }

    public static boolean A0L(Format format, @Nullable String str) {
        return str != null && TextUtils.equals(str, J1.A0O(format.A0N));
    }

    public static boolean A0M(Format format, @Nullable String str, int i2, int i3, int i4, int i5, int i6) {
        if (!A0I(i2, false) || (i2 & i3) == 0) {
            return false;
        }
        if (str != null && !J1.A0k(format.A0O, str)) {
            return false;
        }
        if (format.A0F != -1 && format.A0F > i4) {
            return false;
        }
        if (format.A08 != -1 && format.A08 > i5) {
            return false;
        }
        if (format.A04 != -1) {
            int i7 = format.A04;
            if (A03[2].charAt(31) == 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[2] = "FNCbzyr7QyRP3SA06TqNXuxS80zpa9Bi";
            strArr[2] = "FNCbzyr7QyRP3SA06TqNXuxS80zpa9Bi";
            if (i7 > i6) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0N(int[][] iArr, TrackGroupArray trackGroupArray, HT ht) {
        if (ht == null) {
            return false;
        }
        int iA01 = trackGroupArray.A01(ht.A7D());
        if (A03[2].charAt(31) == 'o') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[1] = "tyUFTMgWRFIbU9oMa0yVOFtav5LFL8C4";
        strArr[1] = "tyUFTMgWRFIbU9oMa0yVOFtav5LFL8C4";
        for (int i2 = 0; i2 < ht.length(); i2++) {
            if ((iArr[iA01][ht.A6R(i2)] & 32) != 32) {
                return false;
            }
        }
        if (A03[2].charAt(31) != 'o') {
            String[] strArr2 = A03;
            strArr2[4] = "AvWfp";
            strArr2[0] = "jnm8oH";
            return true;
        }
        String[] strArr3 = A03;
        strArr3[3] = "hBflC2WcQfSqXI4XtpzFNLmvHBtesKLi";
        strArr3[3] = "hBflC2WcQfSqXI4XtpzFNLmvHBtesKLi";
        return true;
    }

    public static int[] A0O(TrackGroup trackGroup, int[] iArr, boolean z) {
        int iA04;
        int i2 = 0;
        HJ hj = null;
        HashSet hashSet = new HashSet();
        int configurationCount = 0;
        while (true) {
            if (configurationCount < trackGroup.A01) {
                Format formatA02 = trackGroup.A02(configurationCount);
                HJ hj2 = new HJ(formatA02.A05, formatA02.A0C, z ? null : formatA02.A0O);
                String[] strArr = A03;
                if (strArr[4].length() == strArr[0].length()) {
                    break;
                }
                String[] strArr2 = A03;
                strArr2[6] = "SWl";
                strArr2[6] = "SWl";
                if (hashSet.add(hj2) && (iA04 = A04(trackGroup, iArr, hj2)) > i2) {
                    hj = hj2;
                    i2 = iA04;
                }
                configurationCount++;
            } else if (i2 > 1) {
                int[] adaptiveIndices = new int[i2];
                if (A03[1].charAt(3) == 'F') {
                    String[] strArr3 = A03;
                    strArr3[2] = "ndqJYBN4kzCrcISGfJ6gLQAVvTseYRAq";
                    strArr3[2] = "ndqJYBN4kzCrcISGfJ6gLQAVvTseYRAq";
                    int index = 0;
                    for (int i3 = 0; i3 < trackGroup.A01; i3++) {
                        if (A0K(trackGroup.A02(i3), iArr[i3], (HJ) IM.A01(hj))) {
                            adaptiveIndices[index] = i3;
                            index++;
                        }
                    }
                    return adaptiveIndices;
                }
            } else {
                return A04;
            }
        }
        throw new RuntimeException();
    }

    public static int[] A0P(TrackGroup trackGroup, int[] iArr, boolean z, int i2, int i3, int i4, int trackIndex, int i5, int i6, boolean z2) {
        int iA03;
        if (trackGroup.A01 >= 2) {
            List<Integer> listA0D = A0D(trackGroup, i5, i6, z2);
            if (listA0D.size() < 2) {
                return A04;
            }
            String str = null;
            if (!z) {
                HashSet hashSet = new HashSet();
                int i7 = 0;
                for (int selectedMimeTypeTrackCount = 0; selectedMimeTypeTrackCount < listA0D.size(); selectedMimeTypeTrackCount++) {
                    String str2 = trackGroup.A02(listA0D.get(selectedMimeTypeTrackCount).intValue()).A0O;
                    if (hashSet.add(str2) && (iA03 = A03(trackGroup, iArr, i2, str2, i3, i4, trackIndex, listA0D)) > i7) {
                        if (A03[3].charAt(2) == 'E') {
                            throw new RuntimeException();
                        }
                        String[] strArr = A03;
                        strArr[7] = "YYn4Z0UW1tJYYEwj5MQ7L1Rhi";
                        strArr[5] = "BvRHCOG0R11gnbm1vcetrlVSM";
                        str = str2;
                        i7 = iA03;
                    }
                }
            }
            A0G(trackGroup, iArr, i2, str, i3, i4, trackIndex, listA0D);
            return listA0D.size() < 2 ? A04 : J1.A0n(listA0D);
        }
        return A04;
    }

    private final HT[] A0Q(HR hr, int[][][] iArr, int[] iArr2, DefaultTrackSelector$Parameters defaultTrackSelector$Parameters) throws C05699z {
        boolean z;
        int iA00 = hr.A00();
        HT[] htArr = new HT[iA00];
        boolean seenVideoRendererWithMappedTracks = false;
        int i2 = 0;
        for (int i3 = 0; i3 < iA00; i3++) {
            int iA01 = hr.A01(i3);
            if (A03[2].charAt(31) == 'o') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[2] = "HeTTodjeOHNf6YJV3Oi2xZW4zDR7myJi";
            strArr[2] = "HeTTodjeOHNf6YJV3Oi2xZW4zDR7myJi";
            if (2 == iA01) {
                if (i2 == 0) {
                    z = true;
                    htArr[i3] = A09(hr.A02(i3), iArr[i3], iArr2[i3], defaultTrackSelector$Parameters, this.A00);
                    i2 = htArr[i3] != null ? 1 : 0;
                } else {
                    z = true;
                }
                if (hr.A02(i3).A01 <= 0) {
                    z = false;
                }
                seenVideoRendererWithMappedTracks |= z;
            }
        }
        boolean z2 = false;
        int i4 = 0;
        if (A03[3].charAt(2) == 'E') {
            throw new RuntimeException();
        }
        String[] strArr2 = A03;
        strArr2[2] = "aVwUyHxCeGesw16VUIJPDtFnHPxsnnXC";
        strArr2[2] = "aVwUyHxCeGesw16VUIJPDtFnHPxsnnXC";
        for (int i5 = 0; i5 < iA00; i5++) {
            int iA012 = hr.A01(i5);
            if (iA012 != 1) {
                if (iA012 != 2) {
                    if (iA012 != 3) {
                        htArr[i5] = A06(iA012, hr.A02(i5), iArr[i5], defaultTrackSelector$Parameters);
                    } else if (i4 == 0) {
                        htArr[i5] = A0B(hr.A02(i5), iArr[i5], defaultTrackSelector$Parameters);
                        i4 = htArr[i5] != null ? 1 : 0;
                    }
                }
            } else if (!z2) {
                htArr[i5] = A08(hr.A02(i5), iArr[i5], iArr2[i5], defaultTrackSelector$Parameters, seenVideoRendererWithMappedTracks ? null : this.A00);
                z2 = htArr[i5] != null;
            }
        }
        return htArr;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1282b7
    public final Pair<AY[], HT[]> A0X(HR hr, int[][][] iArr, int[] iArr2) throws C05699z {
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = this.A01.get();
        int i2 = hr.A00();
        HT[] htArrA0Q = A0Q(hr, iArr, iArr2, defaultTrackSelector$Parameters);
        for (int i3 = 0; i3 < i2; i3++) {
            if (defaultTrackSelector$Parameters.A07(i3)) {
                htArrA0Q[i3] = null;
            } else {
                TrackGroupArray trackGroupArrayA02 = hr.A02(i3);
                if (defaultTrackSelector$Parameters.A08(i3, trackGroupArrayA02)) {
                    DefaultTrackSelector$SelectionOverride defaultTrackSelector$SelectionOverrideA06 = defaultTrackSelector$Parameters.A06(i3, trackGroupArrayA02);
                    if (defaultTrackSelector$SelectionOverrideA06 == null) {
                        htArrA0Q[i3] = null;
                    } else if (defaultTrackSelector$SelectionOverrideA06.A01 == 1) {
                        htArrA0Q[i3] = new AL(trackGroupArrayA02.A02(defaultTrackSelector$SelectionOverrideA06.A00), defaultTrackSelector$SelectionOverrideA06.A02[0]);
                    } else {
                        htArrA0Q[i3] = ((HS) IM.A01(this.A00)).A4U(trackGroupArrayA02.A02(defaultTrackSelector$SelectionOverrideA06.A00), defaultTrackSelector$SelectionOverrideA06.A02);
                    }
                }
            }
        }
        AY[] ayArr = new AY[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            ayArr[i4] = !defaultTrackSelector$Parameters.A07(i4) && (hr.A01(i4) == 5 || htArrA0Q[i4] != null) ? AY.A01 : null;
        }
        A0H(hr, iArr, ayArr, htArrA0Q, defaultTrackSelector$Parameters.A04);
        return Pair.create(ayArr, htArrA0Q);
    }
}
