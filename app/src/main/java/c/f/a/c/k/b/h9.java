package c.f.a.c.k.b;

import android.os.Bundle;
import c.f.a.c.j.h.gb;
import c.f.a.c.j.h.jb;

/* JADX INFO: loaded from: classes2.dex */
public final class h9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f13954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k9 f13955d;

    public h9(k9 k9Var) {
        this.f13955d = k9Var;
        this.f13954c = new g9(this, k9Var.f14413a);
        long jB = k9Var.f14413a.a().b();
        this.f13952a = jB;
        this.f13953b = jB;
    }

    public final void a(long j2) {
        this.f13955d.g();
        this.f13954c.d();
        this.f13952a = j2;
        this.f13953b = j2;
    }

    public final void b(long j2) {
        this.f13954c.d();
    }

    public final void c() {
        this.f13954c.d();
        this.f13952a = 0L;
        this.f13953b = 0L;
    }

    public final boolean d(boolean z, boolean z2, long j2) {
        this.f13955d.g();
        this.f13955d.i();
        gb.a();
        if (!this.f13955d.f14413a.z().w(null, m3.q0) || this.f13955d.f14413a.k()) {
            this.f13955d.f14413a.A().u.b(this.f13955d.f14413a.a().a());
        }
        long jE = j2 - this.f13952a;
        if (!z && jE < 1000) {
            this.f13955d.f14413a.c().w().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(jE));
            return false;
        }
        if (!z2) {
            jb.a();
            if (this.f13955d.f14413a.z().w(null, m3.V)) {
                jE = j2 - this.f13953b;
                this.f13953b = j2;
            } else {
                jE = e();
            }
        }
        this.f13955d.f14413a.c().w().b("Recording user engagement, ms", Long.valueOf(jE));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", jE);
        u7.x(this.f13955d.f14413a.Q().s(!this.f13955d.f14413a.z().C()), bundle, true);
        f fVarZ = this.f13955d.f14413a.z();
        l3<Boolean> l3Var = m3.U;
        if (!fVarZ.w(null, l3Var) && z2) {
            bundle.putLong("_fr", 1L);
        }
        if (!this.f13955d.f14413a.z().w(null, l3Var) || !z2) {
            this.f13955d.f14413a.F().X("auto", "_e", bundle);
        }
        this.f13952a = j2;
        this.f13954c.d();
        this.f13954c.b(3600000L);
        return true;
    }

    public final long e() {
        long jB = this.f13955d.f14413a.a().b();
        long j2 = this.f13953b;
        this.f13953b = jB;
        return jB - j2;
    }
}
