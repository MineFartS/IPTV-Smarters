package c.f.d.w.n;

import c.f.d.t;
import c.f.d.w.n.i;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes2.dex */
public final class m<T> extends t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.d.e f16595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t<T> f16596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f16597c;

    public m(c.f.d.e eVar, t<T> tVar, Type type) {
        this.f16595a = eVar;
        this.f16596b = tVar;
        this.f16597c = type;
    }

    @Override // c.f.d.t
    public T b(c.f.d.y.a aVar) {
        return this.f16596b.b(aVar);
    }

    @Override // c.f.d.t
    public void d(c.f.d.y.c cVar, T t) {
        t<T> tVarL = this.f16596b;
        Type typeE = e(this.f16597c, t);
        if (typeE != this.f16597c) {
            tVarL = this.f16595a.l(c.f.d.x.a.b(typeE));
            if (tVarL instanceof i.b) {
                t<T> tVar = this.f16596b;
                if (!(tVar instanceof i.b)) {
                    tVarL = tVar;
                }
            }
        }
        tVarL.d(cVar, t);
    }

    public final Type e(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }
}
