package c.f.a.c.j.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class y3 implements h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, y3> f13653a = new a.f.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f13654b;

    public static y3 b(Context context, String str) {
        y3 y3Var;
        if (z2.a()) {
            throw null;
        }
        synchronized (y3.class) {
            y3Var = f13653a.get(null);
            if (y3Var == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    throw null;
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th;
                }
            }
        }
        return y3Var;
    }

    public static synchronized void c() {
        Map<String, y3> map = f13653a;
        Iterator<y3> it = map.values().iterator();
        if (it.hasNext()) {
            SharedPreferences sharedPreferences = it.next().f13654b;
            throw null;
        }
        map.clear();
    }

    @Override // c.f.a.c.j.h.h3
    public final Object a(String str) {
        throw null;
    }
}
