package c.f.a.b.b3.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.j3.x0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f6565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i[] f6566g;

    public static class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i2) {
            return new e[i2];
        }
    }

    public e(Parcel parcel) {
        super("CTOC");
        this.f6562c = (String) x0.i(parcel.readString());
        this.f6563d = parcel.readByte() != 0;
        this.f6564e = parcel.readByte() != 0;
        this.f6565f = (String[]) x0.i(parcel.createStringArray());
        int i2 = parcel.readInt();
        this.f6566g = new i[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f6566g[i3] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }

    public e(String str, boolean z, boolean z2, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f6562c = str;
        this.f6563d = z;
        this.f6564e = z2;
        this.f6565f = strArr;
        this.f6566g = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f6563d == eVar.f6563d && this.f6564e == eVar.f6564e && x0.b(this.f6562c, eVar.f6562c) && Arrays.equals(this.f6565f, eVar.f6565f) && Arrays.equals(this.f6566g, eVar.f6566g);
    }

    public int hashCode() {
        int i2 = (((527 + (this.f6563d ? 1 : 0)) * 31) + (this.f6564e ? 1 : 0)) * 31;
        String str = this.f6562c;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6562c);
        parcel.writeByte(this.f6563d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6564e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f6565f);
        parcel.writeInt(this.f6566g.length);
        for (i iVar : this.f6566g) {
            parcel.writeParcelable(iVar, 0);
        }
    }
}
