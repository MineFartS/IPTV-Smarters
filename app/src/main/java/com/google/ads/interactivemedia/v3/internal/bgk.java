package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bgk implements Cloneable, bfw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bgk f21079a = new bgk();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f21080b = -1.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21081c = 136;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21082d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<auv> f21083e = Collections.emptyList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<auv> f21084f = Collections.emptyList();

    private final boolean f(Class<?> cls) {
        return h(cls);
    }

    private final boolean g(Class<?> cls, boolean z) {
        for (auv auvVar : z ? this.f21083e : this.f21084f) {
        }
        return false;
    }

    private static final boolean h(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfw
    public final <T> bfv<T> a(bfg bfgVar, bjh<T> bjhVar) {
        boolean z;
        boolean z2;
        Class<? super T> clsC = bjhVar.c();
        boolean zF = f(clsC);
        if (zF) {
            z = true;
        } else {
            g(clsC, true);
            z = false;
        }
        if (zF) {
            z2 = true;
        } else {
            g(clsC, false);
            z2 = false;
        }
        if (z || z2) {
            return new bgj(this, z2, z, bfgVar, bjhVar);
        }
        return null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bgk clone() {
        try {
            return (bgk) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final boolean c(Class<?> cls, boolean z) {
        if (f(cls)) {
            return true;
        }
        g(cls, z);
        return false;
    }

    public final boolean d(Field field, boolean z) {
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || h(field.getType())) {
            return true;
        }
        List<auv> list = z ? this.f21083e : this.f21084f;
        if (list.isEmpty()) {
            return false;
        }
        bex bexVar = new bex(field);
        for (auv auvVar : list) {
            if (auv.x(bexVar)) {
                return true;
            }
        }
        return false;
    }

    public final bgk e(auv auvVar) {
        bgk bgkVarClone = clone();
        ArrayList arrayList = new ArrayList(this.f21083e);
        bgkVarClone.f21083e = arrayList;
        arrayList.add(auvVar);
        return bgkVarClone;
    }
}
