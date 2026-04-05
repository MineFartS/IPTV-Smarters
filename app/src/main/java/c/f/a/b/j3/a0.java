package c.f.a.b.j3;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f9152b;

    public a0() {
        this(32);
    }

    public a0(int i2) {
        this.f9152b = new long[i2];
    }

    public void a(long j2) {
        int i2 = this.f9151a;
        long[] jArr = this.f9152b;
        if (i2 == jArr.length) {
            this.f9152b = Arrays.copyOf(jArr, i2 * 2);
        }
        long[] jArr2 = this.f9152b;
        int i3 = this.f9151a;
        this.f9151a = i3 + 1;
        jArr2[i3] = j2;
    }

    public long b(int i2) {
        if (i2 >= 0 && i2 < this.f9151a) {
            return this.f9152b[i2];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i2 + ", size is " + this.f9151a);
    }

    public int c() {
        return this.f9151a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f9152b, this.f9151a);
    }
}
