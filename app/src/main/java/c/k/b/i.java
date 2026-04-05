package c.k.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import c.k.b.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f18702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f18703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f18704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f18705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, c.k.b.c> f18706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<Object, c.k.b.a> f18707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<Object, c.k.b.a> f18708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set<Object> f18709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f18710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f18711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f18712k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a0 f18713l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<c.k.b.c> f18714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f18715n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f18716o;
    public boolean p;

    public static class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f18717a;

        /* JADX INFO: renamed from: c.k.b.i$a$a, reason: collision with other inner class name */
        public class RunnableC0251a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Message f18718b;

            public RunnableC0251a(Message message) {
                this.f18718b = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f18718b.what);
            }
        }

        public a(Looper looper, i iVar) {
            super(looper);
            this.f18717a = iVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f18717a.v((c.k.b.a) message.obj);
                    break;
                case 2:
                    this.f18717a.o((c.k.b.a) message.obj);
                    break;
                case 3:
                case 8:
                default:
                    t.f18744a.post(new RunnableC0251a(message));
                    break;
                case 4:
                    this.f18717a.p((c.k.b.c) message.obj);
                    break;
                case 5:
                    this.f18717a.u((c.k.b.c) message.obj);
                    break;
                case 6:
                    this.f18717a.q((c.k.b.c) message.obj, false);
                    break;
                case 7:
                    this.f18717a.n();
                    break;
                case 9:
                    this.f18717a.r((NetworkInfo) message.obj);
                    break;
                case 10:
                    this.f18717a.m(message.arg1 == 1);
                    break;
                case 11:
                    this.f18717a.s(message.obj);
                    break;
                case 12:
                    this.f18717a.t(message.obj);
                    break;
            }
        }
    }

    public static class b extends HandlerThread {
        public b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    public static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f18720a;

        public c(i iVar) {
            this.f18720a = iVar;
        }

        public void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f18720a.f18716o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f18720a.f18703b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra("state")) {
                    this.f18720a.b(intent.getBooleanExtra("state", false));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.f18720a.f(((ConnectivityManager) g0.p(context, "connectivity")).getActiveNetworkInfo());
            }
        }
    }

    public i(Context context, ExecutorService executorService, Handler handler, j jVar, d dVar, a0 a0Var) {
        b bVar = new b();
        this.f18702a = bVar;
        bVar.start();
        g0.j(bVar.getLooper());
        this.f18703b = context;
        this.f18704c = executorService;
        this.f18706e = new LinkedHashMap();
        this.f18707f = new WeakHashMap();
        this.f18708g = new WeakHashMap();
        this.f18709h = new HashSet();
        this.f18710i = new a(bVar.getLooper(), this);
        this.f18705d = jVar;
        this.f18711j = handler;
        this.f18712k = dVar;
        this.f18713l = a0Var;
        this.f18714m = new ArrayList(4);
        this.p = g0.r(context);
        this.f18716o = g0.q(context, "android.permission.ACCESS_NETWORK_STATE");
        c cVar = new c(this);
        this.f18715n = cVar;
        cVar.a();
    }

    public final void a(c.k.b.c cVar) {
        if (cVar.s()) {
            return;
        }
        this.f18714m.add(cVar);
        if (this.f18710i.hasMessages(7)) {
            return;
        }
        this.f18710i.sendEmptyMessageDelayed(7, 200L);
    }

    public void b(boolean z) {
        Handler handler = this.f18710i;
        handler.sendMessage(handler.obtainMessage(10, z ? 1 : 0, 0));
    }

    public void c(c.k.b.a aVar) {
        Handler handler = this.f18710i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    public void d(c.k.b.c cVar) {
        Handler handler = this.f18710i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    public void e(c.k.b.c cVar) {
        Handler handler = this.f18710i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    public void f(NetworkInfo networkInfo) {
        Handler handler = this.f18710i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    public void g(c.k.b.c cVar) {
        Handler handler = this.f18710i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500L);
    }

    public void h(c.k.b.a aVar) {
        Handler handler = this.f18710i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    public final void i() {
        if (this.f18707f.isEmpty()) {
            return;
        }
        Iterator<c.k.b.a> it = this.f18707f.values().iterator();
        while (it.hasNext()) {
            c.k.b.a next = it.next();
            it.remove();
            if (next.g().p) {
                g0.u("Dispatcher", "replaying", next.i().d());
            }
            w(next, false);
        }
    }

    public final void j(List<c.k.b.c> list) {
        if (list == null || list.isEmpty() || !list.get(0).o().p) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (c.k.b.c cVar : list) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(g0.l(cVar));
        }
        g0.u("Dispatcher", "delivered", sb.toString());
    }

    public final void k(c.k.b.a aVar) {
        Object objK = aVar.k();
        if (objK != null) {
            aVar.f18635k = true;
            this.f18707f.put(objK, aVar);
        }
    }

    public final void l(c.k.b.c cVar) {
        c.k.b.a aVarH = cVar.h();
        if (aVarH != null) {
            k(aVarH);
        }
        List<c.k.b.a> listI = cVar.i();
        if (listI != null) {
            int size = listI.size();
            for (int i2 = 0; i2 < size; i2++) {
                k(listI.get(i2));
            }
        }
    }

    public void m(boolean z) {
        this.p = z;
    }

    public void n() {
        ArrayList arrayList = new ArrayList(this.f18714m);
        this.f18714m.clear();
        Handler handler = this.f18711j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        j(arrayList);
    }

    public void o(c.k.b.a aVar) {
        String strD = aVar.d();
        c.k.b.c cVar = this.f18706e.get(strD);
        if (cVar != null) {
            cVar.f(aVar);
            if (cVar.c()) {
                this.f18706e.remove(strD);
                if (aVar.g().p) {
                    g0.u("Dispatcher", "canceled", aVar.i().d());
                }
            }
        }
        if (this.f18709h.contains(aVar.j())) {
            this.f18708g.remove(aVar.k());
            if (aVar.g().p) {
                g0.v("Dispatcher", "canceled", aVar.i().d(), "because paused request got canceled");
            }
        }
        c.k.b.a aVarRemove = this.f18707f.remove(aVar.k());
        if (aVarRemove == null || !aVarRemove.g().p) {
            return;
        }
        g0.v("Dispatcher", "canceled", aVarRemove.i().d(), "from replaying");
    }

    public void p(c.k.b.c cVar) {
        if (p.shouldWriteToMemoryCache(cVar.n())) {
            this.f18712k.b(cVar.l(), cVar.q());
        }
        this.f18706e.remove(cVar.l());
        a(cVar);
        if (cVar.o().p) {
            g0.v("Dispatcher", "batched", g0.l(cVar), "for completion");
        }
    }

    public void q(c.k.b.c cVar, boolean z) {
        if (cVar.o().p) {
            String strL = g0.l(cVar);
            StringBuilder sb = new StringBuilder();
            sb.append("for error");
            sb.append(z ? " (will replay)" : BuildConfig.FLAVOR);
            g0.v("Dispatcher", "batched", strL, sb.toString());
        }
        this.f18706e.remove(cVar.l());
        a(cVar);
    }

    public void r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f18704c;
        if (executorService instanceof v) {
            ((v) executorService).a(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        i();
    }

    public void s(Object obj) {
        if (this.f18709h.add(obj)) {
            Iterator<c.k.b.c> it = this.f18706e.values().iterator();
            while (it.hasNext()) {
                c.k.b.c next = it.next();
                boolean z = next.o().p;
                c.k.b.a aVarH = next.h();
                List<c.k.b.a> listI = next.i();
                boolean z2 = (listI == null || listI.isEmpty()) ? false : true;
                if (aVarH != null || z2) {
                    if (aVarH != null && aVarH.j().equals(obj)) {
                        next.f(aVarH);
                        this.f18708g.put(aVarH.k(), aVarH);
                        if (z) {
                            g0.v("Dispatcher", "paused", aVarH.f18626b.d(), "because tag '" + obj + "' was paused");
                        }
                    }
                    if (z2) {
                        for (int size = listI.size() - 1; size >= 0; size--) {
                            c.k.b.a aVar = listI.get(size);
                            if (aVar.j().equals(obj)) {
                                next.f(aVar);
                                this.f18708g.put(aVar.k(), aVar);
                                if (z) {
                                    g0.v("Dispatcher", "paused", aVar.f18626b.d(), "because tag '" + obj + "' was paused");
                                }
                            }
                        }
                    }
                    if (next.c()) {
                        it.remove();
                        if (z) {
                            g0.v("Dispatcher", "canceled", g0.l(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    public void t(Object obj) {
        if (this.f18709h.remove(obj)) {
            ArrayList arrayList = null;
            Iterator<c.k.b.a> it = this.f18708g.values().iterator();
            while (it.hasNext()) {
                c.k.b.a next = it.next();
                if (next.j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f18711j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    public void u(c.k.b.c cVar) {
        if (cVar.s()) {
            return;
        }
        boolean z = false;
        if (this.f18704c.isShutdown()) {
            q(cVar, false);
            return;
        }
        NetworkInfo activeNetworkInfo = this.f18716o ? ((ConnectivityManager) g0.p(this.f18703b, "connectivity")).getActiveNetworkInfo() : null;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zU = cVar.u(this.p, activeNetworkInfo);
        boolean zV = cVar.v();
        if (!zU) {
            if (this.f18716o && zV) {
                z = true;
            }
            q(cVar, z);
            if (z) {
                l(cVar);
                return;
            }
            return;
        }
        if (this.f18716o && !z2) {
            q(cVar, zV);
            if (zV) {
                l(cVar);
                return;
            }
            return;
        }
        if (cVar.o().p) {
            g0.u("Dispatcher", "retrying", g0.l(cVar));
        }
        if (cVar.k() instanceof r.a) {
            cVar.f18683n |= q.NO_CACHE.index;
        }
        cVar.s = this.f18704c.submit(cVar);
    }

    public void v(c.k.b.a aVar) {
        w(aVar, true);
    }

    public void w(c.k.b.a aVar, boolean z) {
        if (this.f18709h.contains(aVar.j())) {
            this.f18708g.put(aVar.k(), aVar);
            if (aVar.g().p) {
                g0.v("Dispatcher", "paused", aVar.f18626b.d(), "because tag '" + aVar.j() + "' is paused");
                return;
            }
            return;
        }
        c.k.b.c cVar = this.f18706e.get(aVar.d());
        if (cVar != null) {
            cVar.b(aVar);
            return;
        }
        if (this.f18704c.isShutdown()) {
            if (aVar.g().p) {
                g0.v("Dispatcher", "ignored", aVar.f18626b.d(), "because shut down");
                return;
            }
            return;
        }
        c.k.b.c cVarG = c.k.b.c.g(aVar.g(), this, this.f18712k, this.f18713l, aVar);
        cVarG.s = this.f18704c.submit(cVarG);
        this.f18706e.put(aVar.d(), cVarG);
        if (z) {
            this.f18707f.remove(aVar.k());
        }
        if (aVar.g().p) {
            g0.u("Dispatcher", "enqueued", aVar.f18626b.d());
        }
    }
}
