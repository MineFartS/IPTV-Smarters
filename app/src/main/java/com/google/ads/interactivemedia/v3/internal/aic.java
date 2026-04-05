package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class aic implements Parcelable.Creator<aid> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f19806a;

    public aic() {
    }

    public aic(int i2) {
        this.f19806a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.ads.interactivemedia.v3.internal.aia, com.google.ads.interactivemedia.v3.internal.aid] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.ads.interactivemedia.v3.internal.aid, com.google.ads.interactivemedia.v3.internal.aio] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ aid createFromParcel(Parcel parcel) {
        int i2 = this.f19806a;
        return i2 != 0 ? i2 != 1 ? new aio(parcel) : new aia(parcel) : new aid(parcel);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.ads.interactivemedia.v3.internal.aia[], com.google.ads.interactivemedia.v3.internal.aid[]] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.ads.interactivemedia.v3.internal.aid[], com.google.ads.interactivemedia.v3.internal.aio[]] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ aid[] newArray(int i2) {
        int i3 = this.f19806a;
        return i3 != 0 ? i3 != 1 ? new aio[i2] : new aia[i2] : new aid[i2];
    }
}
