package c.f.a.c.f.o.n;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import c.f.a.c.f.o.a;
import c.f.a.c.f.o.a.d;
import c.f.a.c.f.o.f;
import c.f.a.c.f.o.n.j;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes2.dex */
public final class d0<O extends a.d> implements f.a, f.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotOnlyInitialized
    public final a.f f12378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b<O> f12379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f12380e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z0 f12384i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12385j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g f12389n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Queue<j1> f12377b = new LinkedList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<k1> f12381f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<j.a<?>, r0> f12382g = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<e0> f12386k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.f.a.c.f.b f12387l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12388m = 0;

    public d0(g gVar, c.f.a.c.f.o.e<O> eVar) {
        this.f12389n = gVar;
        a.f fVarZaa = eVar.zaa(gVar.u.getLooper(), this);
        this.f12378c = fVarZaa;
        this.f12379d = eVar.getApiKey();
        this.f12380e = new t();
        this.f12383h = eVar.zab();
        if (fVarZaa.requiresSignIn()) {
            this.f12384i = eVar.zac(gVar.f12406l, gVar.u);
        } else {
            this.f12384i = null;
        }
    }

    public static /* synthetic */ void H(d0 d0Var, e0 e0Var) {
        if (d0Var.f12386k.contains(e0Var) && !d0Var.f12385j) {
            if (d0Var.f12378c.isConnected()) {
                d0Var.e();
            } else {
                d0Var.z();
            }
        }
    }

    public static /* synthetic */ void I(d0 d0Var, e0 e0Var) {
        c.f.a.c.f.d[] dVarArrF;
        if (d0Var.f12386k.remove(e0Var)) {
            d0Var.f12389n.u.removeMessages(15, e0Var);
            d0Var.f12389n.u.removeMessages(16, e0Var);
            c.f.a.c.f.d dVar = e0Var.f12391b;
            ArrayList arrayList = new ArrayList(d0Var.f12377b.size());
            for (j1 j1Var : d0Var.f12377b) {
                if ((j1Var instanceof o0) && (dVarArrF = ((o0) j1Var).f(d0Var)) != null && c.f.a.c.f.t.b.c(dVarArrF, dVar)) {
                    arrayList.add(j1Var);
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                j1 j1Var2 = (j1) arrayList.get(i2);
                d0Var.f12377b.remove(j1Var2);
                j1Var2.b(new c.f.a.c.f.o.m(dVar));
            }
        }
    }

    public final void A(k1 k1Var) {
        c.f.a.c.f.q.o.c(this.f12389n.u);
        this.f12381f.add(k1Var);
    }

    public final boolean B() {
        return this.f12378c.isConnected();
    }

    public final boolean C() {
        return this.f12378c.requiresSignIn();
    }

    public final int D() {
        return this.f12383h;
    }

    public final int E() {
        return this.f12388m;
    }

    public final void F() {
        this.f12388m++;
    }

    public final void b() {
        u();
        m(c.f.a.c.f.b.f12298b);
        j();
        Iterator<r0> it = this.f12382g.values().iterator();
        while (it.hasNext()) {
            r0 next = it.next();
            if (n(next.f12495a.c()) == null) {
                try {
                    next.f12495a.d(this.f12378c, new c.f.a.c.o.j<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.f12378c.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
            it.remove();
        }
        e();
        k();
    }

    public final void c(int i2) {
        u();
        this.f12385j = true;
        this.f12380e.e(i2, this.f12378c.getLastDisconnectMessage());
        this.f12389n.u.sendMessageDelayed(Message.obtain(this.f12389n.u, 9, this.f12379d), this.f12389n.f12400f);
        this.f12389n.u.sendMessageDelayed(Message.obtain(this.f12389n.u, 11, this.f12379d), this.f12389n.f12401g);
        this.f12389n.f12408n.c();
        Iterator<r0> it = this.f12382g.values().iterator();
        while (it.hasNext()) {
            it.next().f12497c.run();
        }
    }

    public final boolean d(c.f.a.c.f.b bVar) {
        synchronized (g.f12398d) {
            if (this.f12389n.r == null || !this.f12389n.s.contains(this.f12379d)) {
                return false;
            }
            this.f12389n.r.q(bVar, this.f12383h);
            return true;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList(this.f12377b);
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            j1 j1Var = (j1) arrayList.get(i2);
            if (!this.f12378c.isConnected()) {
                return;
            }
            if (f(j1Var)) {
                this.f12377b.remove(j1Var);
            }
        }
    }

    public final boolean f(j1 j1Var) {
        if (!(j1Var instanceof o0)) {
            g(j1Var);
            return true;
        }
        o0 o0Var = (o0) j1Var;
        c.f.a.c.f.d dVarN = n(o0Var.f(this));
        if (dVarN == null) {
            g(j1Var);
            return true;
        }
        String name = this.f12378c.getClass().getName();
        String name2 = dVarN.getName();
        long jI = dVarN.I();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(name2).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(name2);
        sb.append(", ");
        sb.append(jI);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f12389n.v || !o0Var.g(this)) {
            o0Var.b(new c.f.a.c.f.o.m(dVarN));
            return true;
        }
        e0 e0Var = new e0(this.f12379d, dVarN, null);
        int iIndexOf = this.f12386k.indexOf(e0Var);
        if (iIndexOf >= 0) {
            e0 e0Var2 = this.f12386k.get(iIndexOf);
            this.f12389n.u.removeMessages(15, e0Var2);
            this.f12389n.u.sendMessageDelayed(Message.obtain(this.f12389n.u, 15, e0Var2), this.f12389n.f12400f);
            return false;
        }
        this.f12386k.add(e0Var);
        this.f12389n.u.sendMessageDelayed(Message.obtain(this.f12389n.u, 15, e0Var), this.f12389n.f12400f);
        this.f12389n.u.sendMessageDelayed(Message.obtain(this.f12389n.u, 16, e0Var), this.f12389n.f12401g);
        c.f.a.c.f.b bVar = new c.f.a.c.f.b(2, null);
        if (d(bVar)) {
            return false;
        }
        this.f12389n.z(bVar, this.f12383h);
        return false;
    }

    public final void g(j1 j1Var) {
        j1Var.c(this.f12380e, C());
        try {
            j1Var.d(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f12378c.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        } catch (Throwable th) {
            throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", this.f12378c.getClass().getName()), th);
        }
    }

    public final void h(Status status, Exception exc, boolean z) {
        c.f.a.c.f.q.o.c(this.f12389n.u);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator<j1> it = this.f12377b.iterator();
        while (it.hasNext()) {
            j1 next = it.next();
            if (!z || next.f12430a == 2) {
                if (status != null) {
                    next.a(status);
                } else {
                    next.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void i(Status status) {
        c.f.a.c.f.q.o.c(this.f12389n.u);
        h(status, null, false);
    }

    public final void j() {
        if (this.f12385j) {
            this.f12389n.u.removeMessages(11, this.f12379d);
            this.f12389n.u.removeMessages(9, this.f12379d);
            this.f12385j = false;
        }
    }

    public final void k() {
        this.f12389n.u.removeMessages(12, this.f12379d);
        this.f12389n.u.sendMessageDelayed(this.f12389n.u.obtainMessage(12, this.f12379d), this.f12389n.f12402h);
    }

    public final boolean l(boolean z) {
        c.f.a.c.f.q.o.c(this.f12389n.u);
        if (!this.f12378c.isConnected() || this.f12382g.size() != 0) {
            return false;
        }
        if (!this.f12380e.c()) {
            this.f12378c.disconnect("Timing out service connection.");
            return true;
        }
        if (z) {
            k();
        }
        return false;
    }

    public final void m(c.f.a.c.f.b bVar) {
        Iterator<k1> it = this.f12381f.iterator();
        while (it.hasNext()) {
            it.next().b(this.f12379d, bVar, c.f.a.c.f.q.n.a(bVar, c.f.a.c.f.b.f12298b) ? this.f12378c.getEndpointPackageName() : null);
        }
        this.f12381f.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c.f.a.c.f.d n(c.f.a.c.f.d[] dVarArr) {
        if (dVarArr != null && dVarArr.length != 0) {
            c.f.a.c.f.d[] availableFeatures = this.f12378c.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new c.f.a.c.f.d[0];
            }
            a.f.a aVar = new a.f.a(availableFeatures.length);
            for (c.f.a.c.f.d dVar : availableFeatures) {
                aVar.put(dVar.getName(), Long.valueOf(dVar.I()));
            }
            for (c.f.a.c.f.d dVar2 : dVarArr) {
                Long l2 = (Long) aVar.get(dVar2.getName());
                if (l2 == null || l2.longValue() < dVar2.I()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    public final void o(c.f.a.c.f.b bVar) {
        c.f.a.c.f.q.o.c(this.f12389n.u);
        a.f fVar = this.f12378c;
        String name = fVar.getClass().getName();
        String strValueOf = String.valueOf(bVar);
        StringBuilder sb = new StringBuilder(name.length() + 25 + strValueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(strValueOf);
        fVar.disconnect(sb.toString());
        p(bVar, null);
    }

    @Override // c.f.a.c.f.o.n.f
    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.f12389n.u.getLooper()) {
            b();
        } else {
            this.f12389n.u.post(new z(this));
        }
    }

    @Override // c.f.a.c.f.o.n.m
    public final void onConnectionFailed(c.f.a.c.f.b bVar) {
        p(bVar, null);
    }

    @Override // c.f.a.c.f.o.n.f
    public final void onConnectionSuspended(int i2) {
        if (Looper.myLooper() == this.f12389n.u.getLooper()) {
            c(i2);
        } else {
            this.f12389n.u.post(new a0(this, i2));
        }
    }

    public final void p(c.f.a.c.f.b bVar, Exception exc) {
        c.f.a.c.f.q.o.c(this.f12389n.u);
        z0 z0Var = this.f12384i;
        if (z0Var != null) {
            z0Var.I2();
        }
        u();
        this.f12389n.f12408n.c();
        m(bVar);
        if ((this.f12378c instanceof c.f.a.c.f.q.x.e) && bVar.I() != 24) {
            g.a(this.f12389n, true);
            this.f12389n.u.sendMessageDelayed(this.f12389n.u.obtainMessage(19), 300000L);
        }
        if (bVar.I() == 4) {
            i(g.f12397c);
            return;
        }
        if (this.f12377b.isEmpty()) {
            this.f12387l = bVar;
            return;
        }
        if (exc != null) {
            c.f.a.c.f.q.o.c(this.f12389n.u);
            h(null, exc, false);
            return;
        }
        if (!this.f12389n.v) {
            i(g.j(this.f12379d, bVar));
            return;
        }
        h(g.j(this.f12379d, bVar), null, true);
        if (this.f12377b.isEmpty() || d(bVar) || this.f12389n.z(bVar, this.f12383h)) {
            return;
        }
        if (bVar.I() == 18) {
            this.f12385j = true;
        }
        if (this.f12385j) {
            this.f12389n.u.sendMessageDelayed(Message.obtain(this.f12389n.u, 9, this.f12379d), this.f12389n.f12400f);
        } else {
            i(g.j(this.f12379d, bVar));
        }
    }

    public final void q(j1 j1Var) {
        c.f.a.c.f.q.o.c(this.f12389n.u);
        if (this.f12378c.isConnected()) {
            if (f(j1Var)) {
                k();
                return;
            } else {
                this.f12377b.add(j1Var);
                return;
            }
        }
        this.f12377b.add(j1Var);
        c.f.a.c.f.b bVar = this.f12387l;
        if (bVar == null || !bVar.L()) {
            z();
        } else {
            p(this.f12387l, null);
        }
    }

    public final void r() {
        c.f.a.c.f.q.o.c(this.f12389n.u);
        i(g.f12396b);
        this.f12380e.d();
        for (j.a aVar : (j.a[]) this.f12382g.keySet().toArray(new j.a[0])) {
            q(new i1(aVar, new c.f.a.c.o.j()));
        }
        m(new c.f.a.c.f.b(4));
        if (this.f12378c.isConnected()) {
            this.f12378c.onUserSignOut(new c0(this));
        }
    }

    public final a.f s() {
        return this.f12378c;
    }

    public final Map<j.a<?>, r0> t() {
        return this.f12382g;
    }

    public final void u() {
        c.f.a.c.f.q.o.c(this.f12389n.u);
        this.f12387l = null;
    }

    public final c.f.a.c.f.b v() {
        c.f.a.c.f.q.o.c(this.f12389n.u);
        return this.f12387l;
    }

    public final void w() {
        c.f.a.c.f.q.o.c(this.f12389n.u);
        if (this.f12385j) {
            z();
        }
    }

    public final void x() {
        c.f.a.c.f.q.o.c(this.f12389n.u);
        if (this.f12385j) {
            j();
            i(this.f12389n.f12407m.g(this.f12389n.f12406l) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f12378c.disconnect("Timing out connection while resuming.");
        }
    }

    public final boolean y() {
        return l(true);
    }

    public final void z() {
        c.f.a.c.f.b bVar;
        c.f.a.c.f.q.o.c(this.f12389n.u);
        if (this.f12378c.isConnected() || this.f12378c.isConnecting()) {
            return;
        }
        try {
            int iA = this.f12389n.f12408n.a(this.f12389n.f12406l, this.f12378c);
            if (iA != 0) {
                c.f.a.c.f.b bVar2 = new c.f.a.c.f.b(iA, null);
                String name = this.f12378c.getClass().getName();
                String strValueOf = String.valueOf(bVar2);
                StringBuilder sb = new StringBuilder(name.length() + 35 + strValueOf.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(strValueOf);
                Log.w("GoogleApiManager", sb.toString());
                p(bVar2, null);
                return;
            }
            g0 g0Var = new g0(this.f12389n, this.f12378c, this.f12379d);
            if (this.f12378c.requiresSignIn()) {
                ((z0) c.f.a.c.f.q.o.i(this.f12384i)).c1(g0Var);
            }
            try {
                this.f12378c.connect(g0Var);
                return;
            } catch (SecurityException e2) {
                e = e2;
                bVar = new c.f.a.c.f.b(10);
            }
        } catch (IllegalStateException e3) {
            e = e3;
            bVar = new c.f.a.c.f.b(10);
        }
        p(bVar, e);
    }
}
