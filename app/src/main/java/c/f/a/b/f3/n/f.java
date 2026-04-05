package c.f.a.b.f3.n;

import c.f.a.b.j3.g;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements c.f.a.b.f3.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c.f.a.b.f3.c> f8162b;

    public f(List<c.f.a.b.f3.c> list) {
        this.f8162b = list;
    }

    @Override // c.f.a.b.f3.f
    public int a(long j2) {
        return j2 < 0 ? 0 : -1;
    }

    @Override // c.f.a.b.f3.f
    public long b(int i2) {
        g.a(i2 == 0);
        return 0L;
    }

    @Override // c.f.a.b.f3.f
    public List<c.f.a.b.f3.c> c(long j2) {
        return j2 >= 0 ? this.f8162b : Collections.emptyList();
    }

    @Override // c.f.a.b.f3.f
    public int d() {
        return 1;
    }
}
