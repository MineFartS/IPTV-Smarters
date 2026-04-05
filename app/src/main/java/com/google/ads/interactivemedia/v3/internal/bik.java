package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Currency;

/* JADX INFO: loaded from: classes.dex */
public final class bik extends bfv<Currency> {
    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ Currency read(bjj bjjVar) {
        return Currency.getInstance(bjjVar.f());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, Currency currency) throws IOException {
        bjlVar.k(currency.getCurrencyCode());
    }
}
