package c.d.a.n.k.h;

import android.graphics.Bitmap;
import c.d.a.l.a;

/* JADX INFO: loaded from: classes.dex */
public class a implements a.InterfaceC0100a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.d.a.n.i.n.c f5772a;

    public a(c.d.a.n.i.n.c cVar) {
        this.f5772a = cVar;
    }

    @Override // c.d.a.l.a.InterfaceC0100a
    public Bitmap a(int i2, int i3, Bitmap.Config config) {
        return this.f5772a.e(i2, i3, config);
    }

    @Override // c.d.a.l.a.InterfaceC0100a
    public void b(Bitmap bitmap) {
        if (this.f5772a.a(bitmap)) {
            return;
        }
        bitmap.recycle();
    }
}
