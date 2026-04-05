package c.f.a.c.f.q;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 extends n0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f12547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f12548h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c cVar, int i2, IBinder iBinder, Bundle bundle) {
        super(cVar, i2, bundle);
        this.f12548h = cVar;
        this.f12547g = iBinder;
    }

    @Override // c.f.a.c.f.q.n0
    public final boolean f() {
        try {
            IBinder iBinder = this.f12547g;
            o.i(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f12548h.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = this.f12548h.getServiceDescriptor();
                StringBuilder sb = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(serviceDescriptor);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                Log.e("GmsClient", sb.toString());
                return false;
            }
            IInterface iInterfaceCreateServiceInterface = this.f12548h.createServiceInterface(this.f12547g);
            if (iInterfaceCreateServiceInterface == null || !(c.zzl(this.f12548h, 2, 4, iInterfaceCreateServiceInterface) || c.zzl(this.f12548h, 3, 4, iInterfaceCreateServiceInterface))) {
                return false;
            }
            this.f12548h.zzB = null;
            Bundle connectionHint = this.f12548h.getConnectionHint();
            if (this.f12548h.zzw == null) {
                return true;
            }
            this.f12548h.zzw.onConnected(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // c.f.a.c.f.q.n0
    public final void g(c.f.a.c.f.b bVar) {
        if (this.f12548h.zzx != null) {
            this.f12548h.zzx.onConnectionFailed(bVar);
        }
        this.f12548h.onConnectionFailed(bVar);
    }
}
