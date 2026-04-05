package a.g.b.k.m;

import a.g.b.k.m.f;

/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1469m;

    public g(m mVar) {
        super(mVar);
        this.f1461e = mVar instanceof j ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    @Override // a.g.b.k.m.f
    public void d(int i2) {
        if (this.f1466j) {
            return;
        }
        this.f1466j = true;
        this.f1463g = i2;
        for (d dVar : this.f1467k) {
            dVar.a(dVar);
        }
    }
}
