package c.f.a.b.e3.e1;

import android.os.Handler;
import android.os.Message;
import c.f.a.b.e3.r0;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.l1;
import c.f.a.b.w1;
import c.f.a.b.z2.a0;
import c.f.a.b.z2.z;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.i3.f f7129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f7130c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.f.a.b.e3.e1.p.c f7134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f7135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7138k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TreeMap<Long, Long> f7133f = new TreeMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f7132e = x0.y(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.b.b3.j.b f7131d = new c.f.a.b.b3.j.b();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7140b;

        public a(long j2, long j3) {
            this.f7139a = j2;
            this.f7140b = j3;
        }
    }

    public interface b {
        void a();

        void b(long j2);
    }

    public final class c implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r0 f7141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l1 f7142b = new l1();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c.f.a.b.b3.e f7143c = new c.f.a.b.b3.e();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f7144d = -9223372036854775807L;

        public c(c.f.a.b.i3.f fVar) {
            this.f7141a = r0.k(fVar);
        }

        @Override // c.f.a.b.z2.a0
        public int a(c.f.a.b.i3.l lVar, int i2, boolean z, int i3) {
            return this.f7141a.b(lVar, i2, z);
        }

        @Override // c.f.a.b.z2.a0
        public /* synthetic */ int b(c.f.a.b.i3.l lVar, int i2, boolean z) {
            return z.a(this, lVar, i2, z);
        }

        @Override // c.f.a.b.z2.a0
        public /* synthetic */ void c(i0 i0Var, int i2) {
            z.b(this, i0Var, i2);
        }

        @Override // c.f.a.b.z2.a0
        public void d(long j2, int i2, int i3, int i4, a0.a aVar) {
            this.f7141a.d(j2, i2, i3, i4, aVar);
            l();
        }

        @Override // c.f.a.b.z2.a0
        public void e(k1 k1Var) {
            this.f7141a.e(k1Var);
        }

        @Override // c.f.a.b.z2.a0
        public void f(i0 i0Var, int i2, int i3) {
            this.f7141a.c(i0Var, i2);
        }

        public final c.f.a.b.b3.e g() {
            this.f7143c.clear();
            if (this.f7141a.R(this.f7142b, this.f7143c, 0, false) != -4) {
                return null;
            }
            this.f7143c.o();
            return this.f7143c;
        }

        public boolean h(long j2) {
            return o.this.j(j2);
        }

        public void i(c.f.a.b.e3.d1.f fVar) {
            long j2 = this.f7144d;
            if (j2 == -9223372036854775807L || fVar.f7029h > j2) {
                this.f7144d = fVar.f7029h;
            }
            o.this.m(fVar);
        }

        public boolean j(c.f.a.b.e3.d1.f fVar) {
            long j2 = this.f7144d;
            return o.this.n(j2 != -9223372036854775807L && j2 < fVar.f7028g);
        }

        public final void k(long j2, long j3) {
            o.this.f7132e.sendMessage(o.this.f7132e.obtainMessage(1, new a(j2, j3)));
        }

        public final void l() {
            while (this.f7141a.J(false)) {
                c.f.a.b.b3.e eVarG = g();
                if (eVarG != null) {
                    long j2 = eVarG.f10278e;
                    c.f.a.b.b3.a aVarA = o.this.f7131d.a(eVarG);
                    if (aVarA != null) {
                        c.f.a.b.b3.j.a aVar = (c.f.a.b.b3.j.a) aVarA.d(0);
                        if (o.h(aVar.f6528d, aVar.f6529e)) {
                            m(j2, aVar);
                        }
                    }
                }
            }
            this.f7141a.r();
        }

        public final void m(long j2, c.f.a.b.b3.j.a aVar) {
            long jF = o.f(aVar);
            if (jF == -9223372036854775807L) {
                return;
            }
            k(j2, jF);
        }

        public void n() {
            this.f7141a.S();
        }
    }

    public o(c.f.a.b.e3.e1.p.c cVar, b bVar, c.f.a.b.i3.f fVar) {
        this.f7134g = cVar;
        this.f7130c = bVar;
        this.f7129b = fVar;
    }

    public static long f(c.f.a.b.b3.j.a aVar) {
        try {
            return x0.I0(x0.E(aVar.f6532h));
        } catch (w1 unused) {
            return -9223372036854775807L;
        }
    }

    public static boolean h(String str, String str2) {
        return "urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2));
    }

    public final Map.Entry<Long, Long> e(long j2) {
        return this.f7133f.ceilingEntry(Long.valueOf(j2));
    }

    public final void g(long j2, long j3) {
        Long l2 = this.f7133f.get(Long.valueOf(j3));
        if (l2 != null && l2.longValue() <= j2) {
            return;
        }
        this.f7133f.put(Long.valueOf(j3), Long.valueOf(j2));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f7138k) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f7139a, aVar.f7140b);
        return true;
    }

    public final void i() {
        if (this.f7136i) {
            this.f7137j = true;
            this.f7136i = false;
            this.f7130c.a();
        }
    }

    public boolean j(long j2) {
        c.f.a.b.e3.e1.p.c cVar = this.f7134g;
        boolean z = false;
        if (!cVar.f7159d) {
            return false;
        }
        if (this.f7137j) {
            return true;
        }
        Map.Entry<Long, Long> entryE = e(cVar.f7163h);
        if (entryE != null && entryE.getValue().longValue() < j2) {
            this.f7135h = entryE.getKey().longValue();
            l();
            z = true;
        }
        if (z) {
            i();
        }
        return z;
    }

    public c k() {
        return new c(this.f7129b);
    }

    public final void l() {
        this.f7130c.b(this.f7135h);
    }

    public void m(c.f.a.b.e3.d1.f fVar) {
        this.f7136i = true;
    }

    public boolean n(boolean z) {
        if (!this.f7134g.f7159d) {
            return false;
        }
        if (this.f7137j) {
            return true;
        }
        if (!z) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.f7138k = true;
        this.f7132e.removeCallbacksAndMessages(null);
    }

    public final void p() {
        Iterator<Map.Entry<Long, Long>> it = this.f7133f.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f7134g.f7163h) {
                it.remove();
            }
        }
    }

    public void q(c.f.a.b.e3.e1.p.c cVar) {
        this.f7137j = false;
        this.f7135h = -9223372036854775807L;
        this.f7134g = cVar;
        p();
    }
}
