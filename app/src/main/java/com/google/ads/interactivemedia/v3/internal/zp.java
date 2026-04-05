package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zp extends zo {
    public static final Parcelable.Creator<zp> CREATOR = new ze(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23873c;

    public zp(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i2 = amn.f20135a;
        this.f23871a = string;
        this.f23872b = parcel.readString();
        this.f23873c = parcel.readString();
    }

    public zp(String str, String str2, String str3) {
        super("----");
        this.f23871a = str;
        this.f23872b = str2;
        this.f23873c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zp.class == obj.getClass()) {
            zp zpVar = (zp) obj;
            if (amn.O(this.f23872b, zpVar.f23872b) && amn.O(this.f23871a, zpVar.f23871a) && amn.O(this.f23873c, zpVar.f23873c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f23871a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f23872b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23873c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zo
    public final String toString() {
        String str = this.f23870f;
        String str2 = this.f23871a;
        String str3 = this.f23872b;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 23 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": domain=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23870f);
        parcel.writeString(this.f23871a);
        parcel.writeString(this.f23873c);
    }
}
