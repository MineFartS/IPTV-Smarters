package c.f.c.u;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f16426a = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16429d;

    public z(String str, String str2) {
        this.f16427b = d(str2, str);
        this.f16428c = str;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("!");
        sb.append(str2);
        this.f16429d = sb.toString();
    }

    public static z a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new z(strArrSplit[0], strArrSplit[1]);
    }

    public static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f16426a.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public String b() {
        return this.f16428c;
    }

    public String c() {
        return this.f16427b;
    }

    public String e() {
        return this.f16429d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f16427b.equals(zVar.f16427b) && this.f16428c.equals(zVar.f16428c);
    }

    public int hashCode() {
        return c.f.a.c.f.q.n.b(this.f16428c, this.f16427b);
    }
}
