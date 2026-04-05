package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class act implements Parcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final acr[] f19208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19209d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final act f19206a = new act(new acr[0]);
    public static final Parcelable.Creator<act> CREATOR = new acs();

    public act(Parcel parcel) {
        int i2 = parcel.readInt();
        this.f19207b = i2;
        this.f19208c = new acr[i2];
        for (int i3 = 0; i3 < this.f19207b; i3++) {
            this.f19208c[i3] = (acr) parcel.readParcelable(acr.class.getClassLoader());
        }
    }

    public act(acr... acrVarArr) {
        this.f19208c = acrVarArr;
        this.f19207b = acrVarArr.length;
    }

    public final int a(acr acrVar) {
        for (int i2 = 0; i2 < this.f19207b; i2++) {
            if (this.f19208c[i2] == acrVar) {
                return i2;
            }
        }
        return -1;
    }

    public final acr b(int i2) {
        return this.f19208c[i2];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && act.class == obj.getClass()) {
            act actVar = (act) obj;
            if (this.f19207b == actVar.f19207b && Arrays.equals(this.f19208c, actVar.f19208c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f19209d;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.f19208c);
        this.f19209d = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f19207b);
        for (int i3 = 0; i3 < this.f19207b; i3++) {
            parcel.writeParcelable(this.f19208c[i3], 0);
        }
    }
}
