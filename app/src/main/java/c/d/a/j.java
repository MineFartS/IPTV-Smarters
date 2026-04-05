package c.d.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import c.d.a.o.c;
import c.d.a.o.l;
import c.d.a.o.m;

/* JADX INFO: loaded from: classes.dex */
public class j implements c.d.a.o.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.d.a.o.g f5361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f5362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f5363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f5364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f5365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f5366g;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c.d.a.o.g f5367b;

        public a(c.d.a.o.g gVar) {
            this.f5367b = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5367b.a(j.this);
        }
    }

    public interface b {
        <T> void a(c.d.a.e<T, ?, ?, ?> eVar);
    }

    public final class c<A, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.d.a.n.j.l<A, T> f5369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<T> f5370b;

        public final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final A f5372a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Class<A> f5373b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f5374c = true;

            public a(A a2) {
                this.f5372a = a2;
                this.f5373b = j.p(a2);
            }

            public <Z> f<A, T, Z> a(Class<Z> cls) {
                f<A, T, Z> fVar = (f) j.this.f5365f.a(new f(j.this.f5360a, j.this.f5364e, this.f5373b, c.this.f5369a, c.this.f5370b, cls, j.this.f5363d, j.this.f5361b, j.this.f5365f));
                if (this.f5374c) {
                    fVar.n(this.f5372a);
                }
                return fVar;
            }
        }

        public c(c.d.a.n.j.l<A, T> lVar, Class<T> cls) {
            this.f5369a = lVar;
            this.f5370b = cls;
        }

        public c<A, T>.a c(A a2) {
            return new a(a2);
        }
    }

    public class d {
        public d() {
        }

        public <A, X extends c.d.a.e<A, ?, ?, ?>> X a(X x) {
            if (j.this.f5366g != null) {
                j.this.f5366g.a(x);
            }
            return x;
        }
    }

    public static class e implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f5377a;

        public e(m mVar) {
            this.f5377a = mVar;
        }

        @Override // c.d.a.o.c.a
        public void a(boolean z) {
            if (z) {
                this.f5377a.d();
            }
        }
    }

    public j(Context context, c.d.a.o.g gVar, l lVar) {
        this(context, gVar, lVar, new m(), new c.d.a.o.d());
    }

    public j(Context context, c.d.a.o.g gVar, l lVar, m mVar, c.d.a.o.d dVar) {
        this.f5360a = context.getApplicationContext();
        this.f5361b = gVar;
        this.f5362c = lVar;
        this.f5363d = mVar;
        this.f5364e = g.i(context);
        this.f5365f = new d();
        c.d.a.o.c cVarA = dVar.a(context, new e(mVar));
        if (c.d.a.t.h.h()) {
            new Handler(Looper.getMainLooper()).post(new a(gVar));
        } else {
            gVar.a(this);
        }
        gVar.a(cVarA);
    }

    public static <T> Class<T> p(T t) {
        if (t != null) {
            return (Class<T>) t.getClass();
        }
        return null;
    }

    public c.d.a.d<String> o() {
        return r(String.class);
    }

    @Override // c.d.a.o.h
    public void onDestroy() {
        this.f5363d.a();
    }

    @Override // c.d.a.o.h
    public void onStart() {
        v();
    }

    @Override // c.d.a.o.h
    public void onStop() {
        u();
    }

    public c.d.a.d<String> q(String str) {
        return (c.d.a.d) o().E(str);
    }

    public final <T> c.d.a.d<T> r(Class<T> cls) {
        c.d.a.n.j.l lVarE = g.e(cls, this.f5360a);
        c.d.a.n.j.l lVarB = g.b(cls, this.f5360a);
        if (cls == null || lVarE != null || lVarB != null) {
            d dVar = this.f5365f;
            return (c.d.a.d) dVar.a(new c.d.a.d(cls, lVarE, lVarB, this.f5360a, this.f5364e, this.f5363d, this.f5361b, dVar));
        }
        throw new IllegalArgumentException("Unknown type " + cls + ". You must provide a Model of a type for which there is a registered ModelLoader, if you are using a custom model, you must first call Glide#register with a ModelLoaderFactory for your custom model class");
    }

    public void s() {
        this.f5364e.h();
    }

    public void t(int i2) {
        this.f5364e.t(i2);
    }

    public void u() {
        c.d.a.t.h.a();
        this.f5363d.b();
    }

    public void v() {
        c.d.a.t.h.a();
        this.f5363d.e();
    }

    public <A, T> c<A, T> w(c.d.a.n.j.l<A, T> lVar, Class<T> cls) {
        return new c<>(lVar, cls);
    }
}
