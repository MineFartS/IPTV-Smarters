package c.f.a.c.d.u.u;

import c.f.a.c.d.l;
import c.f.a.c.d.u.u.f0;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f11945a = new a();

    public class a extends f0.a {
        public a() {
        }

        @Override // c.f.a.c.d.u.u.f0
        public final int c() {
            return 12451009;
        }

        @Override // c.f.a.c.d.u.u.f0
        public final c.f.a.c.f.p.a u1(l lVar, int i2) {
            return c.this.a(lVar, i2);
        }

        @Override // c.f.a.c.d.u.u.f0
        public final c.f.a.c.f.p.a y1(l lVar, b bVar) {
            return c.this.b(lVar, bVar);
        }

        @Override // c.f.a.c.d.u.u.f0
        public final c.f.a.c.g.a z() {
            return c.f.a.c.g.b.K2(c.this);
        }
    }

    @Deprecated
    public c.f.a.c.f.p.a a(l lVar, int i2) {
        if (lVar == null || !lVar.M()) {
            return null;
        }
        return lVar.I().get(0);
    }

    public c.f.a.c.f.p.a b(l lVar, b bVar) {
        return a(lVar, bVar.J());
    }

    public final f0 c() {
        return this.f11945a;
    }
}
