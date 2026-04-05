package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zg extends zo {
    public static final Parcelable.Creator<zg> CREATOR = new ze(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f23850e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zo[] f23851g;

    public zg(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i2 = amn.f20135a;
        this.f23846a = string;
        this.f23847b = parcel.readInt();
        this.f23848c = parcel.readInt();
        this.f23849d = parcel.readLong();
        this.f23850e = parcel.readLong();
        int i3 = parcel.readInt();
        this.f23851g = new zo[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            this.f23851g[i4] = (zo) parcel.readParcelable(zo.class.getClassLoader());
        }
    }

    public zg(String str, int i2, int i3, long j2, long j3, zo[] zoVarArr) {
        super("CHAP");
        this.f23846a = str;
        this.f23847b = i2;
        this.f23848c = i3;
        this.f23849d = j2;
        this.f23850e = j3;
        this.f23851g = zoVarArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zo, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zg.class == obj.getClass()) {
            zg zgVar = (zg) obj;
            if (this.f23847b == zgVar.f23847b && this.f23848c == zgVar.f23848c && this.f23849d == zgVar.f23849d && this.f23850e == zgVar.f23850e && amn.O(this.f23846a, zgVar.f23846a) && Arrays.equals(this.f23851g, zgVar.f23851g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = (((((((this.f23847b + 527) * 31) + this.f23848c) * 31) + ((int) this.f23849d)) * 31) + ((int) this.f23850e)) * 31;
        String str = this.f23846a;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23846a);
        parcel.writeInt(this.f23847b);
        parcel.writeInt(this.f23848c);
        parcel.writeLong(this.f23849d);
        parcel.writeLong(this.f23850e);
        parcel.writeInt(this.f23851g.length);
        for (zo zoVar : this.f23851g) {
            parcel.writeParcelable(zoVar, 0);
        }
    }
}
