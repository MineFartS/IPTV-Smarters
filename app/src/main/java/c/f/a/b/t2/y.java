package c.f.a.b.t2;

import android.media.AudioTrack;
import android.os.SystemClock;
import c.f.a.b.j3.x0;
import c.f.a.b.w0;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f10198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f10199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioTrack f10200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x f10203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f10206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f10207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f10209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f10210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Method f10211n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10212o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public int v;
    public int w;
    public long x;
    public long y;
    public long z;

    public interface a {
        void a(int i2, long j2);

        void b(long j2);

        void c(long j2);

        void d(long j2, long j3, long j4, long j5);

        void e(long j2, long j3, long j4, long j5);
    }

    public y(a aVar) {
        this.f10198a = (a) c.f.a.b.j3.g.e(aVar);
        if (x0.f9296a >= 18) {
            try {
                this.f10211n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f10199b = new long[10];
    }

    public static boolean p(int i2) {
        return x0.f9296a < 23 && (i2 == 5 || i2 == 6);
    }

    public final boolean a() {
        return this.f10205h && ((AudioTrack) c.f.a.b.j3.g.e(this.f10200c)).getPlayState() == 2 && f() == 0;
    }

    public final long b(long j2) {
        return (j2 * 1000000) / ((long) this.f10204g);
    }

    public int c(long j2) {
        return this.f10202e - ((int) (j2 - (f() * ((long) this.f10201d))));
    }

    public long d(boolean z) {
        long jG;
        if (((AudioTrack) c.f.a.b.j3.g.e(this.f10200c)).getPlayState() == 3) {
            n();
        }
        long jNanoTime = System.nanoTime() / 1000;
        x xVar = (x) c.f.a.b.j3.g.e(this.f10203f);
        boolean zD = xVar.d();
        if (zD) {
            jG = b(xVar.b()) + x0.Y(jNanoTime - xVar.c(), this.f10207j);
        } else {
            jG = this.w == 0 ? g() : this.f10209l + jNanoTime;
            if (!z) {
                jG = Math.max(0L, jG - this.f10212o);
            }
        }
        if (this.D != zD) {
            this.F = this.C;
            this.E = this.B;
        }
        long j2 = jNanoTime - this.F;
        if (j2 < 1000000) {
            long jY = this.E + x0.Y(j2, this.f10207j);
            long j3 = (j2 * 1000) / 1000000;
            jG = ((jG * j3) + ((1000 - j3) * jY)) / 1000;
        }
        if (!this.f10208k) {
            long j4 = this.B;
            if (jG > j4) {
                this.f10208k = true;
                this.f10198a.b(System.currentTimeMillis() - w0.e(x0.d0(w0.e(jG - j4), this.f10207j)));
            }
        }
        this.C = jNanoTime;
        this.B = jG;
        this.D = zD;
        return jG;
    }

    public long e(long j2) {
        return w0.e(b(j2 - f()));
    }

    public final long f() {
        AudioTrack audioTrack = (AudioTrack) c.f.a.b.j3.g.e(this.f10200c);
        if (this.x != -9223372036854775807L) {
            return Math.min(this.A, this.z + ((((SystemClock.elapsedRealtime() * 1000) - this.x) * ((long) this.f10204g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f10205h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.u = this.s;
            }
            playbackHeadPosition += this.u;
        }
        if (x0.f9296a <= 29) {
            if (playbackHeadPosition == 0 && this.s > 0 && playState == 3) {
                if (this.y == -9223372036854775807L) {
                    this.y = SystemClock.elapsedRealtime();
                }
                return this.s;
            }
            this.y = -9223372036854775807L;
        }
        if (this.s > playbackHeadPosition) {
            this.t++;
        }
        this.s = playbackHeadPosition;
        return playbackHeadPosition + (this.t << 32);
    }

    public final long g() {
        return b(f());
    }

    public void h(long j2) {
        this.z = f();
        this.x = SystemClock.elapsedRealtime() * 1000;
        this.A = j2;
    }

    public boolean i(long j2) {
        return j2 > f() || a();
    }

    public boolean j() {
        return ((AudioTrack) c.f.a.b.j3.g.e(this.f10200c)).getPlayState() == 3;
    }

    public boolean k(long j2) {
        return this.y != -9223372036854775807L && j2 > 0 && SystemClock.elapsedRealtime() - this.y >= 200;
    }

    public boolean l(long j2) {
        int playState = ((AudioTrack) c.f.a.b.j3.g.e(this.f10200c)).getPlayState();
        if (this.f10205h) {
            if (playState == 2) {
                this.p = false;
                return false;
            }
            if (playState == 1 && f() == 0) {
                return false;
            }
        }
        boolean z = this.p;
        boolean zI = i(j2);
        this.p = zI;
        if (z && !zI && playState != 1) {
            this.f10198a.a(this.f10202e, w0.e(this.f10206i));
        }
        return true;
    }

    public final void m(long j2, long j3) {
        x xVar = (x) c.f.a.b.j3.g.e(this.f10203f);
        if (xVar.e(j2)) {
            long jC = xVar.c();
            long jB = xVar.b();
            if (Math.abs(jC - j2) > 5000000) {
                this.f10198a.e(jB, jC, j2, j3);
            } else {
                if (Math.abs(b(jB) - j3) <= 5000000) {
                    xVar.a();
                    return;
                }
                this.f10198a.d(jB, jC, j2, j3);
            }
            xVar.f();
        }
    }

    public final void n() {
        long jG = g();
        if (jG == 0) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.f10210m >= 30000) {
            long[] jArr = this.f10199b;
            int i2 = this.v;
            jArr[i2] = jG - jNanoTime;
            this.v = (i2 + 1) % 10;
            int i3 = this.w;
            if (i3 < 10) {
                this.w = i3 + 1;
            }
            this.f10210m = jNanoTime;
            this.f10209l = 0L;
            int i4 = 0;
            while (true) {
                int i5 = this.w;
                if (i4 >= i5) {
                    break;
                }
                this.f10209l += this.f10199b[i4] / ((long) i5);
                i4++;
            }
        }
        if (this.f10205h) {
            return;
        }
        m(jNanoTime, jG);
        o(jNanoTime);
    }

    public final void o(long j2) {
        Method method;
        if (!this.q || (method = this.f10211n) == null || j2 - this.r < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) x0.i((Integer) method.invoke(c.f.a.b.j3.g.e(this.f10200c), new Object[0]))).intValue()) * 1000) - this.f10206i;
            this.f10212o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f10212o = jMax;
            if (jMax > 5000000) {
                this.f10198a.c(jMax);
                this.f10212o = 0L;
            }
        } catch (Exception unused) {
            this.f10211n = null;
        }
        this.r = j2;
    }

    public boolean q() {
        s();
        if (this.x != -9223372036854775807L) {
            return false;
        }
        ((x) c.f.a.b.j3.g.e(this.f10203f)).g();
        return true;
    }

    public void r() {
        s();
        this.f10200c = null;
        this.f10203f = null;
    }

    public final void s() {
        this.f10209l = 0L;
        this.w = 0;
        this.v = 0;
        this.f10210m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f10208k = false;
    }

    public void t(AudioTrack audioTrack, boolean z, int i2, int i3, int i4) {
        this.f10200c = audioTrack;
        this.f10201d = i3;
        this.f10202e = i4;
        this.f10203f = new x(audioTrack);
        this.f10204g = audioTrack.getSampleRate();
        this.f10205h = z && p(i2);
        boolean zR0 = x0.r0(i2);
        this.q = zR0;
        this.f10206i = zR0 ? b(i4 / i3) : -9223372036854775807L;
        this.s = 0L;
        this.t = 0L;
        this.u = 0L;
        this.p = false;
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.r = 0L;
        this.f10212o = 0L;
        this.f10207j = 1.0f;
    }

    public void u(float f2) {
        this.f10207j = f2;
        x xVar = this.f10203f;
        if (xVar != null) {
            xVar.g();
        }
    }

    public void v() {
        ((x) c.f.a.b.j3.g.e(this.f10203f)).g();
    }
}
