package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public final class r1<E> extends k1<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k1<Object> f13055d = new r1(new Object[0], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f13056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f13057f;

    public r1(Object[] objArr, int i2) {
        this.f13056e = objArr;
        this.f13057f = i2;
    }

    @Override // c.f.a.c.j.c.k1, c.f.a.c.j.c.j1
    public final int a(Object[] objArr, int i2) {
        System.arraycopy(this.f13056e, 0, objArr, i2, this.f13057f);
        return i2 + this.f13057f;
    }

    @Override // c.f.a.c.j.c.j1
    public final Object[] f() {
        return this.f13056e;
    }

    @Override // c.f.a.c.j.c.j1
    public final int g() {
        return 0;
    }

    @Override // java.util.List
    public final E get(int i2) {
        c1.c(i2, this.f13057f);
        return (E) this.f13056e[i2];
    }

    @Override // c.f.a.c.j.c.j1
    public final int i() {
        return this.f13057f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13057f;
    }
}
