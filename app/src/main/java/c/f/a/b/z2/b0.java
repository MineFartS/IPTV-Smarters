package c.f.a.b.z2;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f10653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10656d;

    public b0(byte[] bArr) {
        this.f10653a = bArr;
        this.f10654b = bArr.length;
    }

    public final void a() {
        int i2;
        int i3 = this.f10655c;
        c.f.a.b.j3.g.g(i3 >= 0 && (i3 < (i2 = this.f10654b) || (i3 == i2 && this.f10656d == 0)));
    }

    public int b() {
        return (this.f10655c * 8) + this.f10656d;
    }

    public boolean c() {
        boolean z = (((this.f10653a[this.f10655c] & 255) >> this.f10656d) & 1) == 1;
        e(1);
        return z;
    }

    public int d(int i2) {
        int i3 = this.f10655c;
        int iMin = Math.min(i2, 8 - this.f10656d);
        int i4 = i3 + 1;
        int i5 = ((this.f10653a[i3] & 255) >> this.f10656d) & (255 >> (8 - iMin));
        while (iMin < i2) {
            i5 |= (this.f10653a[i4] & 255) << iMin;
            iMin += 8;
            i4++;
        }
        int i6 = i5 & ((-1) >>> (32 - i2));
        e(i2);
        return i6;
    }

    public void e(int i2) {
        int i3 = i2 / 8;
        int i4 = this.f10655c + i3;
        this.f10655c = i4;
        int i5 = this.f10656d + (i2 - (i3 * 8));
        this.f10656d = i5;
        if (i5 > 7) {
            this.f10655c = i4 + 1;
            this.f10656d = i5 - 8;
        }
        a();
    }
}
