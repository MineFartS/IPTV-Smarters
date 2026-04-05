package c.f.a.c.k.b;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes2.dex */
public final class p8 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentName f14226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t8 f14227c;

    public p8(t8 t8Var, ComponentName componentName) {
        this.f14227c = t8Var;
        this.f14226b = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u8.x(this.f14227c.f14331c, this.f14226b);
    }
}
