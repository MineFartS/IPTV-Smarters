package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zx implements yr {
    public static final Parcelable.Creator<zx> CREATOR = new zv(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23896b;

    public zx(float f2, int i2) {
        this.f23895a = f2;
        this.f23896b = i2;
    }

    public /* synthetic */ zx(Parcel parcel) {
        this.f23895a = parcel.readFloat();
        this.f23896b = parcel.readInt();
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
        if (obj != null && zx.class == obj.getClass()) {
            zx zxVar = (zx) obj;
            if (this.f23895a == zxVar.f23895a && this.f23896b == zxVar.f23896b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f23895a).hashCode() + 527) * 31) + this.f23896b;
    }

    public final String toString() {
        float f2 = this.f23895a;
        int i2 = this.f23896b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(f2);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.f23895a);
        parcel.writeInt(this.f23896b);
    }
}
