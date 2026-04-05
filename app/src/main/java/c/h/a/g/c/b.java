package c.h.a.g.c;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f16772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f16774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f16775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f16776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16777i;

    public static class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            b bVar = new b();
            bVar.f16770b = parcel.readLong();
            bVar.f16771c = parcel.readString();
            bVar.f16772d = parcel.readString();
            bVar.f16773e = parcel.readLong();
            bVar.f16774f = parcel.readString();
            bVar.f16775g = parcel.readString();
            bVar.f16776h = parcel.readLong();
            bVar.f16777i = parcel.readByte() != 0;
            return bVar;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    public void A(String str) {
        this.f16771c = str;
    }

    public void C(String str) {
        this.f16772d = str;
    }

    public void E(boolean z) {
        this.f16777i = z;
    }

    public void G(long j2) {
        this.f16773e = j2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f16772d.equals(((b) obj).f16772d);
        }
        return false;
    }

    public int hashCode() {
        return this.f16772d.hashCode();
    }

    public String l() {
        return this.f16774f;
    }

    public String m() {
        return this.f16775g;
    }

    public long n() {
        return this.f16776h;
    }

    public long o() {
        return this.f16770b;
    }

    public String p() {
        return this.f16771c;
    }

    public String q() {
        return this.f16772d;
    }

    public long r() {
        return this.f16773e;
    }

    public boolean t() {
        return this.f16777i;
    }

    public void u(String str) {
        this.f16774f = str;
    }

    public void w(String str) {
        this.f16775g = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f16770b);
        parcel.writeString(this.f16771c);
        parcel.writeString(this.f16772d);
        parcel.writeLong(this.f16773e);
        parcel.writeString(this.f16774f);
        parcel.writeString(this.f16775g);
        parcel.writeLong(this.f16776h);
        parcel.writeByte(this.f16777i ? (byte) 1 : (byte) 0);
    }

    public void y(long j2) {
        this.f16776h = j2;
    }

    public void z(long j2) {
        this.f16770b = j2;
    }
}
