package c.f.a.b.b3.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.j3.x0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends i {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f6573f;

    public static class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i2) {
            return new g[i2];
        }
    }

    public g(Parcel parcel) {
        super("GEOB");
        this.f6570c = (String) x0.i(parcel.readString());
        this.f6571d = (String) x0.i(parcel.readString());
        this.f6572e = (String) x0.i(parcel.readString());
        this.f6573f = (byte[]) x0.i(parcel.createByteArray());
    }

    public g(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f6570c = str;
        this.f6571d = str2;
        this.f6572e = str3;
        this.f6573f = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return x0.b(this.f6570c, gVar.f6570c) && x0.b(this.f6571d, gVar.f6571d) && x0.b(this.f6572e, gVar.f6572e) && Arrays.equals(this.f6573f, gVar.f6573f);
    }

    public int hashCode() {
        String str = this.f6570c;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6571d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6572e;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f6573f);
    }

    @Override // c.f.a.b.b3.m.i
    public String toString() {
        return this.f6579b + ": mimeType=" + this.f6570c + ", filename=" + this.f6571d + ", description=" + this.f6572e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6570c);
        parcel.writeString(this.f6571d);
        parcel.writeString(this.f6572e);
        parcel.writeByteArray(this.f6573f);
    }
}
