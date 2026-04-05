package c.h.a.g.c;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class e extends b implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f16783j;

    public static class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            e eVar = new e();
            eVar.z(parcel.readLong());
            eVar.A(parcel.readString());
            eVar.C(parcel.readString());
            eVar.G(parcel.readLong());
            eVar.u(parcel.readString());
            eVar.w(parcel.readString());
            eVar.y(parcel.readLong());
            eVar.E(parcel.readByte() != 0);
            eVar.I(parcel.readString());
            return eVar;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i2) {
            return new e[i2];
        }
    }

    public String H() {
        return this.f16783j;
    }

    public void I(String str) {
        this.f16783j = str;
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
        parcel.writeString(H());
    }
}
