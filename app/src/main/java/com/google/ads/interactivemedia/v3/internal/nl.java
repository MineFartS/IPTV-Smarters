package com.google.ads.interactivemedia.v3.internal;

import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nl implements anf, nw, qc, lh, oj, anp, abp, aiz, ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final akt f22524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final me f22525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mf f22526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nk f22527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray<nm> f22528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ali<nn> f22529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private lk f22530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22531h;

    public nl(akt aktVar) {
        this.f22524a = aktVar;
        this.f22529f = new ali<>(amn.y(), aktVar, new alg() { // from class: com.google.ads.interactivemedia.v3.internal.nj
            @Override // com.google.ads.interactivemedia.v3.internal.alg
            public final void a(Object obj, ala alaVar) {
            }
        });
        me meVar = new me();
        this.f22525b = meVar;
        this.f22526c = new mf();
        this.f22527d = new nk(meVar);
        this.f22528e = new SparseArray<>();
    }

    private final nm ac(abg abgVar) {
        ajr.b(this.f22530g);
        mg mgVarA = abgVar == null ? null : this.f22527d.a(abgVar);
        if (abgVar != null && mgVarA != null) {
            return Q(mgVarA, mgVarA.k(abgVar.f19056a, this.f22525b).f22396c, abgVar);
        }
        int iF = this.f22530g.f();
        mg mgVarN = this.f22530g.n();
        if (iF >= mgVarN.t()) {
            mgVarN = mg.f22416a;
        }
        return Q(mgVarN, iF, null);
    }

    private final nm ad(int i2, abg abgVar) {
        ajr.b(this.f22530g);
        if (abgVar != null) {
            return this.f22527d.a(abgVar) != null ? ac(abgVar) : Q(mg.f22416a, i2, abgVar);
        }
        mg mgVarN = this.f22530g.n();
        if (i2 >= mgVarN.t()) {
            mgVarN = mg.f22416a;
        }
        return Q(mgVarN, i2, null);
    }

    private final nm ae() {
        return ac(this.f22527d.d());
    }

    private final nm af() {
        return ac(this.f22527d.e());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final void A(pw pwVar) {
        nm nmVarAf = af();
        X(nmVarAf, 1008, new mv(nmVarAf, pwVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final void B(ke keVar, qa qaVar) {
        nm nmVarAf = af();
        X(nmVarAf, 1010, new mr(nmVarAf, keVar, qaVar, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final void C(final long j2) {
        final nm nmVarAf = af();
        X(nmVarAf, 1011, new alf() { // from class: com.google.ads.interactivemedia.v3.internal.mn
            @Override // com.google.ads.interactivemedia.v3.internal.alf
            public final void a(Object obj) {
                ((nn) obj).j();
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final void D(Exception exc) {
        nm nmVarAf = af();
        X(nmVarAf, 1018, new nb(nmVarAf, exc));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final void E(int i2, long j2, long j3) {
        nm nmVarAf = af();
        X(nmVarAf, 1012, new ml(nmVarAf, i2, j2, j3, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anp
    public final void F(int i2, long j2) {
        nm nmVarAe = ae();
        X(nmVarAe, 1023, new mp(nmVarAe, i2, j2, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anp
    public final void G(final Object obj, final long j2) {
        final nm nmVarAf = af();
        X(nmVarAf, 1027, new alf() { // from class: com.google.ads.interactivemedia.v3.internal.nc
            @Override // com.google.ads.interactivemedia.v3.internal.alf
            public final void a(Object obj2) {
                ((nn) obj2).R();
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.nw, com.google.ads.interactivemedia.v3.internal.oj
    public final void H(boolean z) {
        nm nmVarAf = af();
        X(nmVarAf, 1017, new ng(nmVarAf, z, 2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anp
    public final void I(Exception exc) {
        nm nmVarAf = af();
        X(nmVarAf, 1038, new nb(nmVarAf, exc, 3));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anp
    public final void J(String str, long j2, long j3) {
        nm nmVarAf = af();
        X(nmVarAf, 1021, new ne(nmVarAf, str, j3, j2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anp
    public final void K(String str) {
        nm nmVarAf = af();
        X(nmVarAf, 1024, new nd(nmVarAf, str));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anp
    public final void L(pw pwVar) {
        nm nmVarAe = ae();
        X(nmVarAe, 1025, new mv(nmVarAe, pwVar, 2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anp
    public final void M(pw pwVar) {
        nm nmVarAf = af();
        X(nmVarAf, 1020, new mv(nmVarAf, pwVar, 3));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anp
    public final void N(long j2, int i2) {
        nm nmVarAe = ae();
        X(nmVarAe, 1026, new mp(nmVarAe, j2, i2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anp
    public final void O(ke keVar, qa qaVar) {
        nm nmVarAf = af();
        X(nmVarAf, 1022, new mr(nmVarAf, keVar, qaVar));
    }

    public final nm P() {
        return ac(this.f22527d.b());
    }

    public final nm Q(mg mgVar, int i2, abg abgVar) {
        abg abgVar2 = true == mgVar.A() ? null : abgVar;
        long jA = this.f22524a.a();
        boolean z = mgVar.equals(this.f22530g.n()) && i2 == this.f22530g.f();
        long jA2 = 0;
        if (abgVar2 == null || !abgVar2.b()) {
            if (z) {
                jA2 = this.f22530g.h();
            } else if (!mgVar.A()) {
                jA2 = mgVar.z(i2, this.f22526c).a();
            }
        } else if (z && this.f22530g.c() == abgVar2.f19057b && this.f22530g.d() == abgVar2.f19058c) {
            jA2 = this.f22530g.i();
        }
        return new nm(jA, mgVar, i2, abgVar2, jA2, this.f22530g.n(), this.f22530g.f(), this.f22527d.b(), this.f22530g.i(), this.f22530g.k());
    }

    public final void R(nn nnVar) {
        ajr.b(nnVar);
        this.f22529f.b(nnVar);
    }

    public final /* synthetic */ void S(lk lkVar, nn nnVar, ala alaVar) {
        new pn(alaVar, this.f22528e);
        nnVar.z();
    }

    public final void T() {
        if (this.f22531h) {
            return;
        }
        nm nmVarP = P();
        this.f22531h = true;
        X(nmVarP, -1, new mo(nmVarP, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aiz
    public final void U(int i2, long j2, long j3) {
        nm nmVarAc = ac(this.f22527d.c());
        X(nmVarAc, 1006, new ml(nmVarAc, i2, j2, j3));
    }

    public final void V() {
        nm nmVarP = P();
        this.f22528e.put(1036, nmVarP);
        this.f22529f.i(new mo(nmVarP, 5));
    }

    public final void W(nn nnVar) {
        this.f22529f.f(nnVar);
    }

    public final void X(nm nmVar, int i2, alf<nn> alfVar) {
        this.f22528e.put(i2, nmVar);
        this.f22529f.g(i2, alfVar);
    }

    public final void Y(final lk lkVar, Looper looper) {
        boolean z = true;
        if (this.f22530g != null && !this.f22527d.f22519b.isEmpty()) {
            z = false;
        }
        ajr.f(z);
        this.f22530g = lkVar;
        this.f22529f = this.f22529f.a(looper, new alg() { // from class: com.google.ads.interactivemedia.v3.internal.ni
            @Override // com.google.ads.interactivemedia.v3.internal.alg
            public final void a(Object obj, ala alaVar) {
                this.f22515a.S(lkVar, (nn) obj, alaVar);
            }
        });
    }

    public final void Z(List<abg> list, abg abgVar) {
        nk nkVar = this.f22527d;
        lk lkVar = this.f22530g;
        ajr.b(lkVar);
        nkVar.h(list, abgVar, lkVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abp
    public final void a(int i2, abg abgVar, abc abcVar) {
        nm nmVarAd = ad(i2, abgVar);
        X(nmVarAd, 1004, new my(nmVarAd, abcVar, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qc
    public final /* synthetic */ void aa() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qc
    public final /* synthetic */ void ab() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abp
    public final void ag(int i2, abg abgVar, final aax aaxVar, final abc abcVar, final IOException iOException, final boolean z) {
        final nm nmVarAd = ad(i2, abgVar);
        X(nmVarAd, 1003, new alf() { // from class: com.google.ads.interactivemedia.v3.internal.mx
            @Override // com.google.ads.interactivemedia.v3.internal.alf
            public final void a(Object obj) {
                ((nn) obj).E();
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abp
    public final void ah(int i2, abg abgVar, aax aaxVar, abc abcVar) {
        nm nmVarAd = ad(i2, abgVar);
        X(nmVarAd, 1000, new mw(nmVarAd, aaxVar, abcVar, 2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anf
    public final /* synthetic */ void ai() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anf
    public final void aj(final int i2, final int i3) {
        final nm nmVarAf = af();
        X(nmVarAf, 1029, new alf() { // from class: com.google.ads.interactivemedia.v3.internal.mk
            @Override // com.google.ads.interactivemedia.v3.internal.alf
            public final void a(Object obj) {
                ((nn) obj).W();
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abp
    public final void ak(int i2, abg abgVar, abc abcVar) {
        nm nmVarAd = ad(i2, abgVar);
        X(nmVarAd, 1005, new my(nmVarAd, abcVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anf
    public final void al(final anq anqVar) {
        final nm nmVarAf = af();
        X(nmVarAf, 1028, new alf() { // from class: com.google.ads.interactivemedia.v3.internal.na
            @Override // com.google.ads.interactivemedia.v3.internal.alf
            public final void a(Object obj) {
                anq anqVar2 = anqVar;
                nn nnVar = (nn) obj;
                nnVar.ak();
                int i2 = anqVar2.f20262b;
                nnVar.aj();
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.anf
    public final /* synthetic */ void am(int i2, int i3, float f2) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abp
    public final void b(int i2, abg abgVar, aax aaxVar, abc abcVar) {
        nm nmVarAd = ad(i2, abgVar);
        X(nmVarAd, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, new mw(nmVarAd, aaxVar, abcVar, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abp
    public final void c(int i2, abg abgVar, aax aaxVar, abc abcVar) {
        nm nmVarAd = ad(i2, abgVar);
        X(nmVarAd, AdError.NO_FILL_ERROR_CODE, new mw(nmVarAd, aaxVar, abcVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final void d(Exception exc) {
        nm nmVarAf = af();
        X(nmVarAf, 1037, new nb(nmVarAf, exc, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final void e(String str, long j2, long j3) {
        nm nmVarAf = af();
        X(nmVarAf, 1009, new ne(nmVarAf, str, j3, j2, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final void f(String str) {
        nm nmVarAf = af();
        X(nmVarAf, 1013, new nd(nmVarAf, str, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final void g(boolean z) {
        nm nmVarP = P();
        X(nmVarP, 4, new ng(nmVarP, z, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final void h(boolean z) {
        nm nmVarP = P();
        X(nmVarP, 8, new ng(nmVarP, z));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final void i(final kn knVar, final int i2) {
        final nm nmVarP = P();
        X(nmVarP, 1, new alf() { // from class: com.google.ads.interactivemedia.v3.internal.ms
            @Override // com.google.ads.interactivemedia.v3.internal.alf
            public final void a(Object obj) {
                ((nn) obj).H();
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final void j(final kp kpVar) {
        final nm nmVarP = P();
        X(nmVarP, 15, new alf() { // from class: com.google.ads.interactivemedia.v3.internal.mt
            @Override // com.google.ads.interactivemedia.v3.internal.alf
            public final void a(Object obj) {
                ((nn) obj).I();
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final void k(boolean z, int i2) {
        nm nmVarP = P();
        X(nmVarP, 6, new nh(nmVarP, z, i2, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final void l(final le leVar) {
        final nm nmVarP = P();
        X(nmVarP, 13, new alf() { // from class: com.google.ads.interactivemedia.v3.internal.mu
            @Override // com.google.ads.interactivemedia.v3.internal.alf
            public final void a(Object obj) {
                ((nn) obj).K();
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final void m(int i2) {
        nm nmVarP = P();
        X(nmVarP, 5, new mj(nmVarP, i2, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final void n(int i2) {
        nm nmVarP = P();
        X(nmVarP, 7, new mj(nmVarP, i2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final void o(final jb jbVar) {
        abf abfVar = jbVar.f22042f;
        final nm nmVarAc = abfVar != null ? ac(new abg(abfVar)) : P();
        X(nmVarAc, 11, new alf() { // from class: com.google.ads.interactivemedia.v3.internal.mq
            @Override // com.google.ads.interactivemedia.v3.internal.alf
            public final void a(Object obj) {
                ((nn) obj).a(nmVarAc, jbVar);
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final void p(boolean z, int i2) {
        nm nmVarP = P();
        X(nmVarP, -1, new nh(nmVarP, z, i2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final void q(final lj ljVar, final lj ljVar2, final int i2) {
        if (i2 == 1) {
            this.f22531h = false;
            i2 = 1;
        }
        nk nkVar = this.f22527d;
        lk lkVar = this.f22530g;
        ajr.b(lkVar);
        nkVar.g(lkVar);
        final nm nmVarP = P();
        X(nmVarP, 12, new alf() { // from class: com.google.ads.interactivemedia.v3.internal.mm
            @Override // com.google.ads.interactivemedia.v3.internal.alf
            public final void a(Object obj) {
                int i3 = i2;
                nn nnVar = (nn) obj;
                nnVar.P();
                nnVar.Q(i3);
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final void r() {
        nm nmVarP = P();
        X(nmVarP, -1, new mo(nmVarP, 4));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final void s(final List<ys> list) {
        final nm nmVarP = P();
        X(nmVarP, 3, new alf() { // from class: com.google.ads.interactivemedia.v3.internal.nf
            @Override // com.google.ads.interactivemedia.v3.internal.alf
            public final void a(Object obj) {
                ((nn) obj).V();
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final void t(final act actVar, final aim aimVar) {
        final nm nmVarP = P();
        X(nmVarP, 2, new alf() { // from class: com.google.ads.interactivemedia.v3.internal.mz
            @Override // com.google.ads.interactivemedia.v3.internal.alf
            public final void a(Object obj) {
                ((nn) obj).Y();
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void u() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void v() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void w() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final /* synthetic */ void x() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lh
    public final void y(int i2) {
        nk nkVar = this.f22527d;
        lk lkVar = this.f22530g;
        ajr.b(lkVar);
        nkVar.i(lkVar);
        nm nmVarP = P();
        X(nmVarP, 0, new mj(nmVarP, i2, 2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.oj
    public final void z(pw pwVar) {
        nm nmVarAe = ae();
        X(nmVarAe, 1014, new mv(nmVarAe, pwVar, 1));
    }
}
