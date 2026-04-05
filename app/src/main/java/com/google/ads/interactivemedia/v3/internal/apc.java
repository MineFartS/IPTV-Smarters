package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Hide;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@Hide
public final class apc implements Parcelable.Creator<apb> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f20331a;

    public apc() {
    }

    public apc(int i2) {
        this.f20331a = i2;
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.google.ads.interactivemedia.v3.internal.apa, com.google.ads.interactivemedia.v3.internal.apb] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ apb createFromParcel(Parcel parcel) {
        String strF = null;
        if (this.f20331a == 0) {
            int iA = c.f.a.c.f.q.w.b.A(parcel);
            while (parcel.dataPosition() < iA) {
                int iS = c.f.a.c.f.q.w.b.s(parcel);
                if (c.f.a.c.f.q.w.b.l(iS) != 1) {
                    c.f.a.c.f.q.w.b.z(parcel, iS);
                } else {
                    strF = c.f.a.c.f.q.w.b.f(parcel, iS);
                }
            }
            c.f.a.c.f.q.w.b.k(parcel, iA);
            return new apb(strF);
        }
        int iA2 = c.f.a.c.f.q.w.b.A(parcel);
        int iU = 0;
        String strF2 = BuildConfig.FLAVOR;
        while (parcel.dataPosition() < iA2) {
            int iS2 = c.f.a.c.f.q.w.b.s(parcel);
            int iL = c.f.a.c.f.q.w.b.l(iS2);
            if (iL == 1) {
                strF = c.f.a.c.f.q.w.b.f(parcel, iS2);
            } else if (iL == 2) {
                iU = c.f.a.c.f.q.w.b.u(parcel, iS2);
            } else if (iL != 3) {
                c.f.a.c.f.q.w.b.z(parcel, iS2);
            } else {
                strF2 = c.f.a.c.f.q.w.b.f(parcel, iS2);
            }
        }
        c.f.a.c.f.q.w.b.k(parcel, iA2);
        return new apa(strF, iU, strF2);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.ads.interactivemedia.v3.internal.apa[], com.google.ads.interactivemedia.v3.internal.apb[]] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ apb[] newArray(int i2) {
        return this.f20331a != 0 ? new apa[i2] : new apb[i2];
    }
}
