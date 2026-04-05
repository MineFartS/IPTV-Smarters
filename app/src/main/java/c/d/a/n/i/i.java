package c.d.a.n.i;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class i implements Runnable, c.d.a.n.i.p.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.d.a.i f5585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f5586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.d.a.n.i.a<?, ?, ?> f5587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f5588e = b.CACHE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f5589f;

    public interface a extends c.d.a.r.e {
        void f(i iVar);
    }

    public enum b {
        CACHE,
        SOURCE
    }

    public i(a aVar, c.d.a.n.i.a<?, ?, ?> aVar2, c.d.a.i iVar) {
        this.f5586c = aVar;
        this.f5587d = aVar2;
        this.f5585b = iVar;
    }

    @Override // c.d.a.n.i.p.b
    public int a() {
        return this.f5585b.ordinal();
    }

    public void b() {
        this.f5589f = true;
        this.f5587d.c();
    }

    public final l<?> c() {
        return f() ? d() : e();
    }

    public final l<?> d() {
        l<?> lVarF;
        try {
            lVarF = this.f5587d.f();
        } catch (Exception e2) {
            if (Log.isLoggable("EngineRunnable", 3)) {
                Log.d("EngineRunnable", "Exception decoding result from cache: " + e2);
            }
            lVarF = null;
        }
        return lVarF == null ? this.f5587d.h() : lVarF;
    }

    public final l<?> e() {
        return this.f5587d.d();
    }

    public final boolean f() {
        return this.f5588e == b.CACHE;
    }

    public final void g(l lVar) {
        this.f5586c.c(lVar);
    }

    public final void h(Exception exc) {
        if (!f()) {
            this.f5586c.a(exc);
        } else {
            this.f5588e = b.SOURCE;
            this.f5586c.f(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Exception jVar;
        if (this.f5589f) {
            return;
        }
        l<?> lVarC = null;
        try {
            lVarC = c();
            jVar = null;
        } catch (Exception e2) {
            if (Log.isLoggable("EngineRunnable", 2)) {
                Log.v("EngineRunnable", "Exception decoding", e2);
            }
            jVar = e2;
        } catch (OutOfMemoryError e3) {
            if (Log.isLoggable("EngineRunnable", 2)) {
                Log.v("EngineRunnable", "Out Of Memory Error decoding", e3);
            }
            jVar = new j(e3);
        }
        if (this.f5589f) {
            if (lVarC != null) {
                lVarC.b();
            }
        } else if (lVarC == null) {
            h(jVar);
        } else {
            g(lVarC);
        }
    }
}
