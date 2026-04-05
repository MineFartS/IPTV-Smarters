package c.f.a.b.f3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c.f.a.b.i2;
import c.f.a.b.j3.d0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import c.f.a.b.k1;
import c.f.a.b.l1;
import c.f.a.b.u0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends u0 implements Handler.Callback {
    public int A;
    public long B;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f8099n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f8100o;
    public final i p;
    public final l1 q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public k1 v;
    public g w;
    public j x;
    public k y;
    public k z;

    public m(l lVar, Looper looper) {
        this(lVar, looper, i.f8095a);
    }

    public m(l lVar, Looper looper, i iVar) {
        super(3);
        this.f8100o = (l) c.f.a.b.j3.g.e(lVar);
        this.f8099n = looper == null ? null : x0.w(looper, this);
        this.p = iVar;
        this.q = new l1();
        this.B = -9223372036854775807L;
    }

    @Override // c.f.a.b.u0
    public void D() {
        this.v = null;
        this.B = -9223372036854775807L;
        M();
        S();
    }

    @Override // c.f.a.b.u0
    public void F(long j2, boolean z) {
        M();
        this.r = false;
        this.s = false;
        this.B = -9223372036854775807L;
        if (this.u != 0) {
            T();
        } else {
            R();
            ((g) c.f.a.b.j3.g.e(this.w)).flush();
        }
    }

    @Override // c.f.a.b.u0
    public void J(k1[] k1VarArr, long j2, long j3) {
        this.v = k1VarArr[0];
        if (this.w != null) {
            this.u = 1;
        } else {
            P();
        }
    }

    public final void M() {
        V(Collections.emptyList());
    }

    public final long N() {
        if (this.A == -1) {
            return Long.MAX_VALUE;
        }
        c.f.a.b.j3.g.e(this.y);
        if (this.A >= this.y.d()) {
            return Long.MAX_VALUE;
        }
        return this.y.b(this.A);
    }

    public final void O(h hVar) {
        z.e("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.v, hVar);
        M();
        T();
    }

    public final void P() {
        this.t = true;
        this.w = this.p.b((k1) c.f.a.b.j3.g.e(this.v));
    }

    public final void Q(List<c> list) {
        this.f8100o.Q(list);
    }

    public final void R() {
        this.x = null;
        this.A = -1;
        k kVar = this.y;
        if (kVar != null) {
            kVar.release();
            this.y = null;
        }
        k kVar2 = this.z;
        if (kVar2 != null) {
            kVar2.release();
            this.z = null;
        }
    }

    public final void S() {
        R();
        ((g) c.f.a.b.j3.g.e(this.w)).release();
        this.w = null;
        this.u = 0;
    }

    public final void T() {
        S();
        P();
    }

    public void U(long j2) {
        c.f.a.b.j3.g.g(u());
        this.B = j2;
    }

    public final void V(List<c> list) {
        Handler handler = this.f8099n;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            Q(list);
        }
    }

    @Override // c.f.a.b.j2
    public int a(k1 k1Var) {
        if (this.p.a(k1Var)) {
            return i2.a(k1Var.F == null ? 4 : 2);
        }
        return i2.a(d0.r(k1Var.f9338m) ? 1 : 0);
    }

    @Override // c.f.a.b.h2
    public boolean b() {
        return this.s;
    }

    @Override // c.f.a.b.h2
    public boolean e() {
        return true;
    }

    @Override // c.f.a.b.h2, c.f.a.b.j2
    public String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        Q((List) message.obj);
        return true;
    }

    @Override // c.f.a.b.h2
    public void o(long j2, long j3) {
        boolean z;
        if (u()) {
            long j4 = this.B;
            if (j4 != -9223372036854775807L && j2 >= j4) {
                R();
                this.s = true;
            }
        }
        if (this.s) {
            return;
        }
        if (this.z == null) {
            ((g) c.f.a.b.j3.g.e(this.w)).a(j2);
            try {
                this.z = ((g) c.f.a.b.j3.g.e(this.w)).b();
            } catch (h e2) {
                O(e2);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.y != null) {
            long jN = N();
            z = false;
            while (jN <= j2) {
                this.A++;
                jN = N();
                z = true;
            }
        } else {
            z = false;
        }
        k kVar = this.z;
        if (kVar != null) {
            if (kVar.isEndOfStream()) {
                if (!z && N() == Long.MAX_VALUE) {
                    if (this.u == 2) {
                        T();
                    } else {
                        R();
                        this.s = true;
                    }
                }
            } else if (kVar.timeUs <= j2) {
                k kVar2 = this.y;
                if (kVar2 != null) {
                    kVar2.release();
                }
                this.A = kVar.a(j2);
                this.y = kVar;
                this.z = null;
                z = true;
            }
        }
        if (z) {
            c.f.a.b.j3.g.e(this.y);
            V(this.y.c(j2));
        }
        if (this.u == 2) {
            return;
        }
        while (!this.r) {
            try {
                j jVarC = this.x;
                if (jVarC == null) {
                    jVarC = ((g) c.f.a.b.j3.g.e(this.w)).c();
                    if (jVarC == null) {
                        return;
                    } else {
                        this.x = jVarC;
                    }
                }
                if (this.u == 1) {
                    jVarC.setFlags(4);
                    ((g) c.f.a.b.j3.g.e(this.w)).d(jVarC);
                    this.x = null;
                    this.u = 2;
                    return;
                }
                int iK = K(this.q, jVarC, 0);
                if (iK == -4) {
                    if (jVarC.isEndOfStream()) {
                        this.r = true;
                        this.t = false;
                    } else {
                        k1 k1Var = this.q.f9575b;
                        if (k1Var == null) {
                            return;
                        }
                        jVarC.f8096i = k1Var.q;
                        jVarC.o();
                        this.t &= !jVarC.isKeyFrame();
                    }
                    if (!this.t) {
                        ((g) c.f.a.b.j3.g.e(this.w)).d(jVarC);
                        this.x = null;
                    }
                } else if (iK == -3) {
                    return;
                }
            } catch (h e3) {
                O(e3);
                return;
            }
        }
    }
}
