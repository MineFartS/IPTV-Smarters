package c.f.a.c.k.b;

import android.text.TextUtils;
import android.util.Log;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class y3 extends x5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char f14465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f14466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w3 f14468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w3 f14469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w3 f14470h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w3 f14471i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w3 f14472j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w3 f14473k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w3 f14474l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w3 f14475m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w3 f14476n;

    public y3(c5 c5Var) {
        super(c5Var);
        this.f14465c = (char) 0;
        this.f14466d = -1L;
        this.f14468f = new w3(this, 6, false, false);
        this.f14469g = new w3(this, 6, true, false);
        this.f14470h = new w3(this, 6, false, true);
        this.f14471i = new w3(this, 5, false, false);
        this.f14472j = new w3(this, 5, true, false);
        this.f14473k = new w3(this, 5, false, true);
        this.f14474l = new w3(this, 4, false, false);
        this.f14475m = new w3(this, 3, false, false);
        this.f14476n = new w3(this, 2, false, false);
    }

    public static String A(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = BuildConfig.FLAVOR;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        String strB = B(z, obj);
        String strB2 = B(z, obj2);
        String strB3 = B(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strB)) {
            sb.append(str2);
            sb.append(strB);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strB2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strB2);
        }
        if (!TextUtils.isEmpty(strB3)) {
            sb.append(str3);
            sb.append(strB3);
        }
        return sb.toString();
    }

    public static String B(boolean z, Object obj) {
        String className;
        String str = BuildConfig.FLAVOR;
        if (obj == null) {
            return BuildConfig.FLAVOR;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i2 = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String strValueOf = String.valueOf(Math.abs(l2.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof x3 ? ((x3) obj).f14433a : z ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String strG = G(c5.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && G(className).equals(strG)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            i2++;
        }
        return sb2.toString();
    }

    public static /* synthetic */ long F(y3 y3Var, long j2) {
        y3Var.f14466d = 37000L;
        return 37000L;
    }

    public static String G(String str) {
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.FLAVOR;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
    }

    public static Object x(String str) {
        if (str == null) {
            return null;
        }
        return new x3(str);
    }

    @Override // c.f.a.c.k.b.x5
    public final boolean h() {
        return false;
    }

    public final w3 o() {
        return this.f14468f;
    }

    public final w3 p() {
        return this.f14469g;
    }

    public final w3 q() {
        return this.f14470h;
    }

    public final w3 r() {
        return this.f14471i;
    }

    public final w3 s() {
        return this.f14472j;
    }

    public final w3 t() {
        return this.f14473k;
    }

    public final w3 u() {
        return this.f14474l;
    }

    public final w3 v() {
        return this.f14475m;
    }

    public final w3 w() {
        return this.f14476n;
    }

    public final void y(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(z(), i2)) {
            Log.println(i2, z(), A(false, str, obj, obj2, obj3));
        }
        if (z2 || i2 < 5) {
            return;
        }
        c.f.a.c.f.q.o.i(str);
        z4 z4VarE = this.f14413a.E();
        if (z4VarE == null) {
            Log.println(6, z(), "Scheduler not set. Not logging error/warn");
        } else if (z4VarE.j()) {
            z4VarE.r(new v3(this, i2 >= 9 ? 8 : i2, str, obj, obj2, obj3));
        } else {
            Log.println(6, z(), "Scheduler not initialized. Not logging error/warn");
        }
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String z() {
        String str;
        synchronized (this) {
            if (this.f14467e == null) {
                this.f14467e = this.f14413a.N() != null ? this.f14413a.N() : this.f14413a.z().k();
            }
            c.f.a.c.f.q.o.i(this.f14467e);
            str = this.f14467e;
        }
        return str;
    }
}
