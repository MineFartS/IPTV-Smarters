package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class amq implements Parcelable {
    public static final Parcelable.Creator<amq> CREATOR = new amp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f20158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20159e;

    public amq(int i2, int i3, int i4, byte[] bArr) {
        this.f20155a = i2;
        this.f20156b = i3;
        this.f20157c = i4;
        this.f20158d = bArr;
    }

    public amq(Parcel parcel) {
        this.f20155a = parcel.readInt();
        this.f20156b = parcel.readInt();
        this.f20157c = parcel.readInt();
        this.f20158d = amn.V(parcel) ? parcel.createByteArray() : null;
    }

    public static int a(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && amq.class == obj.getClass()) {
            amq amqVar = (amq) obj;
            if (this.f20155a == amqVar.f20155a && this.f20156b == amqVar.f20156b && this.f20157c == amqVar.f20157c && Arrays.equals(this.f20158d, amqVar.f20158d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f20159e;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = ((((((this.f20155a + 527) * 31) + this.f20156b) * 31) + this.f20157c) * 31) + Arrays.hashCode(this.f20158d);
        this.f20159e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        int i2 = this.f20155a;
        int i3 = this.f20156b;
        int i4 = this.f20157c;
        boolean z = this.f20158d != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f20155a);
        parcel.writeInt(this.f20156b);
        parcel.writeInt(this.f20157c);
        amn.N(parcel, this.f20158d != null);
        byte[] bArr = this.f20158d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
