package c.f.a.b.e3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 implements Parcelable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z0[] f6904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6905e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a1 f6902b = new a1(new z0[0]);
    public static final Parcelable.Creator<a1> CREATOR = new a();

    public static class a implements Parcelable.Creator<a1> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a1 createFromParcel(Parcel parcel) {
            return new a1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a1[] newArray(int i2) {
            return new a1[i2];
        }
    }

    public a1(Parcel parcel) {
        int i2 = parcel.readInt();
        this.f6903c = i2;
        this.f6904d = new z0[i2];
        for (int i3 = 0; i3 < this.f6903c; i3++) {
            this.f6904d[i3] = (z0) parcel.readParcelable(z0.class.getClassLoader());
        }
    }

    public a1(z0... z0VarArr) {
        this.f6904d = z0VarArr;
        this.f6903c = z0VarArr.length;
    }

    public z0 b(int i2) {
        return this.f6904d[i2];
    }

    public int c(z0 z0Var) {
        for (int i2 = 0; i2 < this.f6903c; i2++) {
            if (this.f6904d[i2] == z0Var) {
                return i2;
            }
        }
        return -1;
    }

    public boolean d() {
        return this.f6903c == 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a1.class != obj.getClass()) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f6903c == a1Var.f6903c && Arrays.equals(this.f6904d, a1Var.f6904d);
    }

    public int hashCode() {
        if (this.f6905e == 0) {
            this.f6905e = Arrays.hashCode(this.f6904d);
        }
        return this.f6905e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f6903c);
        for (int i3 = 0; i3 < this.f6903c; i3++) {
            parcel.writeParcelable(this.f6904d[i3], 0);
        }
    }
}
