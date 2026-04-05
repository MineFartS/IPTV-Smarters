package c.f.a.b.x2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.f.a.b.j3.x0;
import c.f.a.b.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b[] f10445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10448e;

    public static class a implements Parcelable.Creator<w> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public w createFromParcel(Parcel parcel) {
            return new w(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public w[] newArray(int i2) {
            return new w[i2];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UUID f10450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f10451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f10452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final byte[] f10453f;

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
            this.f10450c = new UUID(parcel.readLong(), parcel.readLong());
            this.f10451d = parcel.readString();
            this.f10452e = (String) x0.i(parcel.readString());
            this.f10453f = parcel.createByteArray();
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f10450c = (UUID) c.f.a.b.j3.g.e(uuid);
            this.f10451d = str;
            this.f10452e = (String) c.f.a.b.j3.g.e(str2);
            this.f10453f = bArr;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean b(b bVar) {
            return d() && !bVar.d() && e(bVar.f10450c);
        }

        public b c(byte[] bArr) {
            return new b(this.f10450c, this.f10451d, this.f10452e, bArr);
        }

        public boolean d() {
            return this.f10453f != null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean e(UUID uuid) {
            return w0.f10304a.equals(this.f10450c) || uuid.equals(this.f10450c);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return x0.b(this.f10451d, bVar.f10451d) && x0.b(this.f10452e, bVar.f10452e) && x0.b(this.f10450c, bVar.f10450c) && Arrays.equals(this.f10453f, bVar.f10453f);
        }

        public int hashCode() {
            if (this.f10449b == 0) {
                int iHashCode = this.f10450c.hashCode() * 31;
                String str = this.f10451d;
                this.f10449b = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f10452e.hashCode()) * 31) + Arrays.hashCode(this.f10453f);
            }
            return this.f10449b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.f10450c.getMostSignificantBits());
            parcel.writeLong(this.f10450c.getLeastSignificantBits());
            parcel.writeString(this.f10451d);
            parcel.writeString(this.f10452e);
            parcel.writeByteArray(this.f10453f);
        }
    }

    public w(Parcel parcel) {
        this.f10447d = parcel.readString();
        b[] bVarArr = (b[]) x0.i(parcel.createTypedArray(b.CREATOR));
        this.f10445b = bVarArr;
        this.f10448e = bVarArr.length;
    }

    public w(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public w(String str, boolean z, b... bVarArr) {
        this.f10447d = str;
        bVarArr = z ? (b[]) bVarArr.clone() : bVarArr;
        this.f10445b = bVarArr;
        this.f10448e = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public w(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public w(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public w(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public static boolean c(ArrayList<b> arrayList, int i2, UUID uuid) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (arrayList.get(i3).f10450c.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static w e(w wVar, w wVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (wVar != null) {
            str = wVar.f10447d;
            for (b bVar : wVar.f10445b) {
                if (bVar.d()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (wVar2 != null) {
            if (str == null) {
                str = wVar2.f10447d;
            }
            int size = arrayList.size();
            for (b bVar2 : wVar2.f10445b) {
                if (bVar2.d() && !c(arrayList, size, bVar2.f10450c)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new w(str, arrayList);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = w0.f10304a;
        return uuid.equals(bVar.f10450c) ? uuid.equals(bVar2.f10450c) ? 0 : 1 : bVar.f10450c.compareTo(bVar2.f10450c);
    }

    public w d(String str) {
        return x0.b(this.f10447d, str) ? this : new w(str, false, this.f10445b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return x0.b(this.f10447d, wVar.f10447d) && Arrays.equals(this.f10445b, wVar.f10445b);
    }

    public b f(int i2) {
        return this.f10445b[i2];
    }

    public w h(w wVar) {
        String str;
        String str2 = this.f10447d;
        c.f.a.b.j3.g.g(str2 == null || (str = wVar.f10447d) == null || TextUtils.equals(str2, str));
        String str3 = this.f10447d;
        if (str3 == null) {
            str3 = wVar.f10447d;
        }
        return new w(str3, (b[]) x0.F0(this.f10445b, wVar.f10445b));
    }

    public int hashCode() {
        if (this.f10446c == 0) {
            String str = this.f10447d;
            this.f10446c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f10445b);
        }
        return this.f10446c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f10447d);
        parcel.writeTypedArray(this.f10445b, 0);
    }
}
