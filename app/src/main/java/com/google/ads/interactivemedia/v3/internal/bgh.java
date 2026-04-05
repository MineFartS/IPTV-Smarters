package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes.dex */
public final class bgh implements bgw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Type f21070a;

    public bgh(Type type) {
        this.f21070a = type;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bgw
    public final Object a() {
        Type type = this.f21070a;
        if (!(type instanceof ParameterizedType)) {
            String strValueOf = String.valueOf(type.toString());
            throw new bfm(strValueOf.length() != 0 ? "Invalid EnumSet type: ".concat(strValueOf) : new String("Invalid EnumSet type: "));
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        String strValueOf2 = String.valueOf(this.f21070a.toString());
        throw new bfm(strValueOf2.length() != 0 ? "Invalid EnumSet type: ".concat(strValueOf2) : new String("Invalid EnumSet type: "));
    }
}
