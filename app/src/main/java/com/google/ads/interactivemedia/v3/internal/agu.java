package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class agu implements akc<akm<ahg>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ agv f19631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f19632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final akj f19633c = new akj("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ajh f19634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ahf f19635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f19637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f19638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f19639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f19640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private IOException f19641k;

    public agu(agv agvVar, Uri uri) {
        this.f19631a = agvVar;
        this.f19632b = uri;
        this.f19634d = agvVar.f19655n.a();
    }

    private final void k(Uri uri) {
        akm akmVar = new akm(this.f19634d, uri, 4, this.f19631a.f19643b.b(this.f19631a.f19650i, this.f19635e));
        this.f19633c.b(akmVar, this, ajr.i(akmVar.f19989c));
        this.f19631a.f19646e.j(new aax(akmVar.f19988b), akmVar.f19989c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(final Uri uri) {
        this.f19639i = 0L;
        if (this.f19640j || this.f19633c.l() || this.f19633c.k()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime >= this.f19638h) {
            k(uri);
        } else {
            this.f19640j = true;
            this.f19631a.f19648g.postDelayed(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.agt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19629a.f(uri);
                }
            }, this.f19638h - jElapsedRealtime);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(ahf ahfVar, aax aaxVar) {
        Uri uriBuild;
        ahf ahfVar2 = this.f19635e;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f19636f = jElapsedRealtime;
        ahf ahfVarG = agv.g(this.f19631a, ahfVar2, ahfVar);
        this.f19635e = ahfVarG;
        if (ahfVarG != ahfVar2) {
            this.f19641k = null;
            this.f19637g = jElapsedRealtime;
            agv.j(this.f19631a, this.f19632b, ahfVarG);
        } else if (!ahfVarG.f19715k) {
            long j2 = ahfVar.f19711g;
            int size = ahfVar.f19718n.size();
            ahf ahfVar3 = this.f19635e;
            if (j2 + ((long) size) < ahfVar3.f19711g) {
                this.f19641k = new ahm();
                agv.s(this.f19631a, this.f19632b, -9223372036854775807L);
            } else {
                double d2 = jElapsedRealtime - this.f19637g;
                double dC = iw.c(ahfVar3.f19713i);
                Double.isNaN(dC);
                if (d2 > dC * 3.5d) {
                    this.f19641k = new ahn();
                    new abc(4);
                    long jH = ajr.h(new akb(this.f19641k, 1));
                    agv.s(this.f19631a, this.f19632b, jH);
                    if (jH != -9223372036854775807L) {
                        n(jH);
                    }
                }
            }
        }
        ahf ahfVar4 = this.f19635e;
        this.f19638h = jElapsedRealtime + iw.c(!ahfVar4.r.f19704e ? ahfVar4 != ahfVar2 ? ahfVar4.f19713i : ahfVar4.f19713i / 2 : 0L);
        if (this.f19635e.f19714j != -9223372036854775807L || this.f19632b.equals(this.f19631a.f19651j)) {
            ahf ahfVar5 = this.f19635e;
            if (ahfVar5.f19715k) {
                return;
            }
            ahe aheVar = ahfVar5.r;
            if (aheVar.f19700a != -9223372036854775807L || aheVar.f19704e) {
                Uri.Builder builderBuildUpon = this.f19632b.buildUpon();
                ahf ahfVar6 = this.f19635e;
                if (ahfVar6.r.f19704e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(ahfVar6.f19711g + ((long) ahfVar6.f19718n.size())));
                    ahf ahfVar7 = this.f19635e;
                    if (ahfVar7.f19714j != -9223372036854775807L) {
                        List<aha> list = ahfVar7.f19719o;
                        int size2 = list.size();
                        if (!list.isEmpty() && ((aha) auv.r(list)).f19684b) {
                            size2--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size2));
                    }
                }
                ahe aheVar2 = this.f19635e.r;
                if (aheVar2.f19700a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", true != aheVar2.f19701b ? "YES" : "v2");
                }
                uriBuild = builderBuildUpon.build();
            } else {
                uriBuild = this.f19632b;
            }
            l(uriBuild);
        }
    }

    private final boolean n(long j2) {
        this.f19639i = SystemClock.elapsedRealtime() + j2;
        return this.f19632b.equals(this.f19631a.f19651j) && !agv.r(this.f19631a);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final /* bridge */ /* synthetic */ void C(akf akfVar, long j2, long j3, boolean z) {
        akm akmVar = (akm) akfVar;
        long j4 = akmVar.f19987a;
        akmVar.b();
        akmVar.d();
        akmVar.a();
        this.f19631a.f19646e.d(new aax(), 4);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.akc
    public final /* bridge */ /* synthetic */ void D(akf akfVar, long j2, long j3) {
        akm akmVar = (akm) akfVar;
        ahg ahgVar = (ahg) akmVar.c();
        akmVar.b();
        akmVar.d();
        akmVar.a();
        aax aaxVar = new aax();
        if (ahgVar instanceof ahf) {
            m((ahf) ahgVar, aaxVar);
            this.f19631a.f19646e.f(aaxVar, 4);
        } else {
            this.f19641k = new lb("Loaded playlist has unexpected type.");
            this.f19631a.f19646e.h(aaxVar, 4, this.f19641k, true);
        }
    }

    public final ahf c() {
        return this.f19635e;
    }

    public final /* synthetic */ void f(Uri uri) {
        this.f19640j = false;
        k(uri);
    }

    public final void g() {
        l(this.f19632b);
    }

    public final void h() throws IOException {
        this.f19633c.a();
        IOException iOException = this.f19641k;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void i() {
        this.f19633c.i();
    }

    public final boolean j() {
        int i2;
        if (this.f19635e == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, iw.c(this.f19635e.q));
        ahf ahfVar = this.f19635e;
        return ahfVar.f19715k || (i2 = ahfVar.f19705a) == 2 || i2 == 1 || this.f19636f + jMax > jElapsedRealtime;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // com.google.ads.interactivemedia.v3.internal.akc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ com.google.ads.interactivemedia.v3.internal.akd u(com.google.ads.interactivemedia.v3.internal.akf r6, long r7, long r9, java.io.IOException r11, int r12) {
        /*
            r5 = this;
            com.google.ads.interactivemedia.v3.internal.akm r6 = (com.google.ads.interactivemedia.v3.internal.akm) r6
            com.google.ads.interactivemedia.v3.internal.aax r7 = new com.google.ads.interactivemedia.v3.internal.aax
            long r8 = r6.f19987a
            r6.b()
            r6.d()
            r6.a()
            r7.<init>()
            android.net.Uri r8 = r6.b()
            java.lang.String r9 = "_HLS_msn"
            java.lang.String r8 = r8.getQueryParameter(r9)
            boolean r9 = r11 instanceof com.google.ads.interactivemedia.v3.internal.ahh
            r10 = 1
            if (r8 != 0) goto L24
            if (r9 == 0) goto L3c
            r9 = 1
        L24:
            boolean r8 = r11 instanceof com.google.ads.interactivemedia.v3.internal.ajy
            if (r8 == 0) goto L2e
            r8 = r11
            com.google.ads.interactivemedia.v3.internal.ajy r8 = (com.google.ads.interactivemedia.v3.internal.ajy) r8
            int r8 = r8.f19959a
            goto L31
        L2e:
            r8 = 2147483647(0x7fffffff, float:NaN)
        L31:
            if (r9 != 0) goto L95
            r9 = 400(0x190, float:5.6E-43)
            if (r8 == r9) goto L95
            r9 = 503(0x1f7, float:7.05E-43)
            if (r8 != r9) goto L3c
            goto L95
        L3c:
            com.google.ads.interactivemedia.v3.internal.abc r8 = new com.google.ads.interactivemedia.v3.internal.abc
            int r9 = r6.f19989c
            r8.<init>(r9)
            com.google.ads.interactivemedia.v3.internal.akb r8 = new com.google.ads.interactivemedia.v3.internal.akb
            r8.<init>(r11, r12)
            long r0 = com.google.ads.interactivemedia.v3.internal.ajr.h(r8)
            com.google.ads.interactivemedia.v3.internal.agv r9 = r5.f19631a
            android.net.Uri r12 = r5.f19632b
            boolean r9 = com.google.ads.interactivemedia.v3.internal.agv.s(r9, r12, r0)
            r12 = 0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 != 0) goto L63
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 != 0) goto L61
            goto L63
        L61:
            r9 = 0
            goto L64
        L63:
            r9 = 1
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L6d
            boolean r0 = r5.n(r0)
            r9 = r9 | r0
        L6d:
            if (r9 == 0) goto L7f
            long r8 = com.google.ads.interactivemedia.v3.internal.ajr.j(r8)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 == 0) goto L7c
            com.google.ads.interactivemedia.v3.internal.akd r8 = com.google.ads.interactivemedia.v3.internal.akj.c(r12, r8)
            goto L81
        L7c:
            com.google.ads.interactivemedia.v3.internal.akd r8 = com.google.ads.interactivemedia.v3.internal.akj.f19983c
            goto L81
        L7f:
            com.google.ads.interactivemedia.v3.internal.akd r8 = com.google.ads.interactivemedia.v3.internal.akj.f19982b
        L81:
            boolean r9 = r8.c()
            r9 = r9 ^ r10
            com.google.ads.interactivemedia.v3.internal.agv r10 = r5.f19631a
            com.google.ads.interactivemedia.v3.internal.abo r10 = com.google.ads.interactivemedia.v3.internal.agv.d(r10)
            int r6 = r6.f19989c
            r10.h(r7, r6, r11, r9)
            if (r9 != 0) goto L94
            goto Lad
        L94:
            return r8
        L95:
            long r8 = android.os.SystemClock.elapsedRealtime()
            r5.f19638h = r8
            r5.g()
            com.google.ads.interactivemedia.v3.internal.agv r8 = r5.f19631a
            com.google.ads.interactivemedia.v3.internal.abo r8 = com.google.ads.interactivemedia.v3.internal.agv.d(r8)
            int r9 = com.google.ads.interactivemedia.v3.internal.amn.f20135a
            int r6 = r6.f19989c
            r8.h(r7, r6, r11, r10)
            com.google.ads.interactivemedia.v3.internal.akd r8 = com.google.ads.interactivemedia.v3.internal.akj.f19982b
        Lad:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.agu.u(com.google.ads.interactivemedia.v3.internal.akf, long, long, java.io.IOException, int):com.google.ads.interactivemedia.v3.internal.akd");
    }
}
