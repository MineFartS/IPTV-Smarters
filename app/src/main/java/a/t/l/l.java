package a.t.l;

import a.t.l.c;
import a.t.l.g;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l extends a.t.l.c implements ServiceConnection {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f3430i = Log.isLoggable("MediaRouteProviderProxy", 3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ComponentName f3431j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f3432k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<b> f3433l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3434m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3435n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f3436o;
    public boolean p;

    public final class a implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Messenger f3437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f3438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Messenger f3439c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f3442f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f3443g;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3440d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3441e = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final SparseArray<g.c> f3444h = new SparseArray<>();

        /* JADX INFO: renamed from: a.t.l.l$a$a, reason: collision with other inner class name */
        public class RunnableC0077a implements Runnable {
            public RunnableC0077a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.c();
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                l.this.F(aVar);
            }
        }

        public a(Messenger messenger) {
            this.f3437a = messenger;
            d dVar = new d(this);
            this.f3438b = dVar;
            this.f3439c = new Messenger(dVar);
        }

        public int a(String str, String str2) {
            int i2 = this.f3441e;
            this.f3441e = i2 + 1;
            Bundle bundle = new Bundle();
            bundle.putString("routeId", str);
            bundle.putString("routeGroupId", str2);
            int i3 = this.f3440d;
            this.f3440d = i3 + 1;
            m(3, i3, i2, null, bundle);
            return i2;
        }

        public void b() {
            m(2, 0, 0, null, null);
            this.f3438b.a();
            this.f3437a.getBinder().unlinkToDeath(this, 0);
            l.this.f3432k.post(new RunnableC0077a());
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            l.this.f3432k.post(new b());
        }

        public void c() {
            for (int i2 = 0; i2 < this.f3444h.size(); i2++) {
                this.f3444h.valueAt(i2).a(null, null);
            }
            this.f3444h.clear();
        }

        public boolean d(int i2, String str, Bundle bundle) {
            g.c cVar = this.f3444h.get(i2);
            if (cVar == null) {
                return false;
            }
            this.f3444h.remove(i2);
            cVar.a(str, bundle);
            return true;
        }

        public boolean e(int i2, Bundle bundle) {
            g.c cVar = this.f3444h.get(i2);
            if (cVar == null) {
                return false;
            }
            this.f3444h.remove(i2);
            cVar.b(bundle);
            return true;
        }

        public boolean f(Bundle bundle) {
            if (this.f3442f == 0) {
                return false;
            }
            l.this.E(this, a.t.l.d.b(bundle));
            return true;
        }

        public boolean g(int i2) {
            if (i2 == this.f3443g) {
                this.f3443g = 0;
                l.this.G(this, "Registration failed");
            }
            g.c cVar = this.f3444h.get(i2);
            if (cVar == null) {
                return true;
            }
            this.f3444h.remove(i2);
            cVar.a(null, null);
            return true;
        }

        public boolean h(int i2) {
            return true;
        }

        public boolean i(int i2, int i3, Bundle bundle) {
            if (this.f3442f != 0 || i2 != this.f3443g || i3 < 1) {
                return false;
            }
            this.f3443g = 0;
            this.f3442f = i3;
            l.this.E(this, a.t.l.d.b(bundle));
            l.this.H(this);
            return true;
        }

        public boolean j() {
            int i2 = this.f3440d;
            this.f3440d = i2 + 1;
            this.f3443g = i2;
            if (!m(1, i2, 2, null, null)) {
                return false;
            }
            try {
                this.f3437a.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException unused) {
                binderDied();
                return false;
            }
        }

        public void k(int i2) {
            int i3 = this.f3440d;
            this.f3440d = i3 + 1;
            m(4, i3, i2, null, null);
        }

        public void l(int i2) {
            int i3 = this.f3440d;
            this.f3440d = i3 + 1;
            m(5, i3, i2, null, null);
        }

        public final boolean m(int i2, int i3, int i4, Object obj, Bundle bundle) {
            Message messageObtain = Message.obtain();
            messageObtain.what = i2;
            messageObtain.arg1 = i3;
            messageObtain.arg2 = i4;
            messageObtain.obj = obj;
            messageObtain.setData(bundle);
            messageObtain.replyTo = this.f3439c;
            try {
                this.f3437a.send(messageObtain);
                return true;
            } catch (DeadObjectException unused) {
                return false;
            } catch (RemoteException e2) {
                if (i2 == 2) {
                    return false;
                }
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", e2);
                return false;
            }
        }

        public void n(a.t.l.b bVar) {
            int i2 = this.f3440d;
            this.f3440d = i2 + 1;
            m(10, i2, 0, bVar != null ? bVar.a() : null, null);
        }

        public void o(int i2, int i3) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i3);
            int i4 = this.f3440d;
            this.f3440d = i4 + 1;
            m(7, i4, i2, null, bundle);
        }

        public void p(int i2, int i3) {
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i3);
            int i4 = this.f3440d;
            this.f3440d = i4 + 1;
            m(6, i4, i2, null, bundle);
        }

        public void q(int i2, int i3) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i3);
            int i4 = this.f3440d;
            this.f3440d = i4 + 1;
            m(8, i4, i2, null, bundle);
        }
    }

    public final class b extends c.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f3449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3451d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public a f3453f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f3454g;

        public b(String str, String str2) {
            this.f3448a = str;
            this.f3449b = str2;
        }

        @Override // a.t.l.c.d
        public void a() {
            l.this.I(this);
        }

        @Override // a.t.l.c.d
        public void b() {
            this.f3450c = true;
            a aVar = this.f3453f;
            if (aVar != null) {
                aVar.l(this.f3454g);
            }
        }

        @Override // a.t.l.c.d
        public void c(int i2) {
            a aVar = this.f3453f;
            if (aVar != null) {
                aVar.o(this.f3454g, i2);
            } else {
                this.f3451d = i2;
                this.f3452e = 0;
            }
        }

        @Override // a.t.l.c.d
        public void d() {
            e(0);
        }

        @Override // a.t.l.c.d
        public void e(int i2) {
            this.f3450c = false;
            a aVar = this.f3453f;
            if (aVar != null) {
                aVar.p(this.f3454g, i2);
            }
        }

        @Override // a.t.l.c.d
        public void f(int i2) {
            a aVar = this.f3453f;
            if (aVar != null) {
                aVar.q(this.f3454g, i2);
            } else {
                this.f3452e += i2;
            }
        }

        public void g(a aVar) {
            this.f3453f = aVar;
            int iA = aVar.a(this.f3448a, this.f3449b);
            this.f3454g = iA;
            if (this.f3450c) {
                aVar.l(iA);
                int i2 = this.f3451d;
                if (i2 >= 0) {
                    aVar.o(this.f3454g, i2);
                    this.f3451d = -1;
                }
                int i3 = this.f3452e;
                if (i3 != 0) {
                    aVar.q(this.f3454g, i3);
                    this.f3452e = 0;
                }
            }
        }

        public void h() {
            a aVar = this.f3453f;
            if (aVar != null) {
                aVar.k(this.f3454g);
                this.f3453f = null;
                this.f3454g = 0;
            }
        }
    }

    public static final class c extends Handler {
    }

    public static final class d extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<a> f3456a;

        public d(a aVar) {
            this.f3456a = new WeakReference<>(aVar);
        }

        public void a() {
            this.f3456a.clear();
        }

        public final boolean b(a aVar, int i2, int i3, int i4, Object obj, Bundle bundle) {
            if (i2 == 0) {
                aVar.g(i3);
                return true;
            }
            if (i2 == 1) {
                aVar.h(i3);
                return true;
            }
            if (i2 == 2) {
                if (obj == null || (obj instanceof Bundle)) {
                    return aVar.i(i3, i4, (Bundle) obj);
                }
                return false;
            }
            if (i2 == 3) {
                if (obj == null || (obj instanceof Bundle)) {
                    return aVar.e(i3, (Bundle) obj);
                }
                return false;
            }
            if (i2 == 4) {
                if (obj == null || (obj instanceof Bundle)) {
                    return aVar.d(i3, bundle == null ? null : bundle.getString("error"), (Bundle) obj);
                }
                return false;
            }
            if (i2 != 5) {
                return false;
            }
            if (obj == null || (obj instanceof Bundle)) {
                return aVar.f((Bundle) obj);
            }
            return false;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar = this.f3456a.get();
            if (aVar == null || b(aVar, message.what, message.arg1, message.arg2, message.obj, message.peekData()) || !l.f3430i) {
                return;
            }
            Log.d("MediaRouteProviderProxy", "Unhandled message from server: " + message);
        }
    }

    public l(Context context, ComponentName componentName) {
        super(context, new c.C0073c(componentName));
        this.f3433l = new ArrayList<>();
        this.f3431j = componentName;
        this.f3432k = new c();
    }

    public final c.d A(String str, String str2) {
        a.t.l.d dVarO = o();
        if (dVarO == null) {
            return null;
        }
        List<a.t.l.a> listC = dVarO.c();
        int size = listC.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (listC.get(i2).l().equals(str)) {
                b bVar = new b(str, str2);
                this.f3433l.add(bVar);
                if (this.p) {
                    bVar.g(this.f3436o);
                }
                O();
                return bVar;
            }
        }
        return null;
    }

    public final void B() {
        int size = this.f3433l.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3433l.get(i2).h();
        }
    }

    public final void C() {
        if (this.f3436o != null) {
            w(null);
            this.p = false;
            B();
            this.f3436o.b();
            this.f3436o = null;
        }
    }

    public boolean D(String str, String str2) {
        return this.f3431j.getPackageName().equals(str) && this.f3431j.getClassName().equals(str2);
    }

    public void E(a aVar, a.t.l.d dVar) {
        if (this.f3436o == aVar) {
            if (f3430i) {
                Log.d("MediaRouteProviderProxy", this + ": Descriptor changed, descriptor=" + dVar);
            }
            w(dVar);
        }
    }

    public void F(a aVar) {
        if (this.f3436o == aVar) {
            if (f3430i) {
                Log.d("MediaRouteProviderProxy", this + ": Service connection died");
            }
            C();
        }
    }

    public void G(a aVar, String str) {
        if (this.f3436o == aVar) {
            if (f3430i) {
                Log.d("MediaRouteProviderProxy", this + ": Service connection error - " + str);
            }
            N();
        }
    }

    public void H(a aVar) {
        if (this.f3436o == aVar) {
            this.p = true;
            y();
            a.t.l.b bVarP = p();
            if (bVarP != null) {
                this.f3436o.n(bVarP);
            }
        }
    }

    public void I(b bVar) {
        this.f3433l.remove(bVar);
        bVar.h();
        O();
    }

    public void J() {
        if (this.f3436o == null && K()) {
            N();
            z();
        }
    }

    public final boolean K() {
        if (this.f3434m) {
            return (p() == null && this.f3433l.isEmpty()) ? false : true;
        }
        return false;
    }

    public void L() {
        if (this.f3434m) {
            return;
        }
        if (f3430i) {
            Log.d("MediaRouteProviderProxy", this + ": Starting");
        }
        this.f3434m = true;
        O();
    }

    public void M() {
        if (this.f3434m) {
            if (f3430i) {
                Log.d("MediaRouteProviderProxy", this + ": Stopping");
            }
            this.f3434m = false;
            O();
        }
    }

    public final void N() {
        if (this.f3435n) {
            if (f3430i) {
                Log.d("MediaRouteProviderProxy", this + ": Unbinding");
            }
            this.f3435n = false;
            C();
            n().unbindService(this);
        }
    }

    public final void O() {
        if (K()) {
            z();
        } else {
            N();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z = f3430i;
        if (z) {
            Log.d("MediaRouteProviderProxy", this + ": Connected");
        }
        if (this.f3435n) {
            C();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (!e.a(messenger)) {
                Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
                return;
            }
            a aVar = new a(messenger);
            if (aVar.j()) {
                this.f3436o = aVar;
            } else if (z) {
                Log.d("MediaRouteProviderProxy", this + ": Registration failed");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (f3430i) {
            Log.d("MediaRouteProviderProxy", this + ": Service disconnected");
        }
        C();
    }

    @Override // a.t.l.c
    public c.d s(String str) {
        if (str != null) {
            return A(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // a.t.l.c
    public c.d t(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return A(str, str2);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public String toString() {
        return "Service connection " + this.f3431j.flattenToShortString();
    }

    @Override // a.t.l.c
    public void u(a.t.l.b bVar) {
        if (this.p) {
            this.f3436o.n(bVar);
        }
        O();
    }

    public final void y() {
        int size = this.f3433l.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3433l.get(i2).g(this.f3436o);
        }
    }

    public final void z() {
        if (this.f3435n) {
            return;
        }
        boolean z = f3430i;
        if (z) {
            Log.d("MediaRouteProviderProxy", this + ": Binding");
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.f3431j);
        try {
            boolean zBindService = n().bindService(intent, this, 1);
            this.f3435n = zBindService;
            if (zBindService || !z) {
                return;
            }
            Log.d("MediaRouteProviderProxy", this + ": Bind failed");
        } catch (SecurityException e2) {
            if (f3430i) {
                Log.d("MediaRouteProviderProxy", this + ": Bind failed", e2);
            }
        }
    }
}
