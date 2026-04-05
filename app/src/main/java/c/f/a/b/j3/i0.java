package c.f.a.b.j3;

import java.nio.charset.Charset;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f9203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9205c;

    public i0() {
        this.f9203a = x0.f9301f;
    }

    public i0(int i2) {
        this.f9203a = new byte[i2];
        this.f9205c = i2;
    }

    public i0(byte[] bArr) {
        this.f9203a = bArr;
        this.f9205c = bArr.length;
    }

    public i0(byte[] bArr, int i2) {
        this.f9203a = bArr;
        this.f9205c = i2;
    }

    public String A(int i2) {
        return B(i2, c.f.b.a.d.f15784c);
    }

    public String B(int i2, Charset charset) {
        String str = new String(this.f9203a, this.f9204b, i2, charset);
        this.f9204b += i2;
        return str;
    }

    public int C() {
        return (D() << 21) | (D() << 14) | (D() << 7) | D();
    }

    public int D() {
        byte[] bArr = this.f9203a;
        int i2 = this.f9204b;
        this.f9204b = i2 + 1;
        return bArr[i2] & 255;
    }

    public int E() {
        byte[] bArr = this.f9203a;
        int i2 = this.f9204b;
        int i3 = i2 + 1;
        this.f9204b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        int i5 = i3 + 1;
        this.f9204b = i5;
        int i6 = (bArr[i3] & 255) | i4;
        this.f9204b = i5 + 2;
        return i6;
    }

    public long F() {
        byte[] bArr = this.f9203a;
        int i2 = this.f9204b;
        int i3 = i2 + 1;
        this.f9204b = i3;
        long j2 = (((long) bArr[i2]) & 255) << 24;
        int i4 = i3 + 1;
        this.f9204b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i4 + 1;
        this.f9204b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 8);
        this.f9204b = i5 + 1;
        return (((long) bArr[i5]) & 255) | j4;
    }

    public int G() {
        byte[] bArr = this.f9203a;
        int i2 = this.f9204b;
        int i3 = i2 + 1;
        this.f9204b = i3;
        int i4 = (bArr[i2] & 255) << 16;
        int i5 = i3 + 1;
        this.f9204b = i5;
        int i6 = i4 | ((bArr[i3] & 255) << 8);
        this.f9204b = i5 + 1;
        return (bArr[i5] & 255) | i6;
    }

    public int H() {
        int iN = n();
        if (iN >= 0) {
            return iN;
        }
        throw new IllegalStateException("Top bit not zero: " + iN);
    }

    public long I() {
        long jW = w();
        if (jW >= 0) {
            return jW;
        }
        throw new IllegalStateException("Top bit not zero: " + jW);
    }

    public int J() {
        byte[] bArr = this.f9203a;
        int i2 = this.f9204b;
        int i3 = i2 + 1;
        this.f9204b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        this.f9204b = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    public long K() {
        int i2;
        int i3;
        long j2 = this.f9203a[this.f9204b];
        int i4 = 7;
        while (true) {
            if (i4 < 0) {
                break;
            }
            int i5 = 1 << i4;
            if ((((long) i5) & j2) != 0) {
                i4--;
            } else if (i4 < 6) {
                j2 &= (long) (i5 - 1);
                i3 = 7 - i4;
            } else if (i4 == 7) {
                i3 = 1;
            }
        }
        i3 = 0;
        if (i3 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j2);
        }
        for (i2 = 1; i2 < i3; i2++) {
            byte b2 = this.f9203a[this.f9204b + i2];
            if ((b2 & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j2);
            }
            j2 = (j2 << 6) | ((long) (b2 & 63));
        }
        this.f9204b += i3;
        return j2;
    }

    public void L(int i2) {
        N(b() < i2 ? new byte[i2] : this.f9203a, i2);
    }

    public void M(byte[] bArr) {
        N(bArr, bArr.length);
    }

    public void N(byte[] bArr, int i2) {
        this.f9203a = bArr;
        this.f9205c = i2;
        this.f9204b = 0;
    }

    public void O(int i2) {
        g.a(i2 >= 0 && i2 <= this.f9203a.length);
        this.f9205c = i2;
    }

    public void P(int i2) {
        g.a(i2 >= 0 && i2 <= this.f9205c);
        this.f9204b = i2;
    }

    public void Q(int i2) {
        P(this.f9204b + i2);
    }

    public int a() {
        return this.f9205c - this.f9204b;
    }

    public int b() {
        return this.f9203a.length;
    }

    public void c(int i2) {
        if (i2 > b()) {
            this.f9203a = Arrays.copyOf(this.f9203a, i2);
        }
    }

    public byte[] d() {
        return this.f9203a;
    }

    public int e() {
        return this.f9204b;
    }

    public int f() {
        return this.f9205c;
    }

    public char g() {
        byte[] bArr = this.f9203a;
        int i2 = this.f9204b;
        return (char) ((bArr[i2 + 1] & 255) | ((bArr[i2] & 255) << 8));
    }

    public int h() {
        return this.f9203a[this.f9204b] & 255;
    }

    public void i(h0 h0Var, int i2) {
        j(h0Var.f9198a, 0, i2);
        h0Var.p(0);
    }

    public void j(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f9203a, this.f9204b, bArr, i2, i3);
        this.f9204b += i3;
    }

    public String k(char c2) {
        if (a() == 0) {
            return null;
        }
        int i2 = this.f9204b;
        while (i2 < this.f9205c && this.f9203a[i2] != c2) {
            i2++;
        }
        byte[] bArr = this.f9203a;
        int i3 = this.f9204b;
        String strF = x0.F(bArr, i3, i2 - i3);
        this.f9204b = i2;
        if (i2 < this.f9205c) {
            this.f9204b = i2 + 1;
        }
        return strF;
    }

    public double l() {
        return Double.longBitsToDouble(w());
    }

    public float m() {
        return Float.intBitsToFloat(n());
    }

    public int n() {
        byte[] bArr = this.f9203a;
        int i2 = this.f9204b;
        int i3 = i2 + 1;
        this.f9204b = i3;
        int i4 = (bArr[i2] & 255) << 24;
        int i5 = i3 + 1;
        this.f9204b = i5;
        int i6 = i4 | ((bArr[i3] & 255) << 16);
        int i7 = i5 + 1;
        this.f9204b = i7;
        int i8 = i6 | ((bArr[i5] & 255) << 8);
        this.f9204b = i7 + 1;
        return (bArr[i7] & 255) | i8;
    }

    public int o() {
        byte[] bArr = this.f9203a;
        int i2 = this.f9204b;
        int i3 = i2 + 1;
        this.f9204b = i3;
        int i4 = ((bArr[i2] & 255) << 24) >> 8;
        int i5 = i3 + 1;
        this.f9204b = i5;
        int i6 = i4 | ((bArr[i3] & 255) << 8);
        this.f9204b = i5 + 1;
        return (bArr[i5] & 255) | i6;
    }

    public String p() {
        if (a() == 0) {
            return null;
        }
        int i2 = this.f9204b;
        while (i2 < this.f9205c && !x0.s0(this.f9203a[i2])) {
            i2++;
        }
        int i3 = this.f9204b;
        if (i2 - i3 >= 3) {
            byte[] bArr = this.f9203a;
            if (bArr[i3] == -17 && bArr[i3 + 1] == -69 && bArr[i3 + 2] == -65) {
                this.f9204b = i3 + 3;
            }
        }
        byte[] bArr2 = this.f9203a;
        int i4 = this.f9204b;
        String strF = x0.F(bArr2, i4, i2 - i4);
        this.f9204b = i2;
        int i5 = this.f9205c;
        if (i2 == i5) {
            return strF;
        }
        byte[] bArr3 = this.f9203a;
        if (bArr3[i2] == 13) {
            int i6 = i2 + 1;
            this.f9204b = i6;
            if (i6 == i5) {
                return strF;
            }
        }
        int i7 = this.f9204b;
        if (bArr3[i7] == 10) {
            this.f9204b = i7 + 1;
        }
        return strF;
    }

    public int q() {
        byte[] bArr = this.f9203a;
        int i2 = this.f9204b;
        int i3 = i2 + 1;
        this.f9204b = i3;
        int i4 = bArr[i2] & 255;
        int i5 = i3 + 1;
        this.f9204b = i5;
        int i6 = i4 | ((bArr[i3] & 255) << 8);
        int i7 = i5 + 1;
        this.f9204b = i7;
        int i8 = i6 | ((bArr[i5] & 255) << 16);
        this.f9204b = i7 + 1;
        return ((bArr[i7] & 255) << 24) | i8;
    }

    public long r() {
        byte[] bArr = this.f9203a;
        int i2 = this.f9204b;
        int i3 = i2 + 1;
        this.f9204b = i3;
        long j2 = ((long) bArr[i2]) & 255;
        int i4 = i3 + 1;
        this.f9204b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        int i5 = i4 + 1;
        this.f9204b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 16);
        int i6 = i5 + 1;
        this.f9204b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i6 + 1;
        this.f9204b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 32);
        int i8 = i7 + 1;
        this.f9204b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 40);
        int i9 = i8 + 1;
        this.f9204b = i9;
        long j8 = j7 | ((((long) bArr[i8]) & 255) << 48);
        this.f9204b = i9 + 1;
        return ((((long) bArr[i9]) & 255) << 56) | j8;
    }

    public short s() {
        byte[] bArr = this.f9203a;
        int i2 = this.f9204b;
        int i3 = i2 + 1;
        this.f9204b = i3;
        int i4 = bArr[i2] & 255;
        this.f9204b = i3 + 1;
        return (short) (((bArr[i3] & 255) << 8) | i4);
    }

    public long t() {
        byte[] bArr = this.f9203a;
        int i2 = this.f9204b;
        int i3 = i2 + 1;
        this.f9204b = i3;
        long j2 = ((long) bArr[i2]) & 255;
        int i4 = i3 + 1;
        this.f9204b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        int i5 = i4 + 1;
        this.f9204b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 16);
        this.f9204b = i5 + 1;
        return ((((long) bArr[i5]) & 255) << 24) | j4;
    }

    public int u() {
        int iQ = q();
        if (iQ >= 0) {
            return iQ;
        }
        throw new IllegalStateException("Top bit not zero: " + iQ);
    }

    public int v() {
        byte[] bArr = this.f9203a;
        int i2 = this.f9204b;
        int i3 = i2 + 1;
        this.f9204b = i3;
        int i4 = bArr[i2] & 255;
        this.f9204b = i3 + 1;
        return ((bArr[i3] & 255) << 8) | i4;
    }

    public long w() {
        byte[] bArr = this.f9203a;
        int i2 = this.f9204b;
        int i3 = i2 + 1;
        this.f9204b = i3;
        long j2 = (((long) bArr[i2]) & 255) << 56;
        int i4 = i3 + 1;
        this.f9204b = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 48);
        int i5 = i4 + 1;
        this.f9204b = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 40);
        int i6 = i5 + 1;
        this.f9204b = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i6 + 1;
        this.f9204b = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 24);
        int i8 = i7 + 1;
        this.f9204b = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 16);
        int i9 = i8 + 1;
        this.f9204b = i9;
        long j8 = j7 | ((((long) bArr[i8]) & 255) << 8);
        this.f9204b = i9 + 1;
        return (((long) bArr[i9]) & 255) | j8;
    }

    public String x() {
        return k((char) 0);
    }

    public String y(int i2) {
        if (i2 == 0) {
            return BuildConfig.FLAVOR;
        }
        int i3 = this.f9204b;
        int i4 = (i3 + i2) - 1;
        String strF = x0.F(this.f9203a, i3, (i4 >= this.f9205c || this.f9203a[i4] != 0) ? i2 : i2 - 1);
        this.f9204b += i2;
        return strF;
    }

    public short z() {
        byte[] bArr = this.f9203a;
        int i2 = this.f9204b;
        int i3 = i2 + 1;
        this.f9204b = i3;
        int i4 = (bArr[i2] & 255) << 8;
        this.f9204b = i3 + 1;
        return (short) ((bArr[i3] & 255) | i4);
    }
}
