package c.f.a.e.a.b;

import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f15605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.e.a.e.z<s2> f15606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f15607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.e.a.e.z<Executor> f15608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o0 f15609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.e.a.c.b f15610f;

    public s1(v vVar, c.f.a.e.a.e.z<s2> zVar, a1 a1Var, c.f.a.e.a.e.z<Executor> zVar2, o0 o0Var, c.f.a.e.a.c.b bVar) {
        this.f15605a = vVar;
        this.f15606b = zVar;
        this.f15607c = a1Var;
        this.f15608d = zVar2;
        this.f15609e = o0Var;
        this.f15610f = bVar;
    }

    public final void a(final p1 p1Var) {
        Executor executorA;
        Runnable runnableA;
        File fileX = this.f15605a.x(p1Var.f15382b, p1Var.f15574c, p1Var.f15575d);
        File fileD = this.f15605a.D(p1Var.f15382b, p1Var.f15574c, p1Var.f15575d);
        if (!fileX.exists() || !fileD.exists()) {
            throw new k0(String.format("Cannot find pack files to move for pack %s.", p1Var.f15382b), p1Var.f15381a);
        }
        File fileT = this.f15605a.t(p1Var.f15382b, p1Var.f15574c, p1Var.f15575d);
        fileT.mkdirs();
        if (!fileX.renameTo(fileT)) {
            throw new k0("Cannot move merged pack files to final location.", p1Var.f15381a);
        }
        new File(this.f15605a.t(p1Var.f15382b, p1Var.f15574c, p1Var.f15575d), "merge.tmp").delete();
        File fileU = this.f15605a.u(p1Var.f15382b, p1Var.f15574c, p1Var.f15575d);
        fileU.mkdirs();
        if (!fileD.renameTo(fileU)) {
            throw new k0("Cannot move metadata files to final location.", p1Var.f15381a);
        }
        if (this.f15610f.a()) {
            executorA = this.f15608d.a();
            runnableA = new Runnable(this, p1Var) { // from class: c.f.a.e.a.b.q1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final s1 f15583b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final p1 f15584c;

                {
                    this.f15583b = this;
                    this.f15584c = p1Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f15583b.b(this.f15584c);
                }
            };
        } else {
            executorA = this.f15608d.a();
            v vVar = this.f15605a;
            vVar.getClass();
            runnableA = r1.a(vVar);
        }
        executorA.execute(runnableA);
        this.f15607c.f(p1Var.f15382b, p1Var.f15574c, p1Var.f15575d);
        this.f15609e.a(p1Var.f15382b);
        this.f15606b.a().b(p1Var.f15381a, p1Var.f15382b);
    }

    public final /* synthetic */ void b(p1 p1Var) {
        this.f15605a.E(p1Var.f15382b, p1Var.f15574c, p1Var.f15575d);
    }
}
