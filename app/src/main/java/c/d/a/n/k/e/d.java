package c.d.a.n.k.e;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements c.d.a.n.g<Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c.d.a.n.i.n.c f5714a;

    public d(c.d.a.n.i.n.c cVar) {
        this.f5714a = cVar;
    }

    @Override // c.d.a.n.g
    public final c.d.a.n.i.l<Bitmap> a(c.d.a.n.i.l<Bitmap> lVar, int i2, int i3) {
        if (c.d.a.t.h.k(i2, i3)) {
            Bitmap bitmap = lVar.get();
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getWidth();
            }
            if (i3 == Integer.MIN_VALUE) {
                i3 = bitmap.getHeight();
            }
            Bitmap bitmapB = b(this.f5714a, bitmap, i2, i3);
            return bitmap.equals(bitmapB) ? lVar : c.c(bitmapB, this.f5714a);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i2 + " or height: " + i3 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap b(c.d.a.n.i.n.c cVar, Bitmap bitmap, int i2, int i3);
}
