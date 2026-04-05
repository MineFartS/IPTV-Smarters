package c.f.a.b.k3;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import c.f.a.b.a3.q;
import c.f.a.b.a3.v;
import c.f.a.b.d1;
import c.f.a.b.i2;
import c.f.a.b.j3.v0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.k3.d0;
import c.f.a.b.l1;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTimeConstants;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

/* JADX INFO: loaded from: classes2.dex */
public class u extends c.f.a.b.a3.t {
    public static final int[] O0 = {1920, 1600, DateTimeConstants.MINUTES_PER_DAY, 1280, 960, 854, 640, 540, 480};
    public static boolean P0;
    public static boolean Q0;
    public final Context R0;
    public final z S0;
    public final d0.a T0;
    public final long U0;
    public final int V0;
    public final boolean W0;
    public a X0;
    public boolean Y0;
    public boolean Z0;
    public Surface a1;
    public q b1;
    public boolean c1;
    public int d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public long h1;
    public long i1;
    public long j1;
    public int k1;
    public int l1;
    public int m1;
    public long n1;
    public long o1;
    public long p1;
    public int q1;
    public int r1;
    public int s1;
    public int t1;
    public float u1;
    public e0 v1;
    public boolean w1;
    public int x1;
    public b y1;
    public y z1;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f9527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9528c;

