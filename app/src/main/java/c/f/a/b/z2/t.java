package c.f.a.b.z2;

import c.f.a.b.b3.a;
import c.f.a.b.j3.x0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f11498a = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11499b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11500c = -1;

    public boolean a() {
        return (this.f11499b == -1 || this.f11500c == -1) ? false : true;
    }

    public final boolean b(String str) {
        Matcher matcher = f11498a.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i2 = Integer.parseInt((String) x0.i(matcher.group(1)), 16);
            int i3 = Integer.parseInt((String) x0.i(matcher.group(2)), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.f11499b = i2;
            this.f11500c = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean c(c.f.a.b.b3.a aVar) {
        for (int i2 = 0; i2 < aVar.e(); i2++) {
            a.b bVarD = aVar.d(i2);
            if (bVarD instanceof c.f.a.b.b3.m.f) {
                c.f.a.b.b3.m.f fVar = (c.f.a.b.b3.m.f) bVarD;
                if ("iTunSMPB".equals(fVar.f6568d) && b(fVar.f6569e)) {
                    return true;
                }
            } else if (bVarD instanceof c.f.a.b.b3.m.j) {
                c.f.a.b.b3.m.j jVar = (c.f.a.b.b3.m.j) bVarD;
                if ("com.apple.iTunes".equals(jVar.f6580c) && "iTunSMPB".equals(jVar.f6581d) && b(jVar.f6582e)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i2) {
        int i3 = i2 >> 12;
        int i4 = i2 & 4095;
        if (i3 <= 0 && i4 <= 0) {
            return false;
        }
        this.f11499b = i3;
        this.f11500c = i4;
        return true;
    }
}
