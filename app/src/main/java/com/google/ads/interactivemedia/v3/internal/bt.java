package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bt implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f21514a;

    public bt() {
    }

    public bt(int i2) {
        this.f21514a = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f21514a != 0) {
            bw.g(bw.d());
        } else if (bw.f21517c != null) {
            bw.f21517c.post(bw.f21518d);
            bw.f21517c.postDelayed(bw.f21519e, 200L);
        }
    }
}
