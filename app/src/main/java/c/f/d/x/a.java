package c.f.d.x;

import c.f.d.w.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<? super T> f16635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f16636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16637c;

    public a() {
        Type typeD = d(a.class);
        this.f16636b = typeD;
        this.f16635a = (Class<? super T>) b.k(typeD);
        this.f16637c = typeD.hashCode();
    }

    public a(Type type) {
        Type typeB = b.b((Type) c.f.d.w.a.b(type));
        this.f16636b = typeB;
        this.f16635a = (Class<? super T>) b.k(typeB);
        this.f16637c = typeB.hashCode();
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> b(Type type) {
        return new a<>(type);
    }

    public static Type d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        return b.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
    }

    public final Class<? super T> c() {
        return this.f16635a;
    }

    public final Type e() {
        return this.f16636b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.f(this.f16636b, ((a) obj).f16636b);
    }

    public final int hashCode() {
        return this.f16637c;
    }

    public final String toString() {
        return b.u(this.f16636b);
    }
}
