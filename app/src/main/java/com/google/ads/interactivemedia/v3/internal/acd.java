package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class acd extends aac implements abv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kn f19138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final km f19139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ajg f19140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qq f19141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f19142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f19144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f19145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private akq f19147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final acb f19148k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ajr f19149l;

    public /* synthetic */ acd(kn knVar, ajg ajgVar, acb acbVar, qq qqVar, ajr ajrVar, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        km kmVar = knVar.f22193b;
        ajr.b(kmVar);
        this.f19139b = kmVar;
        this.f19138a = knVar;
        this.f19140c = ajgVar;
        this.f19148k = acbVar;
        this.f19141d = qqVar;
        this.f19149l = ajrVar;
        this.f19142e = Constants.MB;
        this.f19143f = true;
        this.f19144g = -9223372036854775807L;
    }

    private final void y() {
        long j2 = this.f19144g;
        boolean z = this.f19145h;
        boolean z2 = this.f19146i;
        kn knVar = this.f19138a;
        aco acoVar = new aco(-9223372036854775807L, -9223372036854775807L, j2, j2, 0L, 0L, z, false, null, knVar, z2 ? knVar.f22194c : null);
        n(this.f19143f ? new aca(acoVar) : acoVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final kn V() {
        return this.f19138a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final void W(abe abeVar) {
        ((abz) abeVar).F();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final abe X(abg abgVar, ajm ajmVar, long j2) {
        ajp ajpVarA = ((ajq) this.f19140c).a();
        akq akqVar = this.f19147j;
        if (akqVar != null) {
            ajpVarA.e(akqVar);
        }
        return new abz(this.f19139b.f22184a, ajpVarA, new aae(this.f19148k.f19132a), this.f19141d, b(abgVar), this.f19149l, d(abgVar), this, ajmVar, Constants.MB, null, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abv
    public final void a(long j2, boolean z, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.f19144g;
        }
        if (!this.f19143f && this.f19144g == j2 && this.f19145h == z && this.f19146i == z2) {
            return;
        }
        this.f19144g = j2;
        this.f19145h = z;
        this.f19146i = z2;
        this.f19143f = false;
        y();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aac
    public final void m(akq akqVar) {
        this.f19147j = akqVar;
        this.f19141d.d();
        y();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aac
    public final void p() {
        this.f19141d.e();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.abi
    public final void z() {
    }
}
