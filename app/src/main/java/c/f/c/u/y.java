package c.f.c.u;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f16420a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f16424e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque<String> f16423d = new ArrayDeque<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16425f = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16421b = "topic_operation_queue";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16422c = ",";

    public y(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f16420a = sharedPreferences;
        this.f16424e = executor;
    }

    public static y c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        y yVar = new y(sharedPreferences, "topic_operation_queue", ",", executor);
        yVar.d();
        return yVar;
    }

    public final boolean b(boolean z) {
        if (!z || this.f16425f) {
            return z;
        }
        i();
        return true;
    }

    public final void d() {
        synchronized (this.f16423d) {
            this.f16423d.clear();
            String string = this.f16420a.getString(this.f16421b, BuildConfig.FLAVOR);
            if (!TextUtils.isEmpty(string) && string.contains(this.f16422c)) {
                String[] strArrSplit = string.split(this.f16422c, -1);
                if (strArrSplit.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : strArrSplit) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f16423d.add(str);
                    }
                }
            }
        }
    }

    public String e() {
        String strPeek;
        synchronized (this.f16423d) {
            strPeek = this.f16423d.peek();
        }
        return strPeek;
    }

    public boolean f(Object obj) {
        boolean zRemove;
        synchronized (this.f16423d) {
            zRemove = this.f16423d.remove(obj);
            b(zRemove);
        }
        return zRemove;
    }

    public String g() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f16423d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f16422c);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void a() {
        synchronized (this.f16423d) {
            this.f16420a.edit().putString(this.f16421b, g()).commit();
        }
    }

    public final void i() {
        this.f16424e.execute(new Runnable(this) { // from class: c.f.c.u.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final y f16419b;

            {
                this.f16419b = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f16419b.a();
            }
        });
    }
}
