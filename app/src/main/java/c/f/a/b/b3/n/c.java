package c.f.a.b.b3.n;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.b3.a;
import c.f.a.b.k1;
import c.f.a.b.q1;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6603f;

    public static class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i2) {
            return new c[i2];
        }
    }

    public c(long j2, long j3, long j4, long j5, long j6) {
        this.f6599b = j2;
        this.f6600c = j3;
        this.f6601d = j4;
        this.f6602e = j5;
        this.f6603f = j6;
    }

    public c(Parcel parcel) {
        this.f6599b = parcel.readLong();
        this.f6600c = parcel.readLong();
        this.f6601d = parcel.readLong();
        this.f6602e = parcel.readLong();
        this.f6603f = parcel.readLong();
    }

    public /* synthetic */ c(Parcel parcel, a aVar) {
        this(parcel);
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
        c cVar = (c) obj;
        return this.f6599b == cVar.f6599b && this.f6600c == cVar.f6600c && this.f6601d == cVar.f6601d && this.f6602e == cVar.f6602e && this.f6603f == cVar.f6603f;
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
        return ((((((((527 + c.f.b.f.d.b(this.f6599b)) * 31) + c.f.b.f.d.b(this.f6600c)) * 31) + c.f.b.f.d.b(this.f6601d)) * 31) + c.f.b.f.d.b(this.f6602e)) * 31) + c.f.b.f.d.b(this.f6603f);
    }

    @Override // c.f.a.b.b3.a.b
    public /* synthetic */ void populateMediaMetadata(q1.b bVar) {
        c.f.a.b.b3.b.c(this, bVar);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f6599b + ", photoSize=" + this.f6600c + ", photoPresentationTimestampUs=" + this.f6601d + ", videoStartPosition=" + this.f6602e + ", videoSize=" + this.f6603f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f6599b);
        parcel.writeLong(this.f6600c);
        parcel.writeLong(this.f6601d);
        parcel.writeLong(this.f6602e);
        parcel.writeLong(this.f6603f);
    }
}
