package c.f.a.b.z2.j0;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import c.f.a.b.j3.e0;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.u0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import c.f.a.b.k1;
import c.f.a.b.w1;
import c.f.a.b.x2.w;
import c.f.a.b.z2.a0;
import c.f.a.b.z2.j0.e;
import c.f.a.b.z2.t;
import c.f.a.b.z2.x;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes2.dex */
public class i implements c.f.a.b.z2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.b.z2.o f10934a = new c.f.a.b.z2.o() { // from class: c.f.a.b.z2.j0.a
        @Override // c.f.a.b.z2.o
        public final c.f.a.b.z2.j[] a() {
            return i.k();
        }

        @Override // c.f.a.b.z2.o
        public /* synthetic */ c.f.a.b.z2.j[] b(Uri uri, Map map) {
            return c.f.a.b.z2.n.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f10935b = {-94, 57, 79, 82, 90, -101, 79, DateTimeFieldType.SECOND_OF_DAY, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k1 f10936c = new k1.b().e0("application/x-emsg").E();
    public long A;
    public long B;
    public b C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public c.f.a.b.z2.l H;
    public a0[] I;
    public a0[] J;
    public boolean K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f10938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<k1> f10939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray<b> f10940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i0 f10941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i0 f10942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i0 f10943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f10944k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i0 f10945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u0 f10946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c.f.a.b.b3.j.c f10947n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i0 f10948o;
    public final ArrayDeque<e.a> p;
    public final ArrayDeque<a> q;
    public final a0 r;
    public int s;
    public int t;
    public long u;
    public int v;
    public i0 w;
    public long x;
    public int y;
    public long z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10950b;

        public a(long j2, int i2) {
            this.f10949a = j2;
            this.f10950b = i2;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a0 f10951a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public r f10954d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public g f10955e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f10956f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f10957g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f10958h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f10959i;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f10962l;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f10952b = new q();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i0 f10953c = new i0();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final i0 f10960j = new i0(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final i0 f10961k = new i0();

        public b(a0 a0Var, r rVar, g gVar) {
            this.f10951a = a0Var;
            this.f10954d = rVar;
            this.f10955e = gVar;
            j(rVar, gVar);
        }

        public int c() {
            int i2 = !this.f10962l ? this.f10954d.f11032g[this.f10956f] : this.f10952b.f11022l[this.f10956f] ? 1 : 0;
            return g() != null ? i2 | 1073741824 : i2;
        }

        public long d() {
            return !this.f10962l ? this.f10954d.f11028c[this.f10956f] : this.f10952b.f11017g[this.f10958h];
        }

        public long e() {
            return !this.f10962l ? this.f10954d.f11031f[this.f10956f] : this.f10952b.c(this.f10956f);
        }

        public int f() {
            return !this.f10962l ? this.f10954d.f11029d[this.f10956f] : this.f10952b.f11019i[this.f10956f];
        }

        public p g() {
            if (!this.f10962l) {
                return null;
            }
            int i2 = ((g) x0.i(this.f10952b.f11011a)).f10924a;
            p pVarA = this.f10952b.f11025o;
            if (pVarA == null) {
                pVarA = this.f10954d.f11026a.a(i2);
            }
            if (pVarA == null || !pVarA.f11006a) {
                return null;
            }
            return pVarA;
        }

        public boolean h() {
            this.f10956f++;
            if (!this.f10962l) {
                return false;
            }
            int i2 = this.f10957g + 1;
            this.f10957g = i2;
            int[] iArr = this.f10952b.f11018h;
            int i3 = this.f10958h;
            if (i2 != iArr[i3]) {
                return true;
            }
            this.f10958h = i3 + 1;
            this.f10957g = 0;
            return false;
        }

        public int i(int i2, int i3) {
            i0 i0Var;
            p pVarG = g();
            if (pVarG == null) {
                return 0;
            }
            int length = pVarG.f11009d;
            if (length != 0) {
                i0Var = this.f10952b.p;
            } else {
                byte[] bArr = (byte[]) x0.i(pVarG.f11010e);
                this.f10961k.N(bArr, bArr.length);
                i0 i0Var2 = this.f10961k;
                length = bArr.length;
                i0Var = i0Var2;
            }
            boolean zG = this.f10952b.g(this.f10956f);
            boolean z = zG || i3 != 0;
            this.f10960j.d()[0] = (byte) ((z ? 128 : 0) | length);
            this.f10960j.P(0);
            this.f10951a.f(this.f10960j, 1, 1);
            this.f10951a.f(i0Var, length, 1);
            if (!z) {
                return length + 1;
            }
            if (!zG) {
                this.f10953c.L(8);
                byte[] bArrD = this.f10953c.d();
                bArrD[0] = 0;
                bArrD[1] = 1;
                bArrD[2] = (byte) ((i3 >> 8) & 255);
                bArrD[3] = (byte) (i3 & 255);
                bArrD[4] = (byte) ((i2 >> 24) & 255);
                bArrD[5] = (byte) ((i2 >> 16) & 255);
                bArrD[6] = (byte) ((i2 >> 8) & 255);
                bArrD[7] = (byte) (i2 & 255);
                this.f10951a.f(this.f10953c, 8, 1);
                return length + 1 + 8;
            }
            i0 i0Var3 = this.f10952b.p;
            int iJ = i0Var3.J();
            i0Var3.Q(-2);
            int i4 = (iJ * 6) + 2;
            if (i3 != 0) {
                this.f10953c.L(i4);
                byte[] bArrD2 = this.f10953c.d();
                i0Var3.j(bArrD2, 0, i4);
                int i5 = (((bArrD2[2] & 255) << 8) | (bArrD2[3] & 255)) + i3;
                bArrD2[2] = (byte) ((i5 >> 8) & 255);
                bArrD2[3] = (byte) (i5 & 255);
                i0Var3 = this.f10953c;
            }
            this.f10951a.f(i0Var3, i4, 1);
            return length + 1 + i4;
        }

        public void j(r rVar, g gVar) {
            this.f10954d = rVar;
            this.f10955e = gVar;
            this.f10951a.e(rVar.f11026a.f11000f);
            k();
        }

        public void k() {
            this.f10952b.f();
            this.f10956f = 0;
            this.f10958h = 0;
            this.f10957g = 0;
            this.f10959i = 0;
            this.f10962l = false;
        }

        public void l(long j2) {
            int i2 = this.f10956f;
            while (true) {
                q qVar = this.f10952b;
                if (i2 >= qVar.f11016f || qVar.c(i2) >= j2) {
                    return;
                }
                if (this.f10952b.f11022l[i2]) {
                    this.f10959i = i2;
                }
                i2++;
            }
        }

        public void m() {
            p pVarG = g();
            if (pVarG == null) {
                return;
            }
            i0 i0Var = this.f10952b.p;
            int i2 = pVarG.f11009d;
            if (i2 != 0) {
                i0Var.Q(i2);
            }
            if (this.f10952b.g(this.f10956f)) {
                i0Var.Q(i0Var.J() * 6);
            }
        }

        public void n(w wVar) {
            p pVarA = this.f10954d.f11026a.a(((g) x0.i(this.f10952b.f11011a)).f10924a);
            this.f10951a.e(this.f10954d.f11026a.f11000f.b().L(wVar.d(pVarA != null ? pVarA.f11007b : null)).E());
        }
    }

    public i() {
        this(0);
    }

    public i(int i2) {
        this(i2, null);
    }

    public i(int i2, u0 u0Var) {
        this(i2, u0Var, null, Collections.emptyList());
    }

    public i(int i2, u0 u0Var, o oVar) {
        this(i2, u0Var, oVar, Collections.emptyList());
    }

    public i(int i2, u0 u0Var, o oVar, List<k1> list) {
        this(i2, u0Var, oVar, list, null);
    }

    public i(int i2, u0 u0Var, o oVar, List<k1> list, a0 a0Var) {
        this.f10937d = i2;
        this.f10946m = u0Var;
        this.f10938e = oVar;
        this.f10939f = Collections.unmodifiableList(list);
        this.r = a0Var;
        this.f10947n = new c.f.a.b.b3.j.c();
        this.f10948o = new i0(16);
        this.f10941h = new i0(e0.f9165a);
        this.f10942i = new i0(5);
        this.f10943j = new i0();
        byte[] bArr = new byte[16];
        this.f10944k = bArr;
        this.f10945l = new i0(bArr);
        this.p = new ArrayDeque<>();
        this.q = new ArrayDeque<>();
        this.f10940g = new SparseArray<>();
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.H = c.f.a.b.z2.l.b0;
        this.I = new a0[0];
        this.J = new a0[0];
    }

    public static long A(i0 i0Var) {
        i0Var.P(8);
        return e.c(i0Var.n()) == 1 ? i0Var.I() : i0Var.F();
    }

    public static b B(i0 i0Var, SparseArray<b> sparseArray, boolean z) {
        i0Var.P(8);
        int iB = e.b(i0Var.n());
        b bVarValueAt = z ? sparseArray.valueAt(0) : sparseArray.get(i0Var.n());
        if (bVarValueAt == null) {
            return null;
        }
        if ((iB & 1) != 0) {
            long jI = i0Var.I();
            q qVar = bVarValueAt.f10952b;
            qVar.f11013c = jI;
            qVar.f11014d = jI;
        }
        g gVar = bVarValueAt.f10955e;
        bVarValueAt.f10952b.f11011a = new g((iB & 2) != 0 ? i0Var.n() - 1 : gVar.f10924a, (iB & 8) != 0 ? i0Var.n() : gVar.f10925b, (iB & 16) != 0 ? i0Var.n() : gVar.f10926c, (iB & 32) != 0 ? i0Var.n() : gVar.f10927d);
        return bVarValueAt;
    }

    public static void C(e.a aVar, SparseArray<b> sparseArray, boolean z, int i2, byte[] bArr) throws w1 {
        b bVarB = B(((e.b) c.f.a.b.j3.g.e(aVar.g(1952868452))).f10898b, sparseArray, z);
        if (bVarB == null) {
            return;
        }
        q qVar = bVarB.f10952b;
        long j2 = qVar.r;
        boolean z2 = qVar.s;
        bVarB.k();
        bVarB.f10962l = true;
        e.b bVarG = aVar.g(1952867444);
        if (bVarG == null || (i2 & 2) != 0) {
            qVar.r = j2;
            qVar.s = z2;
        } else {
            qVar.r = A(bVarG.f10898b);
            qVar.s = true;
        }
        F(aVar, bVarB, i2);
        p pVarA = bVarB.f10954d.f11026a.a(((g) c.f.a.b.j3.g.e(qVar.f11011a)).f10924a);
        e.b bVarG2 = aVar.g(1935763834);
        if (bVarG2 != null) {
            v((p) c.f.a.b.j3.g.e(pVarA), bVarG2.f10898b, qVar);
        }
        e.b bVarG3 = aVar.g(1935763823);
        if (bVarG3 != null) {
            u(bVarG3.f10898b, qVar);
        }
        e.b bVarG4 = aVar.g(1936027235);
        if (bVarG4 != null) {
            y(bVarG4.f10898b, qVar);
        }
        w(aVar, pVarA != null ? pVarA.f11007b : null, qVar);
        int size = aVar.f10896c.size();
        for (int i3 = 0; i3 < size; i3++) {
            e.b bVar = aVar.f10896c.get(i3);
            if (bVar.f10894a == 1970628964) {
                G(bVar.f10898b, qVar, bArr);
            }
        }
    }

    public static Pair<Integer, g> D(i0 i0Var) {
        i0Var.P(12);
        return Pair.create(Integer.valueOf(i0Var.n()), new g(i0Var.n() - 1, i0Var.n(), i0Var.n(), i0Var.n()));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int E(c.f.a.b.z2.j0.i.b r36, int r37, int r38, c.f.a.b.j3.i0 r39, int r40) throws c.f.a.b.w1 {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.j0.i.E(c.f.a.b.z2.j0.i$b, int, int, c.f.a.b.j3.i0, int):int");
    }

    public static void F(e.a aVar, b bVar, int i2) throws w1 {
        List<e.b> list = aVar.f10896c;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            e.b bVar2 = list.get(i5);
            if (bVar2.f10894a == 1953658222) {
                i0 i0Var = bVar2.f10898b;
                i0Var.P(12);
                int iH = i0Var.H();
                if (iH > 0) {
                    i4 += iH;
                    i3++;
                }
            }
        }
        bVar.f10958h = 0;
        bVar.f10957g = 0;
        bVar.f10956f = 0;
        bVar.f10952b.e(i3, i4);
        int i6 = 0;
        int iE = 0;
        for (int i7 = 0; i7 < size; i7++) {
            e.b bVar3 = list.get(i7);
            if (bVar3.f10894a == 1953658222) {
                iE = E(bVar, i6, i2, bVar3.f10898b, iE);
                i6++;
            }
        }
    }

    public static void G(i0 i0Var, q qVar, byte[] bArr) throws w1 {
        i0Var.P(8);
        i0Var.j(bArr, 0, 16);
        if (Arrays.equals(bArr, f10935b)) {
            x(i0Var, 16, qVar);
        }
    }

    public static boolean M(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1836019558 || i2 == 1953653094 || i2 == 1836475768 || i2 == 1701082227;
    }

    public static boolean N(int i2) {
        return i2 == 1751411826 || i2 == 1835296868 || i2 == 1836476516 || i2 == 1936286840 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1668576371 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1937011571 || i2 == 1952867444 || i2 == 1952868452 || i2 == 1953196132 || i2 == 1953654136 || i2 == 1953658222 || i2 == 1886614376 || i2 == 1935763834 || i2 == 1935763823 || i2 == 1936027235 || i2 == 1970628964 || i2 == 1935828848 || i2 == 1936158820 || i2 == 1701606260 || i2 == 1835362404 || i2 == 1701671783;
    }

    public static int b(int i2) throws w1 {
        if (i2 >= 0) {
            return i2;
        }
        throw w1.a("Unexpected negative value: " + i2, null);
    }

    public static w h(List<e.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            e.b bVar = list.get(i2);
            if (bVar.f10894a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrD = bVar.f10898b.d();
                UUID uuidF = l.f(bArrD);
                if (uuidF == null) {
                    z.i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new w.b(uuidF, "video/mp4", bArrD));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new w(arrayList);
    }

    public static b i(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            b bVarValueAt = sparseArray.valueAt(i2);
            if ((bVarValueAt.f10962l || bVarValueAt.f10956f != bVarValueAt.f10954d.f11027b) && (!bVarValueAt.f10962l || bVarValueAt.f10958h != bVarValueAt.f10952b.f11015e)) {
                long jD = bVarValueAt.d();
                if (jD < j2) {
                    bVar = bVarValueAt;
                    j2 = jD;
                }
            }
        }
        return bVar;
    }

    public static /* synthetic */ c.f.a.b.z2.j[] k() {
        return new c.f.a.b.z2.j[]{new i()};
    }

    public static long s(i0 i0Var) {
        i0Var.P(8);
        return e.c(i0Var.n()) == 0 ? i0Var.F() : i0Var.I();
    }

    public static void t(e.a aVar, SparseArray<b> sparseArray, boolean z, int i2, byte[] bArr) throws w1 {
        int size = aVar.f10897d.size();
        for (int i3 = 0; i3 < size; i3++) {
            e.a aVar2 = aVar.f10897d.get(i3);
            if (aVar2.f10894a == 1953653094) {
                C(aVar2, sparseArray, z, i2, bArr);
            }
        }
    }

    public static void u(i0 i0Var, q qVar) throws w1 {
        i0Var.P(8);
        int iN = i0Var.n();
        if ((e.b(iN) & 1) == 1) {
            i0Var.Q(8);
        }
        int iH = i0Var.H();
        if (iH == 1) {
            qVar.f11014d += e.c(iN) == 0 ? i0Var.F() : i0Var.I();
        } else {
            throw w1.a("Unexpected saio entry count: " + iH, null);
        }
    }

    public static void v(p pVar, i0 i0Var, q qVar) throws w1 {
        int i2;
        int i3 = pVar.f11009d;
        i0Var.P(8);
        if ((e.b(i0Var.n()) & 1) == 1) {
            i0Var.Q(8);
        }
        int iD = i0Var.D();
        int iH = i0Var.H();
        if (iH > qVar.f11016f) {
            throw w1.a("Saiz sample count " + iH + " is greater than fragment sample count" + qVar.f11016f, null);
        }
        if (iD == 0) {
            boolean[] zArr = qVar.f11024n;
            i2 = 0;
            for (int i4 = 0; i4 < iH; i4++) {
                int iD2 = i0Var.D();
                i2 += iD2;
                zArr[i4] = iD2 > i3;
            }
        } else {
            i2 = (iD * iH) + 0;
            Arrays.fill(qVar.f11024n, 0, iH, iD > i3);
        }
        Arrays.fill(qVar.f11024n, iH, qVar.f11016f, false);
        if (i2 > 0) {
            qVar.d(i2);
        }
    }

    public static void w(e.a aVar, String str, q qVar) throws w1 {
        byte[] bArr = null;
        i0 i0Var = null;
        i0 i0Var2 = null;
        for (int i2 = 0; i2 < aVar.f10896c.size(); i2++) {
            e.b bVar = aVar.f10896c.get(i2);
            i0 i0Var3 = bVar.f10898b;
            int i3 = bVar.f10894a;
            if (i3 == 1935828848) {
                i0Var3.P(12);
                if (i0Var3.n() == 1936025959) {
                    i0Var = i0Var3;
                }
            } else if (i3 == 1936158820) {
                i0Var3.P(12);
                if (i0Var3.n() == 1936025959) {
                    i0Var2 = i0Var3;
                }
            }
        }
        if (i0Var == null || i0Var2 == null) {
            return;
        }
        i0Var.P(8);
        int iC = e.c(i0Var.n());
        i0Var.Q(4);
        if (iC == 1) {
            i0Var.Q(4);
        }
        if (i0Var.n() != 1) {
            throw w1.e("Entry count in sbgp != 1 (unsupported).");
        }
        i0Var2.P(8);
        int iC2 = e.c(i0Var2.n());
        i0Var2.Q(4);
        if (iC2 == 1) {
            if (i0Var2.F() == 0) {
                throw w1.e("Variable length description in sgpd found (unsupported)");
            }
        } else if (iC2 >= 2) {
            i0Var2.Q(4);
        }
        if (i0Var2.F() != 1) {
            throw w1.e("Entry count in sgpd != 1 (unsupported).");
        }
        i0Var2.Q(1);
        int iD = i0Var2.D();
        int i4 = (iD & 240) >> 4;
        int i5 = iD & 15;
        boolean z = i0Var2.D() == 1;
        if (z) {
            int iD2 = i0Var2.D();
            byte[] bArr2 = new byte[16];
            i0Var2.j(bArr2, 0, 16);
            if (iD2 == 0) {
                int iD3 = i0Var2.D();
                bArr = new byte[iD3];
                i0Var2.j(bArr, 0, iD3);
            }
            qVar.f11023m = true;
            qVar.f11025o = new p(z, str, iD2, bArr2, i4, i5, bArr);
        }
    }

    public static void x(i0 i0Var, int i2, q qVar) throws w1 {
        i0Var.P(i2 + 8);
        int iB = e.b(i0Var.n());
        if ((iB & 1) != 0) {
            throw w1.e("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iB & 2) != 0;
        int iH = i0Var.H();
        if (iH == 0) {
            Arrays.fill(qVar.f11024n, 0, qVar.f11016f, false);
            return;
        }
        if (iH == qVar.f11016f) {
            Arrays.fill(qVar.f11024n, 0, iH, z);
            qVar.d(i0Var.a());
            qVar.b(i0Var);
        } else {
            throw w1.a("Senc sample count " + iH + " is different from fragment sample count" + qVar.f11016f, null);
        }
    }

    public static void y(i0 i0Var, q qVar) throws w1 {
        x(i0Var, 0, qVar);
    }

    public static Pair<Long, c.f.a.b.z2.e> z(i0 i0Var, long j2) throws w1 {
        long jI;
        long jI2;
        i0Var.P(8);
        int iC = e.c(i0Var.n());
        i0Var.Q(4);
        long jF = i0Var.F();
        if (iC == 0) {
            jI = i0Var.F();
            jI2 = i0Var.F();
        } else {
            jI = i0Var.I();
            jI2 = i0Var.I();
        }
        long j3 = jI;
        long j4 = j2 + jI2;
        long jP0 = x0.P0(j3, 1000000L, jF);
        i0Var.Q(2);
        int iJ = i0Var.J();
        int[] iArr = new int[iJ];
        long[] jArr = new long[iJ];
        long[] jArr2 = new long[iJ];
        long[] jArr3 = new long[iJ];
        long j5 = j3;
        long j6 = jP0;
        int i2 = 0;
        while (i2 < iJ) {
            int iN = i0Var.n();
            if ((iN & Integer.MIN_VALUE) != 0) {
                throw w1.a("Unhandled indirect reference", null);
            }
            long jF2 = i0Var.F();
            iArr[i2] = iN & Integer.MAX_VALUE;
            jArr[i2] = j4;
            jArr3[i2] = j6;
            long j7 = j5 + jF2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i3 = iJ;
            int[] iArr2 = iArr;
            long jP02 = x0.P0(j7, 1000000L, jF);
            jArr4[i2] = jP02 - jArr5[i2];
            i0Var.Q(4);
            j4 += (long) iArr2[i2];
            i2++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            iJ = i3;
            j5 = j7;
            j6 = jP02;
        }
        return Pair.create(Long.valueOf(jP0), new c.f.a.b.z2.e(iArr, jArr, jArr2, jArr3));
    }

    public final void H(long j2) throws w1 {
        while (!this.p.isEmpty() && this.p.peek().f10895b == j2) {
            m(this.p.pop());
        }
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I(c.f.a.b.z2.k r12) throws c.f.a.b.w1 {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.j0.i.I(c.f.a.b.z2.k):boolean");
    }

    public final void J(c.f.a.b.z2.k kVar) throws w1 {
        int i2 = ((int) this.u) - this.v;
        i0 i0Var = this.w;
        if (i0Var != null) {
            kVar.l(i0Var.d(), 8, i2);
            o(new e.b(this.t, i0Var), kVar.getPosition());
        } else {
            kVar.s(i2);
        }
        H(kVar.getPosition());
    }

    public final void K(c.f.a.b.z2.k kVar) throws w1 {
        int size = this.f10940g.size();
        long j2 = Long.MAX_VALUE;
        b bVarValueAt = null;
        for (int i2 = 0; i2 < size; i2++) {
            q qVar = this.f10940g.valueAt(i2).f10952b;
            if (qVar.q) {
                long j3 = qVar.f11014d;
                if (j3 < j2) {
                    bVarValueAt = this.f10940g.valueAt(i2);
                    j2 = j3;
                }
            }
        }
        if (bVarValueAt == null) {
            this.s = 3;
            return;
        }
        int position = (int) (j2 - kVar.getPosition());
        if (position < 0) {
            throw w1.a("Offset to encryption data was negative.", null);
        }
        kVar.s(position);
        bVarValueAt.f10952b.a(kVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean L(c.f.a.b.z2.k kVar) throws w1 {
        int iB;
        int i2;
        b bVarI = this.C;
        Throwable th = null;
        if (bVarI == null) {
            bVarI = i(this.f10940g);
            if (bVarI == null) {
                int position = (int) (this.x - kVar.getPosition());
                if (position < 0) {
                    throw w1.a("Offset to end of mdat was negative.", null);
                }
                kVar.s(position);
                d();
                return false;
            }
            int iD = (int) (bVarI.d() - kVar.getPosition());
            if (iD < 0) {
                z.i("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iD = 0;
            }
            kVar.s(iD);
            this.C = bVarI;
        }
        int i3 = 4;
        int i4 = 1;
        if (this.s == 3) {
            int iF = bVarI.f();
            this.D = iF;
            if (bVarI.f10956f < bVarI.f10959i) {
                kVar.s(iF);
                bVarI.m();
                if (!bVarI.h()) {
                    this.C = null;
                }
                this.s = 3;
                return true;
            }
            if (bVarI.f10954d.f11026a.f11001g == 1) {
                this.D = iF - 8;
                kVar.s(8);
            }
            if ("audio/ac4".equals(bVarI.f10954d.f11026a.f11000f.f9338m)) {
                this.E = bVarI.i(this.D, 7);
                c.f.a.b.t2.o.a(this.D, this.f10945l);
                bVarI.f10951a.c(this.f10945l, 7);
                i2 = this.E + 7;
            } else {
                i2 = bVarI.i(this.D, 0);
            }
            this.E = i2;
            this.D += this.E;
            this.s = 4;
            this.F = 0;
        }
        o oVar = bVarI.f10954d.f11026a;
        a0 a0Var = bVarI.f10951a;
        long jE = bVarI.e();
        u0 u0Var = this.f10946m;
        if (u0Var != null) {
            jE = u0Var.a(jE);
        }
        long j2 = jE;
        if (oVar.f11004j == 0) {
            while (true) {
                int i5 = this.E;
                int i6 = this.D;
                if (i5 >= i6) {
                    break;
                }
                this.E += a0Var.b(kVar, i6 - i5, false);
            }
        } else {
            byte[] bArrD = this.f10942i.d();
            bArrD[0] = 0;
            bArrD[1] = 0;
            bArrD[2] = 0;
            int i7 = oVar.f11004j;
            int i8 = i7 + 1;
            int i9 = 4 - i7;
            while (this.E < this.D) {
                int i10 = this.F;
                if (i10 == 0) {
                    kVar.l(bArrD, i9, i8);
                    this.f10942i.P(0);
                    int iN = this.f10942i.n();
                    if (iN < i4) {
                        throw w1.a("Invalid NAL length", th);
                    }
                    this.F = iN - 1;
                    this.f10941h.P(0);
                    a0Var.c(this.f10941h, i3);
                    a0Var.c(this.f10942i, i4);
                    this.G = this.J.length > 0 && e0.g(oVar.f11000f.f9338m, bArrD[i3]);
                    this.E += 5;
                    this.D += i9;
                } else {
                    if (this.G) {
                        this.f10943j.L(i10);
                        kVar.l(this.f10943j.d(), 0, this.F);
                        a0Var.c(this.f10943j, this.F);
                        iB = this.F;
                        int iK = e0.k(this.f10943j.d(), this.f10943j.f());
                        this.f10943j.P("video/hevc".equals(oVar.f11000f.f9338m) ? 1 : 0);
                        this.f10943j.O(iK);
                        c.f.a.b.z2.d.a(j2, this.f10943j, this.J);
                    } else {
                        iB = a0Var.b(kVar, i10, false);
                    }
                    this.E += iB;
                    this.F -= iB;
                    th = null;
                    i3 = 4;
                    i4 = 1;
                }
            }
        }
        int iC = bVarI.c();
        p pVarG = bVarI.g();
        a0Var.d(j2, iC, this.D, 0, pVarG != null ? pVarG.f11008c : null);
        r(j2);
        if (!bVarI.h()) {
            this.C = null;
        }
        this.s = 3;
        return true;
    }

    @Override // c.f.a.b.z2.j
    public void a(long j2, long j3) {
        int size = this.f10940g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f10940g.valueAt(i2).k();
        }
        this.q.clear();
        this.y = 0;
        this.z = j3;
        this.p.clear();
        d();
    }

    @Override // c.f.a.b.z2.j
    public void c(c.f.a.b.z2.l lVar) {
        this.H = lVar;
        d();
        j();
        o oVar = this.f10938e;
        if (oVar != null) {
            this.f10940g.put(0, new b(lVar.e(0, oVar.f10996b), new r(this.f10938e, new long[0], new int[0], 0, new long[0], new int[0], 0L), new g(0, 0, 0, 0)));
            this.H.p();
        }
    }

    public final void d() {
        this.s = 0;
        this.v = 0;
    }

    @Override // c.f.a.b.z2.j
    public boolean e(c.f.a.b.z2.k kVar) {
        return n.b(kVar);
    }

    public final g f(SparseArray<g> sparseArray, int i2) {
        return (g) (sparseArray.size() == 1 ? sparseArray.valueAt(0) : c.f.a.b.j3.g.e(sparseArray.get(i2)));
    }

    @Override // c.f.a.b.z2.j
    public int g(c.f.a.b.z2.k kVar, c.f.a.b.z2.w wVar) throws w1 {
        while (true) {
            int i2 = this.s;
            if (i2 != 0) {
                if (i2 == 1) {
                    J(kVar);
                } else if (i2 == 2) {
                    K(kVar);
                } else if (L(kVar)) {
                    return 0;
                }
            } else if (!I(kVar)) {
                return -1;
            }
        }
    }

    public final void j() {
        int i2;
        a0[] a0VarArr = new a0[2];
        this.I = a0VarArr;
        a0 a0Var = this.r;
        int i3 = 0;
        if (a0Var != null) {
            a0VarArr[0] = a0Var;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = 100;
        if ((this.f10937d & 4) != 0) {
            a0VarArr[i2] = this.H.e(100, 5);
            i2++;
            i4 = 101;
        }
        a0[] a0VarArr2 = (a0[]) x0.G0(this.I, i2);
        this.I = a0VarArr2;
        for (a0 a0Var2 : a0VarArr2) {
            a0Var2.e(f10936c);
        }
        this.J = new a0[this.f10939f.size()];
        while (i3 < this.J.length) {
            a0 a0VarE = this.H.e(i4, 3);
            a0VarE.e(this.f10939f.get(i3));
            this.J[i3] = a0VarE;
            i3++;
            i4++;
        }
    }

    public o l(o oVar) {
        return oVar;
    }

    public final void m(e.a aVar) throws w1 {
        int i2 = aVar.f10894a;
        if (i2 == 1836019574) {
            q(aVar);
        } else if (i2 == 1836019558) {
            p(aVar);
        } else {
            if (this.p.isEmpty()) {
                return;
            }
            this.p.peek().d(aVar);
        }
    }

    public final void n(i0 i0Var) {
        long jP0;
        String str;
        long jP02;
        String str2;
        long jF;
        long jA;
        if (this.I.length == 0) {
            return;
        }
        i0Var.P(8);
        int iC = e.c(i0Var.n());
        if (iC == 0) {
            String str3 = (String) c.f.a.b.j3.g.e(i0Var.x());
            String str4 = (String) c.f.a.b.j3.g.e(i0Var.x());
            long jF2 = i0Var.F();
            jP0 = x0.P0(i0Var.F(), 1000000L, jF2);
            long j2 = this.B;
            long j3 = j2 != -9223372036854775807L ? j2 + jP0 : -9223372036854775807L;
            str = str3;
            jP02 = x0.P0(i0Var.F(), 1000L, jF2);
            str2 = str4;
            jF = i0Var.F();
            jA = j3;
        } else {
            if (iC != 1) {
                z.i("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iC);
                return;
            }
            long jF3 = i0Var.F();
            jA = x0.P0(i0Var.I(), 1000000L, jF3);
            long jP03 = x0.P0(i0Var.F(), 1000L, jF3);
            long jF4 = i0Var.F();
            str = (String) c.f.a.b.j3.g.e(i0Var.x());
            jP02 = jP03;
            jF = jF4;
            str2 = (String) c.f.a.b.j3.g.e(i0Var.x());
            jP0 = -9223372036854775807L;
        }
        byte[] bArr = new byte[i0Var.a()];
        i0Var.j(bArr, 0, i0Var.a());
        i0 i0Var2 = new i0(this.f10947n.a(new c.f.a.b.b3.j.a(str, str2, jP02, jF, bArr)));
        int iA = i0Var2.a();
        for (a0 a0Var : this.I) {
            i0Var2.P(0);
            a0Var.c(i0Var2, iA);
        }
        if (jA == -9223372036854775807L) {
            this.q.addLast(new a(jP0, iA));
            this.y += iA;
            return;
        }
        u0 u0Var = this.f10946m;
        if (u0Var != null) {
            jA = u0Var.a(jA);
        }
        for (a0 a0Var2 : this.I) {
            a0Var2.d(jA, 1, iA, 0, null);
        }
    }

    public final void o(e.b bVar, long j2) throws w1 {
        if (!this.p.isEmpty()) {
            this.p.peek().e(bVar);
            return;
        }
        int i2 = bVar.f10894a;
        if (i2 != 1936286840) {
            if (i2 == 1701671783) {
                n(bVar.f10898b);
            }
        } else {
            Pair<Long, c.f.a.b.z2.e> pairZ = z(bVar.f10898b, j2);
            this.B = ((Long) pairZ.first).longValue();
            this.H.i((x) pairZ.second);
            this.K = true;
        }
    }

    public final void p(e.a aVar) throws w1 {
        t(aVar, this.f10940g, this.f10938e != null, this.f10937d, this.f10944k);
        w wVarH = h(aVar.f10896c);
        if (wVarH != null) {
            int size = this.f10940g.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f10940g.valueAt(i2).n(wVarH);
            }
        }
        if (this.z != -9223372036854775807L) {
            int size2 = this.f10940g.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.f10940g.valueAt(i3).l(this.z);
            }
            this.z = -9223372036854775807L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(e.a aVar) {
        int i2 = 0;
        c.f.a.b.j3.g.h(this.f10938e == null, "Unexpected moov box.");
        w wVarH = h(aVar.f10896c);
        e.a aVar2 = (e.a) c.f.a.b.j3.g.e(aVar.f(1836475768));
        SparseArray sparseArray = new SparseArray();
        int size = aVar2.f10896c.size();
        long jS = -9223372036854775807L;
        for (int i3 = 0; i3 < size; i3++) {
            e.b bVar = aVar2.f10896c.get(i3);
            int i4 = bVar.f10894a;
            if (i4 == 1953654136) {
                Pair<Integer, g> pairD = D(bVar.f10898b);
                sparseArray.put(((Integer) pairD.first).intValue(), pairD.second);
            } else if (i4 == 1835362404) {
                jS = s(bVar.f10898b);
            }
        }
        List<r> listZ = f.z(aVar, new t(), jS, wVarH, (this.f10937d & 16) != 0, false, new c.f.b.a.f() { // from class: c.f.a.b.z2.j0.d
            @Override // c.f.b.a.f
            public final Object apply(Object obj) {
                return this.f10893b.l((o) obj);
            }
        });
        int size2 = listZ.size();
        if (this.f10940g.size() != 0) {
            c.f.a.b.j3.g.g(this.f10940g.size() == size2);
            while (i2 < size2) {
                r rVar = listZ.get(i2);
                o oVar = rVar.f11026a;
                this.f10940g.get(oVar.f10995a).j(rVar, f(sparseArray, oVar.f10995a));
                i2++;
            }
            return;
        }
        while (i2 < size2) {
            r rVar2 = listZ.get(i2);
            o oVar2 = rVar2.f11026a;
            this.f10940g.put(oVar2.f10995a, new b(this.H.e(i2, oVar2.f10996b), rVar2, f(sparseArray, oVar2.f10995a)));
            this.A = Math.max(this.A, oVar2.f10999e);
            i2++;
        }
        this.H.p();
    }

    public final void r(long j2) {
        while (!this.q.isEmpty()) {
            a aVarRemoveFirst = this.q.removeFirst();
            this.y -= aVarRemoveFirst.f10950b;
            long jA = aVarRemoveFirst.f10949a + j2;
            u0 u0Var = this.f10946m;
            if (u0Var != null) {
                jA = u0Var.a(jA);
            }
            for (a0 a0Var : this.I) {
                a0Var.d(jA, 1, aVarRemoveFirst.f10950b, this.y, null);
            }
        }
    }

    @Override // c.f.a.b.z2.j
    public void release() {
    }
}
