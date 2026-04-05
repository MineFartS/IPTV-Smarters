package c.f.a.d.k0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static e f15017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15018b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f15019c = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f15020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f15021e;

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            e.this.c((c) message.obj);
            return true;
        }
    }

    public interface b {
        void a(int i2);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<b> f15023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15025c;

        public boolean a(b bVar) {
            return bVar != null && this.f15023a.get() == bVar;
        }
    }

    public static e b() {
        if (f15017a == null) {
            f15017a = new e();
        }
        return f15017a;
    }

    public final boolean a(c cVar, int i2) {
        b bVar = cVar.f15023a.get();
        if (bVar == null) {
            return false;
        }
        this.f15019c.removeCallbacksAndMessages(cVar);
        bVar.a(i2);
        return true;
    }

    public void c(c cVar) {
        synchronized (this.f15018b) {
            if (this.f15020d == cVar || this.f15021e == cVar) {
                a(cVar, 2);
            }
        }
    }

    public final boolean d(b bVar) {
        c cVar = this.f15020d;
        return cVar != null && cVar.a(bVar);
    }

    public void e(b bVar) {
        synchronized (this.f15018b) {
            if (d(bVar)) {
                c cVar = this.f15020d;
                if (!cVar.f15025c) {
                    cVar.f15025c = true;
                    this.f15019c.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f15018b) {
            if (d(bVar)) {
                c cVar = this.f15020d;
                if (cVar.f15025c) {
                    cVar.f15025c = false;
                    g(cVar);
                }
            }
        }
    }

    public final void g(c cVar) {
        int i2 = cVar.f15024b;
        if (i2 == -2) {
            return;
        }
        if (i2 <= 0) {
            i2 = i2 == -1 ? 1500 : 2750;
        }
        this.f15019c.removeCallbacksAndMessages(cVar);
        Handler handler = this.f15019c;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i2);
    }
}
