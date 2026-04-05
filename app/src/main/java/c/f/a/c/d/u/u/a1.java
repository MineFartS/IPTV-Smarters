package c.f.a.c.d.u.u;

import c.f.a.c.d.u.u.i;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 implements c.f.a.c.d.v.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f11939a;

    public a1(i iVar) {
        this.f11939a = iVar;
    }

    @Override // c.f.a.c.d.v.q
    public final void a() {
        l();
        Iterator it = this.f11939a.f12009h.iterator();
        while (it.hasNext()) {
            ((i.b) it.next()).a();
        }
        Iterator<i.a> it2 = this.f11939a.f12010i.iterator();
        while (it2.hasNext()) {
            it2.next().c();
        }
    }

    @Override // c.f.a.c.d.v.q
    public final void b() {
        Iterator it = this.f11939a.f12009h.iterator();
        while (it.hasNext()) {
            ((i.b) it.next()).b();
        }
        Iterator<i.a> it2 = this.f11939a.f12010i.iterator();
        while (it2.hasNext()) {
            it2.next().e();
        }
    }

    @Override // c.f.a.c.d.v.q
    public final void c() {
        Iterator it = this.f11939a.f12009h.iterator();
        while (it.hasNext()) {
            ((i.b) it.next()).c();
        }
        Iterator<i.a> it2 = this.f11939a.f12010i.iterator();
        while (it2.hasNext()) {
            it2.next().d();
        }
    }

    @Override // c.f.a.c.d.v.q
    public final void d() {
        l();
        this.f11939a.n0();
        Iterator it = this.f11939a.f12009h.iterator();
        while (it.hasNext()) {
            ((i.b) it.next()).d();
        }
        Iterator<i.a> it2 = this.f11939a.f12010i.iterator();
        while (it2.hasNext()) {
            it2.next().g();
        }
    }

    @Override // c.f.a.c.d.v.q
    public final void e() {
        Iterator it = this.f11939a.f12009h.iterator();
        while (it.hasNext()) {
            ((i.b) it.next()).e();
        }
        Iterator<i.a> it2 = this.f11939a.f12010i.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
    }

    @Override // c.f.a.c.d.v.q
    public final void f(int[] iArr, int i2) {
        Iterator<i.a> it = this.f11939a.f12010i.iterator();
        while (it.hasNext()) {
            it.next().i(iArr, i2);
        }
    }

    @Override // c.f.a.c.d.v.q
    public final void g(int[] iArr) {
        Iterator<i.a> it = this.f11939a.f12010i.iterator();
        while (it.hasNext()) {
            it.next().l(iArr);
        }
    }

    @Override // c.f.a.c.d.v.q
    public final void h(int[] iArr) {
        Iterator<i.a> it = this.f11939a.f12010i.iterator();
        while (it.hasNext()) {
            it.next().h(iArr);
        }
    }

    @Override // c.f.a.c.d.v.q
    public final void i(int[] iArr) {
        Iterator<i.a> it = this.f11939a.f12010i.iterator();
        while (it.hasNext()) {
            it.next().k(iArr);
        }
    }

    @Override // c.f.a.c.d.v.q
    public final void j(MediaError mediaError) {
        Iterator<i.a> it = this.f11939a.f12010i.iterator();
        while (it.hasNext()) {
            it.next().b(mediaError);
        }
    }

    @Override // c.f.a.c.d.v.q
    public final void k(c.f.a.c.d.o[] oVarArr) {
        Iterator<i.a> it = this.f11939a.f12010i.iterator();
        while (it.hasNext()) {
            it.next().j(oVarArr);
        }
    }

    public final void l() {
        c.f.a.c.d.q qVarL;
        if (this.f11939a.f12013l == null || (qVarL = this.f11939a.l()) == null) {
            return;
        }
        qVarL.f0().a(this.f11939a.f12013l.b(qVarL));
        List<c.f.a.c.d.b> listA = this.f11939a.f12013l.a(qVarL);
        MediaInfo mediaInfoJ = this.f11939a.j();
        if (mediaInfoJ != null) {
            mediaInfoJ.V().a(listA);
        }
    }
}
