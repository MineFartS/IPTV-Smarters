package c.f.a.b.e3.g1;

import c.f.a.b.e3.g1.i0;
import c.f.a.b.e3.g1.j;
import c.f.a.b.w1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f7576a = Pattern.compile("([a-z])=\\s?(.+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f7577b = Pattern.compile("([0-9A-Za-z-]+)(?::(.*))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f7578c = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    public static void a(i0.b bVar, j.b bVar2) throws w1 {
        try {
            bVar.n(bVar2.j());
        } catch (IllegalArgumentException | IllegalStateException e2) {
            throw w1.c(null, e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x01af, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c.f.a.b.e3.g1.i0 b(java.lang.String r13) throws c.f.a.b.w1 {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.g1.j0.b(java.lang.String):c.f.a.b.e3.g1.i0");
    }

    public static j.b c(String str) throws w1 {
        Matcher matcher = f7578c.matcher(str);
        if (!matcher.matches()) {
            throw w1.c("Malformed SDP media description line: " + str, null);
        }
        try {
            return new j.b((String) c.f.a.b.j3.g.e(matcher.group(1)), Integer.parseInt((String) c.f.a.b.j3.g.e(matcher.group(2))), (String) c.f.a.b.j3.g.e(matcher.group(3)), Integer.parseInt((String) c.f.a.b.j3.g.e(matcher.group(4))));
        } catch (NumberFormatException e2) {
            throw w1.c("Malformed SDP media description line: " + str, e2);
        }
    }
}
