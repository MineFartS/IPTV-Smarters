package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class anw extends ik implements anx {
    public anw() {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ik
    public final boolean a(int i2, Parcel parcel, Parcel parcel2) {
        String strG;
        boolean zK;
        apm apmVarC;
        switch (i2) {
            case 1:
                parcel2.writeNoException();
                strG = g();
                parcel2.writeString(strG);
                return true;
            case 2:
                i(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 3:
                zK = k(apl.b(parcel.readStrongBinder()));
                parcel2.writeNoException();
                il.b(parcel2, zK);
                return true;
            case 4:
                zK = l(apl.b(parcel.readStrongBinder()));
                parcel2.writeNoException();
                il.b(parcel2, zK);
                return true;
            case 5:
                j(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                apmVarC = c(apl.b(parcel.readStrongBinder()), apl.b(parcel.readStrongBinder()));
                parcel2.writeNoException();
                il.d(parcel2, apmVarC);
                return true;
            case 7:
                strG = e(apl.b(parcel.readStrongBinder()));
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 8:
                strG = d(apl.b(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            case 9:
                h(apl.b(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 10:
                apmVarC = b(apl.b(parcel.readStrongBinder()), apl.b(parcel.readStrongBinder()));
                parcel2.writeNoException();
                il.d(parcel2, apmVarC);
                return true;
            case 11:
                zK = m(parcel.readString(), il.e(parcel));
                parcel2.writeNoException();
                il.b(parcel2, zK);
                return true;
            case 12:
                strG = f(apl.b(parcel.readStrongBinder()), parcel.createByteArray());
                parcel2.writeNoException();
                parcel2.writeString(strG);
                return true;
            default:
                return false;
        }
    }
}
