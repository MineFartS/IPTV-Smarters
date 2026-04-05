package c.f.a.b.e3;

import android.net.Uri;
import c.f.a.b.e3.i0;
import c.f.a.b.i3.p;
import c.f.a.b.i3.s;
import c.f.a.b.k1;
import c.f.a.b.p1;
import c.f.a.b.p2;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 extends n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c.f.a.b.i3.s f8034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p.a f8035i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k1 f8036j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f8037k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c.f.a.b.i3.f0 f8038l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f8039m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f8040n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p1 f8041o;
    public c.f.a.b.i3.n0 p;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p.a f8042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.f.a.b.i3.f0 f8043b = new c.f.a.b.i3.y();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f8044c = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f8045d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f8046e;

        public b(p.a aVar) {
            this.f8042a = (p.a) c.f.a.b.j3.g.e(aVar);
        }

        public x0 a(p1.h hVar, long j2) {
            return new x0(this.f8046e, hVar, this.f8042a, j2, this.f8043b, this.f8044c, this.f8045d);
        }

        public b b(c.f.a.b.i3.f0 f0Var) {
            if (f0Var == null) {
                f0Var = new c.f.a.b.i3.y();
            }
            this.f8043b = f0Var;
            return this;
        }
    }

    public x0(String str, p1.h hVar, p.a aVar, long j2, c.f.a.b.i3.f0 f0Var, boolean z, Object obj) {
        this.f8035i = aVar;
        this.f8037k = j2;
        this.f8038l = f0Var;
        this.f8039m = z;
        p1 p1VarA = new p1.c().B(Uri.EMPTY).v(hVar.f9693a.toString()).z(Collections.singletonList(hVar)).A(obj).a();
        this.f8041o = p1VarA;
        this.f8036j = new k1.b().S(str).e0(hVar.f9694b).V(hVar.f9695c).g0(hVar.f9696d).c0(hVar.f9697e).U(hVar.f9698f).E();
        this.f8034h = new s.b().i(hVar.f9693a).b(1).a();
        this.f8040n = new v0(j2, true, false, false, null, p1VarA);
    }

    @Override // c.f.a.b.e3.n
    public void B(c.f.a.b.i3.n0 n0Var) {
        this.p = n0Var;
        C(this.f8040n);
    }

    @Override // c.f.a.b.e3.n
    public void D() {
    }

    @Override // c.f.a.b.e3.i0
    public f0 a(i0.a aVar, c.f.a.b.i3.f fVar, long j2) {
        return new w0(this.f8034h, this.f8035i, this.p, this.f8036j, this.f8037k, this.f8038l, w(aVar), this.f8039m);
    }

    @Override // c.f.a.b.e3.i0
    public p1 h() {
        return this.f8041o;
    }

    @Override // c.f.a.b.e3.i0
    public void l() {
    }

    @Override // c.f.a.b.e3.i0
    public void o(f0 f0Var) {
        ((w0) f0Var).p();
    }
}
