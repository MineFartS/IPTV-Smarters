package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class wb implements vz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double[] f23450a = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f23451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private sf f23452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final xi f23453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final alx f23454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wn f23455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f23456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wa f23457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f23458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23459j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23460k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f23461l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f23462m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f23463n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f23464o;
    private boolean p;
    private boolean q;

    public wb() {
        this(null);
    }

    public wb(xi xiVar) {
        alx alxVar;
        this.f23453d = xiVar;
        this.f23456g = new boolean[4];
        this.f23457h = new wa();
        if (xiVar != null) {
            this.f23455f = new wn(178);
            alxVar = new alx();
        } else {
            alxVar = null;
            this.f23455f = null;
        }
        this.f23454e = alxVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
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
    @Override // com.google.ads.interactivemedia.v3.internal.vz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.ads.interactivemedia.v3.internal.alx r21) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.wb.a(com.google.ads.interactivemedia.v3.internal.alx):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void b(rm rmVar, xg xgVar) {
        xgVar.c();
        this.f23451b = xgVar.b();
        this.f23452c = rmVar.aZ(xgVar.a(), 2);
        xi xiVar = this.f23453d;
        if (xiVar != null) {
            xiVar.b(rmVar, xgVar);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void d(long j2, int i2) {
        this.f23462m = j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vz
    public final void e() {
        alr.d(this.f23456g);
        this.f23457h.b();
        wn wnVar = this.f23455f;
        if (wnVar != null) {
            wnVar.b();
        }
        this.f23458i = 0L;
        this.f23459j = false;
    }
}
