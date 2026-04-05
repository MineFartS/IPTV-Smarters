package c.d.a.t;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f5955a;

    static {
        f5955a = 17 <= Build.VERSION.SDK_INT ? 1.0d / Math.pow(10.0d, 6.0d) : 1.0d;
    }

    public static double a(long j2) {
        double dB = b() - j2;
        double d2 = f5955a;
        Double.isNaN(dB);
        return dB * d2;
    }

    @TargetApi(17)
    public static long b() {
        return 17 <= Build.VERSION.SDK_INT ? SystemClock.elapsedRealtimeNanos() : System.currentTimeMillis();
    }
}
