package c.f.a.c.e;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    public int f12268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Messenger f12269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f12270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("this")
    public final Queue<u<?>> f12271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("this")
    public final SparseArray<u<?>> f12272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f12273f;

    public j(i iVar) {
        this.f12273f = iVar;
        this.f12268a = 0;
        this.f12269b = new Messenger(new c.f.a.c.j.d.e(Looper.getMainLooper(), new Handler.Callback(this) { // from class: c.f.a.c.e.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final j f12275b;

            {
                this.f12275b = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f12275b.d(message);
            }
        }));
        this.f12271d = new ArrayDeque();
        this.f12272e = new SparseArray<>();
    }

    public final void a() {
        this.f12273f.f12265c.execute(new Runnable(this) { // from class: c.f.a.c.e.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final j f12276b;

            {
                this.f12276b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final u<?> uVarPoll;
                final j jVar = this.f12276b;
                while (true) {
                    synchronized (jVar) {
                        if (jVar.f12268a != 2) {
                            return;
                        }
                        if (jVar.f12271d.isEmpty()) {
                            jVar.f();
                            return;
                        } else {
                            uVarPoll = jVar.f12271d.poll();
                            jVar.f12272e.put(uVarPoll.f12285a, uVarPoll);
                            jVar.f12273f.f12265c.schedule(new Runnable(jVar, uVarPoll) { // from class: c.f.a.c.e.p

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final j f12279b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final u f12280c;

                                {
                                    this.f12279b = jVar;
                                    this.f12280c = uVarPoll;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f12279b.b(this.f12280c.f12285a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String strValueOf = String.valueOf(uVarPoll);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
                        sb.append("Sending ");
                        sb.append(strValueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    Context context = jVar.f12273f.f12264b;
                    Messenger messenger = jVar.f12269b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = uVarPoll.f12287c;
                    messageObtain.arg1 = uVarPoll.f12285a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", uVarPoll.d());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", uVarPoll.f12288d);
                    messageObtain.setData(bundle);
                    try {
                        jVar.f12270c.a(messageObtain);
                    } catch (RemoteException e2) {
                        jVar.c(2, e2.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void b(int i2) {
        u<?> uVar = this.f12272e.get(i2);
        if (uVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i2);
            Log.w("MessengerIpcClient", sb.toString());
            this.f12272e.remove(i2);
            uVar.b(new t(3, "Timed out waiting for response"));
            f();
        }
    }

    public final synchronized void c(int i2, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
        }
        int i3 = this.f12268a;
        if (i3 == 0) {
            throw new IllegalStateException();
        }
        if (i3 != 1 && i3 != 2) {
            if (i3 == 3) {
                this.f12268a = 4;
                return;
            } else {
                if (i3 == 4) {
                    return;
                }
                int i4 = this.f12268a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i4);
                throw new IllegalStateException(sb.toString());
            }
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f12268a = 4;
        c.f.a.c.f.s.a.b().c(this.f12273f.f12264b, this);
        t tVar = new t(i2, str);
        Iterator<u<?>> it = this.f12271d.iterator();
        while (it.hasNext()) {
            it.next().b(tVar);
        }
        this.f12271d.clear();
        for (int i5 = 0; i5 < this.f12272e.size(); i5++) {
            this.f12272e.valueAt(i5).b(tVar);
        }
        this.f12272e.clear();
    }

    public final boolean d(Message message) {
        int i2 = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Received response to request: ");
            sb.append(i2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        synchronized (this) {
            u<?> uVar = this.f12272e.get(i2);
            if (uVar == null) {
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("Received response for unknown request: ");
                sb2.append(i2);
                Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
            this.f12272e.remove(i2);
            f();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                uVar.b(new t(4, "Not supported by GmsCore"));
            } else {
                uVar.a(data);
            }
            return true;
        }
    }

    public final synchronized boolean e(u<?> uVar) {
        int i2 = this.f12268a;
        if (i2 == 0) {
            this.f12271d.add(uVar);
            c.f.a.c.f.q.o.l(this.f12268a == 0);
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.f12268a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            if (c.f.a.c.f.s.a.b().a(this.f12273f.f12264b, intent, this, 1)) {
                this.f12273f.f12265c.schedule(new Runnable(this) { // from class: c.f.a.c.e.l

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final j f12274b;

                    {
                        this.f12274b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f12274b.g();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                c(0, "Unable to bind to service");
            }
            return true;
        }
        if (i2 == 1) {
            this.f12271d.add(uVar);
            return true;
        }
        if (i2 == 2) {
            this.f12271d.add(uVar);
            a();
            return true;
        }
        if (i2 != 3 && i2 != 4) {
            int i3 = this.f12268a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i3);
            throw new IllegalStateException(sb.toString());
        }
        return false;
    }

    public final synchronized void f() {
        if (this.f12268a == 2 && this.f12271d.isEmpty() && this.f12272e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f12268a = 3;
            c.f.a.c.f.s.a.b().c(this.f12273f.f12264b, this);
        }
    }

    public final synchronized void g() {
        if (this.f12268a == 1) {
            c(1, "Timed out while binding");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f12273f.f12265c.execute(new Runnable(this, iBinder) { // from class: c.f.a.c.e.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final j f12277b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final IBinder f12278c;

            {
                this.f12277b = this;
                this.f12278c = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                j jVar = this.f12277b;
                IBinder iBinder2 = this.f12278c;
                synchronized (jVar) {
                    try {
                        if (iBinder2 == null) {
                            jVar.c(0, "Null service connection");
                            return;
                        }
                        try {
                            jVar.f12270c = new s(iBinder2);
                            jVar.f12268a = 2;
                            jVar.a();
                        } catch (RemoteException e2) {
                            jVar.c(0, e2.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f12273f.f12265c.execute(new Runnable(this) { // from class: c.f.a.c.e.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final j f12281b;

            {
                this.f12281b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12281b.c(2, "Service disconnected");
            }
        });
    }
}
