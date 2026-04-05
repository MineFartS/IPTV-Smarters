package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ib extends ig {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Long f21944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f21945i = new Object();

    public ib(hc hcVar, k kVar, int i2) {
        super(hcVar, "cPHMZVY/KwIUfpGqtJoe3sZWjmRLYCJUzedPb6Eusduzq1fr7QzoocP3s4SDqjiP", "Wq/IKBdmFHBPtcQG2uw+enxSoneybsCZd6x3sGCEaqo=", kVar, i2, 33);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ig
    public final void a() {
        if (f21944h == null) {
            synchronized (f21945i) {
                if (f21944h == null) {
                    f21944h = (Long) this.f21957e.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f21956d) {
            this.f21956d.T(f21944h.longValue());
        }
    }
}
