package c.f.a.b;

import c.f.a.b.a2;
import c.f.a.b.p2;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2.c f9974a = new p2.c();

    @Override // c.f.a.b.a2
    public final boolean C(int i2) {
        return h().b(i2);
    }

    @Override // c.f.a.b.a2
    public final void K() {
        if (G().q() || e()) {
            return;
        }
        if (W()) {
            e0();
        } else if (Z() && Y()) {
            c0();
        }
    }

    @Override // c.f.a.b.a2
    public final void L() {
        f0(w());
    }

    @Override // c.f.a.b.a2
    public final void O() {
        f0(-Q());
    }

    public a2.b R(a2.b bVar) {
        return new a2.b.a().b(bVar).d(3, !e()).d(4, m() && !e()).d(5, X() && !e()).d(6, !G().q() && (X() || !Z() || m()) && !e()).d(7, W() && !e()).d(8, !G().q() && (W() || (Z() && Y())) && !e()).d(9, !e()).d(10, m() && !e()).d(11, m() && !e()).e();
    }

    public final long S() {
        p2 p2VarG = G();
        if (p2VarG.q()) {
            return -9223372036854775807L;
        }
        return p2VarG.n(s(), this.f9974a).d();
    }

    public final int T() {
        p2 p2VarG = G();
        if (p2VarG.q()) {
            return -1;
        }
        return p2VarG.e(s(), V(), I());
    }

    public final int U() {
        p2 p2VarG = G();
        if (p2VarG.q()) {
            return -1;
        }
        return p2VarG.l(s(), V(), I());
    }

    public final int V() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    public final boolean W() {
        return T() != -1;
    }

    public final boolean X() {
        return U() != -1;
    }

    public final boolean Y() {
        p2 p2VarG = G();
        return !p2VarG.q() && p2VarG.n(s(), this.f9974a).f9721m;
    }

    public final boolean Z() {
        p2 p2VarG = G();
        return !p2VarG.q() && p2VarG.n(s(), this.f9974a).f();
    }

    public final void a0() {
        v(false);
    }

    public final void b(int i2, p1 p1Var) {
        z(i2, Collections.singletonList(p1Var));
    }

    public final void b0() {
        v(true);
    }

    public final void c0() {
        d0(s());
    }

    public final void d0(int i2) {
        g(i2, -9223372036854775807L);
    }

    public final void e0() {
        int iT = T();
        if (iT != -1) {
            d0(iT);
        }
    }

    public final void f0(long j2) {
        long currentPosition = getCurrentPosition() + j2;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekTo(Math.max(currentPosition, 0L));
    }

    public final void g0() {
        int iU = U();
        if (iU != -1) {
            d0(iU);
        }
    }

    @Override // c.f.a.b.a2
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && i() && E() == 0;
    }

    @Override // c.f.a.b.a2
    public final boolean m() {
        p2 p2VarG = G();
        return !p2VarG.q() && p2VarG.n(s(), this.f9974a).f9720l;
    }

    @Override // c.f.a.b.a2
    public final void seekTo(long j2) {
        g(s(), j2);
    }

    @Override // c.f.a.b.a2
    public final void t() {
        if (G().q() || e()) {
            return;
        }
        boolean zX = X();
        if (!Z() || m()) {
            if (!zX || getCurrentPosition() > k()) {
                seekTo(0L);
                return;
            }
        } else if (!zX) {
            return;
        }
        g0();
    }
}
