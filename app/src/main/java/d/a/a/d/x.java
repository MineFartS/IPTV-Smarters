package d.a.a.d;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedList<c> f30198b = new LinkedList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedList<c> f30199c = new LinkedList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinkedList<c> f30200d = new LinkedList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f30201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f30202f;

    public static class a implements Parcelable.Creator<x> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public x createFromParcel(Parcel parcel) {
            return new x(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public x[] newArray(int i2) {
            return new x[i2];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f30203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f30204b;

        public b(c cVar, c cVar2) {
            this.f30204b = cVar;
            this.f30203a = cVar2;
        }

        public /* synthetic */ b(c cVar, c cVar2, a aVar) {
            this(cVar, cVar2);
        }

        public long a() {
            return Math.max(0L, this.f30203a.f30206c - this.f30204b.f30206c);
        }

        public long b() {
            return Math.max(0L, this.f30203a.f30207d - this.f30204b.f30207d);
        }

        public long c() {
            return this.f30203a.f30206c;
        }

        public long d() {
            return this.f30203a.f30207d;
        }
    }

    public static class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f30205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f30206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f30207d;

        public static class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i2) {
                return new c[i2];
            }
        }

        public c(long j2, long j3, long j4) {
            this.f30206c = j2;
            this.f30207d = j3;
            this.f30205b = j4;
        }

        public /* synthetic */ c(long j2, long j3, long j4, a aVar) {
            this(j2, j3, j4);
        }

        public c(Parcel parcel) {
            this.f30205b = parcel.readLong();
            this.f30206c = parcel.readLong();
            this.f30207d = parcel.readLong();
        }

        public /* synthetic */ c(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.f30205b);
            parcel.writeLong(this.f30206c);
            parcel.writeLong(this.f30207d);
        }
    }

    public x() {
    }

    public x(Parcel parcel) {
        parcel.readList(this.f30198b, x.class.getClassLoader());
        parcel.readList(this.f30199c, x.class.getClassLoader());
        parcel.readList(this.f30200d, x.class.getClassLoader());
        this.f30201e = (c) parcel.readParcelable(x.class.getClassLoader());
        this.f30202f = (c) parcel.readParcelable(x.class.getClassLoader());
    }

    public b b(long j2, long j3) {
        c cVar = new c(j2, j3, System.currentTimeMillis(), null);
        b bVarD = d(cVar);
        c(cVar);
        return bVarD;
    }

    public final void c(c cVar) {
        this.f30198b.add(cVar);
        if (this.f30201e == null) {
            this.f30201e = new c(0L, 0L, 0L, null);
            this.f30202f = new c(0L, 0L, 0L, null);
        }
        e(cVar, true);
    }

    public b d(c cVar) {
        c cVar2 = this.f30198b.size() == 0 ? new c(0L, 0L, System.currentTimeMillis(), null) : this.f30198b.getLast();
        if (cVar == null) {
            if (this.f30198b.size() < 2) {
                cVar = cVar2;
            } else {
                this.f30198b.descendingIterator().next();
                cVar = this.f30198b.descendingIterator().next();
            }
        }
        return new b(cVar2, cVar, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e(c cVar, boolean z) {
        long j2;
        LinkedList<c> linkedList;
        LinkedList<c> linkedList2;
        c cVar2;
        HashSet hashSet = new HashSet();
        new Vector();
        if (z) {
            j2 = 60000;
            linkedList = this.f30198b;
            linkedList2 = this.f30199c;
            cVar2 = this.f30201e;
        } else {
            j2 = 3600000;
            linkedList = this.f30199c;
            linkedList2 = this.f30200d;
            cVar2 = this.f30202f;
        }
        if (cVar.f30205b / j2 > cVar2.f30205b / j2) {
            linkedList2.add(cVar);
            if (z) {
                this.f30201e = cVar;
                e(cVar, false);
            } else {
                this.f30202f = cVar;
            }
            for (c cVar3 : linkedList) {
                if ((cVar.f30205b - cVar3.f30205b) / j2 >= 5) {
                    hashSet.add(cVar3);
                }
            }
            linkedList.removeAll(hashSet);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.f30198b);
        parcel.writeList(this.f30199c);
        parcel.writeList(this.f30200d);
        parcel.writeParcelable(this.f30201e, 0);
        parcel.writeParcelable(this.f30202f, 0);
    }
}
