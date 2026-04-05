package c.h.a.g.c;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class a extends b implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0208a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f16769j;

    /* JADX INFO: renamed from: c.h.a.g.c.a$a, reason: collision with other inner class name */
    public static class C0208a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            a aVar = new a();
            aVar.z(parcel.readLong());
            aVar.A(parcel.readString());
            aVar.C(parcel.readString());
            aVar.G(parcel.readLong());
            aVar.u(parcel.readString());
            aVar.w(parcel.readString());
            aVar.y(parcel.readLong());
            aVar.E(parcel.readByte() != 0);
            aVar.I(parcel.readLong());
            return aVar;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    public long H() {
        return this.f16769j;
    }

    public void I(long j2) {
        this.f16769j = j2;
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
        parcel.writeLong(H());
    }
}
