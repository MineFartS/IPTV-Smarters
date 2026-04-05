package c.f.a.c.d.v;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.parser.CharacterReader;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f12121a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");

    public static JSONObject a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static double b(long j2) {
        double d2 = j2;
        Double.isNaN(d2);
        return d2 / 1000.0d;
    }

    public static long c(double d2) {
        return (long) (d2 * 1000.0d);
    }

    public static void d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Namespace cannot be null or empty");
        }
        if (str.length() > 128) {
            throw new IllegalArgumentException("Invalid namespace length");
        }
        if (!str.startsWith("urn:x-cast:")) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
        }
        if (str.length() == 11) {
            throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
        }
    }

    public static String e(Locale locale) {
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
        return sb.toString();
    }

    public static <T> boolean f(T t, T t2) {
        if (t == null && t2 == null) {
            return true;
        }
        return (t == null || t2 == null || !t.equals(t2)) ? false : true;
    }

    public static int[] g(Collection<Integer> collection) {
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().intValue();
            i2++;
        }
        return iArr;
    }

    public static int h(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), i4);
    }

    public static long[] i(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        long[] jArr = new long[jSONArray.length()];
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            jArr[i2] = jSONArray.getLong(i2);
        }
        return jArr;
    }

    public static List<Integer> j(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList;
    }

    public static String k(String str) {
        String strValueOf = String.valueOf(str);
        return strValueOf.length() != 0 ? "urn:x-cast:".concat(strValueOf) : new String("urn:x-cast:");
    }

    public static String l(String str) {
        if (f12121a.matcher(str).matches()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '_' || cCharAt == '-')) || cCharAt == '.' || cCharAt == ':') {
                sb.append(cCharAt);
            } else {
                sb.append(String.format("%%%04x", Integer.valueOf(cCharAt & CharacterReader.EOF)));
            }
        }
        return sb.toString();
    }
}
