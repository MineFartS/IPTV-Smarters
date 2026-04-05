package c.f.a.c.k.b;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Handler f14084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y5 f14085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f14086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile long f14087d;

    public m(y5 y5Var) {
        c.f.a.c.f.q.o.i(y5Var);
        this.f14085b = y5Var;
        this.f14086c = new l(this, y5Var);
    }

    public static /* synthetic */ long e(m mVar, long j2) {
        mVar.f14087d = 0L;
        return 0L;
    }

    public abstract void a();

    public final void b(long j2) {
        d();
        if (j2 >= 0) {
            this.f14087d = this.f14085b.a().a();
            if (f().postDelayed(this.f14086c, j2)) {
                return;
            }
            this.f14085b.c().o().b("Failed to schedule delayed post. time", Long.valueOf(j2));
        }
    }

    public final boolean c() {
        return this.f14087d != 0;
    }

    public final void d() {
        this.f14087d = 0L;
        f().removeCallbacks(this.f14086c);
    }

    public final Handler f() {
        Handler handler;
        if (f14084a != null) {
            return f14084a;
        }
        synchronized (m.class) {
            if (f14084a == null) {
                f14084a = new c.f.a.c.j.h.u9(this.f14085b.b().getMainLooper());
            }
            handler = f14084a;
        }
        return handler;
    }
}
