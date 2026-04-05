package a.i.o;

import a.i.o.e;
import a.i.o.f;
import android.graphics.Typeface;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.c f1863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f1864b;

    /* JADX INFO: renamed from: a.i.o.a$a, reason: collision with other inner class name */
    public class RunnableC0034a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f.c f1865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Typeface f1866c;

        public RunnableC0034a(f.c cVar, Typeface typeface) {
            this.f1865b = cVar;
            this.f1866c = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1865b.b(this.f1866c);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f.c f1868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f1869c;

        public b(f.c cVar, int i2) {
            this.f1868b = cVar;
            this.f1869c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1868b.a(this.f1869c);
        }
    }

    public a(f.c cVar, Handler handler) {
        this.f1863a = cVar;
        this.f1864b = handler;
    }

    public final void a(int i2) {
        this.f1864b.post(new b(this.f1863a, i2));
    }

    public void b(e.C0035e c0035e) {
        if (c0035e.a()) {
            c(c0035e.f1892a);
        } else {
            a(c0035e.f1893b);
        }
    }

    public final void c(Typeface typeface) {
        this.f1864b.post(new RunnableC0034a(this.f1863a, typeface));
    }
}
