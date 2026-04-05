package c.f.a.c.f.o.n;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f12428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f12429b;

    public j0(i0 i0Var) {
        this.f12429b = i0Var;
    }

    public final void a(Context context) {
        this.f12428a = context;
    }

    public final synchronized void b() {
        Context context = this.f12428a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f12428a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f12429b.a();
            b();
        }
    }
}
