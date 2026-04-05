package c.f.b.b;

/* JADX INFO: loaded from: classes2.dex */
public class m0<E> extends t<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t<Object> f15888d = new m0(new Object[0], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f15889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f15890f;

    public m0(Object[] objArr, int i2) {
        this.f15889e = objArr;
        this.f15890f = i2;
    }

    @Override // c.f.b.b.t, c.f.b.b.r
    public int e(Object[] objArr, int i2) {
        System.arraycopy(this.f15889e, 0, objArr, i2, this.f15890f);
        return i2 + this.f15890f;
    }

    @Override // c.f.b.b.r
    public Object[] f() {
        return this.f15889e;
    }

    @Override // c.f.b.b.r
    public int g() {
        return this.f15890f;
    }

    @Override // java.util.List
    public E get(int i2) {
        c.f.b.a.k.h(i2, this.f15890f);
        return (E) this.f15889e[i2];
    }

    @Override // c.f.b.b.r
    public int i() {
        return 0;
    }

    @Override // c.f.b.b.r
    public boolean s() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f15890f;
    }
}
