package c.f.a.c.f.o.n;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import c.f.a.c.f.o.a;
import c.f.a.c.f.o.f;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 extends c.f.a.c.m.b.d implements f.a, f.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.AbstractC0156a<? extends c.f.a.c.m.g, c.f.a.c.m.a> f12533b = c.f.a.c.m.f.f14544c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f12534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f12535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a.AbstractC0156a<? extends c.f.a.c.m.g, c.f.a.c.m.a> f12536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<Scope> f12537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.f.a.c.f.q.d f12538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c.f.a.c.m.g f12539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y0 f12540i;

    public z0(Context context, Handler handler, c.f.a.c.f.q.d dVar) {
        a.AbstractC0156a<? extends c.f.a.c.m.g, c.f.a.c.m.a> abstractC0156a = f12533b;
        this.f12534c = context;
        this.f12535d = handler;
        this.f12538g = (c.f.a.c.f.q.d) c.f.a.c.f.q.o.j(dVar, "ClientSettings must not be null");
        this.f12537f = dVar.e();
        this.f12536e = abstractC0156a;
    }

    public static /* synthetic */ void L2(z0 z0Var, c.f.a.c.m.b.l lVar) {
        c.f.a.c.f.b bVarI = lVar.I();
        if (bVarI.M()) {
            c.f.a.c.f.q.l0 l0Var = (c.f.a.c.f.q.l0) c.f.a.c.f.q.o.i(lVar.J());
            bVarI = l0Var.J();
            if (bVarI.M()) {
                z0Var.f12540i.b(l0Var.I(), z0Var.f12537f);
            } else {
                String strValueOf = String.valueOf(bVarI);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(strValueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
                z0Var.f12540i.c(bVarI);
            }
        } else {
            z0Var.f12540i.c(bVarI);
        }
        z0Var.f12539h.disconnect();
    }

    public final void I2() {
        c.f.a.c.m.g gVar = this.f12539h;
        if (gVar != null) {
            gVar.disconnect();
        }
    }

    @Override // c.f.a.c.m.b.f
    public final void b0(c.f.a.c.m.b.l lVar) {
        this.f12535d.post(new x0(this, lVar));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [c.f.a.c.f.o.a$f, c.f.a.c.m.g] */
    public final void c1(y0 y0Var) {
        c.f.a.c.m.g gVar = this.f12539h;
        if (gVar != null) {
            gVar.disconnect();
        }
        this.f12538g.i(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0156a<? extends c.f.a.c.m.g, c.f.a.c.m.a> abstractC0156a = this.f12536e;
        Context context = this.f12534c;
        Looper looper = this.f12535d.getLooper();
        c.f.a.c.f.q.d dVar = this.f12538g;
        this.f12539h = abstractC0156a.buildClient(context, looper, dVar, dVar.g(), (f.a) this, (f.b) this);
        this.f12540i = y0Var;
        Set<Scope> set = this.f12537f;
        if (set == null || set.isEmpty()) {
            this.f12535d.post(new w0(this));
        } else {
            this.f12539h.b();
        }
    }

    @Override // c.f.a.c.f.o.n.f
    public final void onConnected(Bundle bundle) {
        this.f12539h.c(this);
    }

    @Override // c.f.a.c.f.o.n.m
    public final void onConnectionFailed(c.f.a.c.f.b bVar) {
        this.f12540i.c(bVar);
    }

    @Override // c.f.a.c.f.o.n.f
    public final void onConnectionSuspended(int i2) {
        this.f12539h.disconnect();
    }
}
