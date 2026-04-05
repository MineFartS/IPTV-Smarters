package c.f.a.c.d.u.u;

import c.f.a.c.d.u.u.i;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends TimerTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f11970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i.j f11971c;

    public g0(i.j jVar, i iVar) {
        this.f11971c = jVar;
        this.f11970b = iVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        i.j jVar = this.f11971c;
        i.this.g0(jVar.f12020a);
        i.this.f12004c.postDelayed(this, this.f11971c.f12021b);
    }
}
