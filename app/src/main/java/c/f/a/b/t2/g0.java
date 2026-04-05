package c.f.a.b.t2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import c.f.a.b.a3.q;
import c.f.a.b.d1;
import c.f.a.b.h2;
import c.f.a.b.i2;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.l1;
import c.f.a.b.t2.u;
import c.f.a.b.t2.v;
import c.f.a.b.z1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

/* JADX INFO: loaded from: classes.dex */
public class g0 extends c.f.a.b.a3.t implements c.f.a.b.j3.b0 {
    public final Context O0;
    public final u.a P0;
    public final v Q0;
    public int R0;
    public boolean S0;
    public k1 T0;
    public long U0;
    public boolean V0;
    public boolean W0;
    public boolean X0;
    public boolean Y0;
    public h2.a Z0;

    public final class b implements v.c {
        public b() {
        }

        @Override // c.f.a.b.t2.v.c
        public void a(boolean z) {
            g0.this.P0.C(z);
        }

        @Override // c.f.a.b.t2.v.c
        public void b(long j2) {
            g0.this.P0.B(j2);
        }

        @Override // c.f.a.b.t2.v.c
        public void c(Exception exc) {
            c.f.a.b.j3.z.e("MediaCodecAudioRenderer", "Audio sink error", exc);
            g0.this.P0.b(exc);
        }

        @Override // c.f.a.b.t2.v.c
        public void d(int i2, long j2, long j3) {
            g0.this.P0.D(i2, j2, j3);
        }

        @Override // c.f.a.b.t2.v.c
        public void e(long j2) {
            if (g0.this.Z0 != null) {
                g0.this.Z0.b(j2);
            }
        }

        @Override // c.f.a.b.t2.v.c
        public void f() {
            g0.this.u1();
        }

        @Override // c.f.a.b.t2.v.c
        public void g() {
            if (g0.this.Z0 != null) {
                g0.this.Z0.a();
            }
        }
    }

    public g0(Context context, q.b bVar, c.f.a.b.a3.u uVar, boolean z, Handler handler, u uVar2, v vVar) {
        super(1, bVar, uVar, z, 44100.0f);
        this.O0 = context.getApplicationContext();
        this.Q0 = vVar;
        this.P0 = new u.a(handler, uVar2);
        vVar.n(new b());
    }

    public g0(Context context, c.f.a.b.a3.u uVar, boolean z, Handler handler, u uVar2, v vVar) {
        this(context, q.b.f6476a, uVar, z, handler, uVar2, vVar);
    }

