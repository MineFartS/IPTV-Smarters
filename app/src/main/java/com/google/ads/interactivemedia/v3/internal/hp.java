package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class hp extends ig {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Long f21930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f21931i = new Object();

    public hp(hc hcVar, k kVar, int i2) {
        super(hcVar, "2dswfnJ/W5wvAmGjTx8kzB+odO16I5BX/UKh5zlazknHfACvhbFP+Zqb0TpxIZsQ", "ejLzeiJ5qubwImg6nJzCiB7UFg2tGEG87mpwCGv3DVQ=", kVar, i2, 22);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ig
    public final void a() {
        if (f21930h == null) {
            synchronized (f21931i) {
                if (f21930h == null) {
                    f21930h = (Long) this.f21957e.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f21956d) {
            this.f21956d.u(f21930h.longValue());
        }
    }
}
