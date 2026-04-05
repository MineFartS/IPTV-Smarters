package c.d.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.widget.ImageView;
import c.d.a.n.j.l;
import c.d.a.n.j.m;
import c.d.a.n.j.s.a;
import c.d.a.n.j.s.b;
import c.d.a.n.j.s.c;
import c.d.a.n.j.s.d;
import c.d.a.n.j.t.a;
import c.d.a.n.j.t.b;
import c.d.a.n.j.t.c;
import c.d.a.n.j.t.d;
import c.d.a.n.j.t.e;
import c.d.a.n.j.t.f;
import c.d.a.n.j.t.g;
import c.d.a.n.k.e.n;
import c.d.a.n.k.e.p;
import c.d.a.o.k;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile g f5337a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f5338b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.d.a.n.j.c f5339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.d.a.n.i.c f5340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.d.a.n.i.n.c f5341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.d.a.n.i.o.h f5342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.d.a.n.a f5343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c.d.a.r.h.f f5344h = new c.d.a.r.h.f();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c.d.a.n.k.j.d f5345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c.d.a.q.c f5346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c.d.a.n.k.e.e f5347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c.d.a.n.k.i.f f5348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c.d.a.n.k.e.i f5349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c.d.a.n.k.i.f f5350n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Handler f5351o;
    public final c.d.a.n.i.q.a p;

    public g(c.d.a.n.i.c cVar, c.d.a.n.i.o.h hVar, c.d.a.n.i.n.c cVar2, Context context, c.d.a.n.a aVar) {
        c.d.a.n.k.j.d dVar = new c.d.a.n.k.j.d();
        this.f5345i = dVar;
        this.f5340d = cVar;
        this.f5341e = cVar2;
        this.f5342f = hVar;
        this.f5343g = aVar;
        this.f5339c = new c.d.a.n.j.c(context);
        this.f5351o = new Handler(Looper.getMainLooper());
        this.p = new c.d.a.n.i.q.a(hVar, cVar2, aVar);
        c.d.a.q.c cVar3 = new c.d.a.q.c();
        this.f5346j = cVar3;
        p pVar = new p(cVar2, aVar);
        cVar3.b(InputStream.class, Bitmap.class, pVar);
        c.d.a.n.k.e.g gVar = new c.d.a.n.k.e.g(cVar2, aVar);
        cVar3.b(ParcelFileDescriptor.class, Bitmap.class, gVar);
        n nVar = new n(pVar, gVar);
        cVar3.b(c.d.a.n.j.g.class, Bitmap.class, nVar);
        c.d.a.n.k.h.c cVar4 = new c.d.a.n.k.h.c(context, cVar2);
        cVar3.b(InputStream.class, c.d.a.n.k.h.b.class, cVar4);
        cVar3.b(c.d.a.n.j.g.class, c.d.a.n.k.i.a.class, new c.d.a.n.k.i.g(nVar, cVar4, cVar2));
        cVar3.b(InputStream.class, File.class, new c.d.a.n.k.g.d());
        s(File.class, ParcelFileDescriptor.class, new a.C0109a());
        s(File.class, InputStream.class, new c.a());
        Class cls = Integer.TYPE;
        s(cls, ParcelFileDescriptor.class, new b.a());
        s(cls, InputStream.class, new d.a());
        s(Integer.class, ParcelFileDescriptor.class, new b.a());
        s(Integer.class, InputStream.class, new d.a());
        s(String.class, ParcelFileDescriptor.class, new c.a());
        s(String.class, InputStream.class, new e.a());
        s(Uri.class, ParcelFileDescriptor.class, new d.a());
        s(Uri.class, InputStream.class, new f.a());
        s(URL.class, InputStream.class, new g.a());
        s(c.d.a.n.j.d.class, InputStream.class, new a.C0110a());
        s(byte[].class, InputStream.class, new b.a());
        dVar.b(Bitmap.class, c.d.a.n.k.e.j.class, new c.d.a.n.k.j.b(context.getResources(), cVar2));
        dVar.b(c.d.a.n.k.i.a.class, c.d.a.n.k.f.b.class, new c.d.a.n.k.j.a(new c.d.a.n.k.j.b(context.getResources(), cVar2)));
        c.d.a.n.k.e.e eVar = new c.d.a.n.k.e.e(cVar2);
        this.f5347k = eVar;
        this.f5348l = new c.d.a.n.k.i.f(cVar2, eVar);
        c.d.a.n.k.e.i iVar = new c.d.a.n.k.e.i(cVar2);
        this.f5349m = iVar;
        this.f5350n = new c.d.a.n.k.i.f(cVar2, iVar);
    }

    public static <T> l<T, ParcelFileDescriptor> b(Class<T> cls, Context context) {
        return d(cls, ParcelFileDescriptor.class, context);
    }

    public static <T, Y> l<T, Y> d(Class<T> cls, Class<Y> cls2, Context context) {
        if (cls != null) {
            return i(context).q().a(cls, cls2);
        }
        if (!Log.isLoggable("Glide", 3)) {
            return null;
        }
        Log.d("Glide", "Unable to load null model, setting placeholder only");
        return null;
    }

    public static <T> l<T, InputStream> e(Class<T> cls, Context context) {
        return d(cls, InputStream.class, context);
    }

    public static void g(c.d.a.r.h.j<?> jVar) {
        c.d.a.t.h.a();
        c.d.a.r.b bVarG = jVar.g();
        if (bVarG != null) {
            bVarG.clear();
            jVar.a(null);
        }
    }

    public static g i(Context context) {
        if (f5337a == null) {
            synchronized (g.class) {
                if (f5337a == null) {
                    Context applicationContext = context.getApplicationContext();
                    h hVar = new h(applicationContext);
                    List<c.d.a.p.a> listR = r(applicationContext);
                    Iterator<c.d.a.p.a> it = listR.iterator();
                    while (it.hasNext()) {
                        it.next().a(applicationContext, hVar);
                    }
                    f5337a = hVar.a();
                    Iterator<c.d.a.p.a> it2 = listR.iterator();
                    while (it2.hasNext()) {
                        it2.next().b(applicationContext, f5337a);
                    }
                }
            }
        }
        return f5337a;
    }

    public static List<c.d.a.p.a> r(Context context) {
        return f5338b ? new c.d.a.p.b(context).a() : Collections.emptyList();
    }

    public static j u(Context context) {
        return k.f().d(context);
    }

    public <T, Z> c.d.a.q.b<T, Z> a(Class<T> cls, Class<Z> cls2) {
        return this.f5346j.a(cls, cls2);
    }

    public <R> c.d.a.r.h.j<R> c(ImageView imageView, Class<R> cls) {
        return this.f5344h.a(imageView, cls);
    }

    public <Z, R> c.d.a.n.k.j.c<Z, R> f(Class<Z> cls, Class<R> cls2) {
        return this.f5345i.a(cls, cls2);
    }

    public void h() {
        c.d.a.t.h.a();
        this.f5342f.d();
        this.f5341e.d();
    }

    public c.d.a.n.k.e.e j() {
        return this.f5347k;
    }

    public c.d.a.n.k.e.i k() {
        return this.f5349m;
    }

    public c.d.a.n.i.n.c l() {
        return this.f5341e;
    }

    public c.d.a.n.a m() {
        return this.f5343g;
    }

    public c.d.a.n.k.i.f n() {
        return this.f5348l;
    }

    public c.d.a.n.k.i.f o() {
        return this.f5350n;
    }

    public c.d.a.n.i.c p() {
        return this.f5340d;
    }

    public final c.d.a.n.j.c q() {
        return this.f5339c;
    }

    public <T, Y> void s(Class<T> cls, Class<Y> cls2, m<T, Y> mVar) {
        m<T, Y> mVarF = this.f5339c.f(cls, cls2, mVar);
        if (mVarF != null) {
            mVarF.a();
        }
    }

    public void t(int i2) {
        c.d.a.t.h.a();
        this.f5342f.c(i2);
        this.f5341e.c(i2);
    }
}
