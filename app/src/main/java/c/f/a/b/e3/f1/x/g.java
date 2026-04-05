package c.f.a.b.e3.f1.x;

import android.net.Uri;
import c.f.a.b.c3.i0;
import c.f.a.b.x2.w;
import c.f.b.b.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f7420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f7421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f7422k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7423l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f7424m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f7425n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f7426o;
    public final boolean p;
    public final w q;
    public final List<d> r;
    public final List<b> s;
    public final Map<Uri, c> t;
    public final long u;
    public final f v;

    public static final class b extends e {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f7427m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f7428n;

        public b(String str, d dVar, long j2, int i2, long j3, w wVar, String str2, String str3, long j4, long j5, boolean z, boolean z2, boolean z3) {
            super(str, dVar, j2, i2, j3, wVar, str2, str3, j4, j5, z);
            this.f7427m = z2;
            this.f7428n = z3;
        }

        public b b(long j2, int i2) {
            return new b(this.f7434b, this.f7435c, this.f7436d, i2, j2, this.f7439g, this.f7440h, this.f7441i, this.f7442j, this.f7443k, this.f7444l, this.f7427m, this.f7428n);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f7429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7431c;

        public c(Uri uri, long j2, int i2) {
            this.f7429a = uri;
            this.f7430b = j2;
            this.f7431c = i2;
        }
    }

    public static final class d extends e {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final String f7432m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final List<b> f7433n;

        public d(String str, long j2, long j3, String str2, String str3) {
            this(str, null, BuildConfig.FLAVOR, 0L, -1, -9223372036854775807L, null, str2, str3, j2, j3, false, t.J());
        }

        public d(String str, d dVar, String str2, long j2, int i2, long j3, w wVar, String str3, String str4, long j4, long j5, boolean z, List<b> list) {
            super(str, dVar, j2, i2, j3, wVar, str3, str4, j4, j5, z);
            this.f7432m = str2;
            this.f7433n = t.D(list);
        }

        public d b(long j2, int i2) {
            ArrayList arrayList = new ArrayList();
            long j3 = j2;
            for (int i3 = 0; i3 < this.f7433n.size(); i3++) {
                b bVar = this.f7433n.get(i3);
                arrayList.add(bVar.b(j3, i2));
                j3 += bVar.f7436d;
            }
            return new d(this.f7434b, this.f7435c, this.f7432m, this.f7436d, i2, j2, this.f7439g, this.f7440h, this.f7441i, this.f7442j, this.f7443k, this.f7444l, arrayList);
        }
    }

    public static class e implements Comparable<Long> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f7434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f7435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f7436d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f7437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f7438f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final w f7439g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f7440h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f7441i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f7442j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final long f7443k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f7444l;

        public e(String str, d dVar, long j2, int i2, long j3, w wVar, String str2, String str3, long j4, long j5, boolean z) {
            this.f7434b = str;
            this.f7435c = dVar;
            this.f7436d = j2;
            this.f7437e = i2;
            this.f7438f = j3;
            this.f7439g = wVar;
            this.f7440h = str2;
            this.f7441i = str3;
            this.f7442j = j4;
            this.f7443k = j5;
            this.f7444l = z;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l2) {
            if (this.f7438f > l2.longValue()) {
                return 1;
            }
            return this.f7438f < l2.longValue() ? -1 : 0;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f7446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f7447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f7448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f7449e;

        public f(long j2, boolean z, long j3, long j4, boolean z2) {
            this.f7445a = j2;
            this.f7446b = z;
            this.f7447c = j3;
            this.f7448d = j4;
            this.f7449e = z2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(int r11, java.lang.String r12, java.util.List<java.lang.String> r13, long r14, boolean r16, long r17, boolean r19, int r20, long r21, int r23, long r24, long r26, boolean r28, boolean r29, boolean r30, c.f.a.b.x2.w r31, java.util.List<c.f.a.b.e3.f1.x.g.d> r32, java.util.List<c.f.a.b.e3.f1.x.g.b> r33, c.f.a.b.e3.f1.x.g.f r34, java.util.Map<android.net.Uri, c.f.a.b.e3.f1.x.g.c> r35) {
        /*
            r10 = this;
            r0 = r10
            r1 = r14
            r3 = r12
            r4 = r13
            r5 = r28
            r10.<init>(r12, r13, r5)
            r3 = r11
            r0.f7415d = r3
            r3 = r17
            r0.f7419h = r3
            r3 = r16
            r0.f7418g = r3
            r3 = r19
            r0.f7420i = r3
            r3 = r20
            r0.f7421j = r3
            r3 = r21
            r0.f7422k = r3
            r3 = r23
            r0.f7423l = r3
            r3 = r24
            r0.f7424m = r3
            r3 = r26
            r0.f7425n = r3
            r3 = r29
            r0.f7426o = r3
            r3 = r30
            r0.p = r3
            r3 = r31
            r0.q = r3
            c.f.b.b.t r3 = c.f.b.b.t.D(r32)
            r0.r = r3
            c.f.b.b.t r3 = c.f.b.b.t.D(r33)
            r0.s = r3
            c.f.b.b.v r3 = c.f.b.b.v.d(r35)
            r0.t = r3
            boolean r3 = r33.isEmpty()
            r4 = 0
            if (r3 != 0) goto L60
            java.lang.Object r3 = c.f.b.b.y.c(r33)
            c.f.a.b.e3.f1.x.g$b r3 = (c.f.a.b.e3.f1.x.g.b) r3
        L58:
            long r6 = r3.f7438f
            long r8 = r3.f7436d
            long r6 = r6 + r8
            r0.u = r6
            goto L6f
        L60:
            boolean r3 = r32.isEmpty()
            if (r3 != 0) goto L6d
            java.lang.Object r3 = c.f.b.b.y.c(r32)
            c.f.a.b.e3.f1.x.g$d r3 = (c.f.a.b.e3.f1.x.g.d) r3
            goto L58
        L6d:
            r0.u = r4
        L6f:
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L79
            goto L89
        L79:
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            long r6 = r0.u
            if (r3 < 0) goto L84
            long r6 = java.lang.Math.min(r6, r14)
            goto L89
        L84:
            long r6 = r6 + r1
            long r6 = java.lang.Math.max(r4, r6)
        L89:
            r0.f7416e = r6
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 < 0) goto L91
            r1 = 1
            goto L92
        L91:
            r1 = 0
        L92:
            r0.f7417f = r1
            r1 = r34
            r0.v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.f1.x.g.<init>(int, java.lang.String, java.util.List, long, boolean, long, boolean, int, long, int, long, long, boolean, boolean, boolean, c.f.a.b.x2.w, java.util.List, java.util.List, c.f.a.b.e3.f1.x.g$f, java.util.Map):void");
    }

    @Override // c.f.a.b.c3.e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g a(List<i0> list) {
        return this;
    }

    public g c(long j2, int i2) {
        return new g(this.f7415d, this.f7450a, this.f7451b, this.f7416e, this.f7418g, j2, true, i2, this.f7422k, this.f7423l, this.f7424m, this.f7425n, this.f7452c, this.f7426o, this.p, this.q, this.r, this.s, this.v, this.t);
    }

    public g d() {
        return this.f7426o ? this : new g(this.f7415d, this.f7450a, this.f7451b, this.f7416e, this.f7418g, this.f7419h, this.f7420i, this.f7421j, this.f7422k, this.f7423l, this.f7424m, this.f7425n, this.f7452c, true, this.p, this.q, this.r, this.s, this.v, this.t);
    }

    public long e() {
        return this.f7419h + this.u;
    }

    public boolean f(g gVar) {
        if (gVar == null) {
            return true;
        }
        long j2 = this.f7422k;
        long j3 = gVar.f7422k;
        if (j2 > j3) {
            return true;
        }
        if (j2 < j3) {
            return false;
        }
        int size = this.r.size() - gVar.r.size();
        if (size != 0) {
            return size > 0;
        }
        int size2 = this.s.size();
        int size3 = gVar.s.size();
        if (size2 <= size3) {
            return size2 == size3 && this.f7426o && !gVar.f7426o;
        }
        return true;
    }
}
