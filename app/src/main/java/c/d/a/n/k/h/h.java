package c.d.a.n.k.h;

import android.graphics.Bitmap;
import c.d.a.n.i.l;

/* JADX INFO: loaded from: classes.dex */
public class h implements c.d.a.n.e<c.d.a.l.a, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.d.a.n.i.n.c f5815a;

    public h(c.d.a.n.i.n.c cVar) {
        this.f5815a = cVar;
    }

    @Override // c.d.a.n.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l<Bitmap> a(c.d.a.l.a aVar, int i2, int i3) {
        return c.d.a.n.k.e.c.c(aVar.i(), this.f5815a);
    }

    @Override // c.d.a.n.e
    public String getId() {
        return "GifFrameResourceDecoder.com.bumptech.glide.load.resource.gif";
    }
}
