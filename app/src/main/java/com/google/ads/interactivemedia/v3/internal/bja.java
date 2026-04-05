package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class bja extends bfv<AtomicBoolean> {
    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ AtomicBoolean read(bjj bjjVar) {
        return new AtomicBoolean(bjjVar.o());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, AtomicBoolean atomicBoolean) throws IOException {
        bjlVar.l(atomicBoolean.get());
    }
}
