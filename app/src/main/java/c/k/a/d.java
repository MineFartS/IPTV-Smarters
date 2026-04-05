package c.k.a;

import com.amazonaws.services.s3.Headers;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f18183a = new b().c().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f18184b = new b().e().b(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f18190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18191i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18192j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f18193k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f18194l;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f18195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f18196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18197c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18198d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18199e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f18200f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f18201g;

        public d a() {
            return new d(this);
        }

        public b b(int i2, TimeUnit timeUnit) {
            if (i2 >= 0) {
                long seconds = timeUnit.toSeconds(i2);
                this.f18198d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i2);
        }

        public b c() {
            this.f18195a = true;
            return this;
        }

        public b d() {
            this.f18196b = true;
            return this;
        }

        public b e() {
            this.f18200f = true;
            return this;
        }
    }

    public d(b bVar) {
        this.f18185c = bVar.f18195a;
        this.f18186d = bVar.f18196b;
        this.f18187e = bVar.f18197c;
        this.f18188f = -1;
        this.f18189g = false;
        this.f18190h = false;
        this.f18191i = bVar.f18198d;
        this.f18192j = bVar.f18199e;
        this.f18193k = bVar.f18200f;
        this.f18194l = bVar.f18201g;
    }

    public d(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, int i4, int i5, boolean z5, boolean z6) {
        this.f18185c = z;
        this.f18186d = z2;
        this.f18187e = i2;
        this.f18188f = i3;
        this.f18189g = z3;
        this.f18190h = z4;
        this.f18191i = i4;
        this.f18192j = i5;
        this.f18193k = z5;
        this.f18194l = z6;
    }

    public static d h(o oVar) {
        String strTrim;
        int iB;
        o oVar2 = oVar;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        int iA = -1;
        int iA2 = -1;
        boolean z3 = false;
        boolean z4 = false;
        int iA3 = -1;
        int iA4 = -1;
        boolean z5 = false;
        boolean z6 = false;
        while (i2 < oVar.f()) {
            if (oVar2.d(i2).equalsIgnoreCase(Headers.CACHE_CONTROL) || oVar2.d(i2).equalsIgnoreCase("Pragma")) {
                String strG = oVar2.g(i2);
                for (int i3 = 0; i3 < strG.length(); i3 = iB) {
                    int iB2 = c.k.a.y.j.d.b(strG, i3, "=,;");
                    String strTrim2 = strG.substring(i3, iB2).trim();
                    if (iB2 == strG.length() || strG.charAt(iB2) == ',' || strG.charAt(iB2) == ';') {
                        strTrim = null;
                        iB = iB2 + 1;
                    } else {
                        int iC = c.k.a.y.j.d.c(strG, iB2 + 1);
                        if (iC >= strG.length() || strG.charAt(iC) != '\"') {
                            iB = c.k.a.y.j.d.b(strG, iC, ",;");
                            strTrim = strG.substring(iC, iB).trim();
                        } else {
                            int i4 = iC + 1;
                            int iB3 = c.k.a.y.j.d.b(strG, i4, "\"");
                            strTrim = strG.substring(i4, iB3);
                            iB = iB3 + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(strTrim2)) {
                        z = true;
                    } else if ("no-store".equalsIgnoreCase(strTrim2)) {
                        z2 = true;
                    } else if ("max-age".equalsIgnoreCase(strTrim2)) {
                        iA = c.k.a.y.j.d.a(strTrim, -1);
                    } else if ("s-maxage".equalsIgnoreCase(strTrim2)) {
                        iA2 = c.k.a.y.j.d.a(strTrim, -1);
                    } else if ("public".equalsIgnoreCase(strTrim2)) {
                        z3 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(strTrim2)) {
                        z4 = true;
                    } else if ("max-stale".equalsIgnoreCase(strTrim2)) {
                        iA3 = c.k.a.y.j.d.a(strTrim, Integer.MAX_VALUE);
                    } else if ("min-fresh".equalsIgnoreCase(strTrim2)) {
                        iA4 = c.k.a.y.j.d.a(strTrim, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(strTrim2)) {
                        z5 = true;
                    } else if ("no-transform".equalsIgnoreCase(strTrim2)) {
                        z6 = true;
                    }
                }
            }
            i2++;
            oVar2 = oVar;
        }
        return new d(z, z2, iA, iA2, z3, z4, iA3, iA4, z5, z6);
    }

    public int a() {
        return this.f18187e;
    }

    public int b() {
        return this.f18191i;
    }

    public int c() {
        return this.f18192j;
    }

    public boolean d() {
        return this.f18190h;
    }

    public boolean e() {
        return this.f18185c;
    }

    public boolean f() {
        return this.f18186d;
    }

    public boolean g() {
        return this.f18193k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f18185c) {
            sb.append("no-cache, ");
        }
        if (this.f18186d) {
            sb.append("no-store, ");
        }
        if (this.f18187e != -1) {
            sb.append("max-age=");
            sb.append(this.f18187e);
            sb.append(", ");
        }
        if (this.f18188f != -1) {
            sb.append("s-maxage=");
            sb.append(this.f18188f);
            sb.append(", ");
        }
        if (this.f18189g) {
            sb.append("public, ");
        }
        if (this.f18190h) {
            sb.append("must-revalidate, ");
        }
        if (this.f18191i != -1) {
            sb.append("max-stale=");
            sb.append(this.f18191i);
            sb.append(", ");
        }
        if (this.f18192j != -1) {
            sb.append("min-fresh=");
            sb.append(this.f18192j);
            sb.append(", ");
        }
        if (this.f18193k) {
            sb.append("only-if-cached, ");
        }
        if (this.f18194l) {
            sb.append("no-transform, ");
        }
        if (sb.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }
}
