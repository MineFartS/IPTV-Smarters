package c.f.a.e.a.b;

import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u2 extends c.f.a.e.a.e.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f15632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.f.a.e.a.i.m f15633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f15634e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(o oVar, c.f.a.e.a.i.m mVar, List list, c.f.a.e.a.i.m mVar2) {
        super(mVar);
        this.f15634e = oVar;
        this.f15632c = list;
        this.f15633d = mVar2;
    }

    @Override // c.f.a.e.a.e.b
    public final void a() {
        try {
            ((c.f.a.e.a.e.j0) this.f15634e.f15564e.c()).A(this.f15634e.f15562c, o.k(this.f15632c), o.i(), new j(this.f15634e, this.f15633d, (byte[]) null));
        } catch (RemoteException e2) {
            o.f15560a.c(e2, "cancelDownloads(%s)", this.f15632c);
        }
    }
}
