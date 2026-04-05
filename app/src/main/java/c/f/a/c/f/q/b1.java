package c.f.a.c.f.q;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 extends n0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c f12551g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(c cVar, int i2, Bundle bundle) {
        super(cVar, i2, null);
        this.f12551g = cVar;
    }

    @Override // c.f.a.c.f.q.n0
    public final boolean f() {
        this.f12551g.zzc.a(c.f.a.c.f.b.f12298b);
        return true;
    }

    @Override // c.f.a.c.f.q.n0
    public final void g(c.f.a.c.f.b bVar) {
        if (this.f12551g.enableLocalFallback() && c.zzg(this.f12551g)) {
            c.zzc(this.f12551g, 16);
        } else {
            this.f12551g.zzc.a(bVar);
            this.f12551g.onConnectionFailed(bVar);
        }
    }
}
