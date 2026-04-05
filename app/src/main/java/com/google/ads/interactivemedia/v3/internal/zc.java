package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zc implements yr {
    public static final Parcelable.Creator<zc> CREATOR = new zb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23839f;

    public zc(int i2, String str, String str2, String str3, boolean z, int i3) {
        boolean z2 = true;
        if (i3 != -1 && i3 <= 0) {
            z2 = false;
        }
        ajr.d(z2);
        this.f23834a = i2;
        this.f23835b = str;
        this.f23836c = str2;
        this.f23837d = str3;
        this.f23838e = z;
        this.f23839f = i3;
    }

    public zc(Parcel parcel) {
        this.f23834a = parcel.readInt();
        this.f23835b = parcel.readString();
        this.f23836c = parcel.readString();
        this.f23837d = parcel.readString();
        this.f23838e = amn.V(parcel);
        this.f23839f = parcel.readInt();
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
        if (obj != null && zc.class == obj.getClass()) {
            zc zcVar = (zc) obj;
            if (this.f23834a == zcVar.f23834a && amn.O(this.f23835b, zcVar.f23835b) && amn.O(this.f23836c, zcVar.f23836c) && amn.O(this.f23837d, zcVar.f23837d) && this.f23838e == zcVar.f23838e && this.f23839f == zcVar.f23839f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (this.f23834a + 527) * 31;
        String str = this.f23835b;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23836c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23837d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f23838e ? 1 : 0)) * 31) + this.f23839f;
    }

    public final String toString() {
        String str = this.f23836c;
        String str2 = this.f23835b;
        int i2 = this.f23834a;
        int i3 = this.f23839f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80 + String.valueOf(str2).length());
        sb.append("IcyHeaders: name=\"");
        sb.append(str);
        sb.append("\", genre=\"");
        sb.append(str2);
        sb.append("\", bitrate=");
        sb.append(i2);
        sb.append(", metadataInterval=");
        sb.append(i3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f23834a);
        parcel.writeString(this.f23835b);
        parcel.writeString(this.f23836c);
        parcel.writeString(this.f23837d);
        amn.N(parcel, this.f23838e);
        parcel.writeInt(this.f23839f);
    }
}
