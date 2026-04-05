package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class va implements vh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vg f23291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f23292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f23293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vl f23294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f23296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f23297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f23298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f23299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f23300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f23301k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f23302l;

    public va(vl vlVar, long j2, long j3, long j4, long j5, boolean z) {
        ajr.d(j2 >= 0 && j3 > j2);
        this.f23294d = vlVar;
        this.f23292b = j2;
        this.f23293c = j3;
        if (j4 == j3 - j2 || z) {
            this.f23296f = j5;
            this.f23295e = 4;
        } else {
            this.f23295e = 0;
        }
        this.f23291a = new vg();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    @Override // com.google.ads.interactivemedia.v3.internal.vh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long d(com.google.ads.interactivemedia.v3.internal.rk r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.va.d(com.google.ads.interactivemedia.v3.internal.rk):long");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vh
    public final /* bridge */ /* synthetic */ sc e() {
        if (this.f23296f != 0) {
            return new uz(this);
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.vh
    public final void g(long j2) {
        this.f23298h = amn.k(j2, 0L, this.f23296f - 1);
        this.f23295e = 2;
        this.f23299i = this.f23292b;
        this.f23300j = this.f23293c;
        this.f23301k = 0L;
        this.f23302l = this.f23296f;
    }
}
