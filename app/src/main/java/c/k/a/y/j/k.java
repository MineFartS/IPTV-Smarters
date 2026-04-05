package c.k.a.y.j;

import c.k.a.r;
import c.k.a.s;
import java.net.Proxy;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public final class k {
    public static String a(s sVar, Proxy.Type type, r rVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(sVar.m());
        sb.append(' ');
        boolean zB = b(sVar, type);
        URL urlP = sVar.p();
        if (zB) {
            sb.append(urlP);
        } else {
            sb.append(c(urlP));
        }
        sb.append(' ');
        sb.append(d(rVar));
        return sb.toString();
    }

    public static boolean b(s sVar, Proxy.Type type) {
        return !sVar.l() && type == Proxy.Type.HTTP;
    }

    public static String c(URL url) {
        String file = url.getFile();
        if (file == null) {
            return "/";
        }
        if (file.startsWith("/")) {
            return file;
        }
        return "/" + file;
    }

    public static String d(r rVar) {
        return rVar == r.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1";
    }
}
