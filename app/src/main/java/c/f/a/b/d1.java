package c.f.a.b;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends x1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v0<d1> f6843e = new v0() { // from class: c.f.a.b.c
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f6847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6848j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c.f.a.b.e3.g0 f6849k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f6850l;

    public d1(int i2, Throwable th, int i3) {
        this(i2, th, null, i3, null, -1, null, 4, false);
    }

    public d1(int i2, Throwable th, String str, int i3, String str2, int i4, k1 k1Var, int i5, boolean z) {
        this(h(i2, str, str2, i4, k1Var, i5), th, i3, i2, str2, i4, k1Var, i5, null, SystemClock.elapsedRealtime(), z);
    }

    public d1(String str, Throwable th, int i2, int i3, String str2, int i4, k1 k1Var, int i5, c.f.a.b.e3.g0 g0Var, long j2, boolean z) {
        super(str, th, i2, j2);
        c.f.a.b.j3.g.a(!z || i3 == 1);
        c.f.a.b.j3.g.a(th != null || i3 == 3);
        this.f6844f = i3;
        this.f6845g = str2;
        this.f6846h = i4;
        this.f6847i = k1Var;
        this.f6848j = i5;
        this.f6849k = g0Var;
        this.f6850l = z;
    }

    public static d1 d(Throwable th, String str, int i2, k1 k1Var, int i3, boolean z, int i4) {
        return new d1(1, th, null, i4, str, i2, k1Var, k1Var == null ? 4 : i3, z);
    }

    public static d1 e(IOException iOException, int i2) {
        return new d1(0, iOException, i2);
    }

    @Deprecated
    public static d1 f(RuntimeException runtimeException) {
        return g(runtimeException, 1000);
    }

    public static d1 g(RuntimeException runtimeException, int i2) {
        return new d1(2, runtimeException, i2);
    }

    public static String h(int i2, String str, String str2, int i3, k1 k1Var, int i4) {
        String str3;
        if (i2 == 0) {
            str3 = "Source error";
        } else if (i2 != 1) {
            str3 = i2 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i3 + ", format=" + k1Var + ", format_supported=" + w0.c(i4);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    public d1 c(c.f.a.b.e3.g0 g0Var) {
        return new d1((String) c.f.a.b.j3.x0.i(getMessage()), getCause(), this.f10319c, this.f6844f, this.f6845g, this.f6846h, this.f6847i, this.f6848j, g0Var, this.f10320d, this.f6850l);
    }
}
