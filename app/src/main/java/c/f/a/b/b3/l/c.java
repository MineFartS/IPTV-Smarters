package c.f.a.b.b3.l;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.b3.a;
import c.f.a.b.j3.g;
import c.f.a.b.k1;
import c.f.a.b.q1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6549d;

    public static class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i2) {
            return new c[i2];
        }
    }

    public c(Parcel parcel) {
        this.f6547b = (byte[]) g.e(parcel.createByteArray());
        this.f6548c = parcel.readString();
        this.f6549d = parcel.readString();
    }

    public c(byte[] bArr, String str, String str2) {
        this.f6547b = bArr;
        this.f6548c = str;
        this.f6549d = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f6547b, ((c) obj).f6547b);
    }

    @Override // c.f.a.b.b3.a.b
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return c.f.a.b.b3.b.a(this);
    }

    @Override // c.f.a.b.b3.a.b
    public /* synthetic */ k1 getWrappedMetadataFormat() {
        return c.f.a.b.b3.b.b(this);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f6547b);
    }

    @Override // c.f.a.b.b3.a.b
    public void populateMediaMetadata(q1.b bVar) {
        String str = this.f6548c;
        if (str != null) {
            bVar.V(str);
        }
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f6548c, this.f6549d, Integer.valueOf(this.f6547b.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByteArray(this.f6547b);
        parcel.writeString(this.f6548c);
        parcel.writeString(this.f6549d);
    }
}
