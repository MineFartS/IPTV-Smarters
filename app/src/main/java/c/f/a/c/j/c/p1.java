package c.f.a.c.j.c;

import java.util.List;

/* JADX INFO: Add missing generic type declarations: [E] */
/* JADX INFO: loaded from: classes2.dex */
public final class p1<E> extends k1<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f13018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f13019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k1 f13020f;

    public p1(k1 k1Var, int i2, int i3) {
        this.f13020f = k1Var;
        this.f13018d = i2;
        this.f13019e = i3;
    }

    @Override // c.f.a.c.j.c.j1
    public final Object[] f() {
        return this.f13020f.f();
    }

    @Override // c.f.a.c.j.c.j1
    public final int g() {
        return this.f13020f.g() + this.f13018d;
    }

    @Override // java.util.List
    public final E get(int i2) {
        c1.c(i2, this.f13019e);
        return this.f13020f.get(i2 + this.f13018d);
    }

    @Override // c.f.a.c.j.c.j1
    public final int i() {
        return this.f13020f.g() + this.f13018d + this.f13019e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13019e;
    }

    @Override // c.f.a.c.j.c.k1, java.util.List
    public final /* synthetic */ List subList(int i2, int i3) {
        return subList(i2, i3);
    }

    @Override // c.f.a.c.j.c.k1
    /* JADX INFO: renamed from: x */
    public final k1<E> subList(int i2, int i3) {
        c1.d(i2, i3, this.f13019e);
        k1 k1Var = this.f13020f;
        int i4 = this.f13018d;
        return (k1) k1Var.subList(i2 + i4, i3 + i4);
    }
}
