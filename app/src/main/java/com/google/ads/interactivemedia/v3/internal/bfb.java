package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bfb extends bfv<Number> {
    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ Number read(bjj bjjVar) {
        if (bjjVar.p() != 9) {
            return Float.valueOf((float) bjjVar.a());
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
            bfg.g(number2.floatValue());
            bjlVar.j(number2);
        }
    }
}
