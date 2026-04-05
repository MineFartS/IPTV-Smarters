package k.g0.i;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f30836b = new int[10];

    public void a() {
        this.f30835a = 0;
        Arrays.fill(this.f30836b, 0);
    }

    public int b(int i2) {
        return this.f30836b[i2];
    }

    public int c() {
        if ((this.f30835a & 2) != 0) {
            return this.f30836b[1];
        }
        return -1;
    }

    public int d() {
        if ((this.f30835a & 128) != 0) {
            return this.f30836b[7];
        }
        return 65535;
    }

    public int e(int i2) {
        return (this.f30835a & 16) != 0 ? this.f30836b[4] : i2;
    }

    public int f(int i2) {
        return (this.f30835a & 32) != 0 ? this.f30836b[5] : i2;
    }

    public boolean g(int i2) {
        return ((1 << i2) & this.f30835a) != 0;
    }

    public void h(n nVar) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (nVar.g(i2)) {
                i(i2, nVar.b(i2));
            }
        }
    }

    public n i(int i2, int i3) {
        int[] iArr = this.f30836b;
        if (i2 >= iArr.length) {
            return this;
        }
        this.f30835a = (1 << i2) | this.f30835a;
        iArr[i2] = i3;
        return this;
    }

    public int j() {
        return Integer.bitCount(this.f30835a);
    }
}
