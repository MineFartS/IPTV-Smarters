package c.f.a.b.j3;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f9208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9211d;

    public j0(byte[] bArr, int i2, int i3) {
        i(bArr, i2, i3);
    }

    public final void a() {
        int i2;
        int i3 = this.f9210c;
        g.g(i3 >= 0 && (i3 < (i2 = this.f9209b) || (i3 == i2 && this.f9211d == 0)));
    }

    public boolean b(int i2) {
        int i3 = this.f9210c;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        int i6 = (this.f9211d + i2) - (i4 * 8);
        if (i6 > 7) {
            i5++;
            i6 -= 8;
        }
        while (true) {
            i3++;
            if (i3 > i5 || i5 >= this.f9209b) {
                break;
            }
            if (j(i3)) {
                i5++;
                i3 += 2;
            }
        }
        int i7 = this.f9209b;
        if (i5 >= i7) {
            return i5 == i7 && i6 == 0;
        }
        return true;
    }

    public boolean c() {
        int i2 = this.f9210c;
        int i3 = this.f9211d;
        int i4 = 0;
        while (this.f9210c < this.f9209b && !d()) {
            i4++;
        }
        boolean z = this.f9210c == this.f9209b;
        this.f9210c = i2;
        this.f9211d = i3;
        return !z && b((i4 * 2) + 1);
    }

    public boolean d() {
        boolean z = (this.f9208a[this.f9210c] & (128 >> this.f9211d)) != 0;
        k();
        return z;
    }

    public int e(int i2) {
        int i3;
        this.f9211d += i2;
        int i4 = 0;
        while (true) {
            i3 = this.f9211d;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.f9211d = i5;
            byte[] bArr = this.f9208a;
            int i6 = this.f9210c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!j(i6 + 1)) {
                i = 1;
            }
            this.f9210c = i6 + i;
        }
        byte[] bArr2 = this.f9208a;
        int i7 = this.f9210c;
        int i8 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i7] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.f9211d = 0;
            this.f9210c = i7 + (j(i7 + 1) ? 2 : 1);
        }
        a();
        return i8;
    }

    public final int f() {
        int i2 = 0;
        while (!d()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? e(i2) : 0);
    }

    public int g() {
        int iF = f();
        return (iF % 2 == 0 ? -1 : 1) * ((iF + 1) / 2);
    }

    public int h() {
        return f();
    }

    public void i(byte[] bArr, int i2, int i3) {
        this.f9208a = bArr;
        this.f9210c = i2;
        this.f9209b = i3;
        this.f9211d = 0;
        a();
    }

    public final boolean j(int i2) {
        if (2 <= i2 && i2 < this.f9209b) {
            byte[] bArr = this.f9208a;
            if (bArr[i2] == 3 && bArr[i2 - 2] == 0 && bArr[i2 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void k() {
        int i2 = this.f9211d + 1;
        this.f9211d = i2;
        if (i2 == 8) {
            this.f9211d = 0;
            int i3 = this.f9210c;
            this.f9210c = i3 + (j(i3 + 1) ? 2 : 1);
        }
        a();
    }

    public void l(int i2) {
        int i3 = this.f9210c;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        this.f9210c = i5;
        int i6 = this.f9211d + (i2 - (i4 * 8));
        this.f9211d = i6;
        if (i6 > 7) {
            this.f9210c = i5 + 1;
            this.f9211d = i6 - 8;
        }
        while (true) {
            i3++;
            if (i3 > this.f9210c) {
                a();
                return;
            } else if (j(i3)) {
                this.f9210c++;
                i3 += 2;
            }
        }
    }
}
