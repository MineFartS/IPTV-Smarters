package c.f.a.b.g3;

import c.f.a.b.e3.a1;
import c.f.a.b.e3.i0;
import c.f.a.b.j2;
import c.f.a.b.p2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f8520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.f.a.b.i3.i f8521b;

    public interface a {
        void a();
    }

    public final c.f.a.b.i3.i a() {
        return (c.f.a.b.i3.i) c.f.a.b.j3.g.e(this.f8521b);
    }

    public final void b(a aVar, c.f.a.b.i3.i iVar) {
        this.f8520a = aVar;
        this.f8521b = iVar;
    }

    public final void c() {
        a aVar = this.f8520a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public abstract void d(Object obj);

    public abstract p e(j2[] j2VarArr, a1 a1Var, i0.a aVar, p2 p2Var);
}
