package com.google.ads.interactivemedia.v3.internal;

import a.d.b.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class fq {
    public static Map<String, String> b(Uri uri) {
        if (uri == null || uri.isOpaque()) {
            throw new UnsupportedOperationException("This isn't a hierarchical URI.");
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null || encodedQuery.length() == 0) {
            return Collections.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iIndexOf = encodedQuery.indexOf(35);
        int i2 = 0;
        if (iIndexOf == -1) {
            iIndexOf = encodedQuery.length();
        }
        do {
            int iIndexOf2 = encodedQuery.indexOf(38, i2);
            if (iIndexOf2 == -1) {
                iIndexOf2 = iIndexOf;
            }
            int iIndexOf3 = encodedQuery.indexOf(61, i2);
            if (iIndexOf3 > iIndexOf2 || iIndexOf3 == -1) {
                iIndexOf3 = iIndexOf2;
            }
            linkedHashMap.put(encodedQuery.substring(i2, iIndexOf3), iIndexOf3 < iIndexOf2 ? encodedQuery.substring(iIndexOf3 + 1, iIndexOf2) : BuildConfig.FLAVOR);
            i2 = iIndexOf2 + 1;
        } while (i2 < iIndexOf);
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public static int c(int i2) {
        return i2;
    }

    @SuppressLint({"WrongConstant"})
    public static int d(int i2) {
        return i2 & 7;
    }

    public static void e(qi qiVar, qi qiVar2) {
        if (qiVar == qiVar2) {
            return;
        }
        if (qiVar2 != null) {
            qiVar2.e(null);
        }
        if (qiVar != null) {
            qiVar.f(null);
        }
    }

    public final void a(String str, Context context, boolean z) {
        if (z && Build.VERSION.SDK_INT >= 18) {
            new d.a().a().a(context, Uri.parse(str));
        } else {
            if (str == null || str.length() <= 0) {
                return;
            }
            new fp(str, context).execute(new Void[0]);
        }
    }
}
