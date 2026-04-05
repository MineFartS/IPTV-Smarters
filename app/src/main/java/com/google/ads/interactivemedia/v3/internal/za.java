package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class za implements yr {
    public static final Parcelable.Creator<za> CREATOR = new yz();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23833b;

    public za(Parcel parcel) {
        String string = parcel.readString();
        int i2 = amn.f20135a;
        this.f23832a = string;
        this.f23833b = parcel.readString();
    }

    public za(String str, String str2) {
        this.f23832a = str;
        this.f23833b = str2;
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
        if (obj != null && za.class == obj.getClass()) {
            za zaVar = (za) obj;
            if (this.f23832a.equals(zaVar.f23832a) && this.f23833b.equals(zaVar.f23833b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f23832a.hashCode() + 527) * 31) + this.f23833b.hashCode();
    }

    public final String toString() {
        String str = this.f23832a;
        String str2 = this.f23833b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23832a);
        parcel.writeString(this.f23833b);
    }
}
