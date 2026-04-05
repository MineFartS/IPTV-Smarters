package c.f.a.e.a.f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c<StateT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.e.a.e.a f15744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntentFilter f15745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f15746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<a<StateT>> f15747d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f15748e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f15749f = false;

    public c(c.f.a.e.a.e.a aVar, IntentFilter intentFilter, Context context) {
        this.f15744a = aVar;
        this.f15745b = intentFilter;
        this.f15746c = c.f.a.e.a.g.a.b(context);
    }

    public abstract void a(Context context, Intent intent);

    public final void b() {
        b bVar;
        if ((this.f15749f || !this.f15747d.isEmpty()) && this.f15748e == null) {
            b bVar2 = new b(this);
            this.f15748e = bVar2;
            this.f15746c.registerReceiver(bVar2, this.f15745b);
        }
        if (this.f15749f || !this.f15747d.isEmpty() || (bVar = this.f15748e) == null) {
            return;
        }
        this.f15746c.unregisterReceiver(bVar);
        this.f15748e = null;
    }

    public final synchronized void c(boolean z) {
        this.f15749f = z;
        b();
    }

    public final synchronized void d(StateT statet) {
        Iterator it = new HashSet(this.f15747d).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(statet);
        }
    }

    public final synchronized boolean e() {
        return this.f15748e != null;
    }
}
