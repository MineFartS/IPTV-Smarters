package c.f.a.c.k.b;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c.f.a.c.j.h.y1 f14424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<Long> f14425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<c.f.a.c.j.h.q1> f14426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x9 f14428e;

    public /* synthetic */ w9(x9 x9Var, q9 q9Var) {
        this.f14428e = x9Var;
    }

    public static final long b(c.f.a.c.j.h.q1 q1Var) {
        return ((q1Var.B() / 1000) / 60) / 60;
    }

    public final boolean a(long j2, c.f.a.c.j.h.q1 q1Var) {
        c.f.a.c.f.q.o.i(q1Var);
        if (this.f14426c == null) {
            this.f14426c = new ArrayList();
        }
        if (this.f14425b == null) {
            this.f14425b = new ArrayList();
        }
        if (this.f14426c.size() > 0 && b(this.f14426c.get(0)) != b(q1Var)) {
            return false;
        }
        long jF = this.f14427d + ((long) q1Var.f());
        this.f14428e.W();
        if (jF >= Math.max(0, m3.f14100j.b(null).intValue())) {
            return false;
        }
        this.f14427d = jF;
        this.f14426c.add(q1Var);
        this.f14425b.add(Long.valueOf(j2));
        int size = this.f14426c.size();
        this.f14428e.W();
        return size < Math.max(1, m3.f14101k.b(null).intValue());
    }
}
