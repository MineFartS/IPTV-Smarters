package c.k.a.y.j;

import c.k.a.o;
import c.k.a.s;
import c.k.a.u;
import com.amazonaws.services.s3.Headers;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator<String> f18434a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f18435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f18436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f18437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f18438e;

    public static class a implements Comparator<String> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
        }
    }

    static {
        String strF = c.k.a.y.f.e().f();
        f18435b = strF;
        f18436c = strF + "-Sent-Millis";
        f18437d = strF + "-Received-Millis";
        f18438e = strF + "-Selected-Protocol";
    }

    public static void a(s.b bVar, Map<String, List<String>> map) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if ("Cookie".equalsIgnoreCase(key) || "Cookie2".equalsIgnoreCase(key)) {
                if (!entry.getValue().isEmpty()) {
                    bVar.g(key, b(entry.getValue()));
                }
            }
        }
    }

    public static String b(List<String> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 > 0) {
                sb.append("; ");
            }
            sb.append(list.get(i2));
        }
        return sb.toString();
    }

    public static long c(c.k.a.o oVar) {
        return j(oVar.a("Content-Length"));
    }

    public static long d(s sVar) {
        return c(sVar.j());
    }

    public static long e(u uVar) {
        return c(uVar.s());
    }

    public static boolean f(u uVar) {
        return l(uVar).contains("*");
    }

    public static boolean g(String str) {
        return (Headers.CONNECTION.equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static List<c.k.a.g> h(c.k.a.o oVar, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < oVar.f(); i2++) {
            if (str.equalsIgnoreCase(oVar.d(i2))) {
                String strG = oVar.g(i2);
                int iC = 0;
                while (iC < strG.length()) {
                    int iB = d.b(strG, iC, " ");
                    String strTrim = strG.substring(iC, iB).trim();
                    int iC2 = d.c(strG, iB);
                    if (!strG.regionMatches(true, iC2, "realm=\"", 0, 7)) {
                        break;
                    }
                    int i3 = iC2 + 7;
                    int iB2 = d.b(strG, i3, "\"");
                    String strSubstring = strG.substring(i3, iB2);
                    iC = d.c(strG, d.b(strG, iB2 + 1, ",") + 1);
                    arrayList.add(new c.k.a.g(strTrim, strSubstring));
                }
            }
        }
        return arrayList;
    }

    public static s i(c.k.a.b bVar, u uVar, Proxy proxy) {
        return uVar.o() == 407 ? bVar.a(proxy, uVar) : bVar.b(proxy, uVar);
    }

    public static long j(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static Map<String, List<String>> k(c.k.a.o oVar, String str) {
        TreeMap treeMap = new TreeMap(f18434a);
        for (int i2 = 0; i2 < oVar.f(); i2++) {
            String strD = oVar.d(i2);
            String strG = oVar.g(i2);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(strD);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(strG);
            treeMap.put(strD, Collections.unmodifiableList(arrayList));
        }
        if (str != null) {
            treeMap.put(null, Collections.unmodifiableList(Collections.singletonList(str)));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    public static Set<String> l(u uVar) {
        Set<String> setEmptySet = Collections.emptySet();
        c.k.a.o oVarS = uVar.s();
        for (int i2 = 0; i2 < oVarS.f(); i2++) {
            if ("Vary".equalsIgnoreCase(oVarS.d(i2))) {
                String strG = oVarS.g(i2);
                if (setEmptySet.isEmpty()) {
                    setEmptySet = new TreeSet<>((Comparator<? super String>) String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : strG.split(",")) {
                    setEmptySet.add(str.trim());
                }
            }
        }
        return setEmptySet;
    }

    public static c.k.a.o m(u uVar) {
        Set<String> setL = l(uVar);
        if (setL.isEmpty()) {
            return new o.b().e();
        }
        c.k.a.o oVarJ = uVar.v().y().j();
        o.b bVar = new o.b();
        for (int i2 = 0; i2 < oVarJ.f(); i2++) {
            String strD = oVarJ.d(i2);
            if (setL.contains(strD)) {
                bVar.b(strD, oVarJ.g(i2));
            }
        }
        return bVar.e();
    }

    public static boolean n(u uVar, c.k.a.o oVar, s sVar) {
        for (String str : l(uVar)) {
            if (!c.k.a.y.h.f(oVar.h(str), sVar.k(str))) {
                return false;
            }
        }
        return true;
    }
}
