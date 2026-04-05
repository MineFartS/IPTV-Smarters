package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zj extends zo {
    public static final Parcelable.Creator<zj> CREATOR = new ze(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f23863d;

    public zj(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i2 = amn.f20135a;
        this.f23860a = string;
        this.f23861b = parcel.readString();
        this.f23862c = parcel.readString();
        this.f23863d = (byte[]) amn.A(parcel.createByteArray());
    }

    public zj(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f23860a = str;
        this.f23861b = str2;
        this.f23862c = str3;
        this.f23863d = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zj.class == obj.getClass()) {
            zj zjVar = (zj) obj;
            if (amn.O(this.f23860a, zjVar.f23860a) && amn.O(this.f23861b, zjVar.f23861b) && amn.O(this.f23862c, zjVar.f23862c) && Arrays.equals(this.f23863d, zjVar.f23863d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f23860a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f23861b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23862c;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f23863d);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zo
    public final String toString() {
        String str = this.f23870f;
        String str2 = this.f23860a;
        String str3 = this.f23861b;
        String str4 = this.f23862c;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 36 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23860a);
        parcel.writeString(this.f23861b);
        parcel.writeString(this.f23862c);
        parcel.writeByteArray(this.f23863d);
    }
}
