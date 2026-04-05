package c.f.a.b.e3.f1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.f.a.b.b3.a;
import c.f.a.b.k1;
import c.f.a.b.q1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements a.b {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<b> f7347d;

    public static class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public s createFromParcel(Parcel parcel) {
            return new s(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public s[] newArray(int i2) {
            return new s[i2];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7349c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f7350d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f7351e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f7352f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f7353g;

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

        public b(int i2, int i3, String str, String str2, String str3, String str4) {
            this.f7348b = i2;
            this.f7349c = i3;
            this.f7350d = str;
            this.f7351e = str2;
            this.f7352f = str3;
            this.f7353g = str4;
        }

        public b(Parcel parcel) {
            this.f7348b = parcel.readInt();
            this.f7349c = parcel.readInt();
            this.f7350d = parcel.readString();
            this.f7351e = parcel.readString();
            this.f7352f = parcel.readString();
            this.f7353g = parcel.readString();
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
            return this.f7348b == bVar.f7348b && this.f7349c == bVar.f7349c && TextUtils.equals(this.f7350d, bVar.f7350d) && TextUtils.equals(this.f7351e, bVar.f7351e) && TextUtils.equals(this.f7352f, bVar.f7352f) && TextUtils.equals(this.f7353g, bVar.f7353g);
        }

        public int hashCode() {
            int i2 = ((this.f7348b * 31) + this.f7349c) * 31;
            String str = this.f7350d;
            int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f7351e;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f7352f;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f7353g;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f7348b);
            parcel.writeInt(this.f7349c);
            parcel.writeString(this.f7350d);
            parcel.writeString(this.f7351e);
            parcel.writeString(this.f7352f);
            parcel.writeString(this.f7353g);
        }
    }

    public s(Parcel parcel) {
        this.f7345b = parcel.readString();
        this.f7346c = parcel.readString();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f7347d = Collections.unmodifiableList(arrayList);
    }

    public s(String str, String str2, List<b> list) {
        this.f7345b = str;
        this.f7346c = str2;
        this.f7347d = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return TextUtils.equals(this.f7345b, sVar.f7345b) && TextUtils.equals(this.f7346c, sVar.f7346c) && this.f7347d.equals(sVar.f7347d);
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
        String str = this.f7345b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f7346c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f7347d.hashCode();
    }

    @Override // c.f.a.b.b3.a.b
    public /* synthetic */ void populateMediaMetadata(q1.b bVar) {
        c.f.a.b.b3.b.c(this, bVar);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HlsTrackMetadataEntry");
        if (this.f7345b != null) {
            str = " [" + this.f7345b + ", " + this.f7346c + "]";
        } else {
            str = BuildConfig.FLAVOR;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f7345b);
        parcel.writeString(this.f7346c);
        int size = this.f7347d.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeParcelable(this.f7347d.get(i3), 0);
        }
    }
}
