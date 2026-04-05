package c.f.a.b.c3;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import c.f.a.b.c3.c0;
import c.f.a.b.d3.e;
import c.f.a.b.i3.p;
import c.f.a.b.i3.p0.d;
import c.f.a.b.j3.x0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.b.d3.d f6799a = new c.f.a.b.d3.d(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f6801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f6802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f6803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e.c f6804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArraySet<d> f6805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6813o;
    public List<r> p;
    public c.f.a.b.d3.e q;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f6814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<r> f6816c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Exception f6817d;

        public b(r rVar, boolean z, List<r> list, Exception exc) {
            this.f6814a = rVar;
            this.f6815b = z;
            this.f6816c = list;
            this.f6817d = exc;
        }
    }

    public static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f6818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HandlerThread f6819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j0 f6820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d0 f6821d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Handler f6822e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ArrayList<r> f6823f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final HashMap<String, e> f6824g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f6825h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f6826i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6827j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f6828k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f6829l;

        public c(HandlerThread handlerThread, j0 j0Var, d0 d0Var, Handler handler, int i2, int i3, boolean z) {
            super(handlerThread.getLooper());
            this.f6819b = handlerThread;
            this.f6820c = j0Var;
            this.f6821d = d0Var;
            this.f6822e = handler;
            this.f6827j = i2;
            this.f6828k = i3;
            this.f6826i = z;
            this.f6823f = new ArrayList<>();
            this.f6824g = new HashMap<>();
        }

        public static int c(r rVar, r rVar2) {
            return x0.p(rVar.f6768c, rVar2.f6768c);
        }

        public static r d(r rVar, int i2, int i3) {
            return new r(rVar.f6766a, i2, rVar.f6768c, System.currentTimeMillis(), rVar.f6770e, i3, 0, rVar.f6773h);
        }

        public final void A(e eVar) {
            if (eVar != null) {
                c.f.a.b.j3.g.g(!eVar.f6833e);
                eVar.f(false);
            }
        }

        public final void B() {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f6823f.size(); i3++) {
                r rVar = this.f6823f.get(i3);
                e eVarY = this.f6824g.get(rVar.f6766a.f6663b);
                int i4 = rVar.f6767b;
                if (i4 == 0) {
                    eVarY = y(eVarY, rVar);
                } else if (i4 == 1) {
                    A(eVarY);
                } else if (i4 == 2) {
                    c.f.a.b.j3.g.e(eVarY);
                    x(eVarY, rVar, i2);
                } else {
                    if (i4 != 5 && i4 != 7) {
                        throw new IllegalStateException();
                    }
                    z(eVarY, rVar);
                }
                if (eVarY != null && !eVarY.f6833e) {
                    i2++;
                }
            }
        }

        public final void C() {
            for (int i2 = 0; i2 < this.f6823f.size(); i2++) {
                r rVar = this.f6823f.get(i2);
                if (rVar.f6767b == 2) {
                    try {
                        this.f6820c.f(rVar);
                    } catch (IOException e2) {
                        c.f.a.b.j3.z.e("DownloadManager", "Failed to update index.", e2);
                    }
                }
            }
            sendEmptyMessageDelayed(11, 5000L);
        }

        public final void a(a0 a0Var, int i2) {
            r rVarE = e(a0Var.f6663b, true);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (rVarE != null) {
                m(x.m(rVarE, a0Var, i2, jCurrentTimeMillis));
            } else {
                m(new r(a0Var, i2 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i2, 0));
            }
            B();
        }

        public final boolean b() {
            return !this.f6826i && this.f6825h == 0;
        }

        public final r e(String str, boolean z) {
            int iF = f(str);
            if (iF != -1) {
                return this.f6823f.get(iF);
            }
            if (!z) {
                return null;
            }
            try {
                return this.f6820c.e(str);
            } catch (IOException e2) {
                c.f.a.b.j3.z.e("DownloadManager", "Failed to load download: " + str, e2);
                return null;
            }
        }

        public final int f(String str) {
            for (int i2 = 0; i2 < this.f6823f.size(); i2++) {
                if (this.f6823f.get(i2).f6766a.f6663b.equals(str)) {
                    return i2;
                }
            }
            return -1;
        }

        public final void g(int i2) {
            this.f6825h = i2;
            t tVarA = null;
            try {
                try {
                    this.f6820c.d();
                    tVarA = this.f6820c.a(0, 1, 2, 5, 7);
                    while (tVarA.g0()) {
                        this.f6823f.add(tVarA.k0());
                    }
                } catch (IOException e2) {
                    c.f.a.b.j3.z.e("DownloadManager", "Failed to load index.", e2);
                    this.f6823f.clear();
                }
                x0.o(tVarA);
                this.f6822e.obtainMessage(0, new ArrayList(this.f6823f)).sendToTarget();
                B();
            } catch (Throwable th) {
                x0.o(tVarA);
                throw th;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = 0;
            switch (message.what) {
                case 0:
                    g(message.arg1);
                    i2 = 1;
                    this.f6822e.obtainMessage(1, i2, this.f6824g.size()).sendToTarget();
                    return;
                case 1:
                    r(message.arg1 != 0);
                    i2 = 1;
                    this.f6822e.obtainMessage(1, i2, this.f6824g.size()).sendToTarget();
                    return;
                case 2:
                    u(message.arg1);
                    i2 = 1;
                    this.f6822e.obtainMessage(1, i2, this.f6824g.size()).sendToTarget();
                    return;
                case 3:
                    w((String) message.obj, message.arg1);
                    i2 = 1;
                    this.f6822e.obtainMessage(1, i2, this.f6824g.size()).sendToTarget();
                    return;
                case 4:
                    s(message.arg1);
                    i2 = 1;
                    this.f6822e.obtainMessage(1, i2, this.f6824g.size()).sendToTarget();
                    return;
                case 5:
                    t(message.arg1);
                    i2 = 1;
                    this.f6822e.obtainMessage(1, i2, this.f6824g.size()).sendToTarget();
                    return;
                case 6:
                    a((a0) message.obj, message.arg1);
                    i2 = 1;
                    this.f6822e.obtainMessage(1, i2, this.f6824g.size()).sendToTarget();
                    return;
                case 7:
                    q((String) message.obj);
                    i2 = 1;
                    this.f6822e.obtainMessage(1, i2, this.f6824g.size()).sendToTarget();
                    return;
                case 8:
                    p();
                    i2 = 1;
                    this.f6822e.obtainMessage(1, i2, this.f6824g.size()).sendToTarget();
                    return;
                case 9:
                    l((e) message.obj);
                    this.f6822e.obtainMessage(1, i2, this.f6824g.size()).sendToTarget();
                    return;
                case 10:
                    i((e) message.obj, x0.c1(message.arg1, message.arg2));
                    return;
                case 11:
                    C();
                    return;
                case 12:
                    o();
                    return;
                default:
                    throw new IllegalStateException();
            }
        }

        public final void i(e eVar, long j2) {
            r rVar = (r) c.f.a.b.j3.g.e(e(eVar.f6830b.f6663b, false));
            if (j2 == rVar.f6770e || j2 == -1) {
                return;
            }
            m(new r(rVar.f6766a, rVar.f6767b, rVar.f6768c, System.currentTimeMillis(), j2, rVar.f6771f, rVar.f6772g, rVar.f6773h));
        }

        public final void j(r rVar, Exception exc) {
            r rVar2 = new r(rVar.f6766a, exc == null ? 3 : 4, rVar.f6768c, System.currentTimeMillis(), rVar.f6770e, rVar.f6771f, exc == null ? 0 : 1, rVar.f6773h);
            this.f6823f.remove(f(rVar2.f6766a.f6663b));
            try {
                this.f6820c.f(rVar2);
            } catch (IOException e2) {
                c.f.a.b.j3.z.e("DownloadManager", "Failed to update index.", e2);
            }
            this.f6822e.obtainMessage(2, new b(rVar2, false, new ArrayList(this.f6823f), exc)).sendToTarget();
        }

        public final void k(r rVar) {
            if (rVar.f6767b == 7) {
                int i2 = rVar.f6771f;
                n(rVar, i2 == 0 ? 0 : 1, i2);
                B();
            } else {
                this.f6823f.remove(f(rVar.f6766a.f6663b));
                try {
                    this.f6820c.g(rVar.f6766a.f6663b);
                } catch (IOException unused) {
                    c.f.a.b.j3.z.d("DownloadManager", "Failed to remove from database");
                }
                this.f6822e.obtainMessage(2, new b(rVar, true, new ArrayList(this.f6823f), null)).sendToTarget();
            }
        }

        public final void l(e eVar) {
            String str = eVar.f6830b.f6663b;
            this.f6824g.remove(str);
            boolean z = eVar.f6833e;
            if (!z) {
                int i2 = this.f6829l - 1;
                this.f6829l = i2;
                if (i2 == 0) {
                    removeMessages(11);
                }
            }
            if (eVar.f6836h) {
                B();
                return;
            }
            Exception exc = eVar.f6837i;
            if (exc != null) {
                c.f.a.b.j3.z.e("DownloadManager", "Task failed: " + eVar.f6830b + ", " + z, exc);
            }
            r rVar = (r) c.f.a.b.j3.g.e(e(str, false));
            int i3 = rVar.f6767b;
            if (i3 == 2) {
                c.f.a.b.j3.g.g(!z);
                j(rVar, exc);
            } else {
                if (i3 != 5 && i3 != 7) {
                    throw new IllegalStateException();
                }
                c.f.a.b.j3.g.g(z);
                k(rVar);
            }
            B();
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:7)(1:6)|8|(1:10)(8:12|(1:15)|16|(0)|25|19|23|24)|11|25|19|23|24) */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
        
            c.f.a.b.j3.z.e("DownloadManager", "Failed to update index.", r0);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final c.f.a.b.c3.r m(c.f.a.b.c3.r r9) {
            /*
                r8 = this;
                int r0 = r9.f6767b
                r1 = 1
                r2 = 0
                r3 = 3
                if (r0 == r3) goto Lc
                r3 = 4
                if (r0 == r3) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                c.f.a.b.j3.g.g(r0)
                c.f.a.b.c3.a0 r0 = r9.f6766a
                java.lang.String r0 = r0.f6663b
                int r0 = r8.f(r0)
                r3 = -1
                if (r0 != r3) goto L28
                java.util.ArrayList<c.f.a.b.c3.r> r0 = r8.f6823f
                r0.add(r9)
            L20:
                java.util.ArrayList<c.f.a.b.c3.r> r0 = r8.f6823f
                c.f.a.b.c3.i r1 = c.f.a.b.c3.i.f6745b
                java.util.Collections.sort(r0, r1)
                goto L42
            L28:
                long r3 = r9.f6768c
                java.util.ArrayList<c.f.a.b.c3.r> r5 = r8.f6823f
                java.lang.Object r5 = r5.get(r0)
                c.f.a.b.c3.r r5 = (c.f.a.b.c3.r) r5
                long r5 = r5.f6768c
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 == 0) goto L39
                goto L3a
            L39:
                r1 = 0
            L3a:
                java.util.ArrayList<c.f.a.b.c3.r> r3 = r8.f6823f
                r3.set(r0, r9)
                if (r1 == 0) goto L42
                goto L20
            L42:
                c.f.a.b.c3.j0 r0 = r8.f6820c     // Catch: java.io.IOException -> L48
                r0.f(r9)     // Catch: java.io.IOException -> L48
                goto L50
            L48:
                r0 = move-exception
                java.lang.String r1 = "DownloadManager"
                java.lang.String r3 = "Failed to update index."
                c.f.a.b.j3.z.e(r1, r3, r0)
            L50:
                c.f.a.b.c3.x$b r0 = new c.f.a.b.c3.x$b
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.ArrayList<c.f.a.b.c3.r> r3 = r8.f6823f
                r1.<init>(r3)
                r3 = 0
                r0.<init>(r9, r2, r1, r3)
                android.os.Handler r1 = r8.f6822e
                r2 = 2
                android.os.Message r0 = r1.obtainMessage(r2, r0)
                r0.sendToTarget()
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.c3.x.c.m(c.f.a.b.c3.r):c.f.a.b.c3.r");
        }

        public final r n(r rVar, int i2, int i3) {
            c.f.a.b.j3.g.g((i2 == 3 || i2 == 4) ? false : true);
            return m(d(rVar, i2, i3));
        }

        public final void o() {
            Iterator<e> it = this.f6824g.values().iterator();
            while (it.hasNext()) {
                it.next().f(true);
            }
            try {
                this.f6820c.d();
            } catch (IOException e2) {
                c.f.a.b.j3.z.e("DownloadManager", "Failed to update index.", e2);
            }
            this.f6823f.clear();
            this.f6819b.quit();
            synchronized (this) {
                this.f6818a = true;
                notifyAll();
            }
        }

        public final void p() {
            ArrayList arrayList = new ArrayList();
            try {
                t tVarA = this.f6820c.a(3, 4);
                while (tVarA.g0()) {
                    try {
                        arrayList.add(tVarA.k0());
                    } finally {
                    }
                }
                tVarA.close();
            } catch (IOException unused) {
                c.f.a.b.j3.z.d("DownloadManager", "Failed to load downloads.");
            }
            for (int i2 = 0; i2 < this.f6823f.size(); i2++) {
                ArrayList<r> arrayList2 = this.f6823f;
                arrayList2.set(i2, d(arrayList2.get(i2), 5, 0));
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                this.f6823f.add(d((r) arrayList.get(i3), 5, 0));
            }
            Collections.sort(this.f6823f, i.f6745b);
            try {
                this.f6820c.b();
            } catch (IOException e2) {
                c.f.a.b.j3.z.e("DownloadManager", "Failed to update index.", e2);
            }
            ArrayList arrayList3 = new ArrayList(this.f6823f);
            for (int i4 = 0; i4 < this.f6823f.size(); i4++) {
                this.f6822e.obtainMessage(2, new b(this.f6823f.get(i4), false, arrayList3, null)).sendToTarget();
            }
            B();
        }

        public final void q(String str) {
            r rVarE = e(str, true);
            if (rVarE != null) {
                n(rVarE, 5, 0);
                B();
            } else {
                c.f.a.b.j3.z.d("DownloadManager", "Failed to remove nonexistent download: " + str);
            }
        }

        public final void r(boolean z) {
            this.f6826i = z;
            B();
        }

        public final void s(int i2) {
            this.f6827j = i2;
            B();
        }

        public final void t(int i2) {
            this.f6828k = i2;
        }

        public final void u(int i2) {
            this.f6825h = i2;
            B();
        }

        public final void v(r rVar, int i2) {
            if (i2 == 0) {
                if (rVar.f6767b == 1) {
                    n(rVar, 0, 0);
                }
            } else if (i2 != rVar.f6771f) {
                int i3 = rVar.f6767b;
                if (i3 == 0 || i3 == 2) {
                    i3 = 1;
                }
                m(new r(rVar.f6766a, i3, rVar.f6768c, System.currentTimeMillis(), rVar.f6770e, i2, 0, rVar.f6773h));
            }
        }

        public final void w(String str, int i2) {
            if (str == null) {
                for (int i3 = 0; i3 < this.f6823f.size(); i3++) {
                    v(this.f6823f.get(i3), i2);
                }
                try {
                    this.f6820c.h(i2);
                } catch (IOException e2) {
                    c.f.a.b.j3.z.e("DownloadManager", "Failed to set manual stop reason", e2);
                }
            } else {
                r rVarE = e(str, false);
                if (rVarE != null) {
                    v(rVarE, i2);
                } else {
                    try {
                        this.f6820c.c(str, i2);
                    } catch (IOException e3) {
                        c.f.a.b.j3.z.e("DownloadManager", "Failed to set manual stop reason: " + str, e3);
                    }
                }
            }
            B();
        }

        public final void x(e eVar, r rVar, int i2) {
            c.f.a.b.j3.g.g(!eVar.f6833e);
            if (!b() || i2 >= this.f6827j) {
                n(rVar, 0, 0);
                eVar.f(false);
            }
        }

        public final e y(e eVar, r rVar) {
            if (eVar != null) {
                c.f.a.b.j3.g.g(!eVar.f6833e);
                eVar.f(false);
                return eVar;
            }
            if (!b() || this.f6829l >= this.f6827j) {
                return null;
            }
            r rVarN = n(rVar, 2, 0);
            e eVar2 = new e(rVarN.f6766a, this.f6821d.a(rVarN.f6766a), rVarN.f6773h, false, this.f6828k, this);
            this.f6824g.put(rVarN.f6766a.f6663b, eVar2);
            int i2 = this.f6829l;
            this.f6829l = i2 + 1;
            if (i2 == 0) {
                sendEmptyMessageDelayed(11, 5000L);
            }
            eVar2.start();
            return eVar2;
        }

        public final void z(e eVar, r rVar) {
            if (eVar != null) {
                if (eVar.f6833e) {
                    return;
                }
                eVar.f(false);
            } else {
                e eVar2 = new e(rVar.f6766a, this.f6821d.a(rVar.f6766a), rVar.f6773h, true, this.f6828k, this);
                this.f6824g.put(rVar.f6766a.f6663b, eVar2);
                eVar2.start();
            }
        }
    }

    public interface d {
        void a(x xVar, boolean z);

        void b(x xVar, boolean z);

        void c(x xVar, r rVar, Exception exc);

        void d(x xVar, c.f.a.b.d3.d dVar, int i2);

        void e(x xVar, r rVar);

        void f(x xVar);

        void g(x xVar);
    }

    public static class e extends Thread implements c0.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a0 f6830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c0 f6831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final z f6832d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f6833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f6834f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile c f6835g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f6836h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Exception f6837i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f6838j;

        public e(a0 a0Var, c0 c0Var, z zVar, boolean z, int i2, c cVar) {
            this.f6830b = a0Var;
            this.f6831c = c0Var;
            this.f6832d = zVar;
            this.f6833e = z;
            this.f6834f = i2;
            this.f6835g = cVar;
            this.f6838j = -1L;
        }

        public static int g(int i2) {
            return Math.min((i2 - 1) * 1000, 5000);
        }

        @Override // c.f.a.b.c3.c0.a
        public void a(long j2, long j3, float f2) {
            this.f6832d.f6839a = j3;
            this.f6832d.f6840b = f2;
            if (j2 != this.f6838j) {
                this.f6838j = j2;
                c cVar = this.f6835g;
                if (cVar != null) {
                    cVar.obtainMessage(10, (int) (j2 >> 32), (int) j2, this).sendToTarget();
                }
            }
        }

        public void f(boolean z) {
            if (z) {
                this.f6835g = null;
            }
            if (this.f6836h) {
                return;
            }
            this.f6836h = true;
            this.f6831c.cancel();
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.f6833e) {
                    this.f6831c.remove();
                } else {
                    long j2 = -1;
                    int i2 = 0;
                    while (!this.f6836h) {
                        try {
                            this.f6831c.a(this);
                            break;
                        } catch (IOException e2) {
                            if (!this.f6836h) {
                                long j3 = this.f6832d.f6839a;
                                if (j3 != j2) {
                                    j2 = j3;
                                    i2 = 0;
                                }
                                i2++;
                                if (i2 > this.f6834f) {
                                    throw e2;
                                }
                                Thread.sleep(g(i2));
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e3) {
                this.f6837i = e3;
            }
            c cVar = this.f6835g;
            if (cVar != null) {
                cVar.obtainMessage(9, this).sendToTarget();
            }
        }
    }

    public x(Context context, j0 j0Var, d0 d0Var) {
        this.f6800b = context.getApplicationContext();
        this.f6801c = j0Var;
        this.f6810l = 3;
        this.f6811m = 5;
        this.f6809k = true;
        this.p = Collections.emptyList();
        this.f6805g = new CopyOnWriteArraySet<>();
        Handler handlerA = x0.A(new Handler.Callback() { // from class: c.f.a.b.c3.j
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f6749b.g(message);
            }
        });
        this.f6802d = handlerA;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        c cVar = new c(handlerThread, j0Var, d0Var, handlerA, this.f6810l, this.f6811m, this.f6809k);
        this.f6803e = cVar;
        e.c cVar2 = new e.c() { // from class: c.f.a.b.c3.h
            @Override // c.f.a.b.d3.e.c
            public final void a(c.f.a.b.d3.e eVar, int i2) {
                this.f6719a.r(eVar, i2);
            }
        };
        this.f6804f = cVar2;
        c.f.a.b.d3.e eVar = new c.f.a.b.d3.e(context, cVar2, f6799a);
        this.q = eVar;
        int i2 = eVar.i();
        this.f6812n = i2;
        this.f6806h = 1;
        cVar.obtainMessage(0, i2, 0).sendToTarget();
    }

    public x(Context context, c.f.a.b.u2.b bVar, c.f.a.b.i3.p0.b bVar2, p.a aVar, Executor executor) {
        this(context, new p(bVar), new q(new d.c().i(bVar2).l(aVar), executor));
    }

    public static r m(r rVar, a0 a0Var, int i2, long j2) {
        int i3 = rVar.f6767b;
        return new r(rVar.f6766a.d(a0Var), (i3 == 5 || i3 == 7) ? 7 : i2 != 0 ? 1 : 0, (i3 == 5 || rVar.c()) ? j2 : rVar.f6768c, j2, -1L, i2, 0);
    }

    public void a(a0 a0Var, int i2) {
        this.f6806h++;
        this.f6803e.obtainMessage(6, i2, 0, a0Var).sendToTarget();
    }

    public void b(d dVar) {
        c.f.a.b.j3.g.e(dVar);
        this.f6805g.add(dVar);
    }

    public List<r> c() {
        return this.p;
    }

    public w d() {
        return this.f6801c;
    }

    public boolean e() {
        return this.f6809k;
    }

    public c.f.a.b.d3.d f() {
        return this.q.f();
    }

    public final boolean g(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            p((List) message.obj);
        } else if (i2 == 1) {
            q(message.arg1, message.arg2);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException();
            }
            o((b) message.obj);
        }
        return true;
    }

    public boolean h() {
        return this.f6807i == 0 && this.f6806h == 0;
    }

    public boolean i() {
        return this.f6808j;
    }

    public boolean j() {
        return this.f6813o;
    }

    public final void n() {
        Iterator<d> it = this.f6805g.iterator();
        while (it.hasNext()) {
            it.next().b(this, this.f6813o);
        }
    }

    public final void o(b bVar) {
        this.p = Collections.unmodifiableList(bVar.f6816c);
        r rVar = bVar.f6814a;
        boolean z = z();
        if (bVar.f6815b) {
            Iterator<d> it = this.f6805g.iterator();
            while (it.hasNext()) {
                it.next().e(this, rVar);
            }
        } else {
            Iterator<d> it2 = this.f6805g.iterator();
            while (it2.hasNext()) {
                it2.next().c(this, rVar, bVar.f6817d);
            }
        }
        if (z) {
            n();
        }
    }

    public final void p(List<r> list) {
        this.f6808j = true;
        this.p = Collections.unmodifiableList(list);
        boolean z = z();
        Iterator<d> it = this.f6805g.iterator();
        while (it.hasNext()) {
            it.next().g(this);
        }
        if (z) {
            n();
        }
    }

    public final void q(int i2, int i3) {
        this.f6806h -= i2;
        this.f6807i = i3;
        if (h()) {
            Iterator<d> it = this.f6805g.iterator();
            while (it.hasNext()) {
                it.next().f(this);
            }
        }
    }

    public final void r(c.f.a.b.d3.e eVar, int i2) {
        c.f.a.b.d3.d dVarF = eVar.f();
        if (this.f6812n != i2) {
            this.f6812n = i2;
            this.f6806h++;
            this.f6803e.obtainMessage(2, i2, 0).sendToTarget();
        }
        boolean z = z();
        Iterator<d> it = this.f6805g.iterator();
        while (it.hasNext()) {
            it.next().d(this, dVarF, i2);
        }
        if (z) {
            n();
        }
    }

    public void s() {
        w(true);
    }

    public void t() {
        this.f6806h++;
        this.f6803e.obtainMessage(8).sendToTarget();
    }

    public void u(String str) {
        this.f6806h++;
        this.f6803e.obtainMessage(7, str).sendToTarget();
    }

    public void v() {
        w(false);
    }

    public final void w(boolean z) {
        if (this.f6809k == z) {
            return;
        }
        this.f6809k = z;
        this.f6806h++;
        this.f6803e.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
        boolean z2 = z();
        Iterator<d> it = this.f6805g.iterator();
        while (it.hasNext()) {
            it.next().a(this, z);
        }
        if (z2) {
            n();
        }
    }

    public void x(c.f.a.b.d3.d dVar) {
        if (dVar.equals(this.q.f())) {
            return;
        }
        this.q.j();
        c.f.a.b.d3.e eVar = new c.f.a.b.d3.e(this.f6800b, this.f6804f, dVar);
        this.q = eVar;
        r(this.q, eVar.i());
    }

    public void y(String str, int i2) {
        this.f6806h++;
        this.f6803e.obtainMessage(3, i2, 0, str).sendToTarget();
    }

    public final boolean z() {
        boolean z;
        if (this.f6809k || this.f6812n == 0) {
            z = false;
        } else {
            for (int i2 = 0; i2 < this.p.size(); i2++) {
                if (this.p.get(i2).f6767b == 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        boolean z2 = this.f6813o != z;
        this.f6813o = z;
        return z2;
    }
}
