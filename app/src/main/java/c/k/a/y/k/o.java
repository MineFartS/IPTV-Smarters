package c.k.a.y.k;

import c.k.a.r;
import c.k.a.y.k.b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f18542b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), c.k.a.y.h.r("OkHttp SpdyConnection", true));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f18543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.k.a.y.k.i f18545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<Integer, p> f18546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f18547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18551k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ExecutorService f18552l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Map<Integer, k> f18553m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f18554n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f18555o;
    public long p;
    public long q;
    public final m r;
    public final m s;
    public boolean t;
    public final q u;
    public final Socket v;
    public final c.k.a.y.k.c w;
    public final i x;
    public final Set<Integer> y;

    public class a extends c.k.a.y.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f18556c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c.k.a.y.k.a f18557d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i2, c.k.a.y.k.a aVar) {
            super(str, objArr);
            this.f18556c = i2;
            this.f18557d = aVar;
        }

        @Override // c.k.a.y.d
        public void k() {
            try {
                o.this.V0(this.f18556c, this.f18557d);
            } catch (IOException unused) {
            }
        }
    }

    public class b extends c.k.a.y.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f18559c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f18560d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i2, long j2) {
            super(str, objArr);
            this.f18559c = i2;
            this.f18560d = j2;
        }

        @Override // c.k.a.y.d
        public void k() {
            try {
                o.this.w.a(this.f18559c, this.f18560d);
            } catch (IOException unused) {
            }
        }
    }

    public class c extends c.k.a.y.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f18562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f18563d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f18564e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ k f18565f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Object[] objArr, boolean z, int i2, int i3, k kVar) {
            super(str, objArr);
            this.f18562c = z;
            this.f18563d = i2;
            this.f18564e = i3;
            this.f18565f = kVar;
        }

        @Override // c.k.a.y.d
        public void k() {
            try {
                o.this.T0(this.f18562c, this.f18563d, this.f18564e, this.f18565f);
            } catch (IOException unused) {
            }
        }
    }

    public class d extends c.k.a.y.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f18567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f18568d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, int i2, List list) {
            super(str, objArr);
            this.f18567c = i2;
            this.f18568d = list;
        }

        @Override // c.k.a.y.d
        public void k() {
            if (o.this.f18554n.a(this.f18567c, this.f18568d)) {
                try {
                    o.this.w.e(this.f18567c, c.k.a.y.k.a.CANCEL);
                    synchronized (o.this) {
                        o.this.y.remove(Integer.valueOf(this.f18567c));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    public class e extends c.k.a.y.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f18570c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f18571d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f18572e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, int i2, List list, boolean z) {
            super(str, objArr);
            this.f18570c = i2;
            this.f18571d = list;
            this.f18572e = z;
        }

        @Override // c.k.a.y.d
        public void k() {
            boolean zB = o.this.f18554n.b(this.f18570c, this.f18571d, this.f18572e);
            if (zB) {
                try {
                    o.this.w.e(this.f18570c, c.k.a.y.k.a.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (zB || this.f18572e) {
                synchronized (o.this) {
                    o.this.y.remove(Integer.valueOf(this.f18570c));
                }
            }
        }
    }

    public class f extends c.k.a.y.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f18574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l.c f18575d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f18576e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f18577f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object[] objArr, int i2, l.c cVar, int i3, boolean z) {
            super(str, objArr);
            this.f18574c = i2;
            this.f18575d = cVar;
            this.f18576e = i3;
            this.f18577f = z;
        }

        @Override // c.k.a.y.d
        public void k() {
            try {
                boolean zC = o.this.f18554n.c(this.f18574c, this.f18575d, this.f18576e, this.f18577f);
                if (zC) {
                    o.this.w.e(this.f18574c, c.k.a.y.k.a.CANCEL);
                }
                if (zC || this.f18577f) {
                    synchronized (o.this) {
                        o.this.y.remove(Integer.valueOf(this.f18574c));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    public class g extends c.k.a.y.d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f18579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c.k.a.y.k.a f18580d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Object[] objArr, int i2, c.k.a.y.k.a aVar) {
            super(str, objArr);
            this.f18579c = i2;
            this.f18580d = aVar;
        }

        @Override // c.k.a.y.d
        public void k() {
            o.this.f18554n.d(this.f18579c, this.f18580d);
            synchronized (o.this) {
                o.this.y.remove(Integer.valueOf(this.f18579c));
            }
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Socket f18583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c.k.a.y.k.i f18584c = c.k.a.y.k.i.f18519a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public r f18585d = r.SPDY_3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public l f18586e = l.f18528a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f18587f;

        public h(String str, boolean z, Socket socket) {
            this.f18582a = str;
            this.f18587f = z;
            this.f18583b = socket;
        }

        public o g() {
            return new o(this, null);
        }

        public h h(r rVar) {
            this.f18585d = rVar;
            return this;
        }
    }

    public class i extends c.k.a.y.d implements b.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c.k.a.y.k.b f18588c;

        public class a extends c.k.a.y.d {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f18590c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Object[] objArr, p pVar) {
                super(str, objArr);
                this.f18590c = pVar;
            }

            @Override // c.k.a.y.d
            public void k() {
                try {
                    o.this.f18545e.a(this.f18590c);
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        public class b extends c.k.a.y.d {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f18592c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object[] objArr, m mVar) {
                super(str, objArr);
                this.f18592c = mVar;
            }

            @Override // c.k.a.y.d
            public void k() {
                try {
                    o.this.w.M(this.f18592c);
                } catch (IOException unused) {
                }
            }
        }

        public i() {
            super("OkHttp %s", o.this.f18547g);
        }

        public /* synthetic */ i(o oVar, a aVar) {
            this();
        }

        @Override // c.k.a.y.k.b.a
        public void a(int i2, long j2) {
            o oVar = o.this;
            if (i2 == 0) {
                synchronized (oVar) {
                    o oVar2 = o.this;
                    oVar2.q += j2;
                    oVar2.notifyAll();
                }
                return;
            }
            p pVarE0 = oVar.E0(i2);
            if (pVarE0 != null) {
                synchronized (pVarE0) {
                    pVarE0.i(j2);
                }
            }
        }

        @Override // c.k.a.y.k.b.a
        public void b(boolean z, int i2, int i3) {
            if (!z) {
                o.this.U0(true, i2, i3, null);
                return;
            }
            k kVarN0 = o.this.N0(i2);
            if (kVarN0 != null) {
                kVarN0.b();
            }
        }

        @Override // c.k.a.y.k.b.a
        public void c(int i2, int i3, List<c.k.a.y.k.d> list) {
            o.this.K0(i3, list);
        }

        @Override // c.k.a.y.k.b.a
        public void d() {
        }

        @Override // c.k.a.y.k.b.a
        public void e(int i2, c.k.a.y.k.a aVar) {
            if (o.this.M0(i2)) {
                o.this.L0(i2, aVar);
                return;
            }
            p pVarO0 = o.this.O0(i2);
            if (pVarO0 != null) {
                pVarO0.y(aVar);
            }
        }

        @Override // c.k.a.y.k.b.a
        public void f(boolean z, int i2, l.e eVar, int i3) throws IOException {
            if (o.this.M0(i2)) {
                o.this.I0(i2, eVar, i3, z);
                return;
            }
            p pVarE0 = o.this.E0(i2);
            if (pVarE0 == null) {
                o.this.W0(i2, c.k.a.y.k.a.INVALID_STREAM);
                eVar.Z(i3);
            } else {
                pVarE0.v(eVar, i3);
                if (z) {
                    pVarE0.w();
                }
            }
        }

        @Override // c.k.a.y.k.b.a
        public void g(int i2, int i3, int i4, boolean z) {
        }

        @Override // c.k.a.y.k.b.a
        public void h(boolean z, m mVar) {
            p[] pVarArr;
            long j2;
            synchronized (o.this) {
                int iE = o.this.s.e(65536);
                if (z) {
                    o.this.s.a();
                }
                o.this.s.i(mVar);
                if (o.this.D0() == r.HTTP_2) {
                    l(mVar);
                }
                int iE2 = o.this.s.e(65536);
                pVarArr = null;
                if (iE2 == -1 || iE2 == iE) {
                    j2 = 0;
                } else {
                    j2 = iE2 - iE;
                    if (!o.this.t) {
                        o.this.A0(j2);
                        o.this.t = true;
                    }
                    if (!o.this.f18546f.isEmpty()) {
                        pVarArr = (p[]) o.this.f18546f.values().toArray(new p[o.this.f18546f.size()]);
                    }
                }
            }
            if (pVarArr == null || j2 == 0) {
                return;
            }
            for (p pVar : pVarArr) {
                synchronized (pVar) {
                    pVar.i(j2);
                }
            }
        }

        @Override // c.k.a.y.k.b.a
        public void i(boolean z, boolean z2, int i2, int i3, List<c.k.a.y.k.d> list, c.k.a.y.k.e eVar) {
            if (o.this.M0(i2)) {
                o.this.J0(i2, list, z2);
                return;
            }
            synchronized (o.this) {
                if (o.this.f18550j) {
                    return;
                }
                p pVarE0 = o.this.E0(i2);
                if (pVarE0 != null) {
                    if (eVar.failIfStreamPresent()) {
                        pVarE0.n(c.k.a.y.k.a.PROTOCOL_ERROR);
                        o.this.O0(i2);
                        return;
                    } else {
                        pVarE0.x(list, eVar);
                        if (z2) {
                            pVarE0.w();
                            return;
                        }
                        return;
                    }
                }
                if (eVar.failIfStreamAbsent()) {
                    o.this.W0(i2, c.k.a.y.k.a.INVALID_STREAM);
                    return;
                }
                if (i2 <= o.this.f18548h) {
                    return;
                }
                if (i2 % 2 == o.this.f18549i % 2) {
                    return;
                }
                p pVar = new p(i2, o.this, z, z2, list);
                o.this.f18548h = i2;
                o.this.f18546f.put(Integer.valueOf(i2), pVar);
                o.f18542b.submit(new a("OkHttp %s stream %d", new Object[]{o.this.f18547g, Integer.valueOf(i2)}, pVar));
            }
        }

        @Override // c.k.a.y.k.b.a
        public void j(int i2, c.k.a.y.k.a aVar, l.f fVar) {
            p[] pVarArr;
            fVar.size();
            synchronized (o.this) {
                pVarArr = (p[]) o.this.f18546f.values().toArray(new p[o.this.f18546f.size()]);
                o.this.f18550j = true;
            }
            for (p pVar : pVarArr) {
                if (pVar.o() > i2 && pVar.s()) {
                    pVar.y(c.k.a.y.k.a.REFUSED_STREAM);
                    o.this.O0(pVar.o());
                }
            }
        }

        @Override // c.k.a.y.d
        public void k() throws Throwable {
            c.k.a.y.k.a aVar;
            c.k.a.y.k.a aVar2;
            c.k.a.y.k.a aVar3 = c.k.a.y.k.a.INTERNAL_ERROR;
            try {
                try {
                    o oVar = o.this;
                    c.k.a.y.k.b bVarA = oVar.u.a(l.m.c(l.m.l(oVar.v)), o.this.f18544d);
                    this.f18588c = bVarA;
                    if (!o.this.f18544d) {
                        bVarA.a0();
                    }
                    while (this.f18588c.f0(this)) {
                    }
                    aVar2 = c.k.a.y.k.a.NO_ERROR;
                } catch (IOException unused) {
                    aVar2 = aVar3;
                } catch (Throwable th) {
                    th = th;
                    aVar = aVar3;
                    try {
                        o.this.B0(aVar, aVar3);
                    } catch (IOException unused2) {
                    }
                    c.k.a.y.h.c(this.f18588c);
                    throw th;
                }
                try {
                    try {
                        o.this.B0(aVar2, c.k.a.y.k.a.CANCEL);
                    } catch (Throwable th2) {
                        aVar = aVar2;
                        th = th2;
                        o.this.B0(aVar, aVar3);
                        c.k.a.y.h.c(this.f18588c);
                        throw th;
                    }
                } catch (IOException unused3) {
                    c.k.a.y.k.a aVar4 = c.k.a.y.k.a.PROTOCOL_ERROR;
                    o.this.B0(aVar4, aVar4);
                }
            } catch (IOException unused4) {
            }
            c.k.a.y.h.c(this.f18588c);
        }

        public final void l(m mVar) {
            o.f18542b.submit(new b("OkHttp %s ACK Settings", new Object[]{o.this.f18547g}, mVar));
        }
    }

    public o(h hVar) {
        this.f18546f = new HashMap();
        this.f18551k = System.nanoTime();
        this.p = 0L;
        m mVar = new m();
        this.r = mVar;
        m mVar2 = new m();
        this.s = mVar2;
        this.t = false;
        this.y = new LinkedHashSet();
        r rVar = hVar.f18585d;
        this.f18543c = rVar;
        this.f18554n = hVar.f18586e;
        boolean z = hVar.f18587f;
        this.f18544d = z;
        this.f18545e = hVar.f18584c;
        this.f18549i = hVar.f18587f ? 1 : 2;
        if (hVar.f18587f && rVar == r.HTTP_2) {
            this.f18549i += 2;
        }
        this.f18555o = hVar.f18587f ? 1 : 2;
        if (hVar.f18587f) {
            mVar.k(7, 0, 16777216);
        }
        String str = hVar.f18582a;
        this.f18547g = str;
        a aVar = null;
        if (rVar == r.HTTP_2) {
            this.u = new c.k.a.y.k.g();
            this.f18552l = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), c.k.a.y.h.r(String.format("OkHttp %s Push Observer", str), true));
            mVar2.k(7, 0, 65535);
            mVar2.k(5, 0, 16384);
        } else {
            if (rVar != r.SPDY_3) {
                throw new AssertionError(rVar);
            }
            this.u = new n();
            this.f18552l = null;
        }
        this.q = mVar2.e(65536);
        this.v = hVar.f18583b;
        this.w = this.u.b(l.m.b(l.m.h(hVar.f18583b)), z);
        i iVar = new i(this, aVar);
        this.x = iVar;
        new Thread(iVar).start();
    }

    public /* synthetic */ o(h hVar, a aVar) {
        this(hVar);
    }

    public void A0(long j2) {
        this.q += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    public final void B0(c.k.a.y.k.a aVar, c.k.a.y.k.a aVar2) throws IOException {
        int i2;
        p[] pVarArr;
        k[] kVarArr = null;
        try {
            R0(aVar);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            if (this.f18546f.isEmpty()) {
                pVarArr = null;
            } else {
                pVarArr = (p[]) this.f18546f.values().toArray(new p[this.f18546f.size()]);
                this.f18546f.clear();
                Q0(false);
            }
            Map<Integer, k> map = this.f18553m;
            if (map != null) {
                k[] kVarArr2 = (k[]) map.values().toArray(new k[this.f18553m.size()]);
                this.f18553m = null;
                kVarArr = kVarArr2;
            }
        }
        if (pVarArr != null) {
            for (p pVar : pVarArr) {
                try {
                    pVar.l(aVar2);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        if (kVarArr != null) {
            for (k kVar : kVarArr) {
                kVar.a();
            }
        }
        try {
            this.w.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.v.close();
        } catch (IOException e5) {
            e = e5;
        }
        if (e != null) {
            throw e;
        }
    }

    public synchronized long C0() {
        return this.f18551k;
    }

    public r D0() {
        return this.f18543c;
    }

    public synchronized p E0(int i2) {
        return this.f18546f.get(Integer.valueOf(i2));
    }

    public synchronized boolean F0() {
        return this.f18551k != Long.MAX_VALUE;
    }

    public final p G0(int i2, List<c.k.a.y.k.d> list, boolean z, boolean z2) {
        int i3;
        p pVar;
        boolean z3 = !z;
        boolean z4 = !z2;
        synchronized (this.w) {
            synchronized (this) {
                if (this.f18550j) {
                    throw new IOException("shutdown");
                }
                i3 = this.f18549i;
                this.f18549i = i3 + 2;
                pVar = new p(i3, this, z3, z4, list);
                if (pVar.t()) {
                    this.f18546f.put(Integer.valueOf(i3), pVar);
                    Q0(false);
                }
            }
            if (i2 == 0) {
                this.w.u0(z3, z4, i3, i2, list);
            } else {
                if (this.f18544d) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                }
                this.w.c(i2, i3, list);
            }
        }
        if (!z) {
            this.w.flush();
        }
        return pVar;
    }

    public p H0(List<c.k.a.y.k.d> list, boolean z, boolean z2) {
        return G0(0, list, z, z2);
    }

    public final void I0(int i2, l.e eVar, int i3, boolean z) throws IOException {
        l.c cVar = new l.c();
        long j2 = i3;
        eVar.v0(j2);
        eVar.k(cVar, j2);
        if (cVar.H0() == j2) {
            this.f18552l.submit(new f("OkHttp %s Push Data[%s]", new Object[]{this.f18547g, Integer.valueOf(i2)}, i2, cVar, i3, z));
            return;
        }
        throw new IOException(cVar.H0() + " != " + i3);
    }

    public final void J0(int i2, List<c.k.a.y.k.d> list, boolean z) {
        this.f18552l.submit(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f18547g, Integer.valueOf(i2)}, i2, list, z));
    }

    public final void K0(int i2, List<c.k.a.y.k.d> list) {
        synchronized (this) {
            if (this.y.contains(Integer.valueOf(i2))) {
                W0(i2, c.k.a.y.k.a.PROTOCOL_ERROR);
            } else {
                this.y.add(Integer.valueOf(i2));
                this.f18552l.submit(new d("OkHttp %s Push Request[%s]", new Object[]{this.f18547g, Integer.valueOf(i2)}, i2, list));
            }
        }
    }

    public final void L0(int i2, c.k.a.y.k.a aVar) {
        this.f18552l.submit(new g("OkHttp %s Push Reset[%s]", new Object[]{this.f18547g, Integer.valueOf(i2)}, i2, aVar));
    }

    public final boolean M0(int i2) {
        return this.f18543c == r.HTTP_2 && i2 != 0 && (i2 & 1) == 0;
    }

    public final synchronized k N0(int i2) {
        Map<Integer, k> map;
        map = this.f18553m;
        return map != null ? map.remove(Integer.valueOf(i2)) : null;
    }

    public synchronized p O0(int i2) {
        p pVarRemove;
        pVarRemove = this.f18546f.remove(Integer.valueOf(i2));
        if (pVarRemove != null && this.f18546f.isEmpty()) {
            Q0(true);
        }
        return pVarRemove;
    }

    public void P0() {
        this.w.J();
        this.w.n0(this.r);
        if (this.r.e(65536) != 65536) {
            this.w.a(0, r0 - 65536);
        }
    }

    public final synchronized void Q0(boolean z) {
        long jNanoTime;
        if (z) {
            try {
                jNanoTime = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            jNanoTime = Long.MAX_VALUE;
        }
        this.f18551k = jNanoTime;
    }

    public void R0(c.k.a.y.k.a aVar) {
        synchronized (this.w) {
            synchronized (this) {
                if (this.f18550j) {
                    return;
                }
                this.f18550j = true;
                this.w.O(this.f18548h, aVar, c.k.a.y.h.f18364a);
            }
        }
    }

    public void S0(int i2, boolean z, l.c cVar, long j2) {
        long j3;
        int iMin;
        long j4;
        if (j2 == 0) {
            this.w.L(z, i2, cVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j3 = this.q;
                        if (j3 > 0) {
                            break;
                        } else {
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j2, j3), this.w.t0());
                j4 = iMin;
                this.q -= j4;
            }
            j2 -= j4;
            this.w.L(z && j2 == 0, i2, cVar, iMin);
        }
    }

    public final void T0(boolean z, int i2, int i3, k kVar) {
        synchronized (this.w) {
            if (kVar != null) {
                kVar.c();
                this.w.b(z, i2, i3);
            } else {
                this.w.b(z, i2, i3);
            }
        }
    }

    public final void U0(boolean z, int i2, int i3, k kVar) {
        f18542b.submit(new c("OkHttp %s ping %08x%08x", new Object[]{this.f18547g, Integer.valueOf(i2), Integer.valueOf(i3)}, z, i2, i3, kVar));
    }

    public void V0(int i2, c.k.a.y.k.a aVar) {
        this.w.e(i2, aVar);
    }

    public void W0(int i2, c.k.a.y.k.a aVar) {
        f18542b.submit(new a("OkHttp %s stream %d", new Object[]{this.f18547g, Integer.valueOf(i2)}, i2, aVar));
    }

    public void X0(int i2, long j2) {
        f18542b.submit(new b("OkHttp Window Update %s stream %d", new Object[]{this.f18547g, Integer.valueOf(i2)}, i2, j2));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        B0(c.k.a.y.k.a.NO_ERROR, c.k.a.y.k.a.CANCEL);
    }

    public void flush() {
        this.w.flush();
    }
}
