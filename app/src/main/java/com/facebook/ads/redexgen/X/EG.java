package com.facebook.ads.redexgen.X;

import android.os.Parcel;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class EG {
    public final int A00;
    public final long A01;

    public EG(int i2, long j2) {
        this.A00 = i2;
        this.A01 = j2;
    }

    public /* synthetic */ EG(int i2, long j2, EF ef) {
        this(i2, j2);
    }

    public static EG A00(Parcel parcel) {
        return new EG(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
