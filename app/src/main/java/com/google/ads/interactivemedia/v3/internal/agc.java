package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class agc extends aac implements aho {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final afy f19568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final km f19569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qq f19570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f19571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ahp f19572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f19573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final kn f19574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private kl f19575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private akq f19576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final afo f19577j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ajr f19578k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final awa f19579l;

    static {
        ka.b("goog.exo.hls");
    }

    public /* synthetic */ agc(kn knVar, afo afoVar, afy afyVar, awa awaVar, qq qqVar, ajr ajrVar, ahp ahpVar, long j2, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        km kmVar = knVar.f22193b;
        ajr.b(kmVar);
        this.f19569b = kmVar;
        this.f19574g = knVar;
        this.f19575h = knVar.f22194c;
        this.f19577j = afoVar;
        this.f19568a = afyVar;
        this.f19579l = awaVar;
        this.f19570c = qqVar;
        this.f19578k = ajrVar;
        this.f19572e = ahpVar;
        this.f19573f = j2;
        this.f19571d = i2;
    }

    private static aha A(List<aha> list, long j2) {
        aha ahaVar = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            aha ahaVar2 = list.get(i2);
            long j3 = ahaVar2.f19693g;
            if (j3 > j2 || !ahaVar2.f19683a) {
                if (j3 > j2) {
                    break;
                }
            } else {
                ahaVar = ahaVar2;
            }
        }
        return ahaVar;
    }

    private static ahc B(List<ahc> list, long j2) {
        return list.get(amn.ai(list, Long.valueOf(j2), true));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final kn V() {
        return this.f19574g;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final void W(abe abeVar) {
        ((aga) abeVar).r();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final abe X(abg abgVar, ajm ajmVar, long j2) {
        abo aboVarD = d(abgVar);
        return new aga(this.f19568a, this.f19572e, this.f19577j, this.f19576i, this.f19570c, b(abgVar), this.f19578k, aboVarD, ajmVar, this.f19579l, this.f19571d, null, null, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aac
    public final void m(akq akqVar) {
        this.f19576i = akqVar;
        this.f19570c.d();
        this.f19572e.p(this.f19569b.f22184a, d(null), this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aac
    public final void p() {
        this.f19572e.q();
        this.f19570c.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7 A[PHI: r2
  0x00e7: PHI (r2v34 com.google.ads.interactivemedia.v3.internal.ahd) = (r2v44 com.google.ads.interactivemedia.v3.internal.ahd), (r2v45 com.google.ads.interactivemedia.v3.internal.ahd) binds: [B:49:0x00e5, B:55:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0146  */
    @Override // com.google.ads.interactivemedia.v3.internal.aho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(com.google.ads.interactivemedia.v3.internal.ahf r30) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.agc.y(com.google.ads.interactivemedia.v3.internal.ahf):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final void z() {
        this.f19572e.m();
    }
}
