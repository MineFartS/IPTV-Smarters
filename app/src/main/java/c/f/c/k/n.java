package c.f.c.k;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class n extends c.f.c.k.a implements c.f.c.m.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.c.r.b<Set<Object>> f16097a = m.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<d<?>, c.f.c.r.b<?>> f16098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, c.f.c.r.b<?>> f16099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Class<?>, x<?>> f16100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<c.f.c.r.b<i>> f16101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f16102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<Boolean> f16103g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f16104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<c.f.c.r.b<i>> f16105b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<d<?>> f16106c = new ArrayList();

        public b(Executor executor) {
            this.f16104a = executor;
        }

        public static /* synthetic */ i e(i iVar) {
            return iVar;
        }

        public b a(d<?> dVar) {
            this.f16106c.add(dVar);
            return this;
        }

        public b b(i iVar) {
            this.f16105b.add(o.a(iVar));
            return this;
        }

        public b c(Collection<c.f.c.r.b<i>> collection) {
            this.f16105b.addAll(collection);
            return this;
        }

        public n d() {
            return new n(this.f16104a, this.f16105b, this.f16106c);
        }
    }

    public n(Executor executor, Iterable<c.f.c.r.b<i>> iterable, Collection<d<?>> collection) {
        this.f16098b = new HashMap();
        this.f16099c = new HashMap();
        this.f16100d = new HashMap();
        this.f16103g = new AtomicReference<>();
        u uVar = new u(executor);
        this.f16102f = uVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(d.n(uVar, u.class, c.f.c.o.d.class, c.f.c.o.c.class));
        arrayList.add(d.n(this, c.f.c.m.a.class, new Class[0]));
        for (d<?> dVar : collection) {
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        this.f16101e = i(iterable);
        f(arrayList);
    }

    public static b e(Executor executor) {
        return new b(executor);
    }

    public static <T> List<T> i(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // c.f.c.k.a, c.f.c.k.e
    public /* bridge */ /* synthetic */ Object a(Class cls) {
        return super.a(cls);
    }

    @Override // c.f.c.k.e
    public synchronized <T> c.f.c.r.b<T> b(Class<T> cls) {
        c0.c(cls, "Null interface requested.");
        return (c.f.c.r.b) this.f16099c.get(cls);
    }

    @Override // c.f.c.k.e
    public synchronized <T> c.f.c.r.b<Set<T>> c(Class<T> cls) {
        x<?> xVar = this.f16100d.get(cls);
        if (xVar != null) {
            return xVar;
        }
        return (c.f.c.r.b<Set<T>>) f16097a;
    }

    @Override // c.f.c.k.a, c.f.c.k.e
    public /* bridge */ /* synthetic */ Set d(Class cls) {
        return super.d(cls);
    }

    public final void f(List<d<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<c.f.c.r.b<i>> it = this.f16101e.iterator();
            while (it.hasNext()) {
                try {
                    i iVar = it.next().get();
                    if (iVar != null) {
                        list.addAll(iVar.getComponents());
                        it.remove();
                    }
                } catch (v e2) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            if (this.f16098b.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f16098b.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            for (d<?> dVar : list) {
                this.f16098b.put(dVar, new w(j.a(this, dVar)));
            }
            arrayList.addAll(o(list));
            arrayList.addAll(p());
            n();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        m();
    }

    public final void g(Map<d<?>, c.f.c.r.b<?>> map, boolean z) {
        for (Map.Entry<d<?>, c.f.c.r.b<?>> entry : map.entrySet()) {
            d<?> key = entry.getKey();
            c.f.c.r.b<?> value = entry.getValue();
            if (key.i() || (key.j() && z)) {
                value.get();
            }
        }
        this.f16102f.c();
    }

    public void h(boolean z) {
        HashMap map;
        if (this.f16103g.compareAndSet(null, Boolean.valueOf(z))) {
            synchronized (this) {
                map = new HashMap(this.f16098b);
            }
            g(map, z);
        }
    }

    public final void m() {
        Boolean bool = this.f16103g.get();
        if (bool != null) {
            g(this.f16098b, bool.booleanValue());
        }
    }

    public final void n() {
        Map map;
        Class<?> clsB;
        c.f.c.r.b bVarA;
        for (d<?> dVar : this.f16098b.keySet()) {
            for (q qVar : dVar.c()) {
                if (qVar.f() && !this.f16100d.containsKey(qVar.b())) {
                    map = this.f16100d;
                    clsB = qVar.b();
                    bVarA = x.b(Collections.emptySet());
                } else if (this.f16099c.containsKey(qVar.b())) {
                    continue;
                } else {
                    if (qVar.e()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", dVar, qVar.b()));
                    }
                    if (!qVar.f()) {
                        map = this.f16099c;
                        clsB = qVar.b();
                        bVarA = b0.a();
                    }
                }
                map.put(clsB, bVarA);
            }
        }
    }

    public final List<Runnable> o(List<d<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (d<?> dVar : list) {
            if (dVar.k()) {
                c.f.c.r.b<?> bVar = this.f16098b.get(dVar);
                for (Class<? super Object> cls : dVar.e()) {
                    if (this.f16099c.containsKey(cls)) {
                        arrayList.add(k.a((b0) this.f16099c.get(cls), bVar));
                    } else {
                        this.f16099c.put(cls, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<Runnable> p() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<d<?>, c.f.c.r.b<?>> entry : this.f16098b.entrySet()) {
            d<?> key = entry.getKey();
            if (!key.k()) {
                c.f.c.r.b<?> value = entry.getValue();
                for (Class<? super Object> cls : key.e()) {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f16100d.containsKey(entry2.getKey())) {
                x<?> xVar = this.f16100d.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(l.a(xVar, (c.f.c.r.b) it.next()));
                }
            } else {
                this.f16100d.put((Class) entry2.getKey(), x.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }
}
