package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class qf implements Parcelable {
    public static final Parcelable.Creator<qf> CREATOR = new qe();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f22816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f22819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22820e;

    public qf(Parcel parcel) {
        this.f22816a = new UUID(parcel.readLong(), parcel.readLong());
        this.f22817b = parcel.readString();
        String string = parcel.readString();
        int i2 = amn.f20135a;
        this.f22818c = string;
        this.f22819d = parcel.createByteArray();
    }

    public qf(UUID uuid, String str, String str2, byte[] bArr) {
        ajr.b(uuid);
        this.f22816a = uuid;
        this.f22817b = str;
        ajr.b(str2);
        this.f22818c = str2;
        this.f22819d = bArr;
    }

    public qf(UUID uuid, String str, byte[] bArr) {
        this(uuid, null, str, bArr);
    }

    public final qf a(byte[] bArr) {
        return new qf(this.f22816a, this.f22817b, this.f22818c, bArr);
    }

    public final boolean b(qf qfVar) {
        return c() && !qfVar.c() && d(qfVar.f22816a);
    }

    public final boolean c() {
        return this.f22819d != null;
    }

    public final boolean d(UUID uuid) {
        return iw.f21995a.equals(this.f22816a) || uuid.equals(this.f22816a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qf)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        qf qfVar = (qf) obj;
        return amn.O(this.f22817b, qfVar.f22817b) && amn.O(this.f22818c, qfVar.f22818c) && amn.O(this.f22816a, qfVar.f22816a) && Arrays.equals(this.f22819d, qfVar.f22819d);
    }

    public final int hashCode() {
        int i2 = this.f22820e;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = this.f22816a.hashCode() * 31;
        String str = this.f22817b;
        int iHashCode2 = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f22818c.hashCode()) * 31) + Arrays.hashCode(this.f22819d);
        this.f22820e = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f22816a.getMostSignificantBits());
        parcel.writeLong(this.f22816a.getLeastSignificantBits());
        parcel.writeString(this.f22817b);
        parcel.writeString(this.f22818c);
        parcel.writeByteArray(this.f22819d);
    }
}
