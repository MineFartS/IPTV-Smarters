package c.f.c.k;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Class<? super T>> f16065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<q> f16066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h<T> f16069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<Class<?>> f16070f;

    public static class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<Class<? super T>> f16071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set<q> f16072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16074d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public h<T> f16075e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Set<Class<?>> f16076f;

        @SafeVarargs
        public b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f16071a = hashSet;
            this.f16072b = new HashSet();
            this.f16073c = 0;
            this.f16074d = 0;
            this.f16076f = new HashSet();
            c0.c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                c0.c(cls2, "Null interface");
            }
            Collections.addAll(this.f16071a, clsArr);
        }

        public b<T> b(q qVar) {
            c0.c(qVar, "Null dependency");
            i(qVar.b());
            this.f16072b.add(qVar);
            return this;
        }

        public b<T> c() {
            return h(1);
        }

        public d<T> d() {
            c0.d(this.f16075e != null, "Missing required property: factory.");
            return new d<>(new HashSet(this.f16071a), new HashSet(this.f16072b), this.f16073c, this.f16074d, this.f16075e, this.f16076f);
        }

        public b<T> e() {
            return h(2);
        }

        public b<T> f(h<T> hVar) {
            this.f16075e = (h) c0.c(hVar, "Null factory");
            return this;
        }

        public final b<T> g() {
            this.f16074d = 1;
            return this;
        }

        public final b<T> h(int i2) {
            c0.d(this.f16073c == 0, "Instantiation type has already been set.");
            this.f16073c = i2;
            return this;
        }

        public final void i(Class<?> cls) {
            c0.a(!this.f16071a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    public d(Set<Class<? super T>> set, Set<q> set2, int i2, int i3, h<T> hVar, Set<Class<?>> set3) {
        this.f16065a = Collections.unmodifiableSet(set);
        this.f16066b = Collections.unmodifiableSet(set2);
        this.f16067c = i2;
        this.f16068d = i3;
        this.f16069e = hVar;
        this.f16070f = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> b(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> d<T> g(T t, Class<T> cls) {
        return h(cls).f(c.b(t)).d();
    }

    public static <T> b<T> h(Class<T> cls) {
        return a(cls).g();
    }

    public static /* synthetic */ Object l(Object obj, e eVar) {
        return obj;
    }

    public static /* synthetic */ Object m(Object obj, e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> d<T> n(T t, Class<T> cls, Class<? super T>... clsArr) {
        return b(cls, clsArr).f(c.f.c.k.b.b(t)).d();
    }

    public Set<q> c() {
        return this.f16066b;
    }

    public h<T> d() {
        return this.f16069e;
    }

    public Set<Class<? super T>> e() {
        return this.f16065a;
    }

    public Set<Class<?>> f() {
        return this.f16070f;
    }

    public boolean i() {
        return this.f16067c == 1;
    }

    public boolean j() {
        return this.f16067c == 2;
    }

    public boolean k() {
        return this.f16068d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f16065a.toArray()) + ">{" + this.f16067c + ", type=" + this.f16068d + ", deps=" + Arrays.toString(this.f16066b.toArray()) + "}";
    }
}
