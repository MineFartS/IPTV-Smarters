package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zf extends zo {
    public static final Parcelable.Creator<zf> CREATOR = new ze();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f23845a;

    /* JADX WARN: Illegal instructions before constructor call */
    public zf(Parcel parcel) {
        String string = parcel.readString();
        int i2 = amn.f20135a;
        super(string);
        this.f23845a = (byte[]) amn.A(parcel.createByteArray());
    }

    public zf(String str, byte[] bArr) {
        super(str);
        this.f23845a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zf.class == obj.getClass()) {
            zf zfVar = (zf) obj;
            if (this.f23870f.equals(zfVar.f23870f) && Arrays.equals(this.f23845a, zfVar.f23845a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f23870f.hashCode() + 527) * 31) + Arrays.hashCode(this.f23845a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f23870f);
        parcel.writeByteArray(this.f23845a);
    }
}
