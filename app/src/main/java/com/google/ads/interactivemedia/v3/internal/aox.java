package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class aox extends ij implements aoz {
    public aox(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.signalsdk.ISignalSdkService");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aoz
    public final void e(apa apaVar, aow aowVar) {
        Parcel parcelA = a();
        il.c(parcelA, apaVar);
        il.d(parcelA, aowVar);
        d(parcelA);
    }
}
