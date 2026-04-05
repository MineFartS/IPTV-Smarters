package c.f.a.c.d.u.u;

import c.f.a.c.d.u.u.i;
import c.f.a.c.f.o.k;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 implements k<Status> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i.f f11944b;

    public b0(i.f fVar, long j2) {
        this.f11944b = fVar;
        this.f11943a = j2;
    }

    @Override // c.f.a.c.f.o.k
    public final /* synthetic */ void a(c.f.a.c.f.o.j jVar) {
        Status status = (Status) jVar;
        if (status.M()) {
            return;
        }
        i.this.f12005d.e(this.f11943a, status.J());
    }
}
