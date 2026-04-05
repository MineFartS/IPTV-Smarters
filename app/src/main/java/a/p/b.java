package a.p;

import a.p.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f2987a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, a> f2988b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, Boolean> f2989c = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<f.b, List<C0061b>> f2990a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<C0061b, f.b> f2991b;

        public a(Map<C0061b, f.b> map) {
            this.f2991b = map;
            for (Map.Entry<C0061b, f.b> entry : map.entrySet()) {
                f.b value = entry.getValue();
                List<C0061b> arrayList = this.f2990a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f2990a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        public static void b(List<C0061b> list, k kVar, f.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(kVar, bVar, obj);
                }
            }
        }

        public void a(k kVar, f.b bVar, Object obj) {
            b(this.f2990a.get(bVar), kVar, bVar, obj);
            b(this.f2990a.get(f.b.ON_ANY), kVar, bVar, obj);
        }
    }

    /* JADX INFO: renamed from: a.p.b$b, reason: collision with other inner class name */
    public static final class C0061b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f2993b;

        public C0061b(int i2, Method method) {
            this.f2992a = i2;
            this.f2993b = method;
            method.setAccessible(true);
        }

        public void a(k kVar, f.b bVar, Object obj) {
            try {
                int i2 = this.f2992a;
                if (i2 == 0) {
                    this.f2993b.invoke(obj, new Object[0]);
                } else if (i2 == 1) {
                    this.f2993b.invoke(obj, kVar);
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    this.f2993b.invoke(obj, kVar, bVar);
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to call observer method", e3.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0061b)) {
                return false;
            }
            C0061b c0061b = (C0061b) obj;
            return this.f2992a == c0061b.f2992a && this.f2993b.getName().equals(c0061b.f2993b.getName());
        }

        public int hashCode() {
            return (this.f2992a * 31) + this.f2993b.getName().hashCode();
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i2;
        a aVarC;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f2991b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0061b, f.b> entry : c(cls2).f2991b.entrySet()) {
                e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            r rVar = (r) method.getAnnotation(r.class);
            if (rVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(k.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                f.b bVarValue = rVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(f.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (bVarValue != f.b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new C0061b(i2, method), bVarValue, cls);
                z = true;
            }
        }
        a aVar = new a(map);
        this.f2988b.put(cls, aVar);
        this.f2989c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    public final Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    public a c(Class<?> cls) {
        a aVar = this.f2988b.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public boolean d(Class<?> cls) {
        Boolean bool = this.f2989c.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((r) method.getAnnotation(r.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f2989c.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map<C0061b, f.b> map, C0061b c0061b, f.b bVar, Class<?> cls) {
        f.b bVar2 = map.get(c0061b);
        if (bVar2 == null || bVar == bVar2) {
            if (bVar2 == null) {
                map.put(c0061b, bVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0061b.f2993b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar2 + ", new value " + bVar);
    }
}
