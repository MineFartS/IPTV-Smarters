package c.f.a.c.k.b;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public aa f13739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f13742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f13743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f13744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t f13745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f13746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f13747l;

    public b(b bVar) {
        c.f.a.c.f.q.o.i(bVar);
        this.f13737b = bVar.f13737b;
        this.f13738c = bVar.f13738c;
        this.f13739d = bVar.f13739d;
        this.f13740e = bVar.f13740e;
        this.f13741f = bVar.f13741f;
        this.f13742g = bVar.f13742g;
        this.f13743h = bVar.f13743h;
        this.f13744i = bVar.f13744i;
        this.f13745j = bVar.f13745j;
        this.f13746k = bVar.f13746k;
        this.f13747l = bVar.f13747l;
    }

    public b(String str, String str2, aa aaVar, long j2, boolean z, String str3, t tVar, long j3, t tVar2, long j4, t tVar3) {
        this.f13737b = str;
        this.f13738c = str2;
        this.f13739d = aaVar;
        this.f13740e = j2;
        this.f13741f = z;
        this.f13742g = str3;
        this.f13743h = tVar;
        this.f13744i = j3;
        this.f13745j = tVar2;
        this.f13746k = j4;
        this.f13747l = tVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.s(parcel, 2, this.f13737b, false);
        c.f.a.c.f.q.w.c.s(parcel, 3, this.f13738c, false);
        c.f.a.c.f.q.w.c.r(parcel, 4, this.f13739d, i2, false);
        c.f.a.c.f.q.w.c.o(parcel, 5, this.f13740e);
        c.f.a.c.f.q.w.c.c(parcel, 6, this.f13741f);
        c.f.a.c.f.q.w.c.s(parcel, 7, this.f13742g, false);
        c.f.a.c.f.q.w.c.r(parcel, 8, this.f13743h, i2, false);
        c.f.a.c.f.q.w.c.o(parcel, 9, this.f13744i);
        c.f.a.c.f.q.w.c.r(parcel, 10, this.f13745j, i2, false);
        c.f.a.c.f.q.w.c.o(parcel, 11, this.f13746k);
        c.f.a.c.f.q.w.c.r(parcel, 12, this.f13747l, i2, false);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
