package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.util.Log;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class pg implements op {
    private long A;
    private int B;
    private boolean C;
    private boolean D;
    private long E;
    private float F;
    private nz[] G;
    private ByteBuffer[] H;
    private ByteBuffer I;
    private int J;
    private ByteBuffer K;
    private byte[] L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private int S;
    private ou T;
    private boolean U;
    private long V;
    private boolean W;
    private boolean X;
    private final oz Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nv f22690a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f22691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ow f22692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ps f22693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final nz[] f22694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final nz[] f22695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ConditionVariable f22696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ot f22697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayDeque<pa> f22698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f22699j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private pf f22700k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final pb<ol> f22701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final pb<oo> f22702m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private om f22703n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private oy f22704o;
    private oy p;
    private AudioTrack q;
    private nu r;
    private pa s;
    private pa t;
    private le u;
    private ByteBuffer v;
    private int w;
    private long x;
    private long y;
    private long z;

    public pg(nv nvVar, oz ozVar) {
        this.Y = ozVar;
        int i2 = amn.f20135a;
        this.f22691b = false;
        this.f22699j = false;
        this.f22696g = new ConditionVariable(true);
        this.f22697h = new ot(new pc(this));
        ow owVar = new ow();
        this.f22692c = owVar;
        ps psVar = new ps();
        this.f22693d = psVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new po(), owVar, psVar);
        Collections.addAll(arrayList, ozVar.c());
        this.f22694e = (nz[]) arrayList.toArray(new nz[0]);
        this.f22695f = new nz[]{new pi()};
        this.F = 1.0f;
        this.r = nu.f22565a;
        this.S = 0;
        this.T = new ou();
        le leVar = le.f22306a;
        this.t = new pa(leVar, false, 0L, 0L);
        this.u = leVar;
        this.N = -1;
        this.G = new nz[0];
        this.H = new ByteBuffer[0];
        this.f22698i = new ArrayDeque<>();
        this.f22701l = new pb<>();
        this.f22702m = new pb<>();
    }

    private static int G(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long H() {
        oy oyVar = this.p;
        return oyVar.f22664c == 0 ? this.x / ((long) oyVar.f22663b) : this.y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long I() {
        oy oyVar = this.p;
        return oyVar.f22664c == 0 ? this.z / ((long) oyVar.f22665d) : this.A;
    }

    private static Pair<Integer, Integer> J(ke keVar, nv nvVar) {
        return null;
    }

    private final le K() {
        return L().f22678a;
    }

    private final pa L() {
        pa paVar = this.s;
        return paVar != null ? paVar : !this.f22698i.isEmpty() ? this.f22698i.getLast() : this.t;
    }

    private final void M(long j2) {
        le leVarK;
        boolean z;
        if (X()) {
            oz ozVar = this.Y;
            leVarK = K();
            ozVar.d(leVarK);
        } else {
            leVarK = le.f22306a;
        }
        le leVar = leVarK;
        if (X()) {
            oz ozVar2 = this.Y;
            boolean zF = F();
            ozVar2.e(zF);
            z = zF;
        } else {
            z = false;
        }
        this.f22698i.add(new pa(leVar, z, Math.max(0L, j2), this.p.b(I())));
        nz[] nzVarArr = this.p.f22670i;
        ArrayList arrayList = new ArrayList();
        for (nz nzVar : nzVarArr) {
            if (nzVar.g()) {
                arrayList.add(nzVar);
            } else {
                nzVar.c();
            }
        }
        int size = arrayList.size();
        this.G = (nz[]) arrayList.toArray(new nz[size]);
        this.H = new ByteBuffer[size];
        N();
        om omVar = this.f22703n;
        if (omVar != null) {
            ((pj) omVar).f22710a.f22712c.s(z);
        }
    }

    private final void N() {
        int i2 = 0;
        while (true) {
            nz[] nzVarArr = this.G;
            if (i2 >= nzVarArr.length) {
                return;
            }
            nz nzVar = nzVarArr[i2];
            nzVar.c();
            this.H[i2] = nzVar.b();
            i2++;
        }
    }

    private final void O() {
        if (this.p.d()) {
            this.W = true;
        }
    }

    private final void P() {
        if (this.P) {
            return;
        }
        this.P = true;
        this.f22697h.d(I());
        this.q.stop();
        this.w = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    private final void Q(long j2) throws oo, T {
        ByteBuffer byteBuffer;
        int length = this.G.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.H[i2 - 1];
            } else {
                byteBuffer = this.I;
                if (byteBuffer == null) {
                    byteBuffer = nz.f22577a;
                }
            }
            if (i2 == length) {
                T(byteBuffer, j2);
            } else {
                nz nzVar = this.G[i2];
                if (i2 > this.N) {
                    nzVar.e(byteBuffer);
                }
                ByteBuffer byteBufferB = nzVar.b();
                this.H[i2] = byteBufferB;
                if (byteBufferB.hasRemaining()) {
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

    private final void R(le leVar, boolean z) {
        pa paVarL = L();
        if (leVar.equals(paVarL.f22678a) && z == paVarL.f22679b) {
            return;
        }
        pa paVar = new pa(leVar, z, -9223372036854775807L, -9223372036854775807L);
        if (V()) {
            this.s = paVar;
        } else {
            this.t = paVar;
        }
    }

    private final void S() {
        if (V()) {
            if (amn.f20135a >= 21) {
                this.q.setVolume(this.F);
                return;
            }
            AudioTrack audioTrack = this.q;
            float f2 = this.F;
            audioTrack.setStereoVolume(f2, f2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void T(java.nio.ByteBuffer r13, long r14) throws com.google.ads.interactivemedia.v3.internal.oo, T {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.pg.T(java.nio.ByteBuffer, long):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean U() throws com.google.ads.interactivemedia.v3.internal.oo, T {
        /*
            r9 = this;
            int r0 = r9.N
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.N = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.N
            com.google.ads.interactivemedia.v3.internal.nz[] r5 = r9.G
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.d()
        L1f:
            r9.Q(r7)
            boolean r0 = r4.h()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.N
            int r0 = r0 + r2
            r9.N = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.K
            if (r0 == 0) goto L3b
            r9.T(r0, r7)
            java.nio.ByteBuffer r0 = r9.K
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.N = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.pg.U():boolean");
    }

    private final boolean V() {
        return this.q != null;
    }

    private static boolean W(AudioTrack audioTrack) {
        return amn.f20135a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean X() {
        return (this.U || !"audio/raw".equals(this.p.f22662a.f22156l) || Y(this.p.f22662a.A)) ? false : true;
    }

    private final boolean Y(int i2) {
        return false;
    }

    public final boolean F() {
        return L().f22679b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final int a(ke keVar) {
        if (!"audio/raw".equals(keVar.f22156l)) {
            if (!this.W) {
                int i2 = amn.f20135a;
            }
            return J(keVar, null) != null ? 2 : 0;
        }
        boolean zR = amn.R(keVar.A);
        int i3 = keVar.A;
        if (zR) {
            return i3 != 2 ? 1 : 2;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Invalid PCM encoding: ");
        sb.append(i3);
        Log.w("DefaultAudioSink", sb.toString());
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final long b(boolean z) {
        long jL;
        if (!V() || this.D) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f22697h.b(z), this.p.b(I()));
        while (!this.f22698i.isEmpty() && jMin >= this.f22698i.getFirst().f22681d) {
            this.t = this.f22698i.remove();
        }
        pa paVar = this.t;
        long j2 = jMin - paVar.f22681d;
        if (paVar.f22678a.equals(le.f22306a)) {
            jL = this.t.f22680c + j2;
        } else if (this.f22698i.isEmpty()) {
            jL = this.Y.a(j2) + this.t.f22680c;
        } else {
            pa first = this.f22698i.getFirst();
            jL = first.f22680c - amn.l(first.f22681d - jMin, this.t.f22678a.f22307b);
        }
        return jL + this.p.b(this.Y.b());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final le c() {
        return K();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final void d() {
        if (this.U) {
            this.U = false;
            f();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final void e() {
        ajr.f(amn.f20135a >= 21);
        ajr.f(this.R);
        if (this.U) {
            return;
        }
        this.U = true;
        f();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final void f() {
        if (V()) {
            this.x = 0L;
            this.y = 0L;
            this.z = 0L;
            this.A = 0L;
            this.X = false;
            this.B = 0;
            this.t = new pa(K(), F(), 0L, 0L);
            this.E = 0L;
            this.s = null;
            this.f22698i.clear();
            this.I = null;
            this.J = 0;
            this.K = null;
            this.P = false;
            this.O = false;
            this.N = -1;
            this.v = null;
            this.w = 0;
            this.f22693d.p();
            N();
            if (this.f22697h.i()) {
                this.q.pause();
            }
            if (W(this.q)) {
                pf pfVar = this.f22700k;
                ajr.b(pfVar);
                pfVar.b(this.q);
            }
            AudioTrack audioTrack = this.q;
            this.q = null;
            if (amn.f20135a < 21 && !this.R) {
                this.S = 0;
            }
            oy oyVar = this.f22704o;
            if (oyVar != null) {
                this.p = oyVar;
                this.f22704o = null;
            }
            this.f22697h.e();
            this.f22696g.close();
            new ox(this, audioTrack).start();
        }
        this.f22702m.a();
        this.f22701l.a();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final void g() {
        this.C = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final void h() {
        this.Q = false;
        if (V() && this.f22697h.l()) {
            this.q.pause();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final void i() {
        this.Q = true;
        if (V()) {
            this.f22697h.g();
            this.q.play();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final void j() {
        if (!this.O && V() && U()) {
            P();
            this.O = true;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final void k() {
        f();
        for (nz nzVar : this.f22694e) {
            nzVar.f();
        }
        nz[] nzVarArr = this.f22695f;
        int length = nzVarArr.length;
        nzVarArr[0].f();
        this.Q = false;
        this.W = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final void l(nu nuVar) {
        if (this.r.equals(nuVar)) {
            return;
        }
        this.r = nuVar;
        if (this.U) {
            return;
        }
        f();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final void m(int i2) {
        if (this.S != i2) {
            this.S = i2;
            this.R = i2 != 0;
            f();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final void n(ou ouVar) {
        if (this.T.equals(ouVar)) {
            return;
        }
        int i2 = ouVar.f22649a;
        if (this.q != null) {
            int i3 = this.T.f22649a;
        }
        this.T = ouVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final void o(om omVar) {
        this.f22703n = omVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final void p(le leVar) {
        R(new le(amn.a(leVar.f22307b, 0.1f, 8.0f), amn.a(leVar.f22308c, 0.1f, 8.0f)), F());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final void q(boolean z) {
        R(K(), z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final void r(float f2) {
        if (this.F != f2) {
            this.F = f2;
            S();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: T */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0254 A[RETURN] */
    @Override // com.google.ads.interactivemedia.v3.internal.op
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s(java.nio.ByteBuffer r17, long r18, int r20) throws com.google.ads.interactivemedia.v3.internal.oo, T, com.google.ads.interactivemedia.v3.internal.ol {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.pg.s(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final boolean t() {
        return V() && this.f22697h.h(I());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final boolean u() {
        return !V() || (this.O && !t());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final boolean v(ke keVar) {
        return a(keVar) != 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.op
    public final void w(ke keVar, int[] iArr) throws ok {
        nz[] nzVarArr;
        int iIntValue;
        int i2;
        int iH;
        int iH2;
        int i3;
        int i4;
        int[] iArr2;
        if ("audio/raw".equals(keVar.f22156l)) {
            ajr.d(amn.R(keVar.A));
            iH = amn.h(keVar.A, keVar.y);
            nz[] nzVarArr2 = Y(keVar.A) ? this.f22695f : this.f22694e;
            this.f22693d.q(keVar.B, keVar.C);
            if (amn.f20135a < 21 && keVar.y == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i5 = 0; i5 < 6; i5++) {
                    iArr2[i5] = i5;
                }
            } else {
                iArr2 = iArr;
            }
            this.f22692c.o(iArr2);
            nx nxVar = new nx(keVar.z, keVar.y, keVar.A);
            for (nz nzVar : nzVarArr2) {
                try {
                    nx nxVarA = nzVar.a(nxVar);
                    if (true == nzVar.g()) {
                        nxVar = nxVarA;
                    }
                } catch (ny e2) {
                    throw new ok(e2, keVar);
                }
            }
            int i6 = nxVar.f22575d;
            i3 = nxVar.f22573b;
            iIntValue = amn.d(nxVar.f22574c);
            nzVarArr = nzVarArr2;
            i2 = i6;
            iH2 = amn.h(i6, nxVar.f22574c);
            i4 = 0;
        } else {
            nz[] nzVarArr3 = new nz[0];
            int i7 = keVar.z;
            Pair<Integer, Integer> pairJ = J(keVar, null);
            int i8 = amn.f20135a;
            if (pairJ == null) {
                String strValueOf = String.valueOf(keVar);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 37);
                sb.append("Unable to configure passthrough for: ");
                sb.append(strValueOf);
                throw new ok(sb.toString(), keVar);
            }
            int iIntValue2 = ((Integer) pairJ.first).intValue();
            nzVarArr = nzVarArr3;
            iIntValue = ((Integer) pairJ.second).intValue();
            i2 = iIntValue2;
            iH = -1;
            iH2 = -1;
            i3 = i7;
            i4 = 2;
        }
        if (i2 == 0) {
            String strValueOf2 = String.valueOf(keVar);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 48);
            sb2.append("Invalid output encoding (mode=");
            sb2.append(i4);
            sb2.append(") for: ");
            sb2.append(strValueOf2);
            throw new ok(sb2.toString(), keVar);
        }
        if (iIntValue != 0) {
            this.W = false;
            oy oyVar = new oy(keVar, iH, i4, iH2, i3, iIntValue, i2, false, nzVarArr);
            if (V()) {
                this.f22704o = oyVar;
                return;
            } else {
                this.p = oyVar;
                return;
            }
        }
        String strValueOf3 = String.valueOf(keVar);
        StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 54);
        sb3.append("Invalid output channel config (mode=");
        sb3.append(i4);
        sb3.append(") for: ");
        sb3.append(strValueOf3);
        throw new ok(sb3.toString(), keVar);
    }
}
