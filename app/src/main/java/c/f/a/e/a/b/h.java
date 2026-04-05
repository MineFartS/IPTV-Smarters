package c.f.a.e.a.b;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends c.f.a.e.a.e.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f15430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f15431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c.f.a.e.a.i.m f15433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f15434h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, c.f.a.e.a.i.m mVar, int i2, String str, String str2, int i3, c.f.a.e.a.i.m mVar2) {
        super(mVar);
        this.f15434h = oVar;
        this.f15429c = i2;
        this.f15430d = str;
        this.f15431e = str2;
        this.f15432f = i3;
        this.f15433g = mVar2;
    }

    @Override // c.f.a.e.a.e.b
    public final void a() {
        try {
            ((c.f.a.e.a.e.j0) this.f15434h.f15564e.c()).E0(this.f15434h.f15562c, o.q(this.f15429c, this.f15430d, this.f15431e, this.f15432f), o.i(), new k(this.f15434h, this.f15433g));
        } catch (RemoteException e2) {
            o.f15560a.b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f15430d, this.f15431e, Integer.valueOf(this.f15432f), Integer.valueOf(this.f15429c));
            this.f15433g.d(new RuntimeException(e2));
        }
    }
}
