package c.d.a.n.k.h;

import android.graphics.Bitmap;
import android.util.Log;
import c.d.a.l.a;
import c.d.a.n.i.l;
import java.io.IOException;
import java.io.OutputStream;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class j implements c.d.a.n.f<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5825a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a.InterfaceC0100a f5826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.d.a.n.i.n.c f5827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f5828d;

    public static class a {
        public c.d.a.l.a a(a.InterfaceC0100a interfaceC0100a) {
            return new c.d.a.l.a(interfaceC0100a);
        }

        public c.d.a.m.a b() {
            return new c.d.a.m.a();
        }

        public l<Bitmap> c(Bitmap bitmap, c.d.a.n.i.n.c cVar) {
            return new c.d.a.n.k.e.c(bitmap, cVar);
        }

        public c.d.a.l.d d() {
            return new c.d.a.l.d();
        }
    }

    public j(c.d.a.n.i.n.c cVar) {
        this(cVar, f5825a);
    }

    public j(c.d.a.n.i.n.c cVar, a aVar) {
        this.f5827c = cVar;
        this.f5826b = new c.d.a.n.k.h.a(cVar);
        this.f5828d = aVar;
    }

    public final c.d.a.l.a b(byte[] bArr) {
        c.d.a.l.d dVarD = this.f5828d.d();
        dVarD.o(bArr);
        c.d.a.l.c cVarC = dVarD.c();
        c.d.a.l.a aVarA = this.f5828d.a(this.f5826b);
        aVarA.n(cVarC, bArr);
        aVarA.a();
        return aVarA;
    }

    @Override // c.d.a.n.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(l<b> lVar, OutputStream outputStream) {
        long jB = c.d.a.t.d.b();
        b bVar = lVar.get();
        c.d.a.n.g<Bitmap> gVarG = bVar.g();
        if (gVarG instanceof c.d.a.n.k.d) {
            return e(bVar.d(), outputStream);
        }
        c.d.a.l.a aVarB = b(bVar.d());
        c.d.a.m.a aVarB2 = this.f5828d.b();
        if (!aVarB2.h(outputStream)) {
            return false;
        }
        for (int i2 = 0; i2 < aVarB.f(); i2++) {
            l<Bitmap> lVarD = d(aVarB.i(), gVarG, bVar);
            try {
                if (!aVarB2.a(lVarD.get())) {
                    return false;
                }
                aVarB2.f(aVarB.e(aVarB.d()));
                aVarB.a();
                lVarD.b();
            } finally {
                lVarD.b();
            }
        }
        boolean zD = aVarB2.d();
        if (Log.isLoggable("GifEncoder", 2)) {
            Log.v("GifEncoder", "Encoded gif with " + aVarB.f() + " frames and " + bVar.d().length + " bytes in " + c.d.a.t.d.a(jB) + " ms");
        }
        return zD;
    }

    public final l<Bitmap> d(Bitmap bitmap, c.d.a.n.g<Bitmap> gVar, b bVar) {
        l<Bitmap> lVarC = this.f5828d.c(bitmap, this.f5827c);
        l<Bitmap> lVarA = gVar.a(lVarC, bVar.getIntrinsicWidth(), bVar.getIntrinsicHeight());
        if (!lVarC.equals(lVarA)) {
            lVarC.b();
        }
        return lVarA;
    }

    public final boolean e(byte[] bArr, OutputStream outputStream) {
        try {
            outputStream.write(bArr);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("GifEncoder", 3)) {
                Log.d("GifEncoder", "Failed to write data to output stream in GifResourceEncoder", e2);
            }
            return false;
        }
    }

    @Override // c.d.a.n.b
    public String getId() {
        return BuildConfig.FLAVOR;
    }
}
