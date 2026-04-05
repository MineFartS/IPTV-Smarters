package c.f.a.c.k.b;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class t6 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f14323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f14325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f14326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f7 f14327f;

    public t6(f7 f7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f14327f = f7Var;
        this.f14323b = atomicReference;
        this.f14324c = str2;
        this.f14325d = str3;
        this.f14326e = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f14327f.f14413a.R().P(this.f14323b, null, this.f14324c, this.f14325d, this.f14326e);
    }
}
