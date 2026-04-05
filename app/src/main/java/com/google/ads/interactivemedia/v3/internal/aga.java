package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aga implements abe, agh, ahl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final afy f19543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ahp f19544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final akq f19545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qq f19546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qk f19547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final abo f19548f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f19551i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private abd f19552j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f19553k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private act f19554l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f19557o;
    private final afo q;
    private final ajm r;
    private final ajr s;
    private final awa t;
    private acm p = awa.e(new acm[0]);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final IdentityHashMap<ack, Integer> f19549g = new IdentityHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final agp f19550h = new agp();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private agk[] f19555m = new agk[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private agk[] f19556n = new agk[0];

    public aga(afy afyVar, ahp ahpVar, afo afoVar, akq akqVar, qq qqVar, qk qkVar, ajr ajrVar, abo aboVar, ajm ajmVar, awa awaVar, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f19543a = afyVar;
        this.f19544b = ahpVar;
        this.q = afoVar;
        this.f19545c = akqVar;
        this.f19546d = qqVar;
        this.f19547e = qkVar;
        this.s = ajrVar;
        this.f19548f = aboVar;
        this.r = ajmVar;
        this.t = awaVar;
        this.f19551i = i2;
    }

    private final agk t(int i2, Uri[] uriArr, ke[] keVarArr, ke keVar, List<ke> list, Map<String, qg> map, long j2) {
        return new agk(i2, this, new afx(this.f19543a, this.f19544b, uriArr, keVarArr, this.q, this.f19545c, this.f19550h, list), map, this.r, j2, keVar, this.f19546d, this.f19547e, this.s, this.f19548f, this.f19551i, null, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final long a(long j2, lt ltVar) {
        return j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final long bc() {
        return this.p.bc();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final long c() {
        return this.p.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final long d() {
        return -9223372036854775807L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final long e(long j2) {
        agk[] agkVarArr = this.f19556n;
        if (agkVarArr.length > 0) {
            boolean zA = agkVarArr[0].A(j2, false);
            int i2 = 1;
            while (true) {
                agk[] agkVarArr2 = this.f19556n;
                if (i2 >= agkVarArr2.length) {
                    break;
                }
                agkVarArr2[i2].A(j2, zA);
                i2++;
            }
            if (zA) {
                this.f19550h.b();
            }
        }
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    @Override // com.google.ads.interactivemedia.v3.internal.abe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(com.google.ads.interactivemedia.v3.internal.aii[] r22, boolean[] r23, com.google.ads.interactivemedia.v3.internal.ack[] r24, boolean[] r25, long r26) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aga.f(com.google.ads.interactivemedia.v3.internal.aii[], boolean[], com.google.ads.interactivemedia.v3.internal.ack[], boolean[], long):long");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.acl
    public final /* bridge */ /* synthetic */ void g(acm acmVar) {
        this.f19552j.g(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final act h() {
        act actVar = this.f19554l;
        ajr.b(actVar);
        return actVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahl
    public final void i() {
        for (agk agkVar : this.f19555m) {
            agkVar.r();
        }
        this.f19552j.g(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final void j() throws lb {
        for (agk agkVar : this.f19555m) {
            agkVar.p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // com.google.ads.interactivemedia.v3.internal.abe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(com.google.ads.interactivemedia.v3.internal.abd r23, long r24) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aga.k(com.google.ads.interactivemedia.v3.internal.abd, long):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final void l(long j2) {
        this.p.l(j2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final boolean m(long j2) {
        if (this.f19554l != null) {
            return this.p.m(j2);
        }
        for (agk agkVar : this.f19555m) {
            agkVar.j();
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe, com.google.ads.interactivemedia.v3.internal.acm
    public final boolean n() {
        return this.p.n();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.agh
    public final void o(Uri uri) {
        this.f19544b.n(uri);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abe
    public final void p(long j2) {
        for (agk agkVar : this.f19556n) {
            agkVar.F(j2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.agh
    public final void q() {
        int i2 = this.f19553k - 1;
        this.f19553k = i2;
        if (i2 > 0) {
            return;
        }
        int i3 = 0;
        for (agk agkVar : this.f19555m) {
            i3 += agkVar.g().f19207b;
        }
        acr[] acrVarArr = new acr[i3];
        int i4 = 0;
        for (agk agkVar2 : this.f19555m) {
            int i5 = agkVar2.g().f19207b;
            int i6 = 0;
            while (i6 < i5) {
                acrVarArr[i4] = agkVar2.g().b(i6);
                i6++;
                i4++;
            }
        }
        this.f19554l = new act(acrVarArr);
        this.f19552j.i(this);
    }

    public final void r() {
        this.f19544b.o(this);
        for (agk agkVar : this.f19555m) {
            agkVar.s();
        }
        this.f19552j = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahl
    public final boolean s(Uri uri, long j2) {
        boolean z = true;
        for (agk agkVar : this.f19555m) {
            z &= agkVar.z(uri, j2);
        }
        this.f19552j.g(this);
        return z;
    }
}
