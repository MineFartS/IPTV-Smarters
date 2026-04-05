package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ajr {
    public static final ajo a(Context context, Map map, int i2, akt aktVar, boolean z) {
        return new ajo(context, map, AdError.SERVER_ERROR_CODE, aktVar, true);
    }

    public static <T> T b(T t) {
        t.getClass();
        return t;
    }

    public static <T> T c(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalStateException();
    }

    public static void d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void g(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static final long h(akb akbVar) {
        IOException iOException = akbVar.f19966a;
        if (!(iOException instanceof ajy)) {
            return -9223372036854775807L;
        }
        int i2 = ((ajy) iOException).f19959a;
        return (i2 == 403 || i2 == 404 || i2 == 410 || i2 == 416 || i2 == 500 || i2 == 503) ? 60000L : -9223372036854775807L;
    }

    public static final int i(int i2) {
        return i2 == 7 ? 6 : 3;
    }

    public static final long j(akb akbVar) {
        IOException iOException = akbVar.f19966a;
        if ((iOException instanceof lb) || (iOException instanceof FileNotFoundException) || (iOException instanceof ajw) || (iOException instanceof aki)) {
            return -9223372036854775807L;
        }
        return Math.min((akbVar.f19967b - 1) * 1000, 5000);
    }
}
