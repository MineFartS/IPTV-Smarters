package c.d.a.q;

import c.d.a.n.j.l;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class e<A, T, Z, R> implements f<A, T, Z, R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<A, T> f5895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.d.a.n.k.j.c<Z, R> f5896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b<T, Z> f5897d;

    public e(l<A, T> lVar, c.d.a.n.k.j.c<Z, R> cVar, b<T, Z> bVar) {
        if (lVar == null) {
            throw new NullPointerException("ModelLoader must not be null");
        }
        this.f5895b = lVar;
        if (cVar == null) {
            throw new NullPointerException("Transcoder must not be null");
        }
        this.f5896c = cVar;
        if (bVar == null) {
            throw new NullPointerException("DataLoadProvider must not be null");
        }
        this.f5897d = bVar;
    }

    @Override // c.d.a.q.b
    public c.d.a.n.b<T> a() {
        return this.f5897d.a();
    }

    @Override // c.d.a.q.f
    public c.d.a.n.k.j.c<Z, R> b() {
        return this.f5896c;
    }

    @Override // c.d.a.q.b
    public c.d.a.n.f<Z> c() {
        return this.f5897d.c();
    }

    @Override // c.d.a.q.b
    public c.d.a.n.e<T, Z> e() {
        return this.f5897d.e();
    }

    @Override // c.d.a.q.b
    public c.d.a.n.e<File, Z> f() {
        return this.f5897d.f();
    }

    @Override // c.d.a.q.f
    public l<A, T> g() {
        return this.f5895b;
    }
}
