package c.f.a.a.j.y;

import c.f.a.a.j.m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f6232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f6233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.a.h f6234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.a.j.h f6235e;

    public a(c cVar, m mVar, c.f.a.a.h hVar, c.f.a.a.j.h hVar2) {
        this.f6232b = cVar;
        this.f6233c = mVar;
        this.f6234d = hVar;
        this.f6235e = hVar2;
    }

    public static Runnable a(c cVar, m mVar, c.f.a.a.h hVar, c.f.a.a.j.h hVar2) {
        return new a(cVar, mVar, hVar, hVar2);
    }

    @Override // java.lang.Runnable
    public void run() {
        c.c(this.f6232b, this.f6233c, this.f6234d, this.f6235e);
    }
}
