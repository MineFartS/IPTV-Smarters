package a.g.b;

/* JADX INFO: loaded from: classes.dex */
public class g<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f1350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1351b;

    public g(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f1350a = new Object[i2];
    }

    @Override // a.g.b.f
    public boolean a(T t) {
        int i2 = this.f1351b;
        Object[] objArr = this.f1350a;
        if (i2 >= objArr.length) {
            return false;
        }
        objArr[i2] = t;
        this.f1351b = i2 + 1;
        return true;
    }

    @Override // a.g.b.f
    public T b() {
        int i2 = this.f1351b;
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        Object[] objArr = this.f1350a;
        T t = (T) objArr[i3];
        objArr[i3] = null;
        this.f1351b = i2 - 1;
        return t;
    }

    @Override // a.g.b.f
    public void c(T[] tArr, int i2) {
        if (i2 > tArr.length) {
            i2 = tArr.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            T t = tArr[i3];
            int i4 = this.f1351b;
            Object[] objArr = this.f1350a;
            if (i4 < objArr.length) {
                objArr[i4] = t;
                this.f1351b = i4 + 1;
            }
        }
    }
}
