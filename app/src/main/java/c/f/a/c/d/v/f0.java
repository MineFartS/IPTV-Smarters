package c.f.a.c.d.v;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import c.f.a.c.d.e;
import c.f.a.c.f.o.f;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends c.f.a.c.f.q.g<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f12135a = new b("CastClientImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f12136b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f12137c = new Object();
    public c.f.a.c.f.o.n.e<Status> A;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.f.a.c.d.d f12138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CastDevice f12139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e.d f12140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<String, e.InterfaceC0151e> f12141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f12142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f12143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h0 f12144j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f12145k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f12146l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12147m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12148n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12149o;
    public double p;
    public c.f.a.c.d.z q;
    public int r;
    public int s;
    public final AtomicLong t;
    public String u;
    public String v;
    public Bundle w;
    public final Map<Long, c.f.a.c.f.o.n.e<Status>> x;
    public double y;
    public c.f.a.c.f.o.n.e<e.a> z;

    public f0(Context context, Looper looper, c.f.a.c.f.q.d dVar, CastDevice castDevice, long j2, e.d dVar2, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 10, dVar, aVar, bVar);
        this.f12139e = castDevice;
        this.f12140f = dVar2;
        this.f12142h = j2;
        this.f12143i = bundle;
        this.f12141g = new HashMap();
        this.t = new AtomicLong(0L);
        this.x = new HashMap();
        u();
        this.y = z();
    }

    public static /* synthetic */ c.f.a.c.f.o.n.e d(f0 f0Var, c.f.a.c.f.o.n.e eVar) {
        f0Var.z = null;
        return null;
    }

    @Override // c.f.a.c.f.q.c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // c.f.a.c.f.q.c, c.f.a.c.f.o.a.f
    public final void disconnect() {
        b bVar = f12135a;
        bVar.a("disconnect(); ServiceListener=%s, isConnected=%b", this.f12144j, Boolean.valueOf(isConnected()));
        h0 h0Var = this.f12144j;
        this.f12144j = null;
        if (h0Var == null || h0Var.c1() == null) {
            bVar.a("already disposed, so short-circuiting", new Object[0]);
            return;
        }
        y();
        try {
            try {
                ((h) getService()).disconnect();
            } catch (RemoteException | IllegalStateException e2) {
                f12135a.b(e2, "Error while disconnecting the controller interface: %s", e2.getMessage());
            }
        } finally {
            super.disconnect();
        }
    }

    public final void f(long j2, int i2) {
        c.f.a.c.f.o.n.e<Status> eVarRemove;
        synchronized (this.x) {
            eVarRemove = this.x.remove(Long.valueOf(j2));
        }
        if (eVarRemove != null) {
            eVarRemove.a(new Status(i2));
        }
    }

    public final void g(d dVar) {
        boolean z;
        String strI = dVar.I();
        if (a.f(strI, this.f12145k)) {
            z = false;
        } else {
            this.f12145k = strI;
            z = true;
        }
        f12135a.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(this.f12147m));
        e.d dVar2 = this.f12140f;
        if (dVar2 != null && (z || this.f12147m)) {
            dVar2.d();
        }
        this.f12147m = false;
    }

    @Override // c.f.a.c.f.q.c
    public final Bundle getConnectionHint() {
        Bundle bundle = this.w;
        if (bundle == null) {
            return super.getConnectionHint();
        }
        this.w = null;
        return bundle;
    }

    @Override // c.f.a.c.f.q.c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        f12135a.a("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.u, this.v);
        this.f12139e.P(bundle);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f12142h);
        Bundle bundle2 = this.f12143i;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        this.f12144j = new h0(this);
        bundle.putParcelable("listener", new BinderWrapper(this.f12144j.asBinder()));
        String str = this.u;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.v;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override // c.f.a.c.f.q.c, c.f.a.c.f.o.a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // c.f.a.c.f.q.c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    @Override // c.f.a.c.f.q.c
    public final String getStartServiceAction() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    public final void l(p0 p0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        c.f.a.c.d.d dVarT = p0Var.t();
        if (!a.f(dVarT, this.f12138d)) {
            this.f12138d = dVarT;
            this.f12140f.c(dVarT);
        }
        double dK = p0Var.K();
        if (Double.isNaN(dK) || Math.abs(dK - this.p) <= 1.0E-7d) {
            z = false;
        } else {
            this.p = dK;
            z = true;
        }
        boolean zL = p0Var.L();
        if (zL != this.f12146l) {
            this.f12146l = zL;
            z = true;
        }
        double dN = p0Var.N();
        if (!Double.isNaN(dN)) {
            this.y = dN;
        }
        b bVar = f12135a;
        bVar.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(this.f12148n));
        e.d dVar = this.f12140f;
        if (dVar != null && (z || this.f12148n)) {
            dVar.f();
        }
        int I = p0Var.I();
        if (I != this.r) {
            this.r = I;
            z2 = true;
        } else {
            z2 = false;
        }
        bVar.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(this.f12148n));
        e.d dVar2 = this.f12140f;
        if (dVar2 != null && (z2 || this.f12148n)) {
            dVar2.a(this.r);
        }
        int iJ = p0Var.J();
        if (iJ != this.s) {
            this.s = iJ;
            z3 = true;
        } else {
            z3 = false;
        }
        bVar.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(this.f12148n));
        e.d dVar3 = this.f12140f;
        if (dVar3 != null && (z3 || this.f12148n)) {
            dVar3.e(this.s);
        }
        if (!a.f(this.q, p0Var.M())) {
            this.q = p0Var.M();
        }
        this.f12148n = false;
    }

    public final void m(int i2) {
        synchronized (f12136b) {
            c.f.a.c.f.o.n.e<e.a> eVar = this.z;
            if (eVar != null) {
                eVar.a(new i0(new Status(i2)));
                this.z = null;
            }
        }
    }

    @Override // c.f.a.c.f.q.c
    public final void onConnectionFailed(c.f.a.c.f.b bVar) {
        super.onConnectionFailed(bVar);
        y();
    }

    @Override // c.f.a.c.f.q.c
    public final void onPostInitHandler(int i2, IBinder iBinder, Bundle bundle, int i3) {
        f12135a.a("in onPostInitHandler; statusCode=%d", Integer.valueOf(i2));
        if (i2 == 0 || i2 == 2300) {
            this.f12149o = true;
            this.f12147m = true;
            this.f12148n = true;
        } else {
            this.f12149o = false;
        }
        if (i2 == 2300) {
            Bundle bundle2 = new Bundle();
            this.w = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i2 = 0;
        }
        super.onPostInitHandler(i2, iBinder, bundle, i3);
    }

    public final void s(int i2) {
        synchronized (f12137c) {
            c.f.a.c.f.o.n.e<Status> eVar = this.A;
            if (eVar != null) {
                eVar.a(new Status(i2));
                this.A = null;
            }
        }
    }

    public final void u() {
        this.f12149o = false;
        this.r = -1;
        this.s = -1;
        this.f12138d = null;
        this.f12145k = null;
        this.p = 0.0d;
        this.y = z();
        this.f12146l = false;
        this.q = null;
    }

    public final void y() {
        f12135a.a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.f12141g) {
            this.f12141g.clear();
        }
    }

    public final double z() {
        if (this.f12139e.O(2048)) {
            return 0.02d;
        }
        return (!this.f12139e.O(4) || this.f12139e.O(1) || "Chromecast Audio".equals(this.f12139e.M())) ? 0.05d : 0.02d;
    }
}
