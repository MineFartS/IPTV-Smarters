package c.d.a.n.k.e;

import android.graphics.Bitmap;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class q implements c.d.a.n.e<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f5758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.d.a.n.i.n.c f5759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.d.a.n.a f5760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f5761d;

    public q(c.d.a.n.i.n.c cVar, c.d.a.n.a aVar) {
        this(f.f5717c, cVar, aVar);
    }

    public q(f fVar, c.d.a.n.i.n.c cVar, c.d.a.n.a aVar) {
        this.f5758a = fVar;
        this.f5759b = cVar;
        this.f5760c = aVar;
    }

    @Override // c.d.a.n.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.d.a.n.i.l<Bitmap> a(InputStream inputStream, int i2, int i3) {
        return c.c(this.f5758a.a(inputStream, this.f5759b, i2, i3, this.f5760c), this.f5759b);
    }

    @Override // c.d.a.n.e
    public String getId() {
        if (this.f5761d == null) {
            this.f5761d = "StreamBitmapDecoder.com.bumptech.glide.load.resource.bitmap" + this.f5758a.getId() + this.f5760c.name();
        }
        return this.f5761d;
    }
}
