package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class axs implements axw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ axa f20697a;

    public axs(axa axaVar) {
        this.f20697a = axaVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axw
    public final <Q> axa<Q> a(Class<Q> cls) {
        if (this.f20697a.c().equals(cls)) {
            return this.f20697a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axw
    public final axa<?> b() {
        return this.f20697a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axw
    public final Class<?> c() {
        return this.f20697a.getClass();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axw
    public final Class<?> d() {
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axw
    public final Set<Class<?>> e() {
        return Collections.singleton(this.f20697a.c());
    }
}
