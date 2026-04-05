package a.i.n;

import android.os.Build;
import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f1846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1848d;

    public interface a {
        void a();
    }

    public void a() {
        synchronized (this) {
            if (this.f1845a) {
                return;
            }
            this.f1845a = true;
            this.f1848d = true;
            a aVar = this.f1846b;
            Object obj = this.f1847c;
            if (aVar != null) {
                try {
                    aVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f1848d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null && Build.VERSION.SDK_INT >= 16) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.f1848d = false;
                notifyAll();
            }
        }
    }

    public Object b() {
        Object obj;
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.f1847c == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.f1847c = cancellationSignal;
                if (this.f1845a) {
                    cancellationSignal.cancel();
                }
            }
            obj = this.f1847c;
        }
        return obj;
    }

    public boolean c() {
        boolean z;
        synchronized (this) {
            z = this.f1845a;
        }
        return z;
    }

    public void d(a aVar) {
        synchronized (this) {
            f();
            if (this.f1846b == aVar) {
                return;
            }
            this.f1846b = aVar;
            if (this.f1845a && aVar != null) {
                aVar.a();
            }
        }
    }

    public void e() {
        if (c()) {
            throw new h();
        }
    }

    public final void f() {
        while (this.f1848d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
