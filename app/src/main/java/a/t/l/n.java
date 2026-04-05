package a.t.l;

import a.t.l.i;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f3469c;

    public static class a extends n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f3470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f3471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Object f3472f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f3473g;

        /* JADX INFO: renamed from: a.t.l.n$a$a, reason: collision with other inner class name */
        public static final class C0078a implements i.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WeakReference<a> f3474a;

            public C0078a(a aVar) {
                this.f3474a = new WeakReference<>(aVar);
            }

            @Override // a.t.l.i.g
            public void c(Object obj, int i2) {
                d dVar;
                a aVar = this.f3474a.get();
                if (aVar == null || (dVar = aVar.f3469c) == null) {
                    return;
                }
                dVar.b(i2);
            }

            @Override // a.t.l.i.g
            public void j(Object obj, int i2) {
                d dVar;
                a aVar = this.f3474a.get();
                if (aVar == null || (dVar = aVar.f3469c) == null) {
                    return;
                }
                dVar.a(i2);
            }
        }

        public a(Context context, Object obj) {
            super(context, obj);
            Object objG = i.g(context);
            this.f3470d = objG;
            Object objD = i.d(objG, BuildConfig.FLAVOR, false);
            this.f3471e = objD;
            this.f3472f = i.e(objG, objD);
        }

        @Override // a.t.l.n
        public void c(c cVar) {
            i.f.e(this.f3472f, cVar.f3475a);
            i.f.h(this.f3472f, cVar.f3476b);
            i.f.g(this.f3472f, cVar.f3477c);
            i.f.b(this.f3472f, cVar.f3478d);
            i.f.c(this.f3472f, cVar.f3479e);
            if (this.f3473g) {
                return;
            }
            this.f3473g = true;
            i.f.f(this.f3472f, i.f(new C0078a(this)));
            i.f.d(this.f3472f, this.f3468b);
        }
    }

    public static class b extends n {
        public b(Context context, Object obj) {
            super(context, obj);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3477c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3478d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3479e = 1;
    }

    public interface d {
        void a(int i2);

        void b(int i2);
    }

    public n(Context context, Object obj) {
        this.f3467a = context;
        this.f3468b = obj;
    }

    public static n b(Context context, Object obj) {
        return Build.VERSION.SDK_INT >= 16 ? new a(context, obj) : new b(context, obj);
    }

    public Object a() {
        return this.f3468b;
    }

    public void c(c cVar) {
    }

    public void d(d dVar) {
        this.f3469c = dVar;
    }
}
