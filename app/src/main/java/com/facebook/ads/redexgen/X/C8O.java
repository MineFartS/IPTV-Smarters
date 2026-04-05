package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8O, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8O {
    public static byte[] A04;
    public static String[] A05;
    public static final Pattern A06;

    @Nullable
    public final Integer A00;

    @Nullable
    public final Integer A01;
    public final String A02;
    public final Set<String> A03;

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 101);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{-93, DateTimeFieldType.HOUR_OF_HALFDAY, -14, -68, 10, -60, -68, -5, -60, -68, -5, -12, -28, -82, -4, -26, -43, -44, -95, -72, -75, -24, -23, -19, -30, -24, -25, -73, -44, -41, -90, -43, -42, -42, -92, -94, -95, -72, -77, -90, -95, -72, -75, -36, -24, -18, -25, -19, -21, -14, -73, -43, -35, -92, -94, -90, -95, -72, -75, -20, -19, -38, -19, -34, -73, -43, -35, -92, -94, -94, -72, -42, -20};
    }

    public static void A04() {
        A05 = new String[]{"pAae9rjDjut", "tkOSIHX8Zxgz2rZYxn8viKSgU7ZUgPoL", "1N", "2VeddHnoq1PdFvEHeLIEgk846BKmCK6O", "LTbK", "Z0pa1Fkg3kxxdvs7wsAZFUzX7FqiKd0T", "C5WWkuKXZZ", "LwQP7"};
    }

    static {
        A04();
        A03();
        A06 = Pattern.compile(A02(16, 56, 20));
    }

    public C8O(Set<String> options, @Nullable Integer num, @Nullable Integer num2, String str) {
        this.A03 = options;
        this.A00 = num;
        this.A01 = num2;
        this.A02 = str;
    }

    public C8O(@Nullable String[] strArr, @Nullable Integer num, @Nullable Integer num2) {
        strArr = strArr == null ? new String[0] : strArr;
        this.A03 = new LinkedHashSet();
        this.A03.addAll(Arrays.asList(strArr));
        this.A00 = num;
        this.A01 = num2;
        this.A02 = A01();
    }

    @Nullable
    public static C8O A00(@Nullable String str) {
        if (str == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Integer numValueOf = null;
        Integer numValueOf2 = null;
        Matcher matcher = A06.matcher(str);
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
            String strGroup = matcher.group(2);
            String strGroup2 = matcher.group(3);
            if (strGroup != null && strGroup2 != null) {
                numValueOf = Integer.valueOf(Integer.parseInt(strGroup));
                numValueOf2 = Integer.valueOf(Integer.parseInt(strGroup2));
            }
        }
        return new C8O(linkedHashSet, numValueOf, numValueOf2, str);
    }

    private String A01() {
        String strA02;
        StringBuilder sb = new StringBuilder();
        for (String str : this.A03) {
            Locale locale = Locale.US;
            if (this.A00 == null || this.A01 == null) {
                if (A05[0].length() != 11) {
                    throw new RuntimeException();
                }
                String[] strArr = A05;
                strArr[3] = "stwUo5SqMlMCevvnzS9Ivu5YLcfkOLDd";
                strArr[5] = "Jjxe8gs2e3QRovgCJLhIxlujBEulNGa6";
                strA02 = A02(12, 4, 36);
            } else {
                strA02 = A02(2, 10, 50);
            }
            String option = str.toUpperCase();
            sb.append(String.format(locale, strA02, option, this.A00, this.A01));
        }
        return sb.toString();
    }

    @Nullable
    public final Integer A05() {
        return this.A00;
    }

    @Nullable
    public final Integer A06() {
        return this.A01;
    }

    public final String A07() {
        return this.A02;
    }

    public final String A08() {
        Iterator<String> it = this.A03.iterator();
        StringBuilder sbAppend = new StringBuilder().append(A02(1, 1, 78));
        while (it.hasNext()) {
            String next = it.next();
            if (A05[0].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[7] = "k7iHL";
            strArr[2] = "M5";
            sbAppend.append(next);
            if (it.hasNext()) {
                String[] strArr2 = A05;
                if (strArr2[3].charAt(13) != strArr2[5].charAt(13)) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A05;
                strArr3[7] = "AO7Nq";
                strArr3[2] = "hv";
                sbAppend.append(A02(0, 1, 18));
            }
        }
        sbAppend.append(A02(72, 1, 42));
        return sbAppend.toString();
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C8O)) {
            return false;
        }
        C8O c8o = (C8O) obj;
        Integer num = this.A00;
        String[] strArr = A05;
        if (strArr[3].charAt(13) != strArr[5].charAt(13)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[0] = "YHhc40Na8nm";
        strArr2[0] = "YHhc40Na8nm";
        Integer num2 = c8o.A00;
        if (num != num2 && (num == null || !num.equals(num2))) {
            return false;
        }
        Integer num3 = this.A01;
        Integer num4 = c8o.A01;
        return (num3 == num4 || (num3 != null && num3.equals(num4))) && this.A03.equals(c8o.A03);
    }

    public final int hashCode() {
        int iHashCode = this.A03.hashCode() * 131;
        Integer num = this.A00;
        int iIntValue = iHashCode + ((num == null ? -1 : num.intValue()) * 137);
        Integer num2 = this.A01;
        return iIntValue + ((num2 != null ? num2.intValue() : -1) * 139);
    }
}
