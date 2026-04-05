package c.f.a.b.f3.t;

import android.text.TextUtils;
import c.f.b.b.x;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f8271a = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x<String> f8272b = x.K("auto", "none");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x<String> f8273c = x.L("dot", "sesame", "circle");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x<String> f8274d = x.K("filled", "open");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x<String> f8275e = x.L("after", "before", "outside");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8278h;

    public b(int i2, int i3, int i4) {
        this.f8276f = i2;
        this.f8277g = i3;
        this.f8278h = i4;
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        String strE = c.f.b.a.b.e(str.trim());
        if (strE.isEmpty()) {
            return null;
        }
        return b(x.C(TextUtils.split(strE, f8271a)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c.f.a.b.f3.t.b b(c.f.b.b.x<java.lang.String> r9) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.f3.t.b.b(c.f.b.b.x):c.f.a.b.f3.t.b");
    }
}
