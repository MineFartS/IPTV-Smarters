package c.d.a;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import c.d.a.j;
import c.d.a.n.j.l;
import c.d.a.o.m;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class d<ModelType> extends c<ModelType> {
    public final l<ModelType, InputStream> E;
    public final l<ModelType, ParcelFileDescriptor> F;
    public final j.d G;

    public d(Class<ModelType> cls, l<ModelType, InputStream> lVar, l<ModelType, ParcelFileDescriptor> lVar2, Context context, g gVar, m mVar, c.d.a.o.g gVar2, j.d dVar) {
        super(context, cls, K(gVar, lVar, lVar2, c.d.a.n.k.i.a.class, c.d.a.n.k.f.b.class, null), gVar, mVar, gVar2);
        this.E = lVar;
        this.F = lVar2;
        this.G = dVar;
    }

    public static <A, Z, R> c.d.a.q.e<A, c.d.a.n.j.g, Z, R> K(g gVar, l<A, InputStream> lVar, l<A, ParcelFileDescriptor> lVar2, Class<Z> cls, Class<R> cls2, c.d.a.n.k.j.c<Z, R> cVar) {
        if (lVar == null && lVar2 == null) {
            return null;
        }
        if (cVar == null) {
            cVar = gVar.f(cls, cls2);
        }
        return new c.d.a.q.e<>(new c.d.a.n.j.f(lVar, lVar2), cVar, gVar.a(c.d.a.n.j.g.class, cls));
    }

    public b<ModelType> J() {
        j.d dVar = this.G;
        return (b) dVar.a(new b(this, this.E, this.F, dVar));
    }
}
