package c.f.a.c.d.v.c;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f12129a = new c.f.a.c.d.v.b("MetadataUtils");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f12130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f12131c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        f12130b = strArr;
        String strValueOf = String.valueOf(strArr[0]);
        f12131c = strValueOf.length() != 0 ? "yyyyMMdd'T'HHmmss".concat(strValueOf) : new String("yyyyMMdd'T'HHmmss");
    }

    public static void a(List<c.f.a.c.f.p.a> list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    list.add(new c.f.a.c.f.p.a(jSONArray.getJSONObject(i2)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }

    public static Calendar b(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            f12129a.a("Input string is empty or null", new Object[0]);
            return null;
        }
        String strC = c(str);
        if (TextUtils.isEmpty(strC)) {
            f12129a.a("Invalid date format", new Object[0]);
            return null;
        }
        String strD = d(str);
        if (TextUtils.isEmpty(strD)) {
            str2 = "yyyyMMdd";
        } else {
            String strValueOf = String.valueOf(strC);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 1 + String.valueOf(strD).length());
            sb.append(strValueOf);
            sb.append("T");
            sb.append(strD);
            strC = sb.toString();
            str2 = strD.length() == 6 ? "yyyyMMdd'T'HHmmss" : f12131c;
        }
        Calendar gregorianCalendar = GregorianCalendar.getInstance();
        try {
            gregorianCalendar.setTime(new SimpleDateFormat(str2).parse(strC));
            return gregorianCalendar;
        } catch (ParseException e2) {
            f12129a.a("Error parsing string: %s", e2.getMessage());
            return null;
        }
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            f12129a.a("Input string is empty or null", new Object[0]);
            return null;
        }
        try {
            return str.substring(0, 8);
        } catch (IndexOutOfBoundsException e2) {
            f12129a.e("Error extracting the date: %s", e2.getMessage());
            return null;
        }
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            f12129a.a("string is empty or null", new Object[0]);
            return null;
        }
        int iIndexOf = str.indexOf(84);
        int i2 = iIndexOf + 1;
        if (iIndexOf != 8) {
            f12129a.a("T delimeter is not found", new Object[0]);
            return null;
        }
        try {
            String strSubstring = str.substring(i2);
            if (strSubstring.length() == 6) {
                return strSubstring;
            }
            char cCharAt = strSubstring.charAt(6);
            if (cCharAt != '+' && cCharAt != '-') {
                if (cCharAt != 'Z' || strSubstring.length() != f12130b[0].length() + 6) {
                    return null;
                }
                String strValueOf = String.valueOf(strSubstring.substring(0, strSubstring.length() - 1));
                return "+0000".length() != 0 ? strValueOf.concat("+0000") : new String(strValueOf);
            }
            int length = strSubstring.length();
            String[] strArr = f12130b;
            if (length == strArr[1].length() + 6 || length == strArr[2].length() + 6 || length == strArr[3].length() + 6) {
                return strSubstring.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
            }
            return null;
        } catch (IndexOutOfBoundsException e2) {
            f12129a.a("Error extracting the time substring: %s", e2.getMessage());
            return null;
        }
    }

    public static JSONArray e(List<c.f.a.c.f.p.a> list) {
        if (list == null && list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<c.f.a.c.f.p.a> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().L());
        }
        return jSONArray;
    }
}
