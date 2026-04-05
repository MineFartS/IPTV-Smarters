package c.f.a.b.e3.f1.x;

import c.f.a.b.c3.f0;
import c.f.a.b.c3.i0;
import c.f.a.b.i3.i0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f7392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<i0> f7393b;

    public e(j jVar, List<i0> list) {
        this.f7392a = jVar;
        this.f7393b = list;
    }

    @Override // c.f.a.b.e3.f1.x.j
    public i0.a<h> a(f fVar, g gVar) {
        return new f0(this.f7392a.a(fVar, gVar), this.f7393b);
    }

    @Override // c.f.a.b.e3.f1.x.j
    public i0.a<h> b() {
        return new f0(this.f7392a.b(), this.f7393b);
    }
}
