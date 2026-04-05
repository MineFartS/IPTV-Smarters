package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oe implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oi f22605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Exception f22606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f22607c;

    public /* synthetic */ oe(oi oiVar, Exception exc) {
        this.f22605a = oiVar;
        this.f22606b = exc;
    }

    public /* synthetic */ oe(oi oiVar, Exception exc, int i2) {
        this.f22607c = i2;
        this.f22605a = oiVar;
        this.f22606b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f22607c != 0) {
            this.f22605a.h(this.f22606b);
        } else {
            this.f22605a.i(this.f22606b);
        }
    }
}
