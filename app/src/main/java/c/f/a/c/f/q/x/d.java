package c.f.a.c.f.q.x;

import android.content.Context;
import c.f.a.c.f.o.a;
import c.f.a.c.f.o.e;
import c.f.a.c.f.o.n.p;
import c.f.a.c.f.o.n.r;
import c.f.a.c.f.q.s;
import c.f.a.c.f.q.u;
import c.f.a.c.f.q.v;
import c.f.a.c.o.i;
import c.f.a.c.o.j;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends c.f.a.c.f.o.e<v> implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.g<e> f12674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.AbstractC0156a<e, v> f12675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c.f.a.c.f.o.a<v> f12676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f12677d = 0;

    static {
        a.g<e> gVar = new a.g<>();
        f12674a = gVar;
        c cVar = new c();
        f12675b = cVar;
        f12676c = new c.f.a.c.f.o.a<>("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, v vVar) {
        super(context, f12676c, vVar, e.a.f12357a);
    }

    @Override // c.f.a.c.f.q.u
    public final i<Void> a(final s sVar) {
        r.a aVarA = r.a();
        aVarA.d(c.f.a.c.j.b.d.f12757a);
        aVarA.c(false);
        aVarA.b(new p(sVar) { // from class: c.f.a.c.f.q.x.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final s f12673a;

            {
                this.f12673a = sVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // c.f.a.c.f.o.n.p
            public final void accept(Object obj, Object obj2) {
                s sVar2 = this.f12673a;
                int i2 = d.f12677d;
                ((a) ((e) obj).getService()).K2(sVar2);
                ((j) obj2).c(null);
            }
        });
        return doBestEffortWrite(aVarA.a());
    }
}
