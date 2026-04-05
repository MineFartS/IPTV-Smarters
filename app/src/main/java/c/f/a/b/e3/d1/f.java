package c.f.a.b.e3.d1;

import android.net.Uri;
import c.f.a.b.e3.a0;
import c.f.a.b.i3.g0;
import c.f.a.b.i3.l0;
import c.f.a.b.i3.s;
import c.f.a.b.k1;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f implements g0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7022a = a0.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f7023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k1 f7025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f7027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l0 f7030i;

    public f(c.f.a.b.i3.p pVar, s sVar, int i2, k1 k1Var, int i3, Object obj, long j2, long j3) {
        this.f7030i = new l0(pVar);
        this.f7023b = (s) c.f.a.b.j3.g.e(sVar);
        this.f7024c = i2;
        this.f7025d = k1Var;
        this.f7026e = i3;
        this.f7027f = obj;
        this.f7028g = j2;
        this.f7029h = j3;
    }

    public final long b() {
        return this.f7030i.f();
    }

    public final long d() {
        return this.f7029h - this.f7028g;
    }

    public final Map<String, List<String>> e() {
        return this.f7030i.w();
    }

    public final Uri f() {
        return this.f7030i.v();
    }
}
