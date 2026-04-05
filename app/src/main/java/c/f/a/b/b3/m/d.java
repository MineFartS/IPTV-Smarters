package c.f.a.b.b3.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.j3.x0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i[] f6561h;

    public static class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i2) {
            return new d[i2];
        }
    }

    public d(Parcel parcel) {
        super("CHAP");
        this.f6556c = (String) x0.i(parcel.readString());
        this.f6557d = parcel.readInt();
        this.f6558e = parcel.readInt();
        this.f6559f = parcel.readLong();
        this.f6560g = parcel.readLong();
        int i2 = parcel.readInt();
        this.f6561h = new i[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f6561h[i3] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }

    public d(String str, int i2, int i3, long j2, long j3, i[] iVarArr) {
        super("CHAP");
        this.f6556c = str;
        this.f6557d = i2;
        this.f6558e = i3;
        this.f6559f = j2;
        this.f6560g = j3;
        this.f6561h = iVarArr;
    }

    @Override // c.f.a.b.b3.m.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f6557d == dVar.f6557d && this.f6558e == dVar.f6558e && this.f6559f == dVar.f6559f && this.f6560g == dVar.f6560g && x0.b(this.f6556c, dVar.f6556c) && Arrays.equals(this.f6561h, dVar.f6561h);
    }

    public int hashCode() {
        int i2 = (((((((527 + this.f6557d) * 31) + this.f6558e) * 31) + ((int) this.f6559f)) * 31) + ((int) this.f6560g)) * 31;
        String str = this.f6556c;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6556c);
        parcel.writeInt(this.f6557d);
        parcel.writeInt(this.f6558e);
        parcel.writeLong(this.f6559f);
        parcel.writeLong(this.f6560g);
        parcel.writeInt(this.f6561h.length);
        for (i iVar : this.f6561h) {
            parcel.writeParcelable(iVar, 0);
        }
    }
}
