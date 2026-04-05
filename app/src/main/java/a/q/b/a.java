package a.q.b;

import a.i.n.h;
import a.i.q.j;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<D> extends c<D> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Executor f3047j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile a<D>.RunnableC0064a f3048k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile a<D>.RunnableC0064a f3049l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f3050m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f3051n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Handler f3052o;

    /* JADX INFO: renamed from: a.q.b.a$a, reason: collision with other inner class name */
    public final class RunnableC0064a extends d<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final CountDownLatch f3053l = new CountDownLatch(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f3054m;

        public RunnableC0064a() {
        }

        @Override // a.q.b.d
        public void h(D d2) {
            try {
                a.this.B(this, d2);
            } finally {
                this.f3053l.countDown();
            }
        }

        @Override // a.q.b.d
        public void i(D d2) {
            try {
                a.this.C(this, d2);
            } finally {
                this.f3053l.countDown();
            }
        }

        @Override // a.q.b.d
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public D b(Void... voidArr) {
            try {
                return (D) a.this.H();
            } catch (h e2) {
                if (f()) {
                    return null;
                }
                throw e2;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3054m = false;
            a.this.D();
        }
    }

    public a(Context context) {
        this(context, d.f3068d);
    }

    public a(Context context, Executor executor) {
        super(context);
        this.f3051n = -10000L;
        this.f3047j = executor;
    }

    public void A() {
    }

    public void B(a<D>.RunnableC0064a runnableC0064a, D d2) {
        G(d2);
        if (this.f3049l == runnableC0064a) {
            v();
            this.f3051n = SystemClock.uptimeMillis();
            this.f3049l = null;
            e();
            D();
        }
    }

    public void C(a<D>.RunnableC0064a runnableC0064a, D d2) {
        if (this.f3048k != runnableC0064a) {
            B(runnableC0064a, d2);
            return;
        }
        if (j()) {
            G(d2);
            return;
        }
        c();
        this.f3051n = SystemClock.uptimeMillis();
        this.f3048k = null;
        f(d2);
    }

    public void D() {
        if (this.f3049l != null || this.f3048k == null) {
            return;
        }
        if (this.f3048k.f3054m) {
            this.f3048k.f3054m = false;
            this.f3052o.removeCallbacks(this.f3048k);
        }
        if (this.f3050m <= 0 || SystemClock.uptimeMillis() >= this.f3051n + this.f3050m) {
            this.f3048k.c(this.f3047j, null);
        } else {
            this.f3048k.f3054m = true;
            this.f3052o.postAtTime(this.f3048k, this.f3051n + this.f3050m);
        }
    }

    public boolean E() {
        return this.f3049l != null;
    }

    public abstract D F();

    public abstract void G(D d2);

    public D H() {
        return F();
    }

    @Override // a.q.b.c
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f3048k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f3048k);
            printWriter.print(" waiting=");
            printWriter.println(this.f3048k.f3054m);
        }
        if (this.f3049l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f3049l);
            printWriter.print(" waiting=");
            printWriter.println(this.f3049l.f3054m);
        }
        if (this.f3050m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            j.c(this.f3050m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            j.b(this.f3051n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // a.q.b.c
    public boolean n() {
        if (this.f3048k == null) {
            return false;
        }
        if (!this.f3060e) {
            this.f3063h = true;
        }
        if (this.f3049l != null) {
            if (this.f3048k.f3054m) {
                this.f3048k.f3054m = false;
                this.f3052o.removeCallbacks(this.f3048k);
            }
            this.f3048k = null;
            return false;
        }
        if (this.f3048k.f3054m) {
            this.f3048k.f3054m = false;
            this.f3052o.removeCallbacks(this.f3048k);
            this.f3048k = null;
            return false;
        }
        boolean zA = this.f3048k.a(false);
        if (zA) {
            this.f3049l = this.f3048k;
            A();
        }
        this.f3048k = null;
        return zA;
    }

    @Override // a.q.b.c
    public void p() {
        super.p();
        b();
        this.f3048k = new RunnableC0064a();
        D();
    }
}
