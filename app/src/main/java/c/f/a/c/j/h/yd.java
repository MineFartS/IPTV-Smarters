package c.f.a.c.j.h;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class yd extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<yd> CREATOR = new zd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bundle f13679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f13680i;

    public yd(long j2, long j3, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f13673b = j2;
        this.f13674c = j3;
        this.f13675d = z;
        this.f13676e = str;
        this.f13677f = str2;
        this.f13678g = str3;
        this.f13679h = bundle;
        this.f13680i = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.o(parcel, 1, this.f13673b);
        c.f.a.c.f.q.w.c.o(parcel, 2, this.f13674c);
        c.f.a.c.f.q.w.c.c(parcel, 3, this.f13675d);
        c.f.a.c.f.q.w.c.s(parcel, 4, this.f13676e, false);
        c.f.a.c.f.q.w.c.s(parcel, 5, this.f13677f, false);
        c.f.a.c.f.q.w.c.s(parcel, 6, this.f13678g, false);
        c.f.a.c.f.q.w.c.e(parcel, 7, this.f13679h, false);
        c.f.a.c.f.q.w.c.s(parcel, 8, this.f13680i, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
