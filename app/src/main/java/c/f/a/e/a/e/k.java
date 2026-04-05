package c.f.a.e.a.e;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class k<T extends IInterface> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, Handler> f15722a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f15723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f15724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15725d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Intent f15728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g<T> f15729h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ServiceConnection f15732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public T f15733l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<b> f15726e = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IBinder.DeathRecipient f15731j = new IBinder.DeathRecipient(this) { // from class: c.f.a.e.a.e.c

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f15712a;

        {
            this.f15712a = this;
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            this.f15712a.n();
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final WeakReference<f> f15730i = new WeakReference<>(null);

    public k(Context context, a aVar, String str, Intent intent, g<T> gVar) {
        this.f15723b = context;
        this.f15724c = aVar;
        this.f15725d = str;
        this.f15728g = intent;
        this.f15729h = gVar;
    }

    public static /* synthetic */ void d(k kVar, b bVar) {
        if (kVar.f15733l != null || kVar.f15727f) {
            if (!kVar.f15727f) {
                bVar.run();
                return;
            } else {
                kVar.f15724c.d("Waiting to bind to the service.", new Object[0]);
                kVar.f15726e.add(bVar);
                return;
            }
        }
        kVar.f15724c.d("Initiate binding to the service.", new Object[0]);
        kVar.f15726e.add(bVar);
        j jVar = new j(kVar);
        kVar.f15732k = jVar;
        kVar.f15727f = true;
        if (kVar.f15723b.bindService(kVar.f15728g, jVar, 1)) {
            return;
        }
        kVar.f15724c.d("Failed to bind to the service.", new Object[0]);
        kVar.f15727f = false;
        Iterator<b> it = kVar.f15726e.iterator();
        while (it.hasNext()) {
            c.f.a.e.a.i.m<?> mVarB = it.next().b();
            if (mVarB != null) {
                mVarB.d(new l());
            }
        }
        kVar.f15726e.clear();
    }

    public static /* synthetic */ void j(k kVar) {
        kVar.f15724c.d("linkToDeath", new Object[0]);
        try {
            kVar.f15733l.asBinder().linkToDeath(kVar.f15731j, 0);
        } catch (RemoteException e2) {
            kVar.f15724c.c(e2, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* synthetic */ void m(k kVar) {
        kVar.f15724c.d("unlinkToDeath", new Object[0]);
        kVar.f15733l.asBinder().unlinkToDeath(kVar.f15731j, 0);
    }

    public final void a(b bVar) {
        r(new d(this, bVar.b(), bVar));
    }

    public final void b() {
        r(new e(this));
    }

    public final T c() {
        return this.f15733l;
    }

    public final /* bridge */ /* synthetic */ void n() {
        this.f15724c.d("reportBinderDeath", new Object[0]);
        f fVar = this.f15730i.get();
        if (fVar != null) {
            this.f15724c.d("calling onBinderDied", new Object[0]);
            fVar.a();
            return;
        }
        this.f15724c.d("%s : Binder has died.", this.f15725d);
        Iterator<b> it = this.f15726e.iterator();
        while (it.hasNext()) {
            c.f.a.e.a.i.m<?> mVarB = it.next().b();
            if (mVarB != null) {
                mVarB.d(Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.f15725d).concat(" : Binder has died.")));
            }
        }
        this.f15726e.clear();
    }

    public final void r(b bVar) {
        Handler handler;
        Map<String, Handler> map = f15722a;
        synchronized (map) {
            if (!map.containsKey(this.f15725d)) {
                HandlerThread handlerThread = new HandlerThread(this.f15725d, 10);
                handlerThread.start();
                map.put(this.f15725d, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.f15725d);
        }
        handler.post(bVar);
    }
}
