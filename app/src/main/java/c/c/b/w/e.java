package c.c.b.w;

import c.c.b.b;
import c.c.b.v;
import com.amazonaws.services.s3.Headers;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public static String a(long j2) {
        return b().format(new Date(j2));
    }

    public static SimpleDateFormat b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static b.a c(c.c.b.k kVar) {
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = kVar.f5221c;
        String str = map.get("Date");
        long jD = str != null ? d(str) : 0L;
        String str2 = map.get(Headers.CACHE_CONTROL);
        int i2 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            int i3 = 0;
            j2 = 0;
            j3 = 0;
            while (i2 < strArrSplit.length) {
                String strTrim = strArrSplit[i2].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j3 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    i3 = 1;
                }
                i2++;
            }
            i2 = i3;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = map.get(Headers.EXPIRES);
        long jD2 = str3 != null ? d(str3) : 0L;
        String str4 = map.get(Headers.LAST_MODIFIED);
        long jD3 = str4 != null ? d(str4) : 0L;
        String str5 = map.get(Headers.ETAG);
        if (z) {
            j5 = jCurrentTimeMillis + (j2 * 1000);
            if (i2 != 0) {
                j6 = j5;
            } else {
                Long.signum(j3);
                j6 = (j3 * 1000) + j5;
            }
            j4 = j6;
        } else {
            j4 = 0;
            if (jD <= 0 || jD2 < jD) {
                j5 = 0;
            } else {
                j5 = jCurrentTimeMillis + (jD2 - jD);
                j4 = j5;
            }
        }
        b.a aVar = new b.a();
        aVar.f5183a = kVar.f5220b;
        aVar.f5184b = str5;
        aVar.f5188f = j5;
        aVar.f5187e = j4;
        aVar.f5185c = jD;
        aVar.f5186d = jD3;
        aVar.f5189g = map;
        aVar.f5190h = kVar.f5222d;
        return aVar;
    }

    public static long d(String str) {
        try {
            return b().parse(str).getTime();
        } catch (ParseException e2) {
            v.d(e2, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static List<c.c.b.g> e(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new c.c.b.g(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    public static Map<String, String> f(List<c.c.b.g> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (c.c.b.g gVar : list) {
            treeMap.put(gVar.a(), gVar.b());
        }
        return treeMap;
    }
}
