package c.f.a.c.f.q;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f12685b;

    public z0(c cVar, int i2) {
        this.f12685b = cVar;
        this.f12684a = i2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c cVar = this.f12685b;
        if (iBinder == null) {
            c.zzc(cVar, 16);
            return;
        }
        synchronized (cVar.zzq) {
            c cVar2 = this.f12685b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            cVar2.zzr = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof l)) ? new p0(iBinder) : (l) iInterfaceQueryLocalInterface;
        }
        this.f12685b.zzb(0, null, this.f12684a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f12685b.zzq) {
            this.f12685b.zzr = null;
        }
        Handler handler = this.f12685b.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.f12684a, 1));
    }
}
