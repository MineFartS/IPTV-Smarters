package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bfc extends bfv<Number> {
    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ Number read(bjj bjjVar) {
        if (bjjVar.p() != 9) {
            return Long.valueOf(bjjVar.c());
        }
        bjjVar.k();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, Number number) throws IOException {
        Number number2 = number;
        if (number2 == null) {
            bjlVar.g();
        } else {
            bjlVar.k(number2.toString());
        }
    }
}
