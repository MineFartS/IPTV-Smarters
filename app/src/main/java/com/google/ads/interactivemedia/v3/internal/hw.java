package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hw extends ig {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<Long> f21934h;

    public hw(hc hcVar, k kVar, int i2) {
        super(hcVar, "h706sF1zmcc4AioWh+Jfvy0LKolmQxQ7/qBdFNEqjMTCjpxVey9eXR4ewnu7+Xxj", "PpTasJ7rye0SEy8bP+e639N2f2p/VqK1Ye1mnYIaTjk=", kVar, i2, 31);
        this.f21934h = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ig
    public final void a() {
        this.f21956d.U(-1L);
        this.f21956d.P(-1L);
        if (this.f21934h == null) {
            this.f21934h = (List) this.f21957e.invoke(null, this.f21953a.b());
        }
        List<Long> list = this.f21934h;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f21956d) {
            this.f21956d.U(this.f21934h.get(0).longValue());
            this.f21956d.P(this.f21934h.get(1).longValue());
        }
    }
}
