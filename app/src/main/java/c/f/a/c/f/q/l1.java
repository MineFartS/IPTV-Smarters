package c.f.a.c.f.q;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class l1 extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f12628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f12629f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("connectionStatus")
    public final HashMap<h1, j1> f12627d = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.f.a.c.f.s.a f12630g = c.f.a.c.f.s.a.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f12631h = 5000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f12632i = 300000;

    public l1(Context context) {
        this.f12628e = context.getApplicationContext();
        this.f12629f = new c.f.a.c.j.e.h(context.getMainLooper(), new k1(this, null));
    }

    @Override // c.f.a.c.f.q.h
    public final boolean d(h1 h1Var, ServiceConnection serviceConnection, String str) {
        boolean zE;
        o.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f12627d) {
            j1 j1Var = this.f12627d.get(h1Var);
            if (j1Var == null) {
                j1Var = new j1(this, h1Var);
                j1Var.c(serviceConnection, serviceConnection, str);
                j1Var.a(str);
                this.f12627d.put(h1Var, j1Var);
            } else {
                this.f12629f.removeMessages(0, h1Var);
                if (j1Var.g(serviceConnection)) {
                    String strValueOf = String.valueOf(h1Var);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(strValueOf);
                    throw new IllegalStateException(sb.toString());
                }
                j1Var.c(serviceConnection, serviceConnection, str);
                int iF = j1Var.f();
                if (iF == 1) {
                    serviceConnection.onServiceConnected(j1Var.j(), j1Var.i());
                } else if (iF == 2) {
                    j1Var.a(str);
                }
            }
            zE = j1Var.e();
        }
        return zE;
    }

    @Override // c.f.a.c.f.q.h
    public final void e(h1 h1Var, ServiceConnection serviceConnection, String str) {
        o.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f12627d) {
            j1 j1Var = this.f12627d.get(h1Var);
            if (j1Var == null) {
                String strValueOf = String.valueOf(h1Var);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString());
            }
            if (!j1Var.g(serviceConnection)) {
                String strValueOf2 = String.valueOf(h1Var);
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(strValueOf2);
                throw new IllegalStateException(sb2.toString());
            }
            j1Var.d(serviceConnection, str);
            if (j1Var.h()) {
                this.f12629f.sendMessageDelayed(this.f12629f.obtainMessage(0, h1Var), this.f12631h);
            }
        }
    }
}
