package c.f.a.b.f3.u;

import c.f.a.b.f3.c;
import c.f.a.b.f3.f;
import c.f.a.b.j3.g;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f8331b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<c> f8332c;

    public b() {
        this.f8332c = Collections.emptyList();
    }

    public b(c cVar) {
        this.f8332c = Collections.singletonList(cVar);
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
    public List<c> c(long j2) {
        return j2 >= 0 ? this.f8332c : Collections.emptyList();
    }

    @Override // c.f.a.b.f3.f
    public int d() {
        return 1;
    }
}
