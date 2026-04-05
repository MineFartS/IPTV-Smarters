package androidx.viewpager2.adapter;

import a.p.f;
import a.p.i;
import a.p.k;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class FragmentStateAdapter$5 implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f5001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f5002c;

    @Override // a.p.i
    public void d(k kVar, f.b bVar) {
        if (bVar == f.b.ON_DESTROY) {
            this.f5001b.removeCallbacks(this.f5002c);
            kVar.getLifecycle().c(this);
        }
    }
}
