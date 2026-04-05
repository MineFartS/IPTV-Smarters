package c.f.a.c.f.q;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class j1 implements ServiceConnection, m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<ServiceConnection, ServiceConnection> f12614a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12615b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IBinder f12617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1 f12618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComponentName f12619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l1 f12620g;

    public j1(l1 l1Var, h1 h1Var) {
        this.f12620g = l1Var;
        this.f12618e = h1Var;
    }

    public final void a(String str) {
        this.f12615b = 3;
        boolean zD = this.f12620g.f12630g.d(this.f12620g.f12628e, str, this.f12618e.d(this.f12620g.f12628e), this, this.f12618e.c());
        this.f12616c = zD;
        if (zD) {
            this.f12620g.f12629f.sendMessageDelayed(this.f12620g.f12629f.obtainMessage(1, this.f12618e), this.f12620g.f12632i);
        } else {
            this.f12615b = 2;
            try {
                this.f12620g.f12630g.c(this.f12620g.f12628e, this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final void b(String str) {
        this.f12620g.f12629f.removeMessages(1, this.f12618e);
        this.f12620g.f12630g.c(this.f12620g.f12628e, this);
        this.f12616c = false;
        this.f12615b = 2;
    }

    public final void c(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f12614a.put(serviceConnection, serviceConnection2);
    }

    public final void d(ServiceConnection serviceConnection, String str) {
        this.f12614a.remove(serviceConnection);
    }

    public final boolean e() {
        return this.f12616c;
    }

    public final int f() {
        return this.f12615b;
    }

    public final boolean g(ServiceConnection serviceConnection) {
        return this.f12614a.containsKey(serviceConnection);
    }

    public final boolean h() {
        return this.f12614a.isEmpty();
    }

    public final IBinder i() {
        return this.f12617d;
    }

    public final ComponentName j() {
        return this.f12619f;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f12620g.f12627d) {
            this.f12620g.f12629f.removeMessages(1, this.f12618e);
            this.f12617d = iBinder;
            this.f12619f = componentName;
            Iterator<ServiceConnection> it = this.f12614a.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.f12615b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f12620g.f12627d) {
            this.f12620g.f12629f.removeMessages(1, this.f12618e);
            this.f12617d = null;
            this.f12619f = componentName;
            Iterator<ServiceConnection> it = this.f12614a.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.f12615b = 2;
        }
    }
}
