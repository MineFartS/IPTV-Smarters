package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class agm implements Parcelable {
    public static final Parcelable.Creator<agm> CREATOR = new agl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19615f;

    public agm(int i2, int i3, String str, String str2, String str3, String str4) {
        this.f19610a = i2;
        this.f19611b = i3;
        this.f19612c = str;
        this.f19613d = str2;
        this.f19614e = str3;
        this.f19615f = str4;
    }

    public agm(Parcel parcel) {
        this.f19610a = parcel.readInt();
        this.f19611b = parcel.readInt();
        this.f19612c = parcel.readString();
        this.f19613d = parcel.readString();
        this.f19614e = parcel.readString();
        this.f19615f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && agm.class == obj.getClass()) {
            agm agmVar = (agm) obj;
            if (this.f19610a == agmVar.f19610a && this.f19611b == agmVar.f19611b && TextUtils.equals(this.f19612c, agmVar.f19612c) && TextUtils.equals(this.f19613d, agmVar.f19613d) && TextUtils.equals(this.f19614e, agmVar.f19614e) && TextUtils.equals(this.f19615f, agmVar.f19615f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = ((this.f19610a * 31) + this.f19611b) * 31;
        String str = this.f19612c;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f19613d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f19614e;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f19615f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f19610a);
        parcel.writeInt(this.f19611b);
        parcel.writeString(this.f19612c);
        parcel.writeString(this.f19613d);
        parcel.writeString(this.f19614e);
        parcel.writeString(this.f19615f);
    }
}
