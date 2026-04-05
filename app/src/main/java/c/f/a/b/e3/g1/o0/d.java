package c.f.a.b.e3.g1.o0;

import c.f.a.b.e3.g1.q;
import c.f.a.b.j3.e0;
import c.f.a.b.j3.g;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import c.f.a.b.w1;
import c.f.a.b.z2.a0;
import c.f.a.b.z2.l;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f7648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a0 f7649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7650e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7653h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f7654i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f7647b = new i0(e0.f9165a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f7646a = new i0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f7651f = -9223372036854775807L;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7652g = -1;

    public d(q qVar) {
        this.f7648c = qVar;
    }

    public static int e(int i2) {
        return i2 == 5 ? 1 : 0;
    }

    public static long i(long j2, long j3, long j4) {
        return j2 + x0.P0(j3 - j4, 1000000L, 90000L);
    }

    @Override // c.f.a.b.e3.g1.o0.e
    public void a(long j2, long j3) {
        this.f7651f = j2;
        this.f7653h = 0;
        this.f7654i = j3;
    }

    @Override // c.f.a.b.e3.g1.o0.e
    public void b(i0 i0Var, long j2, int i2, boolean z) throws w1 {
        try {
            int i3 = i0Var.d()[0] & 31;
            g.i(this.f7649d);
            if (i3 > 0 && i3 < 24) {
                g(i0Var);
            } else if (i3 == 24) {
                h(i0Var);
            } else {
                if (i3 != 28) {
                    throw w1.c(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i3)), null);
                }
                f(i0Var, i2);
            }
            if (z) {
                if (this.f7651f == -9223372036854775807L) {
                    this.f7651f = j2;
                }
                this.f7649d.d(i(this.f7654i, j2, this.f7651f), this.f7650e, this.f7653h, 0, null);
                this.f7653h = 0;
            }
            this.f7652g = i2;
        } catch (IndexOutOfBoundsException e2) {
            throw w1.c(null, e2);
        }
    }

    @Override // c.f.a.b.e3.g1.o0.e
    public void c(long j2, int i2) {
    }

    @Override // c.f.a.b.e3.g1.o0.e
    public void d(l lVar, int i2) {
        a0 a0VarE = lVar.e(i2, 2);
        this.f7649d = a0VarE;
        ((a0) x0.i(a0VarE)).e(this.f7648c.f7663c);
    }

    @RequiresNonNull({"trackOutput"})
    public final void f(i0 i0Var, int i2) {
        byte b2 = i0Var.d()[0];
        byte b3 = i0Var.d()[1];
        int i3 = (b2 & 224) | (b3 & 31);
        boolean z = (b3 & 128) > 0;
        boolean z2 = (b3 & 64) > 0;
        if (z) {
            this.f7653h += j();
            i0Var.d()[1] = (byte) i3;
            this.f7646a.M(i0Var.d());
            this.f7646a.P(1);
        } else {
            int i4 = (this.f7652g + 1) % 65535;
            if (i2 != i4) {
                z.i("RtpH264Reader", x0.D("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(i4), Integer.valueOf(i2)));
                return;
            } else {
                this.f7646a.M(i0Var.d());
                this.f7646a.P(2);
            }
        }
        int iA = this.f7646a.a();
        this.f7649d.c(this.f7646a, iA);
        this.f7653h += iA;
        if (z2) {
            this.f7650e = e(i3 & 31);
        }
    }

    @RequiresNonNull({"trackOutput"})
    public final void g(i0 i0Var) {
        int iA = i0Var.a();
        this.f7653h += j();
        this.f7649d.c(i0Var, iA);
        this.f7653h += iA;
        this.f7650e = e(i0Var.d()[0] & 31);
    }

    @RequiresNonNull({"trackOutput"})
    public final void h(i0 i0Var) {
        i0Var.D();
        while (i0Var.a() > 4) {
            int iJ = i0Var.J();
            this.f7653h += j();
            this.f7649d.c(i0Var, iJ);
            this.f7653h += iJ;
        }
        this.f7650e = 0;
    }

    public final int j() {
        this.f7647b.P(0);
        int iA = this.f7647b.a();
        ((a0) g.e(this.f7649d)).c(this.f7647b, iA);
        return iA;
    }
}
