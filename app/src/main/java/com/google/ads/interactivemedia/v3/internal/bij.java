package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class bij extends bfv<UUID> {
    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ UUID read(bjj bjjVar) {
        if (bjjVar.p() != 9) {
            return UUID.fromString(bjjVar.f());
        }
        bjjVar.k();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, UUID uuid) throws IOException {
        UUID uuid2 = uuid;
        bjlVar.k(uuid2 == null ? null : uuid2.toString());
    }
}
