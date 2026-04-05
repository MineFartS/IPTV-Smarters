package c.c.a.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class q implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5161a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5162b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f5163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f5164d;

    public /* synthetic */ q(d dVar, e eVar, m0 m0Var) {
        this.f5164d = dVar;
        this.f5163c = eVar;
    }

    public final /* synthetic */ Object a() {
        int iP0;
        synchronized (this.f5161a) {
            if (this.f5162b) {
                return null;
            }
            int i2 = 3;
            try {
                String packageName = this.f5164d.f5100f.getPackageName();
                int i3 = 16;
                iP0 = 3;
                while (true) {
                    if (i3 < 3) {
                        i3 = 0;
                        break;
                    }
                    try {
                        iP0 = this.f5164d.f5101g.P0(i3, packageName, "subs");
                        if (iP0 == 0) {
                            break;
                        }
                        i3--;
                    } catch (Exception unused) {
                        i2 = iP0;
                        c.f.a.c.j.i.a.j("BillingClient", "Exception while checking if billing is supported; try to reconnect");
                        this.f5164d.f5095a = 0;
                        this.f5164d.f5101g = null;
                        iP0 = i2;
                    }
                }
                boolean z = true;
                this.f5164d.f5104j = i3 >= 5;
                this.f5164d.f5103i = i3 >= 3;
                if (i3 < 3) {
                    c.f.a.c.j.i.a.i("BillingClient", "In-app billing API does not support subscription on this device.");
                }
                int i4 = 16;
                while (true) {
                    if (i4 < 3) {
                        break;
                    }
                    iP0 = this.f5164d.f5101g.P0(i4, packageName, "inapp");
                    if (iP0 == 0) {
                        this.f5164d.f5105k = i4;
                        break;
                    }
                    i4--;
                }
                d dVar = this.f5164d;
                dVar.s = dVar.f5105k >= 16;
                d dVar2 = this.f5164d;
                dVar2.r = dVar2.f5105k >= 15;
                d dVar3 = this.f5164d;
                dVar3.q = dVar3.f5105k >= 14;
                d dVar4 = this.f5164d;
                dVar4.p = dVar4.f5105k >= 12;
                d dVar5 = this.f5164d;
                dVar5.f5109o = dVar5.f5105k >= 10;
                d dVar6 = this.f5164d;
                dVar6.f5108n = dVar6.f5105k >= 9;
                d dVar7 = this.f5164d;
                dVar7.f5107m = dVar7.f5105k >= 8;
                d dVar8 = this.f5164d;
                if (dVar8.f5105k < 6) {
                    z = false;
                }
                dVar8.f5106l = z;
                if (this.f5164d.f5105k < 3) {
                    c.f.a.c.j.i.a.j("BillingClient", "In-app billing API version 3 is not supported on this device.");
                }
                if (iP0 == 0) {
                    this.f5164d.f5095a = 2;
                } else {
                    this.f5164d.f5095a = 0;
                    this.f5164d.f5101g = null;
                }
            } catch (Exception unused2) {
            }
            d(iP0 == 0 ? t.p : t.f5165a);
            return null;
        }
    }

    public final /* synthetic */ void b() {
        this.f5164d.f5095a = 0;
        this.f5164d.f5101g = null;
        d(t.r);
    }

    public final void c() {
        synchronized (this.f5161a) {
            this.f5163c = null;
            this.f5162b = true;
        }
    }

    public final void d(g gVar) {
        synchronized (this.f5161a) {
            e eVar = this.f5163c;
            if (eVar != null) {
                eVar.a(gVar);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c.f.a.c.j.i.a.i("BillingClient", "Billing service connected.");
        this.f5164d.f5101g = c.f.a.c.j.i.c.J(iBinder);
        if (this.f5164d.p(new Callable() { // from class: c.c.a.a.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f5160a.a();
                return null;
            }
        }, 30000L, new Runnable() { // from class: c.c.a.a.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f5159b.b();
            }
        }, this.f5164d.m()) == null) {
            d(this.f5164d.o());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c.f.a.c.j.i.a.j("BillingClient", "Billing service disconnected.");
        this.f5164d.f5101g = null;
        this.f5164d.f5095a = 0;
        synchronized (this.f5161a) {
            e eVar = this.f5163c;
            if (eVar != null) {
                eVar.b();
            }
        }
    }
}
