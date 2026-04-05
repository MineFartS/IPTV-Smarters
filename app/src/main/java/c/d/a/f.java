package c.d.a;

import android.content.Context;
import c.d.a.j;
import c.d.a.n.j.l;
import c.d.a.o.m;

/* JADX INFO: loaded from: classes.dex */
public class f<ModelType, DataType, ResourceType> extends e<ModelType, DataType, ResourceType, ResourceType> {
    public final l<ModelType, DataType> E;
    public final Class<DataType> F;
    public final Class<ResourceType> G;
    public final j.d H;

    public f(Context context, g gVar, Class<ModelType> cls, l<ModelType, DataType> lVar, Class<DataType> cls2, Class<ResourceType> cls3, m mVar, c.d.a.o.g gVar2, j.d dVar) {
        super(context, cls, y(gVar, lVar, cls2, cls3, c.d.a.n.k.j.e.b()), cls3, gVar, mVar, gVar2);
        this.E = lVar;
        this.F = cls2;
        this.G = cls3;
        this.H = dVar;
    }

    public static <A, T, Z, R> c.d.a.q.f<A, T, Z, R> y(g gVar, l<A, T> lVar, Class<T> cls, Class<Z> cls2, c.d.a.n.k.j.c<Z, R> cVar) {
        return new c.d.a.q.e(lVar, cVar, gVar.a(cls, cls2));
    }
}
