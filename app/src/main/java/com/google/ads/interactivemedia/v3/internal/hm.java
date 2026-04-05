package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class hm extends ig {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f21927h;

    public hm(hc hcVar, k kVar, long j2, int i2) {
        super(hcVar, "zu63YSe1kidAeMcutkZVGzck9psTtGHz7PCNeED4MwOFY27ac/4JVy5q1i6kfidt", "NW4aS3lNi8fmvEi+Ve4jL+4aAzt/ssbWQU153xX+T2c=", kVar, i2, 25);
        this.f21927h = j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ig
    public final void a() {
        long jLongValue = ((Long) this.f21957e.invoke(null, new Object[0])).longValue();
        synchronized (this.f21956d) {
            this.f21956d.q(jLongValue);
            long j2 = this.f21927h;
            if (j2 != 0) {
                this.f21956d.Q(jLongValue - j2);
                this.f21956d.S(this.f21927h);
            }
        }
    }
}
