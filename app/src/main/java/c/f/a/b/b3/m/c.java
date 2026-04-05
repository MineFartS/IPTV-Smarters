package c.f.a.b.b3.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.j3.x0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f6555c;

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
        super((String) x0.i(parcel.readString()));
        this.f6555c = (byte[]) x0.i(parcel.createByteArray());
    }

    public c(String str, byte[] bArr) {
        super(str);
        this.f6555c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f6579b.equals(cVar.f6579b) && Arrays.equals(this.f6555c, cVar.f6555c);
    }

    public int hashCode() {
        return ((527 + this.f6579b.hashCode()) * 31) + Arrays.hashCode(this.f6555c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6579b);
        parcel.writeByteArray(this.f6555c);
    }
}