        public a(int i2, int i3, int i4) {
            this.f9526a = i2;
            this.f9527b = i3;
            this.f9528c = i4;
        }
    }

    public final class b implements q.c, Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f9529b;

        public b(c.f.a.b.a3.q qVar) {
            Handler handlerY = x0.y(this);
            this.f9529b = handlerY;
            qVar.h(this, handlerY);
        }

        @Override // c.f.a.b.a3.q.c
        public void a(c.f.a.b.a3.q qVar, long j2, long j3) {
            if (x0.f9296a >= 30) {
                b(j2);
            } else {
                this.f9529b.sendMessageAtFrontOfQueue(Message.obtain(this.f9529b, 0, (int) (j2 >> 32), (int) j2));
            }
        }

        public final void b(long j2) {
            u uVar = u.this;
            if (this != uVar.y1) {
                return;
            }
            if (j2 == Long.MAX_VALUE) {
                uVar.N1();
                return;
            }
            try {
                uVar.M1(j2);
            } catch (d1 e2) {
                u.this.d1(e2);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(x0.c1(message.arg1, message.arg2));
            return true;
        }
    }

    public u(Context context, q.b bVar, c.f.a.b.a3.u uVar, long j2, boolean z, Handler handler, d0 d0Var, int i2) {
        super(2, bVar, uVar, z, 30.0f);
        this.U0 = j2;
        this.V0 = i2;
        Context applicationContext = context.getApplicationContext();
        this.R0 = applicationContext;
        this.S0 = new z(applicationContext);
        this.T0 = new d0.a(handler, d0Var);
        this.W0 = t1();
        this.i1 = -9223372036854775807L;
        this.r1 = -1;
        this.s1 = -1;
        this.u1 = -1.0f;
        this.d1 = 1;
        this.x1 = 0;
        q1();
    }

    public u(Context context, c.f.a.b.a3.u uVar, long j2, boolean z, Handler handler, d0 d0Var, int i2) {
        this(context, q.b.f6476a, uVar, j2, z, handler, d0Var, i2);
    }

    public static int A1(c.f.a.b.a3.s sVar, k1 k1Var) {
        if (k1Var.f9339n == -1) {
            return w1(sVar, k1Var.f9338m, k1Var.r, k1Var.s);
        }
        int size = k1Var.f9340o.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += k1Var.f9340o.get(i2).length;
        }
        return k1Var.f9339n + length;
    }

    public static boolean C1(long j2) {
        return j2 < -30000;
    }

    public static boolean D1(long j2) {
        return j2 < -500000;
    }

    public static void Q1(c.f.a.b.a3.q qVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        qVar.d(bundle);
    }

    public static void s1(MediaFormat mediaFormat, int i2) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i2);
    }

    public static boolean t1() {
        return "NVIDIA".equals(x0.f9298c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean v1() {
        /*
            Method dump skipped, instruction units count: 3046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.k3.u.v1():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w1(c.f.a.b.a3.s r5, java.lang.String r6, int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.k3.u.w1(c.f.a.b.a3.s, java.lang.String, int, int):int");
    }

    public static Point x1(c.f.a.b.a3.s sVar, k1 k1Var) {
        int i2 = k1Var.s;
        int i3 = k1Var.r;
        boolean z = i2 > i3;
        int i4 = z ? i2 : i3;
        if (z) {
            i2 = i3;
        }
        float f2 = i2 / i4;
        for (int i5 : O0) {
            int i6 = (int) (i5 * f2);
            if (i5 <= i4 || i6 <= i2) {
                break;
            }
            if (x0.f9296a >= 21) {
                int i7 = z ? i6 : i5;
                if (!z) {
                    i5 = i6;
                }
                Point pointB = sVar.b(i7, i5);
                if (sVar.t(pointB.x, pointB.y, k1Var.t)) {
                    return pointB;
                }
            } else {
                try {
                    int iK = x0.k(i5, 16) * 16;
                    int iK2 = x0.k(i6, 16) * 16;
                    if (iK * iK2 <= c.f.a.b.a3.v.I()) {
                        int i8 = z ? iK2 : iK;
                        if (!z) {
                            iK = iK2;
                        }
                        return new Point(i8, iK);
                    }
                } catch (v.c unused) {
                }
            }
        }
        return null;
    }

    public static List<c.f.a.b.a3.s> z1(c.f.a.b.a3.u uVar, k1 k1Var, boolean z, boolean z2) {
        Pair<Integer, Integer> pairL;
        String str;
        String str2 = k1Var.f9338m;
        if (str2 == null) {
            return Collections.emptyList();
        }
        List<c.f.a.b.a3.s> listP = c.f.a.b.a3.v.p(uVar.a(str2, z, z2), k1Var);
        if ("video/dolby-vision".equals(str2) && (pairL = c.f.a.b.a3.v.l(k1Var)) != null) {
            int iIntValue = ((Integer) pairL.first).intValue();
            if (iIntValue != 16 && iIntValue != 256) {
                str = iIntValue == 512 ? "video/avc" : "video/hevc";
            }
            listP.addAll(uVar.a(str, z, z2));
        }
        return Collections.unmodifiableList(listP);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    public MediaFormat B1(k1 k1Var, String str, a aVar, float f2, boolean z, int i2) {
        Pair<Integer, Integer> pairL;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, str);
        mediaFormat.setInteger("width", k1Var.r);
        mediaFormat.setInteger("height", k1Var.s);
        c.f.a.b.j3.c0.e(mediaFormat, k1Var.f9340o);
        c.f.a.b.j3.c0.c(mediaFormat, "frame-rate", k1Var.t);
        c.f.a.b.j3.c0.d(mediaFormat, "rotation-degrees", k1Var.u);
        c.f.a.b.j3.c0.b(mediaFormat, k1Var.y);
        if ("video/dolby-vision".equals(k1Var.f9338m) && (pairL = c.f.a.b.a3.v.l(k1Var)) != null) {
            c.f.a.b.j3.c0.d(mediaFormat, "profile", ((Integer) pairL.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f9526a);
        mediaFormat.setInteger("max-height", aVar.f9527b);
        c.f.a.b.j3.c0.d(mediaFormat, "max-input-size", aVar.f9528c);
        if (x0.f9296a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i2 != 0) {
            s1(mediaFormat, i2);
        }
        return mediaFormat;
    }

    @Override // c.f.a.b.a3.t, c.f.a.b.u0
    public void D() {
        q1();
        p1();
        this.c1 = false;
        this.S0.g();
        this.y1 = null;
        try {
            super.D();
        } finally {
            this.T0.c(this.K0);
        }
    }

    @Override // c.f.a.b.a3.t, c.f.a.b.u0
    public void E(boolean z, boolean z2) {
        super.E(z, z2);
        boolean z3 = y().f9357b;
        c.f.a.b.j3.g.g((z3 && this.x1 == 0) ? false : true);
        if (this.w1 != z3) {
            this.w1 = z3;
            V0();
        }
        this.T0.e(this.K0);
        this.S0.h();
        this.f1 = z2;
        this.g1 = false;
    }

    public boolean E1(long j2, boolean z) throws d1 {
        int iL = L(j2);
        if (iL == 0) {
            return false;
        }
        c.f.a.b.v2.d dVar = this.K0;
        dVar.f10272i++;
        int i2 = this.m1 + iL;
        if (z) {
            dVar.f10269f += i2;
        } else {
            Z1(i2);
        }
        k0();
        return true;
    }

    @Override // c.f.a.b.a3.t, c.f.a.b.u0
    public void F(long j2, boolean z) throws d1 {
        super.F(j2, z);
        p1();
        this.S0.l();
        this.n1 = -9223372036854775807L;
        this.h1 = -9223372036854775807L;
        this.l1 = 0;
        if (z) {
            R1();
        } else {
            this.i1 = -9223372036854775807L;
        }
    }

    public final void F1() {
        if (this.k1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.T0.d(this.k1, jElapsedRealtime - this.j1);
            this.k1 = 0;
            this.j1 = jElapsedRealtime;
        }
    }

    @Override // c.f.a.b.a3.t, c.f.a.b.u0
    @TargetApi(17)
    public void G() {
        try {
            super.G();
            q qVar = this.b1;
            if (qVar != null) {
                if (this.a1 == qVar) {
                    this.a1 = null;
                }
                qVar.release();
                this.b1 = null;
            }
        } catch (Throwable th) {
            if (this.b1 != null) {
                Surface surface = this.a1;
                q qVar2 = this.b1;
                if (surface == qVar2) {
                    this.a1 = null;
                }
                qVar2.release();
                this.b1 = null;
            }
            throw th;
        }
    }

    public void G1() {
        this.g1 = true;
        if (this.e1) {
            return;
        }
        this.e1 = true;
        this.T0.A(this.a1);
        this.c1 = true;
    }

    @Override // c.f.a.b.a3.t, c.f.a.b.u0
    public void H() {
        super.H();
        this.k1 = 0;
        this.j1 = SystemClock.elapsedRealtime();
        this.o1 = SystemClock.elapsedRealtime() * 1000;
        this.p1 = 0L;
        this.q1 = 0;
        this.S0.m();
    }

    public final void H1() {
        int i2 = this.q1;
        if (i2 != 0) {
            this.T0.B(this.p1, i2);
            this.p1 = 0L;
            this.q1 = 0;
        }
    }

    @Override // c.f.a.b.a3.t, c.f.a.b.u0
    public void I() {
        this.i1 = -9223372036854775807L;
        F1();
        H1();
        this.S0.n();
        super.I();
    }

    @Override // c.f.a.b.a3.t
    public void I0(Exception exc) {
        c.f.a.b.j3.z.e("MediaCodecVideoRenderer", "Video codec error", exc);
        this.T0.C(exc);
    }

    public final void I1() {
        int i2 = this.r1;
        if (i2 == -1 && this.s1 == -1) {
            return;
        }
        e0 e0Var = this.v1;
        if (e0Var != null && e0Var.f9371c == i2 && e0Var.f9372d == this.s1 && e0Var.f9373e == this.t1 && e0Var.f9374f == this.u1) {
            return;
        }
        e0 e0Var2 = new e0(this.r1, this.s1, this.t1, this.u1);
        this.v1 = e0Var2;
        this.T0.D(e0Var2);
    }

    @Override // c.f.a.b.a3.t
    public void J0(String str, long j2, long j3) {
        this.T0.a(str, j2, j3);
        this.Y0 = r1(str);
        this.Z0 = ((c.f.a.b.a3.s) c.f.a.b.j3.g.e(o0())).n();
        if (x0.f9296a < 23 || !this.w1) {
            return;
        }
        this.y1 = new b((c.f.a.b.a3.q) c.f.a.b.j3.g.e(n0()));
    }

    public final void J1() {
        if (this.c1) {
            this.T0.A(this.a1);
        }
    }

    @Override // c.f.a.b.a3.t
    public void K0(String str) {
        this.T0.b(str);
    }

    public final void K1() {
        e0 e0Var = this.v1;
        if (e0Var != null) {
            this.T0.D(e0Var);
        }
    }

    @Override // c.f.a.b.a3.t
    public c.f.a.b.v2.g L0(l1 l1Var) throws d1 {
        c.f.a.b.v2.g gVarL0 = super.L0(l1Var);
        this.T0.f(l1Var.f9575b, gVarL0);
        return gVarL0;
    }

    public final void L1(long j2, long j3, k1 k1Var) {
        y yVar = this.z1;
        if (yVar != null) {
            yVar.d(j2, j3, k1Var, r0());
        }
    }

    @Override // c.f.a.b.a3.t
    public void M0(k1 k1Var, MediaFormat mediaFormat) {
        c.f.a.b.a3.q qVarN0 = n0();
        if (qVarN0 != null) {
            qVarN0.j(this.d1);
        }
        if (this.w1) {
            this.r1 = k1Var.r;
            this.s1 = k1Var.s;
        } else {
            c.f.a.b.j3.g.e(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.r1 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.s1 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f2 = k1Var.v;
        this.u1 = f2;
        if (x0.f9296a >= 21) {
            int i2 = k1Var.u;
            if (i2 == 90 || i2 == 270) {
                int i3 = this.r1;
                this.r1 = this.s1;
                this.s1 = i3;
                this.u1 = 1.0f / f2;
            }
        } else {
            this.t1 = k1Var.u;
        }
        this.S0.i(k1Var.t);
    }

    public void M1(long j2) {
        m1(j2);
        I1();
        this.K0.f10268e++;
        G1();
        N0(j2);
    }

    @Override // c.f.a.b.a3.t
    public void N0(long j2) {
        super.N0(j2);
        if (this.w1) {
            return;
        }
        this.m1--;
    }

    public final void N1() {
        c1();
    }

    @Override // c.f.a.b.a3.t
    public c.f.a.b.v2.g O(c.f.a.b.a3.s sVar, k1 k1Var, k1 k1Var2) {
        c.f.a.b.v2.g gVarE = sVar.e(k1Var, k1Var2);
        int i2 = gVarE.f10288e;
        int i3 = k1Var2.r;
        a aVar = this.X0;
        if (i3 > aVar.f9526a || k1Var2.s > aVar.f9527b) {
            i2 |= 256;
        }
        if (A1(sVar, k1Var2) > this.X0.f9528c) {
            i2 |= 64;
        }
        int i4 = i2;
        return new c.f.a.b.v2.g(sVar.f6479a, k1Var, k1Var2, i4 != 0 ? 0 : gVarE.f10287d, i4);
    }

    @Override // c.f.a.b.a3.t
    public void O0() {
        super.O0();
        p1();
    }

    public void O1(c.f.a.b.a3.q qVar, int i2, long j2) {
        I1();
        v0.a("releaseOutputBuffer");
        qVar.i(i2, true);
        v0.c();
        this.o1 = SystemClock.elapsedRealtime() * 1000;
        this.K0.f10268e++;
        this.l1 = 0;
        G1();
    }

    @Override // c.f.a.b.a3.t
    public void P0(c.f.a.b.v2.f fVar) {
        boolean z = this.w1;
        if (!z) {
            this.m1++;
        }
        if (x0.f9296a >= 23 || !z) {
            return;
        }
        M1(fVar.f10278e);
    }

    public void P1(c.f.a.b.a3.q qVar, int i2, long j2, long j3) {
        I1();
        v0.a("releaseOutputBuffer");
        qVar.e(i2, j3);
        v0.c();
        this.o1 = SystemClock.elapsedRealtime() * 1000;
        this.K0.f10268e++;
        this.l1 = 0;
        G1();
    }

    @Override // c.f.a.b.a3.t
    public boolean R0(long j2, long j3, c.f.a.b.a3.q qVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, k1 k1Var) {
        long j5;
        boolean z3;
        u uVar;
        c.f.a.b.a3.q qVar2;
        int i5;
        long j6;
        long j7;
        c.f.a.b.j3.g.e(qVar);
        if (this.h1 == -9223372036854775807L) {
            this.h1 = j2;
        }
        if (j4 != this.n1) {
            this.S0.j(j4);
            this.n1 = j4;
        }
        long jV0 = v0();
        long j8 = j4 - jV0;
        if (z && !z2) {
            Y1(qVar, i2, j8);
            return true;
        }
        double dW0 = w0();
        boolean z4 = getState() == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        double d2 = j4 - j2;
        Double.isNaN(d2);
        Double.isNaN(dW0);
        long j9 = (long) (d2 / dW0);
        if (z4) {
            j9 -= jElapsedRealtime - j3;
        }
        if (this.a1 == this.b1) {
            if (!C1(j9)) {
                return false;
            }
            Y1(qVar, i2, j8);
            a2(j9);
            return true;
        }
        long j10 = jElapsedRealtime - this.o1;
        if (this.g1 ? this.e1 : !(z4 || this.f1)) {
            j5 = j10;
            z3 = false;
        } else {
            j5 = j10;
            z3 = true;
        }
        if (!(this.i1 == -9223372036854775807L && j2 >= jV0 && (z3 || (z4 && W1(j9, j5))))) {
            if (z4 && j2 != this.h1) {
                long jNanoTime = System.nanoTime();
                long jA = this.S0.a((j9 * 1000) + jNanoTime);
                long j11 = (jA - jNanoTime) / 1000;
                boolean z5 = this.i1 != -9223372036854775807L;
                if (U1(j11, j3, z2) && E1(j2, z5)) {
                    return false;
                }
                if (V1(j11, j3, z2)) {
                    if (z5) {
                        Y1(qVar, i2, j8);
                    } else {
                        u1(qVar, i2, j8);
                    }
                    j9 = j11;
                } else {
                    j9 = j11;
                    if (x0.f9296a >= 21) {
                        if (j9 < 50000) {
                            uVar = this;
                            uVar.L1(j8, jA, k1Var);
                            qVar2 = qVar;
                            i5 = i2;
                            j6 = j8;
                            j7 = jA;
                            uVar.P1(qVar2, i5, j6, j7);
                        }
                    } else if (j9 < 30000) {
                        if (j9 > 11000) {
                            try {
                                Thread.sleep((j9 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        L1(j8, jA, k1Var);
                        O1(qVar, i2, j8);
                    }
                }
            }
            return false;
        }
        long jNanoTime2 = System.nanoTime();
        L1(j8, jNanoTime2, k1Var);
        if (x0.f9296a >= 21) {
            uVar = this;
            qVar2 = qVar;
            i5 = i2;
            j6 = j8;
            j7 = jNanoTime2;
            uVar.P1(qVar2, i5, j6, j7);
        }
        O1(qVar, i2, j8);
        a2(j9);
        return true;
    }

    public final void R1() {
        this.i1 = this.U0 > 0 ? SystemClock.elapsedRealtime() + this.U0 : -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [c.f.a.b.k3.z] */
    /* JADX WARN: Type inference failed for: r4v0, types: [c.f.a.b.a3.t, c.f.a.b.k3.u, c.f.a.b.u0] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r5v6, types: [c.f.a.b.k3.q] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void S1(Object obj) throws d1 {
        ?? D = obj instanceof Surface ? (Surface) obj : 0;
        if (D == 0) {
            q qVar = this.b1;
            if (qVar != null) {
                D = qVar;
            } else {
                c.f.a.b.a3.s sVarO0 = o0();
                if (sVarO0 != null && X1(sVarO0)) {
                    D = q.d(this.R0, sVarO0.f6485g);
                    this.b1 = D;
                }
            }
        }
        if (this.a1 == D) {
            if (D == 0 || D == this.b1) {
                return;
            }
            K1();
            J1();
            return;
        }
        this.a1 = D;
        this.S0.o(D);
        this.c1 = false;
        int state = getState();
        c.f.a.b.a3.q qVarN0 = n0();
        if (qVarN0 != null) {
            if (x0.f9296a < 23 || D == 0 || this.Y0) {
                V0();
                F0();
            } else {
                T1(qVarN0, D);
            }
        }
        if (D == 0 || D == this.b1) {
            q1();
            p1();
            return;
        }
        K1();
        p1();
        if (state == 2) {
            R1();
        }
    }

    public void T1(c.f.a.b.a3.q qVar, Surface surface) {
        qVar.l(surface);
    }

    public boolean U1(long j2, long j3, boolean z) {
        return D1(j2) && !z;
    }

    public boolean V1(long j2, long j3, boolean z) {
        return C1(j2) && !z;
    }

    public boolean W1(long j2, long j3) {
        return C1(j2) && j3 > 100000;
    }

    @Override // c.f.a.b.a3.t
    public void X0() {
        super.X0();
        this.m1 = 0;
    }

    public final boolean X1(c.f.a.b.a3.s sVar) {
        return x0.f9296a >= 23 && !this.w1 && !r1(sVar.f6479a) && (!sVar.f6485g || q.c(this.R0));
    }

    @Override // c.f.a.b.a3.t
    public c.f.a.b.a3.r Y(Throwable th, c.f.a.b.a3.s sVar) {
        return new t(th, sVar, this.a1);
    }

    public void Y1(c.f.a.b.a3.q qVar, int i2, long j2) {
        v0.a("skipVideoBuffer");
        qVar.i(i2, false);
        v0.c();
        this.K0.f10269f++;
    }

    public void Z1(int i2) {
        c.f.a.b.v2.d dVar = this.K0;
        dVar.f10270g += i2;
        this.k1 += i2;
        int i3 = this.l1 + i2;
        this.l1 = i3;
        dVar.f10271h = Math.max(i3, dVar.f10271h);
        int i4 = this.V0;
        if (i4 <= 0 || this.k1 < i4) {
            return;
        }
        F1();
    }

    public void a2(long j2) {
        this.K0.a(j2);
        this.p1 += j2;
        this.q1++;
    }

    @Override // c.f.a.b.a3.t, c.f.a.b.h2
    public boolean e() {
        q qVar;
        if (super.e() && (this.e1 || (((qVar = this.b1) != null && this.a1 == qVar) || n0() == null || this.w1))) {
            this.i1 = -9223372036854775807L;
            return true;
        }
        if (this.i1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.i1) {
            return true;
        }
        this.i1 = -9223372036854775807L;
        return false;
    }

    @Override // c.f.a.b.a3.t
    public boolean g1(c.f.a.b.a3.s sVar) {
        return this.a1 != null || X1(sVar);
    }

    @Override // c.f.a.b.h2, c.f.a.b.j2
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // c.f.a.b.a3.t
    public int i1(c.f.a.b.a3.u uVar, k1 k1Var) {
        int i2 = 0;
        if (!c.f.a.b.j3.d0.s(k1Var.f9338m)) {
            return i2.a(0);
        }
        boolean z = k1Var.p != null;
        List<c.f.a.b.a3.s> listZ1 = z1(uVar, k1Var, z, false);
        if (z && listZ1.isEmpty()) {
            listZ1 = z1(uVar, k1Var, false, false);
        }
        if (listZ1.isEmpty()) {
            return i2.a(1);
        }
        if (!c.f.a.b.a3.t.j1(k1Var)) {
            return i2.a(2);
        }
        c.f.a.b.a3.s sVar = listZ1.get(0);
        boolean zM = sVar.m(k1Var);
        int i3 = sVar.o(k1Var) ? 16 : 8;
        if (zM) {
            List<c.f.a.b.a3.s> listZ12 = z1(uVar, k1Var, z, true);
            if (!listZ12.isEmpty()) {
                c.f.a.b.a3.s sVar2 = listZ12.get(0);
                if (sVar2.m(k1Var) && sVar2.o(k1Var)) {
                    i2 = 32;
                }
            }
        }
        return i2.b(zM ? 4 : 3, i3, i2);
    }

    @Override // c.f.a.b.a3.t, c.f.a.b.u0, c.f.a.b.h2
    public void k(float f2, float f3) throws d1 {
        super.k(f2, f3);
        this.S0.k(f2);
    }

    @Override // c.f.a.b.u0, c.f.a.b.d2.b
    public void p(int i2, Object obj) throws d1 {
        if (i2 == 1) {
            S1(obj);
            return;
        }
        if (i2 == 4) {
            this.d1 = ((Integer) obj).intValue();
            c.f.a.b.a3.q qVarN0 = n0();
            if (qVarN0 != null) {
                qVarN0.j(this.d1);
                return;
            }
            return;
        }
        if (i2 == 6) {
            this.z1 = (y) obj;
            return;
        }
        if (i2 != 102) {
            super.p(i2, obj);
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (this.x1 != iIntValue) {
            this.x1 = iIntValue;
            if (this.w1) {
                V0();
            }
        }
    }

    @Override // c.f.a.b.a3.t
    public boolean p0() {
        return this.w1 && x0.f9296a < 23;
    }

    public final void p1() {
        c.f.a.b.a3.q qVarN0;
        this.e1 = false;
        if (x0.f9296a < 23 || !this.w1 || (qVarN0 = n0()) == null) {
            return;
        }
        this.y1 = new b(qVarN0);
    }

    @Override // c.f.a.b.a3.t
    public float q0(float f2, k1 k1Var, k1[] k1VarArr) {
        float fMax = -1.0f;
        for (k1 k1Var2 : k1VarArr) {
            float f3 = k1Var2.t;
            if (f3 != -1.0f) {
                fMax = Math.max(fMax, f3);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f2;
    }

    public final void q1() {
        this.v1 = null;
    }

    public boolean r1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (u.class) {
            if (!P0) {
                Q0 = v1();
                P0 = true;
            }
        }
        return Q0;
    }

    @Override // c.f.a.b.a3.t
    public List<c.f.a.b.a3.s> s0(c.f.a.b.a3.u uVar, k1 k1Var, boolean z) {
        return z1(uVar, k1Var, z, this.w1);
    }

    @Override // c.f.a.b.a3.t
    @TargetApi(17)
    public q.a u0(c.f.a.b.a3.s sVar, k1 k1Var, MediaCrypto mediaCrypto, float f2) {
        q qVar = this.b1;
        if (qVar != null && qVar.f9499d != sVar.f6485g) {
            qVar.release();
            this.b1 = null;
        }
        String str = sVar.f6481c;
        a aVarY1 = y1(sVar, k1Var, B());
        this.X0 = aVarY1;
        MediaFormat mediaFormatB1 = B1(k1Var, str, aVarY1, f2, this.W0, this.w1 ? this.x1 : 0);
        if (this.a1 == null) {
            if (!X1(sVar)) {
                throw new IllegalStateException();
            }
            if (this.b1 == null) {
                this.b1 = q.d(this.R0, sVar.f6485g);
            }
            this.a1 = this.b1;
        }
        return new q.a(sVar, mediaFormatB1, k1Var, this.a1, mediaCrypto, 0);
    }

    public void u1(c.f.a.b.a3.q qVar, int i2, long j2) {
        v0.a("dropVideoBuffer");
        qVar.i(i2, false);
        v0.c();
        Z1(1);
    }

    @Override // c.f.a.b.a3.t
    @TargetApi(29)
    public void x0(c.f.a.b.v2.f fVar) {
        if (this.Z0) {
            ByteBuffer byteBuffer = (ByteBuffer) c.f.a.b.j3.g.e(fVar.f10279f);
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4 && b4 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    Q1(n0(), bArr);
                }
            }
        }
    }

    public a y1(c.f.a.b.a3.s sVar, k1 k1Var, k1[] k1VarArr) {
        int iW1;
        int iMax = k1Var.r;
        int iMax2 = k1Var.s;
        int iA1 = A1(sVar, k1Var);
        if (k1VarArr.length == 1) {
            if (iA1 != -1 && (iW1 = w1(sVar, k1Var.f9338m, k1Var.r, k1Var.s)) != -1) {
                iA1 = Math.min((int) (iA1 * 1.5f), iW1);
            }
            return new a(iMax, iMax2, iA1);
        }
        int length = k1VarArr.length;
        boolean z = false;
        for (int i2 = 0; i2 < length; i2++) {
            k1 k1VarE = k1VarArr[i2];
            if (k1Var.y != null && k1VarE.y == null) {
                k1VarE = k1VarE.b().J(k1Var.y).E();
            }
            if (sVar.e(k1Var, k1VarE).f10287d != 0) {
                int i3 = k1VarE.r;
                z |= i3 == -1 || k1VarE.s == -1;
                iMax = Math.max(iMax, i3);
                iMax2 = Math.max(iMax2, k1VarE.s);
                iA1 = Math.max(iA1, A1(sVar, k1VarE));
            }
        }
        if (z) {
            c.f.a.b.j3.z.i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointX1 = x1(sVar, k1Var);
            if (pointX1 != null) {
                iMax = Math.max(iMax, pointX1.x);
                iMax2 = Math.max(iMax2, pointX1.y);
                iA1 = Math.max(iA1, w1(sVar, k1Var.f9338m, iMax, iMax2));
                c.f.a.b.j3.z.i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new a(iMax, iMax2, iA1);
    }
}
