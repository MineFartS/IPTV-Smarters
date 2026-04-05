package c.d.a.n.i.o;

import android.annotation.SuppressLint;
import c.d.a.n.i.l;
import c.d.a.n.i.o.h;

/* JADX INFO: loaded from: classes.dex */
public class g extends c.d.a.t.e<c.d.a.n.c, l<?>> implements h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h.a f5644e;

    public g(int i2) {
        super(i2);
    }

    @Override // c.d.a.n.i.o.h
    public /* bridge */ /* synthetic */ l a(c.d.a.n.c cVar, l lVar) {
        return (l) super.k(cVar, lVar);
    }

    @Override // c.d.a.n.i.o.h
    public /* bridge */ /* synthetic */ l b(c.d.a.n.c cVar) {
        return (l) super.l(cVar);
    }

    @Override // c.d.a.n.i.o.h
    @SuppressLint({"InlinedApi"})
    public void c(int i2) {
        if (i2 >= 60) {
            d();
        } else if (i2 >= 40) {
            m(h() / 2);
        }
    }

    @Override // c.d.a.n.i.o.h
    public void e(h.a aVar) {
        this.f5644e = aVar;
    }

    @Override // c.d.a.t.e
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(l<?> lVar) {
        return lVar.getSize();
    }

    @Override // c.d.a.t.e
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(c.d.a.n.c cVar, l<?> lVar) {
        h.a aVar = this.f5644e;
        if (aVar != null) {
            aVar.a(lVar);
        }
    }
}
