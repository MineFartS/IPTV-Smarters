package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class bgx extends bhb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f21110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21111b;

    public bgx(Method method, Object obj) {
        this.f21110a = method;
        this.f21111b = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bhb
    public final <T> T a(Class<T> cls) {
        bhb.b(cls);
        return (T) this.f21110a.invoke(this.f21111b, cls);
    }
}
