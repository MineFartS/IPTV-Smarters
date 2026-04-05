package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes.dex */
@Hide
public final class apb extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<apb> CREATOR = new apc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20330a;

    @Hide
    public apb(String str) {
        this.f20330a = str;
    }

    public final String a() {
        return this.f20330a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.s(parcel, 1, a(), false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
