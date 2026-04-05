package c.f.a.b.f3.p;

import android.graphics.Bitmap;
import c.f.a.b.f3.c;
import c.f.a.b.f3.d;
import c.f.a.b.f3.f;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i0 f8221o;
    public final i0 p;
    public final C0133a q;
    public Inflater r;

    /* JADX INFO: renamed from: c.f.a.b.f3.p.a$a, reason: collision with other inner class name */
    public static final class C0133a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i0 f8222a = new i0();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f8223b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f8224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f8225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8226e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f8227f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8228g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8229h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8230i;

        public c d() {
            int iD;
            if (this.f8225d == 0 || this.f8226e == 0 || this.f8229h == 0 || this.f8230i == 0 || this.f8222a.f() == 0 || this.f8222a.e() != this.f8222a.f() || !this.f8224c) {
                return null;
            }
            this.f8222a.P(0);
            int i2 = this.f8229h * this.f8230i;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int iD2 = this.f8222a.D();
                if (iD2 != 0) {
                    iD = i3 + 1;
                    iArr[i3] = this.f8223b[iD2];
                } else {
                    int iD3 = this.f8222a.D();
                    if (iD3 != 0) {
                        iD = ((iD3 & 64) == 0 ? iD3 & 63 : ((iD3 & 63) << 8) | this.f8222a.D()) + i3;
                        Arrays.fill(iArr, i3, iD, (iD3 & 128) == 0 ? 0 : this.f8223b[this.f8222a.D()]);
                    }
                }
                i3 = iD;
            }
            return new c.b().f(Bitmap.createBitmap(iArr, this.f8229h, this.f8230i, Bitmap.Config.ARGB_8888)).k(this.f8227f / this.f8225d).l(0).h(this.f8228g / this.f8226e, 0).i(0).n(this.f8229h / this.f8225d).g(this.f8230i / this.f8226e).a();
        }

        public final void e(i0 i0Var, int i2) {
            int iG;
            if (i2 < 4) {
                return;
            }
            i0Var.Q(3);
            int i3 = i2 - 4;
            if ((i0Var.D() & 128) != 0) {
                if (i3 < 7 || (iG = i0Var.G()) < 4) {
                    return;
                }
                this.f8229h = i0Var.J();
                this.f8230i = i0Var.J();
                this.f8222a.L(iG - 4);
                i3 -= 7;
            }
            int iE = this.f8222a.e();
            int iF = this.f8222a.f();
            if (iE >= iF || i3 <= 0) {
                return;
            }
            int iMin = Math.min(i3, iF - iE);
            i0Var.j(this.f8222a.d(), iE, iMin);
            this.f8222a.P(iE + iMin);
        }

        public final void f(i0 i0Var, int i2) {
            if (i2 < 19) {
                return;
            }
            this.f8225d = i0Var.J();
            this.f8226e = i0Var.J();
            i0Var.Q(11);
            this.f8227f = i0Var.J();
            this.f8228g = i0Var.J();
        }

        public final void g(i0 i0Var, int i2) {
            if (i2 % 5 != 2) {
                return;
            }
            i0Var.Q(2);
            Arrays.fill(this.f8223b, 0);
            int i3 = i2 / 5;
            int i4 = 0;
            while (i4 < i3) {
                int iD = i0Var.D();
                int iD2 = i0Var.D();
                int iD3 = i0Var.D();
                int iD4 = i0Var.D();
                int iD5 = i0Var.D();
                double d2 = iD2;
                double d3 = iD3 - 128;
                Double.isNaN(d3);
                Double.isNaN(d2);
                int i5 = (int) ((1.402d * d3) + d2);
                int i6 = i4;
                double d4 = iD4 - 128;
                Double.isNaN(d4);
                Double.isNaN(d2);
                Double.isNaN(d3);
                Double.isNaN(d4);
                Double.isNaN(d2);
                this.f8223b[iD] = x0.r((int) (d2 + (d4 * 1.772d)), 0, 255) | (x0.r((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255) << 8) | (iD5 << 24) | (x0.r(i5, 0, 255) << 16);
                i4 = i6 + 1;
            }
            this.f8224c = true;
        }

        public void h() {
            this.f8225d = 0;
            this.f8226e = 0;
            this.f8227f = 0;
            this.f8228g = 0;
            this.f8229h = 0;
            this.f8230i = 0;
            this.f8222a.L(0);
            this.f8224c = false;
        }
    }

    public a() {
        super("PgsDecoder");
        this.f8221o = new i0();
        this.p = new i0();
        this.q = new C0133a();
    }

    public static c C(i0 i0Var, C0133a c0133a) {
        int iF = i0Var.f();
        int iD = i0Var.D();
        int iJ = i0Var.J();
        int iE = i0Var.e() + iJ;
        c cVarD = null;
        if (iE > iF) {
            i0Var.P(iF);
            return null;
        }
        if (iD != 128) {
            switch (iD) {
                case 20:
                    c0133a.g(i0Var, iJ);
                    break;
                case 21:
                    c0133a.e(i0Var, iJ);
                    break;
                case 22:
                    c0133a.f(i0Var, iJ);
                    break;
            }
        } else {
            cVarD = c0133a.d();
            c0133a.h();
        }
        i0Var.P(iE);
        return cVarD;
    }

    public final void B(i0 i0Var) {
        if (i0Var.a() <= 0 || i0Var.h() != 120) {
            return;
        }
        if (this.r == null) {
            this.r = new Inflater();
        }
        if (x0.p0(i0Var, this.p, this.r)) {
            i0Var.N(this.p.d(), this.p.f());
        }
    }

    @Override // c.f.a.b.f3.d
    public f y(byte[] bArr, int i2, boolean z) {
        this.f8221o.N(bArr, i2);
        B(this.f8221o);
        this.q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f8221o.a() >= 3) {
            c cVarC = C(this.f8221o, this.q);
            if (cVarC != null) {
                arrayList.add(cVarC);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
