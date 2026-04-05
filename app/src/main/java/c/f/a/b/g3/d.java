package c.f.a.b.g3;

import c.f.a.b.e3.i0;
import c.f.a.b.e3.z0;
import c.f.a.b.g3.h;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import c.f.a.b.k1;
import c.f.a.b.p2;
import c.f.b.b.e0;
import c.f.b.b.f0;
import c.f.b.b.t;
import c.f.b.b.y;
import com.amazonaws.services.s3.internal.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class d extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c.f.a.b.i3.i f8411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f8412i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f8413j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f8414k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f8415l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f8416m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t<a> f8417n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c.f.a.b.j3.i f8418o;
    public float p;
    public int q;
    public int r;
    public long s;
    public c.f.a.b.e3.d1.n t;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8420b;

        public a(long j2, long j3) {
            this.f8419a = j2;
            this.f8420b = j3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8419a == aVar.f8419a && this.f8420b == aVar.f8420b;
        }

        public int hashCode() {
            return (((int) this.f8419a) * 31) + ((int) this.f8420b);
        }
    }

    public static class b implements h.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f8424d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f8425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final c.f.a.b.j3.i f8426f;

        public b() {
            this(Constants.MAXIMUM_UPLOAD_PARTS, 25000, 25000, 0.7f, 0.75f, c.f.a.b.j3.i.f9202a);
        }

        public b(int i2, int i3, int i4, float f2, float f3, c.f.a.b.j3.i iVar) {
            this.f8421a = i2;
            this.f8422b = i3;
            this.f8423c = i4;
            this.f8424d = f2;
            this.f8425e = f3;
            this.f8426f = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // c.f.a.b.g3.h.b
        public final h[] a(h.a[] aVarArr, c.f.a.b.i3.i iVar, i0.a aVar, p2 p2Var) {
            t tVarY = d.y(aVarArr);
            h[] hVarArr = new h[aVarArr.length];
            for (int i2 = 0; i2 < aVarArr.length; i2++) {
                h.a aVar2 = aVarArr[i2];
                if (aVar2 != null) {
                    int[] iArr = aVar2.f8476b;
                    if (iArr.length != 0) {
                        hVarArr[i2] = iArr.length == 1 ? new i(aVar2.f8475a, iArr[0], aVar2.f8477c) : b(aVar2.f8475a, iArr, aVar2.f8477c, iVar, (t) tVarY.get(i2));
                    }
                }
            }
            return hVarArr;
        }

        public d b(z0 z0Var, int[] iArr, int i2, c.f.a.b.i3.i iVar, t<a> tVar) {
            return new d(z0Var, iArr, i2, iVar, this.f8421a, this.f8422b, this.f8423c, this.f8424d, this.f8425e, tVar, this.f8426f);
        }
    }

    public d(z0 z0Var, int[] iArr, int i2, c.f.a.b.i3.i iVar, long j2, long j3, long j4, float f2, float f3, List<a> list, c.f.a.b.j3.i iVar2) {
        super(z0Var, iArr, i2);
        if (j4 < j2) {
            z.i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j4 = j2;
        }
        this.f8411h = iVar;
        this.f8412i = j2 * 1000;
        this.f8413j = j3 * 1000;
        this.f8414k = j4 * 1000;
        this.f8415l = f2;
        this.f8416m = f3;
        this.f8417n = t.D(list);
        this.f8418o = iVar2;
        this.p = 1.0f;
        this.r = 0;
        this.s = -9223372036854775807L;
    }

    public static long[][] D(h.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            h.a aVar = aVarArr[i2];
            if (aVar == null) {
                jArr[i2] = new long[0];
            } else {
                jArr[i2] = new long[aVar.f8476b.length];
                int i3 = 0;
                while (true) {
                    if (i3 >= aVar.f8476b.length) {
                        break;
                    }
                    jArr[i2][i3] = aVar.f8475a.b(r5[i3]).f9334i;
                    i3++;
                }
                Arrays.sort(jArr[i2]);
            }
        }
        return jArr;
    }

    public static t<Integer> E(long[][] jArr) {
        e0 e0VarE = f0.c().a().e();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            if (jArr[i2].length > 1) {
                int length = jArr[i2].length;
                double[] dArr = new double[length];
                int i3 = 0;
                while (true) {
                    double dLog = 0.0d;
                    if (i3 >= jArr[i2].length) {
                        break;
                    }
                    if (jArr[i2][i3] != -1) {
                        dLog = Math.log(jArr[i2][i3]);
                    }
                    dArr[i3] = dLog;
                    i3++;
                }
                int i4 = length - 1;
                double d2 = dArr[i4] - dArr[0];
                int i5 = 0;
                while (i5 < i4) {
                    double d3 = dArr[i5];
                    i5++;
                    e0VarE.put(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i5]) * 0.5d) - dArr[0]) / d2), Integer.valueOf(i2));
                }
            }
        }
        return t.D(e0VarE.values());
    }

    public static void v(List<t.a<a>> list, long[] jArr) {
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += j3;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            t.a<a> aVar = list.get(i2);
            if (aVar != null) {
                aVar.d(new a(j2, jArr[i2]));
            }
        }
    }

    public static t<t<a>> y(h.a[] aVarArr) {
        t.a aVarB;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            if (aVarArr[i2] == null || aVarArr[i2].f8476b.length <= 1) {
                aVarB = null;
            } else {
                aVarB = t.B();
                aVarB.d(new a(0L, 0L));
            }
            arrayList.add(aVarB);
        }
        long[][] jArrD = D(aVarArr);
        int[] iArr = new int[jArrD.length];
        long[] jArr = new long[jArrD.length];
        for (int i3 = 0; i3 < jArrD.length; i3++) {
            jArr[i3] = jArrD[i3].length == 0 ? 0L : jArrD[i3][0];
        }
        v(arrayList, jArr);
        t<Integer> tVarE = E(jArrD);
        for (int i4 = 0; i4 < tVarE.size(); i4++) {
            int iIntValue = tVarE.get(i4).intValue();
            int i5 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i5;
            jArr[iIntValue] = jArrD[iIntValue][i5];
            v(arrayList, jArr);
        }
        for (int i6 = 0; i6 < aVarArr.length; i6++) {
            if (arrayList.get(i6) != null) {
                jArr[i6] = jArr[i6] * 2;
            }
        }
        v(arrayList, jArr);
        t.a aVarB2 = t.B();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            t.a aVar = (t.a) arrayList.get(i7);
            aVarB2.d(aVar == null ? t.J() : aVar.e());
        }
        return aVarB2.e();
    }

    public final long A(List<? extends c.f.a.b.e3.d1.n> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        c.f.a.b.e3.d1.n nVar = (c.f.a.b.e3.d1.n) y.c(list);
        long j2 = nVar.f7028g;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = nVar.f7029h;
        if (j3 != -9223372036854775807L) {
            return j3 - j2;
        }
        return -9223372036854775807L;
    }

    public long B() {
        return this.f8414k;
    }

    public final long C(c.f.a.b.e3.d1.o[] oVarArr, List<? extends c.f.a.b.e3.d1.n> list) {
        int i2 = this.q;
        if (i2 < oVarArr.length && oVarArr[i2].next()) {
            c.f.a.b.e3.d1.o oVar = oVarArr[this.q];
            return oVar.b() - oVar.a();
        }
        for (c.f.a.b.e3.d1.o oVar2 : oVarArr) {
            if (oVar2.next()) {
                return oVar2.b() - oVar2.a();
            }
        }
        return A(list);
    }

    public final long F(long j2) {
        long jF = (long) (this.f8411h.f() * this.f8415l);
        long jA = this.f8411h.a();
        if (jA == -9223372036854775807L || j2 == -9223372036854775807L) {
            return (long) (jF / this.p);
        }
        float f2 = j2;
        return (long) ((jF * Math.max((f2 / this.p) - jA, 0.0f)) / f2);
    }

    public final long G(long j2) {
        return (j2 > (-9223372036854775807L) ? 1 : (j2 == (-9223372036854775807L) ? 0 : -1)) != 0 && (j2 > this.f8412i ? 1 : (j2 == this.f8412i ? 0 : -1)) <= 0 ? (long) (j2 * this.f8416m) : this.f8412i;
    }

    public boolean H(long j2, List<? extends c.f.a.b.e3.d1.n> list) {
        long j3 = this.s;
        return j3 == -9223372036854775807L || j2 - j3 >= 1000 || !(list.isEmpty() || ((c.f.a.b.e3.d1.n) y.c(list)).equals(this.t));
    }

    @Override // c.f.a.b.g3.h
    public int b() {
        return this.q;
    }

    @Override // c.f.a.b.g3.e, c.f.a.b.g3.h
    public void disable() {
        this.t = null;
    }

    @Override // c.f.a.b.g3.e, c.f.a.b.g3.h
    public void enable() {
        this.s = -9223372036854775807L;
        this.t = null;
    }

    @Override // c.f.a.b.g3.e, c.f.a.b.g3.h
    public int i(long j2, List<? extends c.f.a.b.e3.d1.n> list) {
        int i2;
        int i3;
        long jB = this.f8418o.b();
        if (!H(jB, list)) {
            return list.size();
        }
        this.s = jB;
        this.t = list.isEmpty() ? null : (c.f.a.b.e3.d1.n) y.c(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jD0 = x0.d0(list.get(size - 1).f7028g - j2, this.p);
        long jB2 = B();
        if (jD0 < jB2) {
            return size;
        }
        k1 k1VarG = g(x(jB, A(list)));
        for (int i4 = 0; i4 < size; i4++) {
            c.f.a.b.e3.d1.n nVar = list.get(i4);
            k1 k1Var = nVar.f7025d;
            if (x0.d0(nVar.f7028g - j2, this.p) >= jB2 && k1Var.f9334i < k1VarG.f9334i && (i2 = k1Var.s) != -1 && i2 < 720 && (i3 = k1Var.r) != -1 && i3 < 1280 && i2 < k1VarG.s) {
                return i4;
            }
        }
        return size;
    }

    @Override // c.f.a.b.g3.h
    public void k(long j2, long j3, long j4, List<? extends c.f.a.b.e3.d1.n> list, c.f.a.b.e3.d1.o[] oVarArr) {
        long jB = this.f8418o.b();
        long jC = C(oVarArr, list);
        int i2 = this.r;
        if (i2 == 0) {
            this.r = 1;
            this.q = x(jB, jC);
            return;
        }
        int i3 = this.q;
        int iJ = list.isEmpty() ? -1 : j(((c.f.a.b.e3.d1.n) y.c(list)).f7025d);
        if (iJ != -1) {
            i2 = ((c.f.a.b.e3.d1.n) y.c(list)).f7026e;
            i3 = iJ;
        }
        int iX = x(jB, jC);
        if (!d(i3, jB)) {
            k1 k1VarG = g(i3);
            k1 k1VarG2 = g(iX);
            if ((k1VarG2.f9334i > k1VarG.f9334i && j3 < G(j4)) || (k1VarG2.f9334i < k1VarG.f9334i && j3 >= this.f8413j)) {
                iX = i3;
            }
        }
        if (iX != i3) {
            i2 = 3;
        }
        this.r = i2;
        this.q = iX;
    }

    @Override // c.f.a.b.g3.h
    public int n() {
        return this.r;
    }

    @Override // c.f.a.b.g3.e, c.f.a.b.g3.h
    public void o(float f2) {
        this.p = f2;
    }

    @Override // c.f.a.b.g3.h
    public Object p() {
        return null;
    }

    public boolean w(k1 k1Var, int i2, long j2) {
        return ((long) i2) <= j2;
    }

    public final int x(long j2, long j3) {
        long jZ = z(j3);
        int i2 = 0;
        for (int i3 = 0; i3 < this.f8428b; i3++) {
            if (j2 == Long.MIN_VALUE || !d(i3, j2)) {
                k1 k1VarG = g(i3);
                if (w(k1VarG, k1VarG.f9334i, jZ)) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    public final long z(long j2) {
        long jF = F(j2);
        if (this.f8417n.isEmpty()) {
            return jF;
        }
        int i2 = 1;
        while (i2 < this.f8417n.size() - 1 && this.f8417n.get(i2).f8419a < jF) {
            i2++;
        }
        a aVar = this.f8417n.get(i2 - 1);
        a aVar2 = this.f8417n.get(i2);
        long j3 = aVar.f8419a;
        float f2 = (jF - j3) / (aVar2.f8419a - j3);
        return aVar.f8420b + ((long) (f2 * (aVar2.f8420b - r2)));
    }
}
