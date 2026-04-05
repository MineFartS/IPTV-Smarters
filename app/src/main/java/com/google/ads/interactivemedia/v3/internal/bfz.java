package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class bfz implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f21053a;

    public bfz(Type type) {
        this.f21053a = bgc.d(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && bgc.j(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f21053a;
    }

    public final int hashCode() {
        return this.f21053a.hashCode();
    }

    public final String toString() {
        return String.valueOf(bgc.b(this.f21053a)).concat("[]");
    }
}
