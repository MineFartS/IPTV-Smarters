package c.f.a.b.z2.h0;

import c.f.a.b.w1;
import c.f.a.b.z2.k;
import java.util.ArrayDeque;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f10802a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<C0146b> f10803b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f10804c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f10805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f10808g;

    /* JADX INFO: renamed from: c.f.a.b.z2.h0.b$b, reason: collision with other inner class name */
    public static final class C0146b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f10810b;

        public C0146b(int i2, long j2) {
            this.f10809a = i2;
            this.f10810b = j2;
        }
    }

    public static String f(k kVar, int i2) {
        if (i2 == 0) {
            return BuildConfig.FLAVOR;
        }
        byte[] bArr = new byte[i2];
        kVar.l(bArr, 0, i2);
        while (i2 > 0 && bArr[i2 - 1] == 0) {
            i2--;
        }
        return new String(bArr, 0, i2);
    }

    @Override // c.f.a.b.z2.h0.d
    public boolean a(k kVar) throws w1 {
        c.f.a.b.j3.g.i(this.f10805d);
        while (true) {
            C0146b c0146bPeek = this.f10803b.peek();
            if (c0146bPeek != null && kVar.getPosition() >= c0146bPeek.f10810b) {
                this.f10805d.a(this.f10803b.pop().f10809a);
                return true;
            }
            if (this.f10806e == 0) {
                long jD = this.f10804c.d(kVar, true, false, 4);
                if (jD == -2) {
                    jD = c(kVar);
                }
                if (jD == -1) {
                    return false;
                }
                this.f10807f = (int) jD;
                this.f10806e = 1;
            }
            if (this.f10806e == 1) {
                this.f10808g = this.f10804c.d(kVar, false, true, 8);
                this.f10806e = 2;
            }
            int iB = this.f10805d.b(this.f10807f);
            if (iB != 0) {
                if (iB == 1) {
                    long position = kVar.getPosition();
                    this.f10803b.push(new C0146b(this.f10807f, this.f10808g + position));
                    this.f10805d.g(this.f10807f, position, this.f10808g);
                    this.f10806e = 0;
                    return true;
                }
                if (iB == 2) {
                    long j2 = this.f10808g;
                    if (j2 <= 8) {
                        this.f10805d.h(this.f10807f, e(kVar, (int) j2));
                        this.f10806e = 0;
                        return true;
                    }
                    throw w1.a("Invalid integer size: " + this.f10808g, null);
                }
                if (iB == 3) {
                    long j3 = this.f10808g;
                    if (j3 <= 2147483647L) {
                        this.f10805d.e(this.f10807f, f(kVar, (int) j3));
                        this.f10806e = 0;
                        return true;
                    }
                    throw w1.a("String element size: " + this.f10808g, null);
                }
                if (iB == 4) {
                    this.f10805d.d(this.f10807f, (int) this.f10808g, kVar);
                    this.f10806e = 0;
                    return true;
                }
                if (iB != 5) {
                    throw w1.a("Invalid element type " + iB, null);
                }
                long j4 = this.f10808g;
                if (j4 == 4 || j4 == 8) {
                    this.f10805d.f(this.f10807f, d(kVar, (int) j4));
                    this.f10806e = 0;
                    return true;
                }
                throw w1.a("Invalid float size: " + this.f10808g, null);
            }
            kVar.s((int) this.f10808g);
            this.f10806e = 0;
        }
    }

    @Override // c.f.a.b.z2.h0.d
    public void b(c cVar) {
        this.f10805d = cVar;
    }

    @RequiresNonNull({"processor"})
    public final long c(k kVar) {
        kVar.r();
        while (true) {
            kVar.u(this.f10802a, 0, 4);
            int iC = g.c(this.f10802a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) g.a(this.f10802a, iC, false);
                if (this.f10805d.c(iA)) {
                    kVar.s(iC);
                    return iA;
                }
            }
            kVar.s(1);
        }
    }

    public final double d(k kVar, int i2) {
        return i2 == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(e(kVar, i2));
    }

    public final long e(k kVar, int i2) {
        kVar.l(this.f10802a, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | ((long) (this.f10802a[i3] & 255));
        }
        return j2;
    }

    @Override // c.f.a.b.z2.h0.d
    public void reset() {
        this.f10806e = 0;
        this.f10803b.clear();
        this.f10804c.e();
    }
}
