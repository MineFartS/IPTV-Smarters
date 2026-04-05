package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes.dex */
@Hide
public final class apt extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<apt> CREATOR = new apv(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20350c;

    public apt(int i2, String str, String str2) {
        this.f20348a = i2;
        this.f20349b = str;
        this.f20350c = str2;
    }

    public apt(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.l(parcel, 1, this.f20348a);
        c.f.a.c.f.q.w.c.s(parcel, 2, this.f20349b, false);
        c.f.a.c.f.q.w.c.s(parcel, 3, this.f20350c, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
