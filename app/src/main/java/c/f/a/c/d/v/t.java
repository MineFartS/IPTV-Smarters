package c.f.a.c.d.v;

import android.os.Handler;
import android.os.Looper;
import c.f.a.c.j.c.w0;
import com.facebook.ads.AdError;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f12204a = new b("RequestTracker");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f12205b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12206c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u f12209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f12210g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12208e = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f12207d = new w0(Looper.getMainLooper());

    public t(long j2) {
        this.f12206c = j2;
    }

    public final boolean a(long j2) {
        boolean z;
        synchronized (f12205b) {
            long j3 = this.f12208e;
            z = j3 != -1 && j3 == j2;
        }
        return z;
    }

    public final void b(int i2, Object obj, String str) {
        f12204a.a(str, new Object[0]);
        Object obj2 = f12205b;
        synchronized (obj2) {
            u uVar = this.f12209f;
            if (uVar != null) {
                uVar.b(this.f12208e, i2, obj);
            }
            this.f12208e = -1L;
            this.f12209f = null;
            synchronized (obj2) {
                Runnable runnable = this.f12210g;
                if (runnable != null) {
                    this.f12207d.removeCallbacks(runnable);
                    this.f12210g = null;
                }
            }
        }
    }

    public final void c(long j2, u uVar) {
        u uVar2;
        long j3;
        Object obj = f12205b;
        synchronized (obj) {
            uVar2 = this.f12209f;
            j3 = this.f12208e;
            this.f12208e = j2;
            this.f12209f = uVar;
        }
        if (uVar2 != null) {
            uVar2.a(j3);
        }
        synchronized (obj) {
            Runnable runnable = this.f12210g;
            if (runnable != null) {
                this.f12207d.removeCallbacks(runnable);
            }
            Runnable runnable2 = new Runnable(this) { // from class: c.f.a.c.d.v.v

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final t f12211b;

                {
                    this.f12211b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f12211b.h();
                }
            };
            this.f12210g = runnable2;
            this.f12207d.postDelayed(runnable2, this.f12206c);
        }
    }

    public final boolean d(int i2, Object obj) {
        synchronized (f12205b) {
            long j2 = this.f12208e;
            if (j2 == -1) {
                return false;
            }
            b(i2, null, String.format(Locale.ROOT, "clearing request %d", Long.valueOf(j2)));
            return true;
        }
    }

    public final boolean e(int i2) {
        return d(AdError.CACHE_ERROR_CODE, null);
    }

    public final boolean f(long j2, int i2, Object obj) {
        synchronized (f12205b) {
            long j3 = this.f12208e;
            if (j3 == -1 || j3 != j2) {
                return false;
            }
            b(i2, obj, String.format(Locale.ROOT, "request %d completed", Long.valueOf(j2)));
            return true;
        }
    }

    public final boolean g() {
        boolean z;
        synchronized (f12205b) {
            z = this.f12208e != -1;
        }
        return z;
    }

    public final /* synthetic */ void h() {
        synchronized (f12205b) {
            if (this.f12208e == -1) {
                return;
            }
            d(15, null);
        }
    }
}
