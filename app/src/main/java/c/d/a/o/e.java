package c.d.a.o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import c.d.a.o.c;

/* JADX INFO: loaded from: classes.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.a f5860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BroadcastReceiver f5863e = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z = e.this.f5861c;
            e eVar = e.this;
            eVar.f5861c = eVar.l(context);
            if (z != e.this.f5861c) {
                e.this.f5860b.a(e.this.f5861c);
            }
        }
    }

    public e(Context context, c.a aVar) {
        this.f5859a = context.getApplicationContext();
        this.f5860b = aVar;
    }

    public final boolean l(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void m() {
        if (this.f5862d) {
            return;
        }
        this.f5861c = l(this.f5859a);
        this.f5859a.registerReceiver(this.f5863e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f5862d = true;
    }

    public final void n() {
        if (this.f5862d) {
            this.f5859a.unregisterReceiver(this.f5863e);
            this.f5862d = false;
        }
    }

    @Override // c.d.a.o.h
    public void onDestroy() {
    }

    @Override // c.d.a.o.h
    public void onStart() {
        m();
    }

    @Override // c.d.a.o.h
    public void onStop() {
        n();
    }
}
