package c.f.a.c.j.g;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static <T> T a(Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
