package c.f.a.b.d3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import c.f.a.b.j3.g;
import c.f.a.b.j3.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f6873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.d3.d f6874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f6875d = x0.z();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f6876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f6878g;

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            e.this.e();
        }
    }

    public interface c {
        void a(e eVar, int i2);
    }

    public final class d extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f6881b;

        public d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void b() {
            if (e.this.f6878g != null) {
                e.this.e();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void d() {
            if (e.this.f6878g != null) {
                e.this.g();
            }
        }

        public final void e() {
            e.this.f6875d.post(new Runnable() { // from class: c.f.a.b.d3.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6865b.b();
                }
            });
        }

        public final void f() {
            e.this.f6875d.post(new Runnable() { // from class: c.f.a.b.d3.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6866b.d();
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            e();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z) {
            if (z) {
                return;
            }
            f();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (this.f6880a && this.f6881b == zHasCapability) {
                if (zHasCapability) {
                    f();
                }
            } else {
                this.f6880a = true;
                this.f6881b = zHasCapability;
                e();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            e();
        }
    }

    public e(Context context, c cVar, c.f.a.b.d3.d dVar) {
        this.f6872a = context.getApplicationContext();
        this.f6873b = cVar;
        this.f6874c = dVar;
    }

    public final void e() {
        int iD = this.f6874c.d(this.f6872a);
        if (this.f6877f != iD) {
            this.f6877f = iD;
            this.f6873b.a(this, iD);
        }
    }

    public c.f.a.b.d3.d f() {
        return this.f6874c;
    }

    public final void g() {
        if ((this.f6877f & 3) == 0) {
            return;
        }
        e();
    }

    public final void h() {
        ConnectivityManager connectivityManager = (ConnectivityManager) g.e((ConnectivityManager) this.f6872a.getSystemService("connectivity"));
        d dVar = new d();
        this.f6878g = dVar;
        connectivityManager.registerDefaultNetworkCallback(dVar);
    }

    public int i() {
        String str;
        this.f6877f = this.f6874c.d(this.f6872a);
        IntentFilter intentFilter = new IntentFilter();
        if (this.f6874c.m()) {
            if (x0.f9296a >= 24) {
                h();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f6874c.f()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f6874c.k()) {
            if (x0.f9296a >= 23) {
                str = "android.os.action.DEVICE_IDLE_MODE_CHANGED";
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                str = "android.intent.action.SCREEN_OFF";
            }
            intentFilter.addAction(str);
        }
        if (this.f6874c.o()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        b bVar = new b();
        this.f6876e = bVar;
        this.f6872a.registerReceiver(bVar, intentFilter, null, this.f6875d);
        return this.f6877f;
    }

    public void j() {
        this.f6872a.unregisterReceiver((BroadcastReceiver) g.e(this.f6876e));
        this.f6876e = null;
        if (x0.f9296a < 24 || this.f6878g == null) {
            return;
        }
        k();
    }

    public final void k() {
        ((ConnectivityManager) g.e((ConnectivityManager) this.f6872a.getSystemService("connectivity"))).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) g.e(this.f6878g));
        this.f6878g = null;
    }
}
