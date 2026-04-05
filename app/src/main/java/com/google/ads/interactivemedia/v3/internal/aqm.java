package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aqm implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aqv f20380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aqn f20381b;

    public aqm(aqn aqnVar, aqv aqvVar) {
        this.f20381b = aqnVar;
        this.f20380a = aqvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20381b.f20383b) {
            this.f20381b.f20384c.f21683a.p();
        }
    }
}
