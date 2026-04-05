package c.f.a.b.b3.o;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.u0;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6648c;

    public static class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i2) {
            return new g[i2];
        }
    }

    public g(long j2, long j3) {
        this.f6647b = j2;
        this.f6648c = j3;
    }

    public /* synthetic */ g(long j2, long j3, a aVar) {
        this(j2, j3);
    }

    public static g b(i0 i0Var, long j2, u0 u0Var) {
        long jC = c(i0Var, j2);
        return new g(jC, u0Var.b(jC));
    }

    public static long c(i0 i0Var, long j2) {
        long jD = i0Var.D();
        if ((128 & jD) != 0) {
            return 8589934591L & ((((jD & 1) << 32) | i0Var.F()) + j2);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f6647b);
        parcel.writeLong(this.f6648c);
    }
}
