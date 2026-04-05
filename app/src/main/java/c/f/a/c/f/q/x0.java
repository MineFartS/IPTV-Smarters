package c.f.a.c.f.q;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public abstract class x0<TListener> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TListener f12679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12680b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f12681c;

    public x0(c cVar, TListener tlistener) {
        this.f12681c = cVar;
        this.f12679a = tlistener;
    }

    public abstract void a();

    public abstract void b(TListener tlistener);

    public final void c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.f12679a;
            if (this.f12680b) {
                String strValueOf = String.valueOf(this);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
                sb.append("Callback proxy ");
                sb.append(strValueOf);
                sb.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb.toString());
            }
        }
        if (tlistener != null) {
            try {
                b(tlistener);
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        synchronized (this) {
            this.f12680b = true;
        }
        d();
    }

    public final void d() {
        e();
        synchronized (this.f12681c.zzt) {
            this.f12681c.zzt.remove(this);
        }
    }

    public final void e() {
        synchronized (this) {
            this.f12679a = null;
        }
    }
}
