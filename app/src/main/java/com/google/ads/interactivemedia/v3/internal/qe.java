package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class qe implements Parcelable.Creator<qf> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f22815a;

    public qe() {
    }

    public qe(int i2) {
        this.f22815a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.ads.interactivemedia.v3.internal.qf, com.google.ads.interactivemedia.v3.internal.qg] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ qf createFromParcel(Parcel parcel) {
        return this.f22815a != 0 ? new qg(parcel) : new qf(parcel);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.ads.interactivemedia.v3.internal.qf[], com.google.ads.interactivemedia.v3.internal.qg[]] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ qf[] newArray(int i2) {
        return this.f22815a != 0 ? new qg[i2] : new qf[i2];
    }
}
