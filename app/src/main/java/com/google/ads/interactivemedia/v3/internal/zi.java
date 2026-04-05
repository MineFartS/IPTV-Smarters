package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zi extends zo {
    public static final Parcelable.Creator<zi> CREATOR = new ze(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23859c;

    public zi(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i2 = amn.f20135a;
        this.f23857a = string;
        this.f23858b = parcel.readString();
        this.f23859c = parcel.readString();
    }

    public zi(String str, String str2, String str3) {
        super("COMM");
        this.f23857a = str;
        this.f23858b = str2;
        this.f23859c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zi.class == obj.getClass()) {
            zi ziVar = (zi) obj;
            if (amn.O(this.f23858b, ziVar.f23858b) && amn.O(this.f23857a, ziVar.f23857a) && amn.O(this.f23859c, ziVar.f23859c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f23857a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f23858b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23859c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zo
    public final String toString() {
        String str = this.f23870f;
        String str2 = this.f23857a;
        String str3 = this.f23858b;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": language=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23870f);
        parcel.writeString(this.f23857a);
        parcel.writeString(this.f23859c);
    }
}
