package k;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f30511a = new a().c().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f30512b = new a().d().b(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f30514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f30516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f30517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f30518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f30519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f30520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f30521k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f30522l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f30523m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f30524n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public String f30525o;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f30526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f30527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f30528c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f30529d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f30530e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f30531f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f30532g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f30533h;

        public d a() {
            return new d(this);
        }

        public a b(int i2, TimeUnit timeUnit) {
            if (i2 >= 0) {
                long seconds = timeUnit.toSeconds(i2);
                this.f30529d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i2);
        }

        public a c() {
            this.f30526a = true;
            return this;
        }

        public a d() {
            this.f30531f = true;
            return this;
        }
    }

    public d(a aVar) {
        this.f30513c = aVar.f30526a;
        this.f30514d = aVar.f30527b;
        this.f30515e = aVar.f30528c;
        this.f30516f = -1;
        this.f30517g = false;
        this.f30518h = false;
        this.f30519i = false;
        this.f30520j = aVar.f30529d;
        this.f30521k = aVar.f30530e;
        this.f30522l = aVar.f30531f;
        this.f30523m = aVar.f30532g;
        this.f30524n = aVar.f30533h;
    }

    public d(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, @Nullable String str) {
        this.f30513c = z;
        this.f30514d = z2;
        this.f30515e = i2;
        this.f30516f = i3;
        this.f30517g = z3;
        this.f30518h = z4;
        this.f30519i = z5;
        this.f30520j = i4;
        this.f30521k = i5;
        this.f30522l = z6;
        this.f30523m = z7;
        this.f30524n = z8;
        this.f30525o = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k.d k(k.s r22) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.d.k(k.s):k.d");
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        if (this.f30513c) {
            sb.append("no-cache, ");
        }
        if (this.f30514d) {
            sb.append("no-store, ");
        }
        if (this.f30515e != -1) {
            sb.append("max-age=");
            sb.append(this.f30515e);
            sb.append(", ");
        }
        if (this.f30516f != -1) {
            sb.append("s-maxage=");
            sb.append(this.f30516f);
            sb.append(", ");
        }
        if (this.f30517g) {
            sb.append("private, ");
        }
        if (this.f30518h) {
            sb.append("public, ");
        }
        if (this.f30519i) {
            sb.append("must-revalidate, ");
        }
        if (this.f30520j != -1) {
            sb.append("max-stale=");
            sb.append(this.f30520j);
            sb.append(", ");
        }
        if (this.f30521k != -1) {
            sb.append("min-fresh=");
            sb.append(this.f30521k);
            sb.append(", ");
        }
        if (this.f30522l) {
            sb.append("only-if-cached, ");
        }
        if (this.f30523m) {
            sb.append("no-transform, ");
        }
        if (this.f30524n) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    public boolean b() {
        return this.f30517g;
    }

    public boolean c() {
        return this.f30518h;
    }

    public int d() {
        return this.f30515e;
    }

    public int e() {
        return this.f30520j;
    }

    public int f() {
        return this.f30521k;
    }

    public boolean g() {
        return this.f30519i;
    }

    public boolean h() {
        return this.f30513c;
    }

    public boolean i() {
        return this.f30514d;
    }

    public boolean j() {
        return this.f30522l;
    }

    public String toString() {
        String str = this.f30525o;
        if (str != null) {
            return str;
        }
        String strA = a();
        this.f30525o = strA;
        return strA;
    }
}
