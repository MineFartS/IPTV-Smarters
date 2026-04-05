package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zq extends zo {
    public static final Parcelable.Creator<zq> CREATOR = new ze(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f23877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f23878e;

    public zq(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f23874a = i2;
        this.f23875b = i3;
        this.f23876c = i4;
        this.f23877d = iArr;
        this.f23878e = iArr2;
    }

    public zq(Parcel parcel) {
        super("MLLT");
        this.f23874a = parcel.readInt();
        this.f23875b = parcel.readInt();
        this.f23876c = parcel.readInt();
        this.f23877d = (int[]) amn.A(parcel.createIntArray());
        this.f23878e = (int[]) amn.A(parcel.createIntArray());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zo, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zq.class == obj.getClass()) {
            zq zqVar = (zq) obj;
            if (this.f23874a == zqVar.f23874a && this.f23875b == zqVar.f23875b && this.f23876c == zqVar.f23876c && Arrays.equals(this.f23877d, zqVar.f23877d) && Arrays.equals(this.f23878e, zqVar.f23878e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f23874a + 527) * 31) + this.f23875b) * 31) + this.f23876c) * 31) + Arrays.hashCode(this.f23877d)) * 31) + Arrays.hashCode(this.f23878e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f23874a);
        parcel.writeInt(this.f23875b);
        parcel.writeInt(this.f23876c);
        parcel.writeIntArray(this.f23877d);
        parcel.writeIntArray(this.f23878e);
    }
}
