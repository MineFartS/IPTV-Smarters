package k;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f30972a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f30973b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f30974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f30975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f30976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f30977f;

    public v(String str, String str2, String str3, @Nullable String str4) {
        this.f30974c = str;
        this.f30975d = str2;
        this.f30976e = str3;
        this.f30977f = str4;
    }

    @Nullable
    public static v c(String str) {
        Matcher matcher = f30972a.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f30973b.matcher(str);
        String str2 = null;
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 != null && strGroup2.equalsIgnoreCase("charset")) {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = strGroup3.substring(1, strGroup3.length() - 1);
                }
                if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                    return null;
                }
                str2 = strGroup3;
            }
        }
        return new v(str, lowerCase, lowerCase2, str2);
    }

    @Nullable
    public Charset a() {
        return b(null);
    }

    @Nullable
    public Charset b(@Nullable Charset charset) {
        try {
            String str = this.f30977f;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public String d() {
        return this.f30975d;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof v) && ((v) obj).f30974c.equals(this.f30974c);
    }

    public int hashCode() {
        return this.f30974c.hashCode();
    }

    public String toString() {
        return this.f30974c;
    }
}
