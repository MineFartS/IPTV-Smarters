package c.f.a.b.b3;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.q1;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0122a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b[] f6519b;

    /* JADX INFO: renamed from: c.f.a.b.b3.a$a, reason: collision with other inner class name */
    public static class C0122a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    public interface b extends Parcelable {
        byte[] getWrappedMetadataBytes();

        k1 getWrappedMetadataFormat();

        void populateMediaMetadata(q1.b bVar);
    }

    public a(Parcel parcel) {
        this.f6519b = new b[parcel.readInt()];
        int i2 = 0;
        while (true) {
            b[] bVarArr = this.f6519b;
            if (i2 >= bVarArr.length) {
                return;
            }
            bVarArr[i2] = (b) parcel.readParcelable(b.class.getClassLoader());
            i2++;
        }
    }

    public a(List<? extends b> list) {
        this.f6519b = (b[]) list.toArray(new b[0]);
    }

    public a(b... bVarArr) {
        this.f6519b = bVarArr;
    }

    public a b(b... bVarArr) {
        return bVarArr.length == 0 ? this : new a((b[]) x0.F0(this.f6519b, bVarArr));
    }

    public a c(a aVar) {
        return aVar == null ? this : b(aVar.f6519b);
    }

    public b d(int i2) {
        return this.f6519b[i2];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f6519b.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f6519b, ((a) obj).f6519b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f6519b);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f6519b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f6519b.length);
        for (b bVar : this.f6519b) {
            parcel.writeParcelable(bVar, 0);
        }
    }
}
