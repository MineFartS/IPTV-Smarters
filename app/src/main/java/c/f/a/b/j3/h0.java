package c.f.a.b.j3;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f9198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9201d;

    public h0() {
        this.f9198a = x0.f9301f;
    }

    public h0(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public h0(byte[] bArr, int i2) {
        this.f9198a = bArr;
        this.f9201d = i2;
    }

    public final void a() {
        int i2;
        int i3 = this.f9199b;
        g.g(i3 >= 0 && (i3 < (i2 = this.f9201d) || (i3 == i2 && this.f9200c == 0)));
    }

    public int b() {
        return ((this.f9201d - this.f9199b) * 8) - this.f9200c;
    }

    public void c() {
        if (this.f9200c == 0) {
            return;
        }
        this.f9200c = 0;
        this.f9199b++;
        a();
    }

    public int d() {
        g.g(this.f9200c == 0);
        return this.f9199b;
    }

    public int e() {
        return (this.f9199b * 8) + this.f9200c;
    }

    public void f(int i2, int i3) {
        if (i3 < 32) {
            i2 &= (1 << i3) - 1;
        }
        int iMin = Math.min(8 - this.f9200c, i3);
        int i4 = this.f9200c;
        int i5 = (8 - i4) - iMin;
        byte[] bArr = this.f9198a;
        int i6 = this.f9199b;
        bArr[i6] = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr[i6]);
        int i7 = i3 - iMin;
        bArr[i6] = (byte) (((i2 >>> i7) << i5) | bArr[i6]);
        int i8 = i6 + 1;
        while (i7 > 8) {
            this.f9198a[i8] = (byte) (i2 >>> (i7 - 8));
            i7 -= 8;
            i8++;
        }
        int i9 = 8 - i7;
        byte[] bArr2 = this.f9198a;
        bArr2[i8] = (byte) (bArr2[i8] & ((1 << i9) - 1));
        bArr2[i8] = (byte) (((i2 & ((1 << i7) - 1)) << i9) | bArr2[i8]);
        r(i3);
        a();
    }

    public boolean g() {
        boolean z = (this.f9198a[this.f9199b] & (128 >> this.f9200c)) != 0;
        q();
        return z;
    }

    public int h(int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        this.f9200c += i2;
        int i4 = 0;
        while (true) {
            i3 = this.f9200c;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.f9200c = i5;
            byte[] bArr = this.f9198a;
            int i6 = this.f9199b;
            this.f9199b = i6 + 1;
            i4 |= (bArr[i6] & 255) << i5;
        }
        byte[] bArr2 = this.f9198a;
        int i7 = this.f9199b;
        int i8 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i7] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.f9200c = 0;
            this.f9199b = i7 + 1;
        }
        a();
        return i8;
    }

    public void i(byte[] bArr, int i2, int i3) {
        int i4 = (i3 >> 3) + i2;
        while (i2 < i4) {
            byte[] bArr2 = this.f9198a;
            int i5 = this.f9199b;
            int i6 = i5 + 1;
            this.f9199b = i6;
            byte b2 = bArr2[i5];
            int i7 = this.f9200c;
            bArr[i2] = (byte) (b2 << i7);
            bArr[i2] = (byte) (((255 & bArr2[i6]) >> (8 - i7)) | bArr[i2]);
            i2++;
        }
        int i8 = i3 & 7;
        if (i8 == 0) {
            return;
        }
        bArr[i4] = (byte) (bArr[i4] & (255 >> i8));
        int i9 = this.f9200c;
        if (i9 + i8 > 8) {
            int i10 = bArr[i4];
            byte[] bArr3 = this.f9198a;
            int i11 = this.f9199b;
            this.f9199b = i11 + 1;
            bArr[i4] = (byte) (i10 | ((bArr3[i11] & 255) << i9));
            this.f9200c = i9 - 8;
        }
        int i12 = this.f9200c + i8;
        this.f9200c = i12;
        byte[] bArr4 = this.f9198a;
        int i13 = this.f9199b;
        bArr[i4] = (byte) (((byte) (((255 & bArr4[i13]) >> (8 - i12)) << (8 - i8))) | bArr[i4]);
        if (i12 == 8) {
            this.f9200c = 0;
            this.f9199b = i13 + 1;
        }
        a();
    }

    public long j(int i2) {
        return i2 <= 32 ? x0.d1(h(i2)) : x0.c1(h(i2 - 32), h(32));
    }

    public void k(byte[] bArr, int i2, int i3) {
        g.g(this.f9200c == 0);
        System.arraycopy(this.f9198a, this.f9199b, bArr, i2, i3);
        this.f9199b += i3;
        a();
    }

    public String l(int i2, Charset charset) {
        byte[] bArr = new byte[i2];
        k(bArr, 0, i2);
        return new String(bArr, charset);
    }

    public void m(i0 i0Var) {
        o(i0Var.d(), i0Var.f());
        p(i0Var.e() * 8);
    }

    public void n(byte[] bArr) {
        o(bArr, bArr.length);
    }

    public void o(byte[] bArr, int i2) {
        this.f9198a = bArr;
        this.f9199b = 0;
        this.f9200c = 0;
        this.f9201d = i2;
    }

    public void p(int i2) {
        int i3 = i2 / 8;
        this.f9199b = i3;
        this.f9200c = i2 - (i3 * 8);
        a();
    }

    public void q() {
        int i2 = this.f9200c + 1;
        this.f9200c = i2;
        if (i2 == 8) {
            this.f9200c = 0;
            this.f9199b++;
        }
        a();
    }

    public void r(int i2) {
        int i3 = i2 / 8;
        int i4 = this.f9199b + i3;
        this.f9199b = i4;
        int i5 = this.f9200c + (i2 - (i3 * 8));
        this.f9200c = i5;
        if (i5 > 7) {
            this.f9199b = i4 + 1;
            this.f9200c = i5 - 8;
        }
        a();
    }

    public void s(int i2) {
        g.g(this.f9200c == 0);
        this.f9199b += i2;
        a();
    }
}
