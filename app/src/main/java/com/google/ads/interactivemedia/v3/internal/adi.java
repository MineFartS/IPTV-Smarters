package com.google.ads.interactivemedia.v3.internal;

import android.os.Looper;
import android.util.Log;
import com.google.ads.interactivemedia.v3.internal.adj;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class adi<T extends adj> implements ack, acm, akc, akg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f19272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ke[] f19273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean[] f19274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final T f19275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final acl<adi<T>> f19276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final abo f19277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final akj f19278i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final adf f19279j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList<acx> f19280k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<acx> f19281l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final acj f19282m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final acj[] f19283n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final acz f19284o;
    private add p;
    private ke q;
    private adh<T> r;
    private long s;
    private long t;
    private int u;
    private acx v;
    private final ajr w;

    /* JADX WARN: Multi-variable type inference failed */
    public adi(int i2, int[] iArr, ke[] keVarArr, adj adjVar, acl aclVar, ajm ajmVar, long j2, qq qqVar, qk qkVar, ajr ajrVar, abo aboVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f19270a = i2;
        int i3 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f19272c = iArr;
        this.f19273d = keVarArr == null ? new ke[0] : keVarArr;
        this.f19275f = adjVar;
        this.f19276g = aclVar;
        this.f19277h = aboVar;
        this.w = ajrVar;
        this.f19278i = new akj("ChunkSampleStream");
        this.f19279j = new adf();
        ArrayList<acx> arrayList = new ArrayList<>();
        this.f19280k = arrayList;
        this.f19281l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f19283n = new acj[length];
        this.f19274e = new boolean[length];
        int i4 = length + 1;
        int[] iArr2 = new int[i4];
        acj[] acjVarArr = new acj[i4];
        Looper looperMyLooper = Looper.myLooper();
        ajr.b(looperMyLooper);
        acj acjVarL = acj.L(ajmVar, looperMyLooper, qqVar, qkVar);
        this.f19282m = acjVarL;
        iArr2[0] = i2;
        acjVarArr[0] = acjVarL;
        while (i3 < length) {
            acj acjVarM = acj.M(ajmVar);
            this.f19283n[i3] = acjVarM;
            int i5 = i3 + 1;
            acjVarArr[i5] = acjVarM;
            iArr2[i5] = this.f19272c[i3];
            i3 = i5;
        }
        this.f19284o = new acz(iArr2, acjVarArr);
        this.s = j2;
        this.t = j2;
    }

    private final boolean A(int i2) {
        acx acxVar = this.f19280k.get(i2);
        if (this.f19282m.h() > acxVar.a(0)) {
            return true;
        }
        int i3 = 0;
        while (true) {
            acj[] acjVarArr = this.f19283n;
            if (i3 >= acjVarArr.length) {
                return false;
            }
            int i4 = i3 + 1;
            if (acjVarArr[i3].h() > acxVar.a(i4)) {
                return true;
            }
            i3 = i4;
        }
    }

    private final int v(int i2, int i3) {
        do {
            i3++;
            if (i3 >= this.f19280k.size()) {
                return this.f19280k.size() - 1;
            }
        } while (this.f19280k.get(i3).a(0) <= i2);
        return i3 - 1;
    }

    private final acx w(int i2) {
        acx acxVar = this.f19280k.get(i2);
        ArrayList<acx> arrayList = this.f19280k;
        amn.M(arrayList, i2, arrayList.size());
        this.u = Math.max(this.u, this.f19280k.size());
        int i3 = 0;
        this.f19282m.u(acxVar.a(0));
        while (true) {
            acj[] acjVarArr = this.f19283n;
            if (i3 >= acjVarArr.length) {
                return acxVar;
            }
            int i4 = i3 + 1;
            acjVarArr[i3].u(acxVar.a(i4));
            i3 = i4;
        }
    }

    private final acx x() {
        return this.f19280k.get(r0.size() - 1);
    }

    private final void y() {
        int iV = v(this.f19282m.h(), this.u - 1);
        while (true) {
            int i2 = this.u;
            if (i2 > iV) {
                return;
            }
            this.u = i2 + 1;
            acx acxVar = this.f19280k.get(i2);
            ke keVar = acxVar.f19257f;
            if (!keVar.equals(this.q)) {
                this.f19277h.o(this.f19270a, keVar, acxVar.f19258g, acxVar.f19260i);
            }
            this.q = keVar;
        }
    }

    private final void z() {
        this.f19282m.z();
        for (acj acjVar : this.f19283n) {
            acjVar.z();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final /* bridge */ /* synthetic */ void C(akf akfVar, long j2, long j3, boolean z) {
        add addVar = (add) akfVar;
        this.p = null;
        this.v = null;
        long j4 = addVar.f19254c;
        addVar.e();
        addVar.f();
        addVar.d();
        this.f19277h.p(new aax(), addVar.f19256e, this.f19270a, addVar.f19257f, addVar.f19258g, addVar.f19260i, addVar.f19261j);
        if (z) {
            return;
        }
        if (p()) {
            z();
        } else if (addVar instanceof acx) {
            w(this.f19280k.size() - 1);
            if (this.f19280k.isEmpty()) {
                this.s = this.t;
            }
        }
        this.f19276g.g(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final /* bridge */ /* synthetic */ void D(akf akfVar, long j2, long j3) {
        add addVar = (add) akfVar;
        this.p = null;
        this.f19275f.e(addVar);
        long j4 = addVar.f19254c;
        addVar.e();
        addVar.f();
        addVar.d();
        this.f19277h.q(new aax(), addVar.f19256e, this.f19270a, addVar.f19257f, addVar.f19258g, addVar.f19260i, addVar.f19261j);
        this.f19276g.g(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akg
    public final void E() {
        this.f19282m.y();
        for (acj acjVar : this.f19283n) {
            acjVar.y();
        }
        this.f19275f.f();
        adh<T> adhVar = this.r;
        if (adhVar != null) {
            adhVar.i(this);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final int a(kf kfVar, pz pzVar, int i2) {
        if (p()) {
            return -3;
        }
        y();
        return this.f19282m.l(kfVar, pzVar, i2, this.f19271b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final int b(long j2) {
        if (p()) {
            return 0;
        }
        int i2 = this.f19282m.i(j2, this.f19271b);
        this.f19282m.E(i2);
        y();
        return i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acm
    public final long bc() {
        if (this.f19271b) {
            return Long.MIN_VALUE;
        }
        if (p()) {
            return this.s;
        }
        long jMax = this.t;
        acx acxVarX = x();
        if (!acxVarX.j()) {
            if (this.f19280k.size() > 1) {
                acxVarX = this.f19280k.get(r2.size() - 2);
            } else {
                acxVarX = null;
            }
        }
        if (acxVarX != null) {
            jMax = Math.max(jMax, acxVarX.f19261j);
        }
        return Math.max(jMax, this.f19282m.o());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acm
    public final long c() {
        if (p()) {
            return this.s;
        }
        if (this.f19271b) {
            return Long.MIN_VALUE;
        }
        return x().f19261j;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final void d() {
        this.f19278i.a();
        this.f19282m.w();
        if (this.f19278i.l()) {
            return;
        }
        this.f19275f.d();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ack
    public final boolean e() {
        return !p() && this.f19282m.I(this.f19271b);
    }

    public final long g(long j2, lt ltVar) {
        return this.f19275f.b(j2, ltVar);
    }

    public final adg i(long j2, int i2) {
        for (int i3 = 0; i3 < this.f19283n.length; i3++) {
            if (this.f19272c[i3] == i2) {
                ajr.f(!this.f19274e[i3]);
                this.f19274e[i3] = true;
                this.f19283n[i3].K(j2, true);
                return new adg(this, this, this.f19283n[i3], i3);
            }
        }
        throw new IllegalStateException();
    }

    public final T j() {
        return this.f19275f;
    }

    public final void k(adh<T> adhVar) {
        this.r = adhVar;
        this.f19282m.x();
        for (acj acjVar : this.f19283n) {
            acjVar.x();
        }
        this.f19278i.j(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acm
    public final void l(long j2) {
        if (this.f19278i.k() || p()) {
            return;
        }
        if (this.f19278i.l()) {
            add addVar = this.p;
            ajr.b(addVar);
            if ((addVar instanceof acx) && A(this.f19280k.size() - 1)) {
                return;
            }
            this.f19275f.h(j2, addVar, this.f19281l);
            return;
        }
        int iA = this.f19275f.a(j2, this.f19281l);
        if (iA < this.f19280k.size()) {
            ajr.f(!this.f19278i.l());
            int size = this.f19280k.size();
            while (true) {
                if (iA >= size) {
                    iA = -1;
                    break;
                } else if (!A(iA)) {
                    break;
                } else {
                    iA++;
                }
            }
            if (iA == -1) {
                return;
            }
            long j3 = x().f19261j;
            acx acxVarW = w(iA);
            if (this.f19280k.isEmpty()) {
                this.s = this.t;
            }
            this.f19271b = false;
            this.f19277h.n(this.f19270a, acxVarW.f19260i, j3);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acm
    public final boolean m(long j2) {
        List<acx> listEmptyList;
        long j3;
        if (this.f19271b || this.f19278i.l() || this.f19278i.k()) {
            return false;
        }
        boolean zP = p();
        if (zP) {
            listEmptyList = Collections.emptyList();
            j3 = this.s;
        } else {
            listEmptyList = this.f19281l;
            j3 = x().f19261j;
        }
        this.f19275f.c(j2, j3, listEmptyList, this.f19279j);
        adf adfVar = this.f19279j;
        boolean z = adfVar.f19264b;
        add addVar = adfVar.f19263a;
        adfVar.f19263a = null;
        adfVar.f19264b = false;
        if (z) {
            this.s = -9223372036854775807L;
            this.f19271b = true;
            return true;
        }
        if (addVar == null) {
            return false;
        }
        this.p = addVar;
        if (addVar instanceof acx) {
            acx acxVar = (acx) addVar;
            if (zP) {
                long j4 = acxVar.f19260i;
                long j5 = this.s;
                if (j4 != j5) {
                    this.f19282m.C(j5);
                    for (acj acjVar : this.f19283n) {
                        acjVar.C(this.s);
                    }
                }
                this.s = -9223372036854775807L;
            }
            acxVar.c(this.f19284o);
            this.f19280k.add(acxVar);
        } else if (addVar instanceof adm) {
            ((adm) addVar).a(this.f19284o);
        }
        this.f19278i.b(addVar, this, ajr.i(addVar.f19256e));
        this.f19277h.s(new aax(addVar.f19255d), addVar.f19256e, this.f19270a, addVar.f19257f, addVar.f19258g, addVar.f19260i, addVar.f19261j);
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acm
    public final boolean n() {
        return this.f19278i.l();
    }

    public final void o(long j2) {
        acx acxVar;
        boolean zK;
        this.t = j2;
        if (p()) {
            this.s = j2;
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            acxVar = null;
            if (i3 >= this.f19280k.size()) {
                break;
            }
            acx acxVar2 = this.f19280k.get(i3);
            long j3 = acxVar2.f19260i;
            if (j3 == j2 && acxVar2.f19221a == -9223372036854775807L) {
                acxVar = acxVar2;
                break;
            } else if (j3 > j2) {
                break;
            } else {
                i3++;
            }
        }
        acj acjVar = this.f19282m;
        if (acxVar != null) {
            zK = acjVar.J(acxVar.a(0));
        } else {
            zK = acjVar.K(j2, j2 < c());
        }
        if (zK) {
            this.u = v(this.f19282m.h(), 0);
            acj[] acjVarArr = this.f19283n;
            int length = acjVarArr.length;
            while (i2 < length) {
                acjVarArr[i2].K(j2, true);
                i2++;
            }
            return;
        }
        this.s = j2;
        this.f19271b = false;
        this.f19280k.clear();
        this.u = 0;
        if (!this.f19278i.l()) {
            this.f19278i.g();
            z();
            return;
        }
        this.f19282m.s();
        acj[] acjVarArr2 = this.f19283n;
        int length2 = acjVarArr2.length;
        while (i2 < length2) {
            acjVarArr2[i2].s();
            i2++;
        }
        this.f19278i.f();
    }

    public final boolean p() {
        return this.s != -9223372036854775807L;
    }

    public final void t(long j2) {
        if (p()) {
            return;
        }
        int iG = this.f19282m.g();
        this.f19282m.N(j2, true);
        int iG2 = this.f19282m.g();
        if (iG2 > iG) {
            long jN = this.f19282m.n();
            int i2 = 0;
            while (true) {
                acj[] acjVarArr = this.f19283n;
                if (i2 >= acjVarArr.length) {
                    break;
                }
                acjVarArr[i2].N(jN, this.f19274e[i2]);
                i2++;
            }
        }
        int iMin = Math.min(v(iG2, 0), this.u);
        if (iMin > 0) {
            amn.M(this.f19280k, 0, iMin);
            this.u -= iMin;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final /* bridge */ /* synthetic */ akd u(akf akfVar, long j2, long j3, IOException iOException, int i2) {
        akd akdVarC;
        add addVar = (add) akfVar;
        long jD = addVar.d();
        boolean z = addVar instanceof acx;
        int size = this.f19280k.size() - 1;
        boolean z2 = (jD != 0 && z && A(size)) ? false : true;
        addVar.e();
        addVar.f();
        aax aaxVar = new aax();
        new abc(addVar.f19256e, this.f19270a, addVar.f19257f, addVar.f19258g, iw.c(addVar.f19260i), iw.c(addVar.f19261j));
        akb akbVar = new akb(iOException, i2);
        if (!this.f19275f.g(addVar, z2, iOException, z2 ? ajr.h(akbVar) : -9223372036854775807L)) {
            akdVarC = null;
        } else if (z2) {
            akdVarC = akj.f19982b;
            if (z) {
                ajr.f(w(size) == addVar);
                if (this.f19280k.isEmpty()) {
                    this.s = this.t;
                }
            }
        } else {
            Log.w("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            akdVarC = null;
        }
        if (akdVarC == null) {
            long j4 = ajr.j(akbVar);
            akdVarC = j4 != -9223372036854775807L ? akj.c(false, j4) : akj.f19983c;
        }
        boolean z3 = !akdVarC.c();
        this.f19277h.r(aaxVar, addVar.f19256e, this.f19270a, addVar.f19257f, addVar.f19258g, addVar.f19260i, addVar.f19261j, iOException, z3);
        if (z3) {
            this.p = null;
            this.f19276g.g(this);
        }
        return akdVarC;
    }
}
