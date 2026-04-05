package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class big extends bfv<URL> {
    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ URL read(bjj bjjVar) throws IOException {
        if (bjjVar.p() == 9) {
            bjjVar.k();
            return null;
        }
        String strF = bjjVar.f();
        if (Constants.NULL_VERSION_ID.equals(strF)) {
            return null;
        }
        return new URL(strF);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, URL url) throws IOException {
        URL url2 = url;
        bjlVar.k(url2 == null ? null : url2.toExternalForm());
    }
}
