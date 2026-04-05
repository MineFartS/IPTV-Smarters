package c.f.a.c.k.b;

import android.os.Bundle;
import android.os.RemoteException;
import c.f.a.c.j.h.td;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v7 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f14393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ la f14395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f14396e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ td f14397f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u8 f14398g;

    public v7(u8 u8Var, String str, String str2, la laVar, boolean z, td tdVar) {
        this.f14398g = u8Var;
        this.f14393b = str;
        this.f14394c = str2;
        this.f14395d = laVar;
        this.f14396e = z;
        this.f14397f = tdVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e2;
        Bundle bundle2 = new Bundle();
        try {
            p3 p3Var = this.f14398g.f14364d;
            if (p3Var == null) {
                this.f14398g.f14413a.c().o().c("Failed to get user properties; not connected to service", this.f14393b, this.f14394c);
                this.f14398g.f14413a.G().W(this.f14397f, bundle2);
                return;
            }
            c.f.a.c.f.q.o.i(this.f14395d);
            List<aa> listG0 = p3Var.G0(this.f14393b, this.f14394c, this.f14396e, this.f14395d);
            bundle = new Bundle();
            if (listG0 != null) {
                for (aa aaVar : listG0) {
                    String str = aaVar.f13734f;
                    if (str != null) {
                        bundle.putString(aaVar.f13731c, str);
                    } else {
                        Long l2 = aaVar.f13733e;
                        if (l2 != null) {
                            bundle.putLong(aaVar.f13731c, l2.longValue());
                        } else {
                            Double d2 = aaVar.f13736h;
                            if (d2 != null) {
                                bundle.putDouble(aaVar.f13731c, d2.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    this.f14398g.D();
                    this.f14398g.f14413a.G().W(this.f14397f, bundle);
                } catch (Throwable th) {
                    th = th;
                    bundle2 = bundle;
                    this.f14398g.f14413a.G().W(this.f14397f, bundle2);
                    throw th;
                }
            } catch (RemoteException e3) {
                e2 = e3;
                this.f14398g.f14413a.c().o().c("Failed to get user properties; remote exception", this.f14393b, e2);
                this.f14398g.f14413a.G().W(this.f14397f, bundle);
            }
        } catch (RemoteException e4) {
            bundle = bundle2;
            e2 = e4;
        } catch (Throwable th2) {
            th = th2;
            this.f14398g.f14413a.G().W(this.f14397f, bundle2);
            throw th;
        }
    }
}
