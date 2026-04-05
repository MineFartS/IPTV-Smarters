package com.facebook.ads.redexgen.X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Arrays;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class H0 {
    public static byte[] A00;
    public static String[] A01;

    static {
        A04();
        A03();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 92);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{60, 12, 11, 53, 27, DateTimeFieldType.HOUR_OF_DAY, 49, 27, DateTimeFieldType.HOUR_OF_DAY, 100, 31, 54, 99, 71, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 125, 51, 50, 98, DateTimeFieldType.SECOND_OF_DAY};
    }

    public static void A04() {
        A01 = new String[]{"gehgTzpUAqg89EXiGGasdpNXUtk8k2dp", "VbYmpptfSIV8qdRodswF8V1n59zym7XK", "E44YX0wg", "TCU5yEG5ZIofchF4EQjDHlsQntmp46Yu", "EkmeYw2kQLbBECw2eANnaw7CzESY", "H", "OFssNajfj", "bi8IHmxX7dNFBPIWLmj9QBiFjZgAYPjN"};
    }

    public static H4 A00(H4 h4, String[] strArr, Map<String, H4> map) {
        if (h4 == null && strArr == null) {
            return null;
        }
        int i2 = 0;
        if (h4 == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (h4 == null && strArr.length > 1) {
            H4 h42 = new H4();
            int length = strArr.length;
            while (i2 < length) {
                String id = strArr[i2];
                h42.A0F(map.get(id));
                i2++;
            }
            return h42;
        }
        if (h4 != null && strArr != null && strArr.length == 1) {
            return h4.A0F(map.get(strArr[0]));
        }
        if (h4 != null && strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i2 < length2) {
                h4.A0F(map.get(strArr[i2]));
                i2++;
            }
            return h4;
        }
        return h4;
    }

    public static String A02(String str) {
        String strA01 = A01(0, 1, 106);
        String strReplaceAll = str.replaceAll(A01(1, 2, 93), strA01).replaceAll(A01(4, 5, 103), strA01);
        String strA012 = A01(3, 1, 73);
        return strReplaceAll.replaceAll(strA01, strA012).replaceAll(A01(9, 11, 99), strA012);
    }

    public static void A05(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }

    public static void A06(SpannableStringBuilder spannableStringBuilder, int i2, int i3, H4 h4) {
        if (h4.A08() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(h4.A08()), i2, i3, 33);
        }
        if (h4.A0Q()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i2, i3, 33);
        }
        if (h4.A0R()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i2, i3, 33);
        }
        if (h4.A0P()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(h4.A06()), i2, i3, 33);
        }
        if (h4.A0O()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(h4.A05()), i2, i3, 33);
        }
        if (h4.A0M() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(h4.A0M()), i2, i3, 33);
        }
        Layout.Alignment alignmentA09 = h4.A09();
        String[] strArr = A01;
        if (strArr[0].charAt(0) == strArr[1].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "m";
        strArr2[2] = "ujiHtYdg";
        if (alignmentA09 != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(h4.A09()), i2, i3, 33);
        }
        int iA07 = h4.A07();
        if (iA07 == 1) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) h4.A04(), true), i2, i3, 33);
        } else if (iA07 == 2) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(h4.A04()), i2, i3, 33);
        } else {
            if (iA07 != 3) {
                return;
            }
            spannableStringBuilder.setSpan(new RelativeSizeSpan(h4.A04() / 100.0f), i2, i3, 33);
        }
    }
}
