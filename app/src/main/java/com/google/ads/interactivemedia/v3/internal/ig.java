package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public abstract class ig implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hc f21953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f21956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Method f21957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21959g;

    public ig(hc hcVar, String str, String str2, k kVar, int i2, int i3) {
        getClass().getSimpleName();
        this.f21953a = hcVar;
        this.f21954b = str;
        this.f21955c = str2;
        this.f21956d = kVar;
        this.f21958f = i2;
        this.f21959g = i3;
    }

    public abstract void a();

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        f();
        return null;
    }

    public void f() {
        int i2;
        try {
            long jNanoTime = System.nanoTime();
            Method methodH = this.f21953a.h(this.f21954b, this.f21955c);
            this.f21957e = methodH;
            if (methodH == null) {
                return;
            }
            a();
            gk gkVarD = this.f21953a.d();
            if (gkVarD == null || (i2 = this.f21958f) == Integer.MIN_VALUE) {
                return;
            }
            gkVarD.c(this.f21959g, i2, (System.nanoTime() - jNanoTime) / 1000, null, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
