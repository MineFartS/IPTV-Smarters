package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class bmg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bmg f21402a = new bmg();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, bmk<?>> f21404c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bml f21403b = new blr();

    private bmg() {
    }

    public static bmg a() {
        return f21402a;
    }

    public final <T> bmk<T> b(Class<T> cls) {
        bld.j(cls, "messageType");
        bmk<T> bmkVarA = (bmk) this.f21404c.get(cls);
        if (bmkVarA == null) {
            bmkVarA = this.f21403b.a(cls);
            bld.j(cls, "messageType");
            bld.j(bmkVarA, "schema");
            bmk<T> bmkVar = (bmk) this.f21404c.putIfAbsent(cls, bmkVarA);
            if (bmkVar != null) {
                return bmkVar;
            }
        }
        return bmkVarA;
    }

    public final <T> bmk<T> c(T t) {
        return b(t.getClass());
    }
}
