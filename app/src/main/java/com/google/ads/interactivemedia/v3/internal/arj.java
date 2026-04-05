package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.Trace;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class arj {
    public static <TResult> aqv<TResult> a(Exception exc) {
        arc arcVar = new arc();
        arcVar.k(exc);
        return arcVar;
    }

    public static <TResult> aqv<TResult> b(TResult tresult) {
        arc arcVar = new arc();
        arcVar.l(tresult);
        return arcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.ads.interactivemedia.v3.internal.arc] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.ads.interactivemedia.v3.internal.aqv] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.ads.interactivemedia.v3.internal.aqv] */
    public static aqv<List<aqv<?>>> c(Collection<? extends aqv<?>> collection) {
        ?? arcVar;
        if (collection == null || collection.isEmpty()) {
            return b(Collections.emptyList());
        }
        if (collection.isEmpty()) {
            arcVar = b(null);
        } else {
            Iterator<? extends aqv<?>> it = collection.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            arcVar = new arc();
            ari ariVar = new ari(collection.size(), arcVar);
            Iterator<? extends aqv<?>> it2 = collection.iterator();
            while (it2.hasNext()) {
                q(it2.next(), ariVar);
            }
        }
        return arcVar.a(new arf(collection));
    }

    public static <TResult> TResult d(aqv<TResult> aqvVar, long j2, TimeUnit timeUnit) throws TimeoutException {
        c.f.a.c.f.q.o.g();
        c.f.a.c.f.q.o.j(aqvVar, "Task must not be null");
        c.f.a.c.f.q.o.j(timeUnit, "TimeUnit must not be null");
        if (aqvVar.e()) {
            return (TResult) p(aqvVar);
        }
        arg argVar = new arg(null);
        q(aqvVar, argVar);
        if (argVar.a(j2, timeUnit)) {
            return (TResult) p(aqvVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static String e(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    public static boolean f(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean g(XmlPullParser xmlPullParser, String str) {
        return f(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean h(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean i(XmlPullParser xmlPullParser, String str) {
        return h(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static String j(XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (r(xmlPullParser.getAttributeName(i2)).equals("default_KID")) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    public static boolean k(XmlPullParser xmlPullParser) {
        return h(xmlPullParser) && r(xmlPullParser.getName()).equals("pssh");
    }

    public static Uri l(String str, String str2) {
        return Uri.parse(m(str, str2));
    }

    public static String m(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        int[] iArrT = t(str2);
        if (iArrT[0] != -1) {
            sb.append(str2);
            s(sb, iArrT[1], iArrT[2]);
            return sb.toString();
        }
        int[] iArrT2 = t(str);
        if (iArrT[3] == 0) {
            sb.append((CharSequence) str, 0, iArrT2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrT[2] == 0) {
            sb.append((CharSequence) str, 0, iArrT2[2]);
            sb.append(str2);
            return sb.toString();
        }
        if (iArrT[1] != 0) {
            int i2 = iArrT2[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(str2);
            return s(sb, iArrT[1] + i2, i2 + iArrT[2]);
        }
        if (str2.charAt(0) == '/') {
            sb.append((CharSequence) str, 0, iArrT2[1]);
            sb.append(str2);
            int i3 = iArrT2[1];
            return s(sb, i3, iArrT[2] + i3);
        }
        int i4 = iArrT2[0];
        int i5 = iArrT2[1];
        if (i4 + 2 >= i5 || i5 != iArrT2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, iArrT2[2] - 1);
            int i6 = iLastIndexOf == -1 ? iArrT2[1] : iLastIndexOf + 1;
            sb.append((CharSequence) str, 0, i6);
            sb.append(str2);
            return s(sb, iArrT2[1], i6 + iArrT[2]);
        }
        sb.append((CharSequence) str, 0, i5);
        sb.append('/');
        sb.append(str2);
        int i7 = iArrT2[1];
        return s(sb, i7, iArrT[2] + i7 + 1);
    }

    public static void n(String str) {
        if (amn.f20135a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void o() {
        if (amn.f20135a >= 18) {
            Trace.endSection();
        }
    }

    private static <TResult> TResult p(aqv<TResult> aqvVar) throws ExecutionException {
        if (aqvVar.f()) {
            return aqvVar.c();
        }
        if (aqvVar.d()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(aqvVar.b());
    }

    private static <T> void q(aqv<T> aqvVar, arh<? super T> arhVar) {
        Executor executor = arb.f20406b;
        aqvVar.j(executor, arhVar);
        aqvVar.i(executor, arhVar);
        aqvVar.g(executor, arhVar);
    }

    private static String r(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf == -1 ? str : str.substring(iIndexOf + 1);
    }

    private static String s(StringBuilder sb, int i2, int i3) {
        int i4;
        int iLastIndexOf;
        if (i2 >= i3) {
            return sb.toString();
        }
        if (sb.charAt(i2) == '/') {
            i2++;
        }
        int i5 = i2;
        int i6 = i5;
        while (i5 <= i3) {
            if (i5 == i3) {
                i4 = i5;
            } else if (sb.charAt(i5) == '/') {
                i4 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i4);
                i3 -= i4 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = iLastIndexOf > i2 ? iLastIndexOf : i2;
                    sb.delete(i8, i4);
                    i3 -= i4 - i8;
                } else {
                    iLastIndexOf = i5 + 1;
                }
                i6 = iLastIndexOf;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    private static int[] t(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i2 = iIndexOf5 + 2;
        if (i2 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i2) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }
}
