package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.blz;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class axh<KeyProtoT extends blz> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<KeyProtoT> f20684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, axg<?, KeyProtoT>> f20685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class<?> f20686c;

    @SafeVarargs
    public axh(Class<KeyProtoT> cls, axg<?, KeyProtoT>... axgVarArr) {
        this.f20684a = cls;
        HashMap map = new HashMap();
        for (int i2 = 0; i2 <= 0; i2++) {
            axg<?, KeyProtoT> axgVar = axgVarArr[i2];
            if (map.containsKey(axgVar.a())) {
                String strValueOf = String.valueOf(axgVar.a().getCanonicalName());
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(strValueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            map.put(axgVar.a(), axgVar);
        }
        this.f20686c = axgVarArr[0].a();
        this.f20685b = Collections.unmodifiableMap(map);
    }

    public axf<?, KeyProtoT> a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract bcs b();

    public abstract KeyProtoT c(bkd bkdVar);

    public final Class<?> d() {
        return this.f20686c;
    }

    public final Class<KeyProtoT> e() {
        return this.f20684a;
    }

    public final <P> P f(KeyProtoT keyprotot, Class<P> cls) {
        axg<?, KeyProtoT> axgVar = this.f20685b.get(cls);
        if (axgVar != null) {
            return (P) axgVar.b(keyprotot);
        }
        String canonicalName = cls.getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
        sb.append("Requested primitive class ");
        sb.append(canonicalName);
        sb.append(" not supported.");
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract String g();

    public final Set<Class<?>> h() {
        return this.f20685b.keySet();
    }

    public abstract void i(KeyProtoT keyprotot);
}
