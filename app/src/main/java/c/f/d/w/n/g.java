package c.f.d.w.n;

import c.f.d.o;
import c.f.d.r;
import c.f.d.t;
import c.f.d.u;
import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.d.w.c f16557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16558c;

    public final class a<K, V> extends t<Map<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t<K> f16559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t<V> f16560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c.f.d.w.i<? extends Map<K, V>> f16561c;

        public a(c.f.d.e eVar, Type type, t<K> tVar, Type type2, t<V> tVar2, c.f.d.w.i<? extends Map<K, V>> iVar) {
            this.f16559a = new m(eVar, tVar, type);
            this.f16560b = new m(eVar, tVar2, type2);
            this.f16561c = iVar;
        }

        public final String e(c.f.d.j jVar) {
            if (!jVar.x()) {
                if (jVar.t()) {
                    return Constants.NULL_VERSION_ID;
                }
                throw new AssertionError();
            }
            o oVarG = jVar.g();
            if (oVarG.L()) {
                return String.valueOf(oVarG.I());
            }
            if (oVarG.J()) {
                return Boolean.toString(oVarG.B());
            }
            if (oVarG.M()) {
                return oVarG.i();
            }
            throw new AssertionError();
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<K, V> b(c.f.d.y.a aVar) throws IOException {
            c.f.d.y.b bVarB0 = aVar.B0();
            if (bVarB0 == c.f.d.y.b.NULL) {
                aVar.c0();
                return null;
            }
            Map<K, V> mapA = this.f16561c.a();
            if (bVarB0 == c.f.d.y.b.BEGIN_ARRAY) {
                aVar.d();
                while (aVar.s()) {
                    aVar.d();
                    K kB = this.f16559a.b(aVar);
                    if (mapA.put(kB, this.f16560b.b(aVar)) != null) {
                        throw new r("duplicate key: " + kB);
                    }
                    aVar.o();
                }
                aVar.o();
            } else {
                aVar.i();
                while (aVar.s()) {
                    c.f.d.w.f.f16511a.a(aVar);
                    K kB2 = this.f16559a.b(aVar);
                    if (mapA.put(kB2, this.f16560b.b(aVar)) != null) {
                        throw new r("duplicate key: " + kB2);
                    }
                }
                aVar.p();
            }
            return mapA;
        }

        @Override // c.f.d.t
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(c.f.d.y.c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.v();
                return;
            }
            if (!g.this.f16558c) {
                cVar.m();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.t(String.valueOf(entry.getKey()));
                    this.f16560b.d(cVar, entry.getValue());
                }
                cVar.p();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i2 = 0;
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                c.f.d.j jVarC = this.f16559a.c(entry2.getKey());
                arrayList.add(jVarC);
                arrayList2.add(entry2.getValue());
                z |= jVarC.s() || jVarC.v();
            }
            if (!z) {
                cVar.m();
                int size = arrayList.size();
                while (i2 < size) {
                    cVar.t(e((c.f.d.j) arrayList.get(i2)));
                    this.f16560b.d(cVar, (V) arrayList2.get(i2));
                    i2++;
                }
                cVar.p();
                return;
            }
            cVar.l();
            int size2 = arrayList.size();
            while (i2 < size2) {
                cVar.l();
                c.f.d.w.l.b((c.f.d.j) arrayList.get(i2), cVar);
                this.f16560b.d(cVar, (V) arrayList2.get(i2));
                cVar.o();
                i2++;
            }
            cVar.o();
        }
    }

    public g(c.f.d.w.c cVar, boolean z) {
        this.f16557b = cVar;
        this.f16558c = z;
    }

    @Override // c.f.d.u
    public <T> t<T> a(c.f.d.e eVar, c.f.d.x.a<T> aVar) {
        Type typeE = aVar.e();
        if (!Map.class.isAssignableFrom(aVar.c())) {
            return null;
        }
        Type[] typeArrJ = c.f.d.w.b.j(typeE, c.f.d.w.b.k(typeE));
        return new a(eVar, typeArrJ[0], b(eVar, typeArrJ[0]), typeArrJ[1], eVar.l(c.f.d.x.a.b(typeArrJ[1])), this.f16557b.a(aVar));
    }

    public final t<?> b(c.f.d.e eVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? n.f16603f : eVar.l(c.f.d.x.a.b(type));
    }
}
