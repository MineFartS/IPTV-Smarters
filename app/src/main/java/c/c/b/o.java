package c.c.b;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f5242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<n<?>> f5243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityBlockingQueue<n<?>> f5244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PriorityBlockingQueue<n<?>> f5245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f5246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f5247f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f5248g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i[] f5249h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f5250i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<a> f5251j;

    public interface a<T> {
        void a(n<T> nVar);
    }

    public o(b bVar, h hVar) {
        this(bVar, hVar, 4);
    }

    public o(b bVar, h hVar, int i2) {
        this(bVar, hVar, i2, new f(new Handler(Looper.getMainLooper())));
    }

    public o(b bVar, h hVar, int i2, q qVar) {
        this.f5242a = new AtomicInteger();
        this.f5243b = new HashSet();
        this.f5244c = new PriorityBlockingQueue<>();
        this.f5245d = new PriorityBlockingQueue<>();
        this.f5251j = new ArrayList();
        this.f5246e = bVar;
        this.f5247f = hVar;
        this.f5249h = new i[i2];
        this.f5248g = qVar;
    }

    public <T> n<T> a(n<T> nVar) {
        nVar.R(this);
        synchronized (this.f5243b) {
            this.f5243b.add(nVar);
        }
        nVar.T(c());
        nVar.b("add-to-queue");
        (!nVar.U() ? this.f5245d : this.f5244c).add(nVar);
        return nVar;
    }

    public <T> void b(n<T> nVar) {
        synchronized (this.f5243b) {
            this.f5243b.remove(nVar);
        }
        synchronized (this.f5251j) {
            Iterator<a> it = this.f5251j.iterator();
            while (it.hasNext()) {
                it.next().a(nVar);
            }
        }
    }

    public int c() {
        return this.f5242a.incrementAndGet();
    }

    public void d() {
        e();
        c cVar = new c(this.f5244c, this.f5245d, this.f5246e, this.f5248g);
        this.f5250i = cVar;
        cVar.start();
        for (int i2 = 0; i2 < this.f5249h.length; i2++) {
            i iVar = new i(this.f5245d, this.f5247f, this.f5246e, this.f5248g);
            this.f5249h[i2] = iVar;
            iVar.start();
        }
    }

    public void e() {
        c cVar = this.f5250i;
        if (cVar != null) {
            cVar.e();
        }
        for (i iVar : this.f5249h) {
            if (iVar != null) {
                iVar.e();
            }
        }
    }
}
