package c.k.a.y.j;

import c.k.a.u;
import com.amazonaws.services.s3.Headers;
import java.io.IOException;
import l.s;
import l.t;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f18432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f18433b;

    public i(g gVar, e eVar) {
        this.f18432a = gVar;
        this.f18433b = eVar;
    }

    @Override // c.k.a.y.j.p
    public void a() {
        this.f18433b.o();
    }

    @Override // c.k.a.y.j.p
    public s b(c.k.a.s sVar, long j2) {
        if ("chunked".equalsIgnoreCase(sVar.i("Transfer-Encoding"))) {
            return this.f18433b.r();
        }
        if (j2 != -1) {
            return this.f18433b.t(j2);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // c.k.a.y.j.p
    public void c() throws IOException {
        if (h()) {
            this.f18433b.w();
        } else {
            this.f18433b.l();
        }
    }

    @Override // c.k.a.y.j.p
    public void d(c.k.a.s sVar) {
        this.f18432a.A();
        this.f18433b.A(sVar.j(), k.a(sVar, this.f18432a.f().g().b().type(), this.f18432a.f().f()));
    }

    @Override // c.k.a.y.j.p
    public void e() {
        this.f18433b.n();
    }

    @Override // c.k.a.y.j.p
    public void f(l lVar) {
        this.f18433b.B(lVar);
    }

    @Override // c.k.a.y.j.p
    public u.b g() {
        return this.f18433b.y();
    }

    @Override // c.k.a.y.j.p
    public boolean h() {
        return ("close".equalsIgnoreCase(this.f18432a.g().i(Headers.CONNECTION)) || "close".equalsIgnoreCase(this.f18432a.i().q(Headers.CONNECTION)) || this.f18433b.p()) ? false : true;
    }

    @Override // c.k.a.y.j.p
    public t i(b bVar) {
        if (!this.f18432a.l()) {
            return this.f18433b.u(bVar, 0L);
        }
        if ("chunked".equalsIgnoreCase(this.f18432a.i().q("Transfer-Encoding"))) {
            return this.f18433b.s(bVar, this.f18432a);
        }
        long jE = j.e(this.f18432a.i());
        return jE != -1 ? this.f18433b.u(bVar, jE) : this.f18433b.v(bVar);
    }
}
