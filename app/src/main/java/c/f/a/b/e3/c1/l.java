package c.f.a.b.e3.c1;

import c.f.a.b.e3.y;
import c.f.a.b.p2;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f6982d;

    public l(p2 p2Var, h hVar) {
        super(p2Var);
        c.f.a.b.j3.g.g(p2Var.i() == 1);
        c.f.a.b.j3.g.g(p2Var.p() == 1);
        this.f6982d = hVar;
    }

    @Override // c.f.a.b.e3.y, c.f.a.b.p2
    public p2.b g(int i2, p2.b bVar, boolean z) {
        this.f8047c.g(i2, bVar, z);
        long j2 = bVar.f9705e;
        if (j2 == -9223372036854775807L) {
            j2 = this.f6982d.f6954g;
        }
        bVar.t(bVar.f9702b, bVar.f9703c, bVar.f9704d, j2, bVar.o(), this.f6982d, bVar.f9707g);
        return bVar;
    }
}
