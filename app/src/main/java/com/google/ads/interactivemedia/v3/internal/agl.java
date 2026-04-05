package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class agl implements Parcelable.Creator<agm> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f19609a;

    public agl() {
    }

    public agl(int i2) {
        this.f19609a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.ads.interactivemedia.v3.internal.agm, com.google.ads.interactivemedia.v3.internal.agn] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ agm createFromParcel(Parcel parcel) {
        return this.f19609a != 0 ? new agn(parcel) : new agm(parcel);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.ads.interactivemedia.v3.internal.agm[], com.google.ads.interactivemedia.v3.internal.agn[]] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ agm[] newArray(int i2) {
        return this.f19609a != 0 ? new agn[i2] : new agm[i2];
    }
}
