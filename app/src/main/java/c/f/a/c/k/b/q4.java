package c.f.a.c.k.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public final class q4 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r4 f14255b;

    public q4(r4 r4Var, String str) {
        this.f14255b = r4Var;
        this.f14254a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f14255b.f14275a.c().r().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            c.f.a.c.j.h.q3 q3VarC1 = c.f.a.c.j.h.p2.c1(iBinder);
            if (q3VarC1 == null) {
                this.f14255b.f14275a.c().r().a("Install Referrer Service implementation was not found");
            } else {
                this.f14255b.f14275a.c().w().a("Install Referrer Service connected");
                this.f14255b.f14275a.d().r(new p4(this, q3VarC1, this));
            }
        } catch (Exception e2) {
            this.f14255b.f14275a.c().r().b("Exception occurred while calling Install Referrer API", e2);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f14255b.f14275a.c().w().a("Install Referrer Service disconnected");
    }
}
