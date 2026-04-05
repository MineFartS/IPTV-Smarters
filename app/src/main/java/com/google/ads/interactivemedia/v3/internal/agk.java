package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class agk implements akc, akg, acm, rm, aci {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<Integer> f19595b = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    private int A;
    private boolean B;
    private boolean C;
    private int D;
    private ke E;
    private ke F;
    private boolean G;
    private act H;
    private Set<acr> I;
    private int[] J;
    private int K;
    private boolean L;
    private boolean[] M;
    private boolean[] N;
    private long O;
    private long P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private long U;
    private qg V;
    private afz W;
    private final ajm X;
    private final ajr Y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final agh f19597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final afx f19598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ke f19599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final qq f19600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final qk f19601h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final abo f19603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f19604k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList<afz> f19606m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<afz> f19607n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Runnable f19608o;
    private final Runnable p;
    private final Handler q;
    private final ArrayList<agd> r;
    private final Map<String, qg> s;
    private add t;
    private agj[] u;
    private final Set<Integer> w;
    private final SparseIntArray x;
    private sf y;
    private int z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final akj f19602i = new akj("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final aft f19605l = new aft();
    private int[] v = new int[0];

    public agk(int i2, agh aghVar, afx afxVar, Map map, ajm ajmVar, long j2, ke keVar, qq qqVar, qk qkVar, ajr ajrVar, abo aboVar, int i3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f19596c = i2;
        this.f19597d = aghVar;
        this.f19598e = afxVar;
        this.s = map;
        this.X = ajmVar;
        this.f19599f = keVar;
        this.f19600g = qqVar;
        this.f19601h = qkVar;
        this.Y = ajrVar;
        this.f19603j = aboVar;
        this.f19604k = i3;
        Set<Integer> set = f19595b;
        this.w = new HashSet(set.size());
        this.x = new SparseIntArray(set.size());
        this.u = new agj[0];
        this.N = new boolean[0];
        this.M = new boolean[0];
        ArrayList<afz> arrayList = new ArrayList<>();
        this.f19606m = arrayList;
        this.f19607n = Collections.unmodifiableList(arrayList);
        this.r = new ArrayList<>();
        this.f19608o = new agf(this);
        this.p = new agf(this, 1);
        this.q = amn.v();
        this.O = j2;
        this.P = j2;
    }

    private static int H(int i2) {
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 1;
        }
        return 3;
    }

    private static ke J(ke keVar, ke keVar2, boolean z) {
        String strE;
        String strF;
        if (keVar == null) {
            return keVar2;
        }
        int iA = alo.a(keVar2.f22156l);
        if (amn.f(keVar.f22153i, iA) == 1) {
            strE = amn.E(keVar.f22153i, iA);
            strF = alo.f(strE);
        } else {
            strE = alo.e(keVar.f22153i, keVar2.f22156l);
            strF = keVar2.f22156l;
        }
        kd kdVarB = keVar2.b();
        kdVarB.S(keVar.f22145a);
        kdVarB.U(keVar.f22146b);
        kdVarB.V(keVar.f22147c);
        kdVarB.ag(keVar.f22148d);
        kdVarB.ac(keVar.f22149e);
        kdVarB.G(z ? keVar.f22150f : -1);
        kdVarB.Z(z ? keVar.f22151g : -1);
        kdVarB.I(strE);
        kdVarB.aj(keVar.q);
        kdVarB.Q(keVar.r);
        if (strF != null) {
            kdVarB.ae(strF);
        }
        int i2 = keVar.y;
        if (i2 != -1) {
            kdVarB.H(i2);
        }
        ys ysVarD = keVar.f22154j;
        if (ysVarD != null) {
            ys ysVar = keVar2.f22154j;
            if (ysVar != null) {
                ysVarD = ysVar.d(ysVarD);
            }
            kdVarB.X(ysVarD);
        }
        return kdVarB.s();
    }

    private static ri K(int i2, int i3) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unmapped track with id ");
        sb.append(i2);
        sb.append(" of type ");
        sb.append(i3);
        Log.w("HlsSampleStreamWrapper", sb.toString());
        return new ri();
    }

    private final act L(acr[] acrVarArr) {
        for (int i2 = 0; i2 < acrVarArr.length; i2++) {
            acr acrVar = acrVarArr[i2];
            ke[] keVarArr = new ke[acrVar.f19202a];
            for (int i3 = 0; i3 < acrVar.f19202a; i3++) {
                ke keVarB = acrVar.b(i3);
                keVarArr[i3] = keVarB.c(this.f19600g.c(keVarB));
            }
            acrVarArr[i2] = new acr(keVarArr);
        }
        return new act(acrVarArr);
    }

    private final afz M() {
        return this.f19606m.get(r0.size() - 1);
    }

    private final void N() {
        ajr.f(this.C);
        ajr.b(this.H);
        ajr.b(this.I);
    }

    private final void O(int i2) {
        int i3;
        ajr.f(!this.f19602i.l());
        loop0: while (true) {
            if (i2 >= this.f19606m.size()) {
                i2 = -1;
                break;
            }
            int i4 = i2;
            while (true) {
                if (i4 >= this.f19606m.size()) {
                    afz afzVar = this.f19606m.get(i2);
                    while (i3 < this.u.length) {
                        i3 = this.u[i3].h() <= afzVar.a(i3) ? i3 + 1 : 0;
                    }
                    break loop0;
                } else if (this.f19606m.get(i4).f19541n) {
                    break;
                } else {
                    i4++;
                }
            }
            i2++;
        }
        if (i2 == -1) {
            return;
        }
        long j2 = M().f19261j;
        afz afzVar2 = this.f19606m.get(i2);
        ArrayList<afz> arrayList = this.f19606m;
        amn.M(arrayList, i2, arrayList.size());
        for (int i5 = 0; i5 < this.u.length; i5++) {
            this.u[i5].u(afzVar2.a(i5));
        }
        if (this.f19606m.isEmpty()) {
            this.P = this.O;
        } else {
            ((afz) auv.r(this.f19606m)).c();
        }
        this.S = false;
        this.f19603j.n(this.z, afzVar2.f19260i, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        if (!this.G && this.J == null && this.B) {
            for (agj agjVar : this.u) {
                if (agjVar.r() == null) {
                    return;
                }
            }
            act actVar = this.H;
            if (actVar != null) {
                int i2 = actVar.f19207b;
                int[] iArr = new int[i2];
                this.J = iArr;
                Arrays.fill(iArr, -1);
                for (int i3 = 0; i3 < i2; i3++) {
                    int i4 = 0;
                    while (true) {
                        agj[] agjVarArr = this.u;
                        if (i4 < agjVarArr.length) {
                            ke keVarR = agjVarArr[i4].r();
                            ajr.c(keVarR);
                            ke keVarB = this.H.b(i3).b(0);
                            String str = keVarR.f22156l;
                            String str2 = keVarB.f22156l;
                            int iA = alo.a(str);
                            if (iA == 3) {
                                if (amn.O(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || keVarR.D == keVarB.D)) {
                                    break;
                                } else {
                                    i4++;
                                }
                            } else if (iA == alo.a(str2)) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                    this.J[i3] = i4;
                }
                ArrayList<agd> arrayList = this.r;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.get(i5).c();
                }
                return;
            }
            int length = this.u.length;
            int i6 = 0;
            int i7 = 7;
            int i8 = -1;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                ke keVarR2 = this.u[i6].r();
                ajr.c(keVarR2);
                String str3 = keVarR2.f22156l;
                int i9 = alo.p(str3) ? 2 : alo.m(str3) ? 1 : alo.o(str3) ? 3 : 7;
                if (H(i9) > H(i7)) {
                    i8 = i6;
                    i7 = i9;
                } else if (i9 == i7) {
                    i8 = -1;
                }
                i6++;
            }
            acr acrVarC = this.f19598e.c();
            int i10 = acrVarC.f19202a;
            this.K = -1;
            this.J = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.J[i11] = i11;
            }
            acr[] acrVarArr = new acr[length];
            for (int i12 = 0; i12 < length; i12++) {
                ke keVarR3 = this.u[i12].r();
                ajr.c(keVarR3);
                if (i12 == i8) {
                    ke[] keVarArr = new ke[i10];
                    if (i10 == 1) {
                        keVarArr[0] = keVarR3.d(acrVarC.b(0));
                    } else {
                        for (int i13 = 0; i13 < i10; i13++) {
                            keVarArr[i13] = J(acrVarC.b(i13), keVarR3, true);
                        }
                    }
                    acrVarArr[i12] = new acr(keVarArr);
                    this.K = i12;
                } else {
                    ke keVar = null;
                    if (i7 == 2 && alo.m(keVarR3.f22156l)) {
                        keVar = this.f19599f;
                    }
                    acrVarArr[i12] = new acr(J(keVar, keVarR3, false));
                }
            }
            this.H = L(acrVarArr);
            ajr.f(this.I == null);
            this.I = Collections.emptySet();
            R();
            this.f19597d.q();
        }
    }

    private final void Q() {
        for (agj agjVar : this.u) {
            agjVar.A(this.Q);
        }
        this.Q = false;
    }

    private final void R() {
        this.C = true;
    }

    private final boolean S() {
        return this.P != -9223372036854775807L;
    }

    public static /* synthetic */ void h(agk agkVar) {
        agkVar.B = true;
        agkVar.P();
    }

    public final boolean A(long j2, boolean z) {
        this.O = j2;
        if (S()) {
            this.P = j2;
            return true;
        }
        if (this.B && !z) {
            int length = this.u.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (this.u[i2].K(j2, false) || (!this.N[i2] && this.L)) {
                }
            }
            return false;
        }
        this.P = j2;
        this.S = false;
        this.f19606m.clear();
        if (this.f19602i.l()) {
            if (this.B) {
                for (agj agjVar : this.u) {
                    agjVar.s();
                }
            }
            this.f19602i.f();
        } else {
            this.f19602i.g();
            Q();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B(com.google.ads.interactivemedia.v3.internal.aii[] r20, boolean[] r21, com.google.ads.interactivemedia.v3.internal.ack[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.agk.B(com.google.ads.interactivemedia.v3.internal.aii[], boolean[], com.google.ads.interactivemedia.v3.internal.ack[], boolean[], long, boolean):boolean");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final /* bridge */ /* synthetic */ void C(akf akfVar, long j2, long j3, boolean z) {
        add addVar = (add) akfVar;
        this.t = null;
        long j4 = addVar.f19254c;
        addVar.e();
        addVar.f();
        addVar.d();
        this.f19603j.p(new aax(), addVar.f19256e, this.f19596c, addVar.f19257f, addVar.f19258g, addVar.f19260i, addVar.f19261j);
        if (z) {
            return;
        }
        if (S() || this.D == 0) {
            Q();
        }
        if (this.D > 0) {
            this.f19597d.g(this);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final /* bridge */ /* synthetic */ void D(akf akfVar, long j2, long j3) {
        add addVar = (add) akfVar;
        this.t = null;
        this.f19598e.g(addVar);
        long j4 = addVar.f19254c;
        addVar.e();
        addVar.f();
        addVar.d();
        this.f19603j.q(new aax(), addVar.f19256e, this.f19596c, addVar.f19257f, addVar.f19258g, addVar.f19260i, addVar.f19261j);
        if (this.C) {
            this.f19597d.g(this);
        } else {
            m(this.O);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akg
    public final void E() {
        for (agj agjVar : this.u) {
            agjVar.y();
        }
    }

    public final void F(long j2) {
        if (!this.B || S()) {
            return;
        }
        int length = this.u.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.u[i2].N(j2, this.M[i2]);
        }
    }

    public final void G(acr[] acrVarArr, int... iArr) {
        this.H = L(acrVarArr);
        this.I = new HashSet();
        this.K = 0;
        Handler handler = this.q;
        final agh aghVar = this.f19597d;
        handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.age
            @Override // java.lang.Runnable
            public final void run() {
                aghVar.q();
            }
        });
        R();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aci
    public final void I() {
        this.q.post(this.f19608o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.ads.interactivemedia.v3.internal.agj[]] */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.google.ads.interactivemedia.v3.internal.agj[]] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.ads.interactivemedia.v3.internal.sf] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.ads.interactivemedia.v3.internal.acj, com.google.ads.interactivemedia.v3.internal.agj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.google.ads.interactivemedia.v3.internal.ri] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // com.google.ads.interactivemedia.v3.internal.rm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.ads.interactivemedia.v3.internal.sf aZ(int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.agk.aZ(int, int):com.google.ads.interactivemedia.v3.internal.sf");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rm
    public final void ba() {
        this.T = true;
        this.q.post(this.p);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rm
    public final void bb(sc scVar) {
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:506)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:509)
        */
    @Override // com.google.ads.interactivemedia.v3.internal.acm
    public final long bc() {
        /*
            r7 = this;
            boolean r0 = r7.S
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.S()
            if (r0 == 0) goto L10
            long r0 = r7.P
            return r0
        L10:
            long r0 = r7.O
            com.google.ads.interactivemedia.v3.internal.afz r2 = r7.M()
            boolean r3 = r2.j()
            if (r3 != 0) goto L35
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.afz> r2 = r7.f19606m
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L34
            java.util.ArrayList<com.google.ads.interactivemedia.v3.internal.afz> r2 = r7.f19606m
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            com.google.ads.interactivemedia.v3.internal.afz r2 = (com.google.ads.interactivemedia.v3.internal.afz) r2
            goto L35
        L34:
            r2 = 0
        L35:
            if (r2 == 0) goto L3d
            long r2 = r2.f19261j
            long r0 = java.lang.Math.max(r0, r2)
        L3d:
            boolean r2 = r7.B
            if (r2 == 0) goto L54
            com.google.ads.interactivemedia.v3.internal.agj[] r2 = r7.u
            int r3 = r2.length
            r4 = 0
        L45:
            if (r4 >= r3) goto L54
            r5 = r2[r4]
            long r5 = r5.o()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L45
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.agk.bc():long");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acm
    public final long c() {
        if (S()) {
            return this.P;
        }
        if (this.S) {
            return Long.MIN_VALUE;
        }
        return M().f19261j;
    }

    public final int d(int i2) {
        N();
        ajr.b(this.J);
        int i3 = this.J[i2];
        if (i3 == -1) {
            return this.I.contains(this.H.b(i2)) ? -3 : -2;
        }
        boolean[] zArr = this.M;
        if (zArr[i3]) {
            return -2;
        }
        zArr[i3] = true;
        return i3;
    }

    public final int e(int i2, kf kfVar, pz pzVar, int i3) {
        ke keVar;
        if (S()) {
            return -3;
        }
        int i4 = 0;
        if (!this.f19606m.isEmpty()) {
            int i5 = 0;
            loop0: while (i5 < this.f19606m.size() - 1) {
                int i6 = this.f19606m.get(i5).f19538a;
                int length = this.u.length;
                for (int i7 = 0; i7 < length; i7++) {
                    if (this.M[i7] && this.u[i7].k() == i6) {
                        break loop0;
                    }
                }
                i5++;
            }
            amn.M(this.f19606m, 0, i5);
            afz afzVar = this.f19606m.get(0);
            ke keVar2 = afzVar.f19257f;
            if (!keVar2.equals(this.F)) {
                this.f19603j.o(this.f19596c, keVar2, afzVar.f19258g, afzVar.f19260i);
            }
            this.F = keVar2;
        }
        if (!this.f19606m.isEmpty() && !this.f19606m.get(0).l()) {
            return -3;
        }
        int iL = this.u[i2].l(kfVar, pzVar, i3, this.S);
        if (iL == -5) {
            ke keVarD = kfVar.f22161b;
            ajr.b(keVarD);
            if (i2 == this.A) {
                int iK = this.u[i2].k();
                while (i4 < this.f19606m.size() && this.f19606m.get(i4).f19538a != iK) {
                    i4++;
                }
                if (i4 < this.f19606m.size()) {
                    keVar = this.f19606m.get(i4).f19257f;
                } else {
                    keVar = this.E;
                    ajr.b(keVar);
                }
                keVarD = keVarD.d(keVar);
            }
            kfVar.f22161b = keVarD;
        }
        return iL;
    }

    public final int f(int i2, long j2) {
        if (S()) {
            return 0;
        }
        agj agjVar = this.u[i2];
        int i3 = agjVar.i(j2, this.S);
        afz afzVar = (afz) auv.s(this.f19606m);
        if (afzVar != null && !afzVar.l()) {
            i3 = Math.min(i3, afzVar.a(i2) - agjVar.h());
        }
        agjVar.E(i3);
        return i3;
    }

    public final act g() {
        N();
        return this.H;
    }

    public final void j() {
        if (this.C) {
            return;
        }
        m(this.O);
    }

    public final void k() {
        this.f19602i.a();
        this.f19598e.f();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acm
    public final void l(long j2) {
        if (this.f19602i.k() || S()) {
            return;
        }
        if (this.f19602i.l()) {
            ajr.b(this.t);
            this.f19598e.n(j2, this.t, this.f19607n);
            return;
        }
        int size = this.f19607n.size();
        while (size > 0) {
            int i2 = size - 1;
            if (this.f19598e.a(this.f19607n.get(i2)) != 2) {
                break;
            } else {
                size = i2;
            }
        }
        if (size < this.f19607n.size()) {
            O(size);
        }
        int iB = this.f19598e.b(j2, this.f19607n);
        if (iB < this.f19606m.size()) {
            O(iB);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acm
    public final boolean m(long j2) {
        List<afz> listEmptyList;
        long jMax;
        if (this.S || this.f19602i.l() || this.f19602i.k()) {
            return false;
        }
        if (S()) {
            listEmptyList = Collections.emptyList();
            jMax = this.P;
            for (agj agjVar : this.u) {
                agjVar.C(this.P);
            }
        } else {
            listEmptyList = this.f19607n;
            afz afzVarM = M();
            jMax = afzVarM.j() ? afzVarM.f19261j : Math.max(this.O, afzVarM.f19260i);
        }
        List<afz> list = listEmptyList;
        long j3 = jMax;
        this.f19605l.a();
        this.f19598e.e(j2, j3, list, this.C || !list.isEmpty(), this.f19605l);
        aft aftVar = this.f19605l;
        boolean z = aftVar.f19513b;
        add addVar = aftVar.f19512a;
        Uri uri = aftVar.f19514c;
        if (z) {
            this.P = -9223372036854775807L;
            this.S = true;
            return true;
        }
        if (addVar == null) {
            if (uri != null) {
                this.f19597d.o(uri);
            }
            return false;
        }
        if (addVar instanceof afz) {
            afz afzVar = (afz) addVar;
            this.W = afzVar;
            this.E = afzVar.f19257f;
            this.P = -9223372036854775807L;
            this.f19606m.add(afzVar);
            atu atuVarI = aty.i();
            for (agj agjVar2 : this.u) {
                atuVarI.d(Integer.valueOf(agjVar2.j()));
            }
            afzVar.b(this, atuVarI.c());
            for (agj agjVar3 : this.u) {
                agjVar3.P(afzVar);
                if (afzVar.f19541n) {
                    agjVar3.G();
                }
            }
        }
        this.t = addVar;
        this.f19602i.b(addVar, this, ajr.i(addVar.f19256e));
        this.f19603j.s(new aax(addVar.f19255d), addVar.f19256e, this.f19596c, addVar.f19257f, addVar.f19258g, addVar.f19260i, addVar.f19261j);
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acm
    public final boolean n() {
        return this.f19602i.l();
    }

    public final void o(int i2) {
        k();
        this.u[i2].w();
    }

    public final void p() throws lb {
        k();
        if (this.S && !this.C) {
            throw new lb("Loading finished before preparation is complete.");
        }
    }

    public final void q() {
        this.w.clear();
    }

    public final void r() {
        if (this.f19606m.isEmpty()) {
            return;
        }
        afz afzVar = (afz) auv.r(this.f19606m);
        int iA = this.f19598e.a(afzVar);
        if (iA == 1) {
            afzVar.k();
        } else if (iA == 2 && !this.S && this.f19602i.l()) {
            this.f19602i.f();
        }
    }

    public final void s() {
        if (this.C) {
            for (agj agjVar : this.u) {
                agjVar.x();
            }
        }
        this.f19602i.j(this);
        this.q.removeCallbacksAndMessages(null);
        this.G = true;
        this.r.clear();
    }

    public final void t(qg qgVar) {
        if (amn.O(this.V, qgVar)) {
            return;
        }
        this.V = qgVar;
        int i2 = 0;
        while (true) {
            agj[] agjVarArr = this.u;
            if (i2 >= agjVarArr.length) {
                return;
            }
            if (this.N[i2]) {
                agjVarArr[i2].O(qgVar);
            }
            i2++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final /* bridge */ /* synthetic */ akd u(akf akfVar, long j2, long j3, IOException iOException, int i2) {
        akd akdVarC;
        int i3;
        add addVar = (add) akfVar;
        boolean z = addVar instanceof afz;
        if (z && !((afz) addVar).l() && (iOException instanceof ajy) && ((i3 = ((ajy) iOException).f19959a) == 410 || i3 == 404)) {
            return akj.f19981a;
        }
        long jD = addVar.d();
        addVar.e();
        addVar.f();
        aax aaxVar = new aax();
        new abc(addVar.f19256e, this.f19596c, addVar.f19257f, addVar.f19258g, iw.c(addVar.f19260i), iw.c(addVar.f19261j));
        akb akbVar = new akb(iOException, i2);
        long jH = ajr.h(akbVar);
        boolean zK = jH != -9223372036854775807L ? this.f19598e.k(addVar, jH) : false;
        if (zK) {
            if (z && jD == 0) {
                ArrayList<afz> arrayList = this.f19606m;
                ajr.f(arrayList.remove(arrayList.size() + (-1)) == addVar);
                if (this.f19606m.isEmpty()) {
                    this.P = this.O;
                } else {
                    ((afz) auv.r(this.f19606m)).c();
                }
            }
            akdVarC = akj.f19982b;
        } else {
            long j4 = ajr.j(akbVar);
            akdVarC = j4 != -9223372036854775807L ? akj.c(false, j4) : akj.f19983c;
        }
        akd akdVar = akdVarC;
        boolean z2 = !akdVar.c();
        this.f19603j.r(aaxVar, addVar.f19256e, this.f19596c, addVar.f19257f, addVar.f19258g, addVar.f19260i, addVar.f19261j, iOException, z2);
        if (z2) {
            this.t = null;
        }
        if (zK) {
            if (this.C) {
                this.f19597d.g(this);
            } else {
                m(this.O);
            }
        }
        return akdVar;
    }

    public final void v(boolean z) {
        this.f19598e.i(z);
    }

    public final void w(long j2) {
        if (this.U != j2) {
            this.U = j2;
            for (agj agjVar : this.u) {
                agjVar.B(j2);
            }
        }
    }

    public final void x(int i2) {
        N();
        ajr.b(this.J);
        int i3 = this.J[i2];
        ajr.f(this.M[i3]);
        this.M[i3] = false;
    }

    public final boolean y(int i2) {
        return !S() && this.u[i2].I(this.S);
    }

    public final boolean z(Uri uri, long j2) {
        return this.f19598e.l(uri, j2);
    }
}
