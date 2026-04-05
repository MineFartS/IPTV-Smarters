package c.f.a.b.i3;

import android.net.Uri;
import c.f.a.b.i3.g0;
import c.f.a.b.i3.s;
import c.f.a.b.j3.x0;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class i0<T> implements g0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f8900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0 f8902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a<? extends T> f8903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile T f8904f;

    public interface a<T> {
        T a(Uri uri, InputStream inputStream);
    }

    public i0(p pVar, Uri uri, int i2, a<? extends T> aVar) {
        this(pVar, new s.b().i(uri).b(1).a(), i2, aVar);
    }

    public i0(p pVar, s sVar, int i2, a<? extends T> aVar) {
        this.f8902d = new l0(pVar);
        this.f8900b = sVar;
        this.f8901c = i2;
        this.f8903e = aVar;
        this.f8899a = c.f.a.b.e3.a0.a();
    }

    public static <T> T g(p pVar, a<? extends T> aVar, s sVar, int i2) {
        i0 i0Var = new i0(pVar, sVar, i2, aVar);
        i0Var.a();
        return (T) c.f.a.b.j3.g.e(i0Var.e());
    }

    @Override // c.f.a.b.i3.g0.e
    public final void a() {
        this.f8902d.x();
        r rVar = new r(this.f8902d, this.f8900b);
        try {
            rVar.i();
            this.f8904f = this.f8903e.a((Uri) c.f.a.b.j3.g.e(this.f8902d.a()), rVar);
        } finally {
            x0.o(rVar);
        }
    }

    public long b() {
        return this.f8902d.f();
    }

    @Override // c.f.a.b.i3.g0.e
    public final void c() {
    }

    public Map<String, List<String>> d() {
        return this.f8902d.w();
    }

    public final T e() {
        return this.f8904f;
    }

    public Uri f() {
        return this.f8902d.v();
    }
}
