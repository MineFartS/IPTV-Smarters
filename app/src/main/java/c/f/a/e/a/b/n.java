package c.f.a.e.a.b;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends j<Void> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f15547g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, c.f.a.e.a.i.m<Void> mVar, int i2, String str, int i3) {
        super(oVar, mVar);
        this.f15547g = oVar;
        this.f15544d = i2;
        this.f15545e = str;
        this.f15546f = i3;
    }

    @Override // c.f.a.e.a.b.j, c.f.a.e.a.e.l0
    public final void a2(Bundle bundle) {
        this.f15547g.f15564e.b();
        o.f15560a.b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(bundle.getInt("error_code")));
        int i2 = this.f15546f;
        if (i2 > 0) {
            this.f15547g.x(this.f15544d, this.f15545e, i2 - 1);
        }
    }
}
