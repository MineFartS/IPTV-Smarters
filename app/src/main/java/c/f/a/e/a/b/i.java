package c.f.a.e.a.b;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends c.f.a.e.a.e.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.f.a.e.a.i.m f15463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f15464d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, c.f.a.e.a.i.m mVar, c.f.a.e.a.i.m mVar2) {
        super(mVar);
        this.f15464d = oVar;
        this.f15463c = mVar2;
    }

    @Override // c.f.a.e.a.e.b
    public final void a() {
        try {
            ((c.f.a.e.a.e.j0) this.f15464d.f15565f.c()).C0(this.f15464d.f15562c, o.i(), new m(this.f15464d, this.f15463c));
        } catch (RemoteException e2) {
            o.f15560a.c(e2, "keepAlive", new Object[0]);
        }
    }
}
