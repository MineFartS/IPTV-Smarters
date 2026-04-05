package c.h.a.g.c;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class f extends b implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f16784j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f16785k;

    public static class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            f fVar = new f();
            fVar.z(parcel.readLong());
            fVar.A(parcel.readString());
            fVar.C(parcel.readString());
            fVar.G(parcel.readLong());
            fVar.u(parcel.readString());
            fVar.w(parcel.readString());
            fVar.y(parcel.readLong());
            fVar.E(parcel.readByte() != 0);
            fVar.J(parcel.readLong());
            fVar.K(parcel.readString());
            return fVar;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i2) {
            return new f[i2];
        }
    }

    public long H() {
        return this.f16784j;
    }

    public String I() {
        return this.f16785k;
    }

    public void J(long j2) {
        this.f16784j = j2;
    }

    public void K(String str) {
        this.f16785k = str;
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
        parcel.writeString(I());
    }
}
