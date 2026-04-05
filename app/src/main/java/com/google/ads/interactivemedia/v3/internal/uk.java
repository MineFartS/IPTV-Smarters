package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class uk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf f23187a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uy f23190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public uh f23191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23195i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f23198l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ux f23188b = new ux();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final alx f23189c = new alx();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final alx f23196j = new alx(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final alx f23197k = new alx();

    public uk(sf sfVar, uy uyVar, uh uhVar) {
        this.f23187a = sfVar;
        this.f23190d = uyVar;
        this.f23191e = uhVar;
        g(uyVar, uhVar);
    }

    public final int a() {
        int i2 = !this.f23198l ? this.f23190d.f23281g[this.f23192f] : this.f23188b.f23270k[this.f23192f] ? 1 : 0;
        return f() != null ? i2 | 1073741824 : i2;
    }

    public final int b() {
        return !this.f23198l ? this.f23190d.f23278d[this.f23192f] : this.f23188b.f23267h[this.f23192f];
    }

    public final int c(int i2, int i3) {
        alx alxVar;
        uw uwVarF = f();
        if (uwVarF == null) {
            return 0;
        }
        int i4 = uwVarF.f23258d;
        if (i4 != 0) {
            alxVar = this.f23188b.f23274o;
        } else {
            byte[] bArr = (byte[]) amn.A(uwVarF.f23259e);
            alx alxVar2 = this.f23197k;
            int length = bArr.length;
            alxVar2.G(bArr, length);
            alxVar = this.f23197k;
            i4 = length;
        }
        boolean zC = this.f23188b.c(this.f23192f);
        boolean z = zC || i3 != 0;
        this.f23196j.K()[0] = (byte) ((true != z ? 0 : 128) | i4);
        this.f23196j.I(0);
        this.f23187a.f(this.f23196j, 1);
        this.f23187a.f(alxVar, i4);
        if (!z) {
            return i4 + 1;
        }
        if (!zC) {
            this.f23189c.E(8);
            byte[] bArrK = this.f23189c.K();
            bArrK[0] = 0;
            bArrK[1] = 1;
            bArrK[2] = 0;
            bArrK[3] = (byte) i3;
            bArrK[4] = (byte) ((i2 >> 24) & 255);
            bArrK[5] = (byte) ((i2 >> 16) & 255);
            bArrK[6] = (byte) ((i2 >> 8) & 255);
            bArrK[7] = (byte) (i2 & 255);
            this.f23187a.f(this.f23189c, 8);
            return i4 + 9;
        }
        alx alxVar3 = this.f23188b.f23274o;
        int iO = alxVar3.o();
        alxVar3.J(-2);
        int i5 = (iO * 6) + 2;
        if (i3 != 0) {
            this.f23189c.E(i5);
            byte[] bArrK2 = this.f23189c.K();
            alxVar3.D(bArrK2, 0, i5);
            int i6 = (((bArrK2[2] & 255) << 8) | (bArrK2[3] & 255)) + i3;
            bArrK2[2] = (byte) ((i6 >> 8) & 255);
            bArrK2[3] = (byte) (i6 & 255);
            alxVar3 = this.f23189c;
        }
        this.f23187a.f(alxVar3, i5);
        return i4 + 1 + i5;
    }

    public final long d() {
        return !this.f23198l ? this.f23190d.f23277c[this.f23192f] : this.f23188b.f23265f[this.f23194h];
    }

    public final long e() {
        return !this.f23198l ? this.f23190d.f23280f[this.f23192f] : this.f23188b.a(this.f23192f);
    }

    public final uw f() {
        if (!this.f23198l) {
            return null;
        }
        ux uxVar = this.f23188b;
        uh uhVar = uxVar.f23260a;
        int i2 = amn.f20135a;
        int i3 = uhVar.f23175a;
        uw uwVarA = uxVar.f23273n;
        if (uwVarA == null) {
            uwVarA = this.f23190d.f23275a.a(i3);
        }
        if (uwVarA == null || !uwVarA.f23255a) {
            return null;
        }
        return uwVarA;
    }

    public final void g(uy uyVar, uh uhVar) {
        this.f23190d = uyVar;
        this.f23191e = uhVar;
        this.f23187a.b(uyVar.f23275a.f23249f);
        h();
    }

    public final void h() {
        ux uxVar = this.f23188b;
        uxVar.f23263d = 0;
        uxVar.q = 0L;
        uxVar.r = false;
        uxVar.f23271l = false;
        uxVar.p = false;
        uxVar.f23273n = null;
        this.f23192f = 0;
        this.f23194h = 0;
        this.f23193g = 0;
        this.f23195i = 0;
        this.f23198l = false;
    }

    public final boolean j() {
        this.f23192f++;
        if (!this.f23198l) {
            return false;
        }
        int i2 = this.f23193g + 1;
        this.f23193g = i2;
        int[] iArr = this.f23188b.f23266g;
        int i3 = this.f23194h;
        if (i2 != iArr[i3]) {
            return true;
        }
        this.f23194h = i3 + 1;
        this.f23193g = 0;
        return false;
    }
}
