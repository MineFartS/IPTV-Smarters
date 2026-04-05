package c.f.a.b.z2.m0;

import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.z2.m0.i0;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f11367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.f.a.b.z2.a0 f11369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f11370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11371e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11379m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f11372f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f11373g = new w(32, 128);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f11374h = new w(33, 128);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f11375i = new w(34, 128);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w f11376j = new w(39, 128);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w f11377k = new w(40, 128);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f11380n = new c.f.a.b.j3.i0();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.f.a.b.z2.a0 f11381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f11382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f11383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f11384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f11385e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f11386f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f11387g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f11388h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f11389i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f11390j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f11391k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f11392l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f11393m;

        public a(c.f.a.b.z2.a0 a0Var) {
            this.f11381a = a0Var;
        }

        public static boolean b(int i2) {
            return (32 <= i2 && i2 <= 35) || i2 == 39;
        }

        public static boolean c(int i2) {
            return i2 < 32 || i2 == 40;
        }

        public void a(long j2, int i2, boolean z) {
            if (this.f11390j && this.f11387g) {
                this.f11393m = this.f11383c;
                this.f11390j = false;
            } else if (this.f11388h || this.f11387g) {
                if (z && this.f11389i) {
                    d(i2 + ((int) (j2 - this.f11382b)));
                }
                this.f11391k = this.f11382b;
                this.f11392l = this.f11385e;
                this.f11393m = this.f11383c;
                this.f11389i = true;
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void d(int i2) {
            boolean z = this.f11393m;
            this.f11381a.d(this.f11392l, z ? 1 : 0, (int) (this.f11382b - this.f11391k), i2, null);
        }

        public void e(byte[] bArr, int i2, int i3) {
            if (this.f11386f) {
                int i4 = this.f11384d;
                int i5 = (i2 + 2) - i4;
                if (i5 >= i3) {
                    this.f11384d = i4 + (i3 - i2);
                } else {
                    this.f11387g = (bArr[i5] & 128) != 0;
                    this.f11386f = false;
                }
            }
        }

        public void f() {
            this.f11386f = false;
            this.f11387g = false;
            this.f11388h = false;
            this.f11389i = false;
            this.f11390j = false;
        }

        public void g(long j2, int i2, int i3, long j3, boolean z) {
            this.f11387g = false;
            this.f11388h = false;
            this.f11385e = j3;
            this.f11384d = 0;
            this.f11382b = j2;
            if (!c(i3)) {
                if (this.f11389i && !this.f11390j) {
                    if (z) {
                        d(i2);
                    }
                    this.f11389i = false;
                }
                if (b(i3)) {
                    this.f11388h = !this.f11390j;
                    this.f11390j = true;
                }
            }
            boolean z2 = i3 >= 16 && i3 <= 21;
            this.f11383c = z2;
            this.f11386f = z2 || i3 <= 9;
        }
    }

    public s(e0 e0Var) {
        this.f11367a = e0Var;
    }

    public static k1 i(String str, w wVar, w wVar2, w wVar3) {
        int i2 = wVar.f11431e;
        byte[] bArr = new byte[wVar2.f11431e + i2 + wVar3.f11431e];
        System.arraycopy(wVar.f11430d, 0, bArr, 0, i2);
        System.arraycopy(wVar2.f11430d, 0, bArr, wVar.f11431e, wVar2.f11431e);
        System.arraycopy(wVar3.f11430d, 0, bArr, wVar.f11431e + wVar2.f11431e, wVar3.f11431e);
        c.f.a.b.j3.j0 j0Var = new c.f.a.b.j3.j0(wVar2.f11430d, 0, wVar2.f11431e);
        j0Var.l(44);
        int iE = j0Var.e(3);
        j0Var.k();
        j0Var.l(88);
        j0Var.l(8);
        int i3 = 0;
        for (int i4 = 0; i4 < iE; i4++) {
            if (j0Var.d()) {
                i3 += 89;
            }
            if (j0Var.d()) {
                i3 += 8;
            }
        }
        j0Var.l(i3);
        if (iE > 0) {
            j0Var.l((8 - iE) * 2);
        }
        j0Var.h();
        int iH = j0Var.h();
        if (iH == 3) {
            j0Var.k();
        }
        int iH2 = j0Var.h();
        int iH3 = j0Var.h();
        if (j0Var.d()) {
            int iH4 = j0Var.h();
            int iH5 = j0Var.h();
            int iH6 = j0Var.h();
            int iH7 = j0Var.h();
            iH2 -= ((iH == 1 || iH == 2) ? 2 : 1) * (iH4 + iH5);
            iH3 -= (iH == 1 ? 2 : 1) * (iH6 + iH7);
        }
        j0Var.h();
        j0Var.h();
        int iH8 = j0Var.h();
        int i5 = j0Var.d() ? 0 : iE;
        while (true) {
            j0Var.h();
            j0Var.h();
            j0Var.h();
            if (i5 > iE) {
                break;
            }
            i5++;
        }
        j0Var.h();
        j0Var.h();
        j0Var.h();
        if (j0Var.d() && j0Var.d()) {
            j(j0Var);
        }
        j0Var.l(2);
        if (j0Var.d()) {
            j0Var.l(8);
            j0Var.h();
            j0Var.h();
            j0Var.k();
        }
        k(j0Var);
        if (j0Var.d()) {
            for (int i6 = 0; i6 < j0Var.h(); i6++) {
                j0Var.l(iH8 + 4 + 1);
            }
        }
        j0Var.l(2);
        float f2 = 1.0f;
        if (j0Var.d()) {
            if (j0Var.d()) {
                int iE2 = j0Var.e(8);
                if (iE2 == 255) {
                    int iE3 = j0Var.e(16);
                    int iE4 = j0Var.e(16);
                    if (iE3 != 0 && iE4 != 0) {
                        f2 = iE3 / iE4;
                    }
                } else {
                    float[] fArr = c.f.a.b.j3.e0.f9166b;
                    if (iE2 < fArr.length) {
                        f2 = fArr[iE2];
                    } else {
                        c.f.a.b.j3.z.i("H265Reader", "Unexpected aspect_ratio_idc value: " + iE2);
                    }
                }
            }
            if (j0Var.d()) {
                j0Var.k();
            }
            if (j0Var.d()) {
                j0Var.l(4);
                if (j0Var.d()) {
                    j0Var.l(24);
                }
            }
            if (j0Var.d()) {
                j0Var.h();
                j0Var.h();
            }
            j0Var.k();
            if (j0Var.d()) {
                iH3 *= 2;
            }
        }
        j0Var.i(wVar2.f11430d, 0, wVar2.f11431e);
        j0Var.l(24);
        return new k1.b().S(str).e0("video/hevc").I(c.f.a.b.j3.j.c(j0Var)).j0(iH2).Q(iH3).a0(f2).T(Collections.singletonList(bArr)).E();
    }

    public static void j(c.f.a.b.j3.j0 j0Var) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < 6) {
                int i4 = 1;
                if (j0Var.d()) {
                    int iMin = Math.min(64, 1 << ((i2 << 1) + 4));
                    if (i2 > 1) {
                        j0Var.g();
                    }
                    for (int i5 = 0; i5 < iMin; i5++) {
                        j0Var.g();
                    }
                } else {
                    j0Var.h();
                }
                if (i2 == 3) {
                    i4 = 3;
                }
                i3 += i4;
            }
        }
    }

    public static void k(c.f.a.b.j3.j0 j0Var) {
        int iH = j0Var.h();
        boolean zD = false;
        int i2 = 0;
        for (int i3 = 0; i3 < iH; i3++) {
            if (i3 != 0) {
                zD = j0Var.d();
            }
            if (zD) {
                j0Var.k();
                j0Var.h();
                for (int i4 = 0; i4 <= i2; i4++) {
                    if (j0Var.d()) {
                        j0Var.k();
                    }
                }
            } else {
                int iH2 = j0Var.h();
                int iH3 = j0Var.h();
                int i5 = iH2 + iH3;
                for (int i6 = 0; i6 < iH2; i6++) {
                    j0Var.h();
                    j0Var.k();
                }
                for (int i7 = 0; i7 < iH3; i7++) {
                    j0Var.h();
                    j0Var.k();
                }
                i2 = i5;
            }
        }
    }

    @EnsuresNonNull({"output", "sampleReader"})
    public final void a() {
        c.f.a.b.j3.g.i(this.f11369c);
        x0.i(this.f11370d);
    }

    @Override // c.f.a.b.z2.m0.o
    public void b(c.f.a.b.j3.i0 i0Var) {
        a();
        while (i0Var.a() > 0) {
            int iE = i0Var.e();
            int iF = i0Var.f();
            byte[] bArrD = i0Var.d();
            this.f11378l += (long) i0Var.a();
            this.f11369c.c(i0Var, i0Var.a());
            while (iE < iF) {
                int iC = c.f.a.b.j3.e0.c(bArrD, iE, iF, this.f11372f);
                if (iC == iF) {
                    h(bArrD, iE, iF);
                    return;
                }
                int iE2 = c.f.a.b.j3.e0.e(bArrD, iC);
                int i2 = iC - iE;
                if (i2 > 0) {
                    h(bArrD, iE, iC);
                }
                int i3 = iF - iC;
                long j2 = this.f11378l - ((long) i3);
                g(j2, i3, i2 < 0 ? -i2 : 0, this.f11379m);
                l(j2, i3, iE2, this.f11379m);
                iE = iC + 3;
            }
        }
    }

    @Override // c.f.a.b.z2.m0.o
    public void c() {
        this.f11378l = 0L;
        c.f.a.b.j3.e0.a(this.f11372f);
        this.f11373g.d();
        this.f11374h.d();
        this.f11375i.d();
        this.f11376j.d();
        this.f11377k.d();
        a aVar = this.f11370d;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // c.f.a.b.z2.m0.o
    public void d() {
    }

    @Override // c.f.a.b.z2.m0.o
    public void e(c.f.a.b.z2.l lVar, i0.d dVar) {
        dVar.a();
        this.f11368b = dVar.b();
        c.f.a.b.z2.a0 a0VarE = lVar.e(dVar.c(), 2);
        this.f11369c = a0VarE;
        this.f11370d = new a(a0VarE);
        this.f11367a.b(lVar, dVar);
    }

    @Override // c.f.a.b.z2.m0.o
    public void f(long j2, int i2) {
        this.f11379m = j2;
    }

    @RequiresNonNull({"output", "sampleReader"})
    public final void g(long j2, int i2, int i3, long j3) {
        this.f11370d.a(j2, i2, this.f11371e);
        if (!this.f11371e) {
            this.f11373g.b(i3);
            this.f11374h.b(i3);
            this.f11375i.b(i3);
            if (this.f11373g.c() && this.f11374h.c() && this.f11375i.c()) {
                this.f11369c.e(i(this.f11368b, this.f11373g, this.f11374h, this.f11375i));
                this.f11371e = true;
            }
        }
        if (this.f11376j.b(i3)) {
            w wVar = this.f11376j;
            this.f11380n.N(this.f11376j.f11430d, c.f.a.b.j3.e0.k(wVar.f11430d, wVar.f11431e));
            this.f11380n.Q(5);
            this.f11367a.a(j3, this.f11380n);
        }
        if (this.f11377k.b(i3)) {
            w wVar2 = this.f11377k;
            this.f11380n.N(this.f11377k.f11430d, c.f.a.b.j3.e0.k(wVar2.f11430d, wVar2.f11431e));
            this.f11380n.Q(5);
            this.f11367a.a(j3, this.f11380n);
        }
    }

    @RequiresNonNull({"sampleReader"})
    public final void h(byte[] bArr, int i2, int i3) {
        this.f11370d.e(bArr, i2, i3);
        if (!this.f11371e) {
            this.f11373g.a(bArr, i2, i3);
            this.f11374h.a(bArr, i2, i3);
            this.f11375i.a(bArr, i2, i3);
        }
        this.f11376j.a(bArr, i2, i3);
        this.f11377k.a(bArr, i2, i3);
    }

    @RequiresNonNull({"sampleReader"})
    public final void l(long j2, int i2, int i3, long j3) {
        this.f11370d.g(j2, i2, i3, j3, this.f11371e);
        if (!this.f11371e) {
            this.f11373g.e(i3);
            this.f11374h.e(i3);
            this.f11375i.e(i3);
        }
        this.f11376j.e(i3);
        this.f11377k.e(i3);
    }
}
