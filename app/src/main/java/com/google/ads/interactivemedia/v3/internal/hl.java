package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class hl extends ig {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile Long f21925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f21926i = new Object();

    public hl(hc hcVar, k kVar, int i2) {
        super(hcVar, "lJImmJcZfYR8hdrMtfVgK5wxyzq2Tz1kfG0dB54yhkfwwl7Exs4yXjgCxWvlOEKN", "xAGN8erZZwMSW/Fu3r0voEWCBbBpqzcnOOBzjHGoZvo=", kVar, i2, 44);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ig
    public final void a() {
        if (f21925h == null) {
            synchronized (f21926i) {
                if (f21925h == null) {
                    f21925h = (Long) this.f21957e.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f21956d) {
            this.f21956d.k(f21925h.longValue());
        }
    }
}
