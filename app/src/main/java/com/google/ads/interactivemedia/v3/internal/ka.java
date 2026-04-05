package com.google.ads.interactivemedia.v3.internal;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f22128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f22129b;

    static {
        String str = Build.VERSION.RELEASE;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 57);
        sb.append("ExoPlayerLib/2.14.0 (Linux; Android ");
        sb.append(str);
        sb.append(") ExoPlayerLib/2.14.0");
        sb.toString();
        f22128a = new HashSet<>();
        f22129b = "goog.exo.core";
    }

    public static synchronized String a() {
        return f22129b;
    }

    public static synchronized void b(String str) {
        if (f22128a.add(str)) {
            String str2 = f22129b;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 2 + str.length());
            sb.append(str2);
            sb.append(", ");
            sb.append(str);
            f22129b = sb.toString();
        }
    }
}
