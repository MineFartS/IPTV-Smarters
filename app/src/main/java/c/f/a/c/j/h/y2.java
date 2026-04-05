package c.f.a.c.j.h;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class y2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static HashMap<String, String> f13645f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Object f13650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f13651l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f13640a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Uri f13641b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f13642c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f13643d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f13644e = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashMap<String, Boolean> f13646g = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap<String, Integer> f13647h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap<String, Long> f13648i = new HashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashMap<String, Float> f13649j = new HashMap<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f13652m = new String[0];

    public static String a(ContentResolver contentResolver, String str, String str2) {
        synchronized (y2.class) {
            if (f13645f == null) {
                f13644e.set(false);
                f13645f = new HashMap<>();
                f13650k = new Object();
                f13651l = false;
                contentResolver.registerContentObserver(f13640a, true, new x2(null));
            } else if (f13644e.getAndSet(false)) {
                f13645f.clear();
                f13646g.clear();
                f13647h.clear();
                f13648i.clear();
                f13649j.clear();
                f13650k = new Object();
                f13651l = false;
            }
            Object obj = f13650k;
            if (f13645f.containsKey(str)) {
                String str3 = f13645f.get(str);
                if (str3 != null) {
                    str = str3;
                }
                return str;
            }
            int length = f13652m.length;
            Cursor cursorQuery = contentResolver.query(f13640a, null, null, new String[]{str}, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    c(obj, str, null);
                    return null;
                }
                String string = cursorQuery.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                c(obj, str, string);
                return string != null ? string : null;
            } finally {
                cursorQuery.close();
            }
        }
    }

    public static void c(Object obj, String str, String str2) {
        synchronized (y2.class) {
            if (obj == f13650k) {
                f13645f.put(str, str2);
            }
        }
    }
}
