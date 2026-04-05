package c.d.a.n.k.i;

import android.graphics.Bitmap;
import c.d.a.n.i.l;

/* JADX INFO: loaded from: classes.dex */
public class b implements l<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f5831a;

    public b(a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Data must not be null");
        }
        this.f5831a = aVar;
    }

    @Override // c.d.a.n.i.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a get() {
        return this.f5831a;
    }

    @Override // c.d.a.n.i.l
    public void b() {
        l<Bitmap> lVarA = this.f5831a.a();
        if (lVarA != null) {
            lVarA.b();
        }
        l<c.d.a.n.k.h.b> lVarB = this.f5831a.b();
        if (lVarB != null) {
            lVarB.b();
        }
    }

    @Override // c.d.a.n.i.l
    public int getSize() {
        return this.f5831a.c();
    }
}
