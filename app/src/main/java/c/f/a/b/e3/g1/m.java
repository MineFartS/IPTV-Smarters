package c.f.a.b.e3.g1;

import android.os.Handler;
import c.f.a.b.e3.g1.l;
import c.f.a.b.i3.g0;
import c.f.a.b.j3.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements g0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f7585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f7586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.b.z2.l f7587d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l.a f7589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public n f7590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f7591h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile long f7593j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f7588e = x0.x();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile long f7592i = -9223372036854775807L;

    public interface a {
        void a(String str, l lVar);
    }

    public m(int i2, x xVar, a aVar, c.f.a.b.z2.l lVar, l.a aVar2) {
        this.f7584a = i2;
        this.f7585b = xVar;
        this.f7586c = aVar;
        this.f7587d = lVar;
        this.f7589f = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void d(String str, l lVar) {
        this.f7586c.a(str, lVar);
    }

    @Override // c.f.a.b.i3.g0.e
    public void a() {
        final l lVarA = null;
        try {
            lVarA = this.f7589f.a(this.f7584a);
            final String strC = lVarA.c();
            this.f7588e.post(new Runnable() { // from class: c.f.a.b.e3.g1.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7494b.d(strC, lVarA);
                }
            });
            c.f.a.b.z2.g gVar = new c.f.a.b.z2.g((c.f.a.b.i3.l) c.f.a.b.j3.g.e(lVarA), 0L, -1L);
            n nVar = new n(this.f7585b.f7724a, this.f7584a);
            this.f7590g = nVar;
            nVar.c(this.f7587d);
            while (!this.f7591h) {
                if (this.f7592i != -9223372036854775807L) {
                    this.f7590g.a(this.f7593j, this.f7592i);
                    this.f7592i = -9223372036854775807L;
                }
                if (this.f7590g.g(gVar, new c.f.a.b.z2.w()) == -1) {
                    break;
                }
            }
        } finally {
            x0.n(lVarA);
        }
    }

    @Override // c.f.a.b.i3.g0.e
    public void c() {
        this.f7591h = true;
    }

    public void e() {
        ((n) c.f.a.b.j3.g.e(this.f7590g)).f();
    }

    public void f(long j2, long j3) {
        this.f7592i = j2;
        this.f7593j = j3;
    }

    public void g(int i2) {
        if (((n) c.f.a.b.j3.g.e(this.f7590g)).d()) {
            return;
        }
        this.f7590g.h(i2);
    }

    public void h(long j2) {
        if (j2 == -9223372036854775807L || ((n) c.f.a.b.j3.g.e(this.f7590g)).d()) {
            return;
        }
        this.f7590g.i(j2);
    }
}
