package c.f.a.b.z2.m0;

import c.f.a.b.j3.x0;
import c.f.a.b.z2.m0.i0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f11296a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f11297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f11298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f11299d = new boolean[4];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f11300e = new a(128);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f11301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f11302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f11303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f11304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.f.a.b.z2.a0 f11305j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11306k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11307l;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final byte[] f11308a = {0, 0, 1};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f11309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f11310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f11311d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f11312e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte[] f11313f;

        public a(int i2) {
            this.f11313f = new byte[i2];
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (this.f11309b) {
                int i4 = i3 - i2;
                byte[] bArr2 = this.f11313f;
                int length = bArr2.length;
                int i5 = this.f11311d;
                if (length < i5 + i4) {
                    this.f11313f = Arrays.copyOf(bArr2, (i5 + i4) * 2);
                }
                System.arraycopy(bArr, i2, this.f11313f, this.f11311d, i4);
                this.f11311d += i4;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean b(int r9, int r10) {
            /*
                r8 = this;
                int r0 = r8.f11310c
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L4b
                r3 = 181(0xb5, float:2.54E-43)
                r4 = 2
                java.lang.String r5 = "Unexpected start code value"
                java.lang.String r6 = "H263Reader"
                if (r0 == r2) goto L3f
                r7 = 3
                if (r0 == r4) goto L37
                r4 = 4
                if (r0 == r7) goto L2b
                if (r0 != r4) goto L25
                r0 = 179(0xb3, float:2.51E-43)
                if (r9 == r0) goto L1d
                if (r9 != r3) goto L53
            L1d:
                int r9 = r8.f11311d
                int r9 = r9 - r10
                r8.f11311d = r9
                r8.f11309b = r1
                return r2
            L25:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>()
                throw r9
            L2b:
                r9 = r9 & 240(0xf0, float:3.36E-43)
                r10 = 32
                if (r9 == r10) goto L32
                goto L41
            L32:
                int r9 = r8.f11311d
                r8.f11312e = r9
                goto L48
            L37:
                r10 = 31
                if (r9 <= r10) goto L3c
                goto L41
            L3c:
                r8.f11310c = r7
                goto L53
            L3f:
                if (r9 == r3) goto L48
            L41:
                c.f.a.b.j3.z.i(r6, r5)
                r8.c()
                goto L53
            L48:
                r8.f11310c = r4
                goto L53
            L4b:
                r10 = 176(0xb0, float:2.47E-43)
                if (r9 != r10) goto L53
                r8.f11310c = r2
                r8.f11309b = r2
            L53:
                byte[] r9 = c.f.a.b.z2.m0.q.a.f11308a
                int r10 = r9.length
                r8.a(r9, r1, r10)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.m0.q.a.b(int, int):boolean");
        }

        public void c() {
            this.f11309b = false;
            this.f11311d = 0;
            this.f11310c = 0;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.f.a.b.z2.a0 f11314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f11315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f11316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f11317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f11318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f11319f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f11320g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f11321h;

        public b(c.f.a.b.z2.a0 a0Var) {
            this.f11314a = a0Var;
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (this.f11316c) {
                int i4 = this.f11319f;
                int i5 = (i2 + 1) - i4;
                if (i5 >= i3) {
                    this.f11319f = i4 + (i3 - i2);
                } else {
                    this.f11317d = ((bArr[i5] & 192) >> 6) == 0;
                    this.f11316c = false;
                }
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
        public void b(long j2, int i2, boolean z) {
            if (this.f11318e == 182 && z && this.f11315b) {
                this.f11314a.d(this.f11321h, this.f11317d ? 1 : 0, (int) (j2 - this.f11320g), i2, null);
            }
            if (this.f11318e != 179) {
                this.f11320g = j2;
            }
        }

        public void c(int i2, long j2) {
            this.f11318e = i2;
            this.f11317d = false;
            this.f11315b = i2 == 182 || i2 == 179;
            this.f11316c = i2 == 182;
            this.f11319f = 0;
            this.f11321h = j2;
        }

        public void d() {
            this.f11315b = false;
            this.f11316c = false;
            this.f11317d = false;
            this.f11318e = -1;
        }
    }

    public q(k0 k0Var) {
        c.f.a.b.j3.i0 i0Var;
        this.f11297b = k0Var;
        if (k0Var != null) {
            this.f11301f = new w(178, 128);
            i0Var = new c.f.a.b.j3.i0();
        } else {
            i0Var = null;
            this.f11301f = null;
        }
        this.f11298c = i0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c.f.a.b.k1 a(c.f.a.b.z2.m0.q.a r8, int r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.m0.q.a(c.f.a.b.z2.m0.q$a, int, java.lang.String):c.f.a.b.k1");
    }

    @Override // c.f.a.b.z2.m0.o
    public void b(c.f.a.b.j3.i0 i0Var) {
        c.f.a.b.j3.g.i(this.f11302g);
        c.f.a.b.j3.g.i(this.f11305j);
        int iE = i0Var.e();
        int iF = i0Var.f();
        byte[] bArrD = i0Var.d();
        this.f11303h += (long) i0Var.a();
        this.f11305j.c(i0Var, i0Var.a());
        while (true) {
            int iC = c.f.a.b.j3.e0.c(bArrD, iE, iF, this.f11299d);
            if (iC == iF) {
                break;
            }
            int i2 = iC + 3;
            int i3 = i0Var.d()[i2] & 255;
            int i4 = iC - iE;
            int i5 = 0;
            if (!this.f11306k) {
                if (i4 > 0) {
                    this.f11300e.a(bArrD, iE, iC);
                }
                if (this.f11300e.b(i3, i4 < 0 ? -i4 : 0)) {
                    c.f.a.b.z2.a0 a0Var = this.f11305j;
                    a aVar = this.f11300e;
                    a0Var.e(a(aVar, aVar.f11312e, (String) c.f.a.b.j3.g.e(this.f11304i)));
                    this.f11306k = true;
                }
            }
            this.f11302g.a(bArrD, iE, iC);
            w wVar = this.f11301f;
            if (wVar != null) {
                if (i4 > 0) {
                    wVar.a(bArrD, iE, iC);
                } else {
                    i5 = -i4;
                }
                if (this.f11301f.b(i5)) {
                    w wVar2 = this.f11301f;
                    ((c.f.a.b.j3.i0) x0.i(this.f11298c)).N(this.f11301f.f11430d, c.f.a.b.j3.e0.k(wVar2.f11430d, wVar2.f11431e));
                    ((k0) x0.i(this.f11297b)).a(this.f11307l, this.f11298c);
                }
                if (i3 == 178 && i0Var.d()[iC + 2] == 1) {
                    this.f11301f.e(i3);
                }
            }
            int i6 = iF - iC;
            this.f11302g.b(this.f11303h - ((long) i6), i6, this.f11306k);
            this.f11302g.c(i3, this.f11307l);
            iE = i2;
        }
        if (!this.f11306k) {
            this.f11300e.a(bArrD, iE, iF);
        }
        this.f11302g.a(bArrD, iE, iF);
        w wVar3 = this.f11301f;
        if (wVar3 != null) {
            wVar3.a(bArrD, iE, iF);
        }
    }

    @Override // c.f.a.b.z2.m0.o
    public void c() {
        c.f.a.b.j3.e0.a(this.f11299d);
        this.f11300e.c();
        b bVar = this.f11302g;
        if (bVar != null) {
            bVar.d();
        }
        w wVar = this.f11301f;
        if (wVar != null) {
            wVar.d();
        }
        this.f11303h = 0L;
    }

    @Override // c.f.a.b.z2.m0.o
    public void d() {
    }

    @Override // c.f.a.b.z2.m0.o
    public void e(c.f.a.b.z2.l lVar, i0.d dVar) {
        dVar.a();
        this.f11304i = dVar.b();
        c.f.a.b.z2.a0 a0VarE = lVar.e(dVar.c(), 2);
        this.f11305j = a0VarE;
        this.f11302g = new b(a0VarE);
        k0 k0Var = this.f11297b;
        if (k0Var != null) {
            k0Var.b(lVar, dVar);
        }
    }

    @Override // c.f.a.b.z2.m0.o
    public void f(long j2, int i2) {
        this.f11307l = j2;
    }
}
