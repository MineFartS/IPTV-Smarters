package c.d.a.m;

import com.amazonaws.event.ProgressEvent;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f5478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5480e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5482g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5484i;
    public int p;
    public int q;
    public int r;
    public int v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5483h = 12;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5485j = ProgressEvent.PART_FAILED_EVENT_CODE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f5486k = new int[5003];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f5487l = new int[5003];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5488m = 5003;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5489n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5490o = false;
    public int s = 0;
    public int t = 0;
    public int[] u = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
    public byte[] w = new byte[256];

    public b(int i2, int i3, byte[] bArr, int i4) {
        this.f5476a = i2;
        this.f5477b = i3;
        this.f5478c = bArr;
        this.f5479d = Math.max(2, i4);
    }

    public final int a(int i2) {
        return (1 << i2) - 1;
    }

    public void b(byte b2, OutputStream outputStream) throws IOException {
        byte[] bArr = this.w;
        int i2 = this.v;
        int i3 = i2 + 1;
        this.v = i3;
        bArr[i2] = b2;
        if (i3 >= 254) {
            g(outputStream);
        }
    }

    public void c(OutputStream outputStream) throws IOException {
        d(this.f5488m);
        int i2 = this.q;
        this.f5489n = i2 + 2;
        this.f5490o = true;
        i(i2, outputStream);
    }

    public void d(int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            this.f5486k[i3] = -1;
        }
    }

    public void e(int i2, OutputStream outputStream) throws IOException {
        int[] iArr;
        this.p = i2;
        int i3 = 0;
        this.f5490o = false;
        this.f5482g = i2;
        this.f5484i = a(i2);
        int i4 = 1 << (i2 - 1);
        this.q = i4;
        this.r = i4 + 1;
        this.f5489n = i4 + 2;
        this.v = 0;
        int iH = h();
        for (int i5 = this.f5488m; i5 < 65536; i5 *= 2) {
            i3++;
        }
        int i6 = 8 - i3;
        int i7 = this.f5488m;
        d(i7);
        i(this.q, outputStream);
        while (true) {
            int iH2 = h();
            if (iH2 == -1) {
                i(iH, outputStream);
                i(this.r, outputStream);
                return;
            }
            int i8 = (iH2 << this.f5483h) + iH;
            int i9 = (iH2 << i6) ^ iH;
            int[] iArr2 = this.f5486k;
            if (iArr2[i9] == i8) {
                iH = this.f5487l[i9];
            } else {
                if (iArr2[i9] >= 0) {
                    int i10 = i7 - i9;
                    if (i9 == 0) {
                        i10 = 1;
                    }
                    do {
                        i9 -= i10;
                        if (i9 < 0) {
                            i9 += i7;
                        }
                        iArr = this.f5486k;
                        if (iArr[i9] == i8) {
                            iH = this.f5487l[i9];
                            break;
                        }
                    } while (iArr[i9] >= 0);
                }
                i(iH, outputStream);
                int i11 = this.f5489n;
                if (i11 < this.f5485j) {
                    int[] iArr3 = this.f5487l;
                    this.f5489n = i11 + 1;
                    iArr3[i9] = i11;
                    this.f5486k[i9] = i8;
                } else {
                    c(outputStream);
                }
                iH = iH2;
            }
        }
    }

    public void f(OutputStream outputStream) throws IOException {
        outputStream.write(this.f5479d);
        this.f5480e = this.f5476a * this.f5477b;
        this.f5481f = 0;
        e(this.f5479d + 1, outputStream);
        outputStream.write(0);
    }

    public void g(OutputStream outputStream) throws IOException {
        int i2 = this.v;
        if (i2 > 0) {
            outputStream.write(i2);
            outputStream.write(this.w, 0, this.v);
            this.v = 0;
        }
    }

    public final int h() {
        int i2 = this.f5480e;
        if (i2 == 0) {
            return -1;
        }
        this.f5480e = i2 - 1;
        byte[] bArr = this.f5478c;
        int i3 = this.f5481f;
        this.f5481f = i3 + 1;
        return bArr[i3] & 255;
    }

    public void i(int i2, OutputStream outputStream) throws IOException {
        int i3 = this.s;
        int[] iArr = this.u;
        int i4 = this.t;
        int i5 = i3 & iArr[i4];
        this.s = i5;
        if (i4 > 0) {
            this.s = i5 | (i2 << i4);
        } else {
            this.s = i2;
        }
        this.t = i4 + this.f5482g;
        while (this.t >= 8) {
            b((byte) (this.s & 255), outputStream);
            this.s >>= 8;
            this.t -= 8;
        }
        if (this.f5489n > this.f5484i || this.f5490o) {
            if (this.f5490o) {
                int i6 = this.p;
                this.f5482g = i6;
                this.f5484i = a(i6);
                this.f5490o = false;
            } else {
                int i7 = this.f5482g + 1;
                this.f5482g = i7;
                this.f5484i = i7 == this.f5483h ? this.f5485j : a(i7);
            }
        }
        if (i2 == this.r) {
            while (this.t > 0) {
                b((byte) (this.s & 255), outputStream);
                this.s >>= 8;
                this.t -= 8;
            }
            g(outputStream);
        }
    }
}
