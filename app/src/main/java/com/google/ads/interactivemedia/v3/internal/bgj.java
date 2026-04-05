package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bgj extends bfv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f21073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f21074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bfg f21075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bjh f21076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bgk f21077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bfv f21078f;

    public bgj(bgk bgkVar, boolean z, boolean z2, bfg bfgVar, bjh bjhVar) {
        this.f21077e = bgkVar;
        this.f21073a = z;
        this.f21074b = z2;
        this.f21075c = bfgVar;
        this.f21076d = bjhVar;
    }

    private final bfv a() {
        bfv bfvVar = this.f21078f;
        if (bfvVar != null) {
            return bfvVar;
        }
        bfv bfvVarC = this.f21075c.c(this.f21077e, this.f21076d);
        this.f21078f = bfvVarC;
        return bfvVarC;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final Object read(bjj bjjVar) throws IOException {
        if (!this.f21073a) {
            return a().read(bjjVar);
        }
        bjjVar.m();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final void write(bjl bjlVar, Object obj) throws IOException {
        if (this.f21074b) {
            bjlVar.g();
        } else {
            a().write(bjlVar, obj);
        }
    }
}
