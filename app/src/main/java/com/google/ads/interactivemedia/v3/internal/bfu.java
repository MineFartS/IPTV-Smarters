package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bfu extends bfv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bfv f21052a;

    public bfu(bfv bfvVar) {
        this.f21052a = bfvVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final Object read(bjj bjjVar) {
        if (bjjVar.p() != 9) {
            return this.f21052a.read(bjjVar);
        }
        bjjVar.k();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final void write(bjl bjlVar, Object obj) throws IOException {
        if (obj == null) {
            bjlVar.g();
        } else {
            this.f21052a.write(bjlVar, obj);
        }
    }
}
