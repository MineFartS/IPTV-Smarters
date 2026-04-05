package c.f.a.e.a.b;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f15580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f15581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15582c = 0;

    public q0(a1 a1Var, Bundle bundle) {
        this.f15580a = a1Var;
        this.f15581b = bundle;
    }

    public q0(a1 a1Var, Bundle bundle, byte[] bArr) {
        this.f15580a = a1Var;
        this.f15581b = bundle;
    }

    @Override // c.f.a.e.a.b.z0
    public final Object a() {
        return this.f15582c != 0 ? this.f15580a.k(this.f15581b) : this.f15580a.j(this.f15581b);
    }
}
