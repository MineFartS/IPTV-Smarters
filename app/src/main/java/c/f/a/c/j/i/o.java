package c.f.a.c.j.i;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f13702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f13703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f13704f;

    public o(p pVar, int i2, int i3) {
        this.f13704f = pVar;
        this.f13702d = i2;
        this.f13703e = i3;
    }

    @Override // c.f.a.c.j.i.m
    public final int d() {
        return this.f13704f.f() + this.f13702d + this.f13703e;
    }

    @Override // c.f.a.c.j.i.m
    public final int f() {
        return this.f13704f.f() + this.f13702d;
    }

    @Override // c.f.a.c.j.i.m
    public final Object[] g() {
        return this.f13704f.g();
    }

    @Override // java.util.List
    public final Object get(int i2) {
        j.a(i2, this.f13703e, "index");
        return this.f13704f.get(i2 + this.f13702d);
    }

    @Override // c.f.a.c.j.i.p
    /* JADX INFO: renamed from: h */
    public final p subList(int i2, int i3) {
        j.c(i2, i3, this.f13703e);
        p pVar = this.f13704f;
        int i4 = this.f13702d;
        return pVar.subList(i2 + i4, i3 + i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13703e;
    }

    @Override // c.f.a.c.j.i.p, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i2, int i3) {
        return subList(i2, i3);
    }
}
