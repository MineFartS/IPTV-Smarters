package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class q5 extends t5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f13491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13493f;

    public q5(byte[] bArr, int i2, int i3) {
        super(null);
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
        }
        this.f13491d = bArr;
        this.f13493f = 0;
        this.f13492e = i3;
    }

    public final void G(byte[] bArr, int i2, int i3) throws r5 {
        try {
            System.arraycopy(bArr, 0, this.f13491d, this.f13493f, i3);
            this.f13493f += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new r5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13493f), Integer.valueOf(this.f13492e), Integer.valueOf(i3)), e2);
        }
    }

    public final void H(String str) throws r5 {
        int i2 = this.f13493f;
        try {
            int iC = t5.C(str.length() * 3);
            int iC2 = t5.C(str.length());
            if (iC2 != iC) {
                t(i9.c(str));
                byte[] bArr = this.f13491d;
                int i3 = this.f13493f;
                this.f13493f = i9.d(str, bArr, i3, this.f13492e - i3);
                return;
            }
            int i4 = i2 + iC2;
            this.f13493f = i4;
            int iD = i9.d(str, this.f13491d, i4, this.f13492e - i4);
            this.f13493f = i2;
            t((iD - i2) - iC2);
            this.f13493f = iD;
        } catch (g9 e2) {
            this.f13493f = i2;
            f(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new r5(e3);
        }
    }

    @Override // c.f.a.c.j.h.t5
    public final void i(int i2, int i3) {
        t((i2 << 3) | i3);
    }

    @Override // c.f.a.c.j.h.t5
    public final void j(int i2, int i3) throws r5 {
        t(i2 << 3);
        s(i3);
    }

    @Override // c.f.a.c.j.h.t5
    public final void k(int i2, int i3) {
        t(i2 << 3);
        t(i3);
    }

    @Override // c.f.a.c.j.h.t5
    public final void l(int i2, int i3) throws r5 {
        t((i2 << 3) | 5);
        u(i3);
    }

    @Override // c.f.a.c.j.h.t5
    public final void m(int i2, long j2) throws r5 {
        t(i2 << 3);
        v(j2);
    }

    @Override // c.f.a.c.j.h.t5
    public final void n(int i2, long j2) throws r5 {
        t((i2 << 3) | 1);
        w(j2);
    }

    @Override // c.f.a.c.j.h.t5
    public final void o(int i2, boolean z) throws r5 {
        t(i2 << 3);
        r(z ? (byte) 1 : (byte) 0);
    }

    @Override // c.f.a.c.j.h.t5
    public final void p(int i2, String str) throws r5 {
        t((i2 << 3) | 2);
        H(str);
    }

    @Override // c.f.a.c.j.h.t5
    public final void q(int i2, l5 l5Var) {
        t((i2 << 3) | 2);
        t(l5Var.d());
        l5Var.f(this);
    }

    @Override // c.f.a.c.j.h.t5
    public final void r(byte b2) throws r5 {
        try {
            byte[] bArr = this.f13491d;
            int i2 = this.f13493f;
            this.f13493f = i2 + 1;
            bArr[i2] = b2;
        } catch (IndexOutOfBoundsException e2) {
            throw new r5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13493f), Integer.valueOf(this.f13492e), 1), e2);
        }
    }

    @Override // c.f.a.c.j.h.t5
    public final void s(int i2) throws r5 {
        if (i2 >= 0) {
            t(i2);
        } else {
            v(i2);
        }
    }

    @Override // c.f.a.c.j.h.t5
    public final void t(int i2) {
        if (t5.f13529b && !v4.a()) {
            int i3 = this.f13492e;
            int i4 = this.f13493f;
            if (i3 - i4 >= 5) {
                if ((i2 & (-128)) == 0) {
                    byte[] bArr = this.f13491d;
                    this.f13493f = i4 + 1;
                    c9.B(bArr, i4, (byte) i2);
                    return;
                }
                byte[] bArr2 = this.f13491d;
                this.f13493f = i4 + 1;
                c9.B(bArr2, i4, (byte) (i2 | 128));
                int i5 = i2 >>> 7;
                if ((i5 & (-128)) == 0) {
                    byte[] bArr3 = this.f13491d;
                    int i6 = this.f13493f;
                    this.f13493f = i6 + 1;
                    c9.B(bArr3, i6, (byte) i5);
                    return;
                }
                byte[] bArr4 = this.f13491d;
                int i7 = this.f13493f;
                this.f13493f = i7 + 1;
                c9.B(bArr4, i7, (byte) (i5 | 128));
                int i8 = i5 >>> 7;
                if ((i8 & (-128)) == 0) {
                    byte[] bArr5 = this.f13491d;
                    int i9 = this.f13493f;
                    this.f13493f = i9 + 1;
                    c9.B(bArr5, i9, (byte) i8);
                    return;
                }
                byte[] bArr6 = this.f13491d;
                int i10 = this.f13493f;
                this.f13493f = i10 + 1;
                c9.B(bArr6, i10, (byte) (i8 | 128));
                int i11 = i8 >>> 7;
                if ((i11 & (-128)) == 0) {
                    byte[] bArr7 = this.f13491d;
                    int i12 = this.f13493f;
                    this.f13493f = i12 + 1;
                    c9.B(bArr7, i12, (byte) i11);
                    return;
                }
                byte[] bArr8 = this.f13491d;
                int i13 = this.f13493f;
                this.f13493f = i13 + 1;
                c9.B(bArr8, i13, (byte) (i11 | 128));
                byte[] bArr9 = this.f13491d;
                int i14 = this.f13493f;
                this.f13493f = i14 + 1;
                c9.B(bArr9, i14, (byte) (i11 >>> 7));
                return;
            }
        }
        while ((i2 & (-128)) != 0) {
            try {
                byte[] bArr10 = this.f13491d;
                int i15 = this.f13493f;
                this.f13493f = i15 + 1;
                bArr10[i15] = (byte) ((i2 & 127) | 128);
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new r5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13493f), Integer.valueOf(this.f13492e), 1), e2);
            }
        }
        byte[] bArr11 = this.f13491d;
        int i16 = this.f13493f;
        this.f13493f = i16 + 1;
        bArr11[i16] = (byte) i2;
    }

    @Override // c.f.a.c.j.h.t5
    public final void u(int i2) throws r5 {
        try {
            byte[] bArr = this.f13491d;
            int i3 = this.f13493f;
            int i4 = i3 + 1;
            this.f13493f = i4;
            bArr[i3] = (byte) (i2 & 255);
            int i5 = i4 + 1;
            this.f13493f = i5;
            bArr[i4] = (byte) ((i2 >> 8) & 255);
            int i6 = i5 + 1;
            this.f13493f = i6;
            bArr[i5] = (byte) ((i2 >> 16) & 255);
            this.f13493f = i6 + 1;
            bArr[i6] = (byte) ((i2 >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new r5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13493f), Integer.valueOf(this.f13492e), 1), e2);
        }
    }

    @Override // c.f.a.c.j.h.t5
    public final void v(long j2) throws r5 {
        if (t5.f13529b && this.f13492e - this.f13493f >= 10) {
            while ((j2 & (-128)) != 0) {
                byte[] bArr = this.f13491d;
                int i2 = this.f13493f;
                this.f13493f = i2 + 1;
                c9.B(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            byte[] bArr2 = this.f13491d;
            int i3 = this.f13493f;
            this.f13493f = i3 + 1;
            c9.B(bArr2, i3, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f13491d;
                int i4 = this.f13493f;
                this.f13493f = i4 + 1;
                bArr3[i4] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new r5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13493f), Integer.valueOf(this.f13492e), 1), e2);
            }
        }
        byte[] bArr4 = this.f13491d;
        int i5 = this.f13493f;
        this.f13493f = i5 + 1;
        bArr4[i5] = (byte) j2;
    }

    @Override // c.f.a.c.j.h.t5
    public final void w(long j2) throws r5 {
        try {
            byte[] bArr = this.f13491d;
            int i2 = this.f13493f;
            int i3 = i2 + 1;
            this.f13493f = i3;
            bArr[i2] = (byte) (((int) j2) & 255);
            int i4 = i3 + 1;
            this.f13493f = i4;
            bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
            int i5 = i4 + 1;
            this.f13493f = i5;
            bArr[i4] = (byte) (((int) (j2 >> 16)) & 255);
            int i6 = i5 + 1;
            this.f13493f = i6;
            bArr[i5] = (byte) (((int) (j2 >> 24)) & 255);
            int i7 = i6 + 1;
            this.f13493f = i7;
            bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
            int i8 = i7 + 1;
            this.f13493f = i8;
            bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
            int i9 = i8 + 1;
            this.f13493f = i9;
            bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
            this.f13493f = i9 + 1;
            bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new r5(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f13493f), Integer.valueOf(this.f13492e), 1), e2);
        }
    }

    @Override // c.f.a.c.j.h.t5
    public final void x(byte[] bArr, int i2, int i3) throws r5 {
        G(bArr, 0, i3);
    }

    @Override // c.f.a.c.j.h.t5
    public final int y() {
        return this.f13492e - this.f13493f;
    }
}
