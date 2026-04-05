package c.d.a.n.k.j;

import android.content.res.Resources;
import android.graphics.Bitmap;
import c.d.a.n.i.l;
import c.d.a.n.k.e.j;
import c.d.a.n.k.e.k;

/* JADX INFO: loaded from: classes.dex */
public class b implements c<Bitmap, j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f5851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.d.a.n.i.n.c f5852b;

    public b(Resources resources, c.d.a.n.i.n.c cVar) {
        this.f5851a = resources;
        this.f5852b = cVar;
    }

    @Override // c.d.a.n.k.j.c
    public l<j> a(l<Bitmap> lVar) {
        return new k(new j(this.f5851a, lVar.get()), this.f5852b);
    }

    @Override // c.d.a.n.k.j.c
    public String getId() {
        return "GlideBitmapDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
