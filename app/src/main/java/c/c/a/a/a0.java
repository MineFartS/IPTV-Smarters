package c.c.a.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f5087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f5089c;

    public /* synthetic */ a0(b0 b0Var, i iVar, z zVar) {
        this.f5089c = b0Var;
        this.f5087a = iVar;
    }

    public final void b(Context context, IntentFilter intentFilter) {
        if (this.f5088b) {
            return;
        }
        context.registerReceiver(this.f5089c.f5091b, intentFilter);
        this.f5088b = true;
    }

    public final void c(Context context) {
        if (!this.f5088b) {
            c.f.a.c.j.i.a.j("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this.f5089c.f5091b);
            this.f5088b = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f5087a.f(c.f.a.c.j.i.a.f(intent, "BillingBroadcastManager"), c.f.a.c.j.i.a.h(intent.getExtras()));
    }
}
