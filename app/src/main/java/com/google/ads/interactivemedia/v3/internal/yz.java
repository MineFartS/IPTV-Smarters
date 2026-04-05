package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class yz implements Parcelable.Creator<za> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f23825a;

    public yz() {
    }

    public yz(int i2) {
        this.f23825a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.ads.interactivemedia.v3.internal.yy, com.google.ads.interactivemedia.v3.internal.za] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ za createFromParcel(Parcel parcel) {
        return this.f23825a != 0 ? new yy(parcel) : new za(parcel);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.ads.interactivemedia.v3.internal.yy[], com.google.ads.interactivemedia.v3.internal.za[]] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ za[] newArray(int i2) {
        return this.f23825a != 0 ? new yy[i2] : new za[i2];
    }
}
