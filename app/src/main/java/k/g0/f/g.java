package k.g0.f;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import k.e0;
import k.g0.i.o;
import k.j;
import k.x;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.a f30623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e0 f30624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f30625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f30626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f30627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f30629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f30630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f30631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k.g0.g.c f30632j;

    public static final class a extends WeakReference<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f30633a;

        public a(g gVar, Object obj) {
            super(gVar);
            this.f30633a = obj;
        }
    }

    public g(j jVar, k.a aVar, Object obj) {
        this.f30625c = jVar;
        this.f30623a = aVar;
        this.f30627e = new f(aVar, n());
        this.f30626d = obj;
    }

    public void a(c cVar) {
        if (this.f30629g != null) {
            throw new IllegalStateException();
        }
        this.f30629g = cVar;
        cVar.f30609n.add(new a(this, this.f30626d));
    }

    public void b() {
        k.g0.g.c cVar;
        c cVar2;
        synchronized (this.f30625c) {
            this.f30631i = true;
            cVar = this.f30632j;
            cVar2 = this.f30629g;
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (cVar2 != null) {
            cVar2.d();
        }
    }

    public k.g0.g.c c() {
        k.g0.g.c cVar;
        synchronized (this.f30625c) {
            cVar = this.f30632j;
        }
        return cVar;
    }

    public synchronized c d() {
        return this.f30629g;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.Socket e(boolean r2, boolean r3, boolean r4) {
        /*
            r1 = this;
            r0 = 0
            if (r4 == 0) goto L5
            r1.f30632j = r0
        L5:
            r4 = 1
            if (r3 == 0) goto La
            r1.f30630h = r4
        La:
            k.g0.f.c r3 = r1.f30629g
            if (r3 == 0) goto L4a
            if (r2 == 0) goto L12
            r3.f30606k = r4
        L12:
            k.g0.g.c r2 = r1.f30632j
            if (r2 != 0) goto L4a
            boolean r2 = r1.f30630h
            if (r2 != 0) goto L1e
            boolean r2 = r3.f30606k
            if (r2 == 0) goto L4a
        L1e:
            r1.l(r3)
            k.g0.f.c r2 = r1.f30629g
            java.util.List<java.lang.ref.Reference<k.g0.f.g>> r2 = r2.f30609n
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L46
            k.g0.f.c r2 = r1.f30629g
            long r3 = java.lang.System.nanoTime()
            r2.f30610o = r3
            k.g0.a r2 = k.g0.a.f30553a
            k.j r3 = r1.f30625c
            k.g0.f.c r4 = r1.f30629g
            boolean r2 = r2.e(r3, r4)
            if (r2 == 0) goto L46
            k.g0.f.c r2 = r1.f30629g
            java.net.Socket r2 = r2.q()
            goto L47
        L46:
            r2 = r0
        L47:
            r1.f30629g = r0
            r0 = r2
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.g0.f.g.e(boolean, boolean, boolean):java.net.Socket");
    }

    public final c f(int i2, int i3, int i4, boolean z) throws Throwable {
        synchronized (this.f30625c) {
            if (this.f30630h) {
                throw new IllegalStateException("released");
            }
            if (this.f30632j != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.f30631i) {
                throw new IOException("Canceled");
            }
            c cVar = this.f30629g;
            if (cVar != null && !cVar.f30606k) {
                return cVar;
            }
            Socket socketF = null;
            k.g0.a.f30553a.h(this.f30625c, this.f30623a, this, null);
            c cVar2 = this.f30629g;
            if (cVar2 != null) {
                return cVar2;
            }
            e0 e0VarG = this.f30624b;
            if (e0VarG == null) {
                e0VarG = this.f30627e.g();
            }
            synchronized (this.f30625c) {
                if (this.f30631i) {
                    throw new IOException("Canceled");
                }
                k.g0.a.f30553a.h(this.f30625c, this.f30623a, this, e0VarG);
                c cVar3 = this.f30629g;
                if (cVar3 != null) {
                    return cVar3;
                }
                this.f30624b = e0VarG;
                this.f30628f = 0;
                c cVar4 = new c(this.f30625c, e0VarG);
                a(cVar4);
                cVar4.e(i2, i3, i4, z);
                n().a(cVar4.a());
                synchronized (this.f30625c) {
                    k.g0.a.f30553a.i(this.f30625c, cVar4);
                    if (cVar4.o()) {
                        socketF = k.g0.a.f30553a.f(this.f30625c, this.f30623a, this);
                        cVar4 = this.f30629g;
                    }
                }
                k.g0.c.d(socketF);
                return cVar4;
            }
        }
    }

    public final c g(int i2, int i3, int i4, boolean z, boolean z2) throws Throwable {
        while (true) {
            c cVarF = f(i2, i3, i4, z);
            synchronized (this.f30625c) {
                if (cVarF.f30607l == 0) {
                    return cVarF;
                }
                if (cVarF.n(z2)) {
                    return cVarF;
                }
                j();
            }
        }
    }

    public boolean h() {
        return this.f30624b != null || this.f30627e.c();
    }

    public k.g0.g.c i(x xVar, boolean z) {
        try {
            k.g0.g.c cVarP = g(xVar.e(), xVar.B(), xVar.H(), xVar.C(), z).p(xVar, this);
            synchronized (this.f30625c) {
                this.f30632j = cVarP;
            }
            return cVarP;
        } catch (IOException e2) {
            throw new e(e2);
        }
    }

    public void j() {
        Socket socketE;
        synchronized (this.f30625c) {
            socketE = e(true, false, false);
        }
        k.g0.c.d(socketE);
    }

    public void k() {
        Socket socketE;
        synchronized (this.f30625c) {
            socketE = e(false, true, false);
        }
        k.g0.c.d(socketE);
    }

    public final void l(c cVar) {
        int size = cVar.f30609n.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (cVar.f30609n.get(i2).get() == this) {
                cVar.f30609n.remove(i2);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public Socket m(c cVar) {
        if (this.f30632j != null || this.f30629g.f30609n.size() != 1) {
            throw new IllegalStateException();
        }
        Reference<g> reference = this.f30629g.f30609n.get(0);
        Socket socketE = e(true, false, false);
        this.f30629g = cVar;
        cVar.f30609n.add(reference);
        return socketE;
    }

    public final d n() {
        return k.g0.a.f30553a.j(this.f30625c);
    }

    public void o(IOException iOException) {
        boolean z;
        Socket socketE;
        synchronized (this.f30625c) {
            if (iOException instanceof o) {
                k.g0.i.b bVar = ((o) iOException).f30837b;
                k.g0.i.b bVar2 = k.g0.i.b.REFUSED_STREAM;
                if (bVar == bVar2) {
                    this.f30628f++;
                }
                if (bVar == bVar2) {
                    if (this.f30628f > 1) {
                    }
                    z = false;
                    socketE = e(z, false, true);
                }
                this.f30624b = null;
                z = true;
                socketE = e(z, false, true);
            } else {
                c cVar = this.f30629g;
                if (cVar != null && (!cVar.o() || (iOException instanceof k.g0.i.a))) {
                    if (this.f30629g.f30607l == 0) {
                        e0 e0Var = this.f30624b;
                        if (e0Var != null && iOException != null) {
                            this.f30627e.a(e0Var, iOException);
                        }
                        this.f30624b = null;
                    }
                    z = true;
                    socketE = e(z, false, true);
                }
                z = false;
                socketE = e(z, false, true);
            }
        }
        k.g0.c.d(socketE);
    }

    public void p(boolean z, k.g0.g.c cVar) {
        Socket socketE;
        synchronized (this.f30625c) {
            if (cVar != null) {
                if (cVar == this.f30632j) {
                    if (!z) {
                        this.f30629g.f30607l++;
                    }
                    socketE = e(z, false, true);
                }
            }
            throw new IllegalStateException("expected " + this.f30632j + " but was " + cVar);
        }
        k.g0.c.d(socketE);
    }

    public String toString() {
        c cVarD = d();
        return cVarD != null ? cVarD.toString() : this.f30623a.toString();
    }
}
