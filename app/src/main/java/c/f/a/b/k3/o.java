package c.f.a.b.k3;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import c.f.a.b.d1;
import c.f.a.b.j3.t0;
import c.f.a.b.j3.v0;
import c.f.a.b.k1;
import c.f.a.b.k3.d0;
import c.f.a.b.l1;
import c.f.a.b.u0;
import c.f.a.b.w0;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.video.VideoDecoderOutputBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o extends u0 {
    public x A;
    public y B;
    public c.f.a.b.x2.y C;
    public c.f.a.b.x2.y D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public long J;
    public long K;
    public boolean L;
    public boolean M;
    public boolean N;
    public e0 O;
    public long P;
    public int Q;
    public int R;
    public int S;
    public long T;
    public long U;
    public c.f.a.b.v2.d V;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f9492n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f9493o;
    public final d0.a p;
    public final t0<k1> q;
    public final c.f.a.b.v2.f r;
    public k1 s;
    public k1 t;
    public c.f.a.b.v2.c<w, ? extends VideoDecoderOutputBuffer, ? extends c.f.a.b.v2.e> u;
    public w v;
    public VideoDecoderOutputBuffer w;
    public int x;
    public Object y;
    public Surface z;

    public o(long j2, Handler handler, d0 d0Var, int i2) {
        super(2);
        this.f9492n = j2;
        this.f9493o = i2;
        this.K = -9223372036854775807L;
        O();
        this.q = new t0<>();
        this.r = c.f.a.b.v2.f.q();
        this.p = new d0.a(handler, d0Var);
        this.E = 0;
        this.x = -1;
    }

    public static boolean V(long j2) {
        return j2 < -30000;
    }

    public static boolean W(long j2) {
        return j2 < -500000;
    }

    @Override // c.f.a.b.u0
    public void D() {
        this.s = null;
        O();
        N();
        try {
            s0(null);
            l0();
        } finally {
            this.p.c(this.V);
        }
    }

    @Override // c.f.a.b.u0
    public void E(boolean z, boolean z2) {
        c.f.a.b.v2.d dVar = new c.f.a.b.v2.d();
        this.V = dVar;
        this.p.e(dVar);
        this.H = z2;
        this.I = false;
    }

    @Override // c.f.a.b.u0
    public void F(long j2, boolean z) throws d1 {
        this.M = false;
        this.N = false;
        N();
        this.J = -9223372036854775807L;
        this.R = 0;
        if (this.u != null) {
            T();
        }
        if (z) {
            q0();
        } else {
            this.K = -9223372036854775807L;
        }
        this.q.c();
    }

    @Override // c.f.a.b.u0
    public void H() {
        this.Q = 0;
        this.P = SystemClock.elapsedRealtime();
        this.T = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // c.f.a.b.u0
    public void I() {
        this.K = -9223372036854775807L;
        Z();
    }

    @Override // c.f.a.b.u0
    public void J(k1[] k1VarArr, long j2, long j3) {
        this.U = j3;
        super.J(k1VarArr, j2, j3);
    }

    public c.f.a.b.v2.g M(String str, k1 k1Var, k1 k1Var2) {
        return new c.f.a.b.v2.g(str, k1Var, k1Var2, 0, 1);
    }

    public final void N() {
        this.G = false;
    }

    public final void O() {
        this.O = null;
    }

    public abstract c.f.a.b.v2.c<w, ? extends VideoDecoderOutputBuffer, ? extends c.f.a.b.v2.e> P(k1 k1Var, ExoMediaCrypto exoMediaCrypto);

    public final boolean Q(long j2, long j3) throws d1 {
        if (this.w == null) {
            VideoDecoderOutputBuffer videoDecoderOutputBufferB = this.u.b();
            this.w = videoDecoderOutputBufferB;
            if (videoDecoderOutputBufferB == null) {
                return false;
            }
            c.f.a.b.v2.d dVar = this.V;
            int i2 = dVar.f10269f;
            int i3 = videoDecoderOutputBufferB.skippedOutputBufferCount;
            dVar.f10269f = i2 + i3;
            this.S -= i3;
        }
        if (!this.w.isEndOfStream()) {
            boolean zK0 = k0(j2, j3);
            if (zK0) {
                i0(this.w.timeUs);
                this.w = null;
            }
            return zK0;
        }
        if (this.E == 2) {
            l0();
            Y();
        } else {
            this.w.release();
            this.w = null;
            this.N = true;
        }
        return false;
    }

    public void R(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        x0(1);
        videoDecoderOutputBuffer.release();
    }

    public final boolean S() throws d1 {
        c.f.a.b.v2.c<w, ? extends VideoDecoderOutputBuffer, ? extends c.f.a.b.v2.e> cVar = this.u;
        if (cVar == null || this.E == 2 || this.M) {
            return false;
        }
        if (this.v == null) {
            w wVarC = cVar.c();
            this.v = wVarC;
            if (wVarC == null) {
                return false;
            }
        }
        if (this.E == 1) {
            this.v.setFlags(4);
            this.u.d(this.v);
            this.v = null;
            this.E = 2;
            return false;
        }
        l1 l1VarZ = z();
        int iK = K(l1VarZ, this.v, 0);
        if (iK == -5) {
            e0(l1VarZ);
            return true;
        }
        if (iK != -4) {
            if (iK == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (this.v.isEndOfStream()) {
            this.M = true;
            this.u.d(this.v);
            this.v = null;
            return false;
        }
        if (this.L) {
            this.q.a(this.v.f10278e, this.s);
            this.L = false;
        }
        this.v.o();
        w wVar = this.v;
        wVar.f9546i = this.s;
        j0(wVar);
        this.u.d(this.v);
        this.S++;
        this.F = true;
        this.V.f10266c++;
        this.v = null;
        return true;
    }

    public void T() throws d1 {
        this.S = 0;
        if (this.E != 0) {
            l0();
            Y();
            return;
        }
        this.v = null;
        VideoDecoderOutputBuffer videoDecoderOutputBuffer = this.w;
        if (videoDecoderOutputBuffer != null) {
            videoDecoderOutputBuffer.release();
            this.w = null;
        }
        this.u.flush();
        this.F = false;
    }

    public final boolean U() {
        return this.x != -1;
    }

    public boolean X(long j2) throws d1 {
        int iL = L(j2);
        if (iL == 0) {
            return false;
        }
        this.V.f10272i++;
        x0(this.S + iL);
        T();
        return true;
    }

    public final void Y() throws d1 {
        if (this.u != null) {
            return;
        }
        o0(this.D);
        ExoMediaCrypto exoMediaCryptoF = null;
        c.f.a.b.x2.y yVar = this.C;
        if (yVar != null && (exoMediaCryptoF = yVar.f()) == null && this.C.getError() == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.u = P(this.s, exoMediaCryptoF);
            p0(this.x);
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.p.a(this.u.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.V.f10264a++;
        } catch (c.f.a.b.v2.e e2) {
            c.f.a.b.j3.z.e("DecoderVideoRenderer", "Video codec error", e2);
            this.p.C(e2);
            throw w(e2, this.s, 4001);
        } catch (OutOfMemoryError e3) {
            throw w(e3, this.s, 4001);
        }
    }

    public final void Z() {
        if (this.Q > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.p.d(this.Q, jElapsedRealtime - this.P);
            this.Q = 0;
            this.P = jElapsedRealtime;
        }
    }

    public final void a0() {
        this.I = true;
        if (this.G) {
            return;
        }
        this.G = true;
        this.p.A(this.y);
    }

    @Override // c.f.a.b.h2
    public boolean b() {
        return this.N;
    }

    public final void b0(int i2, int i3) {
        e0 e0Var = this.O;
        if (e0Var != null && e0Var.f9371c == i2 && e0Var.f9372d == i3) {
            return;
        }
        e0 e0Var2 = new e0(i2, i3);
        this.O = e0Var2;
        this.p.D(e0Var2);
    }

    public final void c0() {
        if (this.G) {
            this.p.A(this.y);
        }
    }

    public final void d0() {
        e0 e0Var = this.O;
        if (e0Var != null) {
            this.p.D(e0Var);
        }
    }

    @Override // c.f.a.b.h2
    public boolean e() {
        if (this.s != null && ((C() || this.w != null) && (this.G || !U()))) {
            this.K = -9223372036854775807L;
            return true;
        }
        if (this.K == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.K) {
            return true;
        }
        this.K = -9223372036854775807L;
        return false;
    }

    public void e0(l1 l1Var) throws d1 {
        c.f.a.b.v2.g gVar;
        d0.a aVar;
        k1 k1Var;
        this.L = true;
        k1 k1Var2 = (k1) c.f.a.b.j3.g.e(l1Var.f9575b);
        s0(l1Var.f9574a);
        k1 k1Var3 = this.s;
        this.s = k1Var2;
        c.f.a.b.v2.c<w, ? extends VideoDecoderOutputBuffer, ? extends c.f.a.b.v2.e> cVar = this.u;
        if (cVar == null) {
            Y();
            aVar = this.p;
            k1Var = this.s;
            gVar = null;
        } else {
            gVar = this.D != this.C ? new c.f.a.b.v2.g(cVar.getName(), k1Var3, k1Var2, 0, 128) : M(cVar.getName(), k1Var3, k1Var2);
            if (gVar.f10287d == 0) {
                if (this.F) {
                    this.E = 1;
                } else {
                    l0();
                    Y();
                }
            }
            aVar = this.p;
            k1Var = this.s;
        }
        aVar.f(k1Var, gVar);
    }

    public final void f0() {
        d0();
        N();
        if (getState() == 2) {
            q0();
        }
    }

    public final void g0() {
        O();
        N();
    }

    public final void h0() {
        d0();
        c0();
    }

    public void i0(long j2) {
        this.S--;
    }

    public void j0(w wVar) {
    }

    public final boolean k0(long j2, long j3) {
        if (this.J == -9223372036854775807L) {
            this.J = j2;
        }
        long j4 = this.w.timeUs - j2;
        if (!U()) {
            if (!V(j4)) {
                return false;
            }
            w0(this.w);
            return true;
        }
        long j5 = this.w.timeUs - this.U;
        k1 k1VarJ = this.q.j(j5);
        if (k1VarJ != null) {
            this.t = k1VarJ;
        }
        long jElapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.T;
        boolean z = getState() == 2;
        if ((this.I ? !this.G : z || this.H) || (z && v0(j4, jElapsedRealtime))) {
            m0(this.w, j5, this.t);
            return true;
        }
        if (!z || j2 == this.J || (t0(j4, j3) && X(j2))) {
            return false;
        }
        if (u0(j4, j3)) {
            R(this.w);
            return true;
        }
        if (j4 < 30000) {
            m0(this.w, j5, this.t);
            return true;
        }
        return false;
    }

    public void l0() {
        this.v = null;
        this.w = null;
        this.E = 0;
        this.F = false;
        this.S = 0;
        c.f.a.b.v2.c<w, ? extends VideoDecoderOutputBuffer, ? extends c.f.a.b.v2.e> cVar = this.u;
        if (cVar != null) {
            this.V.f10265b++;
            cVar.release();
            this.p.b(this.u.getName());
            this.u = null;
        }
        o0(null);
    }

    public void m0(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j2, k1 k1Var) {
        y yVar = this.B;
        if (yVar != null) {
            yVar.d(j2, System.nanoTime(), k1Var, null);
        }
        this.T = w0.d(SystemClock.elapsedRealtime() * 1000);
        int i2 = videoDecoderOutputBuffer.mode;
        boolean z = i2 == 1 && this.z != null;
        boolean z2 = i2 == 0 && this.A != null;
        if (!z2 && !z) {
            R(videoDecoderOutputBuffer);
            return;
        }
        b0(videoDecoderOutputBuffer.width, videoDecoderOutputBuffer.height);
        if (z2) {
            this.A.setOutputBuffer(videoDecoderOutputBuffer);
        } else {
            n0(videoDecoderOutputBuffer, this.z);
        }
        this.R = 0;
        this.V.f10268e++;
        a0();
    }

    public abstract void n0(VideoDecoderOutputBuffer videoDecoderOutputBuffer, Surface surface);

    @Override // c.f.a.b.h2
    public void o(long j2, long j3) throws d1 {
        if (this.N) {
            return;
        }
        if (this.s == null) {
            l1 l1VarZ = z();
            this.r.clear();
            int iK = K(l1VarZ, this.r, 2);
            if (iK != -5) {
                if (iK == -4) {
                    c.f.a.b.j3.g.g(this.r.isEndOfStream());
                    this.M = true;
                    this.N = true;
                    return;
                }
                return;
            }
            e0(l1VarZ);
        }
        Y();
        if (this.u != null) {
            try {
                v0.a("drainAndFeed");
                while (Q(j2, j3)) {
                }
                while (S()) {
                }
                v0.c();
                this.V.c();
            } catch (c.f.a.b.v2.e e2) {
                c.f.a.b.j3.z.e("DecoderVideoRenderer", "Video codec error", e2);
                this.p.C(e2);
                throw w(e2, this.s, 4003);
            }
        }
    }

    public final void o0(c.f.a.b.x2.y yVar) {
        c.f.a.b.x2.x.a(this.C, yVar);
        this.C = yVar;
    }

    @Override // c.f.a.b.u0, c.f.a.b.d2.b
    public void p(int i2, Object obj) {
        if (i2 == 1) {
            r0(obj);
        } else if (i2 == 6) {
            this.B = (y) obj;
        } else {
            super.p(i2, obj);
        }
    }

    public abstract void p0(int i2);

    public final void q0() {
        this.K = this.f9492n > 0 ? SystemClock.elapsedRealtime() + this.f9492n : -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r0(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof android.view.Surface
            r1 = 0
            if (r0 == 0) goto L10
            r0 = r3
            android.view.Surface r0 = (android.view.Surface) r0
            r2.z = r0
            r2.A = r1
            r0 = 1
        Ld:
            r2.x = r0
            goto L23
        L10:
            boolean r0 = r3 instanceof c.f.a.b.k3.x
            r2.z = r1
            if (r0 == 0) goto L1d
            r0 = r3
            c.f.a.b.k3.x r0 = (c.f.a.b.k3.x) r0
            r2.A = r0
            r0 = 0
            goto Ld
        L1d:
            r2.A = r1
            r3 = -1
            r2.x = r3
            r3 = r1
        L23:
            java.lang.Object r0 = r2.y
            if (r0 == r3) goto L3c
            r2.y = r3
            if (r3 == 0) goto L38
            c.f.a.b.v2.c<c.f.a.b.k3.w, ? extends com.google.android.exoplayer2.video.VideoDecoderOutputBuffer, ? extends c.f.a.b.v2.e> r3 = r2.u
            if (r3 == 0) goto L34
            int r3 = r2.x
            r2.p0(r3)
        L34:
            r2.f0()
            goto L41
        L38:
            r2.g0()
            goto L41
        L3c:
            if (r3 == 0) goto L41
            r2.h0()
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.k3.o.r0(java.lang.Object):void");
    }

    public final void s0(c.f.a.b.x2.y yVar) {
        c.f.a.b.x2.x.a(this.D, yVar);
        this.D = yVar;
    }

    public boolean t0(long j2, long j3) {
        return W(j2);
    }

    public boolean u0(long j2, long j3) {
        return V(j2);
    }

    public boolean v0(long j2, long j3) {
        return V(j2) && j3 > 100000;
    }

    public void w0(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        this.V.f10269f++;
        videoDecoderOutputBuffer.release();
    }

    public void x0(int i2) {
        c.f.a.b.v2.d dVar = this.V;
        dVar.f10270g += i2;
        this.Q += i2;
        int i3 = this.R + i2;
        this.R = i3;
        dVar.f10271h = Math.max(i3, dVar.f10271h);
        int i4 = this.f9493o;
        if (i4 <= 0 || this.Q < i4) {
            return;
        }
        Z();
    }
}
