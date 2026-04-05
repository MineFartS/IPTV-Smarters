package com.google.ads.interactivemedia.v3.internal;

import android.os.StrictMode;
import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes.dex */
@Hide
public final class aop {
    public static <T> T a(aru<T> aruVar) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            return aruVar.a();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
