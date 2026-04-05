package com.google.ads.interactivemedia.v3.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class bki extends avq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f21280b = Logger.getLogger(bki.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f21281c = bnh.y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bkj f21282a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f21283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21285f;

    private bki() {
    }

    public /* synthetic */ bki(byte[] bArr) {
    }

    public bki(byte[] bArr, int i2) {
        this(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        this.f21283d = bArr;
        this.f21285f = 0;
        this.f21284e = i2;
    }

    public static int A(long j2) {
        return H(J(j2));
    }

    public static int B(int i2, String str) {
        return D(i2) + C(str);
    }

    public static int C(String str) {
        int length;
        try {
            length = bnm.c(str);
        } catch (bnl unused) {
            length = str.getBytes(bld.f21341a).length;
        }
        return v(length);
    }

    public static int D(int i2) {
        return F(bnp.c(i2, 0));
    }

    public static int E(int i2, int i3) {
        return D(i2) + F(i3);
    }

    public static int F(int i2) {
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

    public static int G(int i2, long j2) {
        return D(i2) + H(j2);
    }

    public static int H(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static int I(int i2) {
        return (i2 >> 31) ^ (i2 + i2);
    }

    public static long J(long j2) {
        return (j2 >> 63) ^ (j2 + j2);
    }

    public static bki K(byte[] bArr) {
        return new bki(bArr, bArr.length);
    }

    public static int an(int i2) {
        return D(i2) + 1;
    }

    public static int ao(int i2) {
        return D(i2) + 8;
    }

    public static int ap(int i2) {
        return D(i2) + 4;
    }

    public static int aq(int i2) {
        return D(i2) + 8;
    }

    public static int ar(int i2) {
        return D(i2) + 4;
    }

    public static int as(int i2) {
        return D(i2) + 4;
    }

    public static int at(int i2) {
        return D(i2) + 8;
    }

    public static int m(int i2, bkd bkdVar) {
        return D(i2) + n(bkdVar);
    }

    public static int n(bkd bkdVar) {
        return v(bkdVar.d());
    }

    public static int o(int i2, int i3) {
        return D(i2) + r(i3);
    }

    @Deprecated
    public static int p(int i2, blz blzVar, bmk bmkVar) {
        int iD = D(i2);
        int i3 = iD + iD;
        bjp bjpVar = (bjp) blzVar;
        int iAf = bjpVar.af();
        if (iAf == -1) {
            iAf = bmkVar.a(bjpVar);
            bjpVar.ah(iAf);
        }
        return i3 + iAf;
    }

    public static int q(int i2, int i3) {
        return D(i2) + r(i3);
    }

    public static int r(int i2) {
        if (i2 >= 0) {
            return F(i2);
        }
        return 10;
    }

    public static int s(int i2, long j2) {
        return D(i2) + H(j2);
    }

    public static int t(int i2, bli bliVar) {
        return D(i2) + u(bliVar);
    }

    public static int u(bli bliVar) {
        return v(bliVar.a());
    }

    public static int v(int i2) {
        return F(i2) + i2;
    }

    public static int w(blz blzVar, bmk bmkVar) {
        bjp bjpVar = (bjp) blzVar;
        int iAf = bjpVar.af();
        if (iAf == -1) {
            iAf = bmkVar.a(bjpVar);
            bjpVar.ah(iAf);
        }
        return v(iAf);
    }

    public static int x(int i2, int i3) {
        return D(i2) + y(i3);
    }

    public static int y(int i2) {
        return F(I(i2));
    }

    public static int z(int i2, long j2) {
        return D(i2) + A(j2);
    }

    public final void L() {
        if (T() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void M(String str, bnl bnlVar) throws bkh {
        f21280b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) bnlVar);
        byte[] bytes = str.getBytes(bld.f21341a);
        try {
            int length = bytes.length;
            ak(length);
            ae(bytes, 0, length);
        } catch (bkh e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new bkh(e3);
        }
    }

    public final void N(int i2, double d2) throws bkh {
        aa(i2, Double.doubleToRawLongBits(d2));
    }

    public final void O(int i2, float f2) throws bkh {
        Y(i2, Float.floatToRawIntBits(f2));
    }

    @Deprecated
    public final void P(blz blzVar) {
        blzVar.aV(this);
    }

    public final void Q(int i2, int i3) throws bkh {
        aj(i2, I(i3));
    }

    public final void R(int i2, long j2) throws bkh {
        al(i2, J(j2));
    }

    public final int T() {
        return this.f21284e - this.f21285f;
    }

    public final void U(byte b2) throws bkh {
        try {
            byte[] bArr = this.f21283d;
            int i2 = this.f21285f;
            this.f21285f = i2 + 1;
            bArr[i2] = b2;
        } catch (IndexOutOfBoundsException e2) {
            throw new bkh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21285f), Integer.valueOf(this.f21284e), 1), e2);
        }
    }

    public final void V(byte[] bArr, int i2, int i3) throws bkh {
        try {
            System.arraycopy(bArr, 0, this.f21283d, this.f21285f, i3);
            this.f21285f += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new bkh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21285f), Integer.valueOf(this.f21284e), Integer.valueOf(i3)), e2);
        }
    }

    public final void W(int i2, boolean z) throws bkh {
        ai(i2, 0);
        U(z ? (byte) 1 : (byte) 0);
    }

    public final void X(int i2, bkd bkdVar) throws bkh {
        ai(i2, 2);
        ak(bkdVar.d());
        bkdVar.k(this);
    }

    public final void Y(int i2, int i3) throws bkh {
        ai(i2, 5);
        Z(i3);
    }

    public final void Z(int i2) throws bkh {
        try {
            byte[] bArr = this.f21283d;
            int i3 = this.f21285f;
            int i4 = i3 + 1;
            this.f21285f = i4;
            bArr[i3] = (byte) (i2 & 255);
            int i5 = i4 + 1;
            this.f21285f = i5;
            bArr[i4] = (byte) ((i2 >> 8) & 255);
            int i6 = i5 + 1;
            this.f21285f = i6;
            bArr[i5] = (byte) ((i2 >> 16) & 255);
            this.f21285f = i6 + 1;
            bArr[i6] = (byte) ((i2 >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new bkh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21285f), Integer.valueOf(this.f21284e), 1), e2);
        }
    }

    public final void aa(int i2, long j2) throws bkh {
        ai(i2, 1);
        ab(j2);
    }

    public final void ab(long j2) throws bkh {
        try {
            byte[] bArr = this.f21283d;
            int i2 = this.f21285f;
            int i3 = i2 + 1;
            this.f21285f = i3;
            bArr[i2] = (byte) (((int) j2) & 255);
            int i4 = i3 + 1;
            this.f21285f = i4;
            bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
            int i5 = i4 + 1;
            this.f21285f = i5;
            bArr[i4] = (byte) (((int) (j2 >> 16)) & 255);
            int i6 = i5 + 1;
            this.f21285f = i6;
            bArr[i5] = (byte) (((int) (j2 >> 24)) & 255);
            int i7 = i6 + 1;
            this.f21285f = i7;
            bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
            int i8 = i7 + 1;
            this.f21285f = i8;
            bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
            int i9 = i8 + 1;
            this.f21285f = i9;
            bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
            this.f21285f = i9 + 1;
            bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new bkh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21285f), Integer.valueOf(this.f21284e), 1), e2);
        }
    }

    public final void ac(int i2, int i3) throws bkh {
        ai(i2, 0);
        ad(i3);
    }

    public final void ad(int i2) throws bkh {
        if (i2 >= 0) {
            ak(i2);
        } else {
            am(i2);
        }
    }

    public final void ae(byte[] bArr, int i2, int i3) throws bkh {
        V(bArr, 0, i3);
    }

    public final void af(int i2, blz blzVar, bmk bmkVar) throws bkh {
        ai(i2, 2);
        bjp bjpVar = (bjp) blzVar;
        int iAf = bjpVar.af();
        if (iAf == -1) {
            iAf = bmkVar.a(bjpVar);
            bjpVar.ah(iAf);
        }
        ak(iAf);
        bmkVar.j(blzVar, this.f21282a);
    }

    public final void ag(int i2, String str) throws bkh {
        ai(i2, 2);
        ah(str);
    }

    public final void ah(String str) throws bkh {
        int i2 = this.f21285f;
        try {
            int iF = F(str.length() * 3);
            int iF2 = F(str.length());
            if (iF2 != iF) {
                ak(bnm.c(str));
                this.f21285f = bnm.b(str, this.f21283d, this.f21285f, T());
                return;
            }
            int i3 = i2 + iF2;
            this.f21285f = i3;
            int iB = bnm.b(str, this.f21283d, i3, T());
            this.f21285f = i2;
            ak((iB - i2) - iF2);
            this.f21285f = iB;
        } catch (bnl e2) {
            this.f21285f = i2;
            M(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new bkh(e3);
        }
    }

    public final void ai(int i2, int i3) throws bkh {
        ak(bnp.c(i2, i3));
    }

    public final void aj(int i2, int i3) throws bkh {
        ai(i2, 0);
        ak(i3);
    }

    public final void ak(int i2) throws bkh {
        if (f21281c) {
            int i3 = bjs.f21247a;
        }
        while ((i2 & (-128)) != 0) {
            try {
                byte[] bArr = this.f21283d;
                int i4 = this.f21285f;
                this.f21285f = i4 + 1;
                bArr[i4] = (byte) ((i2 & 127) | 128);
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new bkh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21285f), Integer.valueOf(this.f21284e), 1), e2);
            }
        }
        byte[] bArr2 = this.f21283d;
        int i5 = this.f21285f;
        this.f21285f = i5 + 1;
        bArr2[i5] = (byte) i2;
    }

    public final void al(int i2, long j2) throws bkh {
        ai(i2, 0);
        am(j2);
    }

    public final void am(long j2) throws bkh {
        if (f21281c && T() >= 10) {
            while ((j2 & (-128)) != 0) {
                byte[] bArr = this.f21283d;
                int i2 = this.f21285f;
                this.f21285f = i2 + 1;
                bnh.o(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            byte[] bArr2 = this.f21283d;
            int i3 = this.f21285f;
            this.f21285f = i3 + 1;
            bnh.o(bArr2, i3, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f21283d;
                int i4 = this.f21285f;
                this.f21285f = i4 + 1;
                bArr3[i4] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new bkh(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21285f), Integer.valueOf(this.f21284e), 1), e2);
            }
        }
        byte[] bArr4 = this.f21283d;
        int i5 = this.f21285f;
        this.f21285f = i5 + 1;
        bArr4[i5] = (byte) j2;
    }
}
