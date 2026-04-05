package c.f.a.b.b3.o;

import android.os.Parcel;
import android.os.Parcelable;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0126a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f6613d;

    /* JADX INFO: renamed from: c.f.a.b.b3.o.a$a, reason: collision with other inner class name */
    public static class C0126a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i2) {
            return new a[i2];
        }
    }

    public a(long j2, byte[] bArr, long j3) {
        this.f6611b = j3;
        this.f6612c = j2;
        this.f6613d = bArr;
    }

    public a(Parcel parcel) {
        this.f6611b = parcel.readLong();
        this.f6612c = parcel.readLong();
        this.f6613d = (byte[]) x0.i(parcel.createByteArray());
    }

    public /* synthetic */ a(Parcel parcel, C0126a c0126a) {
        this(parcel);
    }

    public static a b(i0 i0Var, int i2, long j2) {
        long jF = i0Var.F();
        int i3 = i2 - 4;
        byte[] bArr = new byte[i3];
        i0Var.j(bArr, 0, i3);
        return new a(jF, bArr, j2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f6611b);
        parcel.writeLong(this.f6612c);
        parcel.writeByteArray(this.f6613d);
    }
}
