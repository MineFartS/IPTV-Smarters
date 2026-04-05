package c.f.a.e.a.b;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends c.f.a.e.a.e.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.f.a.e.a.i.m f15424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f15425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o oVar, c.f.a.e.a.i.m mVar, int i2, c.f.a.e.a.i.m mVar2) {
        super(mVar);
        this.f15425e = oVar;
        this.f15423c = i2;
        this.f15424d = mVar2;
    }

    @Override // c.f.a.e.a.e.b
    public final void a() {
        try {
            ((c.f.a.e.a.e.j0) this.f15425e.f15564e.c()).X(this.f15425e.f15562c, o.h(this.f15423c), o.i(), new j(this.f15425e, this.f15424d, (int[]) null));
        } catch (RemoteException e2) {
            o.f15560a.c(e2, "notifySessionFailed", new Object[0]);
        }
    }
}
