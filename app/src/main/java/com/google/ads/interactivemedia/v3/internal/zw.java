package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zw implements yr {
    public static final Parcelable.Creator<zw> CREATOR = new zv();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f23892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23894e;

    public zw(long j2, long j3, long j4, long j5, long j6) {
        this.f23890a = j2;
        this.f23891b = j3;
        this.f23892c = j4;
        this.f23893d = j5;
        this.f23894e = j6;
    }

    public /* synthetic */ zw(Parcel parcel) {
        this.f23890a = parcel.readLong();
        this.f23891b = parcel.readLong();
        this.f23892c = parcel.readLong();
        this.f23893d = parcel.readLong();
        this.f23894e = parcel.readLong();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yr
    public final /* synthetic */ void a(ko koVar) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zw.class == obj.getClass()) {
            zw zwVar = (zw) obj;
            if (this.f23890a == zwVar.f23890a && this.f23891b == zwVar.f23891b && this.f23892c == zwVar.f23892c && this.f23893d == zwVar.f23893d && this.f23894e == zwVar.f23894e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((awa.a(this.f23890a) + 527) * 31) + awa.a(this.f23891b)) * 31) + awa.a(this.f23892c)) * 31) + awa.a(this.f23893d)) * 31) + awa.a(this.f23894e);
    }

    public final String toString() {
        long j2 = this.f23890a;
        long j3 = this.f23891b;
        long j4 = this.f23892c;
        long j5 = this.f23893d;
        long j6 = this.f23894e;
        StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j2);
        sb.append(", photoSize=");
        sb.append(j3);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(j4);
        sb.append(", videoStartPosition=");
        sb.append(j5);
        sb.append(", videoSize=");
        sb.append(j6);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f23890a);
        parcel.writeLong(this.f23891b);
        parcel.writeLong(this.f23892c);
        parcel.writeLong(this.f23893d);
        parcel.writeLong(this.f23894e);
    }
}
