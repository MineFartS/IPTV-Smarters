package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class bic extends bfv<BigInteger> {
    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ BigInteger read(bjj bjjVar) {
        if (bjjVar.p() == 9) {
            bjjVar.k();
            return null;
        }
        try {
            return new BigInteger(bjjVar.f());
        } catch (NumberFormatException e2) {
            throw new bfs(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, BigInteger bigInteger) throws IOException {
        bjlVar.j(bigInteger);
    }
}
