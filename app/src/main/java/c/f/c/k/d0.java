package c.f.c.k;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends c.f.c.k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Class<?>> f16077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Class<?>> f16078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<Class<?>> f16079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<Class<?>> f16080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<Class<?>> f16081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<Class<?>> f16082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f16083g;

    public static class a implements c.f.c.o.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<Class<?>> f16084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.f.c.o.c f16085b;

        public a(Set<Class<?>> set, c.f.c.o.c cVar) {
            this.f16084a = set;
            this.f16085b = cVar;
        }
    }

    public d0(d<?> dVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : dVar.c()) {
            if (qVar.d()) {
                boolean zF = qVar.f();
                Class<?> clsB = qVar.b();
                if (zF) {
                    hashSet4.add(clsB);
                } else {
                    hashSet.add(clsB);
                }
            } else if (qVar.c()) {
                hashSet3.add(qVar.b());
            } else {
                boolean zF2 = qVar.f();
                Class<?> clsB2 = qVar.b();
                if (zF2) {
                    hashSet5.add(clsB2);
                } else {
                    hashSet2.add(clsB2);
                }
            }
        }
        if (!dVar.f().isEmpty()) {
            hashSet.add(c.f.c.o.c.class);
        }
        this.f16077a = Collections.unmodifiableSet(hashSet);
        this.f16078b = Collections.unmodifiableSet(hashSet2);
        this.f16079c = Collections.unmodifiableSet(hashSet3);
        this.f16080d = Collections.unmodifiableSet(hashSet4);
        this.f16081e = Collections.unmodifiableSet(hashSet5);
        this.f16082f = dVar.f();
        this.f16083g = eVar;
    }

    @Override // c.f.c.k.a, c.f.c.k.e
    public <T> T a(Class<T> cls) {
        if (!this.f16077a.contains(cls)) {
            throw new s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.f16083g.a(cls);
        return !cls.equals(c.f.c.o.c.class) ? t : (T) new a(this.f16082f, (c.f.c.o.c) t);
    }

    @Override // c.f.c.k.e
    public <T> c.f.c.r.b<T> b(Class<T> cls) {
        if (this.f16078b.contains(cls)) {
            return this.f16083g.b(cls);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // c.f.c.k.e
    public <T> c.f.c.r.b<Set<T>> c(Class<T> cls) {
        if (this.f16081e.contains(cls)) {
            return this.f16083g.c(cls);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // c.f.c.k.a, c.f.c.k.e
    public <T> Set<T> d(Class<T> cls) {
        if (this.f16080d.contains(cls)) {
            return this.f16083g.d(cls);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }
}
