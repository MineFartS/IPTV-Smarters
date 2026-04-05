package c.f.d.w;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Type, c.f.d.f<?>> f16472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.d.w.o.b f16473b = c.f.d.w.o.b.a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> implements c.f.d.w.i<T> {
        public a() {
        }

        @Override // c.f.d.w.i
        public T a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> implements c.f.d.w.i<T> {
        public b() {
        }

        @Override // c.f.d.w.i
        public T a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: c.f.d.w.c$c, reason: collision with other inner class name */
    public class C0202c<T> implements c.f.d.w.i<T> {
        public C0202c() {
        }

        @Override // c.f.d.w.i
        public T a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class d<T> implements c.f.d.w.i<T> {
        public d() {
        }

        @Override // c.f.d.w.i
        public T a() {
            return (T) new c.f.d.w.h();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class e<T> implements c.f.d.w.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.f.d.w.m f16478a = c.f.d.w.m.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f16479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Type f16480c;

        public e(Class cls, Type type) {
            this.f16479b = cls;
            this.f16480c = type;
        }

        @Override // c.f.d.w.i
        public T a() {
            try {
                return (T) this.f16478a.c(this.f16479b);
            } catch (Exception e2) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f16480c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e2);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class f<T> implements c.f.d.w.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.f.d.f f16482a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Type f16483b;

        public f(c.f.d.f fVar, Type type) {
            this.f16482a = fVar;
            this.f16483b = type;
        }

        @Override // c.f.d.w.i
        public T a() {
            return (T) this.f16482a.a(this.f16483b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class g<T> implements c.f.d.w.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.f.d.f f16485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Type f16486b;

        public g(c.f.d.f fVar, Type type) {
            this.f16485a = fVar;
            this.f16486b = type;
        }

        @Override // c.f.d.w.i
        public T a() {
            return (T) this.f16485a.a(this.f16486b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class h<T> implements c.f.d.w.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Constructor f16488a;

        public h(Constructor constructor) {
            this.f16488a = constructor;
        }

        @Override // c.f.d.w.i
        public T a() {
            try {
                return (T) this.f16488a.newInstance(null);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Failed to invoke " + this.f16488a + " with no args", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to invoke " + this.f16488a + " with no args", e4.getTargetException());
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class i<T> implements c.f.d.w.i<T> {
        public i() {
        }

        @Override // c.f.d.w.i
        public T a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class j<T> implements c.f.d.w.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Type f16491a;

        public j(Type type) {
            this.f16491a = type;
        }

        @Override // c.f.d.w.i
        public T a() {
            Type type = this.f16491a;
            if (!(type instanceof ParameterizedType)) {
                throw new c.f.d.k("Invalid EnumSet type: " + this.f16491a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            throw new c.f.d.k("Invalid EnumSet type: " + this.f16491a.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class k<T> implements c.f.d.w.i<T> {
        public k() {
        }

        @Override // c.f.d.w.i
        public T a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class l<T> implements c.f.d.w.i<T> {
        public l() {
        }

        @Override // c.f.d.w.i
        public T a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class m<T> implements c.f.d.w.i<T> {
        public m() {
        }

        @Override // c.f.d.w.i
        public T a() {
            return (T) new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class n<T> implements c.f.d.w.i<T> {
        public n() {
        }

        @Override // c.f.d.w.i
        public T a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, c.f.d.f<?>> map) {
        this.f16472a = map;
    }

    public <T> c.f.d.w.i<T> a(c.f.d.x.a<T> aVar) {
        Type typeE = aVar.e();
        Class<? super T> clsC = aVar.c();
        c.f.d.f<?> fVar = this.f16472a.get(typeE);
        if (fVar != null) {
            return new f(fVar, typeE);
        }
        c.f.d.f<?> fVar2 = this.f16472a.get(clsC);
        if (fVar2 != null) {
            return new g(fVar2, typeE);
        }
        c.f.d.w.i<T> iVarB = b(clsC);
        if (iVarB != null) {
            return iVarB;
        }
        c.f.d.w.i<T> iVarC = c(typeE, clsC);
        return iVarC != null ? iVarC : d(typeE, clsC);
    }

    public final <T> c.f.d.w.i<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f16473b.b(declaredConstructor);
            }
            return new h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final <T> c.f.d.w.i<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new i() : EnumSet.class.isAssignableFrom(cls) ? new j(type) : Set.class.isAssignableFrom(cls) ? new k() : Queue.class.isAssignableFrom(cls) ? new l() : new m();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new n() : ConcurrentMap.class.isAssignableFrom(cls) ? new a() : SortedMap.class.isAssignableFrom(cls) ? new b() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(c.f.d.x.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new d() : new C0202c();
        }
        return null;
    }

    public final <T> c.f.d.w.i<T> d(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    public String toString() {
        return this.f16472a.toString();
    }
}
