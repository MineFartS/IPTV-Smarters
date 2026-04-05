package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zr extends zo {
    public static final Parcelable.Creator<zr> CREATOR = new ze(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f23880b;

    public zr(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i2 = amn.f20135a;
        this.f23879a = string;
        this.f23880b = (byte[]) amn.A(parcel.createByteArray());
    }

    public zr(String str, byte[] bArr) {
        super("PRIV");
        this.f23879a = str;
        this.f23880b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zr.class == obj.getClass()) {
            zr zrVar = (zr) obj;
            if (amn.O(this.f23879a, zrVar.f23879a) && Arrays.equals(this.f23880b, zrVar.f23880b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f23879a;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.f23880b);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zo
    public final String toString() {
        String str = this.f23870f;
        String str2 = this.f23879a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23879a);
        parcel.writeByteArray(this.f23880b);
    }
}
