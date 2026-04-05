package c.f.a.c.j.i;

/* JADX INFO: loaded from: classes2.dex */
public final class q<E> extends p<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p<Object> f13706d = new q(new Object[0], 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f13707e;

    public q(Object[] objArr, int i2) {
        this.f13707e = objArr;
    }

    @Override // c.f.a.c.j.i.p, c.f.a.c.j.i.m
    public final int a(Object[] objArr, int i2) {
        System.arraycopy(this.f13707e, 0, objArr, 0, 0);
        return 0;
    }

    @Override // c.f.a.c.j.i.m
    public final int d() {
        return 0;
    }

    @Override // c.f.a.c.j.i.m
    public final int f() {
        return 0;
    }

    @Override // c.f.a.c.j.i.m
    public final Object[] g() {
        return this.f13707e;
    }

    @Override // java.util.List
    public final E get(int i2) {
        j.a(i2, 0, "index");
        return (E) this.f13707e[i2];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
