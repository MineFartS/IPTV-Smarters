package c.f.a.c.k.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import c.f.a.c.f.q.c;

/* JADX INFO: loaded from: classes2.dex */
public final class t8 implements ServiceConnection, c.a, c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f14329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile u3 f14330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u8 f14331c;

    public t8(u8 u8Var) {
        this.f14331c = u8Var;
    }

    public static /* synthetic */ boolean d(t8 t8Var, boolean z) {
        t8Var.f14329a = false;
        return false;
    }

    public final void a(Intent intent) {
        this.f14331c.g();
        Context contextB = this.f14331c.f14413a.b();
        c.f.a.c.f.s.a aVarB = c.f.a.c.f.s.a.b();
        synchronized (this) {
            if (this.f14329a) {
                this.f14331c.f14413a.c().w().a("Connection attempt already in progress");
                return;
            }
            this.f14331c.f14413a.c().w().a("Using local app measurement service");
            this.f14329a = true;
            aVarB.a(contextB, intent, this.f14331c.f14363c, 129);
        }
    }

    public final void b() {
        if (this.f14330b != null && (this.f14330b.isConnected() || this.f14330b.isConnecting())) {
            this.f14330b.disconnect();
        }
        this.f14330b = null;
    }

    public final void c() {
        this.f14331c.g();
        Context contextB = this.f14331c.f14413a.b();
        synchronized (this) {
            if (this.f14329a) {
                this.f14331c.f14413a.c().w().a("Connection attempt already in progress");
                return;
            }
            if (this.f14330b != null && (this.f14330b.isConnecting() || this.f14330b.isConnected())) {
                this.f14331c.f14413a.c().w().a("Already awaiting connection attempt");
                return;
            }
            this.f14330b = new u3(contextB, Looper.getMainLooper(), this, this);
            this.f14331c.f14413a.c().w().a("Connecting to remote service");
            this.f14329a = true;
            c.f.a.c.f.q.o.i(this.f14330b);
            this.f14330b.checkAvailabilityAndConnect();
        }
    }

    @Override // c.f.a.c.f.q.c.a
    public final void onConnected(Bundle bundle) {
        c.f.a.c.f.q.o.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                c.f.a.c.f.q.o.i(this.f14330b);
                this.f14331c.f14413a.d().r(new q8(this, this.f14330b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f14330b = null;
                this.f14329a = false;
            }
        }
    }

    @Override // c.f.a.c.f.q.c.b
    public final void onConnectionFailed(c.f.a.c.f.b bVar) {
        c.f.a.c.f.q.o.d("MeasurementServiceConnection.onConnectionFailed");
        y3 y3VarB = this.f14331c.f14413a.B();
        if (y3VarB != null) {
            y3VarB.r().b("Service connection failed", bVar);
        }
        synchronized (this) {
            this.f14329a = false;
            this.f14330b = null;
        }
        this.f14331c.f14413a.d().r(new s8(this));
    }

    @Override // c.f.a.c.f.q.c.a
    public final void onConnectionSuspended(int i2) {
        c.f.a.c.f.q.o.d("MeasurementServiceConnection.onConnectionSuspended");
        this.f14331c.f14413a.c().v().a("Service connection suspended");
        this.f14331c.f14413a.d().r(new r8(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c.f.a.c.f.q.o.d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f14329a = false;
                this.f14331c.f14413a.c().o().a("Service connected with null binder");
                return;
            }
            p3 n3Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    n3Var = iInterfaceQueryLocalInterface instanceof p3 ? (p3) iInterfaceQueryLocalInterface : new n3(iBinder);
                    this.f14331c.f14413a.c().w().a("Bound to IMeasurementService interface");
                } else {
                    this.f14331c.f14413a.c().o().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f14331c.f14413a.c().o().a("Service connect failed to get IMeasurementService");
            }
            if (n3Var == null) {
                this.f14329a = false;
                try {
                    c.f.a.c.f.s.a.b().c(this.f14331c.f14413a.b(), this.f14331c.f14363c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f14331c.f14413a.d().r(new o8(this, n3Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c.f.a.c.f.q.o.d("MeasurementServiceConnection.onServiceDisconnected");
        this.f14331c.f14413a.c().v().a("Service disconnected");
        this.f14331c.f14413a.d().r(new p8(this, componentName));
    }
}
