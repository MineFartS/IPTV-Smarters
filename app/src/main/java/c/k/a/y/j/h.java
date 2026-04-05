package c.k.a.y.j;

import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<String> f18431a = new LinkedHashSet(Arrays.asList("OPTIONS", "GET", "HEAD", ClientConstants.HTTP_REQUEST_TYPE_POST, "PUT", "DELETE", "TRACE", "PATCH"));

    public static boolean a(String str) {
        return str.equals(ClientConstants.HTTP_REQUEST_TYPE_POST) || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE");
    }

    public static boolean b(String str) {
        return c(str) || str.equals("DELETE");
    }

    public static boolean c(String str) {
        return str.equals(ClientConstants.HTTP_REQUEST_TYPE_POST) || str.equals("PUT") || str.equals("PATCH");
    }
}
