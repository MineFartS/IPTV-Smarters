package c.f.a.b.b3.l;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.b3.a;
import c.f.a.b.j3.g;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;
import c.f.a.b.k1;
import c.f.a.b.q1;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6544e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6545f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6546g;

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

    public b(int i2, String str, String str2, String str3, boolean z, int i3) {
        g.a(i3 == -1 || i3 > 0);
        this.f6541b = i2;
        this.f6542c = str;
        this.f6543d = str2;
        this.f6544e = str3;
        this.f6545f = z;
        this.f6546g = i3;
    }

    public b(Parcel parcel) {
        this.f6541b = parcel.readInt();
        this.f6542c = parcel.readString();
        this.f6543d = parcel.readString();
        this.f6544e = parcel.readString();
        this.f6545f = x0.L0(parcel);
        this.f6546g = parcel.readInt();
    }

    public static b b(Map<String, List<String>> map) {
        boolean z;
        int i2;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i3;
        List<String> list = map.get("icy-br");
        int i4 = -1;
        boolean z2 = true;
        if (list != null) {
            String str4 = list.get(0);
            try {
                i3 = Integer.parseInt(str4) * 1000;
                if (i3 > 0) {
                    z = true;
                } else {
                    try {
                        z.i("IcyHeaders", "Invalid bitrate: " + str4);
                        z = false;
                        i3 = -1;
                    } catch (NumberFormatException unused) {
                        z.i("IcyHeaders", "Invalid bitrate header: " + str4);
                        i2 = i3;
                        z = false;
                    }
                }
                i2 = i3;
            } catch (NumberFormatException unused2) {
                i3 = -1;
            }
        } else {
            z = false;
            i2 = -1;
        }
        List<String> list2 = map.get("icy-genre");
        if (list2 != null) {
            str = list2.get(0);
            z = true;
        } else {
            str = null;
        }
        List<String> list3 = map.get("icy-name");
        if (list3 != null) {
            str2 = list3.get(0);
            z = true;
        } else {
            str2 = null;
        }
        List<String> list4 = map.get("icy-url");
        if (list4 != null) {
            str3 = list4.get(0);
            z = true;
        } else {
            str3 = null;
        }
        List<String> list5 = map.get("icy-pub");
        if (list5 != null) {
            zEquals = list5.get(0).equals("1");
            z = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get("icy-metaint");
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i5 = Integer.parseInt(str5);
                if (i5 > 0) {
                    i4 = i5;
                } else {
                    try {
                        z.i("IcyHeaders", "Invalid metadata interval: " + str5);
                        z2 = z;
                    } catch (NumberFormatException unused3) {
                        i4 = i5;
                        z.i("IcyHeaders", "Invalid metadata interval: " + str5);
                    }
                }
                z = z2;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z) {
            return new b(i2, str, str2, str3, zEquals, i4);
        }
        return null;
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
        return this.f6541b == bVar.f6541b && x0.b(this.f6542c, bVar.f6542c) && x0.b(this.f6543d, bVar.f6543d) && x0.b(this.f6544e, bVar.f6544e) && this.f6545f == bVar.f6545f && this.f6546g == bVar.f6546g;
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
        int i2 = (527 + this.f6541b) * 31;
        String str = this.f6542c;
        int iHashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6543d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6544e;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f6545f ? 1 : 0)) * 31) + this.f6546g;
    }

    @Override // c.f.a.b.b3.a.b
    public /* synthetic */ void populateMediaMetadata(q1.b bVar) {
        c.f.a.b.b3.b.c(this, bVar);
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f6543d + "\", genre=\"" + this.f6542c + "\", bitrate=" + this.f6541b + ", metadataInterval=" + this.f6546g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f6541b);
        parcel.writeString(this.f6542c);
        parcel.writeString(this.f6543d);
        parcel.writeString(this.f6544e);
        x0.g1(parcel, this.f6545f);
        parcel.writeInt(this.f6546g);
    }
}
