package c.f.b.b;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class o0<E> extends x<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o0<Object> f15910d = new o0<>(new Object[0], 0, null, 0, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f15911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f15912f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f15913g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f15914h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient int f15915i;

    public o0(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.f15911e = objArr;
        this.f15912f = objArr2;
        this.f15913g = i3;
        this.f15914h = i2;
        this.f15915i = i4;
    }

    @Override // c.f.b.b.x
    public t<E> D() {
        return t.x(this.f15911e, this.f15915i);
    }

    @Override // c.f.b.b.x
    public boolean F() {
        return true;
    }

    @Override // c.f.b.b.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f15912f;
        if (obj == null || objArr == null) {
            return false;
        }
        int iC = q.c(obj);
        while (true) {
            int i2 = iC & this.f15913g;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iC = i2 + 1;
        }
    }

    @Override // c.f.b.b.r
    public int e(Object[] objArr, int i2) {
        System.arraycopy(this.f15911e, 0, objArr, i2, this.f15915i);
        return i2 + this.f15915i;
    }

    @Override // c.f.b.b.r
    public Object[] f() {
        return this.f15911e;
    }

    @Override // c.f.b.b.r
    public int g() {
        return this.f15915i;
    }

    @Override // c.f.b.b.x, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f15914h;
    }

    @Override // c.f.b.b.r
    public int i() {
        return 0;
    }

    @Override // c.f.b.b.r
    public boolean s() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f15915i;
    }

    @Override // c.f.b.b.x, c.f.b.b.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: t */
    public w0<E> iterator() {
        return d().iterator();
    }
}
