package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class bjh<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<? super T> f21214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f21215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21216c;

    public bjh() {
        Type genericSuperclass = bjh.class.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        this.f21215b = bgc.d(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        throw null;
    }

    public bjh(Type type) {
        art.f(type);
        Type typeD = bgc.d(type);
        this.f21215b = typeD;
        this.f21214a = (Class<? super T>) bgc.a(typeD);
        this.f21216c = typeD.hashCode();
    }

    public static <T> bjh<T> a(Class<T> cls) {
        return new bjh<>(cls);
    }

    public static bjh<?> b(Type type) {
        return new bjh<>(type);
    }

    public final Class<? super T> c() {
        return this.f21214a;
    }

    public final Type d() {
        return this.f21215b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bjh) && bgc.j(this.f21215b, ((bjh) obj).f21215b);
    }

    public final int hashCode() {
        return this.f21216c;
    }

    public final String toString() {
        return bgc.b(this.f21215b);
    }
}
