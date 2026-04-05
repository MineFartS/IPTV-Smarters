package k;

import java.io.IOException;
import java.util.ArrayList;
import k.p;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f31025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.g0.g.j f31026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f31027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f31028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f31029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f31030g;

    public final class a extends k.g0.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final f f31031c;

        public a(f fVar) {
            super("OkHttp %s", z.this.e());
            this.f31031c = fVar;
        }

        @Override // k.g0.b
        public void k() {
            IOException e2;
            c0 c0VarC;
            boolean z = true;
            try {
                try {
                    c0VarC = z.this.c();
                } catch (IOException e3) {
                    e2 = e3;
                    z = false;
                }
                try {
                    if (z.this.f31026c.e()) {
                        this.f31031c.b(z.this, new IOException("Canceled"));
                    } else {
                        this.f31031c.a(z.this, c0VarC);
                    }
                } catch (IOException e4) {
                    e2 = e4;
                    if (z) {
                        k.g0.j.e.h().l(4, "Callback failure for " + z.this.f(), e2);
                    } else {
                        this.f31031c.b(z.this, e2);
                    }
                }
            } finally {
                z.this.f31025b.j().e(this);
            }
        }

        public String l() {
            return z.this.f31028e.h().l();
        }
    }

    public z(x xVar, a0 a0Var, boolean z) {
        p.c cVarL = xVar.l();
        this.f31025b = xVar;
        this.f31028e = a0Var;
        this.f31029f = z;
        this.f31026c = new k.g0.g.j(xVar, z);
        this.f31027d = cVarL.a(this);
    }

    public final void a() {
        this.f31026c.i(k.g0.j.e.h().j("response.body().close()"));
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z clone() {
        return new z(this.f31025b, this.f31028e, this.f31029f);
    }

    public c0 c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f31025b.p());
        arrayList.add(this.f31026c);
        arrayList.add(new k.g0.g.a(this.f31025b.h()));
        arrayList.add(new k.g0.e.a(this.f31025b.q()));
        arrayList.add(new k.g0.f.a(this.f31025b));
        if (!this.f31029f) {
            arrayList.addAll(this.f31025b.r());
        }
        arrayList.add(new k.g0.g.b(this.f31029f));
        return new k.g0.g.g(arrayList, null, null, null, 0, this.f31028e).a(this.f31028e);
    }

    @Override // k.e
    public void cancel() {
        this.f31026c.b();
    }

    @Override // k.e
    public boolean d() {
        return this.f31026c.e();
    }

    public String e() {
        return this.f31028e.h().B();
    }

    @Override // k.e
    public c0 execute() {
        synchronized (this) {
            if (this.f31030g) {
                throw new IllegalStateException("Already Executed");
            }
            this.f31030g = true;
        }
        a();
        try {
            this.f31025b.j().b(this);
            c0 c0VarC = c();
            if (c0VarC != null) {
                return c0VarC;
            }
            throw new IOException("Canceled");
        } finally {
            this.f31025b.j().f(this);
        }
    }

    public String f() {
        StringBuilder sb = new StringBuilder();
        sb.append(d() ? "canceled " : BuildConfig.FLAVOR);
        sb.append(this.f31029f ? "web socket" : "call");
        sb.append(" to ");
        sb.append(e());
        return sb.toString();
    }

    @Override // k.e
    public void i(f fVar) {
        synchronized (this) {
            if (this.f31030g) {
                throw new IllegalStateException("Already Executed");
            }
            this.f31030g = true;
        }
        a();
        this.f31025b.j().a(new a(fVar));
    }
}
