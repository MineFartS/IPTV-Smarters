package com.google.ads.interactivemedia.v3.internal;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class bil extends bfv<Timestamp> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bfv f21177a;

    public bil(bfv bfvVar) {
        this.f21177a = bfvVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ Timestamp read(bjj bjjVar) {
        Date date = (Date) this.f21177a.read(bjjVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bfv
    public final /* bridge */ /* synthetic */ void write(bjl bjlVar, Timestamp timestamp) {
        this.f21177a.write(bjlVar, timestamp);
    }
}
