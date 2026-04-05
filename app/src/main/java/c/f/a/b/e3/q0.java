package c.f.a.b.e3;

import c.f.a.b.e3.r0;
import c.f.a.b.z2.a0;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.b.i3.f f7933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f7935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f7936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f7937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f7938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f7939g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c.f.a.b.i3.e f7943d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a f7944e;

        public a(long j2, int i2) {
            this.f7940a = j2;
            this.f7941b = j2 + ((long) i2);
        }

        public a a() {
            this.f7943d = null;
            a aVar = this.f7944e;
            this.f7944e = null;
            return aVar;
        }

        public void b(c.f.a.b.i3.e eVar, a aVar) {
            this.f7943d = eVar;
            this.f7944e = aVar;
            this.f7942c = true;
        }

        public int c(long j2) {
            return ((int) (j2 - this.f7940a)) + this.f7943d.f8859b;
        }
    }

    public q0(c.f.a.b.i3.f fVar) {
        this.f7933a = fVar;
        int iE = fVar.e();
        this.f7934b = iE;
        this.f7935c = new c.f.a.b.j3.i0(32);
        a aVar = new a(0L, iE);
        this.f7936d = aVar;
        this.f7937e = aVar;
        this.f7938f = aVar;
    }

    public static a d(a aVar, long j2) {
        while (j2 >= aVar.f7941b) {
            aVar = aVar.f7944e;
        }
        return aVar;
    }

    public static a i(a aVar, long j2, ByteBuffer byteBuffer, int i2) {
        a aVarD = d(aVar, j2);
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (aVarD.f7941b - j2));
            byteBuffer.put(aVarD.f7943d.f8858a, aVarD.c(j2), iMin);
            i2 -= iMin;
            j2 += (long) iMin;
            if (j2 == aVarD.f7941b) {
                aVarD = aVarD.f7944e;
            }
        }
        return aVarD;
    }

    public static a j(a aVar, long j2, byte[] bArr, int i2) {
        a aVarD = d(aVar, j2);
        int i3 = i2;
        while (i3 > 0) {
            int iMin = Math.min(i3, (int) (aVarD.f7941b - j2));
            System.arraycopy(aVarD.f7943d.f8858a, aVarD.c(j2), bArr, i2 - i3, iMin);
            i3 -= iMin;
            j2 += (long) iMin;
            if (j2 == aVarD.f7941b) {
                aVarD = aVarD.f7944e;
            }
        }
        return aVarD;
    }

    public static a k(a aVar, c.f.a.b.v2.f fVar, r0.b bVar, c.f.a.b.j3.i0 i0Var) {
        int iJ;
        long j2 = bVar.f7971b;
        i0Var.L(1);
        a aVarJ = j(aVar, j2, i0Var.d(), 1);
        long j3 = j2 + 1;
        byte b2 = i0Var.d()[0];
        boolean z = (b2 & 128) != 0;
        int i2 = b2 & 127;
        c.f.a.b.v2.b bVar2 = fVar.f10275b;
        byte[] bArr = bVar2.f10252a;
        if (bArr == null) {
            bVar2.f10252a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a aVarJ2 = j(aVarJ, j3, bVar2.f10252a, i2);
        long j4 = j3 + ((long) i2);
        if (z) {
            i0Var.L(2);
            aVarJ2 = j(aVarJ2, j4, i0Var.d(), 2);
            j4 += 2;
            iJ = i0Var.J();
        } else {
            iJ = 1;
        }
        int[] iArr = bVar2.f10255d;
        if (iArr == null || iArr.length < iJ) {
            iArr = new int[iJ];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = bVar2.f10256e;
        if (iArr3 == null || iArr3.length < iJ) {
            iArr3 = new int[iJ];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = iJ * 6;
            i0Var.L(i3);
            aVarJ2 = j(aVarJ2, j4, i0Var.d(), i3);
            j4 += (long) i3;
            i0Var.P(0);
            for (int i4 = 0; i4 < iJ; i4++) {
                iArr2[i4] = i0Var.J();
                iArr4[i4] = i0Var.H();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f7970a - ((int) (j4 - bVar.f7971b));
        }
        a0.a aVar2 = (a0.a) c.f.a.b.j3.x0.i(bVar.f7972c);
        bVar2.c(iJ, iArr2, iArr4, aVar2.f10627b, bVar2.f10252a, aVar2.f10626a, aVar2.f10628c, aVar2.f10629d);
        long j5 = bVar.f7971b;
        int i5 = (int) (j4 - j5);
        bVar.f7971b = j5 + ((long) i5);
        bVar.f7970a -= i5;
        return aVarJ2;
    }

    public static a l(a aVar, c.f.a.b.v2.f fVar, r0.b bVar, c.f.a.b.j3.i0 i0Var) {
        long j2;
        ByteBuffer byteBuffer;
        if (fVar.p()) {
            aVar = k(aVar, fVar, bVar, i0Var);
        }
        if (fVar.hasSupplementalData()) {
            i0Var.L(4);
            a aVarJ = j(aVar, bVar.f7971b, i0Var.d(), 4);
            int iH = i0Var.H();
            bVar.f7971b += 4;
            bVar.f7970a -= 4;
            fVar.i(iH);
            aVar = i(aVarJ, bVar.f7971b, fVar.f10276c, iH);
            bVar.f7971b += (long) iH;
            int i2 = bVar.f7970a - iH;
            bVar.f7970a = i2;
            fVar.r(i2);
            j2 = bVar.f7971b;
            byteBuffer = fVar.f10279f;
        } else {
            fVar.i(bVar.f7970a);
            j2 = bVar.f7971b;
            byteBuffer = fVar.f10276c;
        }
        return i(aVar, j2, byteBuffer, bVar.f7970a);
    }

    public final void a(a aVar) {
        if (aVar.f7942c) {
            a aVar2 = this.f7938f;
            boolean z = aVar2.f7942c;
            int i2 = (z ? 1 : 0) + (((int) (aVar2.f7940a - aVar.f7940a)) / this.f7934b);
            c.f.a.b.i3.e[] eVarArr = new c.f.a.b.i3.e[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                eVarArr[i3] = aVar.f7943d;
                aVar = aVar.a();
            }
            this.f7933a.d(eVarArr);
        }
    }

    public void b(long j2) {
        a aVar;
        if (j2 == -1) {
            return;
        }
        while (true) {
            aVar = this.f7936d;
            if (j2 < aVar.f7941b) {
                break;
            }
            this.f7933a.a(aVar.f7943d);
            this.f7936d = this.f7936d.a();
        }
        if (this.f7937e.f7940a < aVar.f7940a) {
            this.f7937e = aVar;
        }
    }

    public void c(long j2) {
        this.f7939g = j2;
        if (j2 != 0) {
            a aVar = this.f7936d;
            if (j2 != aVar.f7940a) {
                while (this.f7939g > aVar.f7941b) {
                    aVar = aVar.f7944e;
                }
                a aVar2 = aVar.f7944e;
                a(aVar2);
                a aVar3 = new a(aVar.f7941b, this.f7934b);
                aVar.f7944e = aVar3;
                if (this.f7939g == aVar.f7941b) {
                    aVar = aVar3;
                }
                this.f7938f = aVar;
                if (this.f7937e == aVar2) {
                    this.f7937e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f7936d);
        a aVar4 = new a(this.f7939g, this.f7934b);
        this.f7936d = aVar4;
        this.f7937e = aVar4;
        this.f7938f = aVar4;
    }

    public long e() {
        return this.f7939g;
    }

    public void f(c.f.a.b.v2.f fVar, r0.b bVar) {
        l(this.f7937e, fVar, bVar, this.f7935c);
    }

    public final void g(int i2) {
        long j2 = this.f7939g + ((long) i2);
        this.f7939g = j2;
        a aVar = this.f7938f;
        if (j2 == aVar.f7941b) {
            this.f7938f = aVar.f7944e;
        }
    }

    public final int h(int i2) {
        a aVar = this.f7938f;
        if (!aVar.f7942c) {
            aVar.b(this.f7933a.b(), new a(this.f7938f.f7941b, this.f7934b));
        }
        return Math.min(i2, (int) (this.f7938f.f7941b - this.f7939g));
    }

    public void m(c.f.a.b.v2.f fVar, r0.b bVar) {
        this.f7937e = l(this.f7937e, fVar, bVar, this.f7935c);
    }

    public void n() {
        a(this.f7936d);
        a aVar = new a(0L, this.f7934b);
        this.f7936d = aVar;
        this.f7937e = aVar;
        this.f7938f = aVar;
        this.f7939g = 0L;
        this.f7933a.c();
    }

    public void o() {
        this.f7937e = this.f7936d;
    }

    public int p(c.f.a.b.i3.l lVar, int i2, boolean z) throws EOFException {
        int iH = h(i2);
        a aVar = this.f7938f;
        int iB = lVar.b(aVar.f7943d.f8858a, aVar.c(this.f7939g), iH);
        if (iB != -1) {
            g(iB);
            return iB;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(c.f.a.b.j3.i0 i0Var, int i2) {
        while (i2 > 0) {
            int iH = h(i2);
            a aVar = this.f7938f;
            i0Var.j(aVar.f7943d.f8858a, aVar.c(this.f7939g), iH);
            i2 -= iH;
            g(iH);
        }
    }
}
