package k.g0.g;

import java.util.List;
import k.a0;
import k.c0;
import k.u;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<u> f30640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k.g0.f.g f30641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f30642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k.g0.f.c f30643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f30645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30646g;

    public g(List<u> list, k.g0.f.g gVar, c cVar, k.g0.f.c cVar2, int i2, a0 a0Var) {
        this.f30640a = list;
        this.f30643d = cVar2;
        this.f30641b = gVar;
        this.f30642c = cVar;
        this.f30644e = i2;
        this.f30645f = a0Var;
    }

    @Override // k.u.a
    public c0 a(a0 a0Var) {
        return d(a0Var, this.f30641b, this.f30642c, this.f30643d);
    }

    public k.i b() {
        return this.f30643d;
    }

    public c c() {
        return this.f30642c;
    }

    public c0 d(a0 a0Var, k.g0.f.g gVar, c cVar, k.g0.f.c cVar2) {
        if (this.f30644e >= this.f30640a.size()) {
            throw new AssertionError();
        }
        this.f30646g++;
        if (this.f30642c != null && !this.f30643d.r(a0Var.h())) {
            throw new IllegalStateException("network interceptor " + this.f30640a.get(this.f30644e - 1) + " must retain the same host and port");
        }
        if (this.f30642c != null && this.f30646g > 1) {
            throw new IllegalStateException("network interceptor " + this.f30640a.get(this.f30644e - 1) + " must call proceed() exactly once");
        }
        g gVar2 = new g(this.f30640a, gVar, cVar, cVar2, this.f30644e + 1, a0Var);
        u uVar = this.f30640a.get(this.f30644e);
        c0 c0VarA = uVar.a(gVar2);
        if (cVar != null && this.f30644e + 1 < this.f30640a.size() && gVar2.f30646g != 1) {
            throw new IllegalStateException("network interceptor " + uVar + " must call proceed() exactly once");
        }
        if (c0VarA != null) {
            return c0VarA;
        }
        throw new NullPointerException("interceptor " + uVar + " returned null");
    }

    public k.g0.f.g e() {
        return this.f30641b;
    }

    @Override // k.u.a
    public a0 request() {
        return this.f30645f;
    }
}
