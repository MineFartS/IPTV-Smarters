package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zd extends zo {
    public static final Parcelable.Creator<zd> CREATOR = new ze(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f23843d;

    public zd(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i2 = amn.f20135a;
        this.f23840a = string;
        this.f23841b = parcel.readString();
        this.f23842c = parcel.readInt();
        this.f23843d = (byte[]) amn.A(parcel.createByteArray());
    }

    public zd(String str, String str2, int i2, byte[] bArr) {
        super("APIC");
        this.f23840a = str;
        this.f23841b = str2;
        this.f23842c = i2;
        this.f23843d = bArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zo, com.google.ads.interactivemedia.v3.internal.yr
    public final void a(ko koVar) {
        koVar.m(this.f23843d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zd.class == obj.getClass()) {
            zd zdVar = (zd) obj;
            if (this.f23842c == zdVar.f23842c && amn.O(this.f23840a, zdVar.f23840a) && amn.O(this.f23841b, zdVar.f23841b) && Arrays.equals(this.f23843d, zdVar.f23843d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (this.f23842c + 527) * 31;
        String str = this.f23840a;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23841b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f23843d);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zo
    public final String toString() {
        String str = this.f23870f;
        String str2 = this.f23840a;
        String str3 = this.f23841b;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23840a);
        parcel.writeString(this.f23841b);
        parcel.writeInt(this.f23842c);
        parcel.writeByteArray(this.f23843d);
    }
}
