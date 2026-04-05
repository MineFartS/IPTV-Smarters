package androidx.lifecycle;

import a.p.f;
import a.p.g;
import a.p.i;
import a.p.k;
import i.a.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleController$observer$1 implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f4617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f4618c;

    @Override // a.p.i
    public final void d(@NotNull k kVar, @NotNull f.b bVar) {
        h.l.c.g.c(kVar, "source");
        h.l.c.g.c(bVar, "<anonymous parameter 1>");
        f lifecycle = kVar.getLifecycle();
        h.l.c.g.b(lifecycle, "source.lifecycle");
        if (lifecycle.b() == f.c.DESTROYED) {
            a.C0308a.a(this.f4618c, null, 1, null);
            throw null;
        }
        f lifecycle2 = kVar.getLifecycle();
        h.l.c.g.b(lifecycle2, "source.lifecycle");
        if (lifecycle2.b().compareTo(g.b(this.f4617b)) < 0) {
            g.a(this.f4617b);
            throw null;
        }
        g.a(this.f4617b);
        throw null;
    }
}
