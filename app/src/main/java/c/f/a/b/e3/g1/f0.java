package c.f.a.b.e3.g1;

import c.f.a.b.j3.x0;
import c.f.a.b.w1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f7514a = new f0(0, -9223372036854775807L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f7515b = Pattern.compile("npt=([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7517d;

    public f0(long j2, long j3) {
        this.f7516c = j2;
        this.f7517d = j3;
    }

    public static String b(long j2) {
        double d2 = j2;
        Double.isNaN(d2);
        return x0.D("npt=%.3f-", Double.valueOf(d2 / 1000.0d));
    }

    public static f0 d(String str) throws w1 {
        long j2;
        Matcher matcher = f7515b.matcher(str);
        c.f.a.b.j3.g.a(matcher.matches());
        String str2 = (String) c.f.a.b.j3.g.e(matcher.group(1));
        long j3 = str2.equals("now") ? 0L : (long) (Float.parseFloat(str2) * 1000.0f);
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            try {
                j2 = (long) (Float.parseFloat(strGroup) * 1000.0f);
                c.f.a.b.j3.g.a(j2 > j3);
            } catch (NumberFormatException e2) {
                throw w1.c(strGroup, e2);
            }
        } else {
            j2 = -9223372036854775807L;
        }
        return new f0(j3, j2);
    }

    public long a() {
        return this.f7517d - this.f7516c;
    }

    public boolean c() {
        return this.f7517d == -9223372036854775807L;
    }
}
