package c.f.a.b.c3;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazonaws.services.s3.model.InstructionFileId;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 implements Comparable<i0>, Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6748d;

    public static class a implements Parcelable.Creator<i0> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i0 createFromParcel(Parcel parcel) {
            return new i0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i0[] newArray(int i2) {
            return new i0[i2];
        }
    }

    public i0(int i2, int i3) {
        this(0, i2, i3);
    }

    public i0(int i2, int i3, int i4) {
        this.f6746b = i2;
        this.f6747c = i3;
        this.f6748d = i4;
    }

    public i0(Parcel parcel) {
        this.f6746b = parcel.readInt();
        this.f6747c = parcel.readInt();
        this.f6748d = parcel.readInt();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(i0 i0Var) {
        int i2 = this.f6746b - i0Var.f6746b;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.f6747c - i0Var.f6747c;
        return i3 == 0 ? this.f6748d - i0Var.f6748d : i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i0.class != obj.getClass()) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f6746b == i0Var.f6746b && this.f6747c == i0Var.f6747c && this.f6748d == i0Var.f6748d;
    }

    public int hashCode() {
        return (((this.f6746b * 31) + this.f6747c) * 31) + this.f6748d;
    }

    public String toString() {
        return this.f6746b + InstructionFileId.DOT + this.f6747c + InstructionFileId.DOT + this.f6748d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f6746b);
        parcel.writeInt(this.f6747c);
        parcel.writeInt(this.f6748d);
    }
}
