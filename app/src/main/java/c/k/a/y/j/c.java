package c.k.a.y.j;

import c.k.a.s;
import c.k.a.u;
import com.amazonaws.services.s3.Headers;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f18371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f18372b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f18374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final u f18375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Date f18376d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f18377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Date f18378f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f18379g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Date f18380h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f18381i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f18382j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f18383k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f18384l;

        public b(long j2, s sVar, u uVar) {
            this.f18384l = -1;
            this.f18373a = j2;
            this.f18374b = sVar;
            this.f18375c = uVar;
            if (uVar != null) {
                for (int i2 = 0; i2 < uVar.s().f(); i2++) {
                    String strD = uVar.s().d(i2);
                    String strG = uVar.s().g(i2);
                    if ("Date".equalsIgnoreCase(strD)) {
                        this.f18376d = f.b(strG);
                        this.f18377e = strG;
                    } else if (Headers.EXPIRES.equalsIgnoreCase(strD)) {
                        this.f18380h = f.b(strG);
                    } else if (Headers.LAST_MODIFIED.equalsIgnoreCase(strD)) {
                        this.f18378f = f.b(strG);
                        this.f18379g = strG;
                    } else if (Headers.ETAG.equalsIgnoreCase(strD)) {
                        this.f18383k = strG;
                    } else if ("Age".equalsIgnoreCase(strD)) {
                        this.f18384l = d.a(strG, -1);
                    } else if (j.f18436c.equalsIgnoreCase(strD)) {
                        this.f18381i = Long.parseLong(strG);
                    } else if (j.f18437d.equalsIgnoreCase(strD)) {
                        this.f18382j = Long.parseLong(strG);
                    }
                }
            }
        }

        public static boolean e(s sVar) {
            return (sVar.i(Headers.GET_OBJECT_IF_MODIFIED_SINCE) == null && sVar.i(Headers.GET_OBJECT_IF_NONE_MATCH) == null) ? false : true;
        }

        public final long a() {
            Date date = this.f18376d;
            long jMax = date != null ? Math.max(0L, this.f18382j - date.getTime()) : 0L;
            int i2 = this.f18384l;
            if (i2 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i2));
            }
            long j2 = this.f18382j;
            return jMax + (j2 - this.f18381i) + (this.f18373a - j2);
        }

        public final long b() {
            if (this.f18375c.l().a() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.a());
            }
            if (this.f18380h != null) {
                Date date = this.f18376d;
                long time = this.f18380h.getTime() - (date != null ? date.getTime() : this.f18382j);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f18378f == null || this.f18375c.y().p().getQuery() != null) {
                return 0L;
            }
            Date date2 = this.f18376d;
            long time2 = (date2 != null ? date2.getTime() : this.f18381i) - this.f18378f.getTime();
            if (time2 > 0) {
                return time2 / 10;
            }
            return 0L;
        }

        public c c() {
            c cVarD = d();
            return (cVarD.f18371a == null || !this.f18374b.h().g()) ? cVarD : new c(null, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x010a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final c.k.a.y.j.c d() {
            /*
                Method dump skipped, instruction units count: 280
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: c.k.a.y.j.c.b.d():c.k.a.y.j.c");
        }

        public final boolean f() {
            return this.f18375c.l().a() == -1 && this.f18380h == null;
        }
    }

    public c(s sVar, u uVar) {
        this.f18371a = sVar;
        this.f18372b = uVar;
    }

    public static boolean a(u uVar, s sVar) {
        int iO = uVar.o();
        if (iO == 200 || iO == 203 || iO == 300 || iO == 301 || iO == 410 || iO == 308) {
            return (uVar.l().f() || sVar.h().f()) ? false : true;
        }
        return false;
    }
}
