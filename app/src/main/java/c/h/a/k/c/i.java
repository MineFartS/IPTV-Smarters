package c.h.a.k.c;

import android.content.Context;
import android.os.Build;
import c.f.a.b.c1;
import c.f.a.b.c3.o;
import c.f.a.b.c3.x;
import c.f.a.b.h3.k0;
import c.f.a.b.i3.c0;
import c.f.a.b.i3.p;
import c.f.a.b.i3.p0.d;
import c.f.a.b.i3.p0.r;
import c.f.a.b.i3.p0.s;
import c.f.a.b.i3.w;
import c.f.a.b.i3.x;
import c.f.a.b.j3.z;
import c.f.a.b.l2;
import c.f.a.b.y2.b.b;
import java.io.File;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.concurrent.Executors;
import org.chromium.net.CronetEngine;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f17774a = "ExoPlayerDemo/2.15.0 (Linux; Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.15.0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p.a f17775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c0.b f17776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c.f.a.b.u2.b f17777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static File f17778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static c.f.a.b.i3.p0.b f17779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static x f17780g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static j f17781h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static k0 f17782i;

    public static d.c a(p.a aVar, c.f.a.b.i3.p0.b bVar) {
        return new d.c().i(bVar).l(aVar).j(null).k(2);
    }

    public static l2 b(Context context, boolean z) {
        return new c1(context.getApplicationContext()).i(m() ? z ? 2 : 1 : 0);
    }

    public static synchronized void c(Context context) {
        if (f17780g == null) {
            c.f.a.b.c3.p pVar = new c.f.a.b.c3.p(e(context));
            l(context, "actions", pVar, false);
            l(context, "tracked_actions", pVar, true);
            f17780g = new x(context, e(context), f(context), k(context), Executors.newFixedThreadPool(6));
            f17781h = new j(context, k(context), f17780g);
        }
    }

    public static synchronized p.a d(Context context) {
        if (f17775b == null) {
            Context applicationContext = context.getApplicationContext();
            f17775b = a(new w(applicationContext, k(applicationContext)), f(applicationContext));
        }
        return f17775b;
    }

    public static synchronized c.f.a.b.u2.b e(Context context) {
        if (f17777d == null) {
            f17777d = new c.f.a.b.u2.c(context);
        }
        return f17777d;
    }

    public static synchronized c.f.a.b.i3.p0.b f(Context context) {
        if (f17779f == null) {
            f17779f = new s(new File(g(context), "downloads"), new r(), e(context));
        }
        return f17779f;
    }

    public static synchronized File g(Context context) {
        if (f17778e == null) {
            File externalFilesDir = context.getExternalFilesDir(null);
            f17778e = externalFilesDir;
            if (externalFilesDir == null) {
                f17778e = context.getFilesDir();
            }
        }
        return f17778e;
    }

    public static synchronized x h(Context context) {
        c(context);
        return f17780g;
    }

    public static synchronized k0 i(Context context) {
        if (f17782i == null) {
            f17782i = new k0(context, "download_channel");
        }
        return f17782i;
    }

    public static synchronized j j(Context context) {
        c(context);
        return f17781h;
    }

    public static synchronized c0.b k(Context context) {
        if (f17776c == null) {
            Context applicationContext = context.getApplicationContext();
            String str = f17774a;
            CronetEngine cronetEngineA = c.f.a.b.y2.b.c.a(applicationContext, str, false);
            if (cronetEngineA != null) {
                f17776c = new b.C0142b(cronetEngineA, Executors.newSingleThreadExecutor());
            }
            if (f17776c == null) {
                CookieManager cookieManager = new CookieManager();
                cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
                CookieHandler.setDefault(cookieManager);
                f17776c = new x.b().c(str);
            }
        }
        return f17776c;
    }

    public static synchronized void l(Context context, String str, c.f.a.b.c3.p pVar, boolean z) {
        try {
            o.b(new File(g(context), str), null, pVar, true, z);
        } catch (IOException e2) {
            z.e("DemoUtil", "Failed to upgrade action file: " + str, e2);
        }
    }

    public static boolean m() {
        return true;
    }
}
