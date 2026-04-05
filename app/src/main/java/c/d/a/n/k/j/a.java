package c.d.a.n.k.j;

import android.graphics.Bitmap;
import c.d.a.n.i.l;
import c.d.a.n.k.e.j;

/* JADX INFO: loaded from: classes.dex */
public class a implements c<c.d.a.n.k.i.a, c.d.a.n.k.f.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<Bitmap, j> f5850a;

    public a(c<Bitmap, j> cVar) {
        this.f5850a = cVar;
    }

    @Override // c.d.a.n.k.j.c
    public l<c.d.a.n.k.f.b> a(l<c.d.a.n.k.i.a> lVar) {
        c.d.a.n.k.i.a aVar = lVar.get();
        l<Bitmap> lVarA = aVar.a();
        return lVarA != null ? this.f5850a.a(lVarA) : aVar.b();
    }

    @Override // c.d.a.n.k.j.c
    public String getId() {
        return "GifBitmapWrapperDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
