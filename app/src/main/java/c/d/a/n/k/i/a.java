package c.d.a.n.k.i;

import android.graphics.Bitmap;
import c.d.a.n.i.l;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<c.d.a.n.k.h.b> f5829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<Bitmap> f5830b;

    public a(l<Bitmap> lVar, l<c.d.a.n.k.h.b> lVar2) {
        if (lVar != null && lVar2 != null) {
            throw new IllegalArgumentException("Can only contain either a bitmap resource or a gif resource, not both");
        }
        if (lVar == null && lVar2 == null) {
            throw new IllegalArgumentException("Must contain either a bitmap resource or a gif resource");
        }
        this.f5830b = lVar;
        this.f5829a = lVar2;
    }

    public l<Bitmap> a() {
        return this.f5830b;
    }

    public l<c.d.a.n.k.h.b> b() {
        return this.f5829a;
    }

    public int c() {
        l<Bitmap> lVar = this.f5830b;
        return lVar != null ? lVar.getSize() : this.f5829a.getSize();
    }
}
