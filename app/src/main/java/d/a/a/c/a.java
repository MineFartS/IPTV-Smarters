package d.a.a.c;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0299a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f30087d;

    /* JADX INFO: renamed from: d.a.a.c.a$a, reason: collision with other inner class name */
    public static class C0299a implements Parcelable.Creator<a> {
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
        this.f30085b = parcel.readString();
        this.f30086c = parcel.readString();
        this.f30087d = parcel.readInt() != 0;
    }

    public a(String str, String str2, boolean z, String str3) {
        this.f30085b = str;
        this.f30086c = str2;
        this.f30087d = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f30085b);
        parcel.writeString(this.f30086c);
        parcel.writeInt(this.f30087d ? 0 : 1);
    }
}
