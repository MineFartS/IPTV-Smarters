package c.f.c.k;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class p {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d<?> f16108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set<b> f16109b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set<b> f16110c = new HashSet();

        public b(d<?> dVar) {
            this.f16108a = dVar;
        }

        public void a(b bVar) {
            this.f16109b.add(bVar);
        }

        public void b(b bVar) {
            this.f16110c.add(bVar);
        }

        public d<?> c() {
            return this.f16108a;
        }

        public Set<b> d() {
            return this.f16109b;
        }

        public boolean e() {
            return this.f16109b.isEmpty();
        }

        public boolean f() {
            return this.f16110c.isEmpty();
        }

        public void g(b bVar) {
            this.f16110c.remove(bVar);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<?> f16111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f16112b;

        public c(Class<?> cls, boolean z) {
            this.f16111a = cls;
            this.f16112b = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f16111a.equals(this.f16111a) && cVar.f16112b == this.f16112b;
        }

        public int hashCode() {
            return ((this.f16111a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f16112b).hashCode();
        }
    }

    public static void a(List<d<?>> list) {
        Set<b> setC = c(list);
        Set<b> setB = b(setC);
        int i2 = 0;
        while (!setB.isEmpty()) {
            b next = setB.iterator().next();
            setB.remove(next);
            i2++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    setB.add(bVar);
                }
            }
        }
        if (i2 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : setC) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new r(arrayList);
    }

    public static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    public static Set<b> c(List<d<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<d<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (q qVar : bVar.c().c()) {
                            if (qVar.d() && (set = (Set) map.get(new c(qVar.b(), qVar.f()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            d<?> next = it.next();
            b bVar3 = new b(next);
            for (Class<? super Object> cls : next.e()) {
                c cVar = new c(cls, !next.k());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f16112b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar3);
            }
        }
    }
}
