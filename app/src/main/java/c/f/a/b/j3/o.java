package c.f.a.b.j3;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.widget.TextView;
import c.f.a.b.a2;
import c.f.a.b.b2;
import c.f.a.b.c2;
import c.f.a.b.e3.a1;
import c.f.a.b.k1;
import c.f.a.b.n2;
import c.f.a.b.p1;
import c.f.a.b.p2;
import c.f.a.b.q1;
import c.f.a.b.x1;
import c.f.a.b.z1;
import java.util.List;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class o implements a2.e, Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n2 f9233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f9234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9235d;

    public o(n2 n2Var, TextView textView) {
        g.a(n2Var.H() == Looper.getMainLooper());
        this.f9233b = n2Var;
        this.f9234c = textView;
    }

    public static String j(c.f.a.b.v2.d dVar) {
        if (dVar == null) {
            return BuildConfig.FLAVOR;
        }
        dVar.c();
        return " sib:" + dVar.f10267d + " sb:" + dVar.f10269f + " rb:" + dVar.f10268e + " db:" + dVar.f10270g + " mcdb:" + dVar.f10271h + " dk:" + dVar.f10272i;
    }

    public static String k(float f2) {
        if (f2 == -1.0f || f2 == 1.0f) {
            return BuildConfig.FLAVOR;
        }
        return " par:" + String.format(Locale.US, "%.02f", Float.valueOf(f2));
    }

    public static String n(long j2, int i2) {
        if (i2 == 0) {
            return "N/A";
        }
        double d2 = j2;
        double d3 = i2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return String.valueOf((long) (d2 / d3));
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void C(boolean z) {
        c2.u(this, z);
    }

    @Override // c.f.a.b.b3.f
    public /* synthetic */ void D(c.f.a.b.b3.a aVar) {
        c2.k(this, aVar);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void E(a2 a2Var, a2.d dVar) {
        c2.f(this, a2Var, dVar);
    }

    @Override // c.f.a.b.w2.c
    public /* synthetic */ void G(int i2, boolean z) {
        c2.e(this, i2, z);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void H(boolean z, int i2) {
        b2.k(this, z, i2);
    }

    @Override // c.f.a.b.t2.r
    public /* synthetic */ void J(c.f.a.b.t2.p pVar) {
        c2.a(this, pVar);
    }

    @Override // c.f.a.b.k3.b0
    public /* synthetic */ void L(int i2, int i3, int i4, float f2) {
        c.f.a.b.k3.a0.a(this, i2, i3, i4, f2);
    }

    @Override // c.f.a.b.k3.b0
    public /* synthetic */ void N() {
        c2.s(this);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void O(p1 p1Var, int i2) {
        c2.i(this, p1Var, i2);
    }

    @Override // c.f.a.b.f3.l
    public /* synthetic */ void Q(List list) {
        c2.c(this, list);
    }

    @Override // c.f.a.b.a2.c
    public final void Z(boolean z, int i2) {
        w();
    }

    @Override // c.f.a.b.t2.r
    public /* synthetic */ void a(boolean z) {
        c2.v(this, z);
    }

    @Override // c.f.a.b.k3.b0
    public /* synthetic */ void b(c.f.a.b.k3.e0 e0Var) {
        c2.z(this, e0Var);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void b0(a1 a1Var, c.f.a.b.g3.l lVar) {
        c2.y(this, a1Var, lVar);
    }

    public String c() {
        k1 k1VarY0 = this.f9233b.Y0();
        c.f.a.b.v2.d dVarX0 = this.f9233b.X0();
        if (k1VarY0 == null || dVarX0 == null) {
            return BuildConfig.FLAVOR;
        }
        return "\n" + k1VarY0.f9338m + "(id:" + k1VarY0.f9327b + " hz:" + k1VarY0.A + " ch:" + k1VarY0.z + j(dVarX0) + ")";
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void d(z1 z1Var) {
        c2.m(this, z1Var);
    }

    @Override // c.f.a.b.k3.b0
    public /* synthetic */ void d0(int i2, int i3) {
        c2.w(this, i2, i3);
    }

    public String e() {
        return m() + o() + c();
    }

    @Override // c.f.a.b.a2.c
    public final void f(a2.f fVar, a2.f fVar2, int i2) {
        w();
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void g(int i2) {
        c2.o(this, i2);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void h(boolean z) {
        b2.d(this, z);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void h0(x1 x1Var) {
        c2.q(this, x1Var);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void i(int i2) {
        b2.l(this, i2);
    }

    @Override // c.f.a.b.w2.c
    public /* synthetic */ void k0(c.f.a.b.w2.b bVar) {
        c2.d(this, bVar);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void l(List list) {
        b2.q(this, list);
    }

    public String m() {
        int playbackState = this.f9233b.getPlaybackState();
        return String.format("playWhenReady:%s playbackState:%s window:%s", Boolean.valueOf(this.f9233b.i()), playbackState != 1 ? playbackState != 2 ? playbackState != 3 ? playbackState != 4 ? "unknown" : "ended" : "ready" : "buffering" : "idle", Integer.valueOf(this.f9233b.s()));
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void m0(boolean z) {
        c2.h(this, z);
    }

    public String o() {
        k1 k1VarC1 = this.f9233b.c1();
        c.f.a.b.v2.d dVarB1 = this.f9233b.b1();
        if (k1VarC1 == null || dVarB1 == null) {
            return BuildConfig.FLAVOR;
        }
        return "\n" + k1VarC1.f9338m + "(id:" + k1VarC1.f9327b + " r:" + k1VarC1.r + "x" + k1VarC1.s + k(k1VarC1.v) + j(dVarB1) + " vfpo: " + n(dVarB1.f10273j, dVarB1.f10274k) + ")";
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void onRepeatModeChanged(int i2) {
        c2.t(this, i2);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void p(boolean z) {
        c2.g(this, z);
    }

    public final void q() {
        if (this.f9235d) {
            return;
        }
        this.f9235d = true;
        this.f9233b.y(this);
        w();
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void r() {
        b2.o(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        w();
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void s(x1 x1Var) {
        c2.p(this, x1Var);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void t(a2.b bVar) {
        c2.b(this, bVar);
    }

    public final void u() {
        try {
            if (this.f9235d) {
                this.f9235d = false;
                this.f9233b.p(this);
                this.f9234c.removeCallbacks(this);
            }
        } catch (Exception unused) {
        }
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void v(p2 p2Var, int i2) {
        c2.x(this, p2Var, i2);
    }

    @SuppressLint({"SetTextI18n"})
    public final void w() {
        try {
            this.f9234c.setText(e());
            this.f9234c.removeCallbacks(this);
            this.f9234c.postDelayed(this, 1000L);
        } catch (Exception unused) {
        }
    }

    @Override // c.f.a.b.a2.c
    public final void x(int i2) {
        w();
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void z(q1 q1Var) {
        c2.j(this, q1Var);
    }
}
