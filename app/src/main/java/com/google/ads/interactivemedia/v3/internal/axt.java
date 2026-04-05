package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class axt implements axw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ axh f20698a;

    public axt(axh axhVar) {
        this.f20698a = axhVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axw
    public final <Q> axa<Q> a(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new axc(this.f20698a, cls);
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axw
    public final axa<?> b() {
        axh axhVar = this.f20698a;
        return new axc(axhVar, axhVar.d());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axw
    public final Class<?> c() {
        return this.f20698a.getClass();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axw
    public final Class<?> d() {
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axw
    public final Set<Class<?>> e() {
        return this.f20698a.h();
    }
}
