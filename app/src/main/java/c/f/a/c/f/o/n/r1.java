package c.f.a.c.f.o.n;

import c.f.a.c.f.o.g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
public final class r1 implements g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f12498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f12499b;

    public r1(t tVar, BasePendingResult basePendingResult) {
        this.f12499b = tVar;
        this.f12498a = basePendingResult;
    }

    @Override // c.f.a.c.f.o.g.a
    public final void a(Status status) {
        this.f12499b.f12503a.remove(this.f12498a);
    }
}
