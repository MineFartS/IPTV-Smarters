package a.i.q;

/* JADX INFO: loaded from: classes.dex */
public class g<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f1957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1958b;

    public g(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f1957a = new Object[i2];
    }

    @Override // a.i.q.f
    public boolean a(T t) {
        if (c(t)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i2 = this.f1958b;
        Object[] objArr = this.f1957a;
        if (i2 >= objArr.length) {
            return false;
        }
        objArr[i2] = t;
        this.f1958b = i2 + 1;
        return true;
    }

    @Override // a.i.q.f
    public T b() {
        int i2 = this.f1958b;
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        Object[] objArr = this.f1957a;
        T t = (T) objArr[i3];
        objArr[i3] = null;
        this.f1958b = i2 - 1;
        return t;
    }

    public final boolean c(T t) {
        for (int i2 = 0; i2 < this.f1958b; i2++) {
            if (this.f1957a[i2] == t) {
                return true;
            }
        }
        return false;
    }
}
