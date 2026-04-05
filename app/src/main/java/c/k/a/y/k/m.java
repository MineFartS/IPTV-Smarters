package c.k.a.y.k;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f18532d = new int[10];

    public void a() {
        this.f18531c = 0;
        this.f18530b = 0;
        this.f18529a = 0;
        Arrays.fill(this.f18532d, 0);
    }

    public int b(int i2) {
        int i3 = g(i2) ? 2 : 0;
        return j(i2) ? i3 | 1 : i3;
    }

    public int c(int i2) {
        return this.f18532d[i2];
    }

    public int d() {
        if ((this.f18529a & 2) != 0) {
            return this.f18532d[1];
        }
        return -1;
    }

    public int e(int i2) {
        return (this.f18529a & 128) != 0 ? this.f18532d[7] : i2;
    }

    public int f(int i2) {
        return (this.f18529a & 32) != 0 ? this.f18532d[5] : i2;
    }

    public boolean g(int i2) {
        return ((1 << i2) & this.f18531c) != 0;
    }

    public boolean h(int i2) {
        return ((1 << i2) & this.f18529a) != 0;
    }

    public void i(m mVar) {
        for (int i2 = 0; i2 < 10; i2++) {
            if (mVar.h(i2)) {
                k(i2, mVar.b(i2), mVar.c(i2));
            }
        }
    }

    public boolean j(int i2) {
        return ((1 << i2) & this.f18530b) != 0;
    }

    public m k(int i2, int i3, int i4) {
        int[] iArr = this.f18532d;
        if (i2 >= iArr.length) {
            return this;
        }
        int i5 = 1 << i2;
        this.f18529a |= i5;
        this.f18530b = (i3 & 1) != 0 ? this.f18530b | i5 : this.f18530b & (i5 ^ (-1));
        this.f18531c = (i3 & 2) != 0 ? this.f18531c | i5 : this.f18531c & (i5 ^ (-1));
        iArr[i2] = i4;
        return this;
    }

    public int l() {
        return Integer.bitCount(this.f18529a);
    }
}
