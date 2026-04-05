package c.f.a.b.e3.e1.p;

import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f7238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f7239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f7240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7241d;

    public n(String[] strArr, int[] iArr, String[] strArr2, int i2) {
        this.f7238a = strArr;
        this.f7239b = iArr;
        this.f7240c = strArr2;
        this.f7241d = i2;
    }

    public static n b(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new n(strArr, iArr, strArr2, c(str, strArr, iArr, strArr2));
    }

    public static int c(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String strSubstring;
        strArr[0] = BuildConfig.FLAVOR;
        int length = 0;
        int i2 = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            if (iIndexOf == -1) {
                strArr[i2] = strArr[i2] + str.substring(length);
                length = str.length();
            } else if (iIndexOf != length) {
                strArr[i2] = strArr[i2] + str.substring(length, iIndexOf);
                length = iIndexOf;
            } else if (str.startsWith("$$", length)) {
                strArr[i2] = strArr[i2] + "$";
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
                            strSubstring = strSubstring + "d";
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    strSubstring2.hashCode();
                    switch (strSubstring2) {
                        case "Number":
                            iArr[i2] = 2;
                            break;
                        case "Time":
                            iArr[i2] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i2] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    strArr2[i2] = strSubstring;
                }
                i2++;
                strArr[i2] = BuildConfig.FLAVOR;
                length = iIndexOf2 + 1;
            }
        }
        return i2;
    }

    public String a(String str, long j2, int i2, long j3) {
        String str2;
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            int i4 = this.f7241d;
            if (i3 >= i4) {
                sb.append(this.f7238a[i4]);
                return sb.toString();
            }
            sb.append(this.f7238a[i3]);
            int[] iArr = this.f7239b;
            if (iArr[i3] == 1) {
                sb.append(str);
            } else {
                if (iArr[i3] == 2) {
                    str2 = String.format(Locale.US, this.f7240c[i3], Long.valueOf(j2));
                } else if (iArr[i3] == 3) {
                    str2 = String.format(Locale.US, this.f7240c[i3], Integer.valueOf(i2));
                } else if (iArr[i3] == 4) {
                    str2 = String.format(Locale.US, this.f7240c[i3], Long.valueOf(j3));
                }
                sb.append(str2);
            }
            i3++;
        }
    }
}
