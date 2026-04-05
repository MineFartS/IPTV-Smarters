package c.f.a.b.b3.i;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.b3.a;
import c.f.a.b.j3.g;
import c.f.a.b.k1;
import c.f.a.b.q1;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0123a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6525c;

    /* JADX INFO: renamed from: c.f.a.b.b3.i.a$a, reason: collision with other inner class name */
    public static class C0123a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) g.e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    public a(int i2, String str) {
        this.f6524b = i2;
        this.f6525c = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // c.f.a.b.b3.a.b
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return c.f.a.b.b3.b.a(this);
    }

    @Override // c.f.a.b.b3.a.b
    public /* synthetic */ k1 getWrappedMetadataFormat() {
        return c.f.a.b.b3.b.b(this);
    }

    @Override // c.f.a.b.b3.a.b
    public /* synthetic */ void populateMediaMetadata(q1.b bVar) {
        c.f.a.b.b3.b.c(this, bVar);
    }

    public String toString() {
        return "Ait(controlCode=" + this.f6524b + ",url=" + this.f6525c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6525c);
        parcel.writeInt(this.f6524b);
    }
}
