package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class sx extends sw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final alx f23013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final alx f23014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23018g;

    public sx(sf sfVar) {
        super(sfVar);
        this.f23013b = new alx(alr.f20069a);
        this.f23014c = new alx(4);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sw
    public final boolean a(alx alxVar) throws sv {
        int iK = alxVar.k();
        int i2 = iK >> 4;
        int i3 = iK & 15;
        if (i3 == 7) {
            this.f23018g = i2;
            return i2 != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i3);
        throw new sv(sb.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sw
    public final boolean b(alx alxVar, long j2) throws lb {
        int iK = alxVar.k();
        long jF = j2 + (((long) alxVar.f()) * 1000);
        if (iK == 0) {
            if (!this.f23016e) {
                alx alxVar2 = new alx(new byte[alxVar.a()]);
                alxVar.D(alxVar2.K(), 0, alxVar.a());
                amo amoVarA = amo.a(alxVar2);
                this.f23015d = amoVarA.f20150b;
                kd kdVar = new kd();
                kdVar.ae("video/avc");
                kdVar.I(amoVarA.f20154f);
                kdVar.aj(amoVarA.f20151c);
                kdVar.Q(amoVarA.f20152d);
                kdVar.aa(amoVarA.f20153e);
                kdVar.T(amoVarA.f20149a);
                this.f23012a.b(kdVar.s());
                this.f23016e = true;
                return false;
            }
        } else if (iK == 1 && this.f23016e) {
            int i2 = this.f23018g == 1 ? 1 : 0;
            if (!this.f23017f && i2 == 0) {
                return false;
            }
            byte[] bArrK = this.f23014c.K();
            bArrK[0] = 0;
            bArrK[1] = 0;
            bArrK[2] = 0;
            int i3 = 4 - this.f23015d;
            int i4 = 0;
            while (alxVar.a() > 0) {
                alxVar.D(this.f23014c.K(), i3, this.f23015d);
                this.f23014c.I(0);
                int iN = this.f23014c.n();
                this.f23013b.I(0);
                this.f23012a.c(this.f23013b, 4);
                this.f23012a.c(alxVar, iN);
                i4 = i4 + 4 + iN;
            }
            this.f23012a.d(jF, i2, i4, 0, null);
            this.f23017f = true;
            return true;
        }
        return false;
    }
}
