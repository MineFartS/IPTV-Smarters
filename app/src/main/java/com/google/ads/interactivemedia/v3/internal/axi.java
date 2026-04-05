package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class axi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bda f20687a;

    private axi(bda bdaVar) {
        this.f20687a = bdaVar;
    }

    public static final axi a(bda bdaVar) throws GeneralSecurityException {
        if (bdaVar == null || bdaVar.a() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new axi(bdaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <P> P b(Class<P> cls) throws GeneralSecurityException {
        Class<?> clsD = axx.d(cls);
        if (clsD == null) {
            String name = cls.getName();
            throw new GeneralSecurityException(name.length() != 0 ? "No wrapper found for ".concat(name) : new String("No wrapper found for "));
        }
        axy.b(this.f20687a);
        axp axpVarC = axp.c(clsD);
        for (bcz bczVar : this.f20687a.f()) {
            if (bczVar.d() == bcu.ENABLED) {
                axn axnVarA = axpVarC.a(axx.e(bczVar.c(), clsD), bczVar);
                if (bczVar.a() == this.f20687a.c()) {
                    axpVarC.e(axnVarA);
                }
            }
        }
        return (P) axx.h(axpVarC, cls);
    }

    public final String toString() {
        return axy.a(this.f20687a).toString();
    }
}
