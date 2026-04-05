package c.f.a.b.b3.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.j3.x0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f6586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f6587g;

    public static class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i2) {
            return new k[i2];
        }
    }

    public k(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f6583c = i2;
        this.f6584d = i3;
        this.f6585e = i4;
        this.f6586f = iArr;
        this.f6587g = iArr2;
    }

    public k(Parcel parcel) {
        super("MLLT");
        this.f6583c = parcel.readInt();
        this.f6584d = parcel.readInt();
        this.f6585e = parcel.readInt();
        this.f6586f = (int[]) x0.i(parcel.createIntArray());
        this.f6587g = (int[]) x0.i(parcel.createIntArray());
    }

    @Override // c.f.a.b.b3.m.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f6583c == kVar.f6583c && this.f6584d == kVar.f6584d && this.f6585e == kVar.f6585e && Arrays.equals(this.f6586f, kVar.f6586f) && Arrays.equals(this.f6587g, kVar.f6587g);
    }

    public int hashCode() {
        return ((((((((527 + this.f6583c) * 31) + this.f6584d) * 31) + this.f6585e) * 31) + Arrays.hashCode(this.f6586f)) * 31) + Arrays.hashCode(this.f6587g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f6583c);
        parcel.writeInt(this.f6584d);
        parcel.writeInt(this.f6585e);
        parcel.writeIntArray(this.f6586f);
        parcel.writeIntArray(this.f6587g);
    }
}
