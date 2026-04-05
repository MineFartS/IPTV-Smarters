package c.f.a.c.f.q;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 extends o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f12682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12683c;

    public y0(c cVar, int i2) {
        this.f12682b = cVar;
        this.f12683c = i2;
    }

    @Override // c.f.a.c.f.q.k
    public final void C1(int i2, IBinder iBinder, d1 d1Var) {
        c cVar = this.f12682b;
        o.j(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        o.i(d1Var);
        c.zzo(cVar, d1Var);
        Y0(i2, iBinder, d1Var.f12573b);
    }

    @Override // c.f.a.c.f.q.k
    public final void Y0(int i2, IBinder iBinder, Bundle bundle) {
        o.j(this.f12682b, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f12682b.onPostInitHandler(i2, iBinder, bundle, this.f12683c);
        this.f12682b = null;
    }

    @Override // c.f.a.c.f.q.k
    public final void l0(int i2, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
