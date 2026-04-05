package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zh extends zo {
    public static final Parcelable.Creator<zh> CREATOR = new ze(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f23855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zo[] f23856e;

    public zh(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i2 = amn.f20135a;
        this.f23852a = string;
        this.f23853b = parcel.readByte() != 0;
        this.f23854c = parcel.readByte() != 0;
        this.f23855d = (String[]) amn.A(parcel.createStringArray());
        int i3 = parcel.readInt();
        this.f23856e = new zo[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            this.f23856e[i4] = (zo) parcel.readParcelable(zo.class.getClassLoader());
        }
    }

    public zh(String str, boolean z, boolean z2, String[] strArr, zo[] zoVarArr) {
        super("CTOC");
        this.f23852a = str;
        this.f23853b = z;
        this.f23854c = z2;
        this.f23855d = strArr;
        this.f23856e = zoVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zh.class == obj.getClass()) {
            zh zhVar = (zh) obj;
            if (this.f23853b == zhVar.f23853b && this.f23854c == zhVar.f23854c && amn.O(this.f23852a, zhVar.f23852a) && Arrays.equals(this.f23855d, zhVar.f23855d) && Arrays.equals(this.f23856e, zhVar.f23856e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = ((((this.f23853b ? 1 : 0) + 527) * 31) + (this.f23854c ? 1 : 0)) * 31;
        String str = this.f23852a;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23852a);
        parcel.writeByte(this.f23853b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f23854c ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f23855d);
        parcel.writeInt(this.f23856e.length);
        for (zo zoVar : this.f23856e) {
            parcel.writeParcelable(zoVar, 0);
        }
    }
}
