package com.google.ads.interactivemedia.v3.internal;

import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.chart.TimeChart;

/* JADX INFO: loaded from: classes.dex */
public final class afk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f19494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f19495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f19496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19497d;

    private afk(String[] strArr, int[] iArr, String[] strArr2, int i2) {
        this.f19494a = strArr;
        this.f19495b = iArr;
        this.f19496c = strArr2;
        this.f19497d = i2;
    }

    public static afk a(String str) {
        String strSubstring;
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = BuildConfig.FLAVOR;
        int length = 0;
        int i2 = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            byte b2 = -1;
            if (iIndexOf == -1) {
                String strValueOf = String.valueOf(strArr[i2]);
                String strValueOf2 = String.valueOf(str.substring(length));
                strArr[i2] = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                length = str.length();
            } else if (iIndexOf != length) {
                String strValueOf3 = String.valueOf(strArr[i2]);
                String strValueOf4 = String.valueOf(str.substring(length, iIndexOf));
                strArr[i2] = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                length = iIndexOf;
            } else if (str.startsWith("$$", length)) {
                strArr[i2] = String.valueOf(strArr[i2]).concat("$");
                length += 2;
            } else {
                int i3 = length + 1;
                int iIndexOf2 = str.indexOf("$", i3);
                String strSubstring2 = str.substring(i3, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    iArr[i2] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    int iHashCode = strSubstring2.hashCode();
                    if (iHashCode != -1950496919) {
                        if (iHashCode != 2606829) {
                            if (iHashCode == 38199441 && strSubstring2.equals("Bandwidth")) {
                                b2 = 1;
                            }
                        } else if (strSubstring2.equals(TimeChart.TYPE)) {
                            b2 = 2;
                        }
                    } else if (strSubstring2.equals("Number")) {
                        b2 = 0;
                    }
                    if (b2 == 0) {
                        iArr[i2] = 2;
                    } else if (b2 == 1) {
                        iArr[i2] = 3;
                    } else {
                        if (b2 != 2) {
                            throw new IllegalArgumentException(str.length() != 0 ? "Invalid template: ".concat(str) : new String("Invalid template: "));
                        }
                        iArr[i2] = 4;
                    }
                    strArr2[i2] = strSubstring;
                }
                i2++;
                strArr[i2] = BuildConfig.FLAVOR;
                length = iIndexOf2 + 1;
            }
        }
        return new afk(strArr, iArr, strArr2, i2);
    }

    public final String b(String str, long j2, int i2, long j3) {
        String str2;
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            int i4 = this.f19497d;
            if (i3 >= i4) {
                sb.append(this.f19494a[i4]);
                return sb.toString();
            }
            sb.append(this.f19494a[i3]);
            int i5 = this.f19495b[i3];
            if (i5 == 1) {
                sb.append(str);
            } else {
                if (i5 == 2) {
                    str2 = String.format(Locale.US, this.f19496c[i3], Long.valueOf(j2));
                } else if (i5 == 3) {
                    str2 = String.format(Locale.US, this.f19496c[i3], Integer.valueOf(i2));
                } else if (i5 == 4) {
                    str2 = String.format(Locale.US, this.f19496c[i3], Long.valueOf(j3));
                }
                sb.append(str2);
            }
            i3++;
        }
    }
}
