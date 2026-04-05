package c.d.a.n.k.h;

import android.graphics.Bitmap;
import c.d.a.n.i.l;

/* JADX INFO: loaded from: classes.dex */
public class e implements c.d.a.n.g<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.d.a.n.g<Bitmap> f5798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.d.a.n.i.n.c f5799b;

    public e(c.d.a.n.g<Bitmap> gVar, c.d.a.n.i.n.c cVar) {
        this.f5798a = gVar;
        this.f5799b = cVar;
    }

    @Override // c.d.a.n.g
    public l<b> a(l<b> lVar, int i2, int i3) {
        b bVar = lVar.get();
        Bitmap bitmapE = lVar.get().e();
        Bitmap bitmap = this.f5798a.a(new c.d.a.n.k.e.c(bitmapE, this.f5799b), i2, i3).get();
        return !bitmap.equals(bitmapE) ? new d(new b(bVar, bitmap, this.f5798a)) : lVar;
    }

    @Override // c.d.a.n.g
    public String getId() {
        return this.f5798a.getId();
    }
}
