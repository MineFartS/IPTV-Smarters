package c.d.a.n.k.e;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class g implements c.d.a.q.b<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.d.a.n.e<File, Bitmap> f5720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f5721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f5722d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.d.a.n.b<ParcelFileDescriptor> f5723e = c.d.a.n.k.a.b();

    public g(c.d.a.n.i.n.c cVar, c.d.a.n.a aVar) {
        this.f5720b = new c.d.a.n.k.g.c(new q(cVar, aVar));
        this.f5721c = new h(cVar, aVar);
    }

    @Override // c.d.a.q.b
    public c.d.a.n.b<ParcelFileDescriptor> a() {
        return this.f5723e;
    }

    @Override // c.d.a.q.b
    public c.d.a.n.f<Bitmap> c() {
        return this.f5722d;
    }

    @Override // c.d.a.q.b
    public c.d.a.n.e<ParcelFileDescriptor, Bitmap> e() {
        return this.f5721c;
    }

    @Override // c.d.a.q.b
    public c.d.a.n.e<File, Bitmap> f() {
        return this.f5720b;
    }
}
