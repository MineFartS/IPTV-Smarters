package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.o.q;
import c.f.a.c.f.q.o;
import c.f.a.c.f.q.w.a;
import c.f.a.c.f.q.w.c;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class Scope extends a implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<Scope> CREATOR = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24229c;

    public Scope(int i2, String str) {
        o.f(str, "scopeUri must not be null or empty");
        this.f24228b = i2;
        this.f24229c = str;
    }

    public Scope(@RecentlyNonNull String str) {
        this(1, str);
    }

    @RecentlyNonNull
    public String I() {
        return this.f24229c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f24229c.equals(((Scope) obj).f24229c);
        }
        return false;
    }

    public int hashCode() {
        return this.f24229c.hashCode();
    }

    @RecentlyNonNull
    public String toString() {
        return this.f24229c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int iA = c.a(parcel);
        c.l(parcel, 1, this.f24228b);
        c.s(parcel, 2, I(), false);
        c.b(parcel, iA);
    }
}
