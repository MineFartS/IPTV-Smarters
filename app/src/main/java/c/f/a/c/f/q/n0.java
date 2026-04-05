package c.f.a.c.f.q;

import android.app.PendingIntent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n0 extends x0<Boolean> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f12644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f12645f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(c cVar, int i2, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f12645f = cVar;
        this.f12643d = i2;
        this.f12644e = bundle;
    }

    @Override // c.f.a.c.f.q.x0
    public final void a() {
    }

    @Override // c.f.a.c.f.q.x0
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        c.f.a.c.f.b bVar;
        if (this.f12643d != 0) {
            this.f12645f.zzp(1, null);
            Bundle bundle = this.f12644e;
            bVar = new c.f.a.c.f.b(this.f12643d, bundle != null ? (PendingIntent) bundle.getParcelable(c.KEY_PENDING_INTENT) : null);
        } else {
            if (f()) {
                return;
            }
            this.f12645f.zzp(1, null);
            bVar = new c.f.a.c.f.b(8, null);
        }
        g(bVar);
    }

    public abstract boolean f();

    public abstract void g(c.f.a.c.f.b bVar);
}
