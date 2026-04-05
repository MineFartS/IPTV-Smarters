package c.f.d.w.n;

import c.f.d.t;
import c.f.d.u;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.d.w.c f16548b;

    public static final class a<E> extends t<Collection<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t<E> f16549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.f.d.w.i<? extends Collection<E>> f16550b;

        public a(c.f.d.e eVar, Type type, t<E> tVar, c.f.d.w.i<? extends Collection<E>> iVar) {
            this.f16549a = new m(eVar, tVar, type);
            this.f16550b = iVar;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<E> b(c.f.d.y.a aVar) throws IOException {
            if (aVar.B0() == c.f.d.y.b.NULL) {
                aVar.c0();
                return null;
            }
            Collection<E> collectionA = this.f16550b.a();
            aVar.d();
            while (aVar.s()) {
                collectionA.add(this.f16549a.b(aVar));
            }
            aVar.o();
            return collectionA;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.v();
                return;
            }
            cVar.l();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f16549a.d(cVar, it.next());
            }
            cVar.o();
        }
    }

    public b(c.f.d.w.c cVar) {
        this.f16548b = cVar;
    }

    @Override // c.f.d.u
    public <T> t<T> a(c.f.d.e eVar, c.f.d.x.a<T> aVar) {
        Type typeE = aVar.e();
        Class<? super T> clsC = aVar.c();
        if (!Collection.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type typeH = c.f.d.w.b.h(typeE, clsC);
        return new a(eVar, typeH, eVar.l(c.f.d.x.a.b(typeH)), this.f16548b.a(aVar));
    }
}
