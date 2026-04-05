package c.f.a.c.k.b;

import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes2.dex */
public final class ta extends sa {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.f.a.c.j.h.t0 f14334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ua f14335h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(ua uaVar, String str, int i2, c.f.a.c.j.h.t0 t0Var) {
        super(str, i2);
        this.f14335h = uaVar;
        this.f14334g = t0Var;
    }

    @Override // c.f.a.c.k.b.sa
    public final int a() {
        return this.f14334g.x();
    }

    @Override // c.f.a.c.k.b.sa
    public final boolean b() {
        return true;
    }

    @Override // c.f.a.c.k.b.sa
    public final boolean c() {
        return false;
    }

    public final boolean k(Long l2, Long l3, c.f.a.c.j.h.j2 j2Var, boolean z) {
        w3 w3VarR;
        String strR;
        String str;
        Boolean boolF;
        c.f.a.c.j.h.ta.a();
        boolean zW = this.f14335h.f14413a.z().w(this.f14304a, m3.a0);
        boolean zA = this.f14334g.A();
        boolean zB = this.f14334g.B();
        boolean zD = this.f14334g.D();
        boolean z2 = zA || zB || zD;
        Boolean boolE = null;
        boolE = null;
        if (z && !z2) {
            this.f14335h.f14413a.c().w().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f14305b), this.f14334g.w() ? Integer.valueOf(this.f14334g.x()) : null);
            return true;
        }
        c.f.a.c.j.h.l0 l0VarZ = this.f14334g.z();
        boolean zB2 = l0VarZ.B();
        if (j2Var.B()) {
            if (l0VarZ.y()) {
                boolF = sa.g(j2Var.C(), l0VarZ.z());
                boolE = sa.e(boolF, zB2);
            } else {
                w3VarR = this.f14335h.f14413a.c().r();
                strR = this.f14335h.f14413a.H().r(j2Var.y());
                str = "No number filter for long property. property";
                w3VarR.b(str, strR);
            }
        } else if (!j2Var.D()) {
            if (j2Var.z()) {
                if (l0VarZ.w()) {
                    boolF = sa.f(j2Var.A(), l0VarZ.x(), this.f14335h.f14413a.c());
                } else if (!l0VarZ.y()) {
                    w3VarR = this.f14335h.f14413a.c().r();
                    strR = this.f14335h.f14413a.H().r(j2Var.y());
                    str = "No string or number filter defined. property";
                } else if (z9.B(j2Var.A())) {
                    boolF = sa.i(j2Var.A(), l0VarZ.z());
                } else {
                    this.f14335h.f14413a.c().r().c("Invalid user property value for Numeric number filter. property, value", this.f14335h.f14413a.H().r(j2Var.y()), j2Var.A());
                }
                boolE = sa.e(boolF, zB2);
            } else {
                w3VarR = this.f14335h.f14413a.c().r();
                strR = this.f14335h.f14413a.H().r(j2Var.y());
                str = "User property has no value, property";
            }
            w3VarR.b(str, strR);
        } else if (l0VarZ.y()) {
            boolF = sa.h(j2Var.E(), l0VarZ.z());
            boolE = sa.e(boolF, zB2);
        } else {
            w3VarR = this.f14335h.f14413a.c().r();
            strR = this.f14335h.f14413a.H().r(j2Var.y());
            str = "No number filter for double property. property";
            w3VarR.b(str, strR);
        }
        this.f14335h.f14413a.c().w().b("Property filter result", boolE == null ? Constants.NULL_VERSION_ID : boolE);
        if (boolE == null) {
            return false;
        }
        this.f14306c = Boolean.TRUE;
        if (zD && !boolE.booleanValue()) {
            return true;
        }
        if (!z || this.f14334g.A()) {
            this.f14307d = boolE;
        }
        if (boolE.booleanValue() && z2 && j2Var.w()) {
            long jX = j2Var.x();
            if (l2 != null) {
                jX = l2.longValue();
            }
            if (zW && this.f14334g.A() && !this.f14334g.B() && l3 != null) {
                jX = l3.longValue();
            }
            if (this.f14334g.B()) {
                this.f14309f = Long.valueOf(jX);
            } else {
                this.f14308e = Long.valueOf(jX);
            }
        }
        return true;
    }
}
