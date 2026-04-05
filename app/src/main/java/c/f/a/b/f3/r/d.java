package c.f.a.b.f3.r;

import c.f.a.b.f3.f;
import c.f.a.b.j3.g;
import c.f.a.b.j3.x0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<List<c.f.a.b.f3.c>> f8266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<Long> f8267c;

    public d(List<List<c.f.a.b.f3.c>> list, List<Long> list2) {
        this.f8266b = list;
        this.f8267c = list2;
    }

    @Override // c.f.a.b.f3.f
    public int a(long j2) {
        int iC = x0.c(this.f8267c, Long.valueOf(j2), false, false);
        if (iC < this.f8267c.size()) {
            return iC;
        }
        return -1;
    }

    @Override // c.f.a.b.f3.f
    public long b(int i2) {
        g.a(i2 >= 0);
        g.a(i2 < this.f8267c.size());
        return this.f8267c.get(i2).longValue();
    }

    @Override // c.f.a.b.f3.f
    public List<c.f.a.b.f3.c> c(long j2) {
        int iF = x0.f(this.f8267c, Long.valueOf(j2), true, false);
        return iF == -1 ? Collections.emptyList() : this.f8266b.get(iF);
    }

    @Override // c.f.a.b.f3.f
    public int d() {
        return this.f8267c.size();
    }
}
