package c.f.a.b.b3.n;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.b3.a;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.q1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f6596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6598e;

    public static class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    public b(Parcel parcel) {
        this.f6595b = (String) x0.i(parcel.readString());
        this.f6596c = (byte[]) x0.i(parcel.createByteArray());
        this.f6597d = parcel.readInt();
        this.f6598e = parcel.readInt();
    }

    public /* synthetic */ b(Parcel parcel, a aVar) {
        this(parcel);
    }

    public b(String str, byte[] bArr, int i2, int i3) {
        this.f6595b = str;
        this.f6596c = bArr;
        this.f6597d = i2;
        this.f6598e = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6595b.equals(bVar.f6595b) && Arrays.equals(this.f6596c, bVar.f6596c) && this.f6597d == bVar.f6597d && this.f6598e == bVar.f6598e;
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
        return ((((((527 + this.f6595b.hashCode()) * 31) + Arrays.hashCode(this.f6596c)) * 31) + this.f6597d) * 31) + this.f6598e;
    }

    @Override // c.f.a.b.b3.a.b
    public /* synthetic */ void populateMediaMetadata(q1.b bVar) {
        c.f.a.b.b3.b.c(this, bVar);
    }

    public String toString() {
        return "mdta: key=" + this.f6595b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6595b);
        parcel.writeByteArray(this.f6596c);
        parcel.writeInt(this.f6597d);
        parcel.writeInt(this.f6598e);
    }
}
