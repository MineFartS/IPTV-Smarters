package c.f.a.b.j3;

import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
public final class v0 {
    public static void a(String str) {
        if (x0.f9296a >= 18) {
            b(str);
        }
    }

    public static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (x0.f9296a >= 18) {
            d();
        }
    }

    public static void d() {
        Trace.endSection();
    }
}
