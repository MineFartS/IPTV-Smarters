package c.f.a.c.d;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static String a(String str) {
        if (str != null) {
            return c("com.google.android.gms.cast.CATEGORY_CAST", str, null, false, true);
        }
        throw new IllegalArgumentException("applicationId cannot be null");
    }

    public static String b(String str, Collection<String> collection) {
        if (str == null) {
            throw new IllegalArgumentException("applicationId cannot be null");
        }
        if (collection != null) {
            return c("com.google.android.gms.cast.CATEGORY_CAST", str, collection, false, true);
        }
        throw new IllegalArgumentException("namespaces cannot be null");
    }

    public static String c(String str, String str2, Collection<String> collection, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(str);
        if (str2 != null) {
            String upperCase = str2.toUpperCase();
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException(str2.length() != 0 ? "Invalid application ID: ".concat(str2) : new String("Invalid application ID: "));
            }
            sb.append("/");
            sb.append(upperCase);
        }
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (str2 == null) {
                sb.append("/");
            }
            sb.append("/");
            boolean z3 = true;
            for (String str3 : collection) {
                c.f.a.c.d.v.a.d(str3);
                if (z3) {
                    z3 = false;
                } else {
                    sb.append(",");
                }
                sb.append(c.f.a.c.d.v.a.l(str3));
            }
        }
        if (str2 == null && collection == null) {
            sb.append("/");
        }
        if (collection == null) {
            sb.append("/");
        }
        sb.append("/");
        sb.append("/");
        sb.append("ALLOW_IPV6");
        return sb.toString();
    }
}
