package c.d.a.n.k.i;

import android.graphics.Bitmap;
import c.d.a.n.i.l;

/* JADX INFO: loaded from: classes.dex */
public class f implements c.d.a.n.g<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.d.a.n.g<Bitmap> f5844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.d.a.n.g<c.d.a.n.k.h.b> f5845b;

    public f(c.d.a.n.g<Bitmap> gVar, c.d.a.n.g<c.d.a.n.k.h.b> gVar2) {
        this.f5844a = gVar;
        this.f5845b = gVar2;
    }

    public f(c.d.a.n.i.n.c cVar, c.d.a.n.g<Bitmap> gVar) {
        this(gVar, new c.d.a.n.k.h.e(gVar, cVar));
    }

    @Override // c.d.a.n.g
    public l<a> a(l<a> lVar, int i2, int i3) {
        c.d.a.n.g<c.d.a.n.k.h.b> gVar;
        c.d.a.n.g<Bitmap> gVar2;
        l<Bitmap> lVarA = lVar.get().a();
        l<c.d.a.n.k.h.b> lVarB = lVar.get().b();
        if (lVarA != null && (gVar2 = this.f5844a) != null) {
            l<Bitmap> lVarA2 = gVar2.a(lVarA, i2, i3);
            return !lVarA.equals(lVarA2) ? new b(new a(lVarA2, lVar.get().b())) : lVar;
        }
        if (lVarB == null || (gVar = this.f5845b) == null) {
            return lVar;
        }
        l<c.d.a.n.k.h.b> lVarA3 = gVar.a(lVarB, i2, i3);
        return !lVarB.equals(lVarA3) ? new b(new a(lVar.get().a(), lVarA3)) : lVar;
    }

    @Override // c.d.a.n.g
    public String getId() {
        return this.f5844a.getId();
    }
}
