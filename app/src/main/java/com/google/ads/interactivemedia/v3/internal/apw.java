package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class apw extends ij implements apx {
    public apw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final apu e(apt aptVar) {
        Parcel parcelA = a();
        il.c(parcelA, aptVar);
        Parcel parcelB = b(1, parcelA);
        apu apuVar = (apu) il.a(parcelB, apu.CREATOR);
        parcelB.recycle();
        return apuVar;
    }
}
