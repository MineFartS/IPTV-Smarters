package c.f.a.c.j.c;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z9 extends i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f13155a = Logger.getLogger(z9.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f13156b = nd.y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ca f13157c;

    public static class a extends z9 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f13158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f13159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f13160f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13161g;

        public a(byte[] bArr, int i2, int i3) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if ((i3 | 0 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i3)));
            }
            this.f13158d = bArr;
            this.f13159e = 0;
            this.f13161g = 0;
            this.f13160f = i3;
        }

        public final void F0(byte[] bArr, int i2, int i3) throws b {
            try {
                System.arraycopy(bArr, i2, this.f13158d, this.f13161g, i3);
                this.f13161g += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13161g), Integer.valueOf(this.f13160f), Integer.valueOf(i3)), e2);
            }
        }

        @Override // c.f.a.c.j.c.z9
        public final void L(int i2, m9 m9Var) {
            b(1, 3);
            i0(2, i2);
            k(3, m9Var);
            b(1, 4);
        }

        @Override // c.f.a.c.j.c.z9
        public final void M(int i2, boolean z) {
            b(i2, 0);
            U(z ? (byte) 1 : (byte) 0);
        }

        @Override // c.f.a.c.j.c.z9
        public final void N(bc bcVar) {
            q(bcVar.c());
            bcVar.b(this);
        }

        @Override // c.f.a.c.j.c.z9
        public final void U(byte b2) throws b {
            try {
                byte[] bArr = this.f13158d;
                int i2 = this.f13161g;
                this.f13161g = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13161g), Integer.valueOf(this.f13160f), 1), e2);
            }
        }

        @Override // c.f.a.c.j.c.z9
        public final void W(int i2, long j2) {
            b(i2, 1);
            u0(j2);
        }

        @Override // c.f.a.c.j.c.z9
        public final void X(int i2, String str) {
            b(i2, 2);
            t(str);
        }

        @Override // c.f.a.c.j.c.i9
        public final void a(byte[] bArr, int i2, int i3) throws b {
            F0(bArr, i2, i3);
        }

        @Override // c.f.a.c.j.c.z9
        public final void b(int i2, int i3) {
            q((i2 << 3) | i3);
        }

        @Override // c.f.a.c.j.c.z9
        public final void g0(int i2, int i3) {
            b(i2, 0);
            p(i3);
        }

        @Override // c.f.a.c.j.c.z9
        public final void i0(int i2, int i3) {
            b(i2, 0);
            q(i3);
        }

        @Override // c.f.a.c.j.c.z9
        public final void j(int i2, long j2) {
            b(i2, 0);
            q0(j2);
        }

        @Override // c.f.a.c.j.c.z9
        public final void k(int i2, m9 m9Var) {
            b(i2, 2);
            n(m9Var);
        }

        @Override // c.f.a.c.j.c.z9
        public final int k0() {
            return this.f13160f - this.f13161g;
        }

        @Override // c.f.a.c.j.c.z9
        public final void l(int i2, bc bcVar) {
            b(1, 3);
            i0(2, i2);
            b(3, 2);
            N(bcVar);
            b(1, 4);
        }

        @Override // c.f.a.c.j.c.z9
        public final void l0(int i2, int i3) {
            b(i2, 5);
            s(i3);
        }

        @Override // c.f.a.c.j.c.z9
        public final void m(int i2, bc bcVar, pc pcVar) {
            b(i2, 2);
            d9 d9Var = (d9) bcVar;
            int iH = d9Var.h();
            if (iH == -1) {
                iH = pcVar.f(d9Var);
                d9Var.g(iH);
            }
            q(iH);
            pcVar.c(bcVar, this.f13157c);
        }

        @Override // c.f.a.c.j.c.z9
        public final void n(m9 m9Var) {
            q(m9Var.size());
            m9Var.d(this);
        }

        @Override // c.f.a.c.j.c.z9
        public final void p(int i2) {
            if (i2 >= 0) {
                q(i2);
            } else {
                q0(i2);
            }
        }

        @Override // c.f.a.c.j.c.z9
        public final void q(int i2) throws b {
            if (!z9.f13156b || j9.b() || k0() < 5) {
                while ((i2 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f13158d;
                        int i3 = this.f13161g;
                        this.f13161g = i3 + 1;
                        bArr[i3] = (byte) ((i2 & 127) | 128);
                        i2 >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13161g), Integer.valueOf(this.f13160f), 1), e2);
                    }
                }
                byte[] bArr2 = this.f13158d;
                int i4 = this.f13161g;
                this.f13161g = i4 + 1;
                bArr2[i4] = (byte) i2;
                return;
            }
            if ((i2 & (-128)) == 0) {
                byte[] bArr3 = this.f13158d;
                int i5 = this.f13161g;
                this.f13161g = i5 + 1;
                nd.i(bArr3, i5, (byte) i2);
                return;
            }
            byte[] bArr4 = this.f13158d;
            int i6 = this.f13161g;
            this.f13161g = i6 + 1;
            nd.i(bArr4, i6, (byte) (i2 | 128));
            int i7 = i2 >>> 7;
            if ((i7 & (-128)) == 0) {
                byte[] bArr5 = this.f13158d;
                int i8 = this.f13161g;
                this.f13161g = i8 + 1;
                nd.i(bArr5, i8, (byte) i7);
                return;
            }
            byte[] bArr6 = this.f13158d;
            int i9 = this.f13161g;
            this.f13161g = i9 + 1;
            nd.i(bArr6, i9, (byte) (i7 | 128));
            int i10 = i7 >>> 7;
            if ((i10 & (-128)) == 0) {
                byte[] bArr7 = this.f13158d;
                int i11 = this.f13161g;
                this.f13161g = i11 + 1;
                nd.i(bArr7, i11, (byte) i10);
                return;
            }
            byte[] bArr8 = this.f13158d;
            int i12 = this.f13161g;
            this.f13161g = i12 + 1;
            nd.i(bArr8, i12, (byte) (i10 | 128));
            int i13 = i10 >>> 7;
            if ((i13 & (-128)) == 0) {
                byte[] bArr9 = this.f13158d;
                int i14 = this.f13161g;
                this.f13161g = i14 + 1;
                nd.i(bArr9, i14, (byte) i13);
                return;
            }
            byte[] bArr10 = this.f13158d;
            int i15 = this.f13161g;
            this.f13161g = i15 + 1;
            nd.i(bArr10, i15, (byte) (i13 | 128));
            byte[] bArr11 = this.f13158d;
            int i16 = this.f13161g;
            this.f13161g = i16 + 1;
            nd.i(bArr11, i16, (byte) (i13 >>> 7));
        }

        @Override // c.f.a.c.j.c.z9
        public final void q0(long j2) throws b {
            if (z9.f13156b && k0() >= 10) {
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.f13158d;
                    int i2 = this.f13161g;
                    this.f13161g = i2 + 1;
                    nd.i(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.f13158d;
                int i3 = this.f13161g;
                this.f13161g = i3 + 1;
                nd.i(bArr2, i3, (byte) j2);
                return;
            }
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f13158d;
                    int i4 = this.f13161g;
                    this.f13161g = i4 + 1;
                    bArr3[i4] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13161g), Integer.valueOf(this.f13160f), 1), e2);
                }
            }
            byte[] bArr4 = this.f13158d;
            int i5 = this.f13161g;
            this.f13161g = i5 + 1;
            bArr4[i5] = (byte) j2;
        }

        @Override // c.f.a.c.j.c.z9
        public final void s(int i2) throws b {
            try {
                byte[] bArr = this.f13158d;
                int i3 = this.f13161g;
                int i4 = i3 + 1;
                this.f13161g = i4;
                bArr[i3] = (byte) i2;
                int i5 = i4 + 1;
                this.f13161g = i5;
                bArr[i4] = (byte) (i2 >> 8);
                int i6 = i5 + 1;
                this.f13161g = i6;
                bArr[i5] = (byte) (i2 >> 16);
                this.f13161g = i6 + 1;
                bArr[i6] = (byte) (i2 >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13161g), Integer.valueOf(this.f13160f), 1), e2);
            }
        }

        @Override // c.f.a.c.j.c.z9
        public final void t(String str) throws b {
            int i2 = this.f13161g;
            try {
                int iX = z9.x(str.length() * 3);
                int iX2 = z9.x(str.length());
                if (iX2 != iX) {
                    q(rd.a(str));
                    this.f13161g = rd.b(str, this.f13158d, this.f13161g, k0());
                    return;
                }
                int i3 = i2 + iX2;
                this.f13161g = i3;
                int iB = rd.b(str, this.f13158d, i3, k0());
                this.f13161g = i2;
                q((iB - i2) - iX2);
                this.f13161g = iB;
            } catch (vd e2) {
                this.f13161g = i2;
                o(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new b(e3);
            }
        }

        @Override // c.f.a.c.j.c.z9
        public final void u0(long j2) throws b {
            try {
                byte[] bArr = this.f13158d;
                int i2 = this.f13161g;
                int i3 = i2 + 1;
                this.f13161g = i3;
                bArr[i2] = (byte) j2;
                int i4 = i3 + 1;
                this.f13161g = i4;
                bArr[i3] = (byte) (j2 >> 8);
                int i5 = i4 + 1;
                this.f13161g = i5;
                bArr[i4] = (byte) (j2 >> 16);
                int i6 = i5 + 1;
                this.f13161g = i6;
                bArr[i5] = (byte) (j2 >> 24);
                int i7 = i6 + 1;
                this.f13161g = i7;
                bArr[i6] = (byte) (j2 >> 32);
                int i8 = i7 + 1;
                this.f13161g = i8;
                bArr[i7] = (byte) (j2 >> 40);
                int i9 = i8 + 1;
                this.f13161g = i9;
                bArr[i8] = (byte) (j2 >> 48);
                this.f13161g = i9 + 1;
                bArr[i9] = (byte) (j2 >> 56);
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13161g), Integer.valueOf(this.f13160f), 1), e2);
            }
        }
    }

    public static class b extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        public b(String str, Throwable th) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
        }

        public b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    public z9() {
    }

    public static int A(int i2) {
        return 4;
    }

    public static int A0(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            i2 = 6;
            j2 >>>= 28;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static int B(int i2) {
        return w(i2);
    }

    public static int B0(long j2) {
        return A0(E0(j2));
    }

    public static int C(float f2) {
        return 4;
    }

    public static int C0(long j2) {
        return 8;
    }

    public static int D(int i2, double d2) {
        return x(i2 << 3) + 8;
    }

    public static int D0(long j2) {
        return 8;
    }

    public static int E(int i2, float f2) {
        return x(i2 << 3) + 4;
    }

    public static long E0(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static int F(int i2, fb fbVar) {
        return (x(8) << 1) + p0(2, i2) + c(3, fbVar);
    }

    public static int G(int i2, bc bcVar) {
        return (x(8) << 1) + p0(2, i2) + x(24) + T(bcVar);
    }

    public static int H(int i2, bc bcVar, pc pcVar) {
        return x(i2 << 3) + e(bcVar, pcVar);
    }

    public static int I(m9 m9Var) {
        int size = m9Var.size();
        return x(size) + size;
    }

    public static int J(byte[] bArr) {
        int length = bArr.length;
        return x(length) + length;
    }

    public static int O(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    @Deprecated
    public static int P(int i2) {
        return x(i2);
    }

    public static int Q(int i2, m9 m9Var) {
        int iX = x(i2 << 3);
        int size = m9Var.size();
        return iX + x(size) + size;
    }

    @Deprecated
    public static int R(int i2, bc bcVar, pc pcVar) {
        int iX = x(i2 << 3) << 1;
        d9 d9Var = (d9) bcVar;
        int iH = d9Var.h();
        if (iH == -1) {
            iH = pcVar.f(d9Var);
            d9Var.g(iH);
        }
        return iX + iH;
    }

    public static int S(int i2, boolean z) {
        return x(i2 << 3) + 1;
    }

    public static int T(bc bcVar) {
        int iC = bcVar.c();
        return x(iC) + iC;
    }

    public static int Y(double d2) {
        return 8;
    }

    public static int Z(int i2, long j2) {
        return x(i2 << 3) + A0(j2);
    }

    public static int a0(int i2, m9 m9Var) {
        return (x(8) << 1) + p0(2, i2) + Q(3, m9Var);
    }

    public static int b0(int i2, String str) {
        return x(i2 << 3) + v(str);
    }

    public static int c(int i2, fb fbVar) {
        int iX = x(i2 << 3);
        int iD = fbVar.d();
        return iX + x(iD) + iD;
    }

    @Deprecated
    public static int c0(bc bcVar) {
        return bcVar.c();
    }

    public static int d(fb fbVar) {
        int iD = fbVar.d();
        return x(iD) + iD;
    }

    public static int d0(int i2, long j2) {
        return x(i2 << 3) + A0(j2);
    }

    public static int e(bc bcVar, pc pcVar) {
        d9 d9Var = (d9) bcVar;
        int iH = d9Var.h();
        if (iH == -1) {
            iH = pcVar.f(d9Var);
            d9Var.g(iH);
        }
        return x(iH) + iH;
    }

    public static int e0(int i2, long j2) {
        return x(i2 << 3) + A0(E0(j2));
    }

    public static z9 f(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int f0(int i2, long j2) {
        return x(i2 << 3) + 8;
    }

    public static int h0(int i2, long j2) {
        return x(i2 << 3) + 8;
    }

    public static int o0(int i2, int i3) {
        return x(i2 << 3) + w(i3);
    }

    public static int p0(int i2, int i3) {
        return x(i2 << 3) + x(i3);
    }

    public static int r0(int i2, int i3) {
        return x(i2 << 3) + x(O(i3));
    }

    public static int t0(int i2, int i3) {
        return x(i2 << 3) + 4;
    }

    public static int u(int i2) {
        return x(i2 << 3);
    }

    public static int v(String str) {
        int length;
        try {
            length = rd.a(str);
        } catch (vd unused) {
            length = str.getBytes(sa.f13070a).length;
        }
        return x(length) + length;
    }

    public static int w(int i2) {
        if (i2 >= 0) {
            return x(i2);
        }
        return 10;
    }

    public static int w0(int i2, int i3) {
        return x(i2 << 3) + 4;
    }

    public static int x(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int x0(long j2) {
        return A0(j2);
    }

    public static int y(int i2) {
        return x(O(i2));
    }

    public static int y0(boolean z) {
        return 1;
    }

    public static int z(int i2) {
        return 4;
    }

    public static int z0(int i2, int i3) {
        return x(i2 << 3) + w(i3);
    }

    public final void K(int i2, long j2) {
        j(i2, E0(j2));
    }

    public abstract void L(int i2, m9 m9Var);

    public abstract void M(int i2, boolean z);

    public abstract void N(bc bcVar);

    public abstract void U(byte b2);

    public final void V(double d2) {
        u0(Double.doubleToRawLongBits(d2));
    }

    public abstract void W(int i2, long j2);

    public abstract void X(int i2, String str);

    public abstract void b(int i2, int i3);

    public final void g(float f2) {
        s(Float.floatToRawIntBits(f2));
    }

    public abstract void g0(int i2, int i3);

    public final void h(int i2, double d2) {
        W(i2, Double.doubleToRawLongBits(d2));
    }

    public final void i(int i2, float f2) {
        l0(i2, Float.floatToRawIntBits(f2));
    }

    public abstract void i0(int i2, int i3);

    public abstract void j(int i2, long j2);

    public final void j0(int i2, int i3) {
        i0(i2, O(i3));
    }

    public abstract void k(int i2, m9 m9Var);

    public abstract int k0();

    public abstract void l(int i2, bc bcVar);

    public abstract void l0(int i2, int i3);

    public abstract void m(int i2, bc bcVar, pc pcVar);

    public final void m0() {
        if (k0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void n(m9 m9Var);

    public final void o(String str, vd vdVar) throws b {
        f13155a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) vdVar);
        byte[] bytes = str.getBytes(sa.f13070a);
        try {
            q(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (b e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new b(e3);
        }
    }

    public abstract void p(int i2);

    public abstract void q(int i2);

    public abstract void q0(long j2);

    public final void r(int i2) {
        q(O(i2));
    }

    public abstract void s(int i2);

    public final void s0(long j2) {
        q0(E0(j2));
    }

    public abstract void t(String str);

    public abstract void u0(long j2);

    public final void v0(boolean z) {
        U(z ? (byte) 1 : (byte) 0);
    }
}
