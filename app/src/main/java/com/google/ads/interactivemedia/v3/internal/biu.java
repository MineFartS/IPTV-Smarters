package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class biu extends bfv<Boolean> {
    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ Boolean read(bjj bjjVar) {
        int iP = bjjVar.p();
        if (iP != 9) {
            return Boolean.valueOf(iP == 6 ? Boolean.parseBoolean(bjjVar.f()) : bjjVar.o());
        }
        bjjVar.k();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, Boolean bool) throws IOException {
        bjlVar.i(bool);
    }
}
