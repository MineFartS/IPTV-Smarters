package c.f.a.c.k.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class la extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<la> CREATOR = new ma();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f14071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f14073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f14074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f14075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f14076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f14077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f14078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f14079k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f14080l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f14081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f14082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f14083o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final Boolean s;
    public final long t;
    public final List<String> u;
    public final String v;
    public final String w;

    public la(String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, boolean z, boolean z2, String str6, long j5, long j6, int i2, boolean z3, boolean z4, String str7, Boolean bool, long j7, List<String> list, String str8, String str9) {
        c.f.a.c.f.q.o.e(str);
        this.f14070b = str;
        this.f14071c = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f14072d = str3;
        this.f14079k = j2;
        this.f14073e = str4;
        this.f14074f = j3;
        this.f14075g = j4;
        this.f14076h = str5;
        this.f14077i = z;
        this.f14078j = z2;
        this.f14080l = str6;
        this.f14081m = j5;
        this.f14082n = j6;
        this.f14083o = i2;
        this.p = z3;
        this.q = z4;
        this.r = str7;
        this.s = bool;
        this.t = j7;
        this.u = list;
        this.v = str8;
        this.w = str9;
    }

    public la(String str, String str2, String str3, String str4, long j2, long j3, String str5, boolean z, boolean z2, long j4, String str6, long j5, long j6, int i2, boolean z3, boolean z4, String str7, Boolean bool, long j7, List<String> list, String str8, String str9) {
        this.f14070b = str;
        this.f14071c = str2;
        this.f14072d = str3;
        this.f14079k = j4;
        this.f14073e = str4;
        this.f14074f = j2;
        this.f14075g = j3;
        this.f14076h = str5;
        this.f14077i = z;
        this.f14078j = z2;
        this.f14080l = str6;
        this.f14081m = j5;
        this.f14082n = j6;
        this.f14083o = i2;
        this.p = z3;
        this.q = z4;
        this.r = str7;
        this.s = bool;
        this.t = j7;
        this.u = list;
        this.v = str8;
        this.w = str9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.s(parcel, 2, this.f14070b, false);
        c.f.a.c.f.q.w.c.s(parcel, 3, this.f14071c, false);
        c.f.a.c.f.q.w.c.s(parcel, 4, this.f14072d, false);
        c.f.a.c.f.q.w.c.s(parcel, 5, this.f14073e, false);
        c.f.a.c.f.q.w.c.o(parcel, 6, this.f14074f);
        c.f.a.c.f.q.w.c.o(parcel, 7, this.f14075g);
        c.f.a.c.f.q.w.c.s(parcel, 8, this.f14076h, false);
        c.f.a.c.f.q.w.c.c(parcel, 9, this.f14077i);
        c.f.a.c.f.q.w.c.c(parcel, 10, this.f14078j);
        c.f.a.c.f.q.w.c.o(parcel, 11, this.f14079k);
        c.f.a.c.f.q.w.c.s(parcel, 12, this.f14080l, false);
        c.f.a.c.f.q.w.c.o(parcel, 13, this.f14081m);
        c.f.a.c.f.q.w.c.o(parcel, 14, this.f14082n);
        c.f.a.c.f.q.w.c.l(parcel, 15, this.f14083o);
        c.f.a.c.f.q.w.c.c(parcel, 16, this.p);
        c.f.a.c.f.q.w.c.c(parcel, 18, this.q);
        c.f.a.c.f.q.w.c.s(parcel, 19, this.r, false);
        c.f.a.c.f.q.w.c.d(parcel, 21, this.s, false);
        c.f.a.c.f.q.w.c.o(parcel, 22, this.t);
        c.f.a.c.f.q.w.c.u(parcel, 23, this.u, false);
        c.f.a.c.f.q.w.c.s(parcel, 24, this.v, false);
        c.f.a.c.f.q.w.c.s(parcel, 25, this.w, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
