package c.f.a.b.b3.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.j3.x0;
import c.f.a.b.q1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f6554f;

    public static class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    public b(Parcel parcel) {
        super("APIC");
        this.f6551c = (String) x0.i(parcel.readString());
        this.f6552d = parcel.readString();
        this.f6553e = parcel.readInt();
        this.f6554f = (byte[]) x0.i(parcel.createByteArray());
    }

    public b(String str, String str2, int i2, byte[] bArr) {
        super("APIC");
        this.f6551c = str;
        this.f6552d = str2;
        this.f6553e = i2;
        this.f6554f = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6553e == bVar.f6553e && x0.b(this.f6551c, bVar.f6551c) && x0.b(this.f6552d, bVar.f6552d) && Arrays.equals(this.f6554f, bVar.f6554f);
    }

    public int hashCode() {
        int i2 = (527 + this.f6553e) * 31;
        String str = this.f6551c;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6552d;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f6554f);
    }

    @Override // c.f.a.b.b3.m.i, c.f.a.b.b3.a.b
    public void populateMediaMetadata(q1.b bVar) {
        bVar.G(this.f6554f, this.f6553e);
    }

    @Override // c.f.a.b.b3.m.i
    public String toString() {
        return this.f6579b + ": mimeType=" + this.f6551c + ", description=" + this.f6552d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6551c);
        parcel.writeString(this.f6552d);
        parcel.writeInt(this.f6553e);
        parcel.writeByteArray(this.f6554f);
    }
}
