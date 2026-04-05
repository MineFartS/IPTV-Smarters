package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes.dex */
@Hide
public final class apa extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<apa> CREATOR = new apc(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20329c;

    @Hide
    public apa(String str, int i2, String str2) {
        this.f20327a = str;
        this.f20328b = i2;
        this.f20329c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.s(parcel, 1, this.f20327a, false);
        c.f.a.c.f.q.w.c.l(parcel, 2, this.f20328b);
        c.f.a.c.f.q.w.c.s(parcel, 3, this.f20329c, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
