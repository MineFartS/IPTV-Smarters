package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class abz implements abe, rm, akc, akg, aci {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, String> f19112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ke f19113c;
    private boolean A;
    private boolean C;
    private boolean D;
    private int E;
    private long G;
    private boolean I;
    private int J;
    private boolean K;
    private boolean L;
    private final ajm M;
    private final ajr N;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Uri f19114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ajh f19115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final qq f19116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final abo f19117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final qk f19118h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final abv f19119i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final abr f19122l;
    private abd q;
    private zc r;
    private boolean u;
    private boolean v;
    private boolean w;
    private aby x;
    private sc y;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f19120j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final akj f19121k = new akj("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final akv f19123m = new akv();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f19124n = new abs(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Runnable f19125o = new abs(this, 1);
    private final Handler p = amn.v();
    private abx[] t = new abx[0];
    private acj[] s = new acj[0];
    private long H = -9223372036854775807L;
    private long F = -1;
    private long z = -9223372036854775807L;
    private int B = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f19112b = Collections.unmodifiableMap(map);
        kd kdVar = new kd();
        kdVar.S("icy");
        kdVar.ae("application/x-icy");
        f19113c = kdVar.s();
    }

    public abz(Uri uri, ajh ajhVar, abr abrVar, qq qqVar, qk qkVar, ajr ajrVar, abo aboVar, abv abvVar, ajm ajmVar, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f19114d = uri;
        this.f19115e = ajhVar;
        this.f19116f = qqVar;
        this.f19118h = qkVar;
        this.N = ajrVar;
        this.f19117g = aboVar;
        this.f19119i = abvVar;
        this.M = ajmVar;
        this.f19122l = abrVar;
    }

    private final int J() {
        int iJ = 0;
        for (acj acjVar : this.s) {
            iJ += acjVar.j();
        }
        return iJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long K() {
        long jMax = Long.MIN_VALUE;
        for (acj acjVar : this.s) {
            jMax = Math.max(jMax, acjVar.o());
        }
        return jMax;
    }

    private final sf L(abx abxVar) {
        int length = this.s.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (abxVar.equals(this.t[i2])) {
                return this.s[i2];
            }
        }
        acj acjVarL = acj.L(this.M, this.p.getLooper(), this.f19116f, this.f19118h);
        acjVarL.D(this);
        int i3 = length + 1;
        abx[] abxVarArr = (abx[]) Arrays.copyOf(this.t, i3);
        abxVarArr[length] = abxVar;
        this.t = (abx[]) amn.Y(abxVarArr);
        acj[] acjVarArr = (acj[]) Arrays.copyOf(this.s, i3);
        acjVarArr[length] = acjVarL;
        this.s = (acj[]) amn.Y(acjVarArr);
        return acjVarL;
    }

    private final void M() {
        ajr.f(this.v);
        ajr.b(this.x);
        ajr.b(this.y);
    }

    private final void N(abu abuVar) {
        if (this.F == -1) {
            this.F = abuVar.f19101m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        if (this.L || this.v || !this.u || this.y == null) {
            return;
        }
        for (acj acjVar : this.s) {
            if (acjVar.r() == null) {
                return;
            }
        }
        this.f19123m.e();
        int length = this.s.length;
        acr[] acrVarArr = new acr[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            ke keVarR = this.s[i2].r();
            ajr.b(keVarR);
            String str = keVarR.f22156l;
            boolean zM = alo.m(str);
            boolean z = zM || alo.p(str);
            zArr[i2] = z;
            this.w = z | this.w;
            zc zcVar = this.r;
            if (zcVar != null) {
                if (zM || this.t[i2].f19107b) {
                    ys ysVar = keVarR.f22154j;
                    ys ysVar2 = ysVar == null ? new ys(zcVar) : ysVar.c(zcVar);
                    kd kdVarB = keVarR.b();
                    kdVarB.X(ysVar2);
                    keVarR = kdVarB.s();
                }
                if (zM && keVarR.f22150f == -1 && keVarR.f22151g == -1 && zcVar.f23834a != -1) {
                    kd kdVarB2 = keVarR.b();
                    kdVarB2.G(zcVar.f23834a);
                    keVarR = kdVarB2.s();
                }
            }
            acrVarArr[i2] = new acr(keVarR.c(this.f19116f.c(keVarR)));
        }
        this.x = new aby(new act(acrVarArr), zArr);
        this.v = true;
        abd abdVar = this.q;
        ajr.b(abdVar);
        abdVar.i(this);
    }

    private final void P(int i2) {
        M();
        aby abyVar = this.x;
        boolean[] zArr = abyVar.f19111d;
        if (zArr[i2]) {
            return;
        }
        ke keVarB = abyVar.f19108a.b(i2).b(0);
        this.f19117g.o(alo.a(keVarB.f22156l), keVarB, 0, this.G);
        zArr[i2] = true;
    }

    private final void Q(int i2) {
        M();
        boolean[] zArr = this.x.f19109b;
        if (this.I && zArr[i2]) {
            if (this.s[i2].I(false)) {
                return;
            }
            this.H = 0L;
            this.I = false;
            this.D = true;
            this.G = 0L;
            this.J = 0;
            for (acj acjVar : this.s) {
                acjVar.z();
            }
            abd abdVar = this.q;
            ajr.b(abdVar);
            abdVar.g(this);
        }
    }

    private final void R() {
        abu abuVar = new abu(this, this.f19114d, this.f19115e, this.f19122l, this, this.f19123m);
        if (this.v) {
            ajr.f(S());
            long j2 = this.z;
            if (j2 != -9223372036854775807L && this.H > j2) {
                this.K = true;
                this.H = -9223372036854775807L;
                return;
            }
            sc scVar = this.y;
            ajr.b(scVar);
            abu.g(abuVar, scVar.g(this.H).f22930a.f22936c, this.H);
            for (acj acjVar : this.s) {
                acjVar.C(this.H);
            }
            this.H = -9223372036854775807L;
        }
        this.J = J();
        this.f19121k.b(abuVar, this, ajr.i(this.B));
        ajl ajlVar = abuVar.f19100l;
        abo aboVar = this.f19117g;
        long unused = abuVar.f19090b;
        aboVar.s(new aax(ajlVar), 1, -1, null, 0, abuVar.f19099k, this.z);
    }

    private final boolean S() {
        return this.H != -9223372036854775807L;
    }

    private final boolean T() {
        return this.D || S();
    }

    public final void A() {
        this.f19121k.h(ajr.i(this.B));
    }

    public final void B(int i2) {
        this.s[i2].w();
        A();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final /* bridge */ /* synthetic */ void C(akf akfVar, long j2, long j3, boolean z) {
        abu abuVar = (abu) akfVar;
        akp unused = abuVar.f19092d;
        long unused2 = abuVar.f19090b;
        ajl unused3 = abuVar.f19100l;
        aax aaxVar = new aax();
        long unused4 = abuVar.f19090b;
        this.f19117g.p(aaxVar, 1, -1, null, 0, abuVar.f19099k, this.z);
        if (z) {
            return;
        }
        N(abuVar);
        for (acj acjVar : this.s) {
            acjVar.z();
        }
        if (this.E > 0) {
            abd abdVar = this.q;
            ajr.b(abdVar);
            abdVar.g(this);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final /* bridge */ /* synthetic */ void D(akf akfVar, long j2, long j3) {
        sc scVar;
        abu abuVar = (abu) akfVar;
        if (this.z == -9223372036854775807L && (scVar = this.y) != null) {
            boolean zH = scVar.h();
            long jK = K();
            long j4 = jK == Long.MIN_VALUE ? 0L : jK + 10000;
            this.z = j4;
            this.f19119i.a(j4, zH, this.A);
        }
        akp unused = abuVar.f19092d;
        long unused2 = abuVar.f19090b;
        ajl unused3 = abuVar.f19100l;
        aax aaxVar = new aax();
        long unused4 = abuVar.f19090b;
        this.f19117g.q(aaxVar, 1, -1, null, 0, abuVar.f19099k, this.z);
        N(abuVar);
        this.K = true;
        abd abdVar = this.q;
        ajr.b(abdVar);
        abdVar.g(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akg
    public final void E() {
        for (acj acjVar : this.s) {
            acjVar.y();
        }
        this.f19122l.e();
    }

    public final void F() {
        if (this.v) {
            for (acj acjVar : this.s) {
                acjVar.x();
            }
        }
        this.f19121k.j(this);
        this.p.removeCallbacksAndMessages(null);
        this.q = null;
        this.L = true;
    }

    public final boolean G(int i2) {
        return !T() && this.s[i2].I(this.K);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aci
    public final void I() {
        this.p.post(this.f19124n);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final long a(long j2, lt ltVar) {
        M();
        if (!this.y.h()) {
            return 0L;
        }
        sa saVarG = this.y.g(j2);
        return ltVar.a(j2, saVarG.f22930a.f22935b, saVarG.f22931b.f22935b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rm
    public final sf aZ(int i2, int i3) {
        return L(new abx(i2, false));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rm
    public final void ba() {
        this.u = true;
        this.p.post(this.f19124n);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rm
    public final void bb(final sc scVar) {
        this.p.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.abt
            @Override // java.lang.Runnable
            public final void run() {
                this.f19087a.z(scVar);
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final long bc() {
        long jK;
        M();
        boolean[] zArr = this.x.f19109b;
        if (this.K) {
            return Long.MIN_VALUE;
        }
        if (S()) {
            return this.H;
        }
        if (this.w) {
            int length = this.s.length;
            jK = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i2] && !this.s[i2].H()) {
                    jK = Math.min(jK, this.s[i2].o());
                }
            }
        } else {
            jK = Long.MAX_VALUE;
        }
        if (jK == Long.MAX_VALUE) {
            jK = K();
        }
        return jK == Long.MIN_VALUE ? this.G : jK;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final long c() {
        if (this.E == 0) {
            return Long.MIN_VALUE;
        }
        return bc();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final long d() {
        if (!this.D) {
            return -9223372036854775807L;
        }
        if (!this.K && J() <= this.J) {
            return -9223372036854775807L;
        }
        this.D = false;
        return this.G;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final long e(long j2) {
        M();
        boolean[] zArr = this.x.f19109b;
        if (true != this.y.h()) {
            j2 = 0;
        }
        int i2 = 0;
        this.D = false;
        this.G = j2;
        if (S()) {
            this.H = j2;
            return j2;
        }
        if (this.B != 7) {
            int length = this.s.length;
            for (int i3 = 0; i3 < length; i3++) {
                if (this.s[i3].K(j2, false) || (!zArr[i3] && this.w)) {
                }
            }
            return j2;
        }
        this.I = false;
        this.H = j2;
        this.K = false;
        if (this.f19121k.l()) {
            acj[] acjVarArr = this.s;
            int length2 = acjVarArr.length;
            while (i2 < length2) {
                acjVarArr[i2].s();
                i2++;
            }
            this.f19121k.f();
        } else {
            this.f19121k.g();
            acj[] acjVarArr2 = this.s;
            int length3 = acjVarArr2.length;
            while (i2 < length3) {
                acjVarArr2[i2].z();
                i2++;
            }
        }
        return j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final long f(aii[] aiiVarArr, boolean[] zArr, ack[] ackVarArr, boolean[] zArr2, long j2) {
        aii aiiVar;
        M();
        aby abyVar = this.x;
        act actVar = abyVar.f19108a;
        boolean[] zArr3 = abyVar.f19110c;
        int i2 = this.E;
        int i3 = 0;
        for (int i4 = 0; i4 < aiiVarArr.length; i4++) {
            ack ackVar = ackVarArr[i4];
            if (ackVar != null && (aiiVarArr[i4] == null || !zArr[i4])) {
                int i5 = ((abw) ackVar).f19105b;
                ajr.f(zArr3[i5]);
                this.E--;
                zArr3[i5] = false;
                ackVarArr[i4] = null;
            }
        }
        boolean z = !this.C ? j2 == 0 : i2 != 0;
        for (int i6 = 0; i6 < aiiVarArr.length; i6++) {
            if (ackVarArr[i6] == null && (aiiVar = aiiVarArr[i6]) != null) {
                ajr.f(aiiVar.n() == 1);
                ajr.f(aiiVar.j(0) == 0);
                int iA = actVar.a(aiiVar.q());
                ajr.f(!zArr3[iA]);
                this.E++;
                zArr3[iA] = true;
                ackVarArr[i6] = new abw(this, iA);
                zArr2[i6] = true;
                if (!z) {
                    acj acjVar = this.s[iA];
                    z = (acjVar.K(j2, true) || acjVar.h() == 0) ? false : true;
                }
            }
        }
        if (this.E == 0) {
            this.I = false;
            this.D = false;
            if (this.f19121k.l()) {
                acj[] acjVarArr = this.s;
                int length = acjVarArr.length;
                while (i3 < length) {
                    acjVarArr[i3].s();
                    i3++;
                }
                this.f19121k.f();
            } else {
                acj[] acjVarArr2 = this.s;
                int length2 = acjVarArr2.length;
                while (i3 < length2) {
                    acjVarArr2[i3].z();
                    i3++;
                }
            }
        } else if (z) {
            j2 = e(j2);
            while (i3 < 2) {
                if (ackVarArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.C = true;
        return j2;
    }

    public final int g(int i2, kf kfVar, pz pzVar, int i3) {
        if (T()) {
            return -3;
        }
        P(i2);
        int iL = this.s[i2].l(kfVar, pzVar, i3, this.K);
        if (iL == -3) {
            Q(i2);
        }
        return iL;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final act h() {
        M();
        return this.x.f19108a;
    }

    public final int i(int i2, long j2) {
        if (T()) {
            return 0;
        }
        P(i2);
        acj acjVar = this.s[i2];
        int i3 = acjVar.i(j2, this.K);
        acjVar.E(i3);
        if (i3 != 0) {
            return i3;
        }
        Q(i2);
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final void j() throws lb {
        A();
        if (this.K && !this.v) {
            throw new lb("Loading finished before preparation is complete.");
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final void k(abd abdVar, long j2) {
        this.q = abdVar;
        this.f19123m.d();
        R();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final void l(long j2) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final boolean m(long j2) {
        if (this.K || this.f19121k.k() || this.I) {
            return false;
        }
        if (this.v && this.E == 0) {
            return false;
        }
        boolean zD = this.f19123m.d();
        if (this.f19121k.l()) {
            return zD;
        }
        R();
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final boolean n() {
        return this.f19121k.l() && this.f19123m.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final void p(long j2) {
        M();
        if (S()) {
            return;
        }
        boolean[] zArr = this.x.f19110c;
        int length = this.s.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.s[i2].N(j2, zArr[i2]);
        }
    }

    public final sf s() {
        return L(new abx(0, true));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final /* bridge */ /* synthetic */ akd u(akf akfVar, long j2, long j3, IOException iOException, int i2) {
        akd akdVarC;
        sc scVar;
        abu abuVar = (abu) akfVar;
        N(abuVar);
        akp unused = abuVar.f19092d;
        long unused2 = abuVar.f19090b;
        ajl unused3 = abuVar.f19100l;
        aax aaxVar = new aax();
        new abc(1, -1, null, 0, iw.c(abuVar.f19099k), iw.c(this.z));
        long j4 = ajr.j(new akb(iOException, i2));
        if (j4 == -9223372036854775807L) {
            akdVarC = akj.f19983c;
        } else {
            int iJ = J();
            boolean z = iJ > this.J;
            if (this.F != -1 || ((scVar = this.y) != null && scVar.e() != -9223372036854775807L)) {
                this.J = iJ;
            } else if (!this.v || T()) {
                this.D = this.v;
                this.G = 0L;
                this.J = 0;
                for (acj acjVar : this.s) {
                    acjVar.z();
                }
                abu.g(abuVar, 0L, 0L);
            } else {
                this.I = true;
                akdVarC = akj.f19982b;
            }
            akdVarC = akj.c(z, j4);
        }
        akd akdVar = akdVarC;
        boolean z2 = !akdVar.c();
        this.f19117g.r(aaxVar, 1, -1, null, 0, abuVar.f19099k, this.z, iOException, z2);
        if (z2) {
            long unused4 = abuVar.f19090b;
        }
        return akdVar;
    }

    public final /* synthetic */ void y() {
        if (this.L) {
            return;
        }
        abd abdVar = this.q;
        ajr.b(abdVar);
        abdVar.g(this);
    }

    public final /* synthetic */ void z(sc scVar) {
        this.y = this.r == null ? scVar : new sb(-9223372036854775807L);
        this.z = scVar.e();
        boolean z = false;
        if (this.F == -1 && scVar.e() == -9223372036854775807L) {
            z = true;
        }
        this.A = z;
        this.B = true == z ? 7 : 1;
        this.f19119i.a(this.z, scVar.h(), this.A);
        if (this.v) {
            return;
        }
        O();
    }
}
