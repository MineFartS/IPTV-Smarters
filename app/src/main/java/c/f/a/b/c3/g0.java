package c.f.a.b.c3;

import c.f.a.b.c3.c0;
import c.f.a.b.i3.p0.d;
import c.f.a.b.i3.p0.k;
import c.f.a.b.i3.s;
import c.f.a.b.j3.k0;
import c.f.a.b.j3.n0;
import c.f.a.b.j3.x0;
import c.f.a.b.p1;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f6710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.i3.s f6711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.i3.p0.d f6712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.b.i3.p0.k f6713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0 f6714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c0.a f6715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile n0<Void, IOException> f6716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f6717h;

    public class a extends n0<Void, IOException> {
        public a() {
        }

        @Override // c.f.a.b.j3.n0
        public void c() {
            g0.this.f6713d.b();
        }

        @Override // c.f.a.b.j3.n0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Void d() throws IOException {
            g0.this.f6713d.a();
            return null;
        }
    }

    public g0(p1 p1Var, d.c cVar, Executor executor) {
        this.f6710a = (Executor) c.f.a.b.j3.g.e(executor);
        c.f.a.b.j3.g.e(p1Var.f9643d);
        c.f.a.b.i3.s sVarA = new s.b().i(p1Var.f9643d.f9685a).f(p1Var.f9643d.f9690f).b(4).a();
        this.f6711b = sVarA;
        c.f.a.b.i3.p0.d dVarC = cVar.c();
        this.f6712c = dVarC;
        this.f6713d = new c.f.a.b.i3.p0.k(dVarC, sVarA, null, new k.a() { // from class: c.f.a.b.c3.m
            @Override // c.f.a.b.i3.p0.k.a
            public final void a(long j2, long j3, long j4) {
                this.f6753a.d(j2, j3, j4);
            }
        });
        this.f6714e = cVar.h();
    }

    @Override // c.f.a.b.c3.c0
    public void a(c0.a aVar) {
        this.f6715f = aVar;
        this.f6716g = new a();
        k0 k0Var = this.f6714e;
        if (k0Var != null) {
            k0Var.a(-1000);
        }
        boolean z = false;
        while (!z) {
            try {
                if (this.f6717h) {
                    break;
                }
                k0 k0Var2 = this.f6714e;
                if (k0Var2 != null) {
                    k0Var2.b(-1000);
                }
                this.f6710a.execute(this.f6716g);
                try {
                    this.f6716g.get();
                    z = true;
                } catch (ExecutionException e2) {
                    Throwable th = (Throwable) c.f.a.b.j3.g.e(e2.getCause());
                    if (!(th instanceof k0.a)) {
                        if (th instanceof IOException) {
                            throw ((IOException) th);
                        }
                        x0.S0(th);
                    }
                }
            } finally {
                this.f6716g.a();
                k0 k0Var3 = this.f6714e;
                if (k0Var3 != null) {
                    k0Var3.d(-1000);
                }
            }
        }
    }

    @Override // c.f.a.b.c3.c0
    public void cancel() {
        this.f6717h = true;
        n0<Void, IOException> n0Var = this.f6716g;
        if (n0Var != null) {
            n0Var.cancel(true);
        }
    }

    public final void d(long j2, long j3, long j4) {
        c0.a aVar = this.f6715f;
        if (aVar == null) {
            return;
        }
        aVar.a(j2, j3, (j2 == -1 || j2 == 0) ? -1.0f : (j3 * 100.0f) / j2);
    }

    @Override // c.f.a.b.c3.c0
    public void remove() {
        this.f6712c.v().i(this.f6712c.w().a(this.f6711b));
    }
}
