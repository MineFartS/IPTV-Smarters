package c.h.a.g.c;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class d extends b implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16782j;

    public static class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            d dVar = new d();
            dVar.z(parcel.readLong());
            dVar.A(parcel.readString());
            dVar.C(parcel.readString());
            dVar.G(parcel.readLong());
            dVar.u(parcel.readString());
            dVar.w(parcel.readString());
            dVar.y(parcel.readLong());
            dVar.E(parcel.readByte() != 0);
            dVar.H(parcel.readInt());
            return dVar;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i2) {
            return new d[i2];
        }
    }

    public void H(int i2) {
        this.f16782j = i2;
    }

    @Override // c.h.a.g.c.b, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // c.h.a.g.c.b, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(o());
        parcel.writeString(p());
        parcel.writeString(q());
        parcel.writeLong(r());
        parcel.writeString(l());
        parcel.writeString(m());
        parcel.writeLong(n());
        parcel.writeByte(t() ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f16782j);
    }
}
