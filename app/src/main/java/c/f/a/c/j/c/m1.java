package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public final class m1<E> extends h1<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1<E> f12940d;

    public m1(k1<E> k1Var, int i2) {
        super(k1Var.size(), i2);
        this.f12940d = k1Var;
    }

    @Override // c.f.a.c.j.c.h1
    public final E a(int i2) {
        return this.f12940d.get(i2);
    }
}
