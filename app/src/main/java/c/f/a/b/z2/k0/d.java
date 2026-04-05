package c.f.a.b.z2.k0;

import android.net.Uri;
import c.f.a.b.j3.i0;
import c.f.a.b.w1;
import c.f.a.b.z2.a0;
import c.f.a.b.z2.k;
import c.f.a.b.z2.l;
import c.f.a.b.z2.n;
import c.f.a.b.z2.o;
import c.f.a.b.z2.w;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes2.dex */
public class d implements c.f.a.b.z2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f11054a = new o() { // from class: c.f.a.b.z2.k0.a
        @Override // c.f.a.b.z2.o
        public final c.f.a.b.z2.j[] a() {
            return d.b();
        }

        @Override // c.f.a.b.z2.o
        public /* synthetic */ c.f.a.b.z2.j[] b(Uri uri, Map map) {
            return n.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f11055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f11056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11057d;

    public static /* synthetic */ c.f.a.b.z2.j[] b() {
        return new c.f.a.b.z2.j[]{new d()};
    }

    public static i0 d(i0 i0Var) {
        i0Var.P(0);
        return i0Var;
    }

    @Override // c.f.a.b.z2.j
    public void a(long j2, long j3) {
        i iVar = this.f11056c;
        if (iVar != null) {
            iVar.m(j2, j3);
        }
    }

    @Override // c.f.a.b.z2.j
    public void c(l lVar) {
        this.f11055b = lVar;
    }

    @Override // c.f.a.b.z2.j
    public boolean e(k kVar) {
        try {
            return f(kVar);
        } catch (w1 unused) {
            return false;
        }
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    public final boolean f(k kVar) {
        i hVar;
        f fVar = new f();
        if (fVar.a(kVar, true) && (fVar.f11064b & 2) == 2) {
            int iMin = Math.min(fVar.f11071i, 8);
            i0 i0Var = new i0(iMin);
            kVar.u(i0Var.d(), 0, iMin);
            if (c.p(d(i0Var))) {
                hVar = new c();
            } else if (j.r(d(i0Var))) {
                hVar = new j();
            } else if (h.o(d(i0Var))) {
                hVar = new h();
            }
            this.f11056c = hVar;
            return true;
        }
        return false;
    }

    @Override // c.f.a.b.z2.j
    public int g(k kVar, w wVar) throws w1 {
        c.f.a.b.j3.g.i(this.f11055b);
        if (this.f11056c == null) {
            if (!f(kVar)) {
                throw w1.a("Failed to determine bitstream type", null);
            }
            kVar.r();
        }
        if (!this.f11057d) {
            a0 a0VarE = this.f11055b.e(0, 1);
            this.f11055b.p();
            this.f11056c.d(this.f11055b, a0VarE);
            this.f11057d = true;
        }
        return this.f11056c.g(kVar, wVar);
    }

    @Override // c.f.a.b.z2.j
    public void release() {
    }
}
