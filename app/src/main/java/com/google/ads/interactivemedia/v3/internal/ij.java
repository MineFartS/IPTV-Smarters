package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public class ij implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f21962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21963b;

    public ij(IBinder iBinder, String str) {
        this.f21962a = iBinder;
        this.f21963b = str;
    }

    public final Parcel a() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f21963b);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21962a;
    }

    public final Parcel b(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f21962a.transact(1, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e2) {
                parcelObtain.recycle();
                throw e2;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final void c(int i2, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f21962a.transact(i2, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final void d(Parcel parcel) {
        try {
            this.f21962a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
