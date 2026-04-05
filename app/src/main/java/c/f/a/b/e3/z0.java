package c.f.a.b.e3;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.k1;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 implements Parcelable {
    public static final Parcelable.Creator<z0> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1[] f8057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8058d;

    public static class a implements Parcelable.Creator<z0> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public z0 createFromParcel(Parcel parcel) {
            return new z0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z0[] newArray(int i2) {
            return new z0[i2];
        }
    }

    public z0(Parcel parcel) {
        int i2 = parcel.readInt();
        this.f8056b = i2;
        this.f8057c = new k1[i2];
        for (int i3 = 0; i3 < this.f8056b; i3++) {
            this.f8057c[i3] = (k1) parcel.readParcelable(k1.class.getClassLoader());
        }
    }

    public z0(k1... k1VarArr) {
        c.f.a.b.j3.g.g(k1VarArr.length > 0);
        this.f8057c = k1VarArr;
        this.f8056b = k1VarArr.length;
        h();
    }

    public static void d(String str, String str2, String str3, int i2) {
        c.f.a.b.j3.z.e("TrackGroup", BuildConfig.FLAVOR, new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i2 + ")"));
    }

    public static String e(String str) {
        return (str == null || str.equals("und")) ? BuildConfig.FLAVOR : str;
    }

    public static int f(int i2) {
        return i2 | 16384;
    }

    public k1 b(int i2) {
        return this.f8057c[i2];
    }

    public int c(k1 k1Var) {
        int i2 = 0;
        while (true) {
            k1[] k1VarArr = this.f8057c;
            if (i2 >= k1VarArr.length) {
                return -1;
            }
            if (k1Var == k1VarArr[i2]) {
                return i2;
            }
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f8056b == z0Var.f8056b && Arrays.equals(this.f8057c, z0Var.f8057c);
    }

    public final void h() {
        String strE = e(this.f8057c[0].f9329d);
        int iF = f(this.f8057c[0].f9331f);
        int i2 = 1;
        while (true) {
            k1[] k1VarArr = this.f8057c;
            if (i2 >= k1VarArr.length) {
                return;
            }
            if (!strE.equals(e(k1VarArr[i2].f9329d))) {
                k1[] k1VarArr2 = this.f8057c;
                d("languages", k1VarArr2[0].f9329d, k1VarArr2[i2].f9329d, i2);
                return;
            } else {
                if (iF != f(this.f8057c[i2].f9331f)) {
                    d("role flags", Integer.toBinaryString(this.f8057c[0].f9331f), Integer.toBinaryString(this.f8057c[i2].f9331f), i2);
                    return;
                }
                i2++;
            }
        }
    }

    public int hashCode() {
        if (this.f8058d == 0) {
            this.f8058d = 527 + Arrays.hashCode(this.f8057c);
        }
        return this.f8058d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f8056b);
        for (int i3 = 0; i3 < this.f8056b; i3++) {
            parcel.writeParcelable(this.f8057c[i3], 0);
        }
    }
}
