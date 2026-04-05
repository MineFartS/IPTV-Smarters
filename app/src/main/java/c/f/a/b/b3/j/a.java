package c.f.a.b.b3.j;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.b3.a;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.q1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements a.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f6532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6533i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k1 f6526b = new k1.b().e0("application/id3").E();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k1 f6527c = new k1.b().e0("application/x-scte35").E();
    public static final Parcelable.Creator<a> CREATOR = new C0124a();

    /* JADX INFO: renamed from: c.f.a.b.b3.j.a$a, reason: collision with other inner class name */
    public static class C0124a implements Parcelable.Creator<a> {
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
        this.f6528d = (String) x0.i(parcel.readString());
        this.f6529e = (String) x0.i(parcel.readString());
        this.f6530f = parcel.readLong();
        this.f6531g = parcel.readLong();
        this.f6532h = (byte[]) x0.i(parcel.createByteArray());
    }

    public a(String str, String str2, long j2, long j3, byte[] bArr) {
        this.f6528d = str;
        this.f6529e = str2;
        this.f6530f = j2;
        this.f6531g = j3;
        this.f6532h = bArr;
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
        return this.f6530f == aVar.f6530f && this.f6531g == aVar.f6531g && x0.b(this.f6528d, aVar.f6528d) && x0.b(this.f6529e, aVar.f6529e) && Arrays.equals(this.f6532h, aVar.f6532h);
    }

    @Override // c.f.a.b.b3.a.b
    public byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.f6532h;
        }
        return null;
    }

    @Override // c.f.a.b.b3.a.b
    public k1 getWrappedMetadataFormat() {
        String str = this.f6528d;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f6527c;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f6526b;
            default:
                return null;
        }
    }

    public int hashCode() {
        if (this.f6533i == 0) {
            String str = this.f6528d;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f6529e;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j2 = this.f6530f;
            int i2 = (((iHashCode + iHashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f6531g;
            this.f6533i = ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + Arrays.hashCode(this.f6532h);
        }
        return this.f6533i;
    }

    @Override // c.f.a.b.b3.a.b
    public /* synthetic */ void populateMediaMetadata(q1.b bVar) {
        c.f.a.b.b3.b.c(this, bVar);
    }

    public String toString() {
        return "EMSG: scheme=" + this.f6528d + ", id=" + this.f6531g + ", durationMs=" + this.f6530f + ", value=" + this.f6529e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6528d);
        parcel.writeString(this.f6529e);
        parcel.writeLong(this.f6530f);
        parcel.writeLong(this.f6531g);
        parcel.writeByteArray(this.f6532h);
    }
}
