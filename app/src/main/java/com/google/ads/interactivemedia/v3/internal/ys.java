package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ys implements Parcelable {
    public static final Parcelable.Creator<ys> CREATOR = new yq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yr[] f23806a;

    public ys(Parcel parcel) {
        this.f23806a = new yr[parcel.readInt()];
        int i2 = 0;
        while (true) {
            yr[] yrVarArr = this.f23806a;
            if (i2 >= yrVarArr.length) {
                return;
            }
            yrVarArr[i2] = (yr) parcel.readParcelable(yr.class.getClassLoader());
            i2++;
        }
    }

    public ys(List<? extends yr> list) {
        this.f23806a = (yr[]) list.toArray(new yr[0]);
    }

    public ys(yr... yrVarArr) {
        this.f23806a = yrVarArr;
    }

    public final int a() {
        return this.f23806a.length;
    }

    public final yr b(int i2) {
        return this.f23806a[i2];
    }

    public final ys c(yr... yrVarArr) {
        return yrVarArr.length == 0 ? this : new ys((yr[]) amn.aa(this.f23806a, yrVarArr));
    }

    public final ys d(ys ysVar) {
        return ysVar == null ? this : c(ysVar.f23806a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ys.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f23806a, ((ys) obj).f23806a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f23806a);
    }

    public final String toString() {
        String strValueOf = String.valueOf(Arrays.toString(this.f23806a));
        return strValueOf.length() != 0 ? "entries=".concat(strValueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f23806a.length);
        for (yr yrVar : this.f23806a) {
            parcel.writeParcelable(yrVar, 0);
        }
    }
}
