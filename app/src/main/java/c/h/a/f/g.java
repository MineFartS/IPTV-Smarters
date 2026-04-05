package c.h.a.f;

import android.content.Context;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List<e> f16757a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static g f16758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f16759c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static String f16760a = "http://api-android.whmcssmarters.com/";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static String f16761b = "?/Android";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static String f16762c = "response_api.php";
    }

    public g(Context context) {
        this.f16759c = context;
    }

    public static e a(String str, String str2) {
        return new e(str, str2);
    }

    public void b(c<String> cVar) {
        new d(this.f16759c, a.f16761b, 1, cVar, "Form", f16757a, Boolean.FALSE).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    public void c(c<String> cVar) {
        new d(this.f16759c, a.f16762c, 1, cVar, "Form", f16757a, Boolean.FALSE).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }
}
