package c.k.b;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HandlerThread f18638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f18639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f18640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18645h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18646i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f18647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18648k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18649l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18650m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18651n;

    public static class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0 f18652a;

        /* JADX INFO: renamed from: c.k.b.a0$a$a, reason: collision with other inner class name */
        public class RunnableC0249a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Message f18653b;

            public RunnableC0249a(Message message) {
                this.f18653b = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f18653b.what);
            }
        }

        public a(Looper looper, a0 a0Var) {
            super(looper);
            this.f18652a = a0Var;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                this.f18652a.j();
                return;
            }
            if (i2 == 1) {
                this.f18652a.k();
                return;
            }
            if (i2 == 2) {
                this.f18652a.h(message.arg1);
                return;
            }
            if (i2 == 3) {
                this.f18652a.i(message.arg1);
            } else if (i2 != 4) {
                t.f18744a.post(new RunnableC0249a(message));
            } else {
                this.f18652a.l((Long) message.obj);
            }
        }
    }

    public a0(d dVar) {
        this.f18639b = dVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f18638a = handlerThread;
        handlerThread.start();
        g0.j(handlerThread.getLooper());
        this.f18640c = new a(handlerThread.getLooper(), this);
    }

    public static long g(int i2, long j2) {
        return j2 / ((long) i2);
    }

    public b0 a() {
        return new b0(this.f18639b.a(), this.f18639b.size(), this.f18641d, this.f18642e, this.f18643f, this.f18644g, this.f18645h, this.f18646i, this.f18647j, this.f18648k, this.f18649l, this.f18650m, this.f18651n, System.currentTimeMillis());
    }

    public void b(Bitmap bitmap) {
        m(bitmap, 2);
    }

    public void c(Bitmap bitmap) {
        m(bitmap, 3);
    }

    public void d() {
        this.f18640c.sendEmptyMessage(0);
    }

    public void e() {
        this.f18640c.sendEmptyMessage(1);
    }

    public void f(long j2) {
        Handler handler = this.f18640c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j2)));
    }

    public void h(long j2) {
        int i2 = this.f18650m + 1;
        this.f18650m = i2;
        long j3 = this.f18644g + j2;
        this.f18644g = j3;
        this.f18647j = g(i2, j3);
    }

    public void i(long j2) {
        this.f18651n++;
        long j3 = this.f18645h + j2;
        this.f18645h = j3;
        this.f18648k = g(this.f18650m, j3);
    }

    public void j() {
        this.f18641d++;
    }

    public void k() {
        this.f18642e++;
    }

    public void l(Long l2) {
        this.f18649l++;
        long jLongValue = this.f18643f + l2.longValue();
        this.f18643f = jLongValue;
        this.f18646i = g(this.f18649l, jLongValue);
    }

    public final void m(Bitmap bitmap, int i2) {
        int iK = g0.k(bitmap);
        Handler handler = this.f18640c;
        handler.sendMessage(handler.obtainMessage(i2, iK, 0));
    }
}
