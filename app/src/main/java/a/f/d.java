package a.f;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f1262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1265d;

    public d() {
        this(8);
    }

    public d(int i2) {
        if (i2 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i2 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i2 = Integer.bitCount(i2) != 1 ? Integer.highestOneBit(i2 - 1) << 1 : i2;
        this.f1265d = i2 - 1;
        this.f1262a = new int[i2];
    }

    public void a(int i2) {
        int[] iArr = this.f1262a;
        int i3 = this.f1264c;
        iArr[i3] = i2;
        int i4 = this.f1265d & (i3 + 1);
        this.f1264c = i4;
        if (i4 == this.f1263b) {
            c();
        }
    }

    public void b() {
        this.f1264c = this.f1263b;
    }

    public final void c() {
        int[] iArr = this.f1262a;
        int length = iArr.length;
        int i2 = this.f1263b;
        int i3 = length - i2;
        int i4 = length << 1;
        if (i4 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i4];
        System.arraycopy(iArr, i2, iArr2, 0, i3);
        System.arraycopy(this.f1262a, 0, iArr2, i3, this.f1263b);
        this.f1262a = iArr2;
        this.f1263b = 0;
        this.f1264c = length;
        this.f1265d = i4 - 1;
    }

    public int d(int i2) {
        if (i2 < 0 || i2 >= g()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f1262a[this.f1265d & (this.f1263b + i2)];
    }

    public int e() {
        int i2 = this.f1263b;
        int i3 = this.f1264c;
        if (i2 != i3) {
            return this.f1262a[(i3 - 1) & this.f1265d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int f() {
        int i2 = this.f1263b;
        int i3 = this.f1264c;
        if (i2 == i3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = this.f1265d & (i3 - 1);
        int i5 = this.f1262a[i4];
        this.f1264c = i4;
        return i5;
    }

    public int g() {
        return (this.f1264c - this.f1263b) & this.f1265d;
    }
}
