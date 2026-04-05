package c.f.a.b.c3;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import c.f.a.b.c3.x;
import c.f.a.b.j3.x0;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b0 extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<Class<? extends b0>, b> f6678b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f6679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x f6683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6685i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6686j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6687k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6688l;

    public static final class b implements x.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f6689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x f6690b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f6691c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c.f.a.b.d3.f f6692d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Class<? extends b0> f6693e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b0 f6694f;

        public b(Context context, x xVar, boolean z, c.f.a.b.d3.f fVar, Class<? extends b0> cls) {
            this.f6689a = context;
            this.f6690b = xVar;
            this.f6691c = z;
            this.f6692d = fVar;
            this.f6693e = cls;
            xVar.b(this);
            o();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void l(b0 b0Var) {
            b0Var.u(this.f6690b.c());
        }

        @Override // c.f.a.b.c3.x.d
        public /* synthetic */ void a(x xVar, boolean z) {
            y.b(this, xVar, z);
        }

        @Override // c.f.a.b.c3.x.d
        public void b(x xVar, boolean z) {
            if (!z && !xVar.e() && n()) {
                List<r> listC = xVar.c();
                int i2 = 0;
                while (true) {
                    if (i2 >= listC.size()) {
                        break;
                    }
                    if (listC.get(i2).f6767b == 0) {
                        m();
                        break;
                    }
                    i2++;
                }
            }
            o();
        }

        @Override // c.f.a.b.c3.x.d
        public void c(x xVar, r rVar, Exception exc) {
            b0 b0Var = this.f6694f;
            if (b0Var != null) {
                b0Var.s(rVar);
            }
            if (n() && b0.r(rVar.f6767b)) {
                c.f.a.b.j3.z.i("DownloadService", "DownloadService wasn't running. Restarting.");
                m();
            }
        }

        @Override // c.f.a.b.c3.x.d
        public /* synthetic */ void d(x xVar, c.f.a.b.d3.d dVar, int i2) {
            y.e(this, xVar, dVar, i2);
        }

        @Override // c.f.a.b.c3.x.d
        public void e(x xVar, r rVar) {
            b0 b0Var = this.f6694f;
            if (b0Var != null) {
                b0Var.t(rVar);
            }
        }

        @Override // c.f.a.b.c3.x.d
        public final void f(x xVar) {
            b0 b0Var = this.f6694f;
            if (b0Var != null) {
                b0Var.C();
            }
        }

        @Override // c.f.a.b.c3.x.d
        public void g(x xVar) {
            b0 b0Var = this.f6694f;
            if (b0Var != null) {
                b0Var.u(xVar.c());
            }
        }

        public void i(final b0 b0Var) {
            c.f.a.b.j3.g.g(this.f6694f == null);
            this.f6694f = b0Var;
            if (this.f6690b.i()) {
                x0.z().postAtFrontOfQueue(new Runnable() { // from class: c.f.a.b.c3.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6750b.l(b0Var);
                    }
                });
            }
        }

        public void j(b0 b0Var) {
            c.f.a.b.j3.g.g(this.f6694f == b0Var);
            this.f6694f = null;
            if (this.f6692d == null || this.f6690b.j()) {
                return;
            }
            this.f6692d.cancel();
        }

        public final void m() {
            if (this.f6691c) {
                x0.X0(this.f6689a, b0.n(this.f6689a, this.f6693e, "com.google.android.exoplayer.downloadService.action.RESTART"));
            } else {
                try {
                    this.f6689a.startService(b0.n(this.f6689a, this.f6693e, "com.google.android.exoplayer.downloadService.action.INIT"));
                } catch (IllegalStateException unused) {
                    c.f.a.b.j3.z.i("DownloadService", "Failed to restart DownloadService (process is idle).");
                }
            }
        }

        public final boolean n() {
            b0 b0Var = this.f6694f;
            return b0Var == null || b0Var.q();
        }

        public final void o() {
            if (this.f6692d == null) {
                return;
            }
            if (!this.f6690b.j()) {
                this.f6692d.cancel();
                return;
            }
            String packageName = this.f6689a.getPackageName();
            if (this.f6692d.a(this.f6690b.f(), packageName, "com.google.android.exoplayer.downloadService.action.RESTART")) {
                return;
            }
            c.f.a.b.j3.z.d("DownloadService", "Scheduling downloads failed.");
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f6697c = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f6698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f6699e;

        public c(int i2, long j2) {
            this.f6695a = i2;
            this.f6696b = j2;
        }

        public void a() {
            if (this.f6699e) {
                f();
            }
        }

        public void c() {
            if (this.f6699e) {
                return;
            }
            f();
        }

        public void d() {
            this.f6698d = true;
            f();
        }

        public void e() {
            this.f6698d = false;
            this.f6697c.removeCallbacksAndMessages(null);
        }

        public final void f() {
            List<r> listC = ((x) c.f.a.b.j3.g.e(b0.this.f6683g)).c();
            b0 b0Var = b0.this;
            b0Var.startForeground(this.f6695a, b0Var.m(listC));
            this.f6699e = true;
            if (this.f6698d) {
                this.f6697c.removeCallbacksAndMessages(null);
                this.f6697c.postDelayed(new Runnable() { // from class: c.f.a.b.c3.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f6752b.f();
                    }
                }, this.f6696b);
            }
        }
    }

    public b0(int i2, long j2, String str, int i3, int i4) {
        if (i2 == 0) {
            this.f6679c = null;
            this.f6680d = null;
            this.f6681e = 0;
            this.f6682f = 0;
            return;
        }
        this.f6679c = new c(i2, j2);
        this.f6680d = str;
        this.f6681e = i3;
        this.f6682f = i4;
    }

    public static void A(Context context, Class<? extends b0> cls) {
        x0.X0(context, o(context, cls, "com.google.android.exoplayer.downloadService.action.INIT", true));
    }

    public static void B(Context context, Intent intent, boolean z) {
        if (z) {
            x0.X0(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Intent i(Context context, Class<? extends b0> cls, a0 a0Var, int i2, boolean z) {
        return o(context, cls, "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD", z).putExtra("download_request", a0Var).putExtra("stop_reason", i2);
    }

    public static Intent j(Context context, Class<? extends b0> cls, a0 a0Var, boolean z) {
        return i(context, cls, a0Var, 0, z);
    }

    public static Intent k(Context context, Class<? extends b0> cls, String str, boolean z) {
        return o(context, cls, "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD", z).putExtra("content_id", str);
    }

    public static Intent n(Context context, Class<? extends b0> cls, String str) {
        return new Intent(context, cls).setAction(str);
    }

    public static Intent o(Context context, Class<? extends b0> cls, String str, boolean z) {
        return n(context, cls, str).putExtra("foreground", z);
    }

    public static boolean r(int i2) {
        return i2 == 2 || i2 == 5 || i2 == 7;
    }

    public static void x(Context context, Class<? extends b0> cls, a0 a0Var, boolean z) {
        B(context, j(context, cls, a0Var, z), z);
    }

    public static void y(Context context, Class<? extends b0> cls, String str, boolean z) {
        B(context, k(context, cls, str, z), z);
    }

    public static void z(Context context, Class<? extends b0> cls) {
        context.startService(n(context, cls, "com.google.android.exoplayer.downloadService.action.INIT"));
    }

    public final void C() {
        boolean zStopSelfResult;
        c cVar = this.f6679c;
        if (cVar != null) {
            cVar.e();
        }
        if (x0.f9296a >= 28 || !this.f6686j) {
            zStopSelfResult = this.f6687k | stopSelfResult(this.f6684h);
        } else {
            stopSelf();
            zStopSelfResult = true;
        }
        this.f6687k = zStopSelfResult;
    }

    public abstract x l();

    public abstract Notification m(List<r> list);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public void onCreate() {
        String str = this.f6680d;
        if (str != null) {
            c.f.a.b.j3.g0.a(this, str, this.f6681e, this.f6682f, 2);
        }
        Class<?> cls = getClass();
        HashMap<Class<? extends b0>, b> map = f6678b;
        b bVar = map.get(cls);
        if (bVar == null) {
            boolean z = this.f6679c != null;
            c.f.a.b.d3.f fVarP = z ? p() : null;
            x xVarL = l();
            this.f6683g = xVarL;
            xVarL.v();
            bVar = new b(getApplicationContext(), this.f6683g, z, fVarP, cls);
            map.put((Class<? extends b0>) cls, bVar);
        } else {
            this.f6683g = bVar.f6690b;
        }
        bVar.i(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f6688l = true;
        ((b) c.f.a.b.j3.g.e(f6678b.get(getClass()))).j(this);
        c cVar = this.f6679c;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        String action;
        String stringExtra;
        x xVar;
        c cVar;
        String str;
        this.f6684h = i3;
        this.f6686j = false;
        action = null;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            this.f6685i |= intent.getBooleanExtra("foreground", false) || "com.google.android.exoplayer.downloadService.action.RESTART".equals(action);
        } else {
            stringExtra = null;
        }
        if (action == null) {
            action = "com.google.android.exoplayer.downloadService.action.INIT";
        }
        xVar = (x) c.f.a.b.j3.g.e(this.f6683g);
        switch (action) {
            case "com.google.android.exoplayer.downloadService.action.ADD_DOWNLOAD":
                a0 a0Var = (a0) ((Intent) c.f.a.b.j3.g.e(intent)).getParcelableExtra("download_request");
                if (a0Var != null) {
                    xVar.a(a0Var, intent.getIntExtra("stop_reason", 0));
                    break;
                } else {
                    str = "Ignored ADD_DOWNLOAD: Missing download_request extra";
                    c.f.a.b.j3.z.d("DownloadService", str);
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                xVar.v();
                break;
            case "com.google.android.exoplayer.downloadService.action.RESTART":
            case "com.google.android.exoplayer.downloadService.action.INIT":
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                xVar.t();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_REQUIREMENTS":
                c.f.a.b.d3.d dVar = (c.f.a.b.d3.d) ((Intent) c.f.a.b.j3.g.e(intent)).getParcelableExtra("requirements");
                if (dVar != null) {
                    c.f.a.b.d3.f fVarP = p();
                    if (fVarP != null) {
                        c.f.a.b.d3.d dVarB = fVarP.b(dVar);
                        if (!dVarB.equals(dVar)) {
                            c.f.a.b.j3.z.i("DownloadService", "Ignoring requirements not supported by the Scheduler: " + (dVar.e() ^ dVarB.e()));
                            dVar = dVarB;
                        }
                    }
                    xVar.x(dVar);
                    break;
                } else {
                    str = "Ignored SET_REQUIREMENTS: Missing requirements extra";
                    c.f.a.b.j3.z.d("DownloadService", str);
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                xVar.s();
                break;
            case "com.google.android.exoplayer.downloadService.action.SET_STOP_REASON":
                if (!((Intent) c.f.a.b.j3.g.e(intent)).hasExtra("stop_reason")) {
                    str = "Ignored SET_STOP_REASON: Missing stop_reason extra";
                    c.f.a.b.j3.z.d("DownloadService", str);
                    break;
                } else {
                    xVar.y(stringExtra, intent.getIntExtra("stop_reason", 0));
                    break;
                }
                break;
            case "com.google.android.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra != null) {
                    xVar.u(stringExtra);
                    break;
                } else {
                    str = "Ignored REMOVE_DOWNLOAD: Missing content_id extra";
                    c.f.a.b.j3.z.d("DownloadService", str);
                    break;
                }
                break;
            default:
                str = "Ignored unrecognized action: " + action;
                c.f.a.b.j3.z.d("DownloadService", str);
                break;
        }
        if (x0.f9296a >= 26 && this.f6685i && (cVar = this.f6679c) != null) {
            cVar.c();
        }
        this.f6687k = false;
        if (xVar.h()) {
            C();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        this.f6686j = true;
    }

    public abstract c.f.a.b.d3.f p();

    public final boolean q() {
        return this.f6687k;
    }

    public final void s(r rVar) {
        v(rVar);
        if (this.f6679c != null) {
            if (r(rVar.f6767b)) {
                this.f6679c.d();
            } else {
                this.f6679c.a();
            }
        }
    }

    public final void t(r rVar) {
        w(rVar);
        c cVar = this.f6679c;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void u(List<r> list) {
        if (this.f6679c != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (r(list.get(i2).f6767b)) {
                    this.f6679c.d();
                    return;
                }
            }
        }
    }

    @Deprecated
    public void v(r rVar) {
    }

    @Deprecated
    public void w(r rVar) {
    }
}
