package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zs extends zo {
    public static final Parcelable.Creator<zs> CREATOR = new ze(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f23882b;

    /* JADX WARN: Illegal instructions before constructor call */
    public zs(Parcel parcel) {
        String string = parcel.readString();
        int i2 = amn.f20135a;
        super(string);
        this.f23881a = parcel.readString();
        this.f23882b = parcel.readString();
    }

    public zs(String str, String str2, String str3) {
        super(str);
        this.f23881a = str2;
        this.f23882b = str3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    @Override // com.google.ads.interactivemedia.v3.internal.zo, com.google.ads.interactivemedia.v3.internal.yr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.google.ads.interactivemedia.v3.internal.ko r5) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zs.a(com.google.ads.interactivemedia.v3.internal.ko):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zs.class == obj.getClass()) {
            zs zsVar = (zs) obj;
            if (amn.O(this.f23870f, zsVar.f23870f) && amn.O(this.f23881a, zsVar.f23881a) && amn.O(this.f23882b, zsVar.f23882b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f23870f.hashCode() + 527) * 31;
        String str = this.f23881a;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23882b;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zo
    public final String toString() {
        String str = this.f23870f;
        String str2 = this.f23881a;
        String str3 = this.f23882b;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": value=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23870f);
        parcel.writeString(this.f23881a);
        parcel.writeString(this.f23882b);
    }
}
