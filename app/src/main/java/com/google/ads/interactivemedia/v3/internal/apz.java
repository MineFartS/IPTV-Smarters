package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Hide;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes.dex */
@Hide
public final class apz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public aqc f20359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20360b;

    public apz(Context context) {
        try {
            try {
                try {
                    this.f20359a = aqb.b(DynamiteModule.e(context, DynamiteModule.f24259a, "com.google.android.gms.ads.dynamite").d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger"));
                    this.f20359a.i(apn.c(context));
                    this.f20360b = true;
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                } catch (Exception e2) {
                    throw new apr(e2);
                }
            } catch (RemoteException | apr | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
            }
        } catch (Exception e3) {
            throw new apr(e3);
        }
    }

    public final apy a(byte[] bArr) {
        return new apy(this, bArr);
    }
}
