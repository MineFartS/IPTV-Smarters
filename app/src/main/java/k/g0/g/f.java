package k.g0.g;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static boolean a(String str) {
        return str.equals(ClientConstants.HTTP_REQUEST_TYPE_POST) || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public static boolean b(String str) {
        return e(str) || str.equals("OPTIONS") || str.equals("DELETE") || str.equals("PROPFIND") || str.equals("MKCOL") || str.equals("LOCK");
    }

    public static boolean c(String str) {
        return !str.equals("PROPFIND");
    }

    public static boolean d(String str) {
        return str.equals("PROPFIND");
    }

    public static boolean e(String str) {
        return str.equals(ClientConstants.HTTP_REQUEST_TYPE_POST) || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }
}
