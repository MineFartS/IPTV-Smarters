package c.f.a.b.k3;

import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public class t extends c.f.a.b.a3.r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f9525e;

    public t(Throwable th, c.f.a.b.a3.s sVar, Surface surface) {
        super(th, sVar);
        this.f9524d = System.identityHashCode(surface);
        this.f9525e = surface == null || surface.isValid();
    }
}
