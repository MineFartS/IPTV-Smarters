package c.d.a.n.k.i;

import android.graphics.Bitmap;
import c.d.a.n.k.e.l;
import c.d.a.n.k.e.o;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class c implements c.d.a.n.e<c.d.a.n.j.g, c.d.a.n.k.i.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f5832a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5833b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.d.a.n.e<c.d.a.n.j.g, Bitmap> f5834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.d.a.n.e<InputStream, c.d.a.n.k.h.b> f5835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.d.a.n.i.n.c f5836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f5837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f5838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f5839h;

    public static class a {
        public InputStream a(InputStream inputStream, byte[] bArr) {
            return new o(inputStream, bArr);
        }
    }

    public static class b {
        public l.a a(InputStream inputStream) {
            return new l(inputStream).d();
        }
    }

    public c(c.d.a.n.e<c.d.a.n.j.g, Bitmap> eVar, c.d.a.n.e<InputStream, c.d.a.n.k.h.b> eVar2, c.d.a.n.i.n.c cVar) {
        this(eVar, eVar2, cVar, f5832a, f5833b);
    }

    public c(c.d.a.n.e<c.d.a.n.j.g, Bitmap> eVar, c.d.a.n.e<InputStream, c.d.a.n.k.h.b> eVar2, c.d.a.n.i.n.c cVar, b bVar, a aVar) {
        this.f5834c = eVar;
        this.f5835d = eVar2;
        this.f5836e = cVar;
        this.f5837f = bVar;
        this.f5838g = aVar;
    }

    @Override // c.d.a.n.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.d.a.n.i.l<c.d.a.n.k.i.a> a(c.d.a.n.j.g gVar, int i2, int i3) {
        c.d.a.t.a aVarA = c.d.a.t.a.a();
        byte[] bArrB = aVarA.b();
        try {
            c.d.a.n.k.i.a aVarC = c(gVar, i2, i3, bArrB);
            if (aVarC != null) {
                return new c.d.a.n.k.i.b(aVarC);
            }
            return null;
        } finally {
            aVarA.c(bArrB);
        }
    }

    public final c.d.a.n.k.i.a c(c.d.a.n.j.g gVar, int i2, int i3, byte[] bArr) {
        return gVar.b() != null ? f(gVar, i2, i3, bArr) : d(gVar, i2, i3);
    }

    public final c.d.a.n.k.i.a d(c.d.a.n.j.g gVar, int i2, int i3) {
        c.d.a.n.i.l<Bitmap> lVarA = this.f5834c.a(gVar, i2, i3);
        if (lVarA != null) {
            return new c.d.a.n.k.i.a(lVarA, null);
        }
        return null;
    }

    public final c.d.a.n.k.i.a e(InputStream inputStream, int i2, int i3) {
        c.d.a.n.i.l<c.d.a.n.k.h.b> lVarA = this.f5835d.a(inputStream, i2, i3);
        if (lVarA == null) {
            return null;
        }
        c.d.a.n.k.h.b bVar = lVarA.get();
        return bVar.f() > 1 ? new c.d.a.n.k.i.a(null, lVarA) : new c.d.a.n.k.i.a(new c.d.a.n.k.e.c(bVar.e(), this.f5836e), null);
    }

    public final c.d.a.n.k.i.a f(c.d.a.n.j.g gVar, int i2, int i3, byte[] bArr) throws IOException {
        InputStream inputStreamA = this.f5838g.a(gVar.b(), bArr);
        inputStreamA.mark(2048);
        l.a aVarA = this.f5837f.a(inputStreamA);
        inputStreamA.reset();
        c.d.a.n.k.i.a aVarE = aVarA == l.a.GIF ? e(inputStreamA, i2, i3) : null;
        return aVarE == null ? d(new c.d.a.n.j.g(inputStreamA, gVar.a()), i2, i3) : aVarE;
    }

    @Override // c.d.a.n.e
    public String getId() {
        if (this.f5839h == null) {
            this.f5839h = this.f5835d.getId() + this.f5834c.getId();
        }
        return this.f5839h;
    }
}
