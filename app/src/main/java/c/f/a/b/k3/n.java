package c.f.a.b.k3;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.j3.x0;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f9490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9491f;

    public static class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i2) {
            return new n[i2];
        }
    }

    public n(int i2, int i3, int i4, byte[] bArr) {
        this.f9487b = i2;
        this.f9488c = i3;
        this.f9489d = i4;
        this.f9490e = bArr;
    }

    public n(Parcel parcel) {
        this.f9487b = parcel.readInt();
        this.f9488c = parcel.readInt();
        this.f9489d = parcel.readInt();
        this.f9490e = x0.L0(parcel) ? parcel.createByteArray() : null;
    }

    @Pure
    public static int b(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int c(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f9487b == nVar.f9487b && this.f9488c == nVar.f9488c && this.f9489d == nVar.f9489d && Arrays.equals(this.f9490e, nVar.f9490e);
    }

    public int hashCode() {
        if (this.f9491f == 0) {
            this.f9491f = ((((((527 + this.f9487b) * 31) + this.f9488c) * 31) + this.f9489d) * 31) + Arrays.hashCode(this.f9490e);
        }
        return this.f9491f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f9487b);
        sb.append(", ");
        sb.append(this.f9488c);
        sb.append(", ");
        sb.append(this.f9489d);
        sb.append(", ");
        sb.append(this.f9490e != null);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f9487b);
        parcel.writeInt(this.f9488c);
        parcel.writeInt(this.f9489d);
        x0.g1(parcel, this.f9490e != null);
        byte[] bArr = this.f9490e;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
