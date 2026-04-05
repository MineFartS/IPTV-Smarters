package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.q.c1;
import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes2.dex */
@KeepName
public final class BinderWrapper implements Parcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new c1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IBinder f24258b;

    public BinderWrapper(@RecentlyNonNull IBinder iBinder) {
        this.f24258b = iBinder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        parcel.writeStrongBinder(this.f24258b);
    }
}
