package c.f.a.e.a.b;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.e.a.e.a f15509a = new c.f.a.e.a.e.a("ExtractorLooper");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f15510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f15511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f15512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n1 f15513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s1 f15514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1 f15515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c.f.a.e.a.e.z<s2> f15516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d1 f15517i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f15518j = new AtomicBoolean(false);

    public l0(a1 a1Var, c.f.a.e.a.e.z<s2> zVar, j0 j0Var, c2 c2Var, n1 n1Var, s1 s1Var, w1 w1Var, d1 d1Var) {
        this.f15510b = a1Var;
        this.f15516h = zVar;
        this.f15511c = j0Var;
        this.f15512d = c2Var;
        this.f15513e = n1Var;
        this.f15514f = s1Var;
        this.f15515g = w1Var;
        this.f15517i = d1Var;
    }

    public final void a() {
        c.f.a.e.a.e.a aVar = f15509a;
        aVar.a("Run extractor loop", new Object[0]);
        if (!this.f15518j.compareAndSet(false, true)) {
            aVar.e("runLoop already looping; return", new Object[0]);
            return;
        }
        while (true) {
            c1 c1VarA = null;
            try {
                c1VarA = this.f15517i.a();
            } catch (k0 e2) {
                f15509a.b("Error while getting next extraction task: %s", e2.getMessage());
                if (e2.f15504b >= 0) {
                    this.f15516h.a().g(e2.f15504b);
                    b(e2.f15504b, e2);
                }
            }
            if (c1VarA == null) {
                this.f15518j.set(false);
                return;
            }
            try {
                if (c1VarA instanceof i0) {
                    this.f15511c.a((i0) c1VarA);
                } else if (c1VarA instanceof b2) {
                    this.f15512d.a((b2) c1VarA);
                } else if (c1VarA instanceof m1) {
                    this.f15513e.a((m1) c1VarA);
                } else if (c1VarA instanceof p1) {
                    this.f15514f.a((p1) c1VarA);
                } else if (c1VarA instanceof v1) {
                    this.f15515g.a((v1) c1VarA);
                } else {
                    f15509a.b("Unknown task type: %s", c1VarA.getClass().getName());
                }
            } catch (Exception e3) {
                f15509a.b("Error during extraction task: %s", e3.getMessage());
                this.f15516h.a().g(c1VarA.f15381a);
                b(c1VarA.f15381a, e3);
            }
        }
    }

    public final void b(int i2, Exception exc) {
        try {
            this.f15510b.o(i2);
            this.f15510b.g(i2);
        } catch (k0 unused) {
            f15509a.b("Error during error handling: %s", exc.getMessage());
        }
    }
}
