package c.f.a.c.f;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import c.f.a.c.f.q.o;
import c.f.a.c.f.q.s0;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
public final class h0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile s0 f12326e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Context f12328g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f12322a = new z(d0.K2("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f12323b = new a0(d0.K2("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f12324c = new b0(d0.K2("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f0 f12325d = new c0(d0.K2("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f12327f = new Object();

    public static synchronized void a(Context context) {
        if (f12328g != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f12328g = context.getApplicationContext();
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, c.f.a.c.g.a] */
    public static r0 b(String str, boolean z, boolean z2, boolean z3) {
        String strConcat;
        r0 r0VarE;
        l0 l0VarM0;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            o.i(f12328g);
            try {
                f();
                try {
                    l0VarM0 = f12326e.M0(new i0(str, z, false, c.f.a.c.g.b.K2(f12328g), false));
                } catch (RemoteException e2) {
                    e = e2;
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    strConcat = "module call";
                }
            } catch (DynamiteModule.a e3) {
                e = e3;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                String strValueOf = String.valueOf(e.getMessage());
                strConcat = strValueOf.length() != 0 ? "module init: ".concat(strValueOf) : new String("module init: ");
            }
            if (l0VarM0.zza()) {
                r0VarE = r0.b();
            } else {
                strConcat = l0VarM0.I();
                if (strConcat == null) {
                    strConcat = "error checking package certificate";
                }
                if (l0VarM0.J() == 4) {
                    e = new PackageManager.NameNotFoundException();
                    r0VarE = r0.e(strConcat, e);
                } else {
                    r0VarE = r0.d(strConcat);
                }
            }
            return r0VarE;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static r0 c(String str, d0 d0Var, boolean z, boolean z2) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return g(str, d0Var, z, z2);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static boolean d() {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                f();
                return f12326e.f();
            } catch (RemoteException | DynamiteModule.a e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return false;
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static void f() {
        if (f12326e != null) {
            return;
        }
        o.i(f12328g);
        synchronized (f12327f) {
            if (f12326e == null) {
                f12326e = c.f.a.c.f.q.r0.c1(DynamiteModule.e(f12328g, DynamiteModule.f24263e, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }

    public static r0 g(final String str, final d0 d0Var, final boolean z, boolean z2) {
        try {
            f();
            o.i(f12328g);
            try {
                return f12326e.g1(new n0(str, d0Var, z, z2), c.f.a.c.g.b.K2(f12328g.getPackageManager())) ? r0.b() : r0.c(new Callable(z, str, d0Var) { // from class: c.f.a.c.f.y

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final boolean f12727a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final String f12728b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final d0 f12729c;

                    {
                        this.f12727a = z;
                        this.f12728b = str;
                        this.f12729c = d0Var;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z3 = this.f12727a;
                        String str2 = this.f12728b;
                        d0 d0Var2 = this.f12729c;
                        return r0.g(str2, d0Var2, z3, !z3 && h0.g(str2, d0Var2, true, false).f12689b);
                    }
                });
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return r0.e("module call", e2);
            }
        } catch (DynamiteModule.a e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            String strValueOf = String.valueOf(e3.getMessage());
            return r0.e(strValueOf.length() != 0 ? "module init: ".concat(strValueOf) : new String("module init: "), e3);
        }
    }
}
