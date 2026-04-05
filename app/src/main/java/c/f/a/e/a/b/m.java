package c.f.a.e.a.b;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends j<Void> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f15529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, c.f.a.e.a.i.m<Void> mVar) {
        super(oVar, mVar);
        this.f15529d = oVar;
    }

    @Override // c.f.a.e.a.b.j, c.f.a.e.a.e.l0
    public final void F1(Bundle bundle, Bundle bundle2) {
        super.F1(bundle, bundle2);
        if (!this.f15529d.f15566g.compareAndSet(true, false)) {
            o.f15560a.e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f15529d.j();
        }
    }
}
