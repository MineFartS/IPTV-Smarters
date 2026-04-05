package c.f.a.c.f;

import android.util.Log;
import c.f.a.c.f.q.o;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0 f12688a = new r0(true, null, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f12690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Throwable f12691d;

    public r0(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.f12689b = z;
        this.f12690c = str;
        this.f12691d = th;
    }

    public static r0 b() {
        return f12688a;
    }

    public static r0 c(Callable<String> callable) {
        return new q0(callable, null);
    }

    public static r0 d(String str) {
        return new r0(false, str, null);
    }

    public static r0 e(String str, Throwable th) {
        return new r0(false, str, th);
    }

    public static String g(String str, d0 d0Var, boolean z, boolean z2) {
        String str2 = true != z2 ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = c.f.a.c.f.t.a.b("SHA-1");
        o.i(messageDigestB);
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", str2, str, c.f.a.c.f.t.i.a(messageDigestB.digest(d0Var.I2())), Boolean.valueOf(z), "12451000.false");
    }

    @Nullable
    public String a() {
        return this.f12690c;
    }

    public final void f() {
        if (this.f12689b || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f12691d != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f12691d);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
