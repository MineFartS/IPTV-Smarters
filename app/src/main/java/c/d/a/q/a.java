package c.d.a.q;

import c.d.a.n.j.l;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class a<A, T, Z, R> implements f<A, T, Z, R>, Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f<A, T, Z, R> f5886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.d.a.n.e<File, Z> f5887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.d.a.n.e<T, Z> f5888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.d.a.n.f<Z> f5889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.d.a.n.k.j.c<Z, R> f5890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.d.a.n.b<T> f5891g;

    public a(f<A, T, Z, R> fVar) {
        this.f5886b = fVar;
    }

    @Override // c.d.a.q.b
    public c.d.a.n.b<T> a() {
        c.d.a.n.b<T> bVar = this.f5891g;
        return bVar != null ? bVar : this.f5886b.a();
    }

    @Override // c.d.a.q.f
    public c.d.a.n.k.j.c<Z, R> b() {
        c.d.a.n.k.j.c<Z, R> cVar = this.f5890f;
        return cVar != null ? cVar : this.f5886b.b();
    }

    @Override // c.d.a.q.b
    public c.d.a.n.f<Z> c() {
        c.d.a.n.f<Z> fVar = this.f5889e;
        return fVar != null ? fVar : this.f5886b.c();
    }

    @Override // c.d.a.q.b
    public c.d.a.n.e<T, Z> e() {
        c.d.a.n.e<T, Z> eVar = this.f5888d;
        return eVar != null ? eVar : this.f5886b.e();
    }

    @Override // c.d.a.q.b
    public c.d.a.n.e<File, Z> f() {
        c.d.a.n.e<File, Z> eVar = this.f5887c;
        return eVar != null ? eVar : this.f5886b.f();
    }

    @Override // c.d.a.q.f
    public l<A, T> g() {
        return this.f5886b.g();
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a<A, T, Z, R> clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void j(c.d.a.n.e<T, Z> eVar) {
        this.f5888d = eVar;
    }

    public void k(c.d.a.n.b<T> bVar) {
        this.f5891g = bVar;
    }
}
