package c.f.a.b.b3.k;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.b3.a;
import c.f.a.b.b3.b;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.q1;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0125a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6537c;

    /* JADX INFO: renamed from: c.f.a.b.b3.k.a$a, reason: collision with other inner class name */
    public static class C0125a implements Parcelable.Creator<a> {
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

    public a(Parcel parcel) {
        this.f6536b = (String) x0.i(parcel.readString());
        this.f6537c = (String) x0.i(parcel.readString());
    }

    public a(String str, String str2) {
        this.f6536b = str;
        this.f6537c = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6536b.equals(aVar.f6536b) && this.f6537c.equals(aVar.f6537c);
    }

    @Override // c.f.a.b.b3.a.b
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return b.a(this);
    }

    @Override // c.f.a.b.b3.a.b
    public /* synthetic */ k1 getWrappedMetadataFormat() {
        return b.b(this);
    }

    public int hashCode() {
        return ((527 + this.f6536b.hashCode()) * 31) + this.f6537c.hashCode();
    }

    @Override // c.f.a.b.b3.a.b
    public void populateMediaMetadata(q1.b bVar) {
        String str = this.f6536b;
        str.hashCode();
        switch (str) {
            case "ALBUM":
                bVar.K(this.f6537c);
                break;
            case "TITLE":
                bVar.V(this.f6537c);
                break;
            case "DESCRIPTION":
                bVar.O(this.f6537c);
                break;
            case "ALBUMARTIST":
                bVar.J(this.f6537c);
                break;
            case "ARTIST":
                bVar.L(this.f6537c);
                break;
        }
    }

    public String toString() {
        return "VC: " + this.f6536b + "=" + this.f6537c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6536b);
        parcel.writeString(this.f6537c);
    }
}
