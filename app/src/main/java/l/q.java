package l;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static p f31091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f31092b;

    public static void a(p pVar) {
        if (pVar.f31089f != null || pVar.f31090g != null) {
            throw new IllegalArgumentException();
        }
        if (pVar.f31087d) {
            return;
        }
        synchronized (q.class) {
            long j2 = f31092b;
            if (j2 + 8192 > 65536) {
                return;
            }
            f31092b = j2 + 8192;
            pVar.f31089f = f31091a;
            pVar.f31086c = 0;
            pVar.f31085b = 0;
            f31091a = pVar;
        }
    }

    public static p b() {
        synchronized (q.class) {
            p pVar = f31091a;
            if (pVar == null) {
                return new p();
            }
            f31091a = pVar.f31089f;
            pVar.f31089f = null;
            f31092b -= 8192;
            return pVar;
        }
    }
}
