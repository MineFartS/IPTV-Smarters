package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class wd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sf f23471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f23477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f23478h;

    public wd(sf sfVar) {
        this.f23471a = sfVar;
    }

    public final void a(byte[] bArr, int i2, int i3) {
        if (this.f23473c) {
            int i4 = this.f23476f;
            int i5 = (i2 + 1) - i4;
            if (i5 >= i3) {
                this.f23476f = i4 + (i3 - i2);
            } else {
                this.f23474d = ((bArr[i5] & 192) >> 6) == 0;
                this.f23473c = false;
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
    public final void b(long j2, int i2, boolean z) {
        if (this.f23475e == 182 && z && this.f23472b) {
            long j3 = this.f23477g;
            this.f23471a.d(this.f23478h, this.f23474d ? 1 : 0, (int) (j2 - j3), i2, null);
        }
        if (this.f23475e != 179) {
            this.f23477g = j2;
        }
    }

    public final void c(int i2, long j2) {
        boolean z;
        this.f23475e = i2;
        this.f23474d = false;
        if (i2 == 182) {
            z = true;
        } else if (i2 == 179) {
            i2 = 179;
            z = true;
        } else {
            z = false;
        }
        this.f23472b = z;
        this.f23473c = i2 == 182;
        this.f23476f = 0;
        this.f23478h = j2;
    }

    public final void d() {
        this.f23472b = false;
        this.f23473c = false;
        this.f23474d = false;
        this.f23475e = -1;
    }
}
