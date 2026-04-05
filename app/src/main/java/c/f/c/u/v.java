package c.f.c.u;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class v implements Parcelable.Creator<u> {
    public static void c(u uVar, Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.e(parcel, 2, uVar.f16400b, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public u createFromParcel(Parcel parcel) {
        int iA = c.f.a.c.f.q.w.b.A(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iA) {
            int iS = c.f.a.c.f.q.w.b.s(parcel);
            if (c.f.a.c.f.q.w.b.l(iS) != 2) {
                c.f.a.c.f.q.w.b.z(parcel, iS);
            } else {
                bundleA = c.f.a.c.f.q.w.b.a(parcel, iS);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA);
        return new u(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u[] newArray(int i2) {
        return new u[i2];
    }
}
