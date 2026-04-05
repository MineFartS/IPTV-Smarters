package c.f.a.c.d.u;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.KeyEvent;
import c.f.a.c.j.c.g7;
import c.f.a.c.j.c.j8;
import c.f.a.c.j.c.nc;
import c.f.a.c.j.c.u4;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b f11781b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f11783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j0 f11784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f11785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0 f11786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f11787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f11788i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f11789j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.f.a.c.j.c.o f11790k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.f.a.c.j.c.g f11791l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<t> f11792m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.f.a.c.j.c.x0 f11793n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SharedPreferences f11794o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f11780a = new c.f.a.c.d.v.b("CastContext");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f11782c = new Object();

    public b(Context context, c cVar, List<t> list, c.f.a.c.j.c.o oVar) {
        o0 o0VarE0;
        t0 t0VarG;
        Context applicationContext = context.getApplicationContext();
        this.f11783d = applicationContext;
        this.f11789j = cVar;
        this.f11790k = oVar;
        this.f11792m = list;
        n();
        j0 j0VarB = c.f.a.c.j.c.h.b(applicationContext, cVar, oVar, m());
        this.f11784e = j0VarB;
        try {
            o0VarE0 = j0VarB.e0();
        } catch (RemoteException e2) {
            f11780a.b(e2, "Unable to call %s on %s.", "getDiscoveryManagerImpl", j0.class.getSimpleName());
            o0VarE0 = null;
        }
        this.f11786g = o0VarE0 == null ? null : new i0(o0VarE0);
        try {
            t0VarG = this.f11784e.G();
        } catch (RemoteException e3) {
            f11780a.b(e3, "Unable to call %s on %s.", "getSessionManagerImpl", j0.class.getSimpleName());
            t0VarG = null;
        }
        r rVar = t0VarG == null ? null : new r(t0VarG, this.f11783d);
        this.f11785f = rVar;
        this.f11788i = new f(rVar);
        this.f11787h = rVar != null ? new h(this.f11789j, rVar, l(this.f11783d)) : null;
        l(this.f11783d).b(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).f(new c.f.a.c.o.f(this) { // from class: c.f.a.c.d.u.v

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f12118a;

            {
                this.f12118a = this;
            }

            @Override // c.f.a.c.o.f
            public final void a(Object obj) {
                this.f12118a.i((Bundle) obj);
            }
        });
    }

    public static b d() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return f11781b;
    }

    public static b e(Context context) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        if (f11781b == null) {
            synchronized (f11782c) {
                if (f11781b == null) {
                    g gVarJ = j(context.getApplicationContext());
                    try {
                        f11781b = new b(context, gVarJ.b(context.getApplicationContext()), gVarJ.a(context.getApplicationContext()), new c.f.a.c.j.c.o(a.t.l.g.f(context)));
                    } catch (z e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
        return f11781b;
    }

    public static boolean g(d dVar, double d2, boolean z) {
        if (z) {
            try {
                double dQ = dVar.q() + d2;
                if (dQ > 1.0d) {
                    dQ = 1.0d;
                }
                dVar.u(dQ);
            } catch (IOException | IllegalStateException e2) {
                f11780a.c("Unable to call CastSession.setVolume(double).", e2);
            }
        }
        return true;
    }

    public static b h(Context context) {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        try {
            return e(context);
        } catch (RuntimeException e2) {
            f11780a.c("Failed to load module from Google Play services. Cast will not work properly. Might due to outdated Google Play services. Ignoring this failure silently.", e2);
            return null;
        }
    }

    public static g j(Context context) {
        try {
            Bundle bundle = c.f.a.c.f.u.c.a(context).c(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f11780a.c("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (g) Class.forName(string).asSubclass(g.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e2) {
            throw new IllegalStateException("Failed to initialize CastContext.", e2);
        }
    }

    public static c.f.a.c.d.v.x l(Context context) {
        return new c.f.a.c.d.v.x(context);
    }

    public c a() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return this.f11789j;
    }

    public a.t.l.f b() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        try {
            return a.t.l.f.d(this.f11784e.V0());
        } catch (RemoteException e2) {
            f11780a.b(e2, "Unable to call %s on %s.", "getMergedSelectorAsBundle", j0.class.getSimpleName());
            return null;
        }
    }

    public r c() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return this.f11785f;
    }

    public boolean f(KeyEvent keyEvent) {
        d dVarC;
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        if (c.f.a.c.f.t.l.b() || (dVarC = this.f11785f.c()) == null || !dVarC.c()) {
            return false;
        }
        double dP = a().P();
        boolean z = keyEvent.getAction() == 0;
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 24) {
            g(dVarC, dP, z);
            return true;
        }
        if (keyCode != 25) {
            return false;
        }
        g(dVarC, -dP, z);
        return true;
    }

    public final /* synthetic */ void i(Bundle bundle) {
        if (c.f.a.c.j.c.x0.f13131a) {
            boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && this.f11785f != null;
            boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED");
            if (z || z2) {
                String packageName = this.f11783d.getPackageName();
                this.f11794o = this.f11783d.getApplicationContext().getSharedPreferences(String.format(Locale.ROOT, "%s.%s", this.f11783d.getPackageName(), "client_cast_analytics_data"), 0);
                c.f.a.a.j.r.f(this.f11783d);
                this.f11793n = c.f.a.c.j.c.x0.a(this.f11794o, c.f.a.a.j.r.c().g(c.f.a.a.i.a.f6016e).a("CAST_SENDER_SDK", j8.class, d0.f11831a), bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE"));
                if (z) {
                    l(this.f11783d).c(new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}).f(new c.f.a.c.o.f(this) { // from class: c.f.a.c.d.u.e0

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final b f11832a;

                        {
                            this.f11832a = this;
                        }

                        @Override // c.f.a.c.o.f
                        public final void a(Object obj) {
                            this.f11832a.k((Bundle) obj);
                        }
                    });
                }
                if (z2) {
                    nc.b(this.f11794o, this.f11793n, packageName);
                    nc.c(g7.CAST_CONTEXT);
                }
            }
        }
    }

    public final /* synthetic */ void k(Bundle bundle) {
        new u4(this.f11794o, this.f11793n, bundle, this.f11783d.getPackageName()).d(this.f11785f);
    }

    public final Map<String, IBinder> m() {
        HashMap map = new HashMap();
        c.f.a.c.j.c.g gVar = this.f11791l;
        if (gVar != null) {
            map.put(gVar.b(), this.f11791l.e());
        }
        List<t> list = this.f11792m;
        if (list != null) {
            for (t tVar : list) {
                c.f.a.c.f.q.o.j(tVar, "Additional SessionProvider must not be null.");
                String strF = c.f.a.c.f.q.o.f(tVar.b(), "Category for SessionProvider must not be null or empty string.");
                c.f.a.c.f.q.o.b(!map.containsKey(strF), String.format("SessionProvider for category %s already added", strF));
                map.put(strF, tVar.e());
            }
        }
        return map;
    }

    public final void n() {
        this.f11791l = !TextUtils.isEmpty(this.f11789j.L()) ? new c.f.a.c.j.c.g(this.f11783d, this.f11789j, this.f11790k) : null;
    }

    public final boolean o() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        try {
            return this.f11784e.h();
        } catch (RemoteException e2) {
            f11780a.b(e2, "Unable to call %s on %s.", "hasActivityInRecents", j0.class.getSimpleName());
            return false;
        }
    }

    public final i0 p() {
        c.f.a.c.f.q.o.d("Must be called from the main thread.");
        return this.f11786g;
    }
}
