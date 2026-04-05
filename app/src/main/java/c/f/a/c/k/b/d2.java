package c.f.a.c.k.b;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d2 extends e3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Long> f13815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, Integer> f13816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13817d;

    public d2(c5 c5Var) {
        super(c5Var);
        this.f13816c = new a.f.a();
        this.f13815b = new a.f.a();
    }

    public static /* synthetic */ void k(d2 d2Var, String str, long j2) {
        d2Var.g();
        c.f.a.c.f.q.o.e(str);
        if (d2Var.f13816c.isEmpty()) {
            d2Var.f13817d = j2;
        }
        Integer num = d2Var.f13816c.get(str);
        if (num != null) {
            d2Var.f13816c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (d2Var.f13816c.size() >= 100) {
            d2Var.f14413a.c().r().a("Too many ads visible");
        } else {
            d2Var.f13816c.put(str, 1);
            d2Var.f13815b.put(str, Long.valueOf(j2));
        }
    }

    public static /* synthetic */ void l(d2 d2Var, String str, long j2) {
        d2Var.g();
        c.f.a.c.f.q.o.e(str);
        Integer num = d2Var.f13816c.get(str);
        if (num == null) {
            d2Var.f14413a.c().o().b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        n7 n7VarS = d2Var.f14413a.Q().s(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            d2Var.f13816c.put(str, Integer.valueOf(iIntValue));
            return;
        }
        d2Var.f13816c.remove(str);
        Long l2 = d2Var.f13815b.get(str);
        if (l2 == null) {
            d2Var.f14413a.c().o().a("First ad unit exposure time was never set");
        } else {
            long jLongValue = l2.longValue();
            d2Var.f13815b.remove(str);
            d2Var.p(str, j2 - jLongValue, n7VarS);
        }
        if (d2Var.f13816c.isEmpty()) {
            long j3 = d2Var.f13817d;
            if (j3 == 0) {
                d2Var.f14413a.c().o().a("First ad exposure time was never set");
            } else {
                d2Var.o(j2 - j3, n7VarS);
                d2Var.f13817d = 0L;
            }
        }
    }

    public final void h(String str, long j2) {
        if (str == null || str.length() == 0) {
            this.f14413a.c().o().a("Ad unit id must be a non-empty string");
        } else {
            this.f14413a.d().r(new a(this, str, j2));
        }
    }

    public final void i(String str, long j2) {
        if (str == null || str.length() == 0) {
            this.f14413a.c().o().a("Ad unit id must be a non-empty string");
        } else {
            this.f14413a.d().r(new b0(this, str, j2));
        }
    }

    public final void j(long j2) {
        n7 n7VarS = this.f14413a.Q().s(false);
        for (String str : this.f13815b.keySet()) {
            p(str, j2 - this.f13815b.get(str).longValue(), n7VarS);
        }
        if (!this.f13815b.isEmpty()) {
            o(j2 - this.f13817d, n7VarS);
        }
        q(j2);
    }

    public final void o(long j2, n7 n7Var) {
        if (n7Var == null) {
            this.f14413a.c().w().a("Not logging ad exposure. No active activity");
            return;
        }
        if (j2 < 1000) {
            this.f14413a.c().w().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j2);
        u7.x(n7Var, bundle, true);
        this.f14413a.F().X("am", "_xa", bundle);
    }

    public final void p(String str, long j2, n7 n7Var) {
        if (n7Var == null) {
            this.f14413a.c().w().a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j2 < 1000) {
            this.f14413a.c().w().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j2));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j2);
        u7.x(n7Var, bundle, true);
        this.f14413a.F().X("am", "_xu", bundle);
    }

    public final void q(long j2) {
        Iterator<String> it = this.f13815b.keySet().iterator();
        while (it.hasNext()) {
            this.f13815b.put(it.next(), Long.valueOf(j2));
        }
        if (this.f13815b.isEmpty()) {
            return;
        }
        this.f13817d = j2;
    }
}
