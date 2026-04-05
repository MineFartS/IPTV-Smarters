package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class aov extends ik implements aow {
    public aov() {
        super("com.google.android.gms.ads.signalsdk.INetworkRequestCallback");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ik
    public final boolean a(int i2, Parcel parcel, Parcel parcel2) {
        if (i2 == 1) {
            c((apb) il.a(parcel, apb.CREATOR));
        } else {
            if (i2 != 2) {
                return false;
            }
            b(parcel.readInt());
        }
        return true;
    }
}
