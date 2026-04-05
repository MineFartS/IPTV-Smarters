package c.f.a.b.c3;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.j3.x0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f6664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<i0> f6666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f6667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f6669h;

    public static class a implements Parcelable.Creator<a0> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a0 createFromParcel(Parcel parcel) {
            return new a0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a0[] newArray(int i2) {
            return new a0[i2];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f6671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f6672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<i0> f6673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f6674e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f6675f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f6676g;

        public b(String str, Uri uri) {
            this.f6670a = str;
            this.f6671b = uri;
        }

        public a0 a() {
            String str = this.f6670a;
            Uri uri = this.f6671b;
            String str2 = this.f6672c;
            List listJ = this.f6673d;
            if (listJ == null) {
                listJ = c.f.b.b.t.J();
            }
            return new a0(str, uri, str2, listJ, this.f6674e, this.f6675f, this.f6676g, null);
        }

        public b b(String str) {
            this.f6675f = str;
            return this;
        }

        public b c(byte[] bArr) {
            this.f6676g = bArr;
            return this;
        }

        public b d(byte[] bArr) {
            this.f6674e = bArr;
            return this;
        }

        public b e(String str) {
            this.f6672c = str;
            return this;
        }

        public b f(List<i0> list) {
            this.f6673d = list;
            return this;
        }
    }

    public static class c extends IOException {
    }

    public a0(Parcel parcel) {
        this.f6663b = (String) x0.i(parcel.readString());
        this.f6664c = Uri.parse((String) x0.i(parcel.readString()));
        this.f6665d = parcel.readString();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(parcel.readParcelable(i0.class.getClassLoader()));
        }
        this.f6666e = Collections.unmodifiableList(arrayList);
        this.f6667f = parcel.createByteArray();
        this.f6668g = parcel.readString();
        this.f6669h = (byte[]) x0.i(parcel.createByteArray());
    }

    public a0(String str, Uri uri, String str2, List<i0> list, byte[] bArr, String str3, byte[] bArr2) {
        int iO0 = x0.o0(uri, str2);
        if (iO0 == 0 || iO0 == 2 || iO0 == 1) {
            c.f.a.b.j3.g.b(str3 == null, "customCacheKey must be null for type: " + iO0);
        }
        this.f6663b = str;
        this.f6664c = uri;
        this.f6665d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f6666e = Collections.unmodifiableList(arrayList);
        this.f6667f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f6668g = str3;
        this.f6669h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : x0.f9301f;
    }

    public /* synthetic */ a0(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, a aVar) {
        this(str, uri, str2, list, bArr, str3, bArr2);
    }

    public a0 b(String str) {
        return new a0(str, this.f6664c, this.f6665d, this.f6666e, this.f6667f, this.f6668g, this.f6669h);
    }

    public a0 c(byte[] bArr) {
        return new a0(this.f6663b, this.f6664c, this.f6665d, this.f6666e, bArr, this.f6668g, this.f6669h);
    }

    public a0 d(a0 a0Var) {
        List listEmptyList;
        c.f.a.b.j3.g.a(this.f6663b.equals(a0Var.f6663b));
        if (this.f6666e.isEmpty() || a0Var.f6666e.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            listEmptyList = new ArrayList(this.f6666e);
            for (int i2 = 0; i2 < a0Var.f6666e.size(); i2++) {
                i0 i0Var = a0Var.f6666e.get(i2);
                if (!listEmptyList.contains(i0Var)) {
                    listEmptyList.add(i0Var);
                }
            }
        }
        return new a0(this.f6663b, a0Var.f6664c, a0Var.f6665d, listEmptyList, a0Var.f6667f, a0Var.f6668g, a0Var.f6669h);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f6663b.equals(a0Var.f6663b) && this.f6664c.equals(a0Var.f6664c) && x0.b(this.f6665d, a0Var.f6665d) && this.f6666e.equals(a0Var.f6666e) && Arrays.equals(this.f6667f, a0Var.f6667f) && x0.b(this.f6668g, a0Var.f6668g) && Arrays.equals(this.f6669h, a0Var.f6669h);
    }

    public final int hashCode() {
        int iHashCode = ((this.f6663b.hashCode() * 31 * 31) + this.f6664c.hashCode()) * 31;
        String str = this.f6665d;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f6666e.hashCode()) * 31) + Arrays.hashCode(this.f6667f)) * 31;
        String str2 = this.f6668g;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f6669h);
    }

    public String toString() {
        return this.f6665d + ":" + this.f6663b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f6663b);
        parcel.writeString(this.f6664c.toString());
        parcel.writeString(this.f6665d);
        parcel.writeInt(this.f6666e.size());
        for (int i3 = 0; i3 < this.f6666e.size(); i3++) {
            parcel.writeParcelable(this.f6666e.get(i3), 0);
        }
        parcel.writeByteArray(this.f6667f);
        parcel.writeString(this.f6668g);
        parcel.writeByteArray(this.f6669h);
    }
}
