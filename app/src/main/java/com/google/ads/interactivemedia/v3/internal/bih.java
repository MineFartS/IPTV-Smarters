package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes.dex */
public final class bih extends bfv<URI> {
    public static final URI a(bjj bjjVar) throws IOException {
        if (bjjVar.p() == 9) {
            bjjVar.k();
            return null;
        }
        try {
            String strF = bjjVar.f();
            if (Constants.NULL_VERSION_ID.equals(strF)) {
                return null;
            }
            return new URI(strF);
        } catch (URISyntaxException e2) {
            throw new bfm(e2);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ URI read(bjj bjjVar) {
        return a(bjjVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, URI uri) throws IOException {
        URI uri2 = uri;
        bjlVar.k(uri2 == null ? null : uri2.toASCIIString());
    }
}
