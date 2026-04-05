package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ht extends ig {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile String f21932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f21933i = new Object();

    public ht(hc hcVar, k kVar, int i2) {
        super(hcVar, "QusX5FxCSt7YALporGf+YBQ7+D9RItA2wCGYVD5mk8FUIvZ7EQ6LwVnumJjBeUBd", "rfyFxeBVRrcpHOkzoebVIka/58kwozJ0Dt9pVZcWCXE=", kVar, i2, 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ig
    public final void a() {
        this.f21956d.y("E");
        if (f21932h == null) {
            synchronized (f21933i) {
                if (f21932h == null) {
                    f21932h = (String) this.f21957e.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f21956d) {
            this.f21956d.y(f21932h);
        }
    }
}
