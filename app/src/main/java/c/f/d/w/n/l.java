package c.f.d.w.n;

import c.f.d.p;
import c.f.d.q;
import c.f.d.t;
import c.f.d.u;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class l<T> extends t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q<T> f16587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.d.i<T> f16588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.d.e f16589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.d.x.a<T> f16590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f16591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l<T>.b f16592f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t<T> f16593g;

    public final class b implements p, c.f.d.h {
        public b() {
        }
    }

    public l(q<T> qVar, c.f.d.i<T> iVar, c.f.d.e eVar, c.f.d.x.a<T> aVar, u uVar) {
        this.f16587a = qVar;
        this.f16588b = iVar;
        this.f16589c = eVar;
        this.f16590d = aVar;
        this.f16591e = uVar;
    }

    @Override // c.f.d.t
    public T b(c.f.d.y.a aVar) {
        if (this.f16588b == null) {
            return e().b(aVar);
        }
        c.f.d.j jVarA = c.f.d.w.l.a(aVar);
        if (jVarA.t()) {
            return null;
        }
        return this.f16588b.deserialize(jVarA, this.f16590d.e(), this.f16592f);
    }

    @Override // c.f.d.t
    public void d(c.f.d.y.c cVar, T t) throws IOException {
        q<T> qVar = this.f16587a;
        if (qVar == null) {
            e().d(cVar, t);
        } else if (t == null) {
            cVar.v();
        } else {
            c.f.d.w.l.b(qVar.serialize(t, this.f16590d.e(), this.f16592f), cVar);
        }
    }

    public final t<T> e() {
        t<T> tVar = this.f16593g;
        if (tVar != null) {
            return tVar;
        }
        t<T> tVarN = this.f16589c.n(this.f16591e, this.f16590d);
        this.f16593g = tVarN;
        return tVarN;
    }
}
