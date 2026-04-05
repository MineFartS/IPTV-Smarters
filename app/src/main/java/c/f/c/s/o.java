package c.f.c.s;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f16279a = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f16280b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static o f16281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.c.s.s.a f16282d;

    public o(c.f.c.s.s.a aVar) {
        this.f16282d = aVar;
    }

    public static o c() {
        return d(c.f.c.s.s.b.b());
    }

    public static o d(c.f.c.s.s.a aVar) {
        if (f16281c == null) {
            f16281c = new o(aVar);
        }
        return f16281c;
    }

    public static boolean g(String str) {
        return f16280b.matcher(str).matches();
    }

    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f16282d.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(c.f.c.s.q.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f16279a;
    }
}
