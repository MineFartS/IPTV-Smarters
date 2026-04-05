package c.f.a.b.z2.m0;

import android.util.SparseArray;
import c.f.a.b.j3.e0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.z2.m0.i0;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f11322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11324c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f11328g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f11330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.f.a.b.z2.a0 f11331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f11332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f11335n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f11329h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f11325d = new w(7, 128);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w f11326e = new w(8, 128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f11327f = new w(6, 128);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f11336o = new c.f.a.b.j3.i0();

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.f.a.b.z2.a0 f11337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f11338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f11339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray<e0.b> f11340d = new SparseArray<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray<e0.a> f11341e = new SparseArray<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final c.f.a.b.j3.j0 f11342f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f11343g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f11344h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f11345i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f11346j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f11347k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f11348l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public a f11349m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public a f11350n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f11351o;
        public long p;
        public long q;
        public boolean r;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f11352a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f11353b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public e0.b f11354c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f11355d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f11356e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f11357f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f11358g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f11359h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f11360i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public boolean f11361j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean f11362k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public int f11363l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f11364m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public int f11365n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public int f11366o;
            public int p;

            public a() {
            }

            public void b() {
                this.f11353b = false;
                this.f11352a = false;
            }

            public final boolean c(a aVar) {
                int i2;
                int i3;
                int i4;
                boolean z;
                if (!this.f11352a) {
                    return false;
                }
                if (!aVar.f11352a) {
                    return true;
                }
                e0.b bVar = (e0.b) c.f.a.b.j3.g.i(this.f11354c);
                e0.b bVar2 = (e0.b) c.f.a.b.j3.g.i(aVar.f11354c);
                return (this.f11357f == aVar.f11357f && this.f11358g == aVar.f11358g && this.f11359h == aVar.f11359h && (!this.f11360i || !aVar.f11360i || this.f11361j == aVar.f11361j) && (((i2 = this.f11355d) == (i3 = aVar.f11355d) || (i2 != 0 && i3 != 0)) && (((i4 = bVar.f9182k) != 0 || bVar2.f9182k != 0 || (this.f11364m == aVar.f11364m && this.f11365n == aVar.f11365n)) && ((i4 != 1 || bVar2.f9182k != 1 || (this.f11366o == aVar.f11366o && this.p == aVar.p)) && (z = this.f11362k) == aVar.f11362k && (!z || this.f11363l == aVar.f11363l))))) ? false : true;
            }

            public boolean d() {
                int i2;
                return this.f11353b && ((i2 = this.f11356e) == 7 || i2 == 2);
            }

            public void e(e0.b bVar, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4, int i6, int i7, int i8, int i9, int i10) {
                this.f11354c = bVar;
                this.f11355d = i2;
                this.f11356e = i3;
                this.f11357f = i4;
                this.f11358g = i5;
                this.f11359h = z;
                this.f11360i = z2;
                this.f11361j = z3;
                this.f11362k = z4;
                this.f11363l = i6;
                this.f11364m = i7;
                this.f11365n = i8;
                this.f11366o = i9;
                this.p = i10;
                this.f11352a = true;
                this.f11353b = true;
            }

            public void f(int i2) {
                this.f11356e = i2;
                this.f11353b = true;
            }
        }

        public b(c.f.a.b.z2.a0 a0Var, boolean z, boolean z2) {
            this.f11337a = a0Var;
            this.f11338b = z;
            this.f11339c = z2;
            this.f11349m = new a();
            this.f11350n = new a();
            byte[] bArr = new byte[128];
            this.f11343g = bArr;
            this.f11342f = new c.f.a.b.j3.j0(bArr, 0, 0);
            g();
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x014e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instruction units count: 408
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.m0.r.b.a(byte[], int, int):void");
        }

        public boolean b(long j2, int i2, boolean z, boolean z2) {
            boolean z3 = false;
            if (this.f11345i == 9 || (this.f11339c && this.f11350n.c(this.f11349m))) {
                if (z && this.f11351o) {
                    d(i2 + ((int) (j2 - this.f11346j)));
                }
                this.p = this.f11346j;
                this.q = this.f11348l;
                this.r = false;
                this.f11351o = true;
            }
            if (this.f11338b) {
                z2 = this.f11350n.d();
            }
            boolean z4 = this.r;
            int i3 = this.f11345i;
            if (i3 == 5 || (z2 && i3 == 1)) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            this.r = z5;
            return z5;
        }

        public boolean c() {
            return this.f11339c;
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
            boolean z = this.r;
            this.f11337a.d(this.q, z ? 1 : 0, (int) (this.f11346j - this.p), i2, null);
        }

        public void e(e0.a aVar) {
            this.f11341e.append(aVar.f9169a, aVar);
        }

        public void f(e0.b bVar) {
            this.f11340d.append(bVar.f9175d, bVar);
        }

        public void g() {
            this.f11347k = false;
            this.f11351o = false;
            this.f11350n.b();
        }

        public void h(long j2, int i2, long j3) {
            this.f11345i = i2;
            this.f11348l = j3;
            this.f11346j = j2;
            if (!this.f11338b || i2 != 1) {
                if (!this.f11339c) {
                    return;
                }
                if (i2 != 5 && i2 != 1 && i2 != 2) {
                    return;
                }
            }
            a aVar = this.f11349m;
            this.f11349m = this.f11350n;
            this.f11350n = aVar;
            aVar.b();
            this.f11344h = 0;
            this.f11347k = true;
        }
    }

    public r(e0 e0Var, boolean z, boolean z2) {
        this.f11322a = e0Var;
        this.f11323b = z;
        this.f11324c = z2;
    }

    @EnsuresNonNull({"output", "sampleReader"})
    public final void a() {
        c.f.a.b.j3.g.i(this.f11331j);
        x0.i(this.f11332k);
    }

    @Override // c.f.a.b.z2.m0.o
    public void b(c.f.a.b.j3.i0 i0Var) {
        a();
        int iE = i0Var.e();
        int iF = i0Var.f();
        byte[] bArrD = i0Var.d();
        this.f11328g += (long) i0Var.a();
        this.f11331j.c(i0Var, i0Var.a());
        while (true) {
            int iC = c.f.a.b.j3.e0.c(bArrD, iE, iF, this.f11329h);
            if (iC == iF) {
                h(bArrD, iE, iF);
                return;
            }
            int iF2 = c.f.a.b.j3.e0.f(bArrD, iC);
            int i2 = iC - iE;
            if (i2 > 0) {
                h(bArrD, iE, iC);
            }
            int i3 = iF - iC;
            long j2 = this.f11328g - ((long) i3);
            g(j2, i3, i2 < 0 ? -i2 : 0, this.f11334m);
            i(j2, iF2, this.f11334m);
            iE = iC + 3;
        }
    }

    @Override // c.f.a.b.z2.m0.o
    public void c() {
        this.f11328g = 0L;
        this.f11335n = false;
        c.f.a.b.j3.e0.a(this.f11329h);
        this.f11325d.d();
        this.f11326e.d();
        this.f11327f.d();
        b bVar = this.f11332k;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // c.f.a.b.z2.m0.o
    public void d() {
    }

    @Override // c.f.a.b.z2.m0.o
    public void e(c.f.a.b.z2.l lVar, i0.d dVar) {
        dVar.a();
        this.f11330i = dVar.b();
        c.f.a.b.z2.a0 a0VarE = lVar.e(dVar.c(), 2);
        this.f11331j = a0VarE;
        this.f11332k = new b(a0VarE, this.f11323b, this.f11324c);
        this.f11322a.b(lVar, dVar);
    }

    @Override // c.f.a.b.z2.m0.o
    public void f(long j2, int i2) {
        this.f11334m = j2;
        this.f11335n |= (i2 & 2) != 0;
    }

    @RequiresNonNull({"output", "sampleReader"})
    public final void g(long j2, int i2, int i3, long j3) {
        w wVar;
        if (!this.f11333l || this.f11332k.c()) {
            this.f11325d.b(i3);
            this.f11326e.b(i3);
            if (this.f11333l) {
                if (this.f11325d.c()) {
                    w wVar2 = this.f11325d;
                    this.f11332k.f(c.f.a.b.j3.e0.i(wVar2.f11430d, 3, wVar2.f11431e));
                    wVar = this.f11325d;
                } else if (this.f11326e.c()) {
                    w wVar3 = this.f11326e;
                    this.f11332k.e(c.f.a.b.j3.e0.h(wVar3.f11430d, 3, wVar3.f11431e));
                    wVar = this.f11326e;
                }
            } else if (this.f11325d.c() && this.f11326e.c()) {
                ArrayList arrayList = new ArrayList();
                w wVar4 = this.f11325d;
                arrayList.add(Arrays.copyOf(wVar4.f11430d, wVar4.f11431e));
                w wVar5 = this.f11326e;
                arrayList.add(Arrays.copyOf(wVar5.f11430d, wVar5.f11431e));
                w wVar6 = this.f11325d;
                e0.b bVarI = c.f.a.b.j3.e0.i(wVar6.f11430d, 3, wVar6.f11431e);
                w wVar7 = this.f11326e;
                e0.a aVarH = c.f.a.b.j3.e0.h(wVar7.f11430d, 3, wVar7.f11431e);
                this.f11331j.e(new k1.b().S(this.f11330i).e0("video/avc").I(c.f.a.b.j3.j.a(bVarI.f9172a, bVarI.f9173b, bVarI.f9174c)).j0(bVarI.f9176e).Q(bVarI.f9177f).a0(bVarI.f9178g).T(arrayList).E());
                this.f11333l = true;
                this.f11332k.f(bVarI);
                this.f11332k.e(aVarH);
                this.f11325d.d();
                wVar = this.f11326e;
            }
            wVar.d();
        }
        if (this.f11327f.b(i3)) {
            w wVar8 = this.f11327f;
            this.f11336o.N(this.f11327f.f11430d, c.f.a.b.j3.e0.k(wVar8.f11430d, wVar8.f11431e));
            this.f11336o.P(4);
            this.f11322a.a(j3, this.f11336o);
        }
        if (this.f11332k.b(j2, i2, this.f11333l, this.f11335n)) {
            this.f11335n = false;
        }
    }

    @RequiresNonNull({"sampleReader"})
    public final void h(byte[] bArr, int i2, int i3) {
        if (!this.f11333l || this.f11332k.c()) {
            this.f11325d.a(bArr, i2, i3);
            this.f11326e.a(bArr, i2, i3);
        }
        this.f11327f.a(bArr, i2, i3);
        this.f11332k.a(bArr, i2, i3);
    }

    @RequiresNonNull({"sampleReader"})
    public final void i(long j2, int i2, long j3) {
        if (!this.f11333l || this.f11332k.c()) {
            this.f11325d.e(i2);
            this.f11326e.e(i2);
        }
        this.f11327f.e(i2);
        this.f11332k.h(j2, i2, j3);
    }
}
