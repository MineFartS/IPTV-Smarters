package l;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e, d, Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f31046b = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public p f31047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f31048d;

    /* JADX INFO: loaded from: classes2.dex */
    public class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return c.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i2) {
            c.this.I((byte) i2);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i2, int i3) {
            c.this.f(bArr, i2, i3);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class b extends InputStream {
        public b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.f31048d, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            c cVar = c.this;
            if (cVar.f31048d > 0) {
                return cVar.T() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            return c.this.y(bArr, i2, i3);
        }

        public String toString() {
            return c.this + ".inputStream()";
        }
    }

    public byte[] A0() {
        try {
            return e0(this.f31048d);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public f B0() {
        return new f(A0());
    }

    @Override // l.e
    public int C() {
        long j2 = this.f31048d;
        if (j2 < 4) {
            throw new IllegalStateException("size < 4: " + this.f31048d);
        }
        p pVar = this.f31047c;
        int i2 = pVar.f31085b;
        int i3 = pVar.f31086c;
        if (i3 - i2 < 4) {
            return ((T() & 255) << 24) | ((T() & 255) << 16) | ((T() & 255) << 8) | (T() & 255);
        }
        byte[] bArr = pVar.f31084a;
        int i4 = i2 + 1;
        int i5 = i4 + 1;
        int i6 = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16);
        int i7 = i5 + 1;
        int i8 = i6 | ((bArr[i5] & 255) << 8);
        int i9 = i7 + 1;
        int i10 = i8 | (bArr[i7] & 255);
        this.f31048d = j2 - 4;
        if (i9 == i3) {
            this.f31047c = pVar.b();
            q.a(pVar);
        } else {
            pVar.f31085b = i9;
        }
        return i10;
    }

    public String C0(long j2, Charset charset) {
        v.b(this.f31048d, 0L, j2);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j2 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j2);
        }
        if (j2 == 0) {
            return BuildConfig.FLAVOR;
        }
        p pVar = this.f31047c;
        if (((long) pVar.f31085b) + j2 > pVar.f31086c) {
            return new String(e0(j2), charset);
        }
        String str = new String(pVar.f31084a, pVar.f31085b, (int) j2, charset);
        int i2 = (int) (((long) pVar.f31085b) + j2);
        pVar.f31085b = i2;
        this.f31048d -= j2;
        if (i2 == pVar.f31086c) {
            this.f31047c = pVar.b();
            q.a(pVar);
        }
        return str;
    }

    public String D0() {
        try {
            return C0(this.f31048d, v.f31099a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public String E0(long j2) {
        return C0(j2, v.f31099a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String F0(long r7) throws java.io.EOFException {
        /*
            r6 = this;
            r0 = 1
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1c
            long r2 = r7 - r0
            byte r4 = r6.q(r2)
            r5 = 13
            if (r4 != r5) goto L1c
            java.lang.String r7 = r6.E0(r2)
            r0 = 2
        L18:
            r6.Z(r0)
            return r7
        L1c:
            java.lang.String r7 = r6.E0(r7)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: l.c.F0(long):java.lang.String");
    }

    public String G0(long j2) throws EOFException {
        if (j2 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j2);
        }
        long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
        long jR = r((byte) 10, 0L, j3);
        if (jR != -1) {
            return F0(jR);
        }
        if (j3 < H0() && q(j3 - 1) == 13 && q(j3) == 10) {
            return F0(j3);
        }
        c cVar = new c();
        o(cVar, 0L, Math.min(32L, H0()));
        throw new EOFException("\\n not found: limit=" + Math.min(H0(), j2) + " content=" + cVar.B0().u() + (char) 8230);
    }

    @Override // l.e
    public boolean H() {
        return this.f31048d == 0;
    }

    public long H0() {
        return this.f31048d;
    }

    public f I0() {
        long j2 = this.f31048d;
        if (j2 <= 2147483647L) {
            return J0((int) j2);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f31048d);
    }

    public f J0(int i2) {
        return i2 == 0 ? f.f31052c : new r(this, i2);
    }

    public p K0(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException();
        }
        p pVar = this.f31047c;
        if (pVar != null) {
            p pVar2 = pVar.f31090g;
            return (pVar2.f31086c + i2 > 8192 || !pVar2.f31088e) ? pVar2.c(q.b()) : pVar2;
        }
        p pVarB = q.b();
        this.f31047c = pVarB;
        pVarB.f31090g = pVarB;
        pVarB.f31089f = pVarB;
        return pVarB;
    }

    @Override // l.d
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public c j0(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        fVar.F(this);
        return this;
    }

    @Override // l.d
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public c i0(byte[] bArr) {
        if (bArr != null) {
            return f(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // l.d
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public c f(byte[] bArr, int i2, int i3) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j2 = i3;
        v.b(bArr.length, i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            p pVarK0 = K0(1);
            int iMin = Math.min(i4 - i2, 8192 - pVarK0.f31086c);
            System.arraycopy(bArr, i2, pVarK0.f31084a, pVarK0.f31086c, iMin);
            i2 += iMin;
            pVarK0.f31086c += iMin;
        }
        this.f31048d += j2;
        return this;
    }

    @Override // l.d
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public c I(int i2) {
        p pVarK0 = K0(1);
        byte[] bArr = pVarK0.f31084a;
        int i3 = pVarK0.f31086c;
        pVarK0.f31086c = i3 + 1;
        bArr[i3] = (byte) i2;
        this.f31048d++;
        return this;
    }

    @Override // l.d
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public c x0(long j2) {
        if (j2 == 0) {
            return I(48);
        }
        boolean z = false;
        int i2 = 1;
        if (j2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                return P("-9223372036854775808");
            }
            z = true;
        }
        if (j2 >= 100000000) {
            i2 = j2 < 1000000000000L ? j2 < 10000000000L ? j2 < 1000000000 ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
        } else if (j2 >= 10000) {
            i2 = j2 < 1000000 ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
        } else if (j2 >= 100) {
            i2 = j2 < 1000 ? 3 : 4;
        } else if (j2 >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        p pVarK0 = K0(i2);
        byte[] bArr = pVarK0.f31084a;
        int i3 = pVarK0.f31086c + i2;
        while (j2 != 0) {
            i3--;
            bArr[i3] = f31046b[(int) (j2 % 10)];
            j2 /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        pVarK0.f31086c += i2;
        this.f31048d += (long) i2;
        return this;
    }

    @Override // l.d
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public c Y(long j2) {
        if (j2 == 0) {
            return I(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j2)) / 4) + 1;
        p pVarK0 = K0(iNumberOfTrailingZeros);
        byte[] bArr = pVarK0.f31084a;
        int i2 = pVarK0.f31086c;
        for (int i3 = (i2 + iNumberOfTrailingZeros) - 1; i3 >= i2; i3--) {
            bArr[i3] = f31046b[(int) (15 & j2)];
            j2 >>>= 4;
        }
        pVarK0.f31086c += iNumberOfTrailingZeros;
        this.f31048d += (long) iNumberOfTrailingZeros;
        return this;
    }

    @Override // l.e
    public boolean R(long j2, f fVar) {
        return w(j2, fVar, 0, fVar.size());
    }

    @Override // l.d
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public c E(int i2) {
        p pVarK0 = K0(4);
        byte[] bArr = pVarK0.f31084a;
        int i3 = pVarK0.f31086c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & 255);
        bArr[i6] = (byte) (i2 & 255);
        pVarK0.f31086c = i6 + 1;
        this.f31048d += 4;
        return this;
    }

    @Override // l.e
    public String S(Charset charset) {
        try {
            return C0(this.f31048d, charset);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // l.d
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public c D(int i2) {
        p pVarK0 = K0(2);
        byte[] bArr = pVarK0.f31084a;
        int i3 = pVarK0.f31086c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i4] = (byte) (i2 & 255);
        pVarK0.f31086c = i4 + 1;
        this.f31048d += 2;
        return this;
    }

    @Override // l.e
    public byte T() {
        long j2 = this.f31048d;
        if (j2 == 0) {
            throw new IllegalStateException("size == 0");
        }
        p pVar = this.f31047c;
        int i2 = pVar.f31085b;
        int i3 = pVar.f31086c;
        int i4 = i2 + 1;
        byte b2 = pVar.f31084a[i2];
        this.f31048d = j2 - 1;
        if (i4 == i3) {
            this.f31047c = pVar.b();
            q.a(pVar);
        } else {
            pVar.f31085b = i4;
        }
        return b2;
    }

    @Override // l.d
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public c P(String str) {
        return U0(str, 0, str.length());
    }

    public c U0(String str, int i2, int i3) {
        int i4;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i2);
        }
        if (i3 < i2) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i3 + " < " + i2);
        }
        if (i3 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i3 + " > " + str.length());
        }
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                p pVarK0 = K0(1);
                byte[] bArr = pVarK0.f31084a;
                int i5 = pVarK0.f31086c - i2;
                int iMin = Math.min(i3, 8192 - i5);
                int i6 = i2 + 1;
                bArr[i2 + i5] = (byte) cCharAt;
                while (i6 < iMin) {
                    char cCharAt2 = str.charAt(i6);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[i6 + i5] = (byte) cCharAt2;
                    i6++;
                }
                int i7 = pVarK0.f31086c;
                int i8 = (i5 + i6) - i7;
                pVarK0.f31086c = i7 + i8;
                this.f31048d += (long) i8;
                i2 = i6;
            } else {
                if (cCharAt < 2048) {
                    i4 = (cCharAt >> 6) | 192;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    I((cCharAt >> '\f') | 224);
                    i4 = ((cCharAt >> 6) & 63) | 128;
                } else {
                    int i9 = i2 + 1;
                    char cCharAt3 = i9 < i3 ? str.charAt(i9) : (char) 0;
                    if (cCharAt > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        I(63);
                        i2 = i9;
                    } else {
                        int i10 = (((cCharAt & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        I((i10 >> 18) | 240);
                        I(((i10 >> 12) & 63) | 128);
                        I(((i10 >> 6) & 63) | 128);
                        I((i10 & 63) | 128);
                        i2 += 2;
                    }
                }
                I(i4);
                I((cCharAt & '?') | 128);
                i2++;
            }
        }
        return this;
    }

    public c V0(int i2) {
        int i3;
        int i4;
        if (i2 >= 128) {
            if (i2 < 2048) {
                i4 = (i2 >> 6) | 192;
            } else {
                if (i2 < 65536) {
                    if (i2 < 55296 || i2 > 57343) {
                        i3 = (i2 >> 12) | 224;
                    } else {
                        I(63);
                    }
                } else {
                    if (i2 > 1114111) {
                        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i2));
                    }
                    I((i2 >> 18) | 240);
                    i3 = ((i2 >> 12) & 63) | 128;
                }
                I(i3);
                i4 = ((i2 >> 6) & 63) | 128;
            }
            I(i4);
            i2 = (i2 & 63) | 128;
            I(i2);
        } else {
            I(i2);
        }
        return this;
    }

    @Override // l.e
    public void W(byte[] bArr) throws EOFException {
        int i2 = 0;
        while (i2 < bArr.length) {
            int iY = y(bArr, i2, bArr.length - i2);
            if (iY == -1) {
                throw new EOFException();
            }
            i2 += iY;
        }
    }

    @Override // l.d
    public long X(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j2 = 0;
        while (true) {
            long jK = tVar.k(this, 8192L);
            if (jK == -1) {
                return j2;
            }
            j2 += jK;
        }
    }

    @Override // l.e
    public void Z(long j2) throws EOFException {
        while (j2 > 0) {
            if (this.f31047c == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j2, r0.f31086c - r0.f31085b);
            long j3 = iMin;
            this.f31048d -= j3;
            j2 -= j3;
            p pVar = this.f31047c;
            int i2 = pVar.f31085b + iMin;
            pVar.f31085b = i2;
            if (i2 == pVar.f31086c) {
                this.f31047c = pVar.b();
                q.a(pVar);
            }
        }
    }

    @Override // l.e
    public String b0() {
        return G0(Long.MAX_VALUE);
    }

    @Override // l.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // l.e
    public int d0() {
        return v.c(C());
    }

    @Override // l.e
    public byte[] e0(long j2) throws EOFException {
        v.b(this.f31048d, 0L, j2);
        if (j2 <= 2147483647L) {
            byte[] bArr = new byte[(int) j2];
            W(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j2 = this.f31048d;
        if (j2 != cVar.f31048d) {
            return false;
        }
        long j3 = 0;
        if (j2 == 0) {
            return true;
        }
        p pVar = this.f31047c;
        p pVar2 = cVar.f31047c;
        int i2 = pVar.f31085b;
        int i3 = pVar2.f31085b;
        while (j3 < this.f31048d) {
            long jMin = Math.min(pVar.f31086c - i2, pVar2.f31086c - i3);
            int i4 = 0;
            while (i4 < jMin) {
                int i5 = i2 + 1;
                int i6 = i3 + 1;
                if (pVar.f31084a[i2] != pVar2.f31084a[i3]) {
                    return false;
                }
                i4++;
                i2 = i5;
                i3 = i6;
            }
            if (i2 == pVar.f31086c) {
                pVar = pVar.f31089f;
                i2 = pVar.f31085b;
            }
            if (i3 == pVar2.f31086c) {
                pVar2 = pVar2.f31089f;
                i3 = pVar2.f31085b;
            }
            j3 += jMin;
        }
        return true;
    }

    @Override // l.d, l.s, java.io.Flushable
    public void flush() {
    }

    @Override // l.e
    public f g(long j2) {
        return new f(e0(j2));
    }

    @Override // l.s
    public void h(c cVar, long j2) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        v.b(cVar.f31048d, 0L, j2);
        while (j2 > 0) {
            p pVar = cVar.f31047c;
            if (j2 < pVar.f31086c - pVar.f31085b) {
                p pVar2 = this.f31047c;
                p pVar3 = pVar2 != null ? pVar2.f31090g : null;
                if (pVar3 != null && pVar3.f31088e) {
                    if ((((long) pVar3.f31086c) + j2) - ((long) (pVar3.f31087d ? 0 : pVar3.f31085b)) <= 8192) {
                        pVar.e(pVar3, (int) j2);
                        cVar.f31048d -= j2;
                        this.f31048d += j2;
                        return;
                    }
                }
                cVar.f31047c = pVar.d((int) j2);
            }
            p pVar4 = cVar.f31047c;
            long j3 = pVar4.f31086c - pVar4.f31085b;
            cVar.f31047c = pVar4.b();
            p pVar5 = this.f31047c;
            if (pVar5 == null) {
                this.f31047c = pVar4;
                pVar4.f31090g = pVar4;
                pVar4.f31089f = pVar4;
            } else {
                pVar5.f31090g.c(pVar4).a();
            }
            cVar.f31048d -= j3;
            this.f31048d += j3;
            j2 -= j3;
        }
    }

    public int hashCode() {
        p pVar = this.f31047c;
        if (pVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = pVar.f31086c;
            for (int i4 = pVar.f31085b; i4 < i3; i4++) {
                i2 = (i2 * 31) + pVar.f31084a[i4];
            }
            pVar = pVar.f31089f;
        } while (pVar != this.f31047c);
        return i2;
    }

    @Override // l.e
    public InputStream inputStream() {
        return new b();
    }

    @Override // l.t
    public long k(c cVar, long j2) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        long j3 = this.f31048d;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        cVar.h(this, j2);
        return j2;
    }

    public void l() {
        try {
            Z(this.f31048d);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // l.e
    public short l0() {
        return v.d(p0());
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c();
        if (this.f31048d == 0) {
            return cVar;
        }
        p pVar = new p(this.f31047c);
        cVar.f31047c = pVar;
        pVar.f31090g = pVar;
        pVar.f31089f = pVar;
        p pVar2 = this.f31047c;
        while (true) {
            pVar2 = pVar2.f31089f;
            if (pVar2 == this.f31047c) {
                cVar.f31048d = this.f31048d;
                return cVar;
            }
            cVar.f31047c.f31090g.c(new p(pVar2));
        }
    }

    public long n() {
        long j2 = this.f31048d;
        if (j2 == 0) {
            return 0L;
        }
        p pVar = this.f31047c.f31090g;
        int i2 = pVar.f31086c;
        return (i2 >= 8192 || !pVar.f31088e) ? j2 : j2 - ((long) (i2 - pVar.f31085b));
    }

    public c o(c cVar, long j2, long j3) {
        if (cVar == null) {
            throw new IllegalArgumentException("out == null");
        }
        v.b(this.f31048d, j2, j3);
        if (j3 == 0) {
            return this;
        }
        cVar.f31048d += j3;
        p pVar = this.f31047c;
        while (true) {
            int i2 = pVar.f31086c;
            int i3 = pVar.f31085b;
            if (j2 < i2 - i3) {
                break;
            }
            j2 -= (long) (i2 - i3);
            pVar = pVar.f31089f;
        }
        while (j3 > 0) {
            p pVar2 = new p(pVar);
            int i4 = (int) (((long) pVar2.f31085b) + j2);
            pVar2.f31085b = i4;
            pVar2.f31086c = Math.min(i4 + ((int) j3), pVar2.f31086c);
            p pVar3 = cVar.f31047c;
            if (pVar3 == null) {
                pVar2.f31090g = pVar2;
                pVar2.f31089f = pVar2;
                cVar.f31047c = pVar2;
            } else {
                pVar3.f31090g.c(pVar2);
            }
            j3 -= (long) (pVar2.f31086c - pVar2.f31085b);
            pVar = pVar.f31089f;
            j2 = 0;
        }
        return this;
    }

    @Override // l.e
    public long o0(s sVar) {
        long j2 = this.f31048d;
        if (j2 > 0) {
            sVar.h(this, j2);
        }
        return j2;
    }

    @Override // l.d
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public c N() {
        return this;
    }

    @Override // l.e
    public short p0() {
        long j2 = this.f31048d;
        if (j2 < 2) {
            throw new IllegalStateException("size < 2: " + this.f31048d);
        }
        p pVar = this.f31047c;
        int i2 = pVar.f31085b;
        int i3 = pVar.f31086c;
        if (i3 - i2 < 2) {
            return (short) (((T() & 255) << 8) | (T() & 255));
        }
        byte[] bArr = pVar.f31084a;
        int i4 = i2 + 1;
        int i5 = i4 + 1;
        int i6 = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
        this.f31048d = j2 - 2;
        if (i5 == i3) {
            this.f31047c = pVar.b();
            q.a(pVar);
        } else {
            pVar.f31085b = i5;
        }
        return (short) i6;
    }

    public byte q(long j2) {
        v.b(this.f31048d, j2, 1L);
        p pVar = this.f31047c;
        while (true) {
            int i2 = pVar.f31086c;
            int i3 = pVar.f31085b;
            long j3 = i2 - i3;
            if (j2 < j3) {
                return pVar.f31084a[i3 + ((int) j2)];
            }
            j2 -= j3;
            pVar = pVar.f31089f;
        }
    }

    public long r(byte b2, long j2, long j3) {
        p pVar;
        long j4 = 0;
        if (j2 < 0 || j3 < j2) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f31048d), Long.valueOf(j2), Long.valueOf(j3)));
        }
        long j5 = this.f31048d;
        long j6 = j3 > j5 ? j5 : j3;
        if (j2 == j6 || (pVar = this.f31047c) == null) {
            return -1L;
        }
        if (j5 - j2 < j2) {
            while (j5 > j2) {
                pVar = pVar.f31090g;
                j5 -= (long) (pVar.f31086c - pVar.f31085b);
            }
        } else {
            while (true) {
                long j7 = ((long) (pVar.f31086c - pVar.f31085b)) + j4;
                if (j7 >= j2) {
                    break;
                }
                pVar = pVar.f31089f;
                j4 = j7;
            }
            j5 = j4;
        }
        long j8 = j2;
        while (j5 < j6) {
            byte[] bArr = pVar.f31084a;
            int iMin = (int) Math.min(pVar.f31086c, (((long) pVar.f31085b) + j6) - j5);
            for (int i2 = (int) ((((long) pVar.f31085b) + j8) - j5); i2 < iMin; i2++) {
                if (bArr[i2] == b2) {
                    return ((long) (i2 - pVar.f31085b)) + j5;
                }
            }
            j5 += (long) (pVar.f31086c - pVar.f31085b);
            pVar = pVar.f31089f;
            j8 = j5;
        }
        return -1L;
    }

    @Override // l.t
    public u timeout() {
        return u.f31095a;
    }

    public String toString() {
        return I0().toString();
    }

    public OutputStream u() {
        return new a();
    }

    @Override // l.e
    public void v0(long j2) throws EOFException {
        if (this.f31048d < j2) {
            throw new EOFException();
        }
    }

    public boolean w(long j2, f fVar, int i2, int i3) {
        if (j2 < 0 || i2 < 0 || i3 < 0 || this.f31048d - j2 < i3 || fVar.size() - i2 < i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (q(((long) i4) + j2) != fVar.t(i2 + i4)) {
                return false;
            }
        }
        return true;
    }

    public int y(byte[] bArr, int i2, int i3) {
        v.b(bArr.length, i2, i3);
        p pVar = this.f31047c;
        if (pVar == null) {
            return -1;
        }
        int iMin = Math.min(i3, pVar.f31086c - pVar.f31085b);
        System.arraycopy(pVar.f31084a, pVar.f31085b, bArr, i2, iMin);
        int i4 = pVar.f31085b + iMin;
        pVar.f31085b = i4;
        this.f31048d -= (long) iMin;
        if (i4 == pVar.f31086c) {
            this.f31047c = pVar.b();
            q.a(pVar);
        }
        return iMin;
    }

    @Override // l.e
    public long y0(byte b2) {
        return r(b2, 0L, Long.MAX_VALUE);
    }

    @Override // l.e, l.d
    public c z() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5 A[EDGE_INSN: B:45:0x00a5->B:38:0x00a5 BREAK  A[LOOP:0: B:5:0x000b->B:47:?], SYNTHETIC] */
    @Override // l.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long z0() {
        /*
            r15 = this;
            long r0 = r15.f31048d
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lac
            r0 = 0
            r4 = r2
            r1 = 0
        Lb:
            l.p r6 = r15.f31047c
            byte[] r7 = r6.f31084a
            int r8 = r6.f31085b
            int r9 = r6.f31086c
        L13:
            if (r8 >= r9) goto L91
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L3a
        L22:
            r11 = 97
            if (r10 < r11) goto L2f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2f
            int r11 = r10 + (-97)
        L2c:
            int r11 = r11 + 10
            goto L3a
        L2f:
            r11 = 65
            if (r10 < r11) goto L72
            r11 = 70
            if (r10 > r11) goto L72
            int r11 = r10 + (-65)
            goto L2c
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L4a:
            l.c r0 = new l.c
            r0.<init>()
            l.c r0 = r0.Y(r4)
            l.c r0 = r0.I(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.D0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L72:
            if (r0 == 0) goto L76
            r1 = 1
            goto L91
        L76:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L91:
            if (r8 != r9) goto L9d
            l.p r7 = r6.b()
            r15.f31047c = r7
            l.q.a(r6)
            goto L9f
        L9d:
            r6.f31085b = r8
        L9f:
            if (r1 != 0) goto La5
            l.p r6 = r15.f31047c
            if (r6 != 0) goto Lb
        La5:
            long r1 = r15.f31048d
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f31048d = r1
            return r4
        Lac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            goto Lb5
        Lb4:
            throw r0
        Lb5:
            goto Lb4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.c.z0():long");
    }
}
