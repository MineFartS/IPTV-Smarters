package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class wi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sf f23536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f23537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f23540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23544i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23545j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f23546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f23547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f23548m;

    public wi(sf sfVar) {
        this.f23536a = sfVar;
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
    private final void e(int i2) {
        boolean z = this.f23548m;
        long j2 = this.f23537b;
        long j3 = this.f23546k;
        this.f23536a.d(this.f23547l, z ? 1 : 0, (int) (j2 - j3), i2, null);
    }

    public final void a(long j2, int i2, boolean z) {
        if (this.f23545j && this.f23542g) {
            this.f23548m = this.f23538c;
            this.f23545j = false;
        } else if (this.f23543h || this.f23542g) {
            if (z && this.f23544i) {
                e(i2 + ((int) (j2 - this.f23537b)));
            }
            this.f23546k = this.f23537b;
            this.f23547l = this.f23540e;
            this.f23548m = this.f23538c;
            this.f23544i = true;
        }
    }

    public final void b(byte[] bArr, int i2, int i3) {
        if (this.f23541f) {
            int i4 = this.f23539d;
            int i5 = (i2 + 2) - i4;
            if (i5 >= i3) {
                this.f23539d = i4 + (i3 - i2);
            } else {
                this.f23542g = (bArr[i5] & 128) != 0;
                this.f23541f = false;
            }
        }
    }

    public final void c() {
        this.f23541f = false;
        this.f23542g = false;
        this.f23543h = false;
        this.f23544i = false;
        this.f23545j = false;
    }

    public final void d(long j2, int i2, int i3, long j3, boolean z) {
        this.f23542g = false;
        this.f23543h = false;
        this.f23540e = j3;
        this.f23539d = 0;
        this.f23537b = j2;
        if (i3 >= 32 && i3 != 40) {
            if (this.f23544i && !this.f23545j) {
                if (z) {
                    e(i2);
                }
                this.f23544i = false;
            }
            if (i3 <= 35 || i3 == 39) {
                this.f23543h = !this.f23545j;
                this.f23545j = true;
            }
        }
        boolean z2 = i3 >= 16 && i3 <= 21;
        this.f23538c = z2;
        this.f23541f = z2 || i3 <= 9;
    }
}
