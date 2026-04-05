package c.f.a.b.k3;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import c.f.a.b.j3.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f9547a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f9548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f9549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f9551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f9552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f9553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f9554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f9555i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f9556j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f9557k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f9558l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f9559m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f9560n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f9561o;
    public long p;

    public interface a {

        /* JADX INFO: renamed from: c.f.a.b.k3.z$a$a, reason: collision with other inner class name */
        public interface InterfaceC0139a {
            void a(Display display);
        }

        void a(InterfaceC0139a interfaceC0139a);

        void b();
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WindowManager f9562a;

        public b(WindowManager windowManager) {
            this.f9562a = windowManager;
        }

        public static a c(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new b(windowManager);
            }
            return null;
        }

        @Override // c.f.a.b.k3.z.a
        public void a(a.InterfaceC0139a interfaceC0139a) {
            interfaceC0139a.a(this.f9562a.getDefaultDisplay());
        }

        @Override // c.f.a.b.k3.z.a
        public void b() {
        }
    }

    public static final class c implements a, DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DisplayManager f9563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a.InterfaceC0139a f9564b;

        public c(DisplayManager displayManager) {
            this.f9563a = displayManager;
        }

        public static a d(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new c(displayManager);
            }
            return null;
        }

        @Override // c.f.a.b.k3.z.a
        public void a(a.InterfaceC0139a interfaceC0139a) {
            this.f9564b = interfaceC0139a;
            this.f9563a.registerDisplayListener(this, x0.x());
            interfaceC0139a.a(c());
        }

        @Override // c.f.a.b.k3.z.a
        public void b() {
            this.f9563a.unregisterDisplayListener(this);
            this.f9564b = null;
        }

        public final Display c() {
            return this.f9563a.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i2) {
            a.InterfaceC0139a interfaceC0139a = this.f9564b;
            if (interfaceC0139a == null || i2 != 0) {
                return;
            }
            interfaceC0139a.a(c());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i2) {
        }
    }

    public static final class d implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f9565b = new d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile long f9566c = -9223372036854775807L;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Handler f9567d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final HandlerThread f9568e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Choreographer f9569f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f9570g;

        public d() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f9568e = handlerThread;
            handlerThread.start();
            Handler handlerW = x0.w(handlerThread.getLooper(), this);
            this.f9567d = handlerW;
            handlerW.sendEmptyMessage(0);
        }

        public static d d() {
            return f9565b;
        }

        public void a() {
            this.f9567d.sendEmptyMessage(1);
        }

        public final void b() {
            int i2 = this.f9570g + 1;
            this.f9570g = i2;
            if (i2 == 1) {
                ((Choreographer) c.f.a.b.j3.g.e(this.f9569f)).postFrameCallback(this);
            }
        }

        public final void c() {
            this.f9569f = Choreographer.getInstance();
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j2) {
            this.f9566c = j2;
            ((Choreographer) c.f.a.b.j3.g.e(this.f9569f)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f9567d.sendEmptyMessage(2);
        }

        public final void f() {
            int i2 = this.f9570g - 1;
            this.f9570g = i2;
            if (i2 == 0) {
                ((Choreographer) c.f.a.b.j3.g.e(this.f9569f)).removeFrameCallback(this);
                this.f9566c = -9223372036854775807L;
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                c();
                return true;
            }
            if (i2 == 1) {
                b();
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            f();
            return true;
        }
    }

    public z(Context context) {
        a aVarF = f(context);
        this.f9548b = aVarF;
        this.f9549c = aVarF != null ? d.d() : null;
        this.f9556j = -9223372036854775807L;
        this.f9557k = -9223372036854775807L;
        this.f9552f = -1.0f;
        this.f9555i = 1.0f;
    }

    public static boolean b(long j2, long j3) {
        return Math.abs(j2 - j3) <= 20000000;
    }

    public static long d(long j2, long j3, long j4) {
        long j5;
        long j6 = j3 + (((j2 - j3) / j4) * j4);
        if (j2 <= j6) {
            j5 = j6 - j4;
        } else {
            j6 = j4 + j6;
            j5 = j6;
        }
        return j6 - j2 < j2 - j5 ? j6 : j5;
    }

    public static a f(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        a aVarD = x0.f9296a >= 17 ? c.d(applicationContext) : null;
        return aVarD == null ? b.c(applicationContext) : aVarD;
    }

    public static void q(Surface surface, float f2) {
        try {
            surface.setFrameRate(f2, f2 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e2) {
            c.f.a.b.j3.z.e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
        }
    }

    public long a(long j2) {
        long j3;
        if (this.f9561o == -1 || !this.f9547a.e()) {
            j3 = j2;
        } else {
            long jA = this.p + ((long) ((this.f9547a.a() * (this.f9558l - this.f9561o)) / this.f9555i));
            if (b(j2, jA)) {
                j3 = jA;
            } else {
                p();
                j3 = j2;
            }
        }
        this.f9559m = this.f9558l;
        this.f9560n = j3;
        d dVar = this.f9549c;
        if (dVar == null || this.f9556j == -9223372036854775807L) {
            return j3;
        }
        long j4 = dVar.f9566c;
        return j4 == -9223372036854775807L ? j3 : d(j3, j4, this.f9556j) - this.f9557k;
    }

    public final void c() {
        Surface surface;
        if (x0.f9296a < 30 || (surface = this.f9551e) == null || this.f9554h == 0.0f) {
            return;
        }
        this.f9554h = 0.0f;
        q(surface, 0.0f);
    }

    public void g() {
        a aVar = this.f9548b;
        if (aVar != null) {
            aVar.b();
            ((d) c.f.a.b.j3.g.e(this.f9549c)).e();
        }
    }

    public void h() {
        if (this.f9548b != null) {
            ((d) c.f.a.b.j3.g.e(this.f9549c)).a();
            this.f9548b.a(new a.InterfaceC0139a() { // from class: c.f.a.b.k3.a
                @Override // c.f.a.b.k3.z.a.InterfaceC0139a
                public final void a(Display display) {
                    this.f9358a.r(display);
                }
            });
        }
    }

    public void i(float f2) {
        this.f9552f = f2;
        this.f9547a.g();
        s();
    }

    public void j(long j2) {
        long j3 = this.f9559m;
        if (j3 != -1) {
            this.f9561o = j3;
            this.p = this.f9560n;
        }
        this.f9558l++;
        this.f9547a.f(j2 * 1000);
        s();
    }

    public void k(float f2) {
        this.f9555i = f2;
        p();
        t(false);
    }

    public void l() {
        p();
    }

    public void m() {
        this.f9550d = true;
        p();
        t(false);
    }

    public void n() {
        this.f9550d = false;
        c();
    }

    public void o(Surface surface) {
        if (surface instanceof q) {
            surface = null;
        }
        if (this.f9551e == surface) {
            return;
        }
        c();
        this.f9551e = surface;
        t(true);
    }

    public final void p() {
        this.f9558l = 0L;
        this.f9561o = -1L;
        this.f9559m = -1L;
    }

    public final void r(Display display) {
        long j2;
        if (display != null) {
            double refreshRate = display.getRefreshRate();
            Double.isNaN(refreshRate);
            long j3 = (long) (1.0E9d / refreshRate);
            this.f9556j = j3;
            j2 = (j3 * 80) / 100;
        } else {
            c.f.a.b.j3.z.i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j2 = -9223372036854775807L;
            this.f9556j = -9223372036854775807L;
        }
        this.f9557k = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s() {
        /*
            r8 = this;
            int r0 = c.f.a.b.j3.x0.f9296a
            r1 = 30
            if (r0 < r1) goto L75
            android.view.Surface r0 = r8.f9551e
            if (r0 != 0) goto Lc
            goto L75
        Lc:
            c.f.a.b.k3.r r0 = r8.f9547a
            boolean r0 = r0.e()
            if (r0 == 0) goto L1b
            c.f.a.b.k3.r r0 = r8.f9547a
            float r0 = r0.b()
            goto L1d
        L1b:
            float r0 = r8.f9552f
        L1d:
            float r2 = r8.f9553g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L24
            return
        L24:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 0
            r5 = 1
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 == 0) goto L61
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L61
            c.f.a.b.k3.r r1 = r8.f9547a
            boolean r1 = r1.e()
            if (r1 == 0) goto L49
            c.f.a.b.k3.r r1 = r8.f9547a
            long r1 = r1.d()
            r6 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto L49
            r1 = 1
            goto L4a
        L49:
            r1 = 0
        L4a:
            if (r1 == 0) goto L50
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L52
        L50:
            r1 = 1065353216(0x3f800000, float:1.0)
        L52:
            float r2 = r8.f9553g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L5f
            goto L6e
        L5f:
            r5 = 0
            goto L6e
        L61:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L66
            goto L6e
        L66:
            c.f.a.b.k3.r r2 = r8.f9547a
            int r2 = r2.c()
            if (r2 < r1) goto L5f
        L6e:
            if (r5 == 0) goto L75
            r8.f9553g = r0
            r8.t(r4)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.k3.z.s():void");
    }

    public final void t(boolean z) {
        Surface surface;
        if (x0.f9296a < 30 || (surface = this.f9551e) == null) {
            return;
        }
        float f2 = 0.0f;
        if (this.f9550d) {
            float f3 = this.f9553g;
            if (f3 != -1.0f) {
                f2 = this.f9555i * f3;
            }
        }
        if (z || this.f9554h != f2) {
            this.f9554h = f2;
            q(surface, f2);
        }
    }
}
