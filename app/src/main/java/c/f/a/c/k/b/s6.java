package c.f.a.c.k.b;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class s6 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f14295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f7 f14298e;

    public s6(f7 f7Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f14298e = f7Var;
        this.f14295b = atomicReference;
        this.f14296c = str2;
        this.f14297d = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14298e.f14413a.R().N(this.f14295b, null, this.f14296c, this.f14297d);
    }
}
