package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class aid implements Parcelable {
    public static final Parcelable.Creator<aid> CREATOR = new aic();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f19808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19810d;

    public aid(Parcel parcel) {
        this.f19807a = parcel.readInt();
        int i2 = parcel.readByte();
        this.f19809c = i2;
        int[] iArr = new int[i2];
        this.f19808b = iArr;
        parcel.readIntArray(iArr);
        this.f19810d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aid.class == obj.getClass()) {
            aid aidVar = (aid) obj;
            if (this.f19807a == aidVar.f19807a && Arrays.equals(this.f19808b, aidVar.f19808b) && this.f19810d == aidVar.f19810d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f19807a * 31) + Arrays.hashCode(this.f19808b)) * 31) + this.f19810d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f19807a);
        parcel.writeInt(this.f19808b.length);
        parcel.writeIntArray(this.f19808b);
        parcel.writeInt(this.f19810d);
    }
}
