package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class biv extends bfv<Boolean> {
    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ Boolean read(bjj bjjVar) {
        if (bjjVar.p() != 9) {
            return Boolean.valueOf(bjjVar.f());
        }
        bjjVar.k();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, Boolean bool) throws IOException {
        Boolean bool2 = bool;
        bjlVar.k(bool2 == null ? Constants.NULL_VERSION_ID : bool2.toString());
    }
}
