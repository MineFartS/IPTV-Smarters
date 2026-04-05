package k.g0.i;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.g0.i.h;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f30728b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), k.g0.c.x("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f30730d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f30732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f30735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ExecutorService f30736j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map<Integer, l> f30737k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m f30738l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f30739m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f30741o;
    public final n q;
    public boolean r;
    public final Socket s;
    public final k.g0.i.j t;
    public final j u;
    public final Set<Integer> v;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Integer, k.g0.i.i> f30731e = new LinkedHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f30740n = 0;
    public n p = new n();

    public class a extends k.g0.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k.g0.i.b f30743d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Object[] objArr, int i2, k.g0.i.b bVar) {
            super(str, objArr);
            this.f30742c = i2;
            this.f30743d = bVar;
        }

        @Override // k.g0.b
        public void k() {
            try {
                g.this.s0(this.f30742c, this.f30743d);
            } catch (IOException unused) {
            }
        }
    }

    public class b extends k.g0.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f30746d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Object[] objArr, int i2, long j2) {
            super(str, objArr);
            this.f30745c = i2;
            this.f30746d = j2;
        }

        @Override // k.g0.b
        public void k() {
            try {
                g.this.t.a(this.f30745c, this.f30746d);
            } catch (IOException unused) {
            }
        }
    }

    public class c extends k.g0.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f30748c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f30749d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f30750e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l f30751f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Object[] objArr, boolean z, int i2, int i3, l lVar) {
            super(str, objArr);
            this.f30748c = z;
            this.f30749d = i2;
            this.f30750e = i3;
            this.f30751f = lVar;
        }

        @Override // k.g0.b
        public void k() {
            try {
                g.this.V(this.f30748c, this.f30749d, this.f30750e, this.f30751f);
            } catch (IOException unused) {
            }
        }
    }

    public class d extends k.g0.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f30754d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, Object[] objArr, int i2, List list) {
            super(str, objArr);
            this.f30753c = i2;
            this.f30754d = list;
        }

        @Override // k.g0.b
        public void k() {
            if (g.this.f30738l.a(this.f30753c, this.f30754d)) {
                try {
                    g.this.t.o(this.f30753c, k.g0.i.b.CANCEL);
                    synchronized (g.this) {
                        g.this.v.remove(Integer.valueOf(this.f30753c));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    public class e extends k.g0.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List f30757d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f30758e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Object[] objArr, int i2, List list, boolean z) {
            super(str, objArr);
            this.f30756c = i2;
            this.f30757d = list;
            this.f30758e = z;
        }

        @Override // k.g0.b
        public void k() {
            boolean zB = g.this.f30738l.b(this.f30756c, this.f30757d, this.f30758e);
            if (zB) {
                try {
                    g.this.t.o(this.f30756c, k.g0.i.b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (zB || this.f30758e) {
                synchronized (g.this) {
                    g.this.v.remove(Integer.valueOf(this.f30756c));
                }
            }
        }
    }

    public class f extends k.g0.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30760c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l.c f30761d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f30762e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f30763f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Object[] objArr, int i2, l.c cVar, int i3, boolean z) {
            super(str, objArr);
            this.f30760c = i2;
            this.f30761d = cVar;
            this.f30762e = i3;
            this.f30763f = z;
        }

        @Override // k.g0.b
        public void k() {
            try {
                boolean zC = g.this.f30738l.c(this.f30760c, this.f30761d, this.f30762e, this.f30763f);
                if (zC) {
                    g.this.t.o(this.f30760c, k.g0.i.b.CANCEL);
                }
                if (zC || this.f30763f) {
                    synchronized (g.this) {
                        g.this.v.remove(Integer.valueOf(this.f30760c));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: k.g0.i.g$g, reason: collision with other inner class name */
    public class C0312g extends k.g0.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f30765c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k.g0.i.b f30766d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0312g(String str, Object[] objArr, int i2, k.g0.i.b bVar) {
            super(str, objArr);
            this.f30765c = i2;
            this.f30766d = bVar;
        }

        @Override // k.g0.b
        public void k() {
            g.this.f30738l.d(this.f30765c, this.f30766d);
            synchronized (g.this) {
                g.this.v.remove(Integer.valueOf(this.f30765c));
            }
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Socket f30768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f30769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public l.e f30770c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public l.d f30771d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public i f30772e = i.f30775a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public m f30773f = m.f30834a;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f30774g;

        public h(boolean z) {
            this.f30774g = z;
        }

        public g a() {
            return new g(this);
        }

        public h b(i iVar) {
            this.f30772e = iVar;
            return this;
        }

        public h c(Socket socket, String str, l.e eVar, l.d dVar) {
            this.f30768a = socket;
            this.f30769b = str;
            this.f30770c = eVar;
            this.f30771d = dVar;
            return this;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f30775a = new a();

        /* JADX INFO: loaded from: classes2.dex */
        public class a extends i {
            @Override // k.g0.i.g.i
            public void c(k.g0.i.i iVar) {
                iVar.d(k.g0.i.b.REFUSED_STREAM);
            }
        }

        public void b(g gVar) {
        }

        public abstract void c(k.g0.i.i iVar);
    }

    public class j extends k.g0.b implements h.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k.g0.i.h f30776c;

        public class a extends k.g0.b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k.g0.i.i f30778c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Object[] objArr, k.g0.i.i iVar) {
                super(str, objArr);
                this.f30778c = iVar;
            }

            @Override // k.g0.b
            public void k() {
                try {
                    g.this.f30730d.c(this.f30778c);
                } catch (IOException e2) {
                    k.g0.j.e.h().l(4, "Http2Connection.Listener failure for " + g.this.f30732f, e2);
                    try {
                        this.f30778c.d(k.g0.i.b.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        public class b extends k.g0.b {
            public b(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // k.g0.b
            public void k() {
                g gVar = g.this;
                gVar.f30730d.b(gVar);
            }
        }

        public class c extends k.g0.b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ n f30781c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, Object[] objArr, n nVar) {
                super(str, objArr);
                this.f30781c = nVar;
            }

            @Override // k.g0.b
            public void k() {
                try {
                    g.this.t.d(this.f30781c);
                } catch (IOException unused) {
                }
            }
        }

        public j(k.g0.i.h hVar) {
            super("OkHttp %s", g.this.f30732f);
            this.f30776c = hVar;
        }

        @Override // k.g0.i.h.b
        public void a(int i2, long j2) {
            g gVar = g.this;
            if (i2 == 0) {
                synchronized (gVar) {
                    g gVar2 = g.this;
                    gVar2.f30741o += j2;
                    gVar2.notifyAll();
                }
                return;
            }
            k.g0.i.i iVarL = gVar.l(i2);
            if (iVarL != null) {
                synchronized (iVarL) {
                    iVarL.a(j2);
                }
            }
        }

        @Override // k.g0.i.h.b
        public void b(boolean z, int i2, int i3) {
            if (!z) {
                g.this.c0(true, i2, i3, null);
                return;
            }
            l lVarV = g.this.v(i2);
            if (lVarV != null) {
                lVarV.b();
            }
        }

        @Override // k.g0.i.h.b
        public void c(int i2, int i3, List<k.g0.i.c> list) {
            g.this.s(i3, list);
        }

        @Override // k.g0.i.h.b
        public void d() {
        }

        @Override // k.g0.i.h.b
        public void e(boolean z, n nVar) {
            k.g0.i.i[] iVarArr;
            long j2;
            int i2;
            synchronized (g.this) {
                int iD = g.this.q.d();
                if (z) {
                    g.this.q.a();
                }
                g.this.q.h(nVar);
                l(nVar);
                int iD2 = g.this.q.d();
                iVarArr = null;
                if (iD2 == -1 || iD2 == iD) {
                    j2 = 0;
                } else {
                    j2 = iD2 - iD;
                    g gVar = g.this;
                    if (!gVar.r) {
                        gVar.d(j2);
                        g.this.r = true;
                    }
                    if (!g.this.f30731e.isEmpty()) {
                        iVarArr = (k.g0.i.i[]) g.this.f30731e.values().toArray(new k.g0.i.i[g.this.f30731e.size()]);
                    }
                }
                g.f30728b.execute(new b("OkHttp %s settings", g.this.f30732f));
            }
            if (iVarArr == null || j2 == 0) {
                return;
            }
            for (k.g0.i.i iVar : iVarArr) {
                synchronized (iVar) {
                    iVar.a(j2);
                }
            }
        }

        @Override // k.g0.i.h.b
        public void f(boolean z, int i2, l.e eVar, int i3) throws IOException {
            if (g.this.u(i2)) {
                g.this.q(i2, eVar, i3, z);
                return;
            }
            k.g0.i.i iVarL = g.this.l(i2);
            if (iVarL == null) {
                g.this.w0(i2, k.g0.i.b.PROTOCOL_ERROR);
                eVar.Z(i3);
            } else {
                iVarL.m(eVar, i3);
                if (z) {
                    iVarL.n();
                }
            }
        }

        @Override // k.g0.i.h.b
        public void g(int i2, int i3, int i4, boolean z) {
        }

        @Override // k.g0.i.h.b
        public void h(boolean z, int i2, int i3, List<k.g0.i.c> list) {
            if (g.this.u(i2)) {
                g.this.r(i2, list, z);
                return;
            }
            synchronized (g.this) {
                g gVar = g.this;
                if (gVar.f30735i) {
                    return;
                }
                k.g0.i.i iVarL = gVar.l(i2);
                if (iVarL != null) {
                    iVarL.o(list);
                    if (z) {
                        iVarL.n();
                        return;
                    }
                    return;
                }
                g gVar2 = g.this;
                if (i2 <= gVar2.f30733g) {
                    return;
                }
                if (i2 % 2 == gVar2.f30734h % 2) {
                    return;
                }
                k.g0.i.i iVar = new k.g0.i.i(i2, g.this, false, z, list);
                g gVar3 = g.this;
                gVar3.f30733g = i2;
                gVar3.f30731e.put(Integer.valueOf(i2), iVar);
                g.f30728b.execute(new a("OkHttp %s stream %d", new Object[]{g.this.f30732f, Integer.valueOf(i2)}, iVar));
            }
        }

        @Override // k.g0.i.h.b
        public void i(int i2, k.g0.i.b bVar) {
            if (g.this.u(i2)) {
                g.this.t(i2, bVar);
                return;
            }
            k.g0.i.i iVarW = g.this.w(i2);
            if (iVarW != null) {
                iVarW.p(bVar);
            }
        }

        @Override // k.g0.i.h.b
        public void j(int i2, k.g0.i.b bVar, l.f fVar) {
            k.g0.i.i[] iVarArr;
            fVar.size();
            synchronized (g.this) {
                iVarArr = (k.g0.i.i[]) g.this.f30731e.values().toArray(new k.g0.i.i[g.this.f30731e.size()]);
                g.this.f30735i = true;
            }
            for (k.g0.i.i iVar : iVarArr) {
                if (iVar.g() > i2 && iVar.j()) {
                    iVar.p(k.g0.i.b.REFUSED_STREAM);
                    g.this.w(iVar.g());
                }
            }
        }

        @Override // k.g0.b
        public void k() throws Throwable {
            k.g0.i.b bVar;
            k.g0.i.b bVar2 = k.g0.i.b.INTERNAL_ERROR;
            try {
                try {
                    this.f30776c.l(this);
                    while (this.f30776c.i(false, this)) {
                    }
                    bVar = k.g0.i.b.NO_ERROR;
                } catch (IOException unused) {
                    bVar = bVar2;
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar2;
                    try {
                        g.this.i(bVar, bVar2);
                    } catch (IOException unused2) {
                    }
                    k.g0.c.c(this.f30776c);
                    throw th;
                }
                try {
                    try {
                        g.this.i(bVar, k.g0.i.b.CANCEL);
                    } catch (Throwable th2) {
                        th = th2;
                        g.this.i(bVar, bVar2);
                        k.g0.c.c(this.f30776c);
                        throw th;
                    }
                } catch (IOException unused3) {
                    k.g0.i.b bVar3 = k.g0.i.b.PROTOCOL_ERROR;
                    g.this.i(bVar3, bVar3);
                }
            } catch (IOException unused4) {
            }
            k.g0.c.c(this.f30776c);
        }

        public final void l(n nVar) {
            g.f30728b.execute(new c("OkHttp %s ACK Settings", new Object[]{g.this.f30732f}, nVar));
        }
    }

    public g(h hVar) {
        n nVar = new n();
        this.q = nVar;
        this.r = false;
        this.v = new LinkedHashSet();
        this.f30738l = hVar.f30773f;
        boolean z = hVar.f30774g;
        this.f30729c = z;
        this.f30730d = hVar.f30772e;
        int i2 = z ? 1 : 2;
        this.f30734h = i2;
        if (z) {
            this.f30734h = i2 + 2;
        }
        this.f30739m = z ? 1 : 2;
        if (z) {
            this.p.i(7, 16777216);
        }
        String str = hVar.f30769b;
        this.f30732f = str;
        this.f30736j = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), k.g0.c.x(k.g0.c.l("OkHttp %s Push Observer", str), true));
        nVar.i(7, 65535);
        nVar.i(5, 16384);
        this.f30741o = nVar.d();
        this.s = hVar.f30768a;
        this.t = new k.g0.i.j(hVar.f30771d, z);
        this.u = new j(new k.g0.i.h(hVar.f30770c, z));
    }

    public void A0(int i2, long j2) {
        f30728b.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f30732f, Integer.valueOf(i2)}, i2, j2));
    }

    public void Q(boolean z) {
        if (z) {
            this.t.J();
            this.t.p(this.p);
            if (this.p.d() != 65535) {
                this.t.a(0, r6 - 65535);
            }
        }
        new Thread(this.u).start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.t.t0());
        r6 = r3;
        r8.f30741o -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void U(int r9, boolean r10, l.c r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            k.g0.i.j r12 = r8.t
            r12.L(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L60
            monitor-enter(r8)
        L12:
            long r3 = r8.f30741o     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L30
            java.util.Map<java.lang.Integer, k.g0.i.i> r3 = r8.f30731e     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            if (r3 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
        L30:
            long r3 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L56
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L56
            k.g0.i.j r3 = r8.t     // Catch: java.lang.Throwable -> L56
            int r3 = r3.t0()     // Catch: java.lang.Throwable -> L56
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L56
            long r4 = r8.f30741o     // Catch: java.lang.Throwable -> L56
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L56
            long r4 = r4 - r6
            r8.f30741o = r4     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            long r12 = r12 - r6
            k.g0.i.j r4 = r8.t
            if (r10 == 0) goto L51
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = 0
        L52:
            r4.L(r5, r9, r11, r3)
            goto Ld
        L56:
            r9 = move-exception
            goto L5e
        L58:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L56
            r9.<init>()     // Catch: java.lang.Throwable -> L56
            throw r9     // Catch: java.lang.Throwable -> L56
        L5e:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            throw r9
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.g0.i.g.U(int, boolean, l.c, long):void");
    }

    public void V(boolean z, int i2, int i3, l lVar) {
        synchronized (this.t) {
            if (lVar != null) {
                lVar.c();
                this.t.b(z, i2, i3);
            } else {
                this.t.b(z, i2, i3);
            }
        }
    }

    public void c0(boolean z, int i2, int i3, l lVar) {
        f30728b.execute(new c("OkHttp %s ping %08x%08x", new Object[]{this.f30732f, Integer.valueOf(i2), Integer.valueOf(i3)}, z, i2, i3, lVar));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        i(k.g0.i.b.NO_ERROR, k.g0.i.b.CANCEL);
    }

    public void d(long j2) {
        this.f30741o += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }

    public void flush() {
        this.t.flush();
    }

    public void i(k.g0.i.b bVar, k.g0.i.b bVar2) throws IOException {
        k.g0.i.i[] iVarArr;
        l[] lVarArr = null;
        try {
            x(bVar);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            if (this.f30731e.isEmpty()) {
                iVarArr = null;
            } else {
                iVarArr = (k.g0.i.i[]) this.f30731e.values().toArray(new k.g0.i.i[this.f30731e.size()]);
                this.f30731e.clear();
            }
            Map<Integer, l> map = this.f30737k;
            if (map != null) {
                l[] lVarArr2 = (l[]) map.values().toArray(new l[this.f30737k.size()]);
                this.f30737k = null;
                lVarArr = lVarArr2;
            }
        }
        if (iVarArr != null) {
            for (k.g0.i.i iVar : iVarArr) {
                try {
                    iVar.d(bVar2);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        if (lVarArr != null) {
            for (l lVar : lVarArr) {
                lVar.a();
            }
        }
        try {
            this.t.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.s.close();
        } catch (IOException e5) {
            e = e5;
        }
        if (e != null) {
            throw e;
        }
    }

    public synchronized k.g0.i.i l(int i2) {
        return this.f30731e.get(Integer.valueOf(i2));
    }

    public synchronized boolean m() {
        return this.f30735i;
    }

    public synchronized int n() {
        return this.q.e(Integer.MAX_VALUE);
    }

    public final k.g0.i.i o(int i2, List<k.g0.i.c> list, boolean z) {
        int i3;
        k.g0.i.i iVar;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.t) {
            synchronized (this) {
                if (this.f30735i) {
                    throw new k.g0.i.a();
                }
                i3 = this.f30734h;
                this.f30734h = i3 + 2;
                iVar = new k.g0.i.i(i3, this, z3, false, list);
                z2 = !z || this.f30741o == 0 || iVar.f30795b == 0;
                if (iVar.k()) {
                    this.f30731e.put(Integer.valueOf(i3), iVar);
                }
            }
            if (i2 == 0) {
                this.t.q(z3, i3, i2, list);
            } else {
                if (this.f30729c) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                }
                this.t.c(i2, i3, list);
            }
        }
        if (z2) {
            this.t.flush();
        }
        return iVar;
    }

    public k.g0.i.i p(List<k.g0.i.c> list, boolean z) {
        return o(0, list, z);
    }

    public void q(int i2, l.e eVar, int i3, boolean z) throws IOException {
        l.c cVar = new l.c();
        long j2 = i3;
        eVar.v0(j2);
        eVar.k(cVar, j2);
        if (cVar.H0() == j2) {
            this.f30736j.execute(new f("OkHttp %s Push Data[%s]", new Object[]{this.f30732f, Integer.valueOf(i2)}, i2, cVar, i3, z));
            return;
        }
        throw new IOException(cVar.H0() + " != " + i3);
    }

    public void r(int i2, List<k.g0.i.c> list, boolean z) {
        this.f30736j.execute(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f30732f, Integer.valueOf(i2)}, i2, list, z));
    }

    public void s(int i2, List<k.g0.i.c> list) {
        synchronized (this) {
            if (this.v.contains(Integer.valueOf(i2))) {
                w0(i2, k.g0.i.b.PROTOCOL_ERROR);
            } else {
                this.v.add(Integer.valueOf(i2));
                this.f30736j.execute(new d("OkHttp %s Push Request[%s]", new Object[]{this.f30732f, Integer.valueOf(i2)}, i2, list));
            }
        }
    }

    public void s0(int i2, k.g0.i.b bVar) {
        this.t.o(i2, bVar);
    }

    public void t(int i2, k.g0.i.b bVar) {
        this.f30736j.execute(new C0312g("OkHttp %s Push Reset[%s]", new Object[]{this.f30732f, Integer.valueOf(i2)}, i2, bVar));
    }

    public boolean u(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public synchronized l v(int i2) {
        Map<Integer, l> map;
        map = this.f30737k;
        return map != null ? map.remove(Integer.valueOf(i2)) : null;
    }

    public synchronized k.g0.i.i w(int i2) {
        k.g0.i.i iVarRemove;
        iVarRemove = this.f30731e.remove(Integer.valueOf(i2));
        notifyAll();
        return iVarRemove;
    }

    public void w0(int i2, k.g0.i.b bVar) {
        f30728b.execute(new a("OkHttp %s stream %d", new Object[]{this.f30732f, Integer.valueOf(i2)}, i2, bVar));
    }

    public void x(k.g0.i.b bVar) {
        synchronized (this.t) {
            synchronized (this) {
                if (this.f30735i) {
                    return;
                }
                this.f30735i = true;
                this.t.m(this.f30733g, bVar, k.g0.c.f30555a);
            }
        }
    }

    public void y() {
        Q(true);
    }
}
