package c.d.a.n.k.i;

import android.graphics.Bitmap;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class g implements c.d.a.q.b<c.d.a.n.j.g, a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.d.a.n.e<File, a> f5846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.d.a.n.e<c.d.a.n.j.g, a> f5847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.d.a.n.f<a> f5848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.d.a.n.b<c.d.a.n.j.g> f5849e;

    public g(c.d.a.q.b<c.d.a.n.j.g, Bitmap> bVar, c.d.a.q.b<InputStream, c.d.a.n.k.h.b> bVar2, c.d.a.n.i.n.c cVar) {
        c cVar2 = new c(bVar.e(), bVar2.e(), cVar);
        this.f5846b = new c.d.a.n.k.g.c(new e(cVar2));
        this.f5847c = cVar2;
        this.f5848d = new d(bVar.c(), bVar2.c());
        this.f5849e = bVar.a();
    }

    @Override // c.d.a.q.b
    public c.d.a.n.b<c.d.a.n.j.g> a() {
        return this.f5849e;
    }

    @Override // c.d.a.q.b
    public c.d.a.n.f<a> c() {
        return this.f5848d;
    }

    @Override // c.d.a.q.b
    public c.d.a.n.e<c.d.a.n.j.g, a> e() {
        return this.f5847c;
    }

    @Override // c.d.a.q.b
    public c.d.a.n.e<File, a> f() {
        return this.f5846b;
    }
}
