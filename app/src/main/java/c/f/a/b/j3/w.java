package c.f.a.b.j3;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9288a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9289b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9290c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f9291d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9292e;

    public w() {
        this.f9292e = r0.length - 1;
    }

    public void a(int i2) {
        if (this.f9290c == this.f9291d.length) {
            c();
        }
        int i3 = (this.f9289b + 1) & this.f9292e;
        this.f9289b = i3;
        this.f9291d[i3] = i2;
        this.f9290c++;
    }

    public void b() {
        this.f9288a = 0;
        this.f9289b = -1;
        this.f9290c = 0;
    }

    public final void c() {
        int[] iArr = this.f9291d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i2 = this.f9288a;
        int i3 = length2 - i2;
        System.arraycopy(iArr, i2, iArr2, 0, i3);
        System.arraycopy(this.f9291d, 0, iArr2, i3, i2);
        this.f9288a = 0;
        this.f9289b = this.f9290c - 1;
        this.f9291d = iArr2;
        this.f9292e = iArr2.length - 1;
    }

    public boolean d() {
        return this.f9290c == 0;
    }

    public int e() {
        int i2 = this.f9290c;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f9291d;
        int i3 = this.f9288a;
        int i4 = iArr[i3];
        this.f9288a = (i3 + 1) & this.f9292e;
        this.f9290c = i2 - 1;
        return i4;
    }
}
