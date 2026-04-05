package c.f.a.b.b3.n;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.b3.a;
import c.f.a.b.b3.n.d;
import c.f.a.b.j3.g;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.q1;
import c.f.b.a.h;
import c.f.b.b.n;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements a.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b> f6604b;

    public static class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new d(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i2) {
            return new d[i2];
        }
    }

    public static final class b implements Parcelable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f6607d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f6608e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Comparator<b> f6605b = new Comparator() { // from class: c.f.a.b.b3.n.a
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                d.b bVar = (d.b) obj;
                d.b bVar2 = (d.b) obj2;
                return n.j().e(bVar.f6606c, bVar2.f6606c).e(bVar.f6607d, bVar2.f6607d).d(bVar.f6608e, bVar2.f6608e).i();
            }
        };
        public static final Parcelable.Creator<b> CREATOR = new a();

        public static class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i2) {
                return new b[i2];
            }
        }

        public b(long j2, long j3, int i2) {
            g.a(j2 < j3);
            this.f6606c = j2;
            this.f6607d = j3;
            this.f6608e = i2;
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
            return this.f6606c == bVar.f6606c && this.f6607d == bVar.f6607d && this.f6608e == bVar.f6608e;
        }

        public int hashCode() {
            return h.b(Long.valueOf(this.f6606c), Long.valueOf(this.f6607d), Integer.valueOf(this.f6608e));
        }

        public String toString() {
            return x0.D("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f6606c), Long.valueOf(this.f6607d), Integer.valueOf(this.f6608e));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.f6606c);
            parcel.writeLong(this.f6607d);
            parcel.writeInt(this.f6608e);
        }
    }

    public d(List<b> list) {
        this.f6604b = list;
        g.a(!b(list));
    }

    public static boolean b(List<b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j2 = list.get(0).f6607d;
        for (int i2 = 1; i2 < list.size(); i2++) {
            if (list.get(i2).f6606c < j2) {
                return true;
            }
            j2 = list.get(i2).f6607d;
        }
        return false;
    }

    @Override // android.os.Parcelable
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
        return this.f6604b.equals(((d) obj).f6604b);
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
        return this.f6604b.hashCode();
    }

    @Override // c.f.a.b.b3.a.b
    public /* synthetic */ void populateMediaMetadata(q1.b bVar) {
        c.f.a.b.b3.b.c(this, bVar);
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f6604b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.f6604b);
    }
}
