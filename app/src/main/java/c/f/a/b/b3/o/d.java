package c.f.a.b.b3.o;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends c.f.a.b.b3.o.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f6622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<b> f6624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f6625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f6626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6628m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6629n;

    public static class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i2) {
            return new d[i2];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6632c;

        public b(int i2, long j2, long j3) {
            this.f6630a = i2;
            this.f6631b = j2;
            this.f6632c = j3;
        }

        public /* synthetic */ b(int i2, long j2, long j3, a aVar) {
            this(i2, j2, j3);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f6630a);
            parcel.writeLong(this.f6631b);
            parcel.writeLong(this.f6632c);
        }
    }

    public d(long j2, boolean z, boolean z2, boolean z3, boolean z4, long j3, long j4, List<b> list, boolean z5, long j5, int i2, int i3, int i4) {
        this.f6617b = j2;
        this.f6618c = z;
        this.f6619d = z2;
        this.f6620e = z3;
        this.f6621f = z4;
        this.f6622g = j3;
        this.f6623h = j4;
        this.f6624i = Collections.unmodifiableList(list);
        this.f6625j = z5;
        this.f6626k = j5;
        this.f6627l = i2;
        this.f6628m = i3;
        this.f6629n = i4;
    }

    public d(Parcel parcel) {
        this.f6617b = parcel.readLong();
        this.f6618c = parcel.readByte() == 1;
        this.f6619d = parcel.readByte() == 1;
        this.f6620e = parcel.readByte() == 1;
        this.f6621f = parcel.readByte() == 1;
        this.f6622g = parcel.readLong();
        this.f6623h = parcel.readLong();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(b.a(parcel));
        }
        this.f6624i = Collections.unmodifiableList(arrayList);
        this.f6625j = parcel.readByte() == 1;
        this.f6626k = parcel.readLong();
        this.f6627l = parcel.readInt();
        this.f6628m = parcel.readInt();
        this.f6629n = parcel.readInt();
    }

    public /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static d b(i0 i0Var, long j2, u0 u0Var) {
        List list;
        boolean z;
        boolean z2;
        long j3;
        boolean z3;
        long j4;
        int iJ;
        int iD;
        int iD2;
        boolean z4;
        boolean z5;
        long jF;
        long jF2 = i0Var.F();
        boolean z6 = (i0Var.D() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z6) {
            list = listEmptyList;
            z = false;
            z2 = false;
            j3 = -9223372036854775807L;
            z3 = false;
            j4 = -9223372036854775807L;
            iJ = 0;
            iD = 0;
            iD2 = 0;
            z4 = false;
        } else {
            int iD3 = i0Var.D();
            boolean z7 = (iD3 & 128) != 0;
            boolean z8 = (iD3 & 64) != 0;
            boolean z9 = (iD3 & 32) != 0;
            boolean z10 = (iD3 & 16) != 0;
            long jC = (!z8 || z10) ? -9223372036854775807L : g.c(i0Var, j2);
            if (!z8) {
                int iD4 = i0Var.D();
                ArrayList arrayList = new ArrayList(iD4);
                for (int i2 = 0; i2 < iD4; i2++) {
                    int iD5 = i0Var.D();
                    long jC2 = !z10 ? g.c(i0Var, j2) : -9223372036854775807L;
                    arrayList.add(new b(iD5, jC2, u0Var.b(jC2), null));
                }
                listEmptyList = arrayList;
            }
            if (z9) {
                long jD = i0Var.D();
                boolean z11 = (128 & jD) != 0;
                jF = ((((jD & 1) << 32) | i0Var.F()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                jF = -9223372036854775807L;
            }
            iJ = i0Var.J();
            z4 = z8;
            iD = i0Var.D();
            iD2 = i0Var.D();
            list = listEmptyList;
            long j5 = jC;
            z3 = z5;
            j4 = jF;
            z2 = z10;
            z = z7;
            j3 = j5;
        }
        return new d(jF2, z6, z, z4, z2, j3, u0Var.b(j3), list, z3, j4, iJ, iD, iD2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f6617b);
        parcel.writeByte(this.f6618c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6619d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6620e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6621f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f6622g);
        parcel.writeLong(this.f6623h);
        int size = this.f6624i.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            this.f6624i.get(i3).b(parcel);
        }
        parcel.writeByte(this.f6625j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f6626k);
        parcel.writeInt(this.f6627l);
        parcel.writeInt(this.f6628m);
        parcel.writeInt(this.f6629n);
    }
}
