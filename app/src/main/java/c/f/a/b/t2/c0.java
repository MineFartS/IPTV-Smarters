package c.f.a.b.t2;

import android.os.Handler;
import android.os.SystemClock;
import c.f.a.b.d1;
import c.f.a.b.i2;
import c.f.a.b.j3.v0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.l1;
import c.f.a.b.t2.u;
import c.f.a.b.t2.v;
import c.f.a.b.u0;
import c.f.a.b.v2.c;
import c.f.a.b.z1;
import com.google.android.exoplayer2.decoder.SimpleOutputBuffer;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0<T extends c.f.a.b.v2.c<c.f.a.b.v2.f, ? extends SimpleOutputBuffer, ? extends c.f.a.b.v2.e>> extends u0 implements c.f.a.b.j3.b0 {
    public int A;
    public boolean B;
    public boolean C;
    public long D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u.a f10002n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v f10003o;
    public final c.f.a.b.v2.f p;
    public c.f.a.b.v2.d q;
    public k1 r;
    public int s;
    public int t;
    public boolean u;
    public T v;
    public c.f.a.b.v2.f w;
    public SimpleOutputBuffer x;
    public c.f.a.b.x2.y y;
    public c.f.a.b.x2.y z;

    public final class b implements v.c {
        public b() {
        }

        @Override // c.f.a.b.t2.v.c
        public void a(boolean z) {
            c0.this.f10002n.C(z);
        }

        @Override // c.f.a.b.t2.v.c
        public void b(long j2) {
            c0.this.f10002n.B(j2);
        }

        @Override // c.f.a.b.t2.v.c
        public void c(Exception exc) {
            c.f.a.b.j3.z.e("DecoderAudioRenderer", "Audio sink error", exc);
            c0.this.f10002n.b(exc);
        }

        @Override // c.f.a.b.t2.v.c
        public void d(int i2, long j2, long j3) {
            c0.this.f10002n.D(i2, j2, j3);
        }

        @Override // c.f.a.b.t2.v.c
        public /* synthetic */ void e(long j2) {
            w.b(this, j2);
        }

        @Override // c.f.a.b.t2.v.c
        public void f() {
            c0.this.W();
        }

        @Override // c.f.a.b.t2.v.c
        public /* synthetic */ void g() {
            w.a(this);
        }
    }

    public c0() {
        this((Handler) null, (u) null, new s[0]);
    }

    public c0(Handler handler, u uVar, q qVar, s... sVarArr) {
        this(handler, uVar, new d0(qVar, sVarArr));
    }

    public c0(Handler handler, u uVar, v vVar) {
        super(1);
        this.f10002n = new u.a(handler, uVar);
        this.f10003o = vVar;
        vVar.n(new b());
        this.p = c.f.a.b.v2.f.q();
        this.A = 0;
        this.C = true;
    }

    public c0(Handler handler, u uVar, s... sVarArr) {
        this(handler, uVar, null, sVarArr);
    }

    @Override // c.f.a.b.u0
    public void D() {
        this.r = null;
        this.C = true;
        try {
            b0(null);
            Z();
            this.f10003o.reset();
        } finally {
            this.f10002n.e(this.q);
        }
    }

    @Override // c.f.a.b.u0
    public void E(boolean z, boolean z2) {
        c.f.a.b.v2.d dVar = new c.f.a.b.v2.d();
        this.q = dVar;
        this.f10002n.f(dVar);
        if (y().f9357b) {
            this.f10003o.l();
        } else {
            this.f10003o.i();
        }
    }

    @Override // c.f.a.b.u0
    public void F(long j2, boolean z) throws d1 {
        if (this.u) {
            this.f10003o.q();
        } else {
            this.f10003o.flush();
        }
        this.D = j2;
        this.E = true;
        this.F = true;
        this.G = false;
        this.H = false;
        if (this.v != null) {
            R();
        }
    }

    @Override // c.f.a.b.u0
    public void H() {
        this.f10003o.play();
    }

    @Override // c.f.a.b.u0
    public void I() {
        e0();
        this.f10003o.pause();
    }

    public c.f.a.b.v2.g N(String str, k1 k1Var, k1 k1Var2) {
        return new c.f.a.b.v2.g(str, k1Var, k1Var2, 0, 1);
    }

    public abstract T O(k1 k1Var, ExoMediaCrypto exoMediaCrypto);

    public final boolean P() throws d1 {
        if (this.x == null) {
            SimpleOutputBuffer simpleOutputBuffer = (SimpleOutputBuffer) this.v.b();
            this.x = simpleOutputBuffer;
            if (simpleOutputBuffer == null) {
                return false;
            }
            int i2 = simpleOutputBuffer.skippedOutputBufferCount;
            if (i2 > 0) {
                this.q.f10269f += i2;
                this.f10003o.k();
            }
        }
        if (this.x.isEndOfStream()) {
            if (this.A == 2) {
                Z();
                U();
                this.C = true;
            } else {
                this.x.release();
                this.x = null;
                try {
                    Y();
                } catch (v.e e2) {
                    throw x(e2, e2.f10186d, e2.f10185c, 5002);
                }
            }
            return false;
        }
        if (this.C) {
            this.f10003o.p(S(this.v).b().M(this.s).N(this.t).E(), 0, null);
            this.C = false;
        }
        v vVar = this.f10003o;
        SimpleOutputBuffer simpleOutputBuffer2 = this.x;
        if (!vVar.m(simpleOutputBuffer2.data, simpleOutputBuffer2.timeUs, 1)) {
            return false;
        }
        this.q.f10268e++;
        this.x.release();
        this.x = null;
        return true;
    }

    public final boolean Q() throws d1 {
        T t = this.v;
        if (t == null || this.A == 2 || this.G) {
            return false;
        }
        if (this.w == null) {
            c.f.a.b.v2.f fVar = (c.f.a.b.v2.f) t.c();
            this.w = fVar;
            if (fVar == null) {
                return false;
            }
        }
        if (this.A == 1) {
            this.w.setFlags(4);
            this.v.d(this.w);
            this.w = null;
            this.A = 2;
            return false;
        }
        l1 l1VarZ = z();
        int iK = K(l1VarZ, this.w, 0);
        if (iK == -5) {
            V(l1VarZ);
            return true;
        }
        if (iK != -4) {
            if (iK == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        if (this.w.isEndOfStream()) {
            this.G = true;
            this.v.d(this.w);
            this.w = null;
            return false;
        }
        this.w.o();
        X(this.w);
        this.v.d(this.w);
        this.B = true;
        this.q.f10266c++;
        this.w = null;
        return true;
    }

    public final void R() throws d1 {
        if (this.A != 0) {
            Z();
            U();
            return;
        }
        this.w = null;
        SimpleOutputBuffer simpleOutputBuffer = this.x;
        if (simpleOutputBuffer != null) {
            simpleOutputBuffer.release();
            this.x = null;
        }
        this.v.flush();
        this.B = false;
    }

    public abstract k1 S(T t);

    public final int T(k1 k1Var) {
        return this.f10003o.o(k1Var);
    }

    public final void U() throws d1 {
        if (this.v != null) {
            return;
        }
        a0(this.z);
        ExoMediaCrypto exoMediaCryptoF = null;
        c.f.a.b.x2.y yVar = this.y;
        if (yVar != null && (exoMediaCryptoF = yVar.f()) == null && this.y.getError() == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            v0.a("createAudioDecoder");
            this.v = (T) O(this.r, exoMediaCryptoF);
            v0.c();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f10002n.c(this.v.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.q.f10264a++;
        } catch (c.f.a.b.v2.e e2) {
            c.f.a.b.j3.z.e("DecoderAudioRenderer", "Audio codec error", e2);
            this.f10002n.a(e2);
            throw w(e2, this.r, 4001);
        } catch (OutOfMemoryError e3) {
            throw w(e3, this.r, 4001);
        }
    }

    public final void V(l1 l1Var) throws d1 {
        k1 k1Var = (k1) c.f.a.b.j3.g.e(l1Var.f9575b);
        b0(l1Var.f9574a);
        k1 k1Var2 = this.r;
        this.r = k1Var;
        this.s = k1Var.C;
        this.t = k1Var.D;
        T t = this.v;
        if (t == null) {
            U();
            this.f10002n.g(this.r, null);
            return;
        }
        c.f.a.b.v2.g gVar = this.z != this.y ? new c.f.a.b.v2.g(t.getName(), k1Var2, k1Var, 0, 128) : N(t.getName(), k1Var2, k1Var);
        if (gVar.f10287d == 0) {
            if (this.B) {
                this.A = 1;
            } else {
                Z();
                U();
                this.C = true;
            }
        }
        this.f10002n.g(this.r, gVar);
    }

    public void W() {
        this.F = true;
    }

    public void X(c.f.a.b.v2.f fVar) {
        if (!this.E || fVar.isDecodeOnly()) {
            return;
        }
        if (Math.abs(fVar.f10278e - this.D) > 500000) {
            this.D = fVar.f10278e;
        }
        this.E = false;
    }

    public final void Y() {
        this.H = true;
        this.f10003o.e();
    }

    public final void Z() {
        this.w = null;
        this.x = null;
        this.A = 0;
        this.B = false;
        T t = this.v;
        if (t != null) {
            this.q.f10265b++;
            t.release();
            this.f10002n.d(this.v.getName());
            this.v = null;
        }
        a0(null);
    }

    @Override // c.f.a.b.j2
    public final int a(k1 k1Var) {
        if (!c.f.a.b.j3.d0.p(k1Var.f9338m)) {
            return i2.a(0);
        }
        int iD0 = d0(k1Var);
        if (iD0 <= 2) {
            return i2.a(iD0);
        }
        return i2.b(iD0, 8, x0.f9296a >= 21 ? 32 : 0);
    }

    public final void a0(c.f.a.b.x2.y yVar) {
        c.f.a.b.x2.x.a(this.y, yVar);
        this.y = yVar;
    }

    @Override // c.f.a.b.h2
    public boolean b() {
        return this.H && this.f10003o.b();
    }

    public final void b0(c.f.a.b.x2.y yVar) {
        c.f.a.b.x2.x.a(this.z, yVar);
        this.z = yVar;
    }

    @Override // c.f.a.b.j3.b0
    public z1 c() {
        return this.f10003o.c();
    }

    public final boolean c0(k1 k1Var) {
        return this.f10003o.a(k1Var);
    }

    @Override // c.f.a.b.j3.b0
    public void d(z1 z1Var) {
        this.f10003o.d(z1Var);
    }

    public abstract int d0(k1 k1Var);

    @Override // c.f.a.b.h2
    public boolean e() {
        return this.f10003o.f() || (this.r != null && (C() || this.x != null));
    }

    public final void e0() {
        long jH = this.f10003o.h(b());
        if (jH != Long.MIN_VALUE) {
            if (!this.F) {
                jH = Math.max(this.D, jH);
            }
            this.D = jH;
            this.F = false;
        }
    }

    @Override // c.f.a.b.j3.b0
    public long j() {
        if (getState() == 2) {
            e0();
        }
        return this.D;
    }

    @Override // c.f.a.b.h2
    public void o(long j2, long j3) throws d1 {
        if (this.H) {
            try {
                this.f10003o.e();
                return;
            } catch (v.e e2) {
                throw x(e2, e2.f10186d, e2.f10185c, 5002);
            }
        }
        if (this.r == null) {
            l1 l1VarZ = z();
            this.p.clear();
            int iK = K(l1VarZ, this.p, 2);
            if (iK != -5) {
                if (iK == -4) {
                    c.f.a.b.j3.g.g(this.p.isEndOfStream());
                    this.G = true;
                    try {
                        Y();
                        return;
                    } catch (v.e e3) {
                        throw w(e3, null, 5002);
                    }
                }
                return;
            }
            V(l1VarZ);
        }
        U();
        if (this.v != null) {
            try {
                v0.a("drainAndFeed");
                while (P()) {
                }
                while (Q()) {
                }
                v0.c();
                this.q.c();
            } catch (v.a e4) {
                throw w(e4, e4.f10178b, 5001);
            } catch (v.b e5) {
                throw x(e5, e5.f10181d, e5.f10180c, 5001);
            } catch (v.e e6) {
                throw x(e6, e6.f10186d, e6.f10185c, 5002);
            } catch (c.f.a.b.v2.e e7) {
                c.f.a.b.j3.z.e("DecoderAudioRenderer", "Audio codec error", e7);
                this.f10002n.a(e7);
                throw w(e7, this.r, 4003);
            }
        }
    }

    @Override // c.f.a.b.u0, c.f.a.b.d2.b
    public void p(int i2, Object obj) {
        if (i2 == 2) {
            this.f10003o.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i2 == 3) {
            this.f10003o.j((p) obj);
            return;
        }
        if (i2 == 5) {
            this.f10003o.s((z) obj);
        } else if (i2 == 101) {
            this.f10003o.r(((Boolean) obj).booleanValue());
        } else if (i2 != 102) {
            super.p(i2, obj);
        } else {
            this.f10003o.g(((Integer) obj).intValue());
        }
    }

    @Override // c.f.a.b.u0, c.f.a.b.h2
    public c.f.a.b.j3.b0 v() {
        return this;
    }
}
