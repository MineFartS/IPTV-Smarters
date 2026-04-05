package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class ot {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final os f22634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f22635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioTrack f22636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private or f22639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f22642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f22643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f22644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f22645l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f22646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Method f22647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f22648o;
    private boolean p;
    private boolean q;
    private long r;
    private long s;
    private long t;
    private long u;
    private int v;
    private int w;
    private long x;
    private long y;
    private long z;

    public ot(os osVar) {
        this.f22634a = osVar;
        if (amn.f20135a >= 18) {
            try {
                this.f22647n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f22635b = new long[10];
    }

    private final long m(long j2) {
        return (j2 * 1000000) / ((long) this.f22640g);
    }

    private final long n() {
        AudioTrack audioTrack = this.f22636c;
        ajr.b(audioTrack);
        if (this.x != -9223372036854775807L) {
            return Math.min(this.A, this.z + ((((SystemClock.elapsedRealtime() * 1000) - this.x) * ((long) this.f22640g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f22641h) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.u = this.s;
                }
                playState = 2;
            }
            playbackHeadPosition += this.u;
        }
        if (amn.f20135a <= 29) {
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

    private final long o() {
        return m(n());
    }

    private final void p() {
        this.f22645l = 0L;
        this.w = 0;
        this.v = 0;
        this.f22646m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f22644k = false;
    }

    public final int a(long j2) {
        return this.f22638e - ((int) (j2 - (n() * ((long) this.f22637d))));
    }

    public final long b(boolean z) {
        long jMax;
        long j2;
        Method method;
        AudioTrack audioTrack = this.f22636c;
        ajr.b(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            long jO = o();
            if (jO != 0) {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - this.f22646m >= 30000) {
                    long[] jArr = this.f22635b;
                    int i2 = this.v;
                    jArr[i2] = jO - jNanoTime;
                    this.v = (i2 + 1) % 10;
                    int i3 = this.w;
                    if (i3 < 10) {
                        this.w = i3 + 1;
                    }
                    this.f22646m = jNanoTime;
                    this.f22645l = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = this.w;
                        if (i4 >= i5) {
                            break;
                        }
                        this.f22645l += this.f22635b[i4] / ((long) i5);
                        i4++;
                    }
                }
                if (!this.f22641h) {
                    or orVar = this.f22639f;
                    ajr.b(orVar);
                    if (orVar.g(jNanoTime)) {
                        long jB = orVar.b();
                        long jA = orVar.a();
                        if (Math.abs(jB - jNanoTime) > 5000000) {
                            j2 = jNanoTime;
                            this.f22634a.d(jA, jB, jNanoTime, jO);
                        } else {
                            j2 = jNanoTime;
                            if (Math.abs(m(jA) - jO) > 5000000) {
                                this.f22634a.c(jA, jB, j2, jO);
                            } else {
                                orVar.c();
                            }
                        }
                        orVar.d();
                    } else {
                        j2 = jNanoTime;
                    }
                    if (this.q && (method = this.f22647n) != null) {
                        long j3 = j2;
                        if (j3 - this.r >= 500000) {
                            try {
                                AudioTrack audioTrack2 = this.f22636c;
                                ajr.b(audioTrack2);
                                Integer num = (Integer) method.invoke(audioTrack2, new Object[0]);
                                int i6 = amn.f20135a;
                                long jIntValue = (((long) num.intValue()) * 1000) - this.f22642i;
                                this.f22648o = jIntValue;
                                long jMax2 = Math.max(jIntValue, 0L);
                                this.f22648o = jMax2;
                                if (jMax2 > 5000000) {
                                    this.f22634a.a(jMax2);
                                    this.f22648o = 0L;
                                }
                            } catch (Exception unused) {
                                this.f22647n = null;
                            }
                            this.r = j3;
                        }
                    }
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        or orVar2 = this.f22639f;
        ajr.b(orVar2);
        boolean zF = orVar2.f();
        if (zF) {
            jMax = m(orVar2.a()) + amn.l(jNanoTime2 - orVar2.b(), this.f22643j);
        } else {
            long jO2 = this.w == 0 ? o() : this.f22645l + jNanoTime2;
            jMax = !z ? Math.max(0L, jO2 - this.f22648o) : jO2;
        }
        if (this.D != zF) {
            this.F = this.C;
            this.E = this.B;
        }
        long j4 = jNanoTime2 - this.F;
        if (j4 < 1000000) {
            long j5 = (j4 * 1000) / 1000000;
            jMax = ((jMax * j5) + ((1000 - j5) * (this.E + amn.l(j4, this.f22643j)))) / 1000;
        }
        if (!this.f22644k) {
            long j6 = this.B;
            if (jMax > j6) {
                this.f22644k = true;
                this.f22634a.b(System.currentTimeMillis() - iw.c(amn.n(iw.c(jMax - j6), this.f22643j)));
            }
        }
        this.C = jNanoTime2;
        this.B = jMax;
        this.D = zF;
        return jMax;
    }

    public final long c(long j2) {
        return iw.c(m(j2 - n()));
    }

    public final void d(long j2) {
        this.z = n();
        this.x = SystemClock.elapsedRealtime() * 1000;
        this.A = j2;
    }

    public final void e() {
        p();
        this.f22636c = null;
        this.f22639f = null;
    }

    public final void f(AudioTrack audioTrack, boolean z, int i2, int i3, int i4) {
        this.f22636c = audioTrack;
        this.f22637d = i3;
        this.f22638e = i4;
        this.f22639f = new or(audioTrack);
        this.f22640g = audioTrack.getSampleRate();
        boolean z2 = true;
        if (!z || amn.f20135a >= 23 || (i2 != 5 && i2 != 6)) {
            z2 = false;
        }
        this.f22641h = z2;
        boolean zR = amn.R(i2);
        this.q = zR;
        this.f22642i = zR ? m(i4 / i3) : -9223372036854775807L;
        this.s = 0L;
        this.t = 0L;
        this.u = 0L;
        this.p = false;
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.r = 0L;
        this.f22648o = 0L;
        this.f22643j = 1.0f;
    }

    public final void g() {
        or orVar = this.f22639f;
        ajr.b(orVar);
        orVar.e();
    }

    public final boolean h(long j2) {
        if (j2 > n()) {
            return true;
        }
        if (!this.f22641h) {
            return false;
        }
        AudioTrack audioTrack = this.f22636c;
        ajr.b(audioTrack);
        return audioTrack.getPlayState() == 2 && n() == 0;
    }

    public final boolean i() {
        AudioTrack audioTrack = this.f22636c;
        ajr.b(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    public final boolean j(long j2) {
        return this.y != -9223372036854775807L && j2 > 0 && SystemClock.elapsedRealtime() - this.y >= 200;
    }

    public final boolean k(long j2) {
        AudioTrack audioTrack = this.f22636c;
        ajr.b(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.f22641h) {
            if (playState == 2) {
                this.p = false;
                return false;
            }
            if (playState == 1) {
                if (n() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.p;
        boolean zH = h(j2);
        this.p = zH;
        if (z && !zH && playState != 1) {
            this.f22634a.e(this.f22638e, iw.c(this.f22642i));
        }
        return true;
    }

    public final boolean l() {
        p();
        if (this.x != -9223372036854775807L) {
            return false;
        }
        or orVar = this.f22639f;
        ajr.b(orVar);
        orVar.e();
        return true;
    }
}
