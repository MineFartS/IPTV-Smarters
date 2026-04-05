package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazonaws.services.s3.model.InstructionFileId;

/* JADX INFO: loaded from: classes.dex */
public final class aab implements Comparable<aab>, Parcelable {
    public static final Parcelable.Creator<aab> CREATOR = new aaa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18956c;

    public aab() {
        this.f18954a = -1;
        this.f18955b = -1;
        this.f18956c = -1;
    }

    public aab(Parcel parcel) {
        this.f18954a = parcel.readInt();
        this.f18955b = parcel.readInt();
        this.f18956c = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(aab aabVar) {
        aab aabVar2 = aabVar;
        int i2 = this.f18954a - aabVar2.f18954a;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.f18955b - aabVar2.f18955b;
        return i3 == 0 ? this.f18956c - aabVar2.f18956c : i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aab.class == obj.getClass()) {
            aab aabVar = (aab) obj;
            if (this.f18954a == aabVar.f18954a && this.f18955b == aabVar.f18955b && this.f18956c == aabVar.f18956c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f18954a * 31) + this.f18955b) * 31) + this.f18956c;
    }

    public final String toString() {
        int i2 = this.f18954a;
        int i3 = this.f18955b;
        int i4 = this.f18956c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i2);
        sb.append(InstructionFileId.DOT);
        sb.append(i3);
        sb.append(InstructionFileId.DOT);
        sb.append(i4);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f18954a);
        parcel.writeInt(this.f18955b);
        parcel.writeInt(this.f18956c);
    }
}
