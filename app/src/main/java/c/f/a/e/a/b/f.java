package c.f.a.e.a.b;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends c.f.a.e.a.e.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f15414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c.f.a.e.a.i.m f15415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f15417g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, c.f.a.e.a.i.m mVar, int i2, String str, c.f.a.e.a.i.m mVar2, int i3) {
        super(mVar);
        this.f15417g = oVar;
        this.f15413c = i2;
        this.f15414d = str;
        this.f15415e = mVar2;
        this.f15416f = i3;
    }

    @Override // c.f.a.e.a.e.b
    public final void a() {
        try {
            ((c.f.a.e.a.e.j0) this.f15417g.f15564e.c()).w(this.f15417g.f15562c, o.f(this.f15413c, this.f15414d), o.i(), new n(this.f15417g, this.f15415e, this.f15413c, this.f15414d, this.f15416f));
        } catch (RemoteException e2) {
            o.f15560a.c(e2, "notifyModuleCompleted", new Object[0]);
        }
    }
}
