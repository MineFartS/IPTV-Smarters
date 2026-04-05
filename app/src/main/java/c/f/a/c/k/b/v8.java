package c.f.a.c.k.b;

import android.util.Pair;
import c.f.a.c.a.a.a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class v8 extends p9 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f14401f;

    public v8(x9 x9Var) {
        super(x9Var);
    }

    @Override // c.f.a.c.k.b.p9
    public final boolean k() {
        return false;
    }

    public final Pair<String, Boolean> l(String str, g gVar) {
        c.f.a.c.j.h.ha.a();
        return (!this.f14413a.z().w(null, m3.I0) || gVar.f()) ? m(str) : new Pair<>(BuildConfig.FLAVOR, Boolean.FALSE);
    }

    @Deprecated
    public final Pair<String, Boolean> m(String str) {
        g();
        long jB = this.f14413a.a().b();
        String str2 = this.f14399d;
        if (str2 != null && jB < this.f14401f) {
            return new Pair<>(str2, Boolean.valueOf(this.f14400e));
        }
        this.f14401f = jB + this.f14413a.z().s(str, m3.f14093c);
        c.f.a.c.a.a.a.c(true);
        try {
            a.C0150a c0150aA = c.f.a.c.a.a.a.a(this.f14413a.b());
            if (c0150aA != null) {
                this.f14399d = c0150aA.a();
                this.f14400e = c0150aA.b();
            }
            if (this.f14399d == null) {
                this.f14399d = BuildConfig.FLAVOR;
            }
        } catch (Exception e2) {
            this.f14413a.c().v().b("Unable to get advertising id", e2);
            this.f14399d = BuildConfig.FLAVOR;
        }
        c.f.a.c.a.a.a.c(false);
        return new Pair<>(this.f14399d, Boolean.valueOf(this.f14400e));
    }

    @Deprecated
    public final String o(String str) {
        g();
        String str2 = (String) m(str).first;
        MessageDigest messageDigestB = ea.B();
        if (messageDigestB == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestB.digest(str2.getBytes())));
    }
}
