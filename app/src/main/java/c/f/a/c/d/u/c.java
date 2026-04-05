package c.f.a.c.d.u;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.f.a.c.d.u.u.a;
import c.f.a.c.j.c.d1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class c extends c.f.a.c.f.q.w.a {
    public static final Parcelable.Creator<c> CREATOR = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<String> f11798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.f.a.c.d.h f11800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.f.a.c.d.u.u.a f11802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f11804i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f11805j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f11806a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f11808c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<String> f11807b = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c.f.a.c.d.h f11809d = new c.f.a.c.d.h();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f11810e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public d1<c.f.a.c.d.u.u.a> f11811f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f11812g = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public double f11813h = 0.05000000074505806d;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f11814i = false;

        public final c a() {
            d1<c.f.a.c.d.u.u.a> d1Var = this.f11811f;
            return new c(this.f11806a, this.f11807b, this.f11808c, this.f11809d, this.f11810e, d1Var != null ? d1Var.b() : new a.C0153a().a(), this.f11812g, this.f11813h, false);
        }

        public final a b(c.f.a.c.d.u.u.a aVar) {
            this.f11811f = d1.a(aVar);
            return this;
        }

        public final a c(String str) {
            this.f11806a = str;
            return this;
        }
    }

    public c(String str, List<String> list, boolean z, c.f.a.c.d.h hVar, boolean z2, c.f.a.c.d.u.u.a aVar, boolean z3, double d2, boolean z4) {
        this.f11797b = TextUtils.isEmpty(str) ? BuildConfig.FLAVOR : str;
        int size = list == null ? 0 : list.size();
        ArrayList arrayList = new ArrayList(size);
        this.f11798c = arrayList;
        if (size > 0) {
            arrayList.addAll(list);
        }
        this.f11799d = z;
        this.f11800e = hVar == null ? new c.f.a.c.d.h() : hVar;
        this.f11801f = z2;
        this.f11802g = aVar;
        this.f11803h = z3;
        this.f11804i = d2;
        this.f11805j = z4;
    }

    public c.f.a.c.d.u.u.a I() {
        return this.f11802g;
    }

    public boolean J() {
        return this.f11803h;
    }

    public c.f.a.c.d.h K() {
        return this.f11800e;
    }

    public String L() {
        return this.f11797b;
    }

    public boolean M() {
        return this.f11801f;
    }

    public boolean N() {
        return this.f11799d;
    }

    public List<String> O() {
        return Collections.unmodifiableList(this.f11798c);
    }

    public double P() {
        return this.f11804i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iA = c.f.a.c.f.q.w.c.a(parcel);
        c.f.a.c.f.q.w.c.s(parcel, 2, L(), false);
        c.f.a.c.f.q.w.c.u(parcel, 3, O(), false);
        c.f.a.c.f.q.w.c.c(parcel, 4, N());
        c.f.a.c.f.q.w.c.r(parcel, 5, K(), i2, false);
        c.f.a.c.f.q.w.c.c(parcel, 6, M());
        c.f.a.c.f.q.w.c.r(parcel, 7, I(), i2, false);
        c.f.a.c.f.q.w.c.c(parcel, 8, J());
        c.f.a.c.f.q.w.c.g(parcel, 9, P());
        c.f.a.c.f.q.w.c.c(parcel, 10, this.f11805j);
        c.f.a.c.f.q.w.c.b(parcel, iA);
    }
}
