package androidx.fragment.app;

import a.l.d.n;
import a.l.d.t;
import a.p.f;
import a.p.i;
import a.p.k;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class FragmentManager$6 implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f4421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f4422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f4423e;

    @Override // a.p.i
    public void d(k kVar, f.b bVar) {
        Bundle bundle;
        if (bVar == f.b.ON_START && (bundle = (Bundle) this.f4423e.f2413l.get(this.f4420b)) != null) {
            this.f4421c.a(this.f4420b, bundle);
            this.f4423e.r(this.f4420b);
        }
        if (bVar == f.b.ON_DESTROY) {
            this.f4422d.c(this);
            this.f4423e.f2414m.remove(this.f4420b);
        }
    }
}
