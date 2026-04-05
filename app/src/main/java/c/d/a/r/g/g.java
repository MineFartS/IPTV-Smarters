package c.d.a.r.g;

import c.d.a.r.g.f;

/* JADX INFO: loaded from: classes.dex */
public class g<R> implements d<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.a f5926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c<R> f5927b;

    public g(f.a aVar) {
        this.f5926a = aVar;
    }

    @Override // c.d.a.r.g.d
    public c<R> a(boolean z, boolean z2) {
        if (z || !z2) {
            return e.c();
        }
        if (this.f5927b == null) {
            this.f5927b = new f(this.f5926a);
        }
        return this.f5927b;
    }
}
