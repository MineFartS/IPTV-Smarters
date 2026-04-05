package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class acr implements Parcelable {
    public static final Parcelable.Creator<acr> CREATOR = new acs(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ke[] f19203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19204c;

    public acr(Parcel parcel) {
        int i2 = parcel.readInt();
        this.f19202a = i2;
        this.f19203b = new ke[i2];
        for (int i3 = 0; i3 < this.f19202a; i3++) {
            this.f19203b[i3] = (ke) parcel.readParcelable(ke.class.getClassLoader());
        }
    }

    public acr(ke... keVarArr) {
        int length = keVarArr.length;
        int i2 = 1;
        ajr.f(length > 0);
        this.f19203b = keVarArr;
        this.f19202a = length;
        String strD = d(keVarArr[0].f22147c);
        int iC = c(keVarArr[0].f22149e);
        while (true) {
            ke[] keVarArr2 = this.f19203b;
            if (i2 >= keVarArr2.length) {
                return;
            }
            if (!strD.equals(d(keVarArr2[i2].f22147c))) {
                ke[] keVarArr3 = this.f19203b;
                e("languages", keVarArr3[0].f22147c, keVarArr3[i2].f22147c, i2);
                return;
            } else {
                if (iC != c(this.f19203b[i2].f22149e)) {
                    e("role flags", Integer.toBinaryString(this.f19203b[0].f22149e), Integer.toBinaryString(this.f19203b[i2].f22149e), i2);
                    return;
                }
                i2++;
            }
        }
    }

    private static int c(int i2) {
        return i2 | 16384;
    }

    private static String d(String str) {
        return (str == null || str.equals("und")) ? BuildConfig.FLAVOR : str;
    }

    private static void e(String str, String str2, String str3, int i2) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 78 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i2);
        sb.append(")");
        alj.a("TrackGroup", BuildConfig.FLAVOR, new IllegalStateException(sb.toString()));
    }

    public final int a(ke keVar) {
        int i2 = 0;
        while (true) {
            ke[] keVarArr = this.f19203b;
            if (i2 >= keVarArr.length) {
                return -1;
            }
            if (keVar == keVarArr[i2]) {
                return i2;
            }
            i2++;
        }
    }

    public final ke b(int i2) {
        return this.f19203b[i2];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && acr.class == obj.getClass()) {
            acr acrVar = (acr) obj;
            if (this.f19202a == acrVar.f19202a && Arrays.equals(this.f19203b, acrVar.f19203b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.f19204c;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.f19203b) + 527;
        this.f19204c = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f19202a);
        for (int i3 = 0; i3 < this.f19202a; i3++) {
            parcel.writeParcelable(this.f19203b[i3], 0);
        }
    }
}
