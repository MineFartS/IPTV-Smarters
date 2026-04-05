package k.g0.e;

import com.amazonaws.services.s3.Headers;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import k.a0;
import k.c0;
import k.g0.g.e;
import k.s;
import org.achartengine.chart.TimeChart;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final a0 f30578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final c0 f30579b;

    /* JADX INFO: loaded from: classes2.dex */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f30580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a0 f30581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c0 f30582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Date f30583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f30584e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Date f30585f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f30586g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Date f30587h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f30588i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f30589j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f30590k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f30591l;

        public a(long j2, a0 a0Var, c0 c0Var) {
            this.f30591l = -1;
            this.f30580a = j2;
            this.f30581b = a0Var;
            this.f30582c = c0Var;
            if (c0Var != null) {
                this.f30588i = c0Var.u();
                this.f30589j = c0Var.s();
                s sVarP = c0Var.p();
                int iF = sVarP.f();
                for (int i2 = 0; i2 < iF; i2++) {
                    String strC = sVarP.c(i2);
                    String strG = sVarP.g(i2);
                    if ("Date".equalsIgnoreCase(strC)) {
                        this.f30583d = k.g0.g.d.b(strG);
                        this.f30584e = strG;
                    } else if (Headers.EXPIRES.equalsIgnoreCase(strC)) {
                        this.f30587h = k.g0.g.d.b(strG);
                    } else if (Headers.LAST_MODIFIED.equalsIgnoreCase(strC)) {
                        this.f30585f = k.g0.g.d.b(strG);
                        this.f30586g = strG;
                    } else if (Headers.ETAG.equalsIgnoreCase(strC)) {
                        this.f30590k = strG;
                    } else if ("Age".equalsIgnoreCase(strC)) {
                        this.f30591l = e.d(strG, -1);
                    }
                }
            }
        }

        public static boolean e(a0 a0Var) {
            return (a0Var.c(Headers.GET_OBJECT_IF_MODIFIED_SINCE) == null && a0Var.c(Headers.GET_OBJECT_IF_NONE_MATCH) == null) ? false : true;
        }

        public final long a() {
            Date date = this.f30583d;
            long jMax = date != null ? Math.max(0L, this.f30589j - date.getTime()) : 0L;
            int i2 = this.f30591l;
            if (i2 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i2));
            }
            long j2 = this.f30589j;
            return jMax + (j2 - this.f30588i) + (this.f30580a - j2);
        }

        public final long b() {
            if (this.f30582c.i().d() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.d());
            }
            if (this.f30587h != null) {
                Date date = this.f30583d;
                long time = this.f30587h.getTime() - (date != null ? date.getTime() : this.f30589j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f30585f == null || this.f30582c.t().h().z() != null) {
                return 0L;
            }
            Date date2 = this.f30583d;
            long time2 = (date2 != null ? date2.getTime() : this.f30588i) - this.f30585f.getTime();
            if (time2 > 0) {
                return time2 / 10;
            }
            return 0L;
        }

        public c c() {
            c cVarD = d();
            return (cVarD.f30578a == null || !this.f30581b.b().j()) ? cVarD : new c(null, null);
        }

        public final c d() {
            if (this.f30582c == null) {
                return new c(this.f30581b, null);
            }
            if ((!this.f30581b.e() || this.f30582c.m() != null) && c.a(this.f30582c, this.f30581b)) {
                k.d dVarB = this.f30581b.b();
                if (dVarB.h() || e(this.f30581b)) {
                    return new c(this.f30581b, null);
                }
                long jA = a();
                long jB = b();
                if (dVarB.d() != -1) {
                    jB = Math.min(jB, TimeUnit.SECONDS.toMillis(dVarB.d()));
                }
                long millis = 0;
                long millis2 = dVarB.f() != -1 ? TimeUnit.SECONDS.toMillis(dVarB.f()) : 0L;
                k.d dVarI = this.f30582c.i();
                if (!dVarI.g() && dVarB.e() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(dVarB.e());
                }
                if (!dVarI.h()) {
                    long j2 = millis2 + jA;
                    if (j2 < millis + jB) {
                        c0.a aVarR = this.f30582c.r();
                        if (j2 >= jB) {
                            aVarR.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jA > TimeChart.DAY && f()) {
                            aVarR.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new c(null, aVarR.c());
                    }
                }
                String str = this.f30590k;
                String str2 = Headers.GET_OBJECT_IF_MODIFIED_SINCE;
                if (str != null) {
                    str2 = Headers.GET_OBJECT_IF_NONE_MATCH;
                } else if (this.f30585f != null) {
                    str = this.f30586g;
                } else {
                    if (this.f30583d == null) {
                        return new c(this.f30581b, null);
                    }
                    str = this.f30584e;
                }
                s.a aVarD = this.f30581b.d().d();
                k.g0.a.f30553a.b(aVarD, str2, str);
                return new c(this.f30581b.g().f(aVarD.d()).b(), this.f30582c);
            }
            return new c(this.f30581b, null);
        }

        public final boolean f() {
            return this.f30582c.i().d() == -1 && this.f30587h == null;
        }
    }

    public c(a0 a0Var, c0 c0Var) {
        this.f30578a = a0Var;
        this.f30579b = c0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.i().b() == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(k.c0 r3, k.a0 r4) {
        /*
            int r0 = r3.l()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.n(r0)
            if (r0 != 0) goto L5a
            k.d r0 = r3.i()
            int r0 = r0.d()
            r1 = -1
            if (r0 != r1) goto L5a
            k.d r0 = r3.i()
            boolean r0 = r0.c()
            if (r0 != 0) goto L5a
            k.d r0 = r3.i()
            boolean r0 = r0.b()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            k.d r3 = r3.i()
            boolean r3 = r3.i()
            if (r3 != 0) goto L6f
            k.d r3 = r4.b()
            boolean r3 = r3.i()
            if (r3 != 0) goto L6f
            r2 = 1
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k.g0.e.c.a(k.c0, k.a0):boolean");
    }
}
