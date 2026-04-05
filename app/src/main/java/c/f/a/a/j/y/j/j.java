package c.f.a.a.j.y.j;

import c.f.a.a.j.z.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f6282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.a.j.u.g f6283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterable f6284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.a.j.m f6285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6286e;

    public j(m mVar, c.f.a.a.j.u.g gVar, Iterable iterable, c.f.a.a.j.m mVar2, int i2) {
        this.f6282a = mVar;
        this.f6283b = gVar;
        this.f6284c = iterable;
        this.f6285d = mVar2;
        this.f6286e = i2;
    }

    public static b.a a(m mVar, c.f.a.a.j.u.g gVar, Iterable iterable, c.f.a.a.j.m mVar2, int i2) {
        return new j(mVar, gVar, iterable, mVar2, i2);
    }

    @Override // c.f.a.a.j.z.b.a
    public Object execute() {
        return m.c(this.f6282a, this.f6283b, this.f6284c, this.f6285d, this.f6286e);
    }
}
