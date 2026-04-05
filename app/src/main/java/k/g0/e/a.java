package k.g0.e;

import com.amazonaws.services.s3.Headers;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import k.a0;
import k.c0;
import k.g0.e.c;
import k.g0.g.f;
import k.g0.g.h;
import k.s;
import k.u;
import k.y;
import l.e;
import l.m;
import l.t;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f30572a;

    /* JADX INFO: renamed from: k.g0.e.a$a, reason: collision with other inner class name */
    public class C0310a implements t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f30573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f30574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f30575d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l.d f30576e;

        public C0310a(e eVar, b bVar, l.d dVar) {
            this.f30574c = eVar;
            this.f30575d = bVar;
            this.f30576e = dVar;
        }

        @Override // l.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f30573b && !k.g0.c.i(this, 100, TimeUnit.MILLISECONDS)) {
                this.f30573b = true;
                this.f30575d.a();
            }
            this.f30574c.close();
        }

        @Override // l.t
        public long k(l.c cVar, long j2) throws IOException {
            try {
                long jK = this.f30574c.k(cVar, j2);
                if (jK != -1) {
                    cVar.o(this.f30576e.z(), cVar.H0() - jK, jK);
                    this.f30576e.N();
                    return jK;
                }
                if (!this.f30573b) {
                    this.f30573b = true;
                    this.f30576e.close();
                }
                return -1L;
            } catch (IOException e2) {
                if (!this.f30573b) {
                    this.f30573b = true;
                    this.f30575d.a();
                }
                throw e2;
            }
        }

        @Override // l.t
        public l.u timeout() {
            return this.f30574c.timeout();
        }
    }

    public a(d dVar) {
        this.f30572a = dVar;
    }

    public static s c(s sVar, s sVar2) {
        s.a aVar = new s.a();
        int iF = sVar.f();
        for (int i2 = 0; i2 < iF; i2++) {
            String strC = sVar.c(i2);
            String strG = sVar.g(i2);
            if ((!"Warning".equalsIgnoreCase(strC) || !strG.startsWith("1")) && (!d(strC) || sVar2.a(strC) == null)) {
                k.g0.a.f30553a.b(aVar, strC, strG);
            }
        }
        int iF2 = sVar2.f();
        for (int i3 = 0; i3 < iF2; i3++) {
            String strC2 = sVar2.c(i3);
            if (!"Content-Length".equalsIgnoreCase(strC2) && d(strC2)) {
                k.g0.a.f30553a.b(aVar, strC2, sVar2.g(i3));
            }
        }
        return aVar.d();
    }

    public static boolean d(String str) {
        return (Headers.CONNECTION.equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static c0 e(c0 c0Var) {
        return (c0Var == null || c0Var.d() == null) ? c0Var : c0Var.r().b(null).c();
    }

    @Override // k.u
    public c0 a(u.a aVar) {
        d dVar = this.f30572a;
        c0 c0VarE = dVar != null ? dVar.e(aVar.request()) : null;
        c cVarC = new c.a(System.currentTimeMillis(), aVar.request(), c0VarE).c();
        a0 a0Var = cVarC.f30578a;
        c0 c0Var = cVarC.f30579b;
        d dVar2 = this.f30572a;
        if (dVar2 != null) {
            dVar2.b(cVarC);
        }
        if (c0VarE != null && c0Var == null) {
            k.g0.c.c(c0VarE.d());
        }
        if (a0Var == null && c0Var == null) {
            return new c0.a().o(aVar.request()).m(y.HTTP_1_1).g(504).j("Unsatisfiable Request (only-if-cached)").b(k.g0.c.f30557c).p(-1L).n(System.currentTimeMillis()).c();
        }
        if (a0Var == null) {
            return c0Var.r().d(e(c0Var)).c();
        }
        try {
            c0 c0VarA = aVar.a(a0Var);
            if (c0VarA == null && c0VarE != null) {
            }
            if (c0Var != null) {
                if (c0VarA.l() == 304) {
                    c0 c0VarC = c0Var.r().i(c(c0Var.p(), c0VarA.p())).p(c0VarA.u()).n(c0VarA.s()).d(e(c0Var)).k(e(c0VarA)).c();
                    c0VarA.d().close();
                    this.f30572a.a();
                    this.f30572a.f(c0Var, c0VarC);
                    return c0VarC;
                }
                k.g0.c.c(c0Var.d());
            }
            c0 c0VarC2 = c0VarA.r().d(e(c0Var)).k(e(c0VarA)).c();
            if (this.f30572a != null) {
                if (k.g0.g.e.c(c0VarC2) && c.a(c0VarC2, a0Var)) {
                    return b(this.f30572a.d(c0VarC2), c0VarC2);
                }
                if (f.a(a0Var.f())) {
                    try {
                        this.f30572a.c(a0Var);
                    } catch (IOException unused) {
                    }
                }
            }
            return c0VarC2;
        } finally {
            if (c0VarE != null) {
                k.g0.c.c(c0VarE.d());
            }
        }
    }

    public final c0 b(b bVar, c0 c0Var) {
        l.s sVarBody;
        return (bVar == null || (sVarBody = bVar.body()) == null) ? c0Var : c0Var.r().b(new h(c0Var.p(), m.c(new C0310a(c0Var.d().p(), bVar, m.b(sVarBody))))).c();
    }
}
