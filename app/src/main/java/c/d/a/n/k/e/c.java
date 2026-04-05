package c.d.a.n.k.e;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class c implements c.d.a.n.i.l<Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f5712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.d.a.n.i.n.c f5713b;

    public c(Bitmap bitmap, c.d.a.n.i.n.c cVar) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        if (cVar == null) {
            throw new NullPointerException("BitmapPool must not be null");
        }
        this.f5712a = bitmap;
        this.f5713b = cVar;
    }

    public static c c(Bitmap bitmap, c.d.a.n.i.n.c cVar) {
        if (bitmap == null) {
            return null;
        }
        return new c(bitmap, cVar);
    }

    @Override // c.d.a.n.i.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f5712a;
    }

    @Override // c.d.a.n.i.l
    public void b() {
        if (this.f5713b.a(this.f5712a)) {
            return;
        }
        this.f5712a.recycle();
    }

    @Override // c.d.a.n.i.l
    public int getSize() {
        return c.d.a.t.h.e(this.f5712a);
    }
}
