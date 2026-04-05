package c.f.a.b;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class y0 implements x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10457b = -9223372036854775807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10456a = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10458c = false;

    public static void o(a2 a2Var, long j2) {
        long currentPosition = a2Var.getCurrentPosition() + j2;
        long duration = a2Var.getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        a2Var.seekTo(Math.max(currentPosition, 0L));
    }

    @Override // c.f.a.b.x0
    public boolean a(a2 a2Var, z1 z1Var) {
        a2Var.d(z1Var);
        return true;
    }

    @Override // c.f.a.b.x0
    public boolean b(a2 a2Var, int i2) {
        a2Var.setRepeatMode(i2);
        return true;
    }

    @Override // c.f.a.b.x0
    public boolean c(a2 a2Var) {
        if (!this.f10458c) {
            a2Var.L();
            return true;
        }
        if (!k() || !a2Var.m()) {
            return true;
        }
        o(a2Var, this.f10457b);
        return true;
    }

    @Override // c.f.a.b.x0
    public boolean d() {
        return !this.f10458c || this.f10456a > 0;
    }

    @Override // c.f.a.b.x0
    public boolean e(a2 a2Var) {
        if (!this.f10458c) {
            a2Var.O();
            return true;
        }
        if (!d() || !a2Var.m()) {
            return true;
        }
        o(a2Var, -this.f10456a);
        return true;
    }

    @Override // c.f.a.b.x0
    public boolean f(a2 a2Var, int i2, long j2) {
        a2Var.g(i2, j2);
        return true;
    }

    @Override // c.f.a.b.x0
    public boolean g(a2 a2Var, boolean z) {
        a2Var.j(z);
        return true;
    }

    @Override // c.f.a.b.x0
    public boolean h(a2 a2Var) {
        a2Var.prepare();
        return true;
    }

    @Override // c.f.a.b.x0
    public boolean i(a2 a2Var) {
        a2Var.t();
        return true;
    }

    @Override // c.f.a.b.x0
    public boolean j(a2 a2Var) {
        a2Var.K();
        return true;
    }

    @Override // c.f.a.b.x0
    public boolean k() {
        return !this.f10458c || this.f10457b > 0;
    }

    @Override // c.f.a.b.x0
    public boolean l(a2 a2Var, boolean z) {
        a2Var.v(z);
        return true;
    }

    public long m(a2 a2Var) {
        return this.f10458c ? this.f10457b : a2Var.w();
    }

    public long n(a2 a2Var) {
        return this.f10458c ? this.f10456a : a2Var.Q();
    }
}
