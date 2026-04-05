package c.d.a.n.k.e;

import android.graphics.Bitmap;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class p implements c.d.a.q.b<InputStream, Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f5754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f5755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.d.a.n.j.o f5756d = new c.d.a.n.j.o();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.d.a.n.k.g.c<Bitmap> f5757e;

    public p(c.d.a.n.i.n.c cVar, c.d.a.n.a aVar) {
        q qVar = new q(cVar, aVar);
        this.f5754b = qVar;
        this.f5755c = new b();
        this.f5757e = new c.d.a.n.k.g.c<>(qVar);
    }

    @Override // c.d.a.q.b
    public c.d.a.n.b<InputStream> a() {
        return this.f5756d;
    }

    @Override // c.d.a.q.b
    public c.d.a.n.f<Bitmap> c() {
        return this.f5755c;
    }

    @Override // c.d.a.q.b
    public c.d.a.n.e<InputStream, Bitmap> e() {
        return this.f5754b;
    }

    @Override // c.d.a.q.b
    public c.d.a.n.e<File, Bitmap> f() {
        return this.f5757e;
    }
}
