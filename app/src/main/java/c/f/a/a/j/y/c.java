package c.f.a.a.j.y;

import c.f.a.a.j.m;
import c.f.a.a.j.r;
import c.f.a.a.j.y.j.s;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f6239a = Logger.getLogger(r.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f6240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f6241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.a.j.u.e f6242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.a.j.y.k.c f6243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.a.j.z.b f6244f;

    public c(Executor executor, c.f.a.a.j.u.e eVar, s sVar, c.f.a.a.j.y.k.c cVar, c.f.a.a.j.z.b bVar) {
        this.f6241c = executor;
        this.f6242d = eVar;
        this.f6240b = sVar;
        this.f6243e = cVar;
        this.f6244f = bVar;
    }

    public static /* synthetic */ Object b(c cVar, m mVar, c.f.a.a.j.h hVar) {
        cVar.f6243e.h0(mVar, hVar);
        cVar.f6240b.a(mVar, 1);
        return null;
    }

    public static /* synthetic */ void c(c cVar, m mVar, c.f.a.a.h hVar, c.f.a.a.j.h hVar2) {
        try {
            c.f.a.a.j.u.m mVar2 = cVar.f6242d.get(mVar.b());
            if (mVar2 != null) {
                cVar.f6244f.d(b.a(cVar, mVar, mVar2.b(hVar2)));
                hVar.a(null);
            } else {
                String str = String.format("Transport backend '%s' is not registered", mVar.b());
                f6239a.warning(str);
                hVar.a(new IllegalArgumentException(str));
            }
        } catch (Exception e2) {
            f6239a.warning("Error scheduling event " + e2.getMessage());
            hVar.a(e2);
        }
    }

    @Override // c.f.a.a.j.y.e
    public void a(m mVar, c.f.a.a.j.h hVar, c.f.a.a.h hVar2) {
        this.f6241c.execute(a.a(this, mVar, hVar2, hVar));
    }
}
