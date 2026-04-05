package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zv implements Parcelable.Creator<zw> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f23889a;

    public zv() {
    }

    public zv(int i2) {
        this.f23889a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.ads.interactivemedia.v3.internal.zu, com.google.ads.interactivemedia.v3.internal.zw] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.ads.interactivemedia.v3.internal.zw, com.google.ads.interactivemedia.v3.internal.zx] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zw createFromParcel(Parcel parcel) {
        int i2 = this.f23889a;
        return i2 != 0 ? i2 != 1 ? new zx(parcel) : new zu(parcel) : new zw(parcel);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.ads.interactivemedia.v3.internal.zu[], com.google.ads.interactivemedia.v3.internal.zw[]] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.ads.interactivemedia.v3.internal.zw[], com.google.ads.interactivemedia.v3.internal.zx[]] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zw[] newArray(int i2) {
        int i3 = this.f23889a;
        return i3 != 0 ? i3 != 1 ? new zx[i2] : new zu[i2] : new zw[i2];
    }
}
