package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class aqa extends ij implements aqc {
    public aqa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqc
    public final void e() {
        c(3, a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqc
    public final void f(int i2) {
        Parcel parcelA = a();
        parcelA.writeInt(i2);
        c(7, parcelA);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqc
    public final void g(int i2) {
        Parcel parcelA = a();
        parcelA.writeInt(i2);
        c(6, parcelA);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqc
    public final void h(byte[] bArr) {
        Parcel parcelA = a();
        parcelA.writeByteArray(bArr);
        c(5, parcelA);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqc
    public final void i(apm apmVar) {
        Parcel parcelA = a();
        il.d(parcelA, apmVar);
        parcelA.writeString("ADSHIELD");
        parcelA.writeString(null);
        c(8, parcelA);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqc
    public final void j() {
        Parcel parcelA = a();
        parcelA.writeIntArray(null);
        c(4, parcelA);
    }
}
