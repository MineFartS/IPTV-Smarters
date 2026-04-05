package c.f.a.b.b3.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.j3.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6569e;

    public static class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i2) {
            return new f[i2];
        }
    }

    public f(Parcel parcel) {
        super("COMM");
        this.f6567c = (String) x0.i(parcel.readString());
        this.f6568d = (String) x0.i(parcel.readString());
        this.f6569e = (String) x0.i(parcel.readString());
    }

    public f(String str, String str2, String str3) {
        super("COMM");
        this.f6567c = str;
        this.f6568d = str2;
        this.f6569e = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return x0.b(this.f6568d, fVar.f6568d) && x0.b(this.f6567c, fVar.f6567c) && x0.b(this.f6569e, fVar.f6569e);
    }

    public int hashCode() {
        String str = this.f6567c;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6568d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6569e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // c.f.a.b.b3.m.i
    public String toString() {
        return this.f6579b + ": language=" + this.f6567c + ", description=" + this.f6568d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6579b);
        parcel.writeString(this.f6567c);
        parcel.writeString(this.f6569e);
    }
}
