package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pk extends ya implements all {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f22711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final oi f22712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final op f22713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ke f22716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f22717h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f22718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f22719j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f22720k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private lp f22721l;

    public pk(Context context, xv xvVar, yc ycVar, Handler handler, oj ojVar, op opVar) {
        super(1, xvVar, ycVar, 44100.0f);
        this.f22711b = context.getApplicationContext();
        this.f22713d = opVar;
        this.f22712c = new oi(handler, ojVar);
        opVar.o(new pj(this));
    }

    private final int aA(xy xyVar, ke keVar) {
        int i2;
        if (!"OMX.google.raw.decoder".equals(xyVar.f23759a) || (i2 = amn.f20135a) >= 24 || (i2 == 23 && amn.U(this.f22711b))) {
            return keVar.f22157m;
        }
        return -1;
    }

    private final void aB() {
        long jB = this.f22713d.b(M());
        if (jB != Long.MIN_VALUE) {
            if (!this.f22719j) {
                jB = Math.max(this.f22717h, jB);
            }
            this.f22717h = jB;
            this.f22719j = false;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq, com.google.ads.interactivemedia.v3.internal.lr
    public final String K() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya, com.google.ads.interactivemedia.v3.internal.lq
    public final boolean M() {
        return super.M() && this.f22713d.u();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya, com.google.ads.interactivemedia.v3.internal.lq
    public final boolean N() {
        return this.f22713d.t() || super.N();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final int P(yc ycVar, ke keVar) {
        if (!alo.m(keVar.f22156l)) {
            return fq.c(0);
        }
        int i2 = amn.f20135a >= 21 ? 32 : 0;
        Class<? extends qt> cls = keVar.E;
        boolean zAx = ya.ax(keVar);
        if (zAx && this.f22713d.v(keVar) && (cls == null || ym.c() != null)) {
            return i2 | 12;
        }
        if ((!"audio/raw".equals(keVar.f22156l) || this.f22713d.v(keVar)) && this.f22713d.v(amn.z(2, keVar.y, keVar.z))) {
            List<xy> listV = V(ycVar, keVar, false);
            if (listV.isEmpty()) {
                return fq.c(1);
            }
            if (!zAx) {
                return fq.c(2);
            }
            xy xyVar = listV.get(0);
            boolean zC = xyVar.c(keVar);
            int i3 = 8;
            if (zC && xyVar.d(keVar)) {
                i3 = 16;
            }
            return (true != zC ? 3 : 4) | i3 | i2;
        }
        return fq.c(1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final qa S(xy xyVar, ke keVar, ke keVar2) {
        int i2;
        int i3;
        qa qaVarB = xyVar.b(keVar, keVar2);
        int i4 = qaVarB.f22810e;
        if (aA(xyVar, keVar2) > this.f22714e) {
            i4 |= 64;
        }
        String str = xyVar.f23759a;
        if (i4 != 0) {
            i3 = i4;
            i2 = 0;
        } else {
            i2 = qaVarB.f22809d;
            i3 = 0;
        }
        return new qa(str, keVar, keVar2, i2, i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final qa T(kf kfVar) {
        qa qaVarT = super.T(kfVar);
        this.f22712c.g(kfVar.f22161b, qaVarT);
        return qaVarT;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    @Override // com.google.ads.interactivemedia.v3.internal.ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.ads.interactivemedia.v3.internal.xu U(com.google.ads.interactivemedia.v3.internal.xy r9, com.google.ads.interactivemedia.v3.internal.ke r10, android.media.MediaCrypto r11, float r12) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.pk.U(com.google.ads.interactivemedia.v3.internal.xy, com.google.ads.interactivemedia.v3.internal.ke, android.media.MediaCrypto, float):com.google.ads.interactivemedia.v3.internal.xu");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final List<xy> V(yc ycVar, ke keVar, boolean z) {
        xy xyVarC;
        String str = keVar.f22156l;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f22713d.v(keVar) && (xyVarC = ym.c()) != null) {
            return Collections.singletonList(xyVarC);
        }
        List<xy> listE = ym.e(ycVar.a(str, z, false), keVar);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(listE);
            arrayList.addAll(ycVar.a("audio/eac3", z, false));
            listE = arrayList;
        }
        return Collections.unmodifiableList(listE);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final void W(Exception exc) {
        alj.a("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f22712c.a(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final void X(String str, long j2, long j3) {
        this.f22712c.c(str, j2, j3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final void Y(String str) {
        this.f22712c.d(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    @Override // com.google.ads.interactivemedia.v3.internal.ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(com.google.ads.interactivemedia.v3.internal.ke r5, android.media.MediaFormat r6) throws com.google.ads.interactivemedia.v3.internal.jb {
        /*
            r4 = this;
            com.google.ads.interactivemedia.v3.internal.ke r0 = r4.f22716g
            r1 = 0
            if (r0 == 0) goto L8
            r5 = r0
            goto L90
        L8:
            com.google.ads.interactivemedia.v3.internal.yp r0 = r4.ay()
            if (r0 != 0) goto L10
            goto L90
        L10:
            java.lang.String r0 = r5.f22156l
            java.lang.String r2 = "audio/raw"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1d
        L1a:
            int r0 = r5.A
            goto L4b
        L1d:
            int r0 = com.google.ads.interactivemedia.v3.internal.amn.f20135a
            r3 = 24
            if (r0 < r3) goto L30
            java.lang.String r0 = "pcm-encoding"
            boolean r3 = r6.containsKey(r0)
            if (r3 == 0) goto L30
            int r0 = r6.getInteger(r0)
            goto L4b
        L30:
            java.lang.String r0 = "v-bits-per-sample"
            boolean r3 = r6.containsKey(r0)
            if (r3 == 0) goto L41
            int r0 = r6.getInteger(r0)
            int r0 = com.google.ads.interactivemedia.v3.internal.amn.g(r0)
            goto L4b
        L41:
            java.lang.String r0 = r5.f22156l
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4a
            goto L1a
        L4a:
            r0 = 2
        L4b:
            com.google.ads.interactivemedia.v3.internal.kd r3 = new com.google.ads.interactivemedia.v3.internal.kd
            r3.<init>()
            r3.ae(r2)
            r3.Y(r0)
            int r0 = r5.B
            r3.M(r0)
            int r0 = r5.C
            r3.N(r0)
            java.lang.String r0 = "channel-count"
            int r0 = r6.getInteger(r0)
            r3.H(r0)
            java.lang.String r0 = "sample-rate"
            int r6 = r6.getInteger(r0)
            r3.af(r6)
            com.google.ads.interactivemedia.v3.internal.ke r6 = r3.s()
            boolean r0 = r4.f22715f
            if (r0 == 0) goto L8f
            int r0 = r6.y
            r2 = 6
            if (r0 != r2) goto L8f
            int r0 = r5.y
            if (r0 >= r2) goto L8f
            int[] r1 = new int[r0]
            r0 = 0
        L86:
            int r2 = r5.y
            if (r0 >= r2) goto L8f
            r1[r0] = r0
            int r0 = r0 + 1
            goto L86
        L8f:
            r5 = r6
        L90:
            com.google.ads.interactivemedia.v3.internal.op r6 = r4.f22713d     // Catch: com.google.ads.interactivemedia.v3.internal.ok -> L96
            r6.w(r5, r1)     // Catch: com.google.ads.interactivemedia.v3.internal.ok -> L96
            return
        L96:
            r5 = move-exception
            com.google.ads.interactivemedia.v3.internal.ke r6 = r5.f22618a
            com.google.ads.interactivemedia.v3.internal.jb r5 = r4.aY(r5, r6)
            goto L9f
        L9e:
            throw r5
        L9f:
            goto L9e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.pk.Z(com.google.ads.interactivemedia.v3.internal.ke, android.media.MediaFormat):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.all
    public final long a() {
        if (aW() == 2) {
            aB();
        }
        return this.f22717h;
    }

    public final void aa() {
        this.f22719j = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final void ab() {
        this.f22713d.g();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final void ac(pz pzVar) {
        if (!this.f22718i || pzVar.f()) {
            return;
        }
        if (Math.abs(pzVar.f22803d - this.f22717h) > 500000) {
            this.f22717h = pzVar.f22803d;
        }
        this.f22718i = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final void ad() throws jb {
        try {
            this.f22713d.j();
        } catch (oo e2) {
            throw h(e2, e2.f22622b, e2.f22621a);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final boolean ae(ke keVar) {
        return this.f22713d.v(keVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final boolean af(long j2, long j3, yp ypVar, ByteBuffer byteBuffer, int i2, int i3, int i4, long j4, boolean z, boolean z2, ke keVar) throws jb {
        ajr.b(byteBuffer);
        if (this.f22716g != null && (i3 & 2) != 0) {
            ajr.b(ypVar);
            ypVar.i(i2, false);
            return true;
        }
        if (z) {
            if (ypVar != null) {
                ypVar.i(i2, false);
            }
            ((ya) this).f23771a.f22794f += i4;
            this.f22713d.g();
            return true;
        }
        try {
            if (!this.f22713d.s(byteBuffer, j4, i4)) {
                return false;
            }
            if (ypVar != null) {
                ypVar.i(i2, false);
            }
            ((ya) this).f23771a.f22793e += i4;
            return true;
        } catch (ol e2) {
            throw h(e2, e2.f22620b, e2.f22619a);
        } catch (oo e3) {
            throw h(e3, keVar, e3.f22621a);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final float ag(float f2, ke[] keVarArr) {
        int iMax = -1;
        for (ke keVar : keVarArr) {
            int i2 = keVar.z;
            if (i2 != -1) {
                iMax = Math.max(iMax, i2);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.all
    public final le c() {
        return this.f22713d.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.all
    public final void g(le leVar) {
        this.f22713d.p(leVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.iv, com.google.ads.interactivemedia.v3.internal.lq
    public final all m() {
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.iv, com.google.ads.interactivemedia.v3.internal.lm
    public final void p(int i2, Object obj) {
        if (i2 == 2) {
            this.f22713d.r(((Float) obj).floatValue());
            return;
        }
        if (i2 == 3) {
            this.f22713d.l((nu) obj);
            return;
        }
        if (i2 == 5) {
            this.f22713d.n((ou) obj);
            return;
        }
        switch (i2) {
            case 101:
                this.f22713d.q(((Boolean) obj).booleanValue());
                break;
            case 102:
                this.f22713d.m(((Integer) obj).intValue());
                break;
            case 103:
                this.f22721l = (lp) obj;
                break;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya, com.google.ads.interactivemedia.v3.internal.iv
    public final void r() {
        this.f22720k = true;
        try {
            this.f22713d.f();
            try {
                super.r();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.r();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya, com.google.ads.interactivemedia.v3.internal.iv
    public final void s(boolean z, boolean z2) {
        super.s(z, z2);
        this.f22712c.f(((ya) this).f23771a);
        if (k().f22342b) {
            this.f22713d.e();
        } else {
            this.f22713d.d();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya, com.google.ads.interactivemedia.v3.internal.iv
    public final void t(long j2, boolean z) {
        super.t(j2, z);
        this.f22713d.f();
        this.f22717h = j2;
        this.f22718i = true;
        this.f22719j = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya, com.google.ads.interactivemedia.v3.internal.iv
    public final void u() {
        try {
            super.u();
            if (this.f22720k) {
                this.f22720k = false;
                this.f22713d.k();
            }
        } catch (Throwable th) {
            if (this.f22720k) {
                this.f22720k = false;
                this.f22713d.k();
            }
            throw th;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.iv
    public final void v() {
        this.f22713d.i();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.iv
    public final void w() {
        aB();
        this.f22713d.h();
    }
}
