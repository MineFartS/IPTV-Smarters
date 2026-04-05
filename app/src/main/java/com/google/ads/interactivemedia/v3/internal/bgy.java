package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class bgy extends bhb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Method f21112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21113b;

    public bgy(Method method, int i2) {
        this.f21112a = method;
        this.f21113b = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bhb
    public final <T> T a(Class<T> cls) {
        bhb.b(cls);
        return (T) this.f21112a.invoke(null, cls, Integer.valueOf(this.f21113b));
    }
}
