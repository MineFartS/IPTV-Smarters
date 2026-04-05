package c.f.a.b.z2.d0;

import android.net.Uri;
import c.f.a.b.j3.g;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.w1;
import c.f.a.b.z2.a0;
import c.f.a.b.z2.f;
import c.f.a.b.z2.j;
import c.f.a.b.z2.k;
import c.f.a.b.z2.l;
import c.f.a.b.z2.n;
import c.f.a.b.z2.o;
import c.f.a.b.z2.w;
import c.f.a.b.z2.x;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f10682c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f10685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f10686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10687h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f10689j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10690k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10691l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10692m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f10693n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10694o;
    public int p;
    public long q;
    public l r;
    public a0 s;
    public x t;
    public boolean u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f10680a = new o() { // from class: c.f.a.b.z2.d0.a
        @Override // c.f.a.b.z2.o
        public final j[] a() {
            return b.l();
        }

        @Override // c.f.a.b.z2.o
        public /* synthetic */ j[] b(Uri uri, Map map) {
            return n.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f10681b = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f10683d = x0.k0("#!AMR\n");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f10684e = x0.k0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f10682c = iArr;
        f10685f = iArr[8];
    }

    public b() {
        this(0);
    }

    public b(int i2) {
        this.f10687h = i2;
        this.f10686g = new byte[1];
        this.f10694o = -1;
    }

    public static int d(int i2, long j2) {
        return (int) ((((long) (i2 * 8)) * 1000000) / j2);
    }

    public static /* synthetic */ j[] l() {
        return new j[]{new b()};
    }

    public static boolean o(k kVar, byte[] bArr) {
        kVar.r();
        byte[] bArr2 = new byte[bArr.length];
        kVar.u(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // c.f.a.b.z2.j
    public void a(long j2, long j3) {
        this.f10689j = 0L;
        this.f10690k = 0;
        this.f10691l = 0;
        if (j2 != 0) {
            x xVar = this.t;
            if (xVar instanceof f) {
                this.q = ((f) xVar).c(j2);
                return;
            }
        }
        this.q = 0L;
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    public final void b() {
        g.i(this.s);
        x0.i(this.r);
    }

    @Override // c.f.a.b.z2.j
    public void c(l lVar) {
        this.r = lVar;
        this.s = lVar.e(0, 1);
        lVar.p();
    }

    @Override // c.f.a.b.z2.j
    public boolean e(k kVar) {
        return q(kVar);
    }

    public final x f(long j2) {
        return new f(j2, this.f10693n, d(this.f10694o, 20000L), this.f10694o);
    }

    @Override // c.f.a.b.z2.j
    public int g(k kVar, w wVar) throws w1 {
        b();
        if (kVar.getPosition() == 0 && !q(kVar)) {
            throw w1.a("Could not find AMR header.", null);
        }
        m();
        int iR = r(kVar);
        n(kVar.getLength(), iR);
        return iR;
    }

    public final int h(int i2) throws w1 {
        if (j(i2)) {
            return this.f10688i ? f10682c[i2] : f10681b[i2];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f10688i ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i2);
        throw w1.a(sb.toString(), null);
    }

    public final boolean i(int i2) {
        return !this.f10688i && (i2 < 12 || i2 > 14);
    }

    public final boolean j(int i2) {
        return i2 >= 0 && i2 <= 15 && (k(i2) || i(i2));
    }

    public final boolean k(int i2) {
        return this.f10688i && (i2 < 10 || i2 > 13);
    }

    @RequiresNonNull({"trackOutput"})
    public final void m() {
        if (this.u) {
            return;
        }
        this.u = true;
        boolean z = this.f10688i;
        this.s.e(new k1.b().e0(z ? "audio/amr-wb" : "audio/3gpp").W(f10685f).H(1).f0(z ? 16000 : 8000).E());
    }

    @RequiresNonNull({"extractorOutput"})
    public final void n(long j2, int i2) {
        x bVar;
        int i3;
        if (this.f10692m) {
            return;
        }
        if ((this.f10687h & 1) == 0 || j2 == -1 || !((i3 = this.f10694o) == -1 || i3 == this.f10690k)) {
            bVar = new x.b(-9223372036854775807L);
        } else if (this.p < 20 && i2 != -1) {
            return;
        } else {
            bVar = f(j2);
        }
        this.t = bVar;
        this.r.i(bVar);
        this.f10692m = true;
    }

    public final int p(k kVar) throws w1 {
        kVar.r();
        kVar.u(this.f10686g, 0, 1);
        byte b2 = this.f10686g[0];
        if ((b2 & 131) <= 0) {
            return h((b2 >> 3) & 15);
        }
        throw w1.a("Invalid padding bits for frame header " + ((int) b2), null);
    }

    public final boolean q(k kVar) {
        int length;
        byte[] bArr = f10683d;
        if (o(kVar, bArr)) {
            this.f10688i = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f10684e;
            if (!o(kVar, bArr2)) {
                return false;
            }
            this.f10688i = true;
            length = bArr2.length;
        }
        kVar.s(length);
        return true;
    }

    @RequiresNonNull({"trackOutput"})
    public final int r(k kVar) throws w1 {
        if (this.f10691l == 0) {
            try {
                int iP = p(kVar);
                this.f10690k = iP;
                this.f10691l = iP;
                if (this.f10694o == -1) {
                    this.f10693n = kVar.getPosition();
                    this.f10694o = this.f10690k;
                }
                if (this.f10694o == this.f10690k) {
                    this.p++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iB = this.s.b(kVar, this.f10691l, true);
        if (iB == -1) {
            return -1;
        }
        int i2 = this.f10691l - iB;
        this.f10691l = i2;
        if (i2 > 0) {
            return 0;
        }
        this.s.d(this.q + this.f10689j, 1, this.f10690k, 0, null);
        this.f10689j += 20000;
        return 0;
    }

    @Override // c.f.a.b.z2.j
    public void release() {
    }
}
