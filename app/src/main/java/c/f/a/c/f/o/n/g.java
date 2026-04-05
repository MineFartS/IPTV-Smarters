package c.f.a.c.f.o.n;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.o.a;
import c.f.a.c.f.o.n.j;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes2.dex */
public class g implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RecentlyNonNull
    public static final Status f12396b = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Status f12397c = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f12398d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("lock")
    public static g f12399e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.f.a.c.f.q.s f12404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.f.a.c.f.q.u f12405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f12406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c.f.a.c.f.e f12407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c.f.a.c.f.q.h0 f12408n;

    @NotOnlyInitialized
    public final Handler u;
    public volatile boolean v;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12400f = 5000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12401g = 120000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12402h = 10000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12403i = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicInteger f12409o = new AtomicInteger(1);
    public final AtomicInteger p = new AtomicInteger(0);
    public final Map<b<?>, d0<?>> q = new ConcurrentHashMap(5, 0.75f, 1);

    @GuardedBy("lock")
    public u r = null;

    @GuardedBy("lock")
    public final Set<b<?>> s = new a.f.b();
    public final Set<b<?>> t = new a.f.b();

    public g(Context context, Looper looper, c.f.a.c.f.e eVar) {
        this.v = true;
        this.f12406l = context;
        c.f.a.c.j.b.e eVar2 = new c.f.a.c.j.b.e(looper, this);
        this.u = eVar2;
        this.f12407m = eVar;
        this.f12408n = new c.f.a.c.f.q.h0(eVar);
        if (c.f.a.c.f.t.h.a(context)) {
            this.v = false;
        }
        eVar2.sendMessage(eVar2.obtainMessage(6));
    }

    public static /* synthetic */ boolean a(g gVar, boolean z) {
        gVar.f12403i = true;
        return true;
    }

    public static Status j(b<?> bVar, c.f.a.c.f.b bVar2) {
        String strB = bVar.b();
        String strValueOf = String.valueOf(bVar2);
        StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 63 + strValueOf.length());
        sb.append("API: ");
        sb.append(strB);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(strValueOf);
        return new Status(bVar2, sb.toString());
    }

    @RecentlyNonNull
    public static g m(@RecentlyNonNull Context context) {
        g gVar;
        synchronized (f12398d) {
            if (f12399e == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f12399e = new g(context.getApplicationContext(), handlerThread.getLooper(), c.f.a.c.f.e.n());
            }
            gVar = f12399e;
        }
        return gVar;
    }

    public final void A(@RecentlyNonNull c.f.a.c.f.b bVar, int i2) {
        if (z(bVar, i2)) {
            return;
        }
        Handler handler = this.u;
        handler.sendMessage(handler.obtainMessage(5, i2, 0, bVar));
    }

    public final void B(c.f.a.c.f.q.m mVar, int i2, long j2, int i3) {
        Handler handler = this.u;
        handler.sendMessage(handler.obtainMessage(18, new m0(mVar, i2, j2, i3)));
    }

    public final d0<?> h(c.f.a.c.f.o.e<?> eVar) {
        Object apiKey = eVar.getApiKey();
        d0<?> d0Var = this.q.get(apiKey);
        if (d0Var == null) {
            d0Var = new d0<>(this, eVar);
            this.q.put((b<?>) apiKey, d0Var);
        }
        if (d0Var.C()) {
            this.t.add((b<?>) apiKey);
        }
        d0Var.z();
        return d0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@RecentlyNonNull Message message) {
        c.f.a.c.o.j<Boolean> jVarB;
        Boolean boolValueOf;
        int i2 = message.what;
        d0<?> d0Var = null;
        switch (i2) {
            case 1:
                this.f12402h = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.u.removeMessages(12);
                for (b<?> bVar : this.q.keySet()) {
                    Handler handler = this.u;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.f12402h);
                }
                return true;
            case 2:
                k1 k1Var = (k1) message.obj;
                Iterator<b<?>> it = k1Var.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        b<?> next = it.next();
                        d0<?> d0Var2 = this.q.get(next);
                        if (d0Var2 == null) {
                            k1Var.b(next, new c.f.a.c.f.b(13), null);
                        } else if (d0Var2.B()) {
                            k1Var.b(next, c.f.a.c.f.b.f12298b, d0Var2.s().getEndpointPackageName());
                        } else {
                            c.f.a.c.f.b bVarV = d0Var2.v();
                            if (bVarV != null) {
                                k1Var.b(next, bVarV, null);
                            } else {
                                d0Var2.A(k1Var);
                                d0Var2.z();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (d0<?> d0Var3 : this.q.values()) {
                    d0Var3.u();
                    d0Var3.z();
                }
                return true;
            case 4:
            case 8:
            case 13:
                q0 q0Var = (q0) message.obj;
                d0<?> d0VarH = this.q.get(q0Var.f12486c.getApiKey());
                if (d0VarH == null) {
                    d0VarH = h(q0Var.f12486c);
                }
                if (!d0VarH.C() || this.p.get() == q0Var.f12485b) {
                    d0VarH.q(q0Var.f12484a);
                } else {
                    q0Var.f12484a.a(f12396b);
                    d0VarH.r();
                }
                return true;
            case 5:
                int i3 = message.arg1;
                c.f.a.c.f.b bVar2 = (c.f.a.c.f.b) message.obj;
                Iterator<d0<?>> it2 = this.q.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        d0<?> next2 = it2.next();
                        if (next2.D() == i3) {
                            d0Var = next2;
                        }
                    }
                }
                if (d0Var == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i3);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                } else if (bVar2.I() == 13) {
                    String strE = this.f12407m.e(bVar2.I());
                    String strJ = bVar2.J();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strE).length() + 69 + String.valueOf(strJ).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(strE);
                    sb2.append(": ");
                    sb2.append(strJ);
                    d0Var.i(new Status(17, sb2.toString()));
                } else {
                    d0Var.i(j(d0Var.f12379d, bVar2));
                }
                return true;
            case 6:
                if (this.f12406l.getApplicationContext() instanceof Application) {
                    c.c((Application) this.f12406l.getApplicationContext());
                    c.b().a(new y(this));
                    if (!c.b().e(true)) {
                        this.f12402h = 300000L;
                    }
                }
                return true;
            case 7:
                h((c.f.a.c.f.o.e) message.obj);
                return true;
            case 9:
                if (this.q.containsKey(message.obj)) {
                    this.q.get(message.obj).w();
                }
                return true;
            case 10:
                Iterator<b<?>> it3 = this.t.iterator();
                while (it3.hasNext()) {
                    d0<?> d0VarRemove = this.q.remove(it3.next());
                    if (d0VarRemove != null) {
                        d0VarRemove.r();
                    }
                }
                this.t.clear();
                return true;
            case 11:
                if (this.q.containsKey(message.obj)) {
                    this.q.get(message.obj).x();
                }
                return true;
            case 12:
                if (this.q.containsKey(message.obj)) {
                    this.q.get(message.obj).y();
                }
                return true;
            case 14:
                v vVar = (v) message.obj;
                b<?> bVarA = vVar.a();
                if (this.q.containsKey(bVarA)) {
                    boolean zL = this.q.get(bVarA).l(false);
                    jVarB = vVar.b();
                    boolValueOf = Boolean.valueOf(zL);
                } else {
                    jVarB = vVar.b();
                    boolValueOf = Boolean.FALSE;
                }
                jVarB.c(boolValueOf);
                return true;
            case 15:
                e0 e0Var = (e0) message.obj;
                if (this.q.containsKey(e0Var.f12390a)) {
                    d0.H(this.q.get(e0Var.f12390a), e0Var);
                }
                return true;
            case 16:
                e0 e0Var2 = (e0) message.obj;
                if (this.q.containsKey(e0Var2.f12390a)) {
                    d0.I(this.q.get(e0Var2.f12390a), e0Var2);
                }
                return true;
            case 17:
                k();
                return true;
            case 18:
                m0 m0Var = (m0) message.obj;
                if (m0Var.f12457c == 0) {
                    l().a(new c.f.a.c.f.q.s(m0Var.f12456b, Arrays.asList(m0Var.f12455a)));
                } else {
                    c.f.a.c.f.q.s sVar = this.f12404j;
                    if (sVar != null) {
                        List<c.f.a.c.f.q.m> listJ = sVar.J();
                        if (this.f12404j.I() != m0Var.f12456b || (listJ != null && listJ.size() >= m0Var.f12458d)) {
                            this.u.removeMessages(17);
                            k();
                        } else {
                            this.f12404j.K(m0Var.f12455a);
                        }
                    }
                    if (this.f12404j == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(m0Var.f12455a);
                        this.f12404j = new c.f.a.c.f.q.s(m0Var.f12456b, arrayList);
                        Handler handler2 = this.u;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), m0Var.f12457c);
                    }
                }
                return true;
            case 19:
                this.f12403i = false;
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i2);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }

    public final <T> void i(c.f.a.c.o.j<T> jVar, int i2, c.f.a.c.f.o.e eVar) {
        l0 l0VarB;
        if (i2 == 0 || (l0VarB = l0.b(this, i2, eVar.getApiKey())) == null) {
            return;
        }
        c.f.a.c.o.i<T> iVarA = jVar.a();
        Handler handler = this.u;
        handler.getClass();
        iVarA.c(x.a(handler), l0VarB);
    }

    public final void k() {
        c.f.a.c.f.q.s sVar = this.f12404j;
        if (sVar != null) {
            if (sVar.I() > 0 || w()) {
                l().a(sVar);
            }
            this.f12404j = null;
        }
    }

    public final c.f.a.c.f.q.u l() {
        if (this.f12405k == null) {
            this.f12405k = c.f.a.c.f.q.t.a(this.f12406l);
        }
        return this.f12405k;
    }

    public final int n() {
        return this.f12409o.getAndIncrement();
    }

    public final void o(@RecentlyNonNull c.f.a.c.f.o.e<?> eVar) {
        Handler handler = this.u;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    public final void p(u uVar) {
        synchronized (f12398d) {
            if (this.r != uVar) {
                this.r = uVar;
                this.s.clear();
            }
            this.s.addAll(uVar.u());
        }
    }

    public final void q(u uVar) {
        synchronized (f12398d) {
            if (this.r == uVar) {
                this.r = null;
                this.s.clear();
            }
        }
    }

    public final d0 r(b<?> bVar) {
        return this.q.get(bVar);
    }

    public final void s() {
        Handler handler = this.u;
        handler.sendMessage(handler.obtainMessage(3));
    }

    @RecentlyNonNull
    public final c.f.a.c.o.i<Boolean> t(@RecentlyNonNull c.f.a.c.f.o.e<?> eVar) {
        v vVar = new v(eVar.getApiKey());
        Handler handler = this.u;
        handler.sendMessage(handler.obtainMessage(14, vVar));
        return vVar.b().a();
    }

    public final <O extends a.d> void u(@RecentlyNonNull c.f.a.c.f.o.e<O> eVar, int i2, @RecentlyNonNull d<? extends c.f.a.c.f.o.j, a.b> dVar) {
        f1 f1Var = new f1(i2, dVar);
        Handler handler = this.u;
        handler.sendMessage(handler.obtainMessage(4, new q0(f1Var, this.p.get(), eVar)));
    }

    public final <O extends a.d, ResultT> void v(@RecentlyNonNull c.f.a.c.f.o.e<O> eVar, int i2, @RecentlyNonNull r<a.b, ResultT> rVar, @RecentlyNonNull c.f.a.c.o.j<ResultT> jVar, @RecentlyNonNull q qVar) {
        i(jVar, rVar.e(), eVar);
        h1 h1Var = new h1(i2, rVar, jVar, qVar);
        Handler handler = this.u;
        handler.sendMessage(handler.obtainMessage(4, new q0(h1Var, this.p.get(), eVar)));
    }

    public final boolean w() {
        if (this.f12403i) {
            return false;
        }
        c.f.a.c.f.q.q qVarA = c.f.a.c.f.q.p.b().a();
        if (qVarA != null && !qVarA.K()) {
            return false;
        }
        int iB = this.f12408n.b(this.f12406l, 203390000);
        return iB == -1 || iB == 0;
    }

    @RecentlyNonNull
    public final <O extends a.d> c.f.a.c.o.i<Void> x(@RecentlyNonNull c.f.a.c.f.o.e<O> eVar, @RecentlyNonNull n<a.b, ?> nVar, @RecentlyNonNull s<a.b, ?> sVar, @RecentlyNonNull Runnable runnable) {
        c.f.a.c.o.j jVar = new c.f.a.c.o.j();
        i(jVar, nVar.f(), eVar);
        g1 g1Var = new g1(new r0(nVar, sVar, runnable), jVar);
        Handler handler = this.u;
        handler.sendMessage(handler.obtainMessage(8, new q0(g1Var, this.p.get(), eVar)));
        return jVar.a();
    }

    @RecentlyNonNull
    public final <O extends a.d> c.f.a.c.o.i<Boolean> y(@RecentlyNonNull c.f.a.c.f.o.e<O> eVar, @RecentlyNonNull j.a aVar, int i2) {
        c.f.a.c.o.j jVar = new c.f.a.c.o.j();
        i(jVar, i2, eVar);
        i1 i1Var = new i1(aVar, jVar);
        Handler handler = this.u;
        handler.sendMessage(handler.obtainMessage(13, new q0(i1Var, this.p.get(), eVar)));
        return jVar.a();
    }

    public final boolean z(c.f.a.c.f.b bVar, int i2) {
        return this.f12407m.s(this.f12406l, bVar, i2);
    }
}
