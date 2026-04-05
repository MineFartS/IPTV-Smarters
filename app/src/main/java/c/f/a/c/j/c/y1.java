package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public final class y1 extends k1<Object> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f13139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f13140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f13141f = 0;

    public y1(Object[] objArr, int i2, int i3) {
        this.f13139d = objArr;
        this.f13140e = i2;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        c1.c(i2, this.f13141f);
        return this.f13139d[(i2 * 2) + this.f13140e];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13141f;
    }
}
