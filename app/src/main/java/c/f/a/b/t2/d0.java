package c.f.a.b.t2;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.t2.s;
import c.f.a.b.t2.v;
import c.f.a.b.t2.y;
import c.f.a.b.z1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f10007a = false;
    public long A;
    public long B;
    public long C;
    public long D;
    public int E;
    public boolean F;
    public boolean G;
    public long H;
    public float I;
    public s[] J;
    public ByteBuffer[] K;
    public ByteBuffer L;
    public int M;
    public ByteBuffer N;
    public byte[] O;
    public int P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public z W;
    public boolean X;
    public long Y;
    public boolean Z;
    public boolean a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f10008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f10009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f10011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0 f10012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s[] f10013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s[] f10014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConditionVariable f10015i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y f10016j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayDeque<f> f10017k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f10018l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10019m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f10020n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g<v.b> f10021o;
    public final g<v.e> p;
    public v.c q;
    public c r;
    public c s;
    public AudioTrack t;
    public p u;
    public f v;
    public f w;
    public z1 x;
    public ByteBuffer y;
    public int z;

    public class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AudioTrack f10022b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, AudioTrack audioTrack) {
            super(str);
            this.f10022b = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f10022b.flush();
                this.f10022b.release();
            } finally {
                d0.this.f10015i.open();
            }
        }
    }

    public interface b {
        z1 a(z1 z1Var);

        long b(long j2);

        long c();

        boolean d(boolean z);

        s[] e();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k1 f10024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f10027d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f10028e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f10029f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f10030g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f10031h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final s[] f10032i;

        public c(k1 k1Var, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, s[] sVarArr) {
            this.f10024a = k1Var;
            this.f10025b = i2;
            this.f10026c = i3;
            this.f10027d = i4;
            this.f10028e = i5;
            this.f10029f = i6;
            this.f10030g = i7;
            this.f10032i = sVarArr;
            this.f10031h = c(i8, z);
        }

        public static AudioAttributes j(p pVar, boolean z) {
            return z ? k() : pVar.a();
        }

        public static AudioAttributes k() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        public AudioTrack a(boolean z, p pVar, int i2) throws v.b {
            try {
                AudioTrack audioTrackD = d(z, pVar, i2);
                int state = audioTrackD.getState();
                if (state == 1) {
                    return audioTrackD;
                }
                try {
                    audioTrackD.release();
                } catch (Exception unused) {
                }
                throw new v.b(state, this.f10028e, this.f10029f, this.f10031h, this.f10024a, o(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e2) {
                throw new v.b(0, this.f10028e, this.f10029f, this.f10031h, this.f10024a, o(), e2);
            }
        }

        public boolean b(c cVar) {
            return cVar.f10026c == this.f10026c && cVar.f10030g == this.f10030g && cVar.f10028e == this.f10028e && cVar.f10029f == this.f10029f && cVar.f10027d == this.f10027d;
        }

        public final int c(int i2, boolean z) {
            long j2;
            if (i2 != 0) {
                return i2;
            }
            int i3 = this.f10026c;
            if (i3 == 0) {
                return m(z ? 8.0f : 1.0f);
            }
            if (i3 == 1) {
                j2 = 50000000;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException();
                }
                j2 = 250000;
            }
            return l(j2);
        }

        public final AudioTrack d(boolean z, p pVar, int i2) {
            int i3 = x0.f9296a;
            return i3 >= 29 ? f(z, pVar, i2) : i3 >= 21 ? e(z, pVar, i2) : g(pVar, i2);
        }

        public final AudioTrack e(boolean z, p pVar, int i2) {
            return new AudioTrack(j(pVar, z), d0.I(this.f10028e, this.f10029f, this.f10030g), this.f10031h, 1, i2);
        }

        public final AudioTrack f(boolean z, p pVar, int i2) {
            return new AudioTrack.Builder().setAudioAttributes(j(pVar, z)).setAudioFormat(d0.I(this.f10028e, this.f10029f, this.f10030g)).setTransferMode(1).setBufferSizeInBytes(this.f10031h).setSessionId(i2).setOffloadedPlayback(this.f10026c == 1).build();
        }

        public final AudioTrack g(p pVar, int i2) {
            int iE0 = x0.e0(pVar.f10158e);
            int i3 = this.f10028e;
            int i4 = this.f10029f;
            int i5 = this.f10030g;
            int i6 = this.f10031h;
            return i2 == 0 ? new AudioTrack(iE0, i3, i4, i5, i6, 1) : new AudioTrack(iE0, i3, i4, i5, i6, 1, i2);
        }

        public long h(long j2) {
            return (j2 * ((long) this.f10028e)) / 1000000;
        }

        public long i(long j2) {
            return (j2 * 1000000) / ((long) this.f10028e);
        }

        public final int l(long j2) {
            int iO = d0.O(this.f10030g);
            if (this.f10030g == 5) {
                iO *= 2;
            }
            return (int) ((j2 * ((long) iO)) / 1000000);
        }

        public final int m(float f2) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.f10028e, this.f10029f, this.f10030g);
            c.f.a.b.j3.g.g(minBufferSize != -2);
            int iR = x0.r(minBufferSize * 4, ((int) h(250000L)) * this.f10027d, Math.max(minBufferSize, ((int) h(750000L)) * this.f10027d));
            return f2 != 1.0f ? Math.round(iR * f2) : iR;
        }

        public long n(long j2) {
            return (j2 * 1000000) / ((long) this.f10024a.A);
        }

        public boolean o() {
            return this.f10026c == 1;
        }
    }

    public static class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s[] f10033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k0 f10034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final m0 f10035c;

        public d(s... sVarArr) {
            this(sVarArr, new k0(), new m0());
        }

        public d(s[] sVarArr, k0 k0Var, m0 m0Var) {
            s[] sVarArr2 = new s[sVarArr.length + 2];
            this.f10033a = sVarArr2;
            System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            this.f10034b = k0Var;
            this.f10035c = m0Var;
            sVarArr2[sVarArr.length] = k0Var;
            sVarArr2[sVarArr.length + 1] = m0Var;
        }

        @Override // c.f.a.b.t2.d0.b
        public z1 a(z1 z1Var) {
            this.f10035c.h(z1Var.f10622c);
            this.f10035c.g(z1Var.f10623d);
            return z1Var;
        }

        @Override // c.f.a.b.t2.d0.b
        public long b(long j2) {
            return this.f10035c.f(j2);
        }

        @Override // c.f.a.b.t2.d0.b
        public long c() {
            return this.f10034b.o();
        }

        @Override // c.f.a.b.t2.d0.b
        public boolean d(boolean z) {
            this.f10034b.u(z);
            return z;
        }

        @Override // c.f.a.b.t2.d0.b
        public s[] e() {
            return this.f10033a;
        }
    }

    public static final class e extends RuntimeException {
        public e(String str) {
            super(str);
        }

        public /* synthetic */ e(String str, a aVar) {
            this(str);
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z1 f10036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f10037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f10038c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f10039d;

        public f(z1 z1Var, boolean z, long j2, long j3) {
            this.f10036a = z1Var;
            this.f10037b = z;
            this.f10038c = j2;
            this.f10039d = j3;
        }

        public /* synthetic */ f(z1 z1Var, boolean z, long j2, long j3, a aVar) {
            this(z1Var, z, j2, j3);
        }
    }

    public static final class g<T extends Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public T f10041b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f10042c;

        public g(long j2) {
            this.f10040a = j2;
        }

        public void a() {
            this.f10041b = null;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void b(T t) throws T {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f10041b == null) {
                this.f10041b = t;
                this.f10042c = this.f10040a + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f10042c) {
                T t2 = this.f10041b;
                T t3 = this.f10041b;
                a();
                throw t3;
            }
        }
    }

    public final class h implements y.a {
        public h() {
        }

        public /* synthetic */ h(d0 d0Var, a aVar) {
            this();
        }

        @Override // c.f.a.b.t2.y.a
        public void a(int i2, long j2) {
            if (d0.this.q != null) {
                d0.this.q.d(i2, j2, SystemClock.elapsedRealtime() - d0.this.Y);
            }
        }

        @Override // c.f.a.b.t2.y.a
        public void b(long j2) {
            if (d0.this.q != null) {
                d0.this.q.b(j2);
            }
        }

        @Override // c.f.a.b.t2.y.a
        public void c(long j2) {
            c.f.a.b.j3.z.i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j2);
        }

        @Override // c.f.a.b.t2.y.a
        public void d(long j2, long j3, long j4, long j5) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j2 + ", " + j3 + ", " + j4 + ", " + j5 + ", " + d0.this.R() + ", " + d0.this.S();
            if (d0.f10007a) {
                throw new e(str, null);
            }
            c.f.a.b.j3.z.i("DefaultAudioSink", str);
        }

        @Override // c.f.a.b.t2.y.a
        public void e(long j2, long j3, long j4, long j5) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j2 + ", " + j3 + ", " + j4 + ", " + j5 + ", " + d0.this.R() + ", " + d0.this.S();
            if (d0.f10007a) {
                throw new e(str, null);
            }
            c.f.a.b.j3.z.i("DefaultAudioSink", str);
        }
    }

    public final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f10044a = new Handler();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AudioTrack.StreamEventCallback f10045b;

        public class a extends AudioTrack.StreamEventCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d0 f10047a;

            public a(d0 d0Var) {
                this.f10047a = d0Var;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i2) {
                c.f.a.b.j3.g.g(audioTrack == d0.this.t);
                if (d0.this.q == null || !d0.this.T) {
                    return;
                }
                d0.this.q.g();
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                c.f.a.b.j3.g.g(audioTrack == d0.this.t);
                if (d0.this.q == null || !d0.this.T) {
                    return;
                }
                d0.this.q.g();
            }
        }

        public i() {
            this.f10045b = new a(d0.this);
        }

        public void a(AudioTrack audioTrack) {
            final Handler handler = this.f10044a;
            handler.getClass();
            audioTrack.registerStreamEventCallback(new Executor() { // from class: c.f.a.b.t2.l
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.f10045b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f10045b);
            this.f10044a.removeCallbacksAndMessages(null);
        }
    }

    public d0(q qVar, b bVar, boolean z, boolean z2, int i2) {
        this.f10008b = qVar;
        this.f10009c = (b) c.f.a.b.j3.g.e(bVar);
        int i3 = x0.f9296a;
        this.f10010d = i3 >= 21 && z;
        this.f10018l = i3 >= 23 && z2;
        this.f10019m = i3 < 29 ? 0 : i2;
        this.f10015i = new ConditionVariable(true);
        this.f10016j = new y(new h(this, null));
        b0 b0Var = new b0();
        this.f10011e = b0Var;
        n0 n0Var = new n0();
        this.f10012f = n0Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new j0(), b0Var, n0Var);
        Collections.addAll(arrayList, bVar.e());
        this.f10013g = (s[]) arrayList.toArray(new s[0]);
        this.f10014h = new s[]{new f0()};
        this.I = 1.0f;
        this.u = p.f10154a;
        this.V = 0;
        this.W = new z(0, 0.0f);
        z1 z1Var = z1.f10620a;
        this.w = new f(z1Var, false, 0L, 0L, null);
        this.x = z1Var;
        this.Q = -1;
        this.J = new s[0];
        this.K = new ByteBuffer[0];
        this.f10017k = new ArrayDeque<>();
        this.f10021o = new g<>(100L);
        this.p = new g<>(100L);
    }

    public d0(q qVar, s[] sVarArr) {
        this(qVar, sVarArr, false);
    }

    public d0(q qVar, s[] sVarArr, boolean z) {
        this(qVar, new d(sVarArr), z, false, 0);
    }

    public static AudioFormat I(int i2, int i3, int i4) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    public static int K(int i2) {
        int i3 = x0.f9296a;
        if (i3 <= 28) {
            if (i2 == 7) {
                i2 = 8;
            } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                i2 = 6;
            }
        }
        if (i3 <= 26 && "fugu".equals(x0.f9297b) && i2 == 1) {
            i2 = 2;
        }
        return x0.H(i2);
    }

    public static Pair<Integer, Integer> L(k1 k1Var, q qVar) {
        if (qVar == null) {
            return null;
        }
        int iF = c.f.a.b.j3.d0.f((String) c.f.a.b.j3.g.e(k1Var.f9338m), k1Var.f9335j);
        int iN = 6;
        if (!(iF == 5 || iF == 6 || iF == 18 || iF == 17 || iF == 7 || iF == 8 || iF == 14)) {
            return null;
        }
        if (iF == 18 && !qVar.f(18)) {
            iF = 6;
        } else if (iF == 8 && !qVar.f(8)) {
            iF = 7;
        }
        if (!qVar.f(iF)) {
            return null;
        }
        if (iF != 18) {
            iN = k1Var.z;
            if (iN > qVar.e()) {
                return null;
            }
        } else if (x0.f9296a >= 29 && (iN = N(18, k1Var.A)) == 0) {
            c.f.a.b.j3.z.i("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
            return null;
        }
        int iK = K(iN);
        if (iK == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iF), Integer.valueOf(iK));
    }

    public static int M(int i2, ByteBuffer byteBuffer) {
        switch (i2) {
            case 5:
            case 6:
            case 18:
                return n.d(byteBuffer);
            case 7:
            case 8:
                return e0.e(byteBuffer);
            case 9:
                int iM = h0.m(x0.I(byteBuffer, byteBuffer.position()));
                if (iM != -1) {
                    return iM;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i2);
            case 14:
                int iA = n.a(byteBuffer);
                if (iA == -1) {
                    return 0;
                }
                return n.h(byteBuffer, iA) * 16;
            case 15:
                return IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
            case 16:
                return 1024;
            case 17:
                return o.c(byteBuffer);
        }
    }

    public static int N(int i2, int i3) {
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i4 = 8; i4 > 0; i4--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i3).setChannelMask(x0.H(i4)).build(), audioAttributesBuild)) {
                return i4;
            }
        }
        return 0;
    }

    public static int O(int i2) {
        switch (i2) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    public static boolean U(int i2) {
        return (x0.f9296a >= 24 && i2 == -6) || i2 == -32;
    }

    public static boolean W() {
        return x0.f9296a >= 30 && x0.f9299d.startsWith("Pixel");
    }

    public static boolean X(AudioTrack audioTrack) {
        return x0.f9296a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public static boolean Y(k1 k1Var, q qVar) {
        return L(k1Var, qVar) != null;
    }

    public static void h0(AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }

    public static void i0(AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    public static int o0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }

    public final void C(long j2) {
        z1 z1VarA = k0() ? this.f10009c.a(J()) : z1.f10620a;
        boolean zD = k0() ? this.f10009c.d(Q()) : false;
        this.f10017k.add(new f(z1VarA, zD, Math.max(0L, j2), this.s.i(S()), null));
        j0();
        v.c cVar = this.q;
        if (cVar != null) {
            cVar.a(zD);
        }
    }

    public final long D(long j2) {
        while (!this.f10017k.isEmpty() && j2 >= this.f10017k.getFirst().f10039d) {
            this.w = this.f10017k.remove();
        }
        f fVar = this.w;
        long j3 = j2 - fVar.f10039d;
        if (fVar.f10036a.equals(z1.f10620a)) {
            return this.w.f10038c + j3;
        }
        if (this.f10017k.isEmpty()) {
            return this.w.f10038c + this.f10009c.b(j3);
        }
        f first = this.f10017k.getFirst();
        return first.f10038c - x0.Y(first.f10039d - j2, this.w.f10036a.f10622c);
    }

    public final long E(long j2) {
        return j2 + this.s.i(this.f10009c.c());
    }

    public final AudioTrack F() throws v.b {
        try {
            return ((c) c.f.a.b.j3.g.e(this.s)).a(this.X, this.u, this.V);
        } catch (v.b e2) {
            Z();
            v.c cVar = this.q;
            if (cVar != null) {
                cVar.c(e2);
            }
            throw e2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean G() throws T, c.f.a.b.t2.v.e {
        /*
            r9 = this;
            int r0 = r9.Q
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.Q = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.Q
            c.f.a.b.t2.s[] r5 = r9.J
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.e()
        L1f:
            r9.b0(r7)
            boolean r0 = r4.b()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.Q
            int r0 = r0 + r2
            r9.Q = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.N
            if (r0 == 0) goto L3b
            r9.n0(r0, r7)
            java.nio.ByteBuffer r0 = r9.N
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.Q = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.t2.d0.G():boolean");
    }

    public final void H() {
        int i2 = 0;
        while (true) {
            s[] sVarArr = this.J;
            if (i2 >= sVarArr.length) {
                return;
            }
            s sVar = sVarArr[i2];
            sVar.flush();
            this.K[i2] = sVar.a();
            i2++;
        }
    }

    public final z1 J() {
        return P().f10036a;
    }

    public final f P() {
        f fVar = this.v;
        return fVar != null ? fVar : !this.f10017k.isEmpty() ? this.f10017k.getLast() : this.w;
    }

    public boolean Q() {
        return P().f10037b;
    }

    public final long R() {
        c cVar = this.s;
        return cVar.f10026c == 0 ? this.A / ((long) cVar.f10025b) : this.B;
    }

    public final long S() {
        c cVar = this.s;
        return cVar.f10026c == 0 ? this.C / ((long) cVar.f10027d) : this.D;
    }

    public final void T() throws v.b {
        this.f10015i.block();
        AudioTrack audioTrackF = F();
        this.t = audioTrackF;
        if (X(audioTrackF)) {
            c0(this.t);
            if (this.f10019m != 3) {
                AudioTrack audioTrack = this.t;
                k1 k1Var = this.s.f10024a;
                audioTrack.setOffloadDelayPadding(k1Var.C, k1Var.D);
            }
        }
        this.V = this.t.getAudioSessionId();
        y yVar = this.f10016j;
        AudioTrack audioTrack2 = this.t;
        c cVar = this.s;
        yVar.t(audioTrack2, cVar.f10026c == 2, cVar.f10030g, cVar.f10027d, cVar.f10031h);
        g0();
        int i2 = this.W.f10213a;
        if (i2 != 0) {
            this.t.attachAuxEffect(i2);
            this.t.setAuxEffectSendLevel(this.W.f10214b);
        }
        this.G = true;
    }

    public final boolean V() {
        return this.t != null;
    }

    public final void Z() {
        if (this.s.o()) {
            this.Z = true;
        }
    }

    @Override // c.f.a.b.t2.v
    public boolean a(k1 k1Var) {
        return o(k1Var) != 0;
    }

    public final void a0() {
        if (this.S) {
            return;
        }
        this.S = true;
        this.f10016j.h(S());
        this.t.stop();
        this.z = 0;
    }

    @Override // c.f.a.b.t2.v
    public boolean b() {
        return !V() || (this.R && !f());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    public final void b0(long j2) throws T, v.e {
        ByteBuffer byteBuffer;
        int length = this.J.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.K[i2 - 1];
            } else {
                byteBuffer = this.L;
                if (byteBuffer == null) {
                    byteBuffer = s.f10170a;
                }
            }
            if (i2 == length) {
                n0(byteBuffer, j2);
            } else {
                s sVar = this.J[i2];
                if (i2 > this.Q) {
                    sVar.c(byteBuffer);
                }
                ByteBuffer byteBufferA = sVar.a();
                this.K[i2] = byteBufferA;
                if (byteBufferA.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i2--;
            }
        }
    }

    @Override // c.f.a.b.t2.v
    public z1 c() {
        return this.f10018l ? this.x : J();
    }

    public final void c0(AudioTrack audioTrack) {
        if (this.f10020n == null) {
            this.f10020n = new i();
        }
        this.f10020n.a(audioTrack);
    }

    @Override // c.f.a.b.t2.v
    public void d(z1 z1Var) {
        z1 z1Var2 = new z1(x0.q(z1Var.f10622c, 0.1f, 8.0f), x0.q(z1Var.f10623d, 0.1f, 8.0f));
        if (!this.f10018l || x0.f9296a < 23) {
            e0(z1Var2, Q());
        } else {
            f0(z1Var2);
        }
    }

    public final void d0() {
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.a0 = false;
        this.E = 0;
        this.w = new f(J(), Q(), 0L, 0L, null);
        this.H = 0L;
        this.v = null;
        this.f10017k.clear();
        this.L = null;
        this.M = 0;
        this.N = null;
        this.S = false;
        this.R = false;
        this.Q = -1;
        this.y = null;
        this.z = 0;
        this.f10012f.m();
        H();
    }

    @Override // c.f.a.b.t2.v
    public void e() {
        if (!this.R && V() && G()) {
            a0();
            this.R = true;
        }
    }

    public final void e0(z1 z1Var, boolean z) {
        f fVarP = P();
        if (z1Var.equals(fVarP.f10036a) && z == fVarP.f10037b) {
            return;
        }
        f fVar = new f(z1Var, z, -9223372036854775807L, -9223372036854775807L, null);
        if (V()) {
            this.v = fVar;
        } else {
            this.w = fVar;
        }
    }

    @Override // c.f.a.b.t2.v
    public boolean f() {
        return V() && this.f10016j.i(S());
    }

    public final void f0(z1 z1Var) {
        if (V()) {
            try {
                this.t.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(z1Var.f10622c).setPitch(z1Var.f10623d).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                c.f.a.b.j3.z.j("DefaultAudioSink", "Failed to set playback params", e2);
            }
            z1Var = new z1(this.t.getPlaybackParams().getSpeed(), this.t.getPlaybackParams().getPitch());
            this.f10016j.u(z1Var.f10622c);
        }
        this.x = z1Var;
    }

    @Override // c.f.a.b.t2.v
    public void flush() {
        if (V()) {
            d0();
            if (this.f10016j.j()) {
                this.t.pause();
            }
            if (X(this.t)) {
                ((i) c.f.a.b.j3.g.e(this.f10020n)).b(this.t);
            }
            AudioTrack audioTrack = this.t;
            this.t = null;
            if (x0.f9296a < 21 && !this.U) {
                this.V = 0;
            }
            c cVar = this.r;
            if (cVar != null) {
                this.s = cVar;
                this.r = null;
            }
            this.f10016j.r();
            this.f10015i.close();
            new a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.p.a();
        this.f10021o.a();
    }

    @Override // c.f.a.b.t2.v
    public void g(int i2) {
        if (this.V != i2) {
            this.V = i2;
            this.U = i2 != 0;
            flush();
        }
    }

    public final void g0() {
        if (V()) {
            if (x0.f9296a >= 21) {
                h0(this.t, this.I);
            } else {
                i0(this.t, this.I);
            }
        }
    }

    @Override // c.f.a.b.t2.v
    public long h(boolean z) {
        if (!V() || this.G) {
            return Long.MIN_VALUE;
        }
        return E(D(Math.min(this.f10016j.d(z), this.s.i(S()))));
    }

    @Override // c.f.a.b.t2.v
    public void i() {
        if (this.X) {
            this.X = false;
            flush();
        }
    }

    @Override // c.f.a.b.t2.v
    public void j(p pVar) {
        if (this.u.equals(pVar)) {
            return;
        }
        this.u = pVar;
        if (this.X) {
            return;
        }
        flush();
    }

    public final void j0() {
        s[] sVarArr = this.s.f10032i;
        ArrayList arrayList = new ArrayList();
        for (s sVar : sVarArr) {
            if (sVar.isActive()) {
                arrayList.add(sVar);
            } else {
                sVar.flush();
            }
        }
        int size = arrayList.size();
        this.J = (s[]) arrayList.toArray(new s[size]);
        this.K = new ByteBuffer[size];
        H();
    }

    @Override // c.f.a.b.t2.v
    public void k() {
        this.F = true;
    }

    public final boolean k0() {
        return (this.X || !"audio/raw".equals(this.s.f10024a.f9338m) || l0(this.s.f10024a.B)) ? false : true;
    }

    @Override // c.f.a.b.t2.v
    public void l() {
        c.f.a.b.j3.g.g(x0.f9296a >= 21);
        c.f.a.b.j3.g.g(this.U);
        if (this.X) {
            return;
        }
        this.X = true;
        flush();
    }

    public final boolean l0(int i2) {
        return this.f10010d && x0.q0(i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    @Override // c.f.a.b.t2.v
    public boolean m(ByteBuffer byteBuffer, long j2, int i2) throws T, v.e, v.b {
        ByteBuffer byteBuffer2 = this.L;
        c.f.a.b.j3.g.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.r != null) {
            if (!G()) {
                return false;
            }
            if (this.r.b(this.s)) {
                this.s = this.r;
                this.r = null;
                if (X(this.t) && this.f10019m != 3) {
                    this.t.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.t;
                    k1 k1Var = this.s.f10024a;
                    audioTrack.setOffloadDelayPadding(k1Var.C, k1Var.D);
                    this.a0 = true;
                }
            } else {
                a0();
                if (f()) {
                    return false;
                }
                flush();
            }
            C(j2);
        }
        if (!V()) {
            try {
                T();
            } catch (v.b e2) {
                if (e2.f10180c) {
                    throw e2;
                }
                this.f10021o.b(e2);
                return false;
            }
        }
        this.f10021o.a();
        if (this.G) {
            this.H = Math.max(0L, j2);
            this.F = false;
            this.G = false;
            if (this.f10018l && x0.f9296a >= 23) {
                f0(this.x);
            }
            C(j2);
            if (this.T) {
                play();
            }
        }
        if (!this.f10016j.l(S())) {
            return false;
        }
        if (this.L == null) {
            c.f.a.b.j3.g.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            c cVar = this.s;
            if (cVar.f10026c != 0 && this.E == 0) {
                int iM = M(cVar.f10030g, byteBuffer);
                this.E = iM;
                if (iM == 0) {
                    return true;
                }
            }
            if (this.v != null) {
                if (!G()) {
                    return false;
                }
                C(j2);
                this.v = null;
            }
            long jN = this.H + this.s.n(R() - this.f10012f.l());
            if (!this.F && Math.abs(jN - j2) > 200000) {
                this.q.c(new v.d(j2, jN));
                this.F = true;
            }
            if (this.F) {
                if (!G()) {
                    return false;
                }
                long j3 = j2 - jN;
                this.H += j3;
                this.F = false;
                C(j2);
                v.c cVar2 = this.q;
                if (cVar2 != null && j3 != 0) {
                    cVar2.f();
                }
            }
            if (this.s.f10026c == 0) {
                this.A += (long) byteBuffer.remaining();
            } else {
                this.B += (long) (this.E * i2);
            }
            this.L = byteBuffer;
            this.M = i2;
        }
        b0(j2);
        if (!this.L.hasRemaining()) {
            this.L = null;
            this.M = 0;
            return true;
        }
        if (!this.f10016j.k(S())) {
            return false;
        }
        c.f.a.b.j3.z.i("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    public final boolean m0(k1 k1Var, p pVar) {
        int iF;
        int iH;
        if (x0.f9296a < 29 || this.f10019m == 0 || (iF = c.f.a.b.j3.d0.f((String) c.f.a.b.j3.g.e(k1Var.f9338m), k1Var.f9335j)) == 0 || (iH = x0.H(k1Var.z)) == 0 || !AudioManager.isOffloadedPlaybackSupported(I(k1Var.A, iH, iF), pVar.a())) {
            return false;
        }
        return ((k1Var.C != 0 || k1Var.D != 0) && (this.f10019m == 1) && !W()) ? false : true;
    }

    @Override // c.f.a.b.t2.v
    public void n(v.c cVar) {
        this.q = cVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    public final void n0(ByteBuffer byteBuffer, long j2) throws T, v.e {
        int iO0;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.N;
            if (byteBuffer2 != null) {
                c.f.a.b.j3.g.a(byteBuffer2 == byteBuffer);
            } else {
                this.N = byteBuffer;
                if (x0.f9296a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.O;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.O = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.O, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.P = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (x0.f9296a < 21) {
                int iC = this.f10016j.c(this.C);
                if (iC > 0) {
                    iO0 = this.t.write(this.O, this.P, Math.min(iRemaining2, iC));
                    if (iO0 > 0) {
                        this.P += iO0;
                        byteBuffer.position(byteBuffer.position() + iO0);
                    }
                } else {
                    iO0 = 0;
                }
            } else if (this.X) {
                c.f.a.b.j3.g.g(j2 != -9223372036854775807L);
                iO0 = p0(this.t, byteBuffer, iRemaining2, j2);
            } else {
                iO0 = o0(this.t, byteBuffer, iRemaining2);
            }
            this.Y = SystemClock.elapsedRealtime();
            if (iO0 < 0) {
                boolean zU = U(iO0);
                if (zU) {
                    Z();
                }
                v.e eVar = new v.e(iO0, this.s.f10024a, zU);
                v.c cVar = this.q;
                if (cVar != null) {
                    cVar.c(eVar);
                }
                if (eVar.f10185c) {
                    throw eVar;
                }
                this.p.b(eVar);
                return;
            }
            this.p.a();
            if (X(this.t)) {
                long j3 = this.D;
                if (j3 > 0) {
                    this.a0 = false;
                }
                if (this.T && this.q != null && iO0 < iRemaining2 && !this.a0) {
                    this.q.e(this.f10016j.e(j3));
                }
            }
            int i2 = this.s.f10026c;
            if (i2 == 0) {
                this.C += (long) iO0;
            }
            if (iO0 == iRemaining2) {
                if (i2 != 0) {
                    c.f.a.b.j3.g.g(byteBuffer == this.L);
                    this.D += (long) (this.E * this.M);
                }
                this.N = null;
            }
        }
    }

    @Override // c.f.a.b.t2.v
    public int o(k1 k1Var) {
        if (!"audio/raw".equals(k1Var.f9338m)) {
            return ((this.Z || !m0(k1Var, this.u)) && !Y(k1Var, this.f10008b)) ? 0 : 2;
        }
        if (x0.r0(k1Var.B)) {
            int i2 = k1Var.B;
            return (i2 == 2 || (this.f10010d && i2 == 4)) ? 2 : 1;
        }
        c.f.a.b.j3.z.i("DefaultAudioSink", "Invalid PCM encoding: " + k1Var.B);
        return 0;
    }

    @Override // c.f.a.b.t2.v
    public void p(k1 k1Var, int i2, int[] iArr) throws v.a {
        s[] sVarArr;
        int iIntValue;
        int iC0;
        int iC02;
        int iIntValue2;
        int i3;
        int i4;
        int[] iArr2;
        if ("audio/raw".equals(k1Var.f9338m)) {
            c.f.a.b.j3.g.a(x0.r0(k1Var.B));
            iC0 = x0.c0(k1Var.B, k1Var.z);
            s[] sVarArr2 = l0(k1Var.B) ? this.f10014h : this.f10013g;
            this.f10012f.n(k1Var.C, k1Var.D);
            if (x0.f9296a < 21 && k1Var.z == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i5 = 0; i5 < 6; i5++) {
                    iArr2[i5] = i5;
                }
            } else {
                iArr2 = iArr;
            }
            this.f10011e.l(iArr2);
            s.a aVar = new s.a(k1Var.A, k1Var.z, k1Var.B);
            for (s sVar : sVarArr2) {
                try {
                    s.a aVarD = sVar.d(aVar);
                    if (sVar.isActive()) {
                        aVar = aVarD;
                    }
                } catch (s.b e2) {
                    throw new v.a(e2, k1Var);
                }
            }
            int i6 = aVar.f10174d;
            i3 = aVar.f10172b;
            iIntValue2 = x0.H(aVar.f10173c);
            sVarArr = sVarArr2;
            iIntValue = i6;
            iC02 = x0.c0(i6, aVar.f10173c);
            i4 = 0;
        } else {
            s[] sVarArr3 = new s[0];
            int i7 = k1Var.A;
            if (m0(k1Var, this.u)) {
                sVarArr = sVarArr3;
                iIntValue = c.f.a.b.j3.d0.f((String) c.f.a.b.j3.g.e(k1Var.f9338m), k1Var.f9335j);
                iIntValue2 = x0.H(k1Var.z);
                iC0 = -1;
                iC02 = -1;
                i3 = i7;
                i4 = 1;
            } else {
                Pair<Integer, Integer> pairL = L(k1Var, this.f10008b);
                if (pairL == null) {
                    throw new v.a("Unable to configure passthrough for: " + k1Var, k1Var);
                }
                sVarArr = sVarArr3;
                iIntValue = ((Integer) pairL.first).intValue();
                iC0 = -1;
                iC02 = -1;
                iIntValue2 = ((Integer) pairL.second).intValue();
                i3 = i7;
                i4 = 2;
            }
        }
        if (iIntValue == 0) {
            throw new v.a("Invalid output encoding (mode=" + i4 + ") for: " + k1Var, k1Var);
        }
        if (iIntValue2 == 0) {
            throw new v.a("Invalid output channel config (mode=" + i4 + ") for: " + k1Var, k1Var);
        }
        this.Z = false;
        c cVar = new c(k1Var, iC0, i4, iC02, i3, iIntValue2, iIntValue, i2, this.f10018l, sVarArr);
        if (V()) {
            this.r = cVar;
        } else {
            this.s = cVar;
        }
    }

    public final int p0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2, long j2) {
        if (x0.f9296a >= 26) {
            return audioTrack.write(byteBuffer, i2, 1, j2 * 1000);
        }
        if (this.y == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.y = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.y.putInt(1431633921);
        }
        if (this.z == 0) {
            this.y.putInt(4, i2);
            this.y.putLong(8, j2 * 1000);
            this.y.position(0);
            this.z = i2;
        }
        int iRemaining = this.y.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.y, iRemaining, 1);
            if (iWrite < 0) {
                this.z = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iO0 = o0(audioTrack, byteBuffer, i2);
        if (iO0 < 0) {
            this.z = 0;
            return iO0;
        }
        this.z -= iO0;
        return iO0;
    }

    @Override // c.f.a.b.t2.v
    public void pause() {
        this.T = false;
        if (V() && this.f10016j.q()) {
            this.t.pause();
        }
    }

    @Override // c.f.a.b.t2.v
    public void play() {
        this.T = true;
        if (V()) {
            this.f10016j.v();
            this.t.play();
        }
    }

    @Override // c.f.a.b.t2.v
    public void q() {
        if (x0.f9296a < 25) {
            flush();
            return;
        }
        this.p.a();
        this.f10021o.a();
        if (V()) {
            d0();
            if (this.f10016j.j()) {
                this.t.pause();
            }
            this.t.flush();
            this.f10016j.r();
            y yVar = this.f10016j;
            AudioTrack audioTrack = this.t;
            c cVar = this.s;
            yVar.t(audioTrack, cVar.f10026c == 2, cVar.f10030g, cVar.f10027d, cVar.f10031h);
            this.G = true;
        }
    }

    @Override // c.f.a.b.t2.v
    public void r(boolean z) {
        e0(J(), z);
    }

    @Override // c.f.a.b.t2.v
    public void reset() {
        flush();
        for (s sVar : this.f10013g) {
            sVar.reset();
        }
        for (s sVar2 : this.f10014h) {
            sVar2.reset();
        }
        this.T = false;
        this.Z = false;
    }

    @Override // c.f.a.b.t2.v
    public void s(z zVar) {
        if (this.W.equals(zVar)) {
            return;
        }
        int i2 = zVar.f10213a;
        float f2 = zVar.f10214b;
        AudioTrack audioTrack = this.t;
        if (audioTrack != null) {
            if (this.W.f10213a != i2) {
                audioTrack.attachAuxEffect(i2);
            }
            if (i2 != 0) {
                this.t.setAuxEffectSendLevel(f2);
            }
        }
        this.W = zVar;
    }

    @Override // c.f.a.b.t2.v
    public void setVolume(float f2) {
        if (this.I != f2) {
            this.I = f2;
            g0();
        }
    }
}
