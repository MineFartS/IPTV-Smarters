package c.f.a.b.f3.v;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements c.f.a.b.f3.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c.f.a.b.f3.c> f8336b;

    public d(List<c.f.a.b.f3.c> list) {
        this.f8336b = Collections.unmodifiableList(list);
    }

    @Override // c.f.a.b.f3.f
    public int a(long j2) {
        return j2 < 0 ? 0 : -1;
    }

    @Override // c.f.a.b.f3.f
    public long b(int i2) {
        c.f.a.b.j3.g.a(i2 == 0);
        return 0L;
    }

    @Override // c.f.a.b.f3.f
    public List<c.f.a.b.f3.c> c(long j2) {
        return j2 >= 0 ? this.f8336b : Collections.emptyList();
    }

    @Override // c.f.a.b.f3.f
    public int d() {
        return 1;
    }
}
