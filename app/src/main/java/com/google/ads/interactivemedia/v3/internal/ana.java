package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import org.joda.time.DateTimeConstants;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

/* JADX INFO: loaded from: classes.dex */
public final class ana extends ya {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f20199c = {1920, 1600, DateTimeConstants.MINUTES_PER_DAY, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f20200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f20201e;
    private long A;
    private long B;
    private int C;
    private int D;
    private int E;
    private int F;
    private float G;
    private anq H;
    private boolean I;
    private int J;
    private anb K;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public amz f20202b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f20203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ane f20204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ano f20205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f20206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private amy f20207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f20208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f20209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Surface f20210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private amt f20211n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f20212o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private long t;
    private long u;
    private long v;
    private int w;
    private int x;
    private int y;
    private long z;

    public ana(Context context, xv xvVar, yc ycVar, Handler handler, anp anpVar) {
        super(2, xvVar, ycVar, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f20203f = applicationContext;
        this.f20204g = new ane(applicationContext);
        this.f20205h = new ano(handler, anpVar);
        this.f20206i = "NVIDIA".equals(amn.f20137c);
        this.u = -9223372036854775807L;
        this.D = -1;
        this.E = -1;
        this.G = -1.0f;
        this.p = 1;
        this.J = 0;
        aL();
    }

    public static int Q(xy xyVar, ke keVar) {
        if (keVar.f22157m == -1) {
            return aI(xyVar, keVar.f22156l, keVar.q, keVar.r);
        }
        int size = keVar.f22158n.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += keVar.f22158n.get(i2).length;
        }
        return keVar.f22157m + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0712  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean aE(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 2778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ana.aE(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int aI(com.google.ads.interactivemedia.v3.internal.xy r5, java.lang.String r6, int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ana.aI(com.google.ads.interactivemedia.v3.internal.xy, java.lang.String, int, int):int");
    }

    private static List<xy> aJ(yc ycVar, ke keVar, boolean z, boolean z2) {
        Pair<Integer, Integer> pairB;
        String str;
        String str2 = keVar.f22156l;
        if (str2 == null) {
            return Collections.emptyList();
        }
        List<xy> listE = ym.e(ycVar.a(str2, z, z2), keVar);
        if ("video/dolby-vision".equals(str2) && (pairB = ym.b(keVar)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
            if (iIntValue != 16 && iIntValue != 256) {
                str = iIntValue == 512 ? "video/avc" : "video/hevc";
            }
            listE.addAll(ycVar.a(str, z, z2));
        }
        return Collections.unmodifiableList(listE);
    }

    private final void aK() {
        yp ypVarAy;
        this.q = false;
        if (amn.f20135a < 23 || !this.I || (ypVarAy = ay()) == null) {
            return;
        }
        this.f20202b = new amz(this, ypVarAy);
    }

    private final void aL() {
        this.H = null;
    }

    private final void aM() {
        if (this.w > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f20205h.d(this.w, jElapsedRealtime - this.v);
            this.w = 0;
            this.v = jElapsedRealtime;
        }
    }

    private final void aN() {
        int i2 = this.D;
        if (i2 == -1 && this.E == -1) {
            return;
        }
        anq anqVar = this.H;
        if (anqVar != null && anqVar.f20262b == i2 && anqVar.f20263c == this.E && anqVar.f20264d == this.F && anqVar.f20265e == this.G) {
            return;
        }
        anq anqVar2 = new anq(i2, this.E, this.F, this.G);
        this.H = anqVar2;
        this.f20205h.t(anqVar2);
    }

    private final void aO() {
        anq anqVar = this.H;
        if (anqVar != null) {
            this.f20205h.t(anqVar);
        }
    }

    private final void aP() {
        this.u = SystemClock.elapsedRealtime() + 5000;
    }

    private static boolean aQ(long j2) {
        return j2 < -30000;
    }

    private final boolean aR(xy xyVar) {
        return amn.f20135a >= 23 && !this.I && !aE(xyVar.f23759a) && (!xyVar.f23764f || amt.b(this.f20203f));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya, com.google.ads.interactivemedia.v3.internal.iv, com.google.ads.interactivemedia.v3.internal.lq
    public final void C(float f2, float f3) throws Throwable {
        super.C(f2, f3);
        this.f20204g.g(f2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lq, com.google.ads.interactivemedia.v3.internal.lr
    public final String K() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya, com.google.ads.interactivemedia.v3.internal.lq
    public final boolean N() {
        amt amtVar;
        if (super.N() && (this.q || (((amtVar = this.f20211n) != null && this.f20210m == amtVar) || ay() == null || this.I))) {
            this.u = -9223372036854775807L;
            return true;
        }
        if (this.u == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.u) {
            return true;
        }
        this.u = -9223372036854775807L;
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final int P(yc ycVar, ke keVar) {
        int i2 = 0;
        if (!alo.p(keVar.f22156l)) {
            return fq.c(0);
        }
        boolean z = keVar.f22159o != null;
        List<xy> listAJ = aJ(ycVar, keVar, z, false);
        if (z && listAJ.isEmpty()) {
            listAJ = aJ(ycVar, keVar, false, false);
        }
        if (listAJ.isEmpty()) {
            return fq.c(1);
        }
        if (!ya.ax(keVar)) {
            return fq.c(2);
        }
        xy xyVar = listAJ.get(0);
        boolean zC = xyVar.c(keVar);
        int i3 = true != xyVar.d(keVar) ? 8 : 16;
        if (zC) {
            List<xy> listAJ2 = aJ(ycVar, keVar, z, true);
            if (!listAJ2.isEmpty()) {
                xy xyVar2 = listAJ2.get(0);
                if (xyVar2.c(keVar) && xyVar2.d(keVar)) {
                    i2 = 32;
                }
            }
        }
        return (true != zC ? 3 : 4) | i3 | i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final qa S(xy xyVar, ke keVar, ke keVar2) {
        int i2;
        int i3;
        qa qaVarB = xyVar.b(keVar, keVar2);
        int i4 = qaVarB.f22810e;
        int i5 = keVar2.q;
        amy amyVar = this.f20207j;
        if (i5 > amyVar.f20187a || keVar2.r > amyVar.f20188b) {
            i4 |= 256;
        }
        if (Q(xyVar, keVar2) > this.f20207j.f20189c) {
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
        this.f20205h.f(kfVar.f22161b, qaVarT);
        return qaVarT;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    @TargetApi(17)
    public final xu U(xy xyVar, ke keVar, MediaCrypto mediaCrypto, float f2) {
        String str;
        amy amyVar;
        int i2;
        String str2;
        Point point;
        boolean z;
        Pair<Integer, Integer> pairB;
        int iAI;
        amt amtVar = this.f20211n;
        if (amtVar != null && amtVar.f20168a != xyVar.f23764f) {
            amtVar.release();
            this.f20211n = null;
        }
        String str3 = xyVar.f23761c;
        ke[] keVarArrI = I();
        int iMax = keVar.q;
        int iMax2 = keVar.r;
        int iQ = Q(xyVar, keVar);
        int length = keVarArrI.length;
        if (length == 1) {
            if (iQ != -1 && (iAI = aI(xyVar, keVar.f22156l, keVar.q, keVar.r)) != -1) {
                iQ = Math.min((int) (iQ * 1.5f), iAI);
            }
            amyVar = new amy(iMax, iMax2, iQ);
            str = str3;
        } else {
            boolean z2 = false;
            for (int i3 = 0; i3 < length; i3++) {
                ke keVarS = keVarArrI[i3];
                if (keVar.x != null && keVarS.x == null) {
                    kd kdVarB = keVarS.b();
                    kdVarB.J(keVar.x);
                    keVarS = kdVarB.s();
                }
                if (xyVar.b(keVar, keVarS).f22809d != 0) {
                    int i4 = keVarS.q;
                    z2 |= i4 == -1 || keVarS.r == -1;
                    iMax = Math.max(iMax, i4);
                    iMax2 = Math.max(iMax2, keVarS.r);
                    iQ = Math.max(iQ, Q(xyVar, keVarS));
                }
            }
            if (z2) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(iMax);
                sb.append("x");
                sb.append(iMax2);
                String str4 = "MediaCodecVideoRenderer";
                Log.w("MediaCodecVideoRenderer", sb.toString());
                int i5 = keVar.r;
                int i6 = keVar.q;
                int i7 = i5 > i6 ? i5 : i6;
                int i8 = i5 <= i6 ? i5 : i6;
                float f3 = i8 / i7;
                int[] iArr = f20199c;
                str = str3;
                int i9 = 0;
                while (i9 < 9) {
                    int i10 = iArr[i9];
                    int[] iArr2 = iArr;
                    int i11 = (int) (i10 * f3);
                    if (i10 <= i7 || i11 <= i8) {
                        break;
                    }
                    int i12 = i7;
                    int i13 = i8;
                    if (amn.f20135a >= 21) {
                        int i14 = i5 <= i6 ? i10 : i11;
                        if (i5 <= i6) {
                            i10 = i11;
                        }
                        Point pointA = xyVar.a(i14, i10);
                        i2 = iQ;
                        str2 = str4;
                        if (xyVar.e(pointA.x, pointA.y, keVar.s)) {
                            point = pointA;
                            break;
                        }
                        i9++;
                        iArr = iArr2;
                        i7 = i12;
                        i8 = i13;
                        iQ = i2;
                        str4 = str2;
                    } else {
                        i2 = iQ;
                        str2 = str4;
                        try {
                            int iB = amn.b(i10, 16) * 16;
                            int iB2 = amn.b(i11, 16) * 16;
                            if (iB * iB2 <= ym.a()) {
                                int i15 = i5 <= i6 ? iB : iB2;
                                if (i5 <= i6) {
                                    iB = iB2;
                                }
                                point = new Point(i15, iB);
                            } else {
                                i9++;
                                iArr = iArr2;
                                i7 = i12;
                                i8 = i13;
                                iQ = i2;
                                str4 = str2;
                            }
                        } catch (yh unused) {
                            point = null;
                        }
                    }
                }
                i2 = iQ;
                str2 = str4;
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    iQ = Math.max(i2, aI(xyVar, keVar.f22156l, iMax, iMax2));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(iMax);
                    sb2.append("x");
                    sb2.append(iMax2);
                    Log.w(str2, sb2.toString());
                } else {
                    iQ = i2;
                }
            } else {
                str = str3;
            }
            amyVar = new amy(iMax, iMax2, iQ);
        }
        this.f20207j = amyVar;
        boolean z3 = this.f20206i;
        int i16 = this.I ? this.J : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, str);
        mediaFormat.setInteger("width", keVar.q);
        mediaFormat.setInteger("height", keVar.r);
        agg.c(mediaFormat, keVar.f22158n);
        float f4 = keVar.s;
        if (f4 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f4);
        }
        agg.b(mediaFormat, "rotation-degrees", keVar.t);
        amq amqVar = keVar.x;
        if (amqVar != null) {
            agg.b(mediaFormat, "color-transfer", amqVar.f20157c);
            agg.b(mediaFormat, "color-standard", amqVar.f20155a);
            agg.b(mediaFormat, "color-range", amqVar.f20156b);
            byte[] bArr = amqVar.f20158d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(keVar.f22156l) && (pairB = ym.b(keVar)) != null) {
            agg.b(mediaFormat, "profile", ((Integer) pairB.first).intValue());
        }
        mediaFormat.setInteger("max-width", amyVar.f20187a);
        mediaFormat.setInteger("max-height", amyVar.f20188b);
        agg.b(mediaFormat, "max-input-size", amyVar.f20189c);
        if (amn.f20135a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f2 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f2);
            }
        }
        if (z3) {
            z = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z = true;
        }
        if (i16 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z);
            mediaFormat.setInteger("audio-session-id", i16);
        }
        if (this.f20210m == null) {
            if (!aR(xyVar)) {
                throw new IllegalStateException();
            }
            if (this.f20211n == null) {
                this.f20211n = amt.a(this.f20203f, xyVar.f23764f);
            }
            this.f20210m = this.f20211n;
        }
        return new xu(xyVar, mediaFormat, this.f20210m, mediaCrypto);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final List<xy> V(yc ycVar, ke keVar, boolean z) {
        return aJ(ycVar, keVar, z, this.I);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final void W(Exception exc) {
        alj.a("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f20205h.s(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final void X(String str, long j2, long j3) {
        this.f20205h.a(str, j2, j3);
        this.f20208k = aE(str);
        xy xyVarAk = ak();
        ajr.b(xyVarAk);
        boolean z = false;
        if (amn.f20135a >= 29 && "video/x-vnd.on2.vp9".equals(xyVarAk.f23760b)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrF = xyVarAk.f();
            int length = codecProfileLevelArrF.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (codecProfileLevelArrF[i2].profile == 16384) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        this.f20209l = z;
        if (amn.f20135a < 23 || !this.I) {
            return;
        }
        yp ypVarAy = ay();
        ajr.b(ypVarAy);
        this.f20202b = new amz(this, ypVarAy);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final void Y(String str) {
        this.f20205h.b(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final void Z(ke keVar, MediaFormat mediaFormat) {
        yp ypVarAy = ay();
        if (ypVarAy != null) {
            ypVarAy.m(this.p);
        }
        if (this.I) {
            this.D = keVar.q;
            this.E = keVar.r;
        } else {
            ajr.b(mediaFormat);
            boolean z = false;
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z = true;
            }
            this.D = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.E = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f2 = keVar.u;
        this.G = f2;
        if (amn.f20135a >= 21) {
            int i2 = keVar.t;
            if (i2 == 90 || i2 == 270) {
                int i3 = this.D;
                this.D = this.E;
                this.E = i3;
                this.G = 1.0f / f2;
            }
        } else {
            this.F = keVar.t;
        }
        this.f20204g.e(keVar.s);
    }

    public final void aA() {
        this.s = true;
        if (this.q) {
            return;
        }
        this.q = true;
        this.f20205h.q(this.f20210m);
        this.f20212o = true;
    }

    public final void aB(long j2) {
        at(j2);
        aN();
        ((ya) this).f23771a.f22793e++;
        aA();
        an(j2);
    }

    public final void aC(int i2) {
        pw pwVar = ((ya) this).f23771a;
        pwVar.f22795g += i2;
        this.w += i2;
        int i3 = this.x + i2;
        this.x = i3;
        pwVar.f22796h = Math.max(i3, pwVar.f22796h);
        if (this.w >= 50) {
            aM();
        }
    }

    public final void aD(long j2) {
        pw pwVar = ((ya) this).f23771a;
        pwVar.f22798j += j2;
        pwVar.f22799k++;
        this.B += j2;
        this.C++;
    }

    public final void aF(yp ypVar, int i2) {
        aN();
        arj.n("releaseOutputBuffer");
        ypVar.i(i2, true);
        arj.o();
        this.A = SystemClock.elapsedRealtime() * 1000;
        ((ya) this).f23771a.f22793e++;
        this.x = 0;
        aA();
    }

    public final void aG(yp ypVar, int i2, long j2) {
        aN();
        arj.n("releaseOutputBuffer");
        ypVar.h(i2, j2);
        arj.o();
        this.A = SystemClock.elapsedRealtime() * 1000;
        ((ya) this).f23771a.f22793e++;
        this.x = 0;
        aA();
    }

    public final void aH(yp ypVar, int i2) {
        arj.n("skipVideoBuffer");
        ypVar.i(i2, false);
        arj.o();
        ((ya) this).f23771a.f22794f++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final void ab() {
        aK();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final void ac(pz pzVar) {
        boolean z = this.I;
        if (!z) {
            this.y++;
        }
        if (amn.f20135a >= 23 || !z) {
            return;
        }
        aB(pzVar.f22803d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
    
        if (r14 > 100000) goto L46;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean af(long r22, long r24, com.google.ads.interactivemedia.v3.internal.yp r26, java.nio.ByteBuffer r27, int r28, int r29, int r30, long r31, boolean r33, boolean r34, com.google.ads.interactivemedia.v3.internal.ke r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ana.af(long, long, com.google.ads.interactivemedia.v3.internal.yp, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.ads.interactivemedia.v3.internal.ke):boolean");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final float ag(float f2, ke[] keVarArr) {
        float fMax = -1.0f;
        for (ke keVar : keVarArr) {
            float f3 = keVar.s;
            if (f3 != -1.0f) {
                fMax = Math.max(fMax, f3);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final xx aj(Throwable th, xy xyVar) {
        return new amx(th, xyVar, this.f20210m);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    @TargetApi(29)
    public final void al(pz pzVar) {
        if (this.f20209l) {
            ByteBuffer byteBuffer = pzVar.f22804e;
            ajr.b(byteBuffer);
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
                    yp ypVarAy = ay();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    ypVarAy.l(bundle);
                }
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final void an(long j2) {
        super.an(j2);
        if (this.I) {
            return;
        }
        this.y--;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final void ap() {
        super.ap();
        this.y = 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final boolean av() {
        return this.I && amn.f20135a < 23;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya
    public final boolean aw(xy xyVar) {
        return this.f20210m != null || aR(xyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.ads.interactivemedia.v3.internal.yp] */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.google.ads.interactivemedia.v3.internal.ane] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.google.ads.interactivemedia.v3.internal.amt] */
    /* JADX WARN: Type inference failed for: r5v8 */
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
    @Override // com.google.ads.interactivemedia.v3.internal.iv, com.google.ads.interactivemedia.v3.internal.lm
    public final void p(int i2, Object obj) throws Throwable {
        int iIntValue;
        if (i2 != 1) {
            if (i2 == 4) {
                this.p = ((Integer) obj).intValue();
                yp ypVarAy = ay();
                if (ypVarAy != null) {
                    ypVarAy.m(this.p);
                    return;
                }
                return;
            }
            if (i2 == 6) {
                this.K = (anb) obj;
                return;
            }
            if (i2 == 102 && this.J != (iIntValue = ((Integer) obj).intValue())) {
                this.J = iIntValue;
                if (this.I) {
                    ao();
                    return;
                }
                return;
            }
            return;
        }
        ?? A = obj instanceof Surface ? (Surface) obj : 0;
        if (A == 0) {
            amt amtVar = this.f20211n;
            if (amtVar != null) {
                A = amtVar;
            } else {
                xy xyVarAk = ak();
                if (xyVarAk != null && aR(xyVarAk)) {
                    A = amt.a(this.f20203f, xyVarAk.f23764f);
                    this.f20211n = A;
                }
            }
        }
        if (this.f20210m == A) {
            if (A == 0 || A == this.f20211n) {
                return;
            }
            aO();
            if (this.f20212o) {
                this.f20205h.q(this.f20210m);
                return;
            }
            return;
        }
        this.f20210m = A;
        this.f20204g.k(A);
        this.f20212o = false;
        int iAW = aW();
        ?? Ay = ay();
        if (Ay != 0) {
            if (amn.f20135a < 23 || A == 0 || this.f20208k) {
                ao();
                am();
            } else {
                Ay.k(A);
            }
        }
        if (A == 0 || A == this.f20211n) {
            aL();
            aK();
            return;
        }
        aO();
        aK();
        if (iAW == 2) {
            aP();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya, com.google.ads.interactivemedia.v3.internal.iv
    public final void r() {
        aL();
        aK();
        this.f20212o = false;
        this.f20204g.c();
        this.f20202b = null;
        try {
            super.r();
        } finally {
            this.f20205h.c(((ya) this).f23771a);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya, com.google.ads.interactivemedia.v3.internal.iv
    public final void s(boolean z, boolean z2) {
        super.s(z, z2);
        boolean z3 = k().f22342b;
        boolean z4 = true;
        if (z3 && this.J == 0) {
            z4 = false;
        }
        ajr.f(z4);
        if (this.I != z3) {
            this.I = z3;
            ao();
        }
        this.f20205h.e(((ya) this).f23771a);
        this.f20204g.d();
        this.r = z2;
        this.s = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya, com.google.ads.interactivemedia.v3.internal.iv
    public final void t(long j2, boolean z) {
        super.t(j2, z);
        aK();
        this.f20204g.h();
        this.z = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.x = 0;
        if (z) {
            aP();
        } else {
            this.u = -9223372036854775807L;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ya, com.google.ads.interactivemedia.v3.internal.iv
    @TargetApi(17)
    public final void u() {
        try {
            super.u();
        } finally {
            amt amtVar = this.f20211n;
            if (amtVar != null) {
                if (this.f20210m == amtVar) {
                    this.f20210m = null;
                }
                amtVar.release();
                this.f20211n = null;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.iv
    public final void v() {
        this.w = 0;
        this.v = SystemClock.elapsedRealtime();
        this.A = SystemClock.elapsedRealtime() * 1000;
        this.B = 0L;
        this.C = 0;
        this.f20204g.i();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.iv
    public final void w() {
        this.u = -9223372036854775807L;
        aM();
        int i2 = this.C;
        if (i2 != 0) {
            this.f20205h.r(this.B, i2);
            this.B = 0L;
            this.C = 0;
        }
        this.f20204g.j();
    }
}
