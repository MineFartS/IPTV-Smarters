package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class wg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sf f23506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f23507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23508c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final aly f23511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f23512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f23514i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f23515j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23516k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f23517l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f23520o;
    private long p;
    private long q;
    private boolean r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseArray<alq> f23509d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray<alp> f23510e = new SparseArray<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private wf f23518m = new wf(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private wf f23519n = new wf(null);

    public wg(sf sfVar, boolean z, boolean z2) {
        this.f23506a = sfVar;
        this.f23507b = z;
        this.f23508c = z2;
        byte[] bArr = new byte[128];
        this.f23512g = bArr;
        this.f23511f = new aly(bArr, 0, 0);
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.wg.a(byte[], int, int):void");
    }

    public final void b(alp alpVar) {
        this.f23510e.append(alpVar.f20053a, alpVar);
    }

    public final void c(alq alqVar) {
        this.f23509d.append(alqVar.f20059d, alqVar);
    }

    public final void d() {
        this.f23516k = false;
        this.f23520o = false;
        this.f23519n.a();
    }

    public final void e(long j2, int i2, long j3) {
        this.f23514i = i2;
        this.f23517l = j3;
        this.f23515j = j2;
        if (!this.f23507b || i2 != 1) {
            if (!this.f23508c) {
                return;
            }
            if (i2 != 5 && i2 != 1 && i2 != 2) {
                return;
            }
        }
        wf wfVar = this.f23518m;
        this.f23518m = this.f23519n;
        this.f23519n = wfVar;
        wfVar.a();
        this.f23513h = 0;
        this.f23516k = true;
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
    public final boolean f(long j2, int i2, boolean z, boolean z2) {
        boolean z3 = false;
        if (this.f23514i == 9 || (this.f23508c && wf.d(this.f23519n, this.f23518m))) {
            if (z && this.f23520o) {
                long j3 = this.f23515j;
                this.f23506a.d(this.q, this.r ? 1 : 0, (int) (j3 - this.p), i2 + ((int) (j2 - j3)), null);
            }
            this.p = this.f23515j;
            this.q = this.f23517l;
            this.r = false;
            this.f23520o = true;
        }
        boolean zE = this.f23507b ? this.f23519n.e() : z2;
        boolean z4 = this.r;
        int i3 = this.f23514i;
        if (i3 == 5 || (zE && i3 == 1)) {
            z3 = true;
        }
        boolean z5 = z4 | z3;
        this.r = z5;
        return z5;
    }

    public final boolean g() {
        return this.f23508c;
    }
}
