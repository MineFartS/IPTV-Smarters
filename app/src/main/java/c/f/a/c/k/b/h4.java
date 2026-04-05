package c.f.a.c.k.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class h4 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f13933a = h4.class.getName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x9 f13934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13936d;

    public h4(x9 x9Var) {
        c.f.a.c.f.q.o.i(x9Var);
        this.f13934b = x9Var;
    }

    public final void a() {
        this.f13934b.i0();
        this.f13934b.d().g();
        if (this.f13935c) {
            return;
        }
        this.f13934b.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f13936d = this.f13934b.Y().l();
        this.f13934b.c().w().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f13936d));
        this.f13935c = true;
    }

    public final void b() {
        this.f13934b.i0();
        this.f13934b.d().g();
        this.f13934b.d().g();
        if (this.f13935c) {
            this.f13934b.c().w().a("Unregistering connectivity change receiver");
            this.f13935c = false;
            this.f13936d = false;
            try {
                this.f13934b.b().unregisterReceiver(this);
            } catch (IllegalArgumentException e2) {
                this.f13934b.c().o().b("Failed to unregister the network broadcast receiver", e2);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f13934b.i0();
        String action = intent.getAction();
        this.f13934b.c().w().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f13934b.c().r().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zL = this.f13934b.Y().l();
        if (this.f13936d != zL) {
            this.f13936d = zL;
            this.f13934b.d().r(new g4(this, zL));
        }
    }
}
