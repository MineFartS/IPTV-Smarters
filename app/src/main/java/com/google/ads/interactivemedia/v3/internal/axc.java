package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.blz;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class axc<PrimitiveT, KeyProtoT extends blz> implements axa<PrimitiveT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final axh<KeyProtoT> f20677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<PrimitiveT> f20678b;

    public axc(axh<KeyProtoT> axhVar, Class<PrimitiveT> cls) {
        if (!axhVar.h().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", axhVar.toString(), cls.getName()));
        }
        this.f20677a = axhVar;
        this.f20678b = cls;
    }

    public axc(axr axrVar, Class cls) {
        this((axh) axrVar, cls);
    }

    private final axb<?, KeyProtoT> g() {
        return new axb<>(this.f20677a.a());
    }

    private final PrimitiveT h(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (Void.class.equals(this.f20678b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f20677a.i(keyprotot);
        return (PrimitiveT) this.f20677a.f(keyprotot, this.f20678b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axa
    public final bct a(bkd bkdVar) throws GeneralSecurityException {
        try {
            blz blzVarA = g().a(bkdVar);
            bcr bcrVarA = bct.a();
            bcrVarA.b(f());
            bcrVarA.c(blzVarA.ag());
            bcrVarA.a(this.f20677a.b());
            return bcrVarA.ac();
        } catch (blf e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axa
    public final blz b(bkd bkdVar) throws GeneralSecurityException {
        try {
            return g().a(bkdVar);
        } catch (blf e2) {
            String name = this.f20677a.a().b().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axa
    public final Class<PrimitiveT> c() {
        return this.f20678b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axa
    public final PrimitiveT d(bkd bkdVar) throws GeneralSecurityException {
        try {
            return h(this.f20677a.c(bkdVar));
        } catch (blf e2) {
            String name = this.f20677a.e().getName();
            throw new GeneralSecurityException(name.length() != 0 ? "Failures parsing proto of type ".concat(name) : new String("Failures parsing proto of type "), e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axa
    public final PrimitiveT e(blz blzVar) throws GeneralSecurityException {
        String name = this.f20677a.e().getName();
        String strConcat = name.length() != 0 ? "Expected proto of type ".concat(name) : new String("Expected proto of type ");
        if (this.f20677a.e().isInstance(blzVar)) {
            return h(blzVar);
        }
        throw new GeneralSecurityException(strConcat);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axa
    public final String f() {
        return this.f20677a.g();
    }
}
