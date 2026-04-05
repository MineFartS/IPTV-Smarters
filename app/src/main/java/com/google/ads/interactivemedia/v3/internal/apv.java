package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes.dex */
@Hide
public final class apv implements Parcelable.Creator<apu> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f20354a;

    public apv() {
    }

    public apv(int i2) {
        this.f20354a = i2;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [com.google.ads.interactivemedia.v3.internal.apt, com.google.ads.interactivemedia.v3.internal.apu] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ apu createFromParcel(Parcel parcel) {
        int iU = 0;
        byte[] bArrB = null;
        String strF = null;
        if (this.f20354a == 0) {
            int iA = c.f.a.c.f.q.w.b.A(parcel);
            while (parcel.dataPosition() < iA) {
                int iS = c.f.a.c.f.q.w.b.s(parcel);
                int iL = c.f.a.c.f.q.w.b.l(iS);
                if (iL == 1) {
                    iU = c.f.a.c.f.q.w.b.u(parcel, iS);
                } else if (iL != 2) {
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                } else {
                    bArrB = c.f.a.c.f.q.w.b.b(parcel, iS);
                }
            }
            c.f.a.c.f.q.w.b.k(parcel, iA);
            return new apu(iU, bArrB);
        }
        int iA2 = c.f.a.c.f.q.w.b.A(parcel);
        String strF2 = null;
        while (parcel.dataPosition() < iA2) {
            int iS2 = c.f.a.c.f.q.w.b.s(parcel);
            int iL2 = c.f.a.c.f.q.w.b.l(iS2);
            if (iL2 == 1) {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS2);
            } else if (iL2 == 2) {
                strF = c.f.a.c.f.q.w.b.f(parcel, iS2);
            } else if (iL2 != 3) {
                c.f.a.c.f.q.w.b.z(parcel, iS2);
            } else {
                strF2 = c.f.a.c.f.q.w.b.f(parcel, iS2);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA2);
        return new apt(iU, strF, strF2);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.ads.interactivemedia.v3.internal.apt[], com.google.ads.interactivemedia.v3.internal.apu[]] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ apu[] newArray(int i2) {
        return this.f20354a != 0 ? new apt[i2] : new apu[i2];
    }
}