    public static boolean p1(String str) {
        if (x0.f9296a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(x0.f9298c)) {
            String str2 = x0.f9297b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    public static boolean q1() {
        if (x0.f9296a == 23) {
            String str = x0.f9299d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // c.f.a.b.a3.t, c.f.a.b.u0
    public void D() {
        this.X0 = true;
        try {
            this.Q0.flush();
            try {
                super.D();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.D();
                throw th;
            } finally {
            }
        }
    }

    @Override // c.f.a.b.a3.t, c.f.a.b.u0
    public void E(boolean z, boolean z2) {
        super.E(z, z2);
        this.P0.f(this.K0);
        if (y().f9357b) {
            this.Q0.l();
        } else {
            this.Q0.i();
        }
    }

    @Override // c.f.a.b.a3.t, c.f.a.b.u0
    public void F(long j2, boolean z) throws d1 {
        super.F(j2, z);
        if (this.Y0) {
            this.Q0.q();
        } else {
            this.Q0.flush();
        }
        this.U0 = j2;
        this.V0 = true;
        this.W0 = true;
    }

    @Override // c.f.a.b.a3.t, c.f.a.b.u0
    public void G() {
        try {
            super.G();
        } finally {
            if (this.X0) {
                this.X0 = false;
                this.Q0.reset();
            }
        }
    }

    @Override // c.f.a.b.a3.t, c.f.a.b.u0
    public void H() {
        super.H();
        this.Q0.play();
    }

    @Override // c.f.a.b.a3.t, c.f.a.b.u0
    public void I() {
        v1();
        this.Q0.pause();
        super.I();
    }

    @Override // c.f.a.b.a3.t
    public void I0(Exception exc) {
        c.f.a.b.j3.z.e("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.P0.a(exc);
    }

    @Override // c.f.a.b.a3.t
    public void J0(String str, long j2, long j3) {
        this.P0.c(str, j2, j3);
    }

    @Override // c.f.a.b.a3.t
    public void K0(String str) {
        this.P0.d(str);
    }

    @Override // c.f.a.b.a3.t
    public c.f.a.b.v2.g L0(l1 l1Var) throws d1 {
        c.f.a.b.v2.g gVarL0 = super.L0(l1Var);
        this.P0.g(l1Var.f9575b, gVarL0);
        return gVarL0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    @Override // c.f.a.b.a3.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void M0(c.f.a.b.k1 r6, android.media.MediaFormat r7) throws c.f.a.b.d1 {
        /*
            r5 = this;
            c.f.a.b.k1 r0 = r5.T0
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L9
            r6 = r0
            goto L97
        L9:
            c.f.a.b.a3.q r0 = r5.n0()
            if (r0 != 0) goto L11
            goto L97
        L11:
            java.lang.String r0 = r6.f9338m
            java.lang.String r3 = "audio/raw"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1e
        L1b:
            int r0 = r6.B
            goto L4c
        L1e:
            int r0 = c.f.a.b.j3.x0.f9296a
            r4 = 24
            if (r0 < r4) goto L31
            java.lang.String r0 = "pcm-encoding"
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L31
            int r0 = r7.getInteger(r0)
            goto L4c
        L31:
            java.lang.String r0 = "v-bits-per-sample"
            boolean r4 = r7.containsKey(r0)
            if (r4 == 0) goto L42
            int r0 = r7.getInteger(r0)
            int r0 = c.f.a.b.j3.x0.a0(r0)
            goto L4c
        L42:
            java.lang.String r0 = r6.f9338m
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L4b
            goto L1b
        L4b:
            r0 = 2
        L4c:
            c.f.a.b.k1$b r4 = new c.f.a.b.k1$b
            r4.<init>()
            c.f.a.b.k1$b r3 = r4.e0(r3)
            c.f.a.b.k1$b r0 = r3.Y(r0)
            int r3 = r6.C
            c.f.a.b.k1$b r0 = r0.M(r3)
            int r3 = r6.D
            c.f.a.b.k1$b r0 = r0.N(r3)
            java.lang.String r3 = "channel-count"
            int r3 = r7.getInteger(r3)
            c.f.a.b.k1$b r0 = r0.H(r3)
            java.lang.String r3 = "sample-rate"
            int r7 = r7.getInteger(r3)
            c.f.a.b.k1$b r7 = r0.f0(r7)
            c.f.a.b.k1 r7 = r7.E()
            boolean r0 = r5.S0
            if (r0 == 0) goto L96
            int r0 = r7.z
            r3 = 6
            if (r0 != r3) goto L96
            int r0 = r6.z
            if (r0 >= r3) goto L96
            int[] r2 = new int[r0]
            r0 = 0
        L8d:
            int r3 = r6.z
            if (r0 >= r3) goto L96
            r2[r0] = r0
            int r0 = r0 + 1
            goto L8d
        L96:
            r6 = r7
        L97:
            c.f.a.b.t2.v r7 = r5.Q0     // Catch: c.f.a.b.t2.v.a -> L9d
            r7.p(r6, r1, r2)     // Catch: c.f.a.b.t2.v.a -> L9d
            return
        L9d:
            r6 = move-exception
            c.f.a.b.k1 r7 = r6.f10178b
            r0 = 5001(0x1389, float:7.008E-42)
            c.f.a.b.d1 r6 = r5.w(r6, r7, r0)
            goto La8
        La7:
            throw r6
        La8:
            goto La7
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.t2.g0.M0(c.f.a.b.k1, android.media.MediaFormat):void");
    }

    @Override // c.f.a.b.a3.t
    public c.f.a.b.v2.g O(c.f.a.b.a3.s sVar, k1 k1Var, k1 k1Var2) {
        c.f.a.b.v2.g gVarE = sVar.e(k1Var, k1Var2);
        int i2 = gVarE.f10288e;
        if (r1(sVar, k1Var2) > this.R0) {
            i2 |= 64;
        }
        int i3 = i2;
        return new c.f.a.b.v2.g(sVar.f6479a, k1Var, k1Var2, i3 != 0 ? 0 : gVarE.f10287d, i3);
    }

    @Override // c.f.a.b.a3.t
    public void O0() {
        super.O0();
        this.Q0.k();
    }

    @Override // c.f.a.b.a3.t
    public void P0(c.f.a.b.v2.f fVar) {
        if (!this.V0 || fVar.isDecodeOnly()) {
            return;
        }
        if (Math.abs(fVar.f10278e - this.U0) > 500000) {
            this.U0 = fVar.f10278e;
        }
        this.V0 = false;
    }

    @Override // c.f.a.b.a3.t
    public boolean R0(long j2, long j3, c.f.a.b.a3.q qVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, k1 k1Var) throws d1 {
        c.f.a.b.j3.g.e(byteBuffer);
        if (this.T0 != null && (i3 & 2) != 0) {
            ((c.f.a.b.a3.q) c.f.a.b.j3.g.e(qVar)).i(i2, false);
            return true;
        }
        if (z) {
            if (qVar != null) {
                qVar.i(i2, false);
            }
            this.K0.f10269f += i4;
            this.Q0.k();
            return true;
        }
        try {
            if (!this.Q0.m(byteBuffer, j4, i4)) {
                return false;
            }
            if (qVar != null) {
                qVar.i(i2, false);
            }
            this.K0.f10268e += i4;
            return true;
        } catch (v.b e2) {
            throw x(e2, e2.f10181d, e2.f10180c, 5001);
        } catch (v.e e3) {
            throw x(e3, k1Var, e3.f10185c, 5002);
        }
    }

    @Override // c.f.a.b.a3.t
    public void W0() throws d1 {
        try {
            this.Q0.e();
        } catch (v.e e2) {
            throw x(e2, e2.f10186d, e2.f10185c, 5002);
        }
    }

    @Override // c.f.a.b.a3.t, c.f.a.b.h2
    public boolean b() {
        return super.b() && this.Q0.b();
    }

    @Override // c.f.a.b.j3.b0
    public z1 c() {
        return this.Q0.c();
    }

    @Override // c.f.a.b.j3.b0
    public void d(z1 z1Var) {
        this.Q0.d(z1Var);
    }

    @Override // c.f.a.b.a3.t, c.f.a.b.h2
    public boolean e() {
        return this.Q0.f() || super.e();
    }

    @Override // c.f.a.b.h2, c.f.a.b.j2
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // c.f.a.b.a3.t
    public boolean h1(k1 k1Var) {
        return this.Q0.a(k1Var);
    }

    @Override // c.f.a.b.a3.t
    public int i1(c.f.a.b.a3.u uVar, k1 k1Var) {
        if (!c.f.a.b.j3.d0.p(k1Var.f9338m)) {
            return i2.a(0);
        }
        int i2 = x0.f9296a >= 21 ? 32 : 0;
        boolean z = k1Var.F != null;
        boolean zJ1 = c.f.a.b.a3.t.j1(k1Var);
        int i3 = 8;
        if (zJ1 && this.Q0.a(k1Var) && (!z || c.f.a.b.a3.v.q() != null)) {
            return i2.b(4, 8, i2);
        }
        if ((!"audio/raw".equals(k1Var.f9338m) || this.Q0.a(k1Var)) && this.Q0.a(x0.b0(2, k1Var.z, k1Var.A))) {
            List<c.f.a.b.a3.s> listS0 = s0(uVar, k1Var, false);
            if (listS0.isEmpty()) {
                return i2.a(1);
            }
            if (!zJ1) {
                return i2.a(2);
            }
            c.f.a.b.a3.s sVar = listS0.get(0);
            boolean zM = sVar.m(k1Var);
            if (zM && sVar.o(k1Var)) {
                i3 = 16;
            }
            return i2.b(zM ? 4 : 3, i3, i2);
        }
        return i2.a(1);
    }

    @Override // c.f.a.b.j3.b0
    public long j() {
        if (getState() == 2) {
            v1();
        }
        return this.U0;
    }

    @Override // c.f.a.b.u0, c.f.a.b.d2.b
    public void p(int i2, Object obj) {
        if (i2 == 2) {
            this.Q0.setVolume(((Float) obj).floatValue());
        }
        if (i2 == 3) {
            this.Q0.j((p) obj);
            return;
        }
        if (i2 == 5) {
            this.Q0.s((z) obj);
            return;
        }
        switch (i2) {
            case 101:
                this.Q0.r(((Boolean) obj).booleanValue());
                break;
            case 102:
                this.Q0.g(((Integer) obj).intValue());
                break;
            case 103:
                this.Z0 = (h2.a) obj;
                break;
            default:
                super.p(i2, obj);
                break;
        }
    }

    @Override // c.f.a.b.a3.t
    public float q0(float f2, k1 k1Var, k1[] k1VarArr) {
        int iMax = -1;
        for (k1 k1Var2 : k1VarArr) {
            int i2 = k1Var2.A;
            if (i2 != -1) {
                iMax = Math.max(iMax, i2);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f2 * iMax;
    }

    public final int r1(c.f.a.b.a3.s sVar, k1 k1Var) {
        int i2;
        if (!"OMX.google.raw.decoder".equals(sVar.f6479a) || (i2 = x0.f9296a) >= 24 || (i2 == 23 && x0.v0(this.O0))) {
            return k1Var.f9339n;
        }
        return -1;
    }

    @Override // c.f.a.b.a3.t
    public List<c.f.a.b.a3.s> s0(c.f.a.b.a3.u uVar, k1 k1Var, boolean z) {
        c.f.a.b.a3.s sVarQ;
        String str = k1Var.f9338m;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.Q0.a(k1Var) && (sVarQ = c.f.a.b.a3.v.q()) != null) {
            return Collections.singletonList(sVarQ);
        }
        List<c.f.a.b.a3.s> listP = c.f.a.b.a3.v.p(uVar.a(str, z, false), k1Var);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(listP);
            arrayList.addAll(uVar.a("audio/eac3", z, false));
            listP = arrayList;
        }
        return Collections.unmodifiableList(listP);
    }

    public int s1(c.f.a.b.a3.s sVar, k1 k1Var, k1[] k1VarArr) {
        int iR1 = r1(sVar, k1Var);
        if (k1VarArr.length == 1) {
            return iR1;
        }
        for (k1 k1Var2 : k1VarArr) {
            if (sVar.e(k1Var, k1Var2).f10287d != 0) {
                iR1 = Math.max(iR1, r1(sVar, k1Var2));
            }
        }
        return iR1;
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat t1(k1 k1Var, String str, int i2, float f2) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, str);
        mediaFormat.setInteger("channel-count", k1Var.z);
        mediaFormat.setInteger("sample-rate", k1Var.A);
        c.f.a.b.j3.c0.e(mediaFormat, k1Var.f9340o);
        c.f.a.b.j3.c0.d(mediaFormat, "max-input-size", i2);
        int i3 = x0.f9296a;
        if (i3 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f && !q1()) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (i3 <= 28 && "audio/ac4".equals(k1Var.f9338m)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i3 >= 24 && this.Q0.o(x0.b0(4, k1Var.z, k1Var.A)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }

    @Override // c.f.a.b.a3.t
    public q.a u0(c.f.a.b.a3.s sVar, k1 k1Var, MediaCrypto mediaCrypto, float f2) {
        this.R0 = s1(sVar, k1Var, B());
        this.S0 = p1(sVar.f6479a);
        MediaFormat mediaFormatT1 = t1(k1Var, sVar.f6481c, this.R0, f2);
        this.T0 = "audio/raw".equals(sVar.f6480b) && !"audio/raw".equals(k1Var.f9338m) ? k1Var : null;
        return new q.a(sVar, mediaFormatT1, k1Var, null, mediaCrypto, 0);
    }

    public void u1() {
        this.W0 = true;
    }

    @Override // c.f.a.b.u0, c.f.a.b.h2
    public c.f.a.b.j3.b0 v() {
        return this;
    }

    public final void v1() {
        long jH = this.Q0.h(b());
        if (jH != Long.MIN_VALUE) {
            if (!this.W0) {
                jH = Math.max(this.U0, jH);
            }
            this.U0 = jH;
            this.W0 = false;
        }
    }
}
