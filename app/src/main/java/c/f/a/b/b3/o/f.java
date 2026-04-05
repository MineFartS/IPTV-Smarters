package c.f.a.b.b3.o;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.j3.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends c.f.a.b.b3.o.b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f6633b;

    public static class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i2) {
            return new f[i2];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6635b;

        public b(int i2, long j2) {
            this.f6634a = i2;
            this.f6635b = j2;
        }

        public /* synthetic */ b(int i2, long j2, a aVar) {
            this(i2, j2);
        }

        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        public final void d(Parcel parcel) {
            parcel.writeInt(this.f6634a);
            parcel.writeLong(this.f6635b);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f6638c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f6639d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f6640e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<b> f6641f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f6642g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f6643h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f6644i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f6645j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f6646k;

        public c(long j2, boolean z, boolean z2, boolean z3, List<b> list, long j3, boolean z4, long j4, int i2, int i3, int i4) {
            this.f6636a = j2;
            this.f6637b = z;
            this.f6638c = z2;
            this.f6639d = z3;
            this.f6641f = Collections.unmodifiableList(list);
            this.f6640e = j3;
            this.f6642g = z4;
            this.f6643h = j4;
            this.f6644i = i2;
            this.f6645j = i3;
            this.f6646k = i4;
        }

        public c(Parcel parcel) {
            this.f6636a = parcel.readLong();
            this.f6637b = parcel.readByte() == 1;
            this.f6638c = parcel.readByte() == 1;
            this.f6639d = parcel.readByte() == 1;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(b.c(parcel));
            }
            this.f6641f = Collections.unmodifiableList(arrayList);
            this.f6640e = parcel.readLong();
            this.f6642g = parcel.readByte() == 1;
            this.f6643h = parcel.readLong();
            this.f6644i = parcel.readInt();
            this.f6645j = parcel.readInt();
            this.f6646k = parcel.readInt();
        }

        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        public static c e(i0 i0Var) {
            ArrayList arrayList;
            boolean z;
            long j2;
            boolean z2;
            long j3;
            int i2;
            int i3;
            int iD;
            boolean z3;
            boolean z4;
            long jF;
            long jF2 = i0Var.F();
            boolean z5 = (i0Var.D() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z5) {
                arrayList = arrayList2;
                z = false;
                j2 = -9223372036854775807L;
                z2 = false;
                j3 = -9223372036854775807L;
                i2 = 0;
                i3 = 0;
                iD = 0;
                z3 = false;
            } else {
                int iD2 = i0Var.D();
                boolean z6 = (iD2 & 128) != 0;
                boolean z7 = (iD2 & 64) != 0;
                boolean z8 = (iD2 & 32) != 0;
                long jF3 = z7 ? i0Var.F() : -9223372036854775807L;
                if (!z7) {
                    int iD3 = i0Var.D();
                    ArrayList arrayList3 = new ArrayList(iD3);
                    for (int i4 = 0; i4 < iD3; i4++) {
                        arrayList3.add(new b(i0Var.D(), i0Var.F(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long jD = i0Var.D();
                    boolean z9 = (128 & jD) != 0;
                    jF = ((((jD & 1) << 32) | i0Var.F()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    jF = -9223372036854775807L;
                }
                int iJ = i0Var.J();
                int iD4 = i0Var.D();
                z3 = z7;
                iD = i0Var.D();
                j3 = jF;
                arrayList = arrayList2;
                long j4 = jF3;
                i2 = iJ;
                i3 = iD4;
                j2 = j4;
                boolean z10 = z6;
                z2 = z4;
                z = z10;
            }
            return new c(jF2, z5, z, z3, arrayList, j2, z2, j3, i2, i3, iD);
        }

        public final void f(Parcel parcel) {
            parcel.writeLong(this.f6636a);
            parcel.writeByte(this.f6637b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f6638c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f6639d ? (byte) 1 : (byte) 0);
            int size = this.f6641f.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                this.f6641f.get(i2).d(parcel);
            }
            parcel.writeLong(this.f6640e);
            parcel.writeByte(this.f6642g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f6643h);
            parcel.writeInt(this.f6644i);
            parcel.writeInt(this.f6645j);
            parcel.writeInt(this.f6646k);
        }
    }

    public f(Parcel parcel) {
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(c.d(parcel));
        }
        this.f6633b = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    public f(List<c> list) {
        this.f6633b = Collections.unmodifiableList(list);
    }

    public static f b(i0 i0Var) {
        int iD = i0Var.D();
        ArrayList arrayList = new ArrayList(iD);
        for (int i2 = 0; i2 < iD; i2++) {
            arrayList.add(c.e(i0Var));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int size = this.f6633b.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.f6633b.get(i3).f(parcel);
        }
    }
}
