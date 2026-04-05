package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class aqb extends ik implements aqc {
    public static aqc b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
        return iInterfaceQueryLocalInterface instanceof aqc ? (aqc) iInterfaceQueryLocalInterface : new aqa(iBinder);
    }
}
