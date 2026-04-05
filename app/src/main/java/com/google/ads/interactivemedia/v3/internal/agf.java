package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class agf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ agk f19584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f19585b;

    public /* synthetic */ agf(agk agkVar) {
        this.f19584a = agkVar;
    }

    public /* synthetic */ agf(agk agkVar, int i2) {
        this.f19585b = i2;
        this.f19584a = agkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19585b != 0) {
            agk.h(this.f19584a);
        } else {
            this.f19584a.P();
        }
    }
}
