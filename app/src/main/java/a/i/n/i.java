package a.i.n;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f1858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f1859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f1860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f1861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f1862e;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 18 || i2 >= 29) {
            return;
        }
        try {
            f1858a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
            Class cls = Long.TYPE;
            f1859b = Trace.class.getMethod("isTagEnabled", cls);
            Class cls2 = Integer.TYPE;
            f1860c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
            f1861d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
            f1862e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
        } catch (Exception e2) {
            Log.i("TraceCompat", "Unable to initialize via reflection.", e2);
        }
    }

    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
