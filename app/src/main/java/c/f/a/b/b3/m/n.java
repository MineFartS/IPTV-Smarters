package c.f.a.b.b3.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.j3.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6593d;

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

    public n(Parcel parcel) {
        super((String) x0.i(parcel.readString()));
        this.f6592c = parcel.readString();
        this.f6593d = (String) x0.i(parcel.readString());
    }

    public n(String str, String str2, String str3) {
        super(str);
        this.f6592c = str2;
        this.f6593d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f6579b.equals(nVar.f6579b) && x0.b(this.f6592c, nVar.f6592c) && x0.b(this.f6593d, nVar.f6593d);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f6579b.hashCode()) * 31;
        String str = this.f6592c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6593d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // c.f.a.b.b3.m.i
    public String toString() {
        return this.f6579b + ": url=" + this.f6593d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6579b);
        parcel.writeString(this.f6592c);
        parcel.writeString(this.f6593d);
    }
}
