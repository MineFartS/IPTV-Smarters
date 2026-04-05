package c.f.a.a.j.y.j;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f6307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.a.j.y.k.c f6308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f6309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.a.j.z.b f6310d;

    public q(Executor executor, c.f.a.a.j.y.k.c cVar, s sVar, c.f.a.a.j.z.b bVar) {
        this.f6307a = executor;
        this.f6308b = cVar;
        this.f6309c = sVar;
        this.f6310d = bVar;
    }

    public static /* synthetic */ Object b(q qVar) {
        Iterator<c.f.a.a.j.m> it = qVar.f6308b.K().iterator();
        while (it.hasNext()) {
            qVar.f6309c.a(it.next(), 1);
        }
        return null;
    }

    public void a() {
        this.f6307a.execute(o.a(this));
    }
}
