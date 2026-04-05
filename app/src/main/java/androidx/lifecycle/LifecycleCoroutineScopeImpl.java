package androidx.lifecycle;

import a.p.f;
import a.p.h;
import a.p.i;
import a.p.k;
import h.k.d;
import h.l.c.g;
import i.a.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends h implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final f f4619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final d f4620c;

    @NotNull
    public d c() {
        return this.f4620c;
    }

    @Override // a.p.i
    public void d(@NotNull k kVar, @NotNull f.b bVar) {
        g.c(kVar, "source");
        g.c(bVar, "event");
        if (g().b().compareTo(f.c.DESTROYED) <= 0) {
            g().c(this);
            c.b(c(), null, 1, null);
        }
    }

    @NotNull
    public f g() {
        return this.f4619b;
    }
}
