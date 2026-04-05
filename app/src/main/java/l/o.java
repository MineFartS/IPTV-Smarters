package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f31080b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f31081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f31082d;

    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            o oVar = o.this;
            if (oVar.f31082d) {
                throw new IOException("closed");
            }
            return (int) Math.min(oVar.f31080b.f31048d, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            o.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            o oVar = o.this;
            if (oVar.f31082d) {
                throw new IOException("closed");
            }
            c cVar = oVar.f31080b;
            if (cVar.f31048d == 0 && oVar.f31081c.k(cVar, 8192L) == -1) {
                return -1;
            }
            return o.this.f31080b.T() & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) throws IOException {
            if (o.this.f31082d) {
                throw new IOException("closed");
            }
            v.b(bArr.length, i2, i3);
            o oVar = o.this;
            c cVar = oVar.f31080b;
            if (cVar.f31048d == 0 && oVar.f31081c.k(cVar, 8192L) == -1) {
                return -1;
            }
            return o.this.f31080b.y(bArr, i2, i3);
        }

        public String toString() {
            return o.this + ".inputStream()";
        }
    }

    public o(t tVar) {
        if (tVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f31081c = tVar;
    }

    @Override // l.e
    public int C() throws EOFException {
        v0(4L);
        return this.f31080b.C();
    }

    @Override // l.e
    public boolean H() {
        if (this.f31082d) {
            throw new IllegalStateException("closed");
        }
        return this.f31080b.H() && this.f31081c.k(this.f31080b, 8192L) == -1;
    }

    @Override // l.e
    public boolean R(long j2, f fVar) {
        return i(j2, fVar, 0, fVar.size());
    }

    @Override // l.e
    public String S(Charset charset) {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.f31080b.X(this.f31081c);
        return this.f31080b.S(charset);
    }

    @Override // l.e
    public byte T() throws EOFException {
        v0(1L);
        return this.f31080b.T();
    }

    @Override // l.e
    public void W(byte[] bArr) throws EOFException {
        try {
            v0(bArr.length);
            this.f31080b.W(bArr);
        } catch (EOFException e2) {
            int i2 = 0;
            while (true) {
                c cVar = this.f31080b;
                long j2 = cVar.f31048d;
                if (j2 <= 0) {
                    throw e2;
                }
                int iY = cVar.y(bArr, i2, (int) j2);
                if (iY == -1) {
                    throw new AssertionError();
                }
                i2 += iY;
            }
        }
    }

    @Override // l.e
    public void Z(long j2) throws EOFException {
        if (this.f31082d) {
            throw new IllegalStateException("closed");
        }
        while (j2 > 0) {
            c cVar = this.f31080b;
            if (cVar.f31048d == 0 && this.f31081c.k(cVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j2, this.f31080b.H0());
            this.f31080b.Z(jMin);
            j2 -= jMin;
        }
    }

    @Override // l.e
    public String b0() {
        return l(Long.MAX_VALUE);
    }

    @Override // l.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f31082d) {
            return;
        }
        this.f31082d = true;
        this.f31081c.close();
        this.f31080b.l();
    }

    public long d(byte b2, long j2, long j3) {
        if (this.f31082d) {
            throw new IllegalStateException("closed");
        }
        if (j2 < 0 || j3 < j2) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j2), Long.valueOf(j3)));
        }
        while (j2 < j3) {
            long jR = this.f31080b.r(b2, j2, j3);
            if (jR != -1) {
                return jR;
            }
            c cVar = this.f31080b;
            long j4 = cVar.f31048d;
            if (j4 >= j3 || this.f31081c.k(cVar, 8192L) == -1) {
                break;
            }
            j2 = Math.max(j2, j4);
        }
        return -1L;
    }

    @Override // l.e
    public int d0() throws EOFException {
        v0(4L);
        return this.f31080b.d0();
    }

    @Override // l.e
    public byte[] e0(long j2) throws EOFException {
        v0(j2);
        return this.f31080b.e0(j2);
    }

    @Override // l.e
    public f g(long j2) throws EOFException {
        v0(j2);
        return this.f31080b.g(j2);
    }

    public boolean i(long j2, f fVar, int i2, int i3) {
        if (this.f31082d) {
            throw new IllegalStateException("closed");
        }
        if (j2 < 0 || i2 < 0 || i3 < 0 || fVar.size() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            long j3 = ((long) i4) + j2;
            if (!m(1 + j3) || this.f31080b.q(j3) != fVar.t(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    @Override // l.e
    public InputStream inputStream() {
        return new a();
    }

    @Override // l.t
    public long k(c cVar, long j2) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        if (this.f31082d) {
            throw new IllegalStateException("closed");
        }
        c cVar2 = this.f31080b;
        if (cVar2.f31048d == 0 && this.f31081c.k(cVar2, 8192L) == -1) {
            return -1L;
        }
        return this.f31080b.k(cVar, Math.min(j2, this.f31080b.f31048d));
    }

    public String l(long j2) throws EOFException {
        if (j2 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j2);
        }
        long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
        long jD = d((byte) 10, 0L, j3);
        if (jD != -1) {
            return this.f31080b.F0(jD);
        }
        if (j3 < Long.MAX_VALUE && m(j3) && this.f31080b.q(j3 - 1) == 13 && m(1 + j3) && this.f31080b.q(j3) == 10) {
            return this.f31080b.F0(j3);
        }
        c cVar = new c();
        c cVar2 = this.f31080b;
        cVar2.o(cVar, 0L, Math.min(32L, cVar2.H0()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f31080b.H0(), j2) + " content=" + cVar.B0().u() + (char) 8230);
    }

    @Override // l.e
    public short l0() throws EOFException {
        v0(2L);
        return this.f31080b.l0();
    }

    public boolean m(long j2) {
        c cVar;
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        if (this.f31082d) {
            throw new IllegalStateException("closed");
        }
        do {
            cVar = this.f31080b;
            if (cVar.f31048d >= j2) {
                return true;
            }
        } while (this.f31081c.k(cVar, 8192L) != -1);
        return false;
    }

    @Override // l.e
    public long o0(s sVar) {
        c cVar;
        if (sVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        long j2 = 0;
        while (true) {
            long jK = this.f31081c.k(this.f31080b, 8192L);
            cVar = this.f31080b;
            if (jK == -1) {
                break;
            }
            long jN = cVar.n();
            if (jN > 0) {
                j2 += jN;
                sVar.h(this.f31080b, jN);
            }
        }
        if (cVar.H0() <= 0) {
            return j2;
        }
        long jH0 = j2 + this.f31080b.H0();
        c cVar2 = this.f31080b;
        sVar.h(cVar2, cVar2.H0());
        return jH0;
    }

    @Override // l.e
    public short p0() throws EOFException {
        v0(2L);
        return this.f31080b.p0();
    }

    @Override // l.t
    public u timeout() {
        return this.f31081c.timeout();
    }

    public String toString() {
        return "buffer(" + this.f31081c + ")";
    }

    @Override // l.e
    public void v0(long j2) throws EOFException {
        if (!m(j2)) {
            throw new EOFException();
        }
    }

    @Override // l.e
    public long y0(byte b2) {
        return d(b2, 0L, Long.MAX_VALUE);
    }

    @Override // l.e, l.d
    public c z() {
        return this.f31080b;
    }

    @Override // l.e
    public long z0() throws EOFException {
        byte bQ;
        v0(1L);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (!m(i3)) {
                break;
            }
            bQ = this.f31080b.q(i2);
            if ((bQ < 48 || bQ > 57) && ((bQ < 97 || bQ > 102) && (bQ < 65 || bQ > 70))) {
                break;
            }
            i2 = i3;
        }
        if (i2 == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bQ)));
        }
        return this.f31080b.z0();
    }
}
