package c.f.a.b.z2.m0;

import android.util.Pair;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.z2.m0.i0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double[] f11276a = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.f.a.b.z2.a0 f11278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0 f11279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f11280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f11281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean[] f11282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f11283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f11284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f11285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11286k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11288m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f11289n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f11290o;
    public boolean p;
    public boolean q;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final byte[] f11291a = {0, 0, 1};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f11292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f11293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f11294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f11295e;

        public a(int i2) {
            this.f11295e = new byte[i2];
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (this.f11292b) {
                int i4 = i3 - i2;
                byte[] bArr2 = this.f11295e;
                int length = bArr2.length;
                int i5 = this.f11293c;
                if (length < i5 + i4) {
                    this.f11295e = Arrays.copyOf(bArr2, (i5 + i4) * 2);
                }
                System.arraycopy(bArr, i2, this.f11295e, this.f11293c, i4);
                this.f11293c += i4;
            }
        }

        public boolean b(int i2, int i3) {
            if (this.f11292b) {
                int i4 = this.f11293c - i3;
                this.f11293c = i4;
                if (this.f11294d != 0 || i2 != 181) {
                    this.f11292b = false;
                    return true;
                }
                this.f11294d = i4;
            } else if (i2 == 179) {
                this.f11292b = true;
            }
            byte[] bArr = f11291a;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f11292b = false;
            this.f11293c = 0;
            this.f11294d = 0;
        }
    }

    public p() {
        this(null);
    }

    public p(k0 k0Var) {
        c.f.a.b.j3.i0 i0Var;
        this.f11279d = k0Var;
        this.f11282g = new boolean[4];
        this.f11283h = new a(128);
        if (k0Var != null) {
            this.f11281f = new w(178, 128);
            i0Var = new c.f.a.b.j3.i0();
        } else {
            i0Var = null;
            this.f11281f = null;
        }
        this.f11280e = i0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<c.f.a.b.k1, java.lang.Long> a(c.f.a.b.z2.m0.p.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f11295e
            int r1 = r8.f11293c
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3d
            r7 = 3
            if (r6 == r7) goto L37
            if (r6 == r1) goto L31
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L31:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L42
        L37:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L42
        L3d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L42:
            float r6 = (float) r6
            float r1 = r1 / r6
        L44:
            c.f.a.b.k1$b r6 = new c.f.a.b.k1$b
            r6.<init>()
            c.f.a.b.k1$b r9 = r6.S(r9)
            java.lang.String r6 = "video/mpeg2"
            c.f.a.b.k1$b r9 = r9.e0(r6)
            c.f.a.b.k1$b r9 = r9.j0(r2)
            c.f.a.b.k1$b r9 = r9.Q(r4)
            c.f.a.b.k1$b r9 = r9.a0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            c.f.a.b.k1$b r9 = r9.T(r1)
            c.f.a.b.k1 r9 = r9.E()
            r1 = 0
            r4 = r0[r5]
            r4 = r4 & 15
            int r4 = r4 + (-1)
            if (r4 < 0) goto La3
            double[] r5 = c.f.a.b.z2.m0.p.f11276a
            int r6 = r5.length
            if (r4 >= r6) goto La3
            r1 = r5[r4]
            int r8 = r8.f11294d
            int r8 = r8 + 9
            r4 = r0[r8]
            r4 = r4 & 96
            int r3 = r4 >> 5
            r8 = r0[r8]
            r8 = r8 & 31
            if (r3 == r8) goto L9c
            double r3 = (double) r3
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r3)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            java.lang.Double.isNaN(r5)
            double r3 = r3 / r5
            double r1 = r1 * r3
        L9c:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r1 = (long) r3
        La3:
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.m0.p.a(c.f.a.b.z2.m0.p$a, java.lang.String):android.util.Pair");
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
    @Override // c.f.a.b.z2.m0.o
    public void b(c.f.a.b.j3.i0 i0Var) {
        int i2;
        c.f.a.b.j3.g.i(this.f11278c);
        int iE = i0Var.e();
        int iF = i0Var.f();
        byte[] bArrD = i0Var.d();
        this.f11284i += (long) i0Var.a();
        this.f11278c.c(i0Var, i0Var.a());
        while (true) {
            int iC = c.f.a.b.j3.e0.c(bArrD, iE, iF, this.f11282g);
            if (iC == iF) {
                break;
            }
            int i3 = iC + 3;
            int i4 = i0Var.d()[i3] & 255;
            int i5 = iC - iE;
            if (!this.f11286k) {
                if (i5 > 0) {
                    this.f11283h.a(bArrD, iE, iC);
                }
                if (this.f11283h.b(i4, i5 < 0 ? -i5 : 0)) {
                    Pair<k1, Long> pairA = a(this.f11283h, (String) c.f.a.b.j3.g.e(this.f11277b));
                    this.f11278c.e((k1) pairA.first);
                    this.f11287l = ((Long) pairA.second).longValue();
                    this.f11286k = true;
                }
            }
            w wVar = this.f11281f;
            if (wVar != null) {
                if (i5 > 0) {
                    wVar.a(bArrD, iE, iC);
                    i2 = 0;
                } else {
                    i2 = -i5;
                }
                if (this.f11281f.b(i2)) {
                    w wVar2 = this.f11281f;
                    ((c.f.a.b.j3.i0) x0.i(this.f11280e)).N(this.f11281f.f11430d, c.f.a.b.j3.e0.k(wVar2.f11430d, wVar2.f11431e));
                    ((k0) x0.i(this.f11279d)).a(this.f11290o, this.f11280e);
                }
                if (i4 == 178 && i0Var.d()[iC + 2] == 1) {
                    this.f11281f.e(i4);
                }
            }
            if (i4 == 0 || i4 == 179) {
                int i6 = iF - iC;
                if (this.f11285j && this.q && this.f11286k) {
                    this.f11278c.d(this.f11290o, this.p ? 1 : 0, ((int) (this.f11284i - this.f11289n)) - i6, i6, null);
                }
                boolean z = this.f11285j;
                if (!z || this.q) {
                    this.f11289n = this.f11284i - ((long) i6);
                    long j2 = this.f11288m;
                    if (j2 == -9223372036854775807L) {
                        j2 = z ? this.f11290o + this.f11287l : 0L;
                    }
                    this.f11290o = j2;
                    this.p = false;
                    this.f11288m = -9223372036854775807L;
                    this.f11285j = true;
                }
                this.q = i4 == 0;
            } else if (i4 == 184) {
                this.p = true;
            }
            iE = i3;
        }
        if (!this.f11286k) {
            this.f11283h.a(bArrD, iE, iF);
        }
        w wVar3 = this.f11281f;
        if (wVar3 != null) {
            wVar3.a(bArrD, iE, iF);
        }
    }

    @Override // c.f.a.b.z2.m0.o
    public void c() {
        c.f.a.b.j3.e0.a(this.f11282g);
        this.f11283h.c();
        w wVar = this.f11281f;
        if (wVar != null) {
            wVar.d();
        }
        this.f11284i = 0L;
        this.f11285j = false;
    }

    @Override // c.f.a.b.z2.m0.o
    public void d() {
    }

    @Override // c.f.a.b.z2.m0.o
    public void e(c.f.a.b.z2.l lVar, i0.d dVar) {
        dVar.a();
        this.f11277b = dVar.b();
        this.f11278c = lVar.e(dVar.c(), 2);
        k0 k0Var = this.f11279d;
        if (k0Var != null) {
            k0Var.b(lVar, dVar);
        }
    }

    @Override // c.f.a.b.z2.m0.o
    public void f(long j2, int i2) {
        this.f11288m = j2;
    }
}
