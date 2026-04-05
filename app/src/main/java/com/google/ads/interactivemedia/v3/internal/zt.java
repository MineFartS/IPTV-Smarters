package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zt extends zo {
    public static final Parcelable.Creator<zt> CREATOR = new ze(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23884b;

    /* JADX WARN: Illegal instructions before constructor call */
    public zt(Parcel parcel) {
        String string = parcel.readString();
        int i2 = amn.f20135a;
        super(string);
        this.f23883a = parcel.readString();
        this.f23884b = parcel.readString();
    }

    public zt(String str, String str2, String str3) {
        super(str);
        this.f23883a = str2;
        this.f23884b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zt.class == obj.getClass()) {
            zt ztVar = (zt) obj;
            if (this.f23870f.equals(ztVar.f23870f) && amn.O(this.f23883a, ztVar.f23883a) && amn.O(this.f23884b, ztVar.f23884b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f23870f.hashCode() + 527) * 31;
        String str = this.f23883a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23884b;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zo
    public final String toString() {
        String str = this.f23870f;
        String str2 = this.f23884b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23870f);
        parcel.writeString(this.f23883a);
        parcel.writeString(this.f23884b);
    }
}
