package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class biz extends bfv<AtomicInteger> {
    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ AtomicInteger read(bjj bjjVar) {
        try {
            return new AtomicInteger(bjjVar.b());
        } catch (NumberFormatException e2) {
            throw new bfs(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, AtomicInteger atomicInteger) throws IOException {
        bjlVar.h(atomicInteger.get());
    }
}
