package o.p.a;

import c.f.d.t;
import k.d0;
import o.e;

/* JADX INFO: loaded from: classes2.dex */
public final class c<T> implements e<d0, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.d.e f31371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t<T> f31372b;

    public c(c.f.d.e eVar, t<T> tVar) {
        this.f31371a = eVar;
        this.f31372b = tVar;
    }

    @Override // o.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(d0 d0Var) {
        try {
            return this.f31372b.b(this.f31371a.p(d0Var.d()));
        } finally {
            d0Var.close();
        }
    }
}
