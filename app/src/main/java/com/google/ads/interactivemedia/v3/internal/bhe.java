package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class bhe implements bfw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f21121a;

    public bhe() {
    }

    public bhe(int i2) {
        this.f21121a = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfw
    public final bfv a(bfg bfgVar, bjh bjhVar) {
        int i2 = this.f21121a;
        if (i2 == 0) {
            if (bjhVar.c() == Date.class) {
                return new bhf();
            }
            return null;
        }
        if (i2 == 1) {
            Type typeD = bjhVar.d();
            boolean z = typeD instanceof GenericArrayType;
            if (!z && (!(typeD instanceof Class) || !((Class) typeD).isArray())) {
                return null;
            }
            Type genericComponentType = z ? ((GenericArrayType) typeD).getGenericComponentType() : ((Class) typeD).getComponentType();
            return new bhc(bfgVar, bfgVar.a(bjh.b(genericComponentType)), bgc.a(genericComponentType));
        }
        if (i2 == 2) {
            if (bjhVar.c() == Object.class) {
                return new bhm(bfgVar);
            }
            return null;
        }
        if (i2 == 3) {
            if (bjhVar.c() == java.sql.Date.class) {
                return new bhq();
            }
            return null;
        }
        if (i2 == 4) {
            if (bjhVar.c() == Time.class) {
                return new bhr();
            }
            return null;
        }
        if (i2 == 5) {
            if (bjhVar.c() != Timestamp.class) {
                return null;
            }
            return new bil(bfgVar.b(Date.class));
        }
        Class clsC = bjhVar.c();
        if (!Enum.class.isAssignableFrom(clsC) || clsC == Enum.class) {
            return null;
        }
        if (!clsC.isEnum()) {
            clsC = clsC.getSuperclass();
        }
        return new bjb(clsC);
    }
}
