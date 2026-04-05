package d.a.a.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import minefarts.iptvsmarters.R;
import d.a.a.d.p;
import d.a.a.d.z;
import java.util.Iterator;
import java.util.LinkedList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class g extends BroadcastReceiver implements z.b, p.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f30118b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f30120d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f30125i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f30126j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f30127k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Runnable f30128l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public NetworkInfo f30129m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinkedList<b> f30130n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30119c = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30121e = 60;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f30122f = 65536;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f30123g = 20;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f30124h = c.DISCONNECTED;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            c cVar = gVar.f30124h;
            c cVar2 = c.PENDINGDISCONNECT;
            if (cVar != cVar2) {
                return;
            }
            c cVar3 = c.DISCONNECTED;
            gVar.f30124h = cVar3;
            if (gVar.f30125i == cVar2) {
                gVar.f30125i = cVar3;
            }
            gVar.f30120d.a(g.this.g());
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f30132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f30133b;

        public b(long j2, long j3) {
            this.f30132a = j2;
            this.f30133b = j3;
        }

        public /* synthetic */ b(long j2, long j3, a aVar) {
            this(j2, j3);
        }
    }

    public enum c {
        SHOULDBECONNECTED,
        PENDINGDISCONNECT,
        DISCONNECTED
    }

    public g(p pVar) {
        c cVar = c.SHOULDBECONNECTED;
        this.f30125i = cVar;
        this.f30126j = cVar;
        this.f30127k = null;
        this.f30128l = new a();
        this.f30130n = new LinkedList<>();
        this.f30120d = pVar;
        pVar.c(this);
        this.f30118b = new Handler();
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // d.a.a.d.p.a
    public boolean a() {
        return j();
    }

    @Override // d.a.a.d.z.b
    public void c1(long j2, long j3, long j4, long j5) {
        if (this.f30125i != c.PENDINGDISCONNECT) {
            return;
        }
        this.f30130n.add(new b(System.currentTimeMillis(), j4 + j5, null));
        while (this.f30130n.getFirst().f30132a <= System.currentTimeMillis() - 60000) {
            this.f30130n.removeFirst();
        }
        long j6 = 0;
        Iterator<b> it = this.f30130n.iterator();
        while (it.hasNext()) {
            j6 += it.next().f30133b;
        }
        if (j6 < 65536) {
            this.f30125i = c.DISCONNECTED;
            z.t(R.string.screenoff_pause, "64 kB", 60);
            this.f30120d.a(g());
        }
    }

    public final void e() {
        this.f30130n.add(new b(System.currentTimeMillis(), 65536L, null));
    }

    public final NetworkInfo f(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public final p.b g() {
        c cVar = this.f30126j;
        c cVar2 = c.DISCONNECTED;
        return cVar == cVar2 ? p.b.userPause : this.f30125i == cVar2 ? p.b.screenOff : this.f30124h == cVar2 ? p.b.noNetwork : p.b.userPause;
    }

    public boolean h() {
        return this.f30126j == c.DISCONNECTED;
    }

    public void i(Context context) {
        String str;
        NetworkInfo networkInfoF = f(context);
        boolean z = u.a(context).getBoolean("netchangereconnect", true);
        if (networkInfoF == null) {
            str = "not connected";
        } else {
            String subtypeName = networkInfoF.getSubtypeName();
            String str2 = BuildConfig.FLAVOR;
            if (subtypeName == null) {
                subtypeName = BuildConfig.FLAVOR;
            }
            String extraInfo = networkInfoF.getExtraInfo();
            if (extraInfo != null) {
                str2 = extraInfo;
            }
            str = String.format("%2$s %4$s to %1$s %3$s", networkInfoF.getTypeName(), networkInfoF.getDetailedState(), str2, subtypeName);
        }
        if (networkInfoF != null && networkInfoF.getState() == NetworkInfo.State.CONNECTED) {
            int type = networkInfoF.getType();
            c cVar = this.f30124h;
            c cVar2 = c.PENDINGDISCONNECT;
            boolean z2 = cVar == cVar2;
            this.f30124h = c.SHOULDBECONNECTED;
            NetworkInfo networkInfo = this.f30129m;
            boolean z3 = networkInfo != null && networkInfo.getType() == networkInfoF.getType() && d(this.f30129m.getExtraInfo(), networkInfoF.getExtraInfo());
            if (z2 && z3) {
                this.f30118b.removeCallbacks(this.f30128l);
                this.f30120d.b(true);
            } else {
                if (this.f30125i == cVar2) {
                    this.f30125i = c.DISCONNECTED;
                }
                if (j()) {
                    this.f30118b.removeCallbacks(this.f30128l);
                    if (z2 || !z3) {
                        this.f30120d.b(z3);
                    } else {
                        this.f30120d.resume();
                    }
                }
                this.f30119c = type;
                this.f30129m = networkInfoF;
            }
        } else if (networkInfoF == null) {
            this.f30119c = -1;
            if (z) {
                this.f30124h = c.PENDINGDISCONNECT;
                this.f30118b.postDelayed(this.f30128l, 20000L);
            }
        }
        if (!str.equals(this.f30127k)) {
            z.t(R.string.netstatus, str);
        }
        z.m(String.format("Debug state info: %s, pause: %s, shouldbeconnected: %s, network: %s ", str, g(), Boolean.valueOf(j()), this.f30124h));
        this.f30127k = str;
    }

    public final boolean j() {
        c cVar = this.f30125i;
        c cVar2 = c.SHOULDBECONNECTED;
        return cVar == cVar2 && this.f30126j == cVar2 && this.f30124h == cVar2;
    }

    public void k(boolean z) {
        if (z) {
            this.f30126j = c.DISCONNECTED;
        } else {
            boolean zJ = j();
            this.f30126j = c.SHOULDBECONNECTED;
            if (j() && !zJ) {
                this.f30120d.resume();
                return;
            }
        }
        this.f30120d.a(g());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        SharedPreferences sharedPreferencesA = u.a(context);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            i(context);
            return;
        }
        if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean zJ = j();
                this.f30125i = c.SHOULDBECONNECTED;
                this.f30118b.removeCallbacks(this.f30128l);
                if (j() != zJ) {
                    this.f30120d.resume();
                    return;
                } else {
                    if (j()) {
                        return;
                    }
                    this.f30120d.a(g());
                    return;
                }
            }
            return;
        }
        if (sharedPreferencesA.getBoolean("screenoff", false)) {
            if (v.i() != null && !v.i().P) {
                z.n(R.string.screen_nopersistenttun);
            }
            this.f30125i = c.PENDINGDISCONNECT;
            e();
            c cVar = this.f30124h;
            c cVar2 = c.DISCONNECTED;
            if (cVar == cVar2 || this.f30126j == cVar2) {
                this.f30125i = cVar2;
            }
        }
    }
}
