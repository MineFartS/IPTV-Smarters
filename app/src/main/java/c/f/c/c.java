package c.f.c;

import a.i.n.j;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import c.f.a.c.f.o.n.c;
import c.f.a.c.f.q.o;
import c.f.a.c.f.t.l;
import c.f.a.c.f.t.m;
import c.f.c.k.n;
import c.f.c.k.w;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f16018a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Executor f16019b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("LOCK")
    public static final Map<String, c> f16020c = new a.f.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f16021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f16023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f16024g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w<c.f.c.t.a> f16027j;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f16025h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f16026i = new AtomicBoolean();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<b> f16028k = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<?> f16029l = new CopyOnWriteArrayList();

    public interface b {
        void a(boolean z);
    }

    /* JADX INFO: renamed from: c.f.c.c$c, reason: collision with other inner class name */
    @TargetApi(14)
    public static class C0193c implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static AtomicReference<C0193c> f16030a = new AtomicReference<>();

        public static void c(Context context) {
            if (l.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f16030a.get() == null) {
                    C0193c c0193c = new C0193c();
                    if (f16030a.compareAndSet(null, c0193c)) {
                        c.f.a.c.f.o.n.c.c(application);
                        c.f.a.c.f.o.n.c.b().a(c0193c);
                    }
                }
            }
        }

        @Override // c.f.a.c.f.o.n.c.a
        public void a(boolean z) {
            synchronized (c.f16018a) {
                for (c cVar : new ArrayList(c.f16020c.values())) {
                    if (cVar.f16025h.get()) {
                        cVar.t(z);
                    }
                }
            }
        }
    }

    public static class d implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Handler f16031a = new Handler(Looper.getMainLooper());

        public d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f16031a.post(runnable);
        }
    }

    @TargetApi(24)
    public static class e extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static AtomicReference<e> f16032a = new AtomicReference<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f16033b;

        public e(Context context) {
            this.f16033b = context;
        }

        public static void b(Context context) {
            if (f16032a.get() == null) {
                e eVar = new e(context);
                if (f16032a.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f16033b.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (c.f16018a) {
                Iterator<c> it = c.f16020c.values().iterator();
                while (it.hasNext()) {
                    it.next().l();
                }
            }
            c();
        }
    }

    public c(Context context, String str, i iVar) {
        this.f16021d = (Context) o.i(context);
        this.f16022e = o.e(str);
        this.f16023f = (i) o.i(iVar);
        this.f16024g = n.e(f16019b).c(c.f.c.k.g.b(context, ComponentDiscoveryService.class).a()).b(new FirebaseCommonRegistrar()).a(c.f.c.k.d.n(context, Context.class, new Class[0])).a(c.f.c.k.d.n(this, c.class, new Class[0])).a(c.f.c.k.d.n(iVar, i.class, new Class[0])).d();
        this.f16027j = new w<>(c.f.c.b.a(this, context));
    }

    public static c h() {
        c cVar;
        synchronized (f16018a) {
            cVar = f16020c.get("[DEFAULT]");
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + m.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    public static c m(Context context) {
        synchronized (f16018a) {
            if (f16020c.containsKey("[DEFAULT]")) {
                return h();
            }
            i iVarA = i.a(context);
            if (iVarA == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return n(context, iVarA);
        }
    }

    public static c n(Context context, i iVar) {
        return o(context, iVar, "[DEFAULT]");
    }

    public static c o(Context context, i iVar, String str) {
        c cVar;
        C0193c.c(context);
        String strS = s(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f16018a) {
            Map<String, c> map = f16020c;
            o.m(!map.containsKey(strS), "FirebaseApp name " + strS + " already exists!");
            o.j(context, "Application context cannot be null.");
            cVar = new c(context, strS, iVar);
            map.put(strS, cVar);
        }
        cVar.l();
        return cVar;
    }

    public static /* synthetic */ c.f.c.t.a r(c cVar, Context context) {
        return new c.f.c.t.a(context, cVar.k(), (c.f.c.o.c) cVar.f16024g.a(c.f.c.o.c.class));
    }

    public static String s(String str) {
        return str.trim();
    }

    public final void e() {
        o.m(!this.f16026i.get(), "FirebaseApp was deleted");
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f16022e.equals(((c) obj).i());
        }
        return false;
    }

    public <T> T f(Class<T> cls) {
        e();
        return (T) this.f16024g.a(cls);
    }

    public Context g() {
        e();
        return this.f16021d;
    }

    public int hashCode() {
        return this.f16022e.hashCode();
    }

    public String i() {
        e();
        return this.f16022e;
    }

    public i j() {
        e();
        return this.f16023f;
    }

    public String k() {
        return c.f.a.c.f.t.c.a(i().getBytes(Charset.defaultCharset())) + "+" + c.f.a.c.f.t.c.a(j().c().getBytes(Charset.defaultCharset()));
    }

    public final void l() {
        if (!j.a(this.f16021d)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + i());
            e.b(this.f16021d);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + i());
        this.f16024g.h(q());
    }

    public boolean p() {
        e();
        return this.f16027j.get().b();
    }

    public boolean q() {
        return "[DEFAULT]".equals(i());
    }

    public final void t(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<b> it = this.f16028k.iterator();
        while (it.hasNext()) {
            it.next().a(z);
        }
    }

    public String toString() {
        return c.f.a.c.f.q.n.c(this).a("name", this.f16022e).a("options", this.f16023f).toString();
    }
}
