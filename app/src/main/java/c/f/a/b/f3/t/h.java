package c.f.a.b.f3.t;

import c.f.a.b.j3.x0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements c.f.a.b.f3.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f8325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f8326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, g> f8327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, e> f8328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<String, String> f8329f;

    public h(d dVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f8325b = dVar;
        this.f8328e = map2;
        this.f8329f = map3;
        this.f8327d = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f8326c = dVar.j();
    }

    @Override // c.f.a.b.f3.f
    public int a(long j2) {
        int iD = x0.d(this.f8326c, j2, false, false);
        if (iD < this.f8326c.length) {
            return iD;
        }
        return -1;
    }

    @Override // c.f.a.b.f3.f
    public long b(int i2) {
        return this.f8326c[i2];
    }

    @Override // c.f.a.b.f3.f
    public List<c.f.a.b.f3.c> c(long j2) {
        return this.f8325b.h(j2, this.f8327d, this.f8328e, this.f8329f);
    }

    @Override // c.f.a.b.f3.f
    public int d() {
        return this.f8326c.length;
    }
}
