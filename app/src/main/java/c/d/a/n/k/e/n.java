package c.d.a.n.k.e;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class n implements c.d.a.q.b<c.d.a.n.j.g, Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f5745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.d.a.n.e<File, Bitmap> f5746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.d.a.n.f<Bitmap> f5747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.d.a.n.j.h f5748e;

    public n(c.d.a.q.b<InputStream, Bitmap> bVar, c.d.a.q.b<ParcelFileDescriptor, Bitmap> bVar2) {
        this.f5747d = bVar.c();
        this.f5748e = new c.d.a.n.j.h(bVar.a(), bVar2.a());
        this.f5746c = bVar.f();
        this.f5745b = new m(bVar.e(), bVar2.e());
    }

    @Override // c.d.a.q.b
    public c.d.a.n.b<c.d.a.n.j.g> a() {
        return this.f5748e;
    }

    @Override // c.d.a.q.b
    public c.d.a.n.f<Bitmap> c() {
        return this.f5747d;
    }

    @Override // c.d.a.q.b
    public c.d.a.n.e<c.d.a.n.j.g, Bitmap> e() {
        return this.f5745b;
    }

    @Override // c.d.a.q.b
    public c.d.a.n.e<File, Bitmap> f() {
        return this.f5746c;
    }
}
