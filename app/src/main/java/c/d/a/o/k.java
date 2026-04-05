package c.d.a.o;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f5871b = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile c.d.a.j f5872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<FragmentManager, j> f5873d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<a.l.d.n, n> f5874e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f5875f = new Handler(Looper.getMainLooper(), this);

    @TargetApi(17)
    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    public static k f() {
        return f5871b;
    }

    @TargetApi(11)
    public c.d.a.j b(Context context, FragmentManager fragmentManager) {
        j jVarH = h(fragmentManager);
        c.d.a.j jVarC = jVarH.c();
        if (jVarC != null) {
            return jVarC;
        }
        c.d.a.j jVar = new c.d.a.j(context, jVarH.b(), jVarH.d());
        jVarH.f(jVar);
        return jVar;
    }

    @TargetApi(11)
    public c.d.a.j c(Activity activity) {
        if (c.d.a.t.h.h() || Build.VERSION.SDK_INT < 11) {
            return d(activity.getApplicationContext());
        }
        a(activity);
        return b(activity, activity.getFragmentManager());
    }

    public c.d.a.j d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (c.d.a.t.h.i() && !(context instanceof Application)) {
            if (context instanceof a.l.d.e) {
                return e((a.l.d.e) context);
            }
            if (context instanceof Activity) {
                return c((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                return d(((ContextWrapper) context).getBaseContext());
            }
        }
        return g(context);
    }

    public c.d.a.j e(a.l.d.e eVar) {
        if (c.d.a.t.h.h()) {
            return d(eVar.getApplicationContext());
        }
        a(eVar);
        return j(eVar, eVar.getSupportFragmentManager());
    }

    public final c.d.a.j g(Context context) {
        if (this.f5872c == null) {
            synchronized (this) {
                if (this.f5872c == null) {
                    this.f5872c = new c.d.a.j(context.getApplicationContext(), new b(), new f());
                }
            }
        }
        return this.f5872c;
    }

    @TargetApi(17)
    public j h(FragmentManager fragmentManager) {
        j jVar = (j) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = this.f5873d.get(fragmentManager);
        if (jVar2 != null) {
            return jVar2;
        }
        j jVar3 = new j();
        this.f5873d.put(fragmentManager, jVar3);
        fragmentManager.beginTransaction().add(jVar3, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.f5875f.obtainMessage(1, fragmentManager).sendToTarget();
        return jVar3;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        Object obj2;
        int i2 = message.what;
        Object objRemove = null;
        boolean z = true;
        if (i2 == 1) {
            obj = (FragmentManager) message.obj;
            map = this.f5873d;
        } else {
            if (i2 != 2) {
                z = false;
                obj2 = null;
                if (z && objRemove == null && Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
                }
                return z;
            }
            obj = (a.l.d.n) message.obj;
            map = this.f5874e;
        }
        Object obj3 = obj;
        objRemove = map.remove(obj);
        obj2 = obj3;
        if (z) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z;
    }

    public n i(a.l.d.n nVar) {
        n nVar2 = (n) nVar.i0("com.bumptech.glide.manager");
        if (nVar2 != null) {
            return nVar2;
        }
        n nVar3 = this.f5874e.get(nVar);
        if (nVar3 != null) {
            return nVar3;
        }
        n nVar4 = new n();
        this.f5874e.put(nVar, nVar4);
        nVar.m().e(nVar4, "com.bumptech.glide.manager").k();
        this.f5875f.obtainMessage(2, nVar).sendToTarget();
        return nVar4;
    }

    public c.d.a.j j(Context context, a.l.d.n nVar) {
        n nVarI = i(nVar);
        c.d.a.j jVarO = nVarI.o();
        if (jVarO != null) {
            return jVarO;
        }
        c.d.a.j jVar = new c.d.a.j(context, nVarI.n(), nVarI.q());
        nVarI.u(jVar);
        return jVar;
    }
}
