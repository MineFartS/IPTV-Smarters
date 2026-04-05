package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.f.o.f;
import c.f.a.c.f.o.g;
import c.f.a.c.f.o.h;
import c.f.a.c.f.o.j;
import c.f.a.c.f.o.k;
import c.f.a.c.f.o.n.c1;
import c.f.a.c.f.o.n.d1;
import c.f.a.c.f.o.n.p1;
import c.f.a.c.f.o.n.q1;
import c.f.a.c.f.q.o;
import c.f.a.c.j.b.e;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
@KeepName
public abstract class BasePendingResult<R extends j> extends g<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<Boolean> f24242a = new p1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f24243b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f24244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @RecentlyNonNull
    public final a<R> f24245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @RecentlyNonNull
    public final WeakReference<f> f24246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CountDownLatch f24247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<g.a> f24248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k<? super R> f24249h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference<d1> f24250i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public R f24251j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Status f24252k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f24253l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f24254m;

    @KeepName
    public q1 mResultGuardian;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f24255n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c.f.a.c.f.q.j f24256o;
    public volatile c1<R> p;
    public boolean q;

    public static class a<R extends j> extends e {
        public a(@RecentlyNonNull Looper looper) {
            super(looper);
        }

        public final void a(@RecentlyNonNull k<? super R> kVar, @RecentlyNonNull R r) {
            int i2 = BasePendingResult.f24243b;
            sendMessage(obtainMessage(1, new Pair((k) o.i(kVar), r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(@RecentlyNonNull Message message) {
            int i2 = message.what;
            if (i2 != 1) {
                if (i2 == 2) {
                    ((BasePendingResult) message.obj).f(Status.f24233e);
                    return;
                }
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i2);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            k kVar = (k) pair.first;
            j jVar = (j) pair.second;
            try {
                kVar.a(jVar);
            } catch (RuntimeException e2) {
                BasePendingResult.m(jVar);
                throw e2;
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.f24244c = new Object();
        this.f24247f = new CountDownLatch(1);
        this.f24248g = new ArrayList<>();
        this.f24250i = new AtomicReference<>();
        this.q = false;
        this.f24245d = new a<>(Looper.getMainLooper());
        this.f24246e = new WeakReference<>(null);
    }

    public BasePendingResult(f fVar) {
        this.f24244c = new Object();
        this.f24247f = new CountDownLatch(1);
        this.f24248g = new ArrayList<>();
        this.f24250i = new AtomicReference<>();
        this.q = false;
        this.f24245d = new a<>(fVar != null ? fVar.a() : Looper.getMainLooper());
        this.f24246e = new WeakReference<>(fVar);
    }

    public static void m(j jVar) {
        if (jVar instanceof h) {
            try {
                ((h) jVar).release();
            } catch (RuntimeException e2) {
                String strValueOf = String.valueOf(jVar);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 18);
                sb.append("Unable to release ");
                sb.append(strValueOf);
                Log.w("BasePendingResult", sb.toString(), e2);
            }
        }
    }

    @Override // c.f.a.c.f.o.g
    public final void b(@RecentlyNonNull g.a aVar) {
        o.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f24244c) {
            if (h()) {
                aVar.a(this.f24252k);
            } else {
                this.f24248g.add(aVar);
            }
        }
    }

    @Override // c.f.a.c.f.o.g
    public void c() {
        synchronized (this.f24244c) {
            if (!this.f24254m && !this.f24253l) {
                c.f.a.c.f.q.j jVar = this.f24256o;
                if (jVar != null) {
                    try {
                        jVar.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                m(this.f24251j);
                this.f24254m = true;
                k(e(Status.f24234f));
            }
        }
    }

    @Override // c.f.a.c.f.o.g
    public final void d(k<? super R> kVar) {
        synchronized (this.f24244c) {
            if (kVar == null) {
                this.f24249h = null;
                return;
            }
            boolean z = true;
            o.m(!this.f24253l, "Result has already been consumed.");
            if (this.p != null) {
                z = false;
            }
            o.m(z, "Cannot set callbacks if then() has been called.");
            if (g()) {
                return;
            }
            if (h()) {
                this.f24245d.a(kVar, j());
            } else {
                this.f24249h = kVar;
            }
        }
    }

    public abstract R e(@RecentlyNonNull Status status);

    @Deprecated
    public final void f(@RecentlyNonNull Status status) {
        synchronized (this.f24244c) {
            if (!h()) {
                i(e(status));
                this.f24255n = true;
            }
        }
    }

    public final boolean g() {
        boolean z;
        synchronized (this.f24244c) {
            z = this.f24254m;
        }
        return z;
    }

    public final boolean h() {
        return this.f24247f.getCount() == 0;
    }

    public final void i(@RecentlyNonNull R r) {
        synchronized (this.f24244c) {
            if (this.f24255n || this.f24254m) {
                m(r);
                return;
            }
            h();
            o.m(!h(), "Results have already been set");
            o.m(!this.f24253l, "Result has already been consumed");
            k(r);
        }
    }

    public final R j() {
        R r;
        synchronized (this.f24244c) {
            o.m(!this.f24253l, "Result has already been consumed.");
            o.m(h(), "Result is not ready.");
            r = this.f24251j;
            this.f24251j = null;
            this.f24249h = null;
            this.f24253l = true;
        }
        if (this.f24250i.getAndSet(null) == null) {
            return (R) o.i(r);
        }
        throw null;
    }

    public final void k(R r) {
        this.f24251j = r;
        this.f24252k = r.C();
        p1 p1Var = null;
        this.f24256o = null;
        this.f24247f.countDown();
        if (this.f24254m) {
            this.f24249h = null;
        } else {
            k<? super R> kVar = this.f24249h;
            if (kVar != null) {
                this.f24245d.removeMessages(2);
                this.f24245d.a(kVar, j());
            } else if (this.f24251j instanceof h) {
                this.mResultGuardian = new q1(this, p1Var);
            }
        }
        ArrayList<g.a> arrayList = this.f24248g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).a(this.f24252k);
        }
        this.f24248g.clear();
    }

    public final void l() {
        boolean z = true;
        if (!this.q && !f24242a.get().booleanValue()) {
            z = false;
        }
        this.q = z;
    }
}
