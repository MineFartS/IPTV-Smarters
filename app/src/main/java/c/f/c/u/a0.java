package c.f.c.u;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakReference<a0> f16339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f16340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y f16341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f16342d;

    public a0(SharedPreferences sharedPreferences, Executor executor) {
        this.f16342d = executor;
        this.f16340b = sharedPreferences;
    }

    public static synchronized a0 a(Context context, Executor executor) {
        WeakReference<a0> weakReference = f16339a;
        a0 a0Var = weakReference != null ? weakReference.get() : null;
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
        a0Var2.c();
        f16339a = new WeakReference<>(a0Var2);
        return a0Var2;
    }

    public synchronized z b() {
        return z.a(this.f16341c.e());
    }

    public final synchronized void c() {
        this.f16341c = y.c(this.f16340b, "topic_operation_queue", ",", this.f16342d);
    }

    public synchronized boolean d(z zVar) {
        return this.f16341c.f(zVar.e());
    }
}
