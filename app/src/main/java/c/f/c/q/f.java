package c.f.c.q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f16178a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("lock")
    public static f0 f16179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f16180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f16181d;

    public f(Context context) {
        this.f16180c = context;
        this.f16181d = a.f16164a;
    }

    public f(Context context, ExecutorService executorService) {
        this.f16180c = context;
        this.f16181d = executorService;
    }

    public static c.f.a.c.o.i<Integer> a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        return b(context, "com.google.firebase.MESSAGING_EVENT").c(intent).h(h.a(), d.f16174a);
    }

    public static f0 b(Context context, String str) {
        f0 f0Var;
        synchronized (f16178a) {
            if (f16179b == null) {
                f16179b = new f0(context, "com.google.firebase.MESSAGING_EVENT");
            }
            f0Var = f16179b;
        }
        return f0Var;
    }

    public static final /* synthetic */ Integer c(c.f.a.c.o.i iVar) {
        return -1;
    }

    public static final /* synthetic */ c.f.a.c.o.i f(Context context, Intent intent, c.f.a.c.o.i iVar) {
        return (c.f.a.c.f.t.l.j() && ((Integer) iVar.k()).intValue() == 402) ? a(context, intent).h(h.a(), e.f16176a) : iVar;
    }

    public c.f.a.c.o.i<Integer> g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.f16180c, intent);
    }

    @SuppressLint({"InlinedApi"})
    public c.f.a.c.o.i<Integer> h(final Context context, final Intent intent) {
        boolean z = false;
        if (c.f.a.c.f.t.l.j() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        return (z && (intent.getFlags() & 268435456) == 0) ? a(context, intent) : c.f.a.c.o.l.c(this.f16181d, new Callable(context, intent) { // from class: c.f.c.q.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Context f16168a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Intent f16169b;

            {
                this.f16168a = context;
                this.f16169b = intent;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                return Integer.valueOf(x.b().g(this.f16168a, this.f16169b));
            }
        }).i(this.f16181d, new c.f.a.c.o.a(context, intent) { // from class: c.f.c.q.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Context f16171a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Intent f16172b;

            {
                this.f16171a = context;
                this.f16172b = intent;
            }

            @Override // c.f.a.c.o.a
            public Object a(c.f.a.c.o.i iVar) {
                return f.f(this.f16171a, this.f16172b, iVar);
            }
        });
    }
}
