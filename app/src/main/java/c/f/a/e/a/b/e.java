package c.f.a.e.a.b;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends c.f.a.e.a.e.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15400c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f15401d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f15402e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15403f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c.f.a.e.a.i.m f15404g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f15405h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o oVar, c.f.a.e.a.i.m mVar, int i2, String str, String str2, int i3, c.f.a.e.a.i.m mVar2) {
        super(mVar);
        this.f15405h = oVar;
        this.f15400c = i2;
        this.f15401d = str;
        this.f15402e = str2;
        this.f15403f = i3;
        this.f15404g = mVar2;
    }

    @Override // c.f.a.e.a.e.b
    public final void a() {
        try {
            ((c.f.a.e.a.e.j0) this.f15405h.f15564e.c()).v2(this.f15405h.f15562c, o.q(this.f15400c, this.f15401d, this.f15402e, this.f15403f), o.i(), new j(this.f15405h, this.f15404g, (char[]) null));
        } catch (RemoteException e2) {
            o.f15560a.c(e2, "notifyChunkTransferred", new Object[0]);
        }
    }
}
