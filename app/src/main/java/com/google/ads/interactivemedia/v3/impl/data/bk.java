package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.bfv;
import com.google.ads.interactivemedia.v3.internal.bjj;
import com.google.ads.interactivemedia.v3.internal.bjl;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class bk extends bfv<bl> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public bl read(bjj bjjVar) {
        if (bjjVar.p() != 9) {
            return new bl(bjjVar.f());
        }
        bjjVar.k();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public void write(bjl bjlVar, bl blVar) throws IOException {
        if (blVar == null) {
            bjlVar.g();
        } else {
            bjlVar.k(blVar.getName());
        }
    }
}
