package a.f;

/* JADX INFO: loaded from: classes.dex */
public final class c<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public E[] f1258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1261d;

    public c(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i2 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i2 = Integer.bitCount(i2) != 1 ? Integer.highestOneBit(i2 - 1) << 1 : i2;
        this.f1261d = i2 - 1;
        this.f1258a = (E[]) new Object[i2];
    }

    public void a(E e2) {
        int i2 = (this.f1259b - 1) & this.f1261d;
        this.f1259b = i2;
        this.f1258a[i2] = e2;
        if (i2 == this.f1260c) {
            d();
        }
    }

    public void b(E e2) {
        E[] eArr = this.f1258a;
        int i2 = this.f1260c;
        eArr[i2] = e2;
        int i3 = this.f1261d & (i2 + 1);
        this.f1260c = i3;
        if (i3 == this.f1259b) {
            d();
        }
    }

    public void c() {
        g(h());
    }

    public final void d() {
        E[] eArr = this.f1258a;
        int length = eArr.length;
        int i2 = this.f1259b;
        int i3 = length - i2;
        int i4 = length << 1;
        if (i4 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[i4];
        System.arraycopy(eArr, i2, eArr2, 0, i3);
        System.arraycopy(this.f1258a, 0, eArr2, i3, this.f1259b);
        this.f1258a = eArr2;
        this.f1259b = 0;
        this.f1260c = length;
        this.f1261d = i4 - 1;
    }

    public E e(int i2) {
        if (i2 < 0 || i2 >= h()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f1258a[this.f1261d & (this.f1259b + i2)];
    }

    public void f(int i2) {
        int i3;
        if (i2 <= 0) {
            return;
        }
        if (i2 > h()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = this.f1260c;
        int i5 = i2 < i4 ? i4 - i2 : 0;
        int i6 = i5;
        while (true) {
            i3 = this.f1260c;
            if (i6 >= i3) {
                break;
            }
            this.f1258a[i6] = null;
            i6++;
        }
        int i7 = i3 - i5;
        int i8 = i2 - i7;
        this.f1260c = i3 - i7;
        if (i8 > 0) {
            int length = this.f1258a.length;
            this.f1260c = length;
            int i9 = length - i8;
            for (int i10 = i9; i10 < this.f1260c; i10++) {
                this.f1258a[i10] = null;
            }
            this.f1260c = i9;
        }
    }

    public void g(int i2) {
        if (i2 <= 0) {
            return;
        }
        if (i2 > h()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.f1258a.length;
        int i3 = this.f1259b;
        if (i2 < length - i3) {
            length = i3 + i2;
        }
        while (i3 < length) {
            this.f1258a[i3] = null;
            i3++;
        }
        int i4 = this.f1259b;
        int i5 = length - i4;
        int i6 = i2 - i5;
        this.f1259b = this.f1261d & (i4 + i5);
        if (i6 > 0) {
            for (int i7 = 0; i7 < i6; i7++) {
                this.f1258a[i7] = null;
            }
            this.f1259b = i6;
        }
    }

    public int h() {
        return (this.f1260c - this.f1259b) & this.f1261d;
    }
}
