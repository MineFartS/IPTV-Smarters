package c.f.a.e.a.b;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.e.a.e.a f15452a = new c.f.a.e.a.e.a("AssetPackManager");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f15453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.e.a.e.z<s2> f15454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f15455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.e.a.h.a f15456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a1 f15457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o0 f15458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0 f15459h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c.f.a.e.a.e.z<Executor> f15460i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c.f.a.e.a.c.b f15461j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Handler f15462k = new Handler(Looper.getMainLooper());

    public h2(v vVar, c.f.a.e.a.e.z<s2> zVar, s sVar, c.f.a.e.a.h.a aVar, a1 a1Var, o0 o0Var, e0 e0Var, c.f.a.e.a.e.z<Executor> zVar2, c.f.a.e.a.c.b bVar) {
        this.f15453b = vVar;
        this.f15454c = zVar;
        this.f15455d = sVar;
        this.f15456e = aVar;
        this.f15457f = a1Var;
        this.f15458g = o0Var;
        this.f15459h = e0Var;
        this.f15460i = zVar2;
        this.f15461j = bVar;
    }

    public final void a(boolean z) {
        boolean zE = this.f15455d.e();
        this.f15455d.c(z);
        if (!z || zE) {
            return;
        }
        e();
    }

    public final /* synthetic */ void b() {
        this.f15453b.I();
        this.f15453b.F();
        this.f15453b.J();
    }

    public final /* synthetic */ void c() {
        c.f.a.e.a.i.d<List<String>> dVarD = this.f15454c.a().d(this.f15453b.q());
        Executor executorA = this.f15460i.a();
        v vVar = this.f15453b;
        vVar.getClass();
        dVarD.b(executorA, f2.b(vVar));
        dVarD.a(this.f15460i.a(), g2.f15428a);
    }

    public final void e() {
        final byte[] bArr = null;
        this.f15460i.a().execute(new Runnable(this, bArr) { // from class: c.f.a.e.a.b.e2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final h2 f15411b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f15412c = 1;

            {
                this.f15411b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (this.f15412c != 0) {
                    this.f15411b.c();
                } else {
                    this.f15411b.b();
                }
            }
        });
    }
}
