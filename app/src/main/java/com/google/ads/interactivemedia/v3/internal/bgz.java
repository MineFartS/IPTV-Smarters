package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class bgz extends bhb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f21114a;

    public bgz(Method method) {
        this.f21114a = method;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bhb
    public final <T> T a(Class<T> cls) {
        bhb.b(cls);
        return (T) this.f21114a.invoke(null, cls, Object.class);
    }
}
