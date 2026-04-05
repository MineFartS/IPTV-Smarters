package c.f.a.b.b3.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.j3.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends i {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6582e;

    public static class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i2) {
            return new j[i2];
        }
    }

    public j(Parcel parcel) {
        super("----");
        this.f6580c = (String) x0.i(parcel.readString());
        this.f6581d = (String) x0.i(parcel.readString());
        this.f6582e = (String) x0.i(parcel.readString());
    }

    public j(String str, String str2, String str3) {
        super("----");
        this.f6580c = str;
        this.f6581d = str2;
        this.f6582e = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return x0.b(this.f6581d, jVar.f6581d) && x0.b(this.f6580c, jVar.f6580c) && x0.b(this.f6582e, jVar.f6582e);
    }

    public int hashCode() {
        String str = this.f6580c;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6581d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6582e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // c.f.a.b.b3.m.i
    public String toString() {
        return this.f6579b + ": domain=" + this.f6580c + ", description=" + this.f6581d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6579b);
        parcel.writeString(this.f6580c);
        parcel.writeString(this.f6582e);
    }
}
