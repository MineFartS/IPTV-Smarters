package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zu implements yr {
    public static final Parcelable.Creator<zu> CREATOR = new zv(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f23886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23888d;

    public /* synthetic */ zu(Parcel parcel) {
        String string = parcel.readString();
        int i2 = amn.f20135a;
        this.f23885a = string;
        this.f23886b = (byte[]) amn.A(parcel.createByteArray());
        this.f23887c = parcel.readInt();
        this.f23888d = parcel.readInt();
    }

    public zu(String str, byte[] bArr, int i2, int i3) {
        this.f23885a = str;
        this.f23886b = bArr;
        this.f23887c = i2;
        this.f23888d = i3;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yr
    public final /* synthetic */ void a(ko koVar) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zu.class == obj.getClass()) {
            zu zuVar = (zu) obj;
            if (this.f23885a.equals(zuVar.f23885a) && Arrays.equals(this.f23886b, zuVar.f23886b) && this.f23887c == zuVar.f23887c && this.f23888d == zuVar.f23888d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f23885a.hashCode() + 527) * 31) + Arrays.hashCode(this.f23886b)) * 31) + this.f23887c) * 31) + this.f23888d;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f23885a);
        return strValueOf.length() != 0 ? "mdta: key=".concat(strValueOf) : new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23885a);
        parcel.writeByteArray(this.f23886b);
        parcel.writeInt(this.f23887c);
        parcel.writeInt(this.f23888d);
    }
}
