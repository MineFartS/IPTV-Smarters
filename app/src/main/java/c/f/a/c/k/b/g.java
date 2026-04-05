package c.f.a.c.k.b;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f13894a = new g(null, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f13895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f13896c;

    public g(Boolean bool, Boolean bool2) {
        this.f13895b = bool;
        this.f13896c = bool2;
    }

    public static String a(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string != null && o(string) == null) {
            return string;
        }
        String string2 = bundle.getString("analytics_storage");
        if (string2 == null || o(string2) != null) {
            return null;
        }
        return string2;
    }

    public static g b(Bundle bundle) {
        return bundle == null ? f13894a : new g(o(bundle.getString("ad_storage")), o(bundle.getString("analytics_storage")));
    }

    public static g c(String str) {
        Boolean boolP;
        if (str != null) {
            Boolean boolP2 = str.length() >= 3 ? p(str.charAt(2)) : null;
            boolP = str.length() >= 4 ? p(str.charAt(3)) : null;
            bool = boolP2;
        } else {
            boolP = null;
        }
        return new g(bool, boolP);
    }

    public static Boolean j(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        boolean z = false;
        if (bool.booleanValue() && bool2.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static boolean m(int i2, int i3) {
        return i2 <= i3;
    }

    public static final int n(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    public static Boolean o(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static Boolean p(char c2) {
        if (c2 == '0') {
            return Boolean.FALSE;
        }
        if (c2 != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    public static final char q(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    public final String d() {
        return "G1" + q(this.f13895b) + q(this.f13896c);
    }

    public final Boolean e() {
        return this.f13895b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return n(this.f13895b) == n(gVar.f13895b) && n(this.f13896c) == n(gVar.f13896c);
    }

    public final boolean f() {
        Boolean bool = this.f13895b;
        return bool == null || bool.booleanValue();
    }

    public final Boolean g() {
        return this.f13896c;
    }

    public final boolean h() {
        Boolean bool = this.f13896c;
        return bool == null || bool.booleanValue();
    }

    public final int hashCode() {
        return ((n(this.f13895b) + 527) * 31) + n(this.f13896c);
    }

    public final boolean i(g gVar) {
        Boolean bool = this.f13895b;
        Boolean bool2 = Boolean.FALSE;
        if (bool != bool2 || gVar.f13895b == bool2) {
            return this.f13896c == bool2 && gVar.f13896c != bool2;
        }
        return true;
    }

    public final g k(g gVar) {
        return new g(j(this.f13895b, gVar.f13895b), j(this.f13896c, gVar.f13896c));
    }

    public final g l(g gVar) {
        Boolean bool = this.f13895b;
        if (bool == null) {
            bool = gVar.f13895b;
        }
        Boolean bool2 = this.f13896c;
        if (bool2 == null) {
            bool2 = gVar.f13896c;
        }
        return new g(bool, bool2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.f13895b;
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true != bool.booleanValue() ? "denied" : "granted");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.f13896c;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            sb.append(true == bool2.booleanValue() ? "granted" : "denied");
        }
        return sb.toString();
    }
}
