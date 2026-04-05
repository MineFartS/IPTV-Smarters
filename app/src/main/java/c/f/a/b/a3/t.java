package c.f.a.b.a3;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import c.f.a.b.a3.l;
import c.f.a.b.a3.q;
import c.f.a.b.a3.v;
import c.f.a.b.d1;
import c.f.a.b.j3.e0;
import c.f.a.b.j3.t0;
import c.f.a.b.j3.v0;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import c.f.a.b.k1;
import c.f.a.b.l1;
import c.f.a.b.u0;
import c.f.a.b.v2.f;
import c.f.a.b.w0;
import c.f.a.b.x2.j0;
import c.f.a.b.x2.x;
import c.f.a.b.x2.y;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.facebook.ads.AdError;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t extends u0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f6490n = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_HOUR, 32, 0, 0, 1, 101, -120, -124, DateTimeFieldType.HALFDAY_OF_DAY, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final long[] A;
    public long A0;
    public final long[] B;
    public long B0;
    public k1 C;
    public boolean C0;
    public k1 D;
    public boolean D0;
    public y E;
    public boolean E0;
    public y F;
    public boolean F0;
    public MediaCrypto G;
    public boolean G0;
    public boolean H;
    public boolean H0;
    public long I;
    public boolean I0;
    public float J;
    public d1 J0;
    public float K;
    public c.f.a.b.v2.d K0;
    public q L;
    public long L0;
    public k1 M;
    public long M0;
    public MediaFormat N;
    public int N0;
    public boolean O;
    public float P;
    public ArrayDeque<s> Q;
    public a R;
    public s S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public p j0;
    public long k0;
    public int l0;
    public int m0;
    public ByteBuffer n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q.b f6491o;
    public boolean o0;
    public final u p;
    public boolean p0;
    public final boolean q;
    public boolean q0;
    public final float r;
    public boolean r0;
    public final c.f.a.b.v2.f s;
    public boolean s0;
    public final c.f.a.b.v2.f t;
    public boolean t0;
    public final c.f.a.b.v2.f u;
    public int u0;
    public final o v;
    public int v0;
    public final t0<k1> w;
    public int w0;
    public final ArrayList<Long> x;
    public boolean x0;
    public final MediaCodec.BufferInfo y;
    public boolean y0;
    public final long[] z;
    public boolean z0;

    public static class a extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f6492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f6493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final s f6494d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f6495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a f6496f;

        public a(k1 k1Var, Throwable th, boolean z, int i2) {
            this("Decoder init failed: [" + i2 + "], " + k1Var, th, k1Var.f9338m, z, null, b(i2), null);
        }

        public a(k1 k1Var, Throwable th, boolean z, s sVar) {
            this("Decoder init failed: " + sVar.f6479a + ", " + k1Var, th, k1Var.f9338m, z, sVar, x0.f9296a >= 21 ? d(th) : null, null);
        }

        public a(String str, Throwable th, String str2, boolean z, s sVar, String str3, a aVar) {
            super(str, th);
            this.f6492b = str2;
            this.f6493c = z;
            this.f6494d = sVar;
            this.f6495e = str3;
            this.f6496f = aVar;
        }

        public static String b(int i2) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i2 < 0 ? "neg_" : BuildConfig.FLAVOR) + Math.abs(i2);
        }

        public static String d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        public final a c(a aVar) {
            return new a(getMessage(), getCause(), this.f6492b, this.f6493c, this.f6494d, this.f6495e, aVar);
        }
    }

    public t(int i2, q.b bVar, u uVar, boolean z, float f2) {
        super(i2);
        this.f6491o = bVar;
        this.p = (u) c.f.a.b.j3.g.e(uVar);
        this.q = z;
        this.r = f2;
        this.s = c.f.a.b.v2.f.q();
        this.t = new c.f.a.b.v2.f(0);
        this.u = new c.f.a.b.v2.f(2);
        o oVar = new o();
        this.v = oVar;
        this.w = new t0<>();
        this.x = new ArrayList<>();
        this.y = new MediaCodec.BufferInfo();
        this.J = 1.0f;
        this.K = 1.0f;
        this.I = -9223372036854775807L;
        this.z = new long[10];
        this.A = new long[10];
        this.B = new long[10];
        this.L0 = -9223372036854775807L;
        this.M0 = -9223372036854775807L;
        oVar.i(0);
        oVar.f10276c.order(ByteOrder.nativeOrder());
        this.P = -1.0f;
        this.T = 0;
        this.u0 = 0;
        this.l0 = -1;
        this.m0 = -1;
        this.k0 = -9223372036854775807L;
        this.A0 = -9223372036854775807L;
        this.B0 = -9223372036854775807L;
        this.v0 = 0;
        this.w0 = 0;
    }

    public static boolean C0(IllegalStateException illegalStateException) {
        if (x0.f9296a >= 21 && D0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    public static boolean D0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    public static boolean E0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    public static boolean Q(String str, k1 k1Var) {
        return x0.f9296a < 21 && k1Var.f9340o.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    public static boolean R(String str) {
        if (x0.f9296a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(x0.f9298c)) {
            String str2 = x0.f9297b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    public static boolean S(String str) {
        int i2 = x0.f9296a;
        if (i2 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i2 <= 19) {
                String str2 = x0.f9297b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean T(String str) {
        return x0.f9296a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    public static boolean U(s sVar) {
        String str = sVar.f6479a;
        int i2 = x0.f9296a;
        return (i2 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i2 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i2 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(x0.f9298c) && "AFTS".equals(x0.f9299d) && sVar.f6485g));
    }

    public static boolean V(String str) {
        int i2 = x0.f9296a;
        return i2 < 18 || (i2 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i2 == 19 && x0.f9299d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    public static boolean W(String str, k1 k1Var) {
        return x0.f9296a <= 18 && k1Var.z == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    public static boolean X(String str) {
        return x0.f9296a == 29 && "c2.android.aac.decoder".equals(str);
    }

    public static boolean j1(k1 k1Var) {
        Class<? extends ExoMediaCrypto> cls = k1Var.F;
        return cls == null || j0.class.equals(cls);
    }

    public final void A0(s sVar, MediaCrypto mediaCrypto) {
        String str = sVar.f6479a;
        int i2 = x0.f9296a;
        float fQ0 = i2 < 23 ? -1.0f : q0(this.K, this.C, B());
        float f2 = fQ0 > this.r ? fQ0 : -1.0f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        v0.a("createCodec:" + str);
        q.a aVarU0 = u0(sVar, this.C, mediaCrypto, f2);
        q qVarA = (!this.G0 || i2 < 23) ? this.f6491o.a(aVarU0) : new l.b(getTrackType(), this.H0, this.I0).a(aVarU0);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        this.L = qVarA;
        this.S = sVar;
        this.P = f2;
        this.M = this.C;
        this.T = P(str);
        this.U = Q(str, this.M);
        this.V = V(str);
        this.W = X(str);
        this.X = S(str);
        this.Y = T(str);
        this.Z = R(str);
        this.f0 = W(str, this.M);
        this.i0 = U(sVar) || p0();
        if (qVarA.a()) {
            this.t0 = true;
            this.u0 = 1;
            this.g0 = this.T != 0;
        }
        if ("c2.android.mp3.decoder".equals(sVar.f6479a)) {
            this.j0 = new p();
        }
        if (getState() == 2) {
            this.k0 = SystemClock.elapsedRealtime() + 1000;
        }
        this.K0.f10264a++;
        J0(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
    }

    public final boolean B0(long j2) {
        int size = this.x.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.x.get(i2).longValue() == j2) {
                this.x.remove(i2);
                return true;
            }
        }
        return false;
    }

    @Override // c.f.a.b.u0
    public void D() {
        this.C = null;
        this.L0 = -9223372036854775807L;
        this.M0 = -9223372036854775807L;
        this.N0 = 0;
        l0();
    }

    @Override // c.f.a.b.u0
    public void E(boolean z, boolean z2) {
        this.K0 = new c.f.a.b.v2.d();
    }

    @Override // c.f.a.b.u0
    public void F(long j2, boolean z) throws d1 {
        this.C0 = false;
        this.D0 = false;
        this.F0 = false;
        if (this.q0) {
            this.v.clear();
            this.u.clear();
            this.r0 = false;
        } else {
            k0();
        }
        if (this.w.l() > 0) {
            this.E0 = true;
        }
        this.w.c();
        int i2 = this.N0;
        if (i2 != 0) {
            this.M0 = this.A[i2 - 1];
            this.L0 = this.z[i2 - 1];
            this.N0 = 0;
        }
    }

    public final void F0() throws d1 {
        k1 k1Var;
        if (this.L != null || this.q0 || (k1Var = this.C) == null) {
            return;
        }
        if (this.F == null && h1(k1Var)) {
            z0(this.C);
            return;
        }
        b1(this.F);
        String str = this.C.f9338m;
        y yVar = this.E;
        if (yVar != null) {
            if (this.G == null) {
                j0 j0VarT0 = t0(yVar);
                if (j0VarT0 != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(j0VarT0.f10351b, j0VarT0.f10352c);
                        this.G = mediaCrypto;
                        this.H = !j0VarT0.f10353d && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e2) {
                        throw w(e2, this.C, 6006);
                    }
                } else if (this.E.getError() == null) {
                    return;
                }
            }
            if (j0.f10350a) {
                int state = this.E.getState();
                if (state == 1) {
                    y.a aVar = (y.a) c.f.a.b.j3.g.e(this.E.getError());
                    throw w(aVar, this.C, aVar.f10454b);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            G0(this.G, this.H);
        } catch (a e3) {
            throw w(e3, this.C, 4001);
        }
    }

    @Override // c.f.a.b.u0
    public void G() {
        try {
            Z();
            V0();
        } finally {
            e1(null);
        }
    }

    public final void G0(MediaCrypto mediaCrypto, boolean z) throws a {
        if (this.Q == null) {
            try {
                List<s> listM0 = m0(z);
                ArrayDeque<s> arrayDeque = new ArrayDeque<>();
                this.Q = arrayDeque;
                if (this.q) {
                    arrayDeque.addAll(listM0);
                } else if (!listM0.isEmpty()) {
                    this.Q.add(listM0.get(0));
                }
                this.R = null;
            } catch (v.c e2) {
                throw new a(this.C, e2, z, -49998);
            }
        }
        if (this.Q.isEmpty()) {
            throw new a(this.C, (Throwable) null, z, -49999);
        }
        while (this.L == null) {
            s sVarPeekFirst = this.Q.peekFirst();
            if (!g1(sVarPeekFirst)) {
                return;
            }
            try {
                A0(sVarPeekFirst, mediaCrypto);
            } catch (Exception e3) {
                z.j("MediaCodecRenderer", "Failed to initialize decoder: " + sVarPeekFirst, e3);
                this.Q.removeFirst();
                a aVar = new a(this.C, e3, z, sVarPeekFirst);
                I0(aVar);
                if (this.R == null) {
                    this.R = aVar;
                } else {
                    this.R = this.R.c(aVar);
                }
                if (this.Q.isEmpty()) {
                    throw this.R;
                }
            }
        }
        this.Q = null;
    }

    @Override // c.f.a.b.u0
    public void H() {
    }

    public final boolean H0(j0 j0Var, k1 k1Var) {
        if (j0Var.f10353d) {
            return false;
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(j0Var.f10351b, j0Var.f10352c);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(k1Var.f9338m);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // c.f.a.b.u0
    public void I() {
    }

    public abstract void I0(Exception exc);

    @Override // c.f.a.b.u0
    public void J(k1[] k1VarArr, long j2, long j3) {
        if (this.M0 == -9223372036854775807L) {
            c.f.a.b.j3.g.g(this.L0 == -9223372036854775807L);
            this.L0 = j2;
            this.M0 = j3;
            return;
        }
        int i2 = this.N0;
        if (i2 == this.A.length) {
            z.i("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.A[this.N0 - 1]);
        } else {
            this.N0 = i2 + 1;
        }
        long[] jArr = this.z;
        int i3 = this.N0;
        jArr[i3 - 1] = j2;
        this.A[i3 - 1] = j3;
        this.B[i3 - 1] = this.A0;
    }

    public abstract void J0(String str, long j2, long j3);

    public abstract void K0(String str);

    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c.f.a.b.v2.g L0(c.f.a.b.l1 r12) throws c.f.a.b.d1 {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.a3.t.L0(c.f.a.b.l1):c.f.a.b.v2.g");
    }

    public final void M() throws d1 {
        c.f.a.b.j3.g.g(!this.C0);
        l1 l1VarZ = z();
        this.u.clear();
        do {
            this.u.clear();
            int iK = K(l1VarZ, this.u, 0);
            if (iK == -5) {
                L0(l1VarZ);
                return;
            }
            if (iK != -4) {
                if (iK != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.u.isEndOfStream()) {
                    this.C0 = true;
                    return;
                }
                if (this.E0) {
                    k1 k1Var = (k1) c.f.a.b.j3.g.e(this.C);
                    this.D = k1Var;
                    M0(k1Var, null);
                    this.E0 = false;
                }
                this.u.o();
            }
        } while (this.v.s(this.u));
        this.r0 = true;
    }

    public abstract void M0(k1 k1Var, MediaFormat mediaFormat);

    public final boolean N(long j2, long j3) throws d1 {
        c.f.a.b.j3.g.g(!this.D0);
        if (this.v.x()) {
            o oVar = this.v;
            if (!R0(j2, j3, null, oVar.f10276c, this.m0, 0, oVar.w(), this.v.u(), this.v.isDecodeOnly(), this.v.isEndOfStream(), this.D)) {
                return false;
            }
            N0(this.v.v());
            this.v.clear();
        }
        if (this.C0) {
            this.D0 = true;
            return false;
        }
        if (this.r0) {
            c.f.a.b.j3.g.g(this.v.s(this.u));
            this.r0 = false;
        }
        if (this.s0) {
            if (this.v.x()) {
                return true;
            }
            Z();
            this.s0 = false;
            F0();
            if (!this.q0) {
                return false;
            }
        }
        M();
        if (this.v.x()) {
            this.v.o();
        }
        return this.v.x() || this.C0 || this.s0;
    }

    public void N0(long j2) {
        while (true) {
            int i2 = this.N0;
            if (i2 == 0 || j2 < this.B[0]) {
                return;
            }
            long[] jArr = this.z;
            this.L0 = jArr[0];
            this.M0 = this.A[0];
            int i3 = i2 - 1;
            this.N0 = i3;
            System.arraycopy(jArr, 1, jArr, 0, i3);
            long[] jArr2 = this.A;
            System.arraycopy(jArr2, 1, jArr2, 0, this.N0);
            long[] jArr3 = this.B;
            System.arraycopy(jArr3, 1, jArr3, 0, this.N0);
            O0();
        }
    }

    public abstract c.f.a.b.v2.g O(s sVar, k1 k1Var, k1 k1Var2);

    public void O0() {
    }

    public final int P(String str) {
        int i2 = x0.f9296a;
        if (i2 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = x0.f9299d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i2 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = x0.f9297b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    public abstract void P0(c.f.a.b.v2.f fVar);

    @TargetApi(23)
    public final void Q0() throws d1 {
        int i2 = this.w0;
        if (i2 == 1) {
            j0();
            return;
        }
        if (i2 == 2) {
            j0();
            l1();
        } else if (i2 == 3) {
            U0();
        } else {
            this.D0 = true;
            W0();
        }
    }

    public abstract boolean R0(long j2, long j3, q qVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, k1 k1Var);

    public final void S0() {
        this.z0 = true;
        MediaFormat mediaFormatC = this.L.c();
        if (this.T != 0 && mediaFormatC.getInteger("width") == 32 && mediaFormatC.getInteger("height") == 32) {
            this.h0 = true;
            return;
        }
        if (this.f0) {
            mediaFormatC.setInteger("channel-count", 1);
        }
        this.N = mediaFormatC;
        this.O = true;
    }

    public final boolean T0(int i2) throws d1 {
        l1 l1VarZ = z();
        this.s.clear();
        int iK = K(l1VarZ, this.s, i2 | 4);
        if (iK == -5) {
            L0(l1VarZ);
            return true;
        }
        if (iK != -4 || !this.s.isEndOfStream()) {
            return false;
        }
        this.C0 = true;
        Q0();
        return false;
    }

    public final void U0() throws d1 {
        V0();
        F0();
    }

    public void V0() {
        try {
            q qVar = this.L;
            if (qVar != null) {
                qVar.release();
                this.K0.f10265b++;
                K0(this.S.f6479a);
            }
            this.L = null;
            try {
                MediaCrypto mediaCrypto = this.G;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.L = null;
            try {
                MediaCrypto mediaCrypto2 = this.G;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void W0() {
    }

    public void X0() {
        Z0();
        a1();
        this.k0 = -9223372036854775807L;
        this.y0 = false;
        this.x0 = false;
        this.g0 = false;
        this.h0 = false;
        this.o0 = false;
        this.p0 = false;
        this.x.clear();
        this.A0 = -9223372036854775807L;
        this.B0 = -9223372036854775807L;
        p pVar = this.j0;
        if (pVar != null) {
            pVar.b();
        }
        this.v0 = 0;
        this.w0 = 0;
        this.u0 = this.t0 ? 1 : 0;
    }

    public r Y(Throwable th, s sVar) {
        return new r(th, sVar);
    }

    public void Y0() {
        X0();
        this.J0 = null;
        this.j0 = null;
        this.Q = null;
        this.S = null;
        this.M = null;
        this.N = null;
        this.O = false;
        this.z0 = false;
        this.P = -1.0f;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f0 = false;
        this.i0 = false;
        this.t0 = false;
        this.u0 = 0;
        this.H = false;
    }

    public final void Z() {
        this.s0 = false;
        this.v.clear();
        this.u.clear();
        this.r0 = false;
        this.q0 = false;
    }

    public final void Z0() {
        this.l0 = -1;
        this.t.f10276c = null;
    }

    @Override // c.f.a.b.j2
    public final int a(k1 k1Var) throws d1 {
        try {
            return i1(this.p, k1Var);
        } catch (v.c e2) {
            throw w(e2, k1Var, 4002);
        }
    }

    public final boolean a0() {
        if (this.x0) {
            this.v0 = 1;
            if (this.V || this.X) {
                this.w0 = 3;
                return false;
            }
            this.w0 = 1;
        }
        return true;
    }

    public final void a1() {
        this.m0 = -1;
        this.n0 = null;
    }

    @Override // c.f.a.b.h2
    public boolean b() {
        return this.D0;
    }

    public final void b0() throws d1 {
        if (!this.x0) {
            U0();
        } else {
            this.v0 = 1;
            this.w0 = 3;
        }
    }

    public final void b1(y yVar) {
        x.a(this.E, yVar);
        this.E = yVar;
    }

    @TargetApi(23)
    public final boolean c0() throws d1 {
        if (this.x0) {
            this.v0 = 1;
            if (this.V || this.X) {
                this.w0 = 3;
                return false;
            }
            this.w0 = 2;
        } else {
            l1();
        }
        return true;
    }

    public final void c1() {
        this.F0 = true;
    }

    public final boolean d0(long j2, long j3) throws d1 {
        boolean z;
        boolean zR0;
        q qVar;
        ByteBuffer byteBuffer;
        int i2;
        MediaCodec.BufferInfo bufferInfo;
        int iG;
        if (!y0()) {
            if (this.Y && this.y0) {
                try {
                    iG = this.L.g(this.y);
                } catch (IllegalStateException unused) {
                    Q0();
                    if (this.D0) {
                        V0();
                    }
                    return false;
                }
            } else {
                iG = this.L.g(this.y);
            }
            if (iG < 0) {
                if (iG == -2) {
                    S0();
                    return true;
                }
                if (this.i0 && (this.C0 || this.v0 == 2)) {
                    Q0();
                }
                return false;
            }
            if (this.h0) {
                this.h0 = false;
                this.L.i(iG, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.y;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                Q0();
                return false;
            }
            this.m0 = iG;
            ByteBuffer byteBufferN = this.L.n(iG);
            this.n0 = byteBufferN;
            if (byteBufferN != null) {
                byteBufferN.position(this.y.offset);
                ByteBuffer byteBuffer2 = this.n0;
                MediaCodec.BufferInfo bufferInfo3 = this.y;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            if (this.Z) {
                MediaCodec.BufferInfo bufferInfo4 = this.y;
                if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0) {
                    long j4 = this.A0;
                    if (j4 != -9223372036854775807L) {
                        bufferInfo4.presentationTimeUs = j4;
                    }
                }
            }
            this.o0 = B0(this.y.presentationTimeUs);
            long j5 = this.B0;
            long j6 = this.y.presentationTimeUs;
            this.p0 = j5 == j6;
            m1(j6);
        }
        if (this.Y && this.y0) {
            try {
                qVar = this.L;
                byteBuffer = this.n0;
                i2 = this.m0;
                bufferInfo = this.y;
                z = false;
            } catch (IllegalStateException unused2) {
                z = false;
            }
            try {
                zR0 = R0(j2, j3, qVar, byteBuffer, i2, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.o0, this.p0, this.D);
            } catch (IllegalStateException unused3) {
                Q0();
                if (this.D0) {
                    V0();
                }
                return z;
            }
        } else {
            z = false;
            q qVar2 = this.L;
            ByteBuffer byteBuffer3 = this.n0;
            int i3 = this.m0;
            MediaCodec.BufferInfo bufferInfo5 = this.y;
            zR0 = R0(j2, j3, qVar2, byteBuffer3, i3, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.o0, this.p0, this.D);
        }
        if (zR0) {
            N0(this.y.presentationTimeUs);
            boolean z2 = (this.y.flags & 4) != 0;
            a1();
            if (!z2) {
                return true;
            }
            Q0();
        }
        return z;
    }

    public final void d1(d1 d1Var) {
        this.J0 = d1Var;
    }

    @Override // c.f.a.b.h2
    public boolean e() {
        return this.C != null && (C() || y0() || (this.k0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.k0));
    }

    public final boolean e0(s sVar, k1 k1Var, y yVar, y yVar2) {
        j0 j0VarT0;
        if (yVar == yVar2) {
            return false;
        }
        if (yVar2 == null || yVar == null || x0.f9296a < 23) {
            return true;
        }
        UUID uuid = w0.f10308e;
        if (uuid.equals(yVar.c()) || uuid.equals(yVar2.c()) || (j0VarT0 = t0(yVar2)) == null) {
            return true;
        }
        return !sVar.f6485g && H0(j0VarT0, k1Var);
    }

    public final void e1(y yVar) {
        x.a(this.F, yVar);
        this.F = yVar;
    }

    public void f0(boolean z) {
        this.G0 = z;
    }

    public final boolean f1(long j2) {
        return this.I == -9223372036854775807L || SystemClock.elapsedRealtime() - j2 < this.I;
    }

    public void g0(boolean z) {
        this.H0 = z;
    }

    public boolean g1(s sVar) {
        return true;
    }

    public void h0(boolean z) {
        this.I0 = z;
    }

    public boolean h1(k1 k1Var) {
        return false;
    }

    public final boolean i0() throws d1 {
        q qVar = this.L;
        if (qVar == null || this.v0 == 2 || this.C0) {
            return false;
        }
        if (this.l0 < 0) {
            int iF = qVar.f();
            this.l0 = iF;
            if (iF < 0) {
                return false;
            }
            this.t.f10276c = this.L.k(iF);
            this.t.clear();
        }
        if (this.v0 == 1) {
            if (!this.i0) {
                this.y0 = true;
                this.L.m(this.l0, 0, 0, 0L, 4);
                Z0();
            }
            this.v0 = 2;
            return false;
        }
        if (this.g0) {
            this.g0 = false;
            ByteBuffer byteBuffer = this.t.f10276c;
            byte[] bArr = f6490n;
            byteBuffer.put(bArr);
            this.L.m(this.l0, 0, bArr.length, 0L, 0);
            Z0();
            this.x0 = true;
            return true;
        }
        if (this.u0 == 1) {
            for (int i2 = 0; i2 < this.M.f9340o.size(); i2++) {
                this.t.f10276c.put(this.M.f9340o.get(i2));
            }
            this.u0 = 2;
        }
        int iPosition = this.t.f10276c.position();
        l1 l1VarZ = z();
        try {
            int iK = K(l1VarZ, this.t, 0);
            if (f()) {
                this.B0 = this.A0;
            }
            if (iK == -3) {
                return false;
            }
            if (iK == -5) {
                if (this.u0 == 2) {
                    this.t.clear();
                    this.u0 = 1;
                }
                L0(l1VarZ);
                return true;
            }
            if (this.t.isEndOfStream()) {
                if (this.u0 == 2) {
                    this.t.clear();
                    this.u0 = 1;
                }
                this.C0 = true;
                if (!this.x0) {
                    Q0();
                    return false;
                }
                try {
                    if (!this.i0) {
                        this.y0 = true;
                        this.L.m(this.l0, 0, 0, 0L, 4);
                        Z0();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e2) {
                    throw w(e2, this.C, w0.b(e2.getErrorCode()));
                }
            }
            if (!this.x0 && !this.t.isKeyFrame()) {
                this.t.clear();
                if (this.u0 == 2) {
                    this.u0 = 1;
                }
                return true;
            }
            boolean zP = this.t.p();
            if (zP) {
                this.t.f10275b.b(iPosition);
            }
            if (this.U && !zP) {
                e0.b(this.t.f10276c);
                if (this.t.f10276c.position() == 0) {
                    return true;
                }
                this.U = false;
            }
            c.f.a.b.v2.f fVar = this.t;
            long jC = fVar.f10278e;
            p pVar = this.j0;
            if (pVar != null) {
                jC = pVar.c(this.C, fVar);
            }
            long j2 = jC;
            if (this.t.isDecodeOnly()) {
                this.x.add(Long.valueOf(j2));
            }
            if (this.E0) {
                this.w.a(j2, this.C);
                this.E0 = false;
            }
            p pVar2 = this.j0;
            long j3 = this.A0;
            this.A0 = pVar2 != null ? Math.max(j3, this.t.f10278e) : Math.max(j3, j2);
            this.t.o();
            if (this.t.hasSupplementalData()) {
                x0(this.t);
            }
            P0(this.t);
            try {
                if (zP) {
                    this.L.b(this.l0, 0, this.t.f10275b, j2, 0);
                } else {
                    this.L.m(this.l0, 0, this.t.f10276c.limit(), j2, 0);
                }
                Z0();
                this.x0 = true;
                this.u0 = 0;
                this.K0.f10266c++;
                return true;
            } catch (MediaCodec.CryptoException e3) {
                throw w(e3, this.C, w0.b(e3.getErrorCode()));
            }
        } catch (f.a e4) {
            I0(e4);
            T0(0);
            j0();
            return true;
        }
    }

    public abstract int i1(u uVar, k1 k1Var);

    public final void j0() {
        try {
            this.L.flush();
        } finally {
            X0();
        }
    }

    @Override // c.f.a.b.u0, c.f.a.b.h2
    public void k(float f2, float f3) throws d1 {
        this.J = f2;
        this.K = f3;
        k1(this.M);
    }

    public final boolean k0() throws d1 {
        boolean zL0 = l0();
        if (zL0) {
            F0();
        }
        return zL0;
    }

    public final boolean k1(k1 k1Var) throws d1 {
        if (x0.f9296a >= 23 && this.L != null && this.w0 != 3 && getState() != 0) {
            float fQ0 = q0(this.K, k1Var, B());
            float f2 = this.P;
            if (f2 == fQ0) {
                return true;
            }
            if (fQ0 == -1.0f) {
                b0();
                return false;
            }
            if (f2 == -1.0f && fQ0 <= this.r) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fQ0);
            this.L.d(bundle);
            this.P = fQ0;
        }
        return true;
    }

    public boolean l0() {
        if (this.L == null) {
            return false;
        }
        if (this.w0 == 3 || this.V || ((this.W && !this.z0) || (this.X && this.y0))) {
            V0();
            return true;
        }
        j0();
        return false;
    }

    public final void l1() throws d1 {
        try {
            this.G.setMediaDrmSession(t0(this.F).f10352c);
            b1(this.F);
            this.v0 = 0;
            this.w0 = 0;
        } catch (MediaCryptoException e2) {
            throw w(e2, this.C, 6006);
        }
    }

    public final List<s> m0(boolean z) {
        List<s> listS0 = s0(this.p, this.C, z);
        if (listS0.isEmpty() && z) {
            listS0 = s0(this.p, this.C, false);
            if (!listS0.isEmpty()) {
                z.i("MediaCodecRenderer", "Drm session requires secure decoder for " + this.C.f9338m + ", but no secure decoder available. Trying to proceed with " + listS0 + InstructionFileId.DOT);
            }
        }
        return listS0;
    }

    public final void m1(long j2) {
        boolean z;
        k1 k1VarJ = this.w.j(j2);
        if (k1VarJ == null && this.O) {
            k1VarJ = this.w.i();
        }
        if (k1VarJ != null) {
            this.D = k1VarJ;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.O && this.D != null)) {
            M0(this.D, this.N);
            this.O = false;
        }
    }

    @Override // c.f.a.b.u0, c.f.a.b.j2
    public final int n() {
        return 8;
    }

    public final q n0() {
        return this.L;
    }

    @Override // c.f.a.b.h2
    public void o(long j2, long j3) throws d1 {
        boolean z = false;
        if (this.F0) {
            this.F0 = false;
            Q0();
        }
        d1 d1Var = this.J0;
        if (d1Var != null) {
            this.J0 = null;
            throw d1Var;
        }
        try {
            if (this.D0) {
                W0();
                return;
            }
            if (this.C != null || T0(2)) {
                F0();
                if (this.q0) {
                    v0.a("bypassRender");
                    while (N(j2, j3)) {
                    }
                } else {
                    if (this.L == null) {
                        this.K0.f10267d += L(j2);
                        T0(1);
                        this.K0.c();
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    v0.a("drainAndFeed");
                    while (d0(j2, j3) && f1(jElapsedRealtime)) {
                    }
                    while (i0() && f1(jElapsedRealtime)) {
                    }
                }
                v0.c();
                this.K0.c();
            }
        } catch (IllegalStateException e2) {
            if (!C0(e2)) {
                throw e2;
            }
            I0(e2);
            if (x0.f9296a >= 21 && E0(e2)) {
                z = true;
            }
            if (z) {
                V0();
            }
            throw x(Y(e2, o0()), this.C, z, 4003);
        }
    }

    public final s o0() {
        return this.S;
    }

    public boolean p0() {
        return false;
    }

    public abstract float q0(float f2, k1 k1Var, k1[] k1VarArr);

    public final MediaFormat r0() {
        return this.N;
    }

    public abstract List<s> s0(u uVar, k1 k1Var, boolean z);

    public final j0 t0(y yVar) throws d1 {
        ExoMediaCrypto exoMediaCryptoF = yVar.f();
        if (exoMediaCryptoF == null || (exoMediaCryptoF instanceof j0)) {
            return (j0) exoMediaCryptoF;
        }
        throw w(new IllegalArgumentException("Expecting FrameworkMediaCrypto but found: " + exoMediaCryptoF), this.C, AdError.MEDIAVIEW_MISSING_ERROR_CODE);
    }

    public abstract q.a u0(s sVar, k1 k1Var, MediaCrypto mediaCrypto, float f2);

    public final long v0() {
        return this.M0;
    }

    public float w0() {
        return this.J;
    }

    public void x0(c.f.a.b.v2.f fVar) {
    }

    public final boolean y0() {
        return this.m0 >= 0;
    }

    public final void z0(k1 k1Var) {
        Z();
        String str = k1Var.f9338m;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.v.y(32);
        } else {
            this.v.y(1);
        }
        this.q0 = true;
    }
}
