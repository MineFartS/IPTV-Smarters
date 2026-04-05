package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* JADX INFO: loaded from: classes.dex */
public final class bgi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Type, bfi<?>> f21071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bjf f21072b = bjf.b();

    public bgi(Map<Type, bfi<?>> map) {
        this.f21071a = map;
    }

    public final <T> bgw<T> a(bjh<T> bjhVar) {
        bgg bggVar;
        Type typeD = bjhVar.d();
        Class<? super T> clsC = bjhVar.c();
        bfi<?> bfiVar = this.f21071a.get(typeD);
        if (bfiVar != null) {
            return new bgf(bfiVar, typeD, 1);
        }
        bfi<?> bfiVar2 = this.f21071a.get(clsC);
        if (bfiVar2 != null) {
            return new bgf(bfiVar2, typeD);
        }
        bgw<T> bgdVar = null;
        try {
            Constructor<? super T> declaredConstructor = clsC.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f21072b.a(declaredConstructor);
            }
            bggVar = new bgg(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            bggVar = null;
        }
        if (bggVar != null) {
            return bggVar;
        }
        if (Collection.class.isAssignableFrom(clsC)) {
            bgdVar = SortedSet.class.isAssignableFrom(clsC) ? new bgd(4) : EnumSet.class.isAssignableFrom(clsC) ? new bgh(typeD) : Set.class.isAssignableFrom(clsC) ? new bgd(5) : Queue.class.isAssignableFrom(clsC) ? new bgd(6) : new bgd(7);
        } else if (Map.class.isAssignableFrom(clsC)) {
            bgdVar = ConcurrentNavigableMap.class.isAssignableFrom(clsC) ? new bgd(8) : ConcurrentMap.class.isAssignableFrom(clsC) ? new bgd(1) : SortedMap.class.isAssignableFrom(clsC) ? new bgd() : (!(typeD instanceof ParameterizedType) || String.class.isAssignableFrom(bjh.b(((ParameterizedType) typeD).getActualTypeArguments()[0]).c())) ? new bgd(3) : new bgd(2);
        }
        return bgdVar != null ? bgdVar : new bge(clsC, typeD);
    }

    public final String toString() {
        return this.f21071a.toString();
    }
}
