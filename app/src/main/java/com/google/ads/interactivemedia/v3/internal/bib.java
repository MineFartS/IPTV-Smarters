package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class bib extends bfv<BigDecimal> {
    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ BigDecimal read(bjj bjjVar) {
        if (bjjVar.p() == 9) {
            bjjVar.k();
            return null;
        }
        try {
            return new BigDecimal(bjjVar.f());
        } catch (NumberFormatException e2) {
            throw new bfs(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, BigDecimal bigDecimal) throws IOException {
        bjlVar.j(bigDecimal);
    }
}
