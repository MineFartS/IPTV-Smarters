package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class acs implements Parcelable.Creator<act> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f19205a;

    public acs() {
    }

    public acs(int i2) {
        this.f19205a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.ads.interactivemedia.v3.internal.acr, com.google.ads.interactivemedia.v3.internal.act] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ act createFromParcel(Parcel parcel) {
        return this.f19205a != 0 ? new acr(parcel) : new act(parcel);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.ads.interactivemedia.v3.internal.acr[], com.google.ads.interactivemedia.v3.internal.act[]] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ act[] newArray(int i2) {
        return this.f19205a != 0 ? new acr[i2] : new act[i2];
    }
}
