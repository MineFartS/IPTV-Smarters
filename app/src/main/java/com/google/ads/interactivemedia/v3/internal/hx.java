package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class hx extends ig {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f21935h;

    public hx(hc hcVar, k kVar, int i2) {
        super(hcVar, "zC/fwdDuQM8Ntp2Exq4j6LLE+G4/I91mCFjFlTTx2t2L43JC1sGihEzWo+AiDO3l", "m91XZsk+YhuzWKD4cAkZ4TbV2JwQi634x6I7GtEZSF0=", kVar, i2, 61);
        this.f21935h = hcVar.o();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ig
    public final void a() {
        long jLongValue = ((Long) this.f21957e.invoke(null, this.f21953a.b(), Boolean.valueOf(this.f21935h))).longValue();
        synchronized (this.f21956d) {
            this.f21956d.D(jLongValue);
        }
    }
}
