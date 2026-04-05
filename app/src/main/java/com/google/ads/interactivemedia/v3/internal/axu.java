package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class axu implements axw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ axr f20699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ axh f20700b;

    public axu(axr axrVar, axh axhVar) {
        this.f20699a = axrVar;
        this.f20700b = axhVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axw
    public final <Q> axa<Q> a(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new axc(this.f20699a, (Class) cls);
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axw
    public final axa<?> b() {
        axr axrVar = this.f20699a;
        return new axc(axrVar, (Class) axrVar.d());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axw
    public final Class<?> c() {
        return this.f20699a.getClass();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axw
    public final Class<?> d() {
        return this.f20700b.getClass();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axw
    public final Set<Class<?>> e() {
        return this.f20699a.h();
    }
}
