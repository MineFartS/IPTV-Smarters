package c.k.b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import c.k.b.t;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f18625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f18626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference<T> f18627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f18632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f18633i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f18634j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18635k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18636l;

    /* JADX INFO: renamed from: c.k.b.a$a, reason: collision with other inner class name */
    public static class C0248a<M> extends WeakReference<M> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f18637a;

        public C0248a(a aVar, M m2, ReferenceQueue<? super M> referenceQueue) {
            super(m2, referenceQueue);
            this.f18637a = aVar;
        }
    }

    public a(t tVar, T t, w wVar, int i2, int i3, int i4, Drawable drawable, String str, Object obj, boolean z) {
        this.f18625a = tVar;
        this.f18626b = wVar;
        this.f18627c = t == null ? null : new C0248a(this, t, tVar.f18756m);
        this.f18629e = i2;
        this.f18630f = i3;
        this.f18628d = z;
        this.f18631g = i4;
        this.f18632h = drawable;
        this.f18633i = str;
        this.f18634j = obj == null ? this : obj;
    }

    public void a() {
        this.f18636l = true;
    }

    public abstract void b(Bitmap bitmap, t.e eVar);

    public abstract void c();

    public String d() {
        return this.f18633i;
    }

    public int e() {
        return this.f18629e;
    }

    public int f() {
        return this.f18630f;
    }

    public t g() {
        return this.f18625a;
    }

    public t.f h() {
        return this.f18626b.s;
    }

    public w i() {
        return this.f18626b;
    }

    public Object j() {
        return this.f18634j;
    }

    public T k() {
        WeakReference<T> weakReference = this.f18627c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public boolean l() {
        return this.f18636l;
    }

    public boolean m() {
        return this.f18635k;
    }
}
