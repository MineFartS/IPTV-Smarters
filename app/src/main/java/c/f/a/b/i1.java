package c.f.a.b;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final String f8831a = "ExoPlayerLib/2.15.0 (Linux; Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.15.0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet<String> f8832b = new HashSet<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f8833c = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f8832b.add(str)) {
            f8833c += ", " + str;
        }
    }

    public static synchronized String b() {
        return f8833c;
    }
}
