package k.g0.g;

import java.net.Proxy;
import k.a0;
import k.t;

/* JADX INFO: loaded from: classes2.dex */
public final class i {
    public static String a(a0 a0Var, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(a0Var.f());
        sb.append(' ');
        boolean zB = b(a0Var, type);
        t tVarH = a0Var.h();
        if (zB) {
            sb.append(tVarH);
        } else {
            sb.append(c(tVarH));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    public static boolean b(a0 a0Var, Proxy.Type type) {
        return !a0Var.e() && type == Proxy.Type.HTTP;
    }

    public static String c(t tVar) {
        String strH = tVar.h();
        String strJ = tVar.j();
        if (strJ == null) {
            return strH;
        }
        return strH + '?' + strJ;
    }
}
