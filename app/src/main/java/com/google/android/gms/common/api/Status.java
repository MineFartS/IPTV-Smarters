package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.f.a.c.f.b;
import c.f.a.c.f.o.d;
import c.f.a.c.f.o.j;
import c.f.a.c.f.o.r;
import c.f.a.c.f.q.n;
import c.f.a.c.f.q.w.a;
import c.f.a.c.f.q.w.c;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class Status extends a implements j, ReflectedParcelable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f24237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f24238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f24239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PendingIntent f24240l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f24241m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RecentlyNonNull
    public static final Status f24230b = new Status(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @RecentlyNonNull
    public static final Status f24231c = new Status(14);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @RecentlyNonNull
    public static final Status f24232d = new Status(8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @RecentlyNonNull
    public static final Status f24233e = new Status(15);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @RecentlyNonNull
    public static final Status f24234f = new Status(16);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @RecentlyNonNull
    public static final Status f24236h = new Status(17);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @RecentlyNonNull
    public static final Status f24235g = new Status(18);

    @RecentlyNonNull
    public static final Parcelable.Creator<Status> CREATOR = new r();

    public Status(int i2) {
        this(i2, (String) null);
    }

    public Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this(i2, i3, str, pendingIntent, null);
    }

    public Status(int i2, int i3, String str, PendingIntent pendingIntent, b bVar) {
        this.f24237i = i2;
        this.f24238j = i3;
        this.f24239k = str;
        this.f24240l = pendingIntent;
        this.f24241m = bVar;
    }

    public Status(int i2, String str) {
        this(1, i2, str, null);
    }

    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(1, i2, str, pendingIntent);
    }

    public Status(@RecentlyNonNull b bVar, @RecentlyNonNull String str) {
        this(bVar, str, 17);
    }

    @Deprecated
    public Status(@RecentlyNonNull b bVar, @RecentlyNonNull String str, int i2) {
        this(1, i2, str, bVar.K(), bVar);
    }

    @Override // c.f.a.c.f.o.j
    @RecentlyNonNull
    public Status C() {
        return this;
    }

    @RecentlyNullable
    public b I() {
        return this.f24241m;
    }

    public int J() {
        return this.f24238j;
    }

    @RecentlyNullable
    public String K() {
        return this.f24239k;
    }

    public boolean L() {
        return this.f24240l != null;
    }

    public boolean M() {
        return this.f24238j <= 0;
    }

    @RecentlyNonNull
    public final String N() {
        String str = this.f24239k;
        return str != null ? str : d.a(this.f24238j);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f24237i == status.f24237i && this.f24238j == status.f24238j && n.a(this.f24239k, status.f24239k) && n.a(this.f24240l, status.f24240l) && n.a(this.f24241m, status.f24241m);
    }

    public int hashCode() {
        return n.b(Integer.valueOf(this.f24237i), Integer.valueOf(this.f24238j), this.f24239k, this.f24240l, this.f24241m);
    }

    @RecentlyNonNull
    public String toString() {
        n.a aVarC = n.c(this);
        aVarC.a("statusCode", N());
        aVarC.a("resolution", this.f24240l);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = c.a(parcel);
        c.l(parcel, 1, J());
        c.s(parcel, 2, K(), false);
        c.r(parcel, 3, this.f24240l, i2, false);
        c.r(parcel, 4, I(), i2, false);
        c.l(parcel, 1000, this.f24237i);
        c.b(parcel, iA);
    }
}
