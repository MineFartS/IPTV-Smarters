package c.f.a.c.k.b;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g5 {
    public long A;
    public long B;
    public String C;
    public boolean D;
    public long E;
    public long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5 f13903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f13908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f13909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f13910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f13911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f13912j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f13913k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f13914l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f13915m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f13916n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13917o;
    public long p;
    public boolean q;
    public String r;
    public Boolean s;
    public long t;
    public List<String> u;
    public String v;
    public long w;
    public long x;
    public long y;
    public long z;

    public g5(c5 c5Var, String str) {
        c.f.a.c.f.q.o.i(c5Var);
        c.f.a.c.f.q.o.e(str);
        this.f13903a = c5Var;
        this.f13904b = str;
        c5Var.d().g();
    }

    public final boolean A() {
        this.f13903a.d().g();
        return this.D;
    }

    public final String B() {
        this.f13903a.d().g();
        return this.C;
    }

    public final String C() {
        this.f13903a.d().g();
        String str = this.C;
        D(null);
        return str;
    }

    public final void D(String str) {
        this.f13903a.d().g();
        this.D |= !ea.G(this.C, str);
        this.C = str;
    }

    public final long E() {
        this.f13903a.d().g();
        return this.p;
    }

    public final void F(long j2) {
        this.f13903a.d().g();
        this.D |= this.p != j2;
        this.p = j2;
    }

    public final boolean G() {
        this.f13903a.d().g();
        return this.q;
    }

    public final void H(boolean z) {
        this.f13903a.d().g();
        this.D |= this.q != z;
        this.q = z;
    }

    public final Boolean I() {
        this.f13903a.d().g();
        return this.s;
    }

    public final void J(Boolean bool) {
        this.f13903a.d().g();
        boolean z = this.D;
        Boolean bool2 = this.s;
        int i2 = ea.f13852e;
        this.D = z | (!((bool2 == null && bool == null) ? true : bool2 == null ? false : bool2.equals(bool)));
        this.s = bool;
    }

    public final List<String> K() {
        this.f13903a.d().g();
        return this.u;
    }

    public final void L(List<String> list) {
        this.f13903a.d().g();
        List<String> list2 = this.u;
        int i2 = ea.f13852e;
        if (list2 == null && list == null) {
            return;
        }
        if (list2 != null && list2.equals(list)) {
            return;
        }
        this.D = true;
        this.u = list != null ? new ArrayList(list) : null;
    }

    public final void M() {
        this.f13903a.d().g();
        this.D = false;
    }

    public final String N() {
        this.f13903a.d().g();
        return this.f13904b;
    }

    public final String O() {
        this.f13903a.d().g();
        return this.f13905c;
    }

    public final void P(String str) {
        this.f13903a.d().g();
        this.D |= !ea.G(this.f13905c, str);
        this.f13905c = str;
    }

    public final String Q() {
        this.f13903a.d().g();
        return this.f13906d;
    }

    public final void R(String str) {
        this.f13903a.d().g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ ea.G(this.f13906d, str);
        this.f13906d = str;
    }

    public final String S() {
        this.f13903a.d().g();
        return this.r;
    }

    public final void T(String str) {
        this.f13903a.d().g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ ea.G(this.r, str);
        this.r = str;
    }

    public final String U() {
        this.f13903a.d().g();
        return this.v;
    }

    public final void V(String str) {
        this.f13903a.d().g();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.D |= true ^ ea.G(this.v, str);
        this.v = str;
    }

    public final String W() {
        this.f13903a.d().g();
        return this.f13907e;
    }

    public final void X(String str) {
        this.f13903a.d().g();
        this.D |= !ea.G(this.f13907e, str);
        this.f13907e = str;
    }

    public final String Y() {
        this.f13903a.d().g();
        return this.f13908f;
    }

    public final void Z(String str) {
        this.f13903a.d().g();
        this.D |= !ea.G(this.f13908f, str);
        this.f13908f = str;
    }

    public final void a(long j2) {
        this.f13903a.d().g();
        this.D |= this.f13915m != j2;
        this.f13915m = j2;
    }

    public final long a0() {
        this.f13903a.d().g();
        return this.f13910h;
    }

    public final long b() {
        this.f13903a.d().g();
        return this.f13916n;
    }

    public final void b0(long j2) {
        this.f13903a.d().g();
        this.D |= this.f13910h != j2;
        this.f13910h = j2;
    }

    public final void c(long j2) {
        this.f13903a.d().g();
        this.D |= this.f13916n != j2;
        this.f13916n = j2;
    }

    public final long c0() {
        this.f13903a.d().g();
        return this.f13911i;
    }

    public final long d() {
        this.f13903a.d().g();
        return this.t;
    }

    public final void d0(long j2) {
        this.f13903a.d().g();
        this.D |= this.f13911i != j2;
        this.f13911i = j2;
    }

    public final void e(long j2) {
        this.f13903a.d().g();
        this.D |= this.t != j2;
        this.t = j2;
    }

    public final String e0() {
        this.f13903a.d().g();
        return this.f13912j;
    }

    public final boolean f() {
        this.f13903a.d().g();
        return this.f13917o;
    }

    public final void f0(String str) {
        this.f13903a.d().g();
        this.D |= !ea.G(this.f13912j, str);
        this.f13912j = str;
    }

    public final void g(boolean z) {
        this.f13903a.d().g();
        this.D |= this.f13917o != z;
        this.f13917o = z;
    }

    public final long g0() {
        this.f13903a.d().g();
        return this.f13913k;
    }

    public final void h(long j2) {
        c.f.a.c.f.q.o.a(j2 >= 0);
        this.f13903a.d().g();
        this.D = (this.f13909g != j2) | this.D;
        this.f13909g = j2;
    }

    public final void h0(long j2) {
        this.f13903a.d().g();
        this.D |= this.f13913k != j2;
        this.f13913k = j2;
    }

    public final long i() {
        this.f13903a.d().g();
        return this.f13909g;
    }

    public final String i0() {
        this.f13903a.d().g();
        return this.f13914l;
    }

    public final long j() {
        this.f13903a.d().g();
        return this.E;
    }

    public final void j0(String str) {
        this.f13903a.d().g();
        this.D |= !ea.G(this.f13914l, str);
        this.f13914l = str;
    }

    public final void k(long j2) {
        this.f13903a.d().g();
        this.D |= this.E != j2;
        this.E = j2;
    }

    public final long k0() {
        this.f13903a.d().g();
        return this.f13915m;
    }

    public final long l() {
        this.f13903a.d().g();
        return this.F;
    }

    public final void m(long j2) {
        this.f13903a.d().g();
        this.D |= this.F != j2;
        this.F = j2;
    }

    public final void n() {
        this.f13903a.d().g();
        long j2 = this.f13909g + 1;
        if (j2 > 2147483647L) {
            this.f13903a.c().r().b("Bundle index overflow. appId", y3.x(this.f13904b));
            j2 = 0;
        }
        this.D = true;
        this.f13909g = j2;
    }

    public final long o() {
        this.f13903a.d().g();
        return this.w;
    }

    public final void p(long j2) {
        this.f13903a.d().g();
        this.D |= this.w != j2;
        this.w = j2;
    }

    public final long q() {
        this.f13903a.d().g();
        return this.x;
    }

    public final void r(long j2) {
        this.f13903a.d().g();
        this.D |= this.x != j2;
        this.x = j2;
    }

    public final long s() {
        this.f13903a.d().g();
        return this.y;
    }

    public final void t(long j2) {
        this.f13903a.d().g();
        this.D |= this.y != j2;
        this.y = j2;
    }

    public final long u() {
        this.f13903a.d().g();
        return this.z;
    }

    public final void v(long j2) {
        this.f13903a.d().g();
        this.D |= this.z != j2;
        this.z = j2;
    }

    public final long w() {
        this.f13903a.d().g();
        return this.B;
    }

    public final void x(long j2) {
        this.f13903a.d().g();
        this.D |= this.B != j2;
        this.B = j2;
    }

    public final long y() {
        this.f13903a.d().g();
        return this.A;
    }

    public final void z(long j2) {
        this.f13903a.d().g();
        this.D |= this.A != j2;
        this.A = j2;
    }
}
