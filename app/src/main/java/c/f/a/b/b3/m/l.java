package c.f.a.b.b3.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.j3.x0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f6589d;

    public static class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i2) {
            return new l[i2];
        }
    }

    public l(Parcel parcel) {
        super("PRIV");
        this.f6588c = (String) x0.i(parcel.readString());
        this.f6589d = (byte[]) x0.i(parcel.createByteArray());
    }

    public l(String str, byte[] bArr) {
        super("PRIV");
        this.f6588c = str;
        this.f6589d = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return x0.b(this.f6588c, lVar.f6588c) && Arrays.equals(this.f6589d, lVar.f6589d);
    }

    public int hashCode() {
        String str = this.f6588c;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f6589d);
    }

    @Override // c.f.a.b.b3.m.i
    public String toString() {
        return this.f6579b + ": owner=" + this.f6588c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6588c);
        parcel.writeByteArray(this.f6589d);
    }
}
