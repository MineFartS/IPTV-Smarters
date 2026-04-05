package c.f.a.e.a.b;

import android.os.RemoteException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class v2 extends c.f.a.e.a.e.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f15649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c.f.a.e.a.i.m f15650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f15651e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(o oVar, c.f.a.e.a.i.m mVar, Map map, c.f.a.e.a.i.m mVar2) {
        super(mVar);
        this.f15651e = oVar;
        this.f15649c = map;
        this.f15650d = mVar2;
    }

    @Override // c.f.a.e.a.e.b
    public final void a() {
        try {
            ((c.f.a.e.a.e.j0) this.f15651e.f15564e.c()).k2(this.f15651e.f15562c, o.m(this.f15649c), new l(this.f15651e, this.f15650d));
        } catch (RemoteException e2) {
            o.f15560a.c(e2, "syncPacks", new Object[0]);
            this.f15650d.d(new RuntimeException(e2));
        }
    }
}
