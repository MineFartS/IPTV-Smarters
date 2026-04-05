package c.f.a.b;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import c.f.a.b.a2;
import c.f.a.b.d2;
import c.f.a.b.f1;
import c.f.a.b.k3.f0.l;
import c.f.a.b.o2;
import c.f.a.b.r0;
import c.f.a.b.s0;
import c.f.a.b.z0;
import com.amazonaws.services.s3.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class n2 extends t0 implements f1 {
    public boolean A;
    public TextureView B;
    public int C;
    public int D;
    public int E;
    public c.f.a.b.v2.d F;
    public c.f.a.b.v2.d G;
    public int H;
    public c.f.a.b.t2.p I;
    public float J;
    public boolean K;
    public List<c.f.a.b.f3.c> L;
    public boolean M;
    public boolean N;
    public c.f.a.b.j3.k0 O;
    public boolean P;
    public boolean Q;
    public c.f.a.b.w2.b R;
    public c.f.a.b.k3.e0 S;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h2[] f9591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.j3.l f9592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f9593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g1 f9594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f9595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f9596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArraySet<c.f.a.b.k3.b0> f9597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArraySet<c.f.a.b.t2.r> f9598i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArraySet<c.f.a.b.f3.l> f9599j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CopyOnWriteArraySet<c.f.a.b.b3.f> f9600k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArraySet<c.f.a.b.w2.c> f9601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c.f.a.b.s2.h1 f9602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r0 f9603n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s0 f9604o;
    public final o2 p;
    public final q2 q;
    public final r2 r;
    public final long s;
    public k1 t;
    public k1 u;
    public AudioTrack v;
    public Object w;
    public Surface x;
    public SurfaceHolder y;
    public c.f.a.b.k3.f0.l z;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f9605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l2 f9606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c.f.a.b.j3.i f9607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f9608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c.f.a.b.g3.o f9609e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c.f.a.b.e3.k0 f9610f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o1 f9611g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c.f.a.b.i3.i f9612h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public c.f.a.b.s2.h1 f9613i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Looper f9614j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public c.f.a.b.j3.k0 f9615k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public c.f.a.b.t2.p f9616l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f9617m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f9618n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f9619o;
        public boolean p;
        public int q;
        public boolean r;
        public m2 s;
        public long t;
        public long u;
        public n1 v;
        public long w;
        public long x;
        public boolean y;
        public boolean z;

        public b(Context context, l2 l2Var) {
            this(context, l2Var, new c.f.a.b.z2.h());
        }

        public b(Context context, l2 l2Var, c.f.a.b.g3.o oVar, c.f.a.b.e3.k0 k0Var, o1 o1Var, c.f.a.b.i3.i iVar, c.f.a.b.s2.h1 h1Var) {
            this.f9605a = context;
            this.f9606b = l2Var;
            this.f9609e = oVar;
            this.f9610f = k0Var;
            this.f9611g = o1Var;
            this.f9612h = iVar;
            this.f9613i = h1Var;
            this.f9614j = c.f.a.b.j3.x0.Q();
            this.f9616l = c.f.a.b.t2.p.f10154a;
            this.f9618n = 0;
            this.q = 1;
            this.r = true;
            this.s = m2.f9586e;
            this.t = 5000L;
            this.u = 15000L;
            this.v = new z0.b().a();
            this.f9607c = c.f.a.b.j3.i.f9202a;
            this.w = 500L;
            this.x = 2000L;
        }

        public b(Context context, l2 l2Var, c.f.a.b.z2.o oVar) {
            this(context, l2Var, new c.f.a.b.g3.f(context), new c.f.a.b.e3.w(context, oVar), new a1(), c.f.a.b.i3.u.l(context), new c.f.a.b.s2.h1(c.f.a.b.j3.i.f9202a));
        }

        public b A(c.f.a.b.e3.k0 k0Var) {
            c.f.a.b.j3.g.g(!this.z);
            this.f9610f = k0Var;
            return this;
        }

        public b B(c.f.a.b.g3.o oVar) {
            c.f.a.b.j3.g.g(!this.z);
            this.f9609e = oVar;
            return this;
        }

        public n2 z() {
            c.f.a.b.j3.g.g(!this.z);
            this.z = true;
            return new n2(this);
        }
    }

    public final class c implements c.f.a.b.k3.d0, c.f.a.b.t2.u, c.f.a.b.f3.l, c.f.a.b.b3.f, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, l.b, s0.b, r0.b, o2.b, a2.c, f1.a {
        public c() {
        }

        @Override // c.f.a.b.t2.u
        public void A(String str) {
            n2.this.f9602m.A(str);
        }

        @Override // c.f.a.b.t2.u
        public void B(String str, long j2, long j3) {
            n2.this.f9602m.B(str, j2, j3);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void C(boolean z) {
            b2.p(this, z);
        }

        @Override // c.f.a.b.b3.f
        public void D(c.f.a.b.b3.a aVar) {
            n2.this.f9602m.D(aVar);
            n2.this.f9594e.e1(aVar);
            Iterator it = n2.this.f9600k.iterator();
            while (it.hasNext()) {
                ((c.f.a.b.b3.f) it.next()).D(aVar);
            }
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void E(a2 a2Var, a2.d dVar) {
            b2.b(this, a2Var, dVar);
        }

        @Override // c.f.a.b.k3.d0
        public void F(int i2, long j2) {
            n2.this.f9602m.F(i2, j2);
        }

        @Override // c.f.a.b.k3.f0.l.b
        public void G(Surface surface) {
            n2.this.u1(surface);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void H(boolean z, int i2) {
            b2.k(this, z, i2);
        }

        @Override // c.f.a.b.t2.u
        public void I(k1 k1Var, c.f.a.b.v2.g gVar) {
            n2.this.u = k1Var;
            n2.this.f9602m.I(k1Var, gVar);
        }

        @Override // c.f.a.b.o2.b
        public void J(int i2, boolean z) {
            Iterator it = n2.this.f9601l.iterator();
            while (it.hasNext()) {
                ((c.f.a.b.w2.c) it.next()).G(i2, z);
            }
        }

        @Override // c.f.a.b.f1.a
        public /* synthetic */ void K(boolean z) {
            e1.a(this, z);
        }

        @Override // c.f.a.b.k3.d0
        public void M(Object obj, long j2) {
            n2.this.f9602m.M(obj, j2);
            if (n2.this.w == obj) {
                Iterator it = n2.this.f9597h.iterator();
                while (it.hasNext()) {
                    ((c.f.a.b.k3.b0) it.next()).N();
                }
            }
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void O(p1 p1Var, int i2) {
            b2.e(this, p1Var, i2);
        }

        @Override // c.f.a.b.f3.l
        public void Q(List<c.f.a.b.f3.c> list) {
            n2.this.L = list;
            Iterator it = n2.this.f9599j.iterator();
            while (it.hasNext()) {
                ((c.f.a.b.f3.l) it.next()).Q(list);
            }
        }

        @Override // c.f.a.b.k3.d0
        public /* synthetic */ void R(k1 k1Var) {
            c.f.a.b.k3.c0.i(this, k1Var);
        }

        @Override // c.f.a.b.k3.d0
        public void S(c.f.a.b.v2.d dVar) {
            n2.this.F = dVar;
            n2.this.f9602m.S(dVar);
        }

        @Override // c.f.a.b.k3.d0
        public void T(k1 k1Var, c.f.a.b.v2.g gVar) {
            n2.this.t = k1Var;
            n2.this.f9602m.T(k1Var, gVar);
        }

        @Override // c.f.a.b.t2.u
        public void U(long j2) {
            n2.this.f9602m.U(j2);
        }

        @Override // c.f.a.b.t2.u
        public void W(Exception exc) {
            n2.this.f9602m.W(exc);
        }

        @Override // c.f.a.b.t2.u
        public /* synthetic */ void X(k1 k1Var) {
            c.f.a.b.t2.t.f(this, k1Var);
        }

        @Override // c.f.a.b.k3.d0
        public void Y(Exception exc) {
            n2.this.f9602m.Y(exc);
        }

        @Override // c.f.a.b.a2.c
        public void Z(boolean z, int i2) {
            n2.this.x1();
        }

        @Override // c.f.a.b.t2.u
        public void a(boolean z) {
            if (n2.this.K == z) {
                return;
            }
            n2.this.K = z;
            n2.this.f1();
        }

        @Override // c.f.a.b.k3.d0
        public void b(c.f.a.b.k3.e0 e0Var) {
            n2.this.S = e0Var;
            n2.this.f9602m.b(e0Var);
            for (c.f.a.b.k3.b0 b0Var : n2.this.f9597h) {
                b0Var.b(e0Var);
                b0Var.L(e0Var.f9371c, e0Var.f9372d, e0Var.f9373e, e0Var.f9374f);
            }
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void b0(c.f.a.b.e3.a1 a1Var, c.f.a.b.g3.l lVar) {
            b2.s(this, a1Var, lVar);
        }

        @Override // c.f.a.b.t2.u
        public void c(Exception exc) {
            n2.this.f9602m.c(exc);
        }

        @Override // c.f.a.b.k3.d0
        public void c0(c.f.a.b.v2.d dVar) {
            n2.this.f9602m.c0(dVar);
            n2.this.t = null;
            n2.this.F = null;
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void d(z1 z1Var) {
            b2.g(this, z1Var);
        }

        @Override // c.f.a.b.t2.u
        public void e(c.f.a.b.v2.d dVar) {
            n2.this.f9602m.e(dVar);
            n2.this.u = null;
            n2.this.G = null;
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void f(a2.f fVar, a2.f fVar2, int i2) {
            b2.m(this, fVar, fVar2, i2);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void g(int i2) {
            b2.h(this, i2);
        }

        @Override // c.f.a.b.t2.u
        public void g0(int i2, long j2, long j3) {
            n2.this.f9602m.g0(i2, j2, j3);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void h(boolean z) {
            b2.d(this, z);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void h0(x1 x1Var) {
            b2.j(this, x1Var);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void i(int i2) {
            b2.l(this, i2);
        }

        @Override // c.f.a.b.k3.d0
        public void j(String str) {
            n2.this.f9602m.j(str);
        }

        @Override // c.f.a.b.k3.d0
        public void j0(long j2, int i2) {
            n2.this.f9602m.j0(j2, i2);
        }

        @Override // c.f.a.b.t2.u
        public void k(c.f.a.b.v2.d dVar) {
            n2.this.G = dVar;
            n2.this.f9602m.k(dVar);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void l(List list) {
            b2.q(this, list);
        }

        @Override // c.f.a.b.k3.d0
        public void m(String str, long j2, long j3) {
            n2.this.f9602m.m(str, j2, j3);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void m0(boolean z) {
            b2.c(this, z);
        }

        @Override // c.f.a.b.o2.b
        public void n(int i2) {
            c.f.a.b.w2.b bVarV0 = n2.V0(n2.this.p);
            if (bVarV0.equals(n2.this.R)) {
                return;
            }
            n2.this.R = bVarV0;
            Iterator it = n2.this.f9601l.iterator();
            while (it.hasNext()) {
                ((c.f.a.b.w2.c) it.next()).k0(bVarV0);
            }
        }

        @Override // c.f.a.b.r0.b
        public void o() {
            n2.this.w1(false, -1, 3);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void onRepeatModeChanged(int i2) {
            b2.n(this, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            n2.this.t1(surfaceTexture);
            n2.this.e1(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            n2.this.u1(null);
            n2.this.e1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            n2.this.e1(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // c.f.a.b.a2.c
        public void p(boolean z) {
            n2 n2Var;
            if (n2.this.O != null) {
                boolean z2 = false;
                if (z && !n2.this.P) {
                    n2.this.O.a(0);
                    n2Var = n2.this;
                    z2 = true;
                } else {
                    if (z || !n2.this.P) {
                        return;
                    }
                    n2.this.O.d(0);
                    n2Var = n2.this;
                }
                n2Var.P = z2;
            }
        }

        @Override // c.f.a.b.f1.a
        public void q(boolean z) {
            n2.this.x1();
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void r() {
            b2.o(this);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void s(x1 x1Var) {
            b2.i(this, x1Var);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            n2.this.e1(i3, i4);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (n2.this.A) {
                n2.this.u1(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (n2.this.A) {
                n2.this.u1(null);
            }
            n2.this.e1(0, 0);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void t(a2.b bVar) {
            b2.a(this, bVar);
        }

        @Override // c.f.a.b.s0.b
        public void u(float f2) {
            n2.this.p1();
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void v(p2 p2Var, int i2) {
            b2.r(this, p2Var, i2);
        }

        @Override // c.f.a.b.s0.b
        public void w(int i2) {
            boolean zI = n2.this.i();
            n2.this.w1(zI, i2, n2.Z0(zI, i2));
        }

        @Override // c.f.a.b.a2.c
        public void x(int i2) {
            n2.this.x1();
        }

        @Override // c.f.a.b.k3.f0.l.b
        public void y(Surface surface) {
            n2.this.u1(null);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void z(q1 q1Var) {
            b2.f(this, q1Var);
        }
    }

    public static final class d implements c.f.a.b.k3.y, c.f.a.b.k3.f0.d, d2.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.f.a.b.k3.y f9621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c.f.a.b.k3.f0.d f9622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c.f.a.b.k3.y f9623d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c.f.a.b.k3.f0.d f9624e;

        public d() {
        }

        @Override // c.f.a.b.k3.f0.d
        public void a(long j2, float[] fArr) {
            c.f.a.b.k3.f0.d dVar = this.f9624e;
            if (dVar != null) {
                dVar.a(j2, fArr);
            }
            c.f.a.b.k3.f0.d dVar2 = this.f9622c;
            if (dVar2 != null) {
                dVar2.a(j2, fArr);
            }
        }

        @Override // c.f.a.b.k3.f0.d
        public void c() {
            c.f.a.b.k3.f0.d dVar = this.f9624e;
            if (dVar != null) {
                dVar.c();
            }
            c.f.a.b.k3.f0.d dVar2 = this.f9622c;
            if (dVar2 != null) {
                dVar2.c();
            }
        }

        @Override // c.f.a.b.k3.y
        public void d(long j2, long j3, k1 k1Var, MediaFormat mediaFormat) {
            c.f.a.b.k3.y yVar = this.f9623d;
            if (yVar != null) {
                yVar.d(j2, j3, k1Var, mediaFormat);
            }
            c.f.a.b.k3.y yVar2 = this.f9621b;
            if (yVar2 != null) {
                yVar2.d(j2, j3, k1Var, mediaFormat);
            }
        }

        @Override // c.f.a.b.d2.b
        public void p(int i2, Object obj) {
            c.f.a.b.k3.f0.d cameraMotionListener;
            if (i2 == 6) {
                this.f9621b = (c.f.a.b.k3.y) obj;
                return;
            }
            if (i2 == 7) {
                this.f9622c = (c.f.a.b.k3.f0.d) obj;
                return;
            }
            if (i2 != 10000) {
                return;
            }
            c.f.a.b.k3.f0.l lVar = (c.f.a.b.k3.f0.l) obj;
            if (lVar == null) {
                cameraMotionListener = null;
                this.f9623d = null;
            } else {
                this.f9623d = lVar.getVideoFrameMetadataListener();
                cameraMotionListener = lVar.getCameraMotionListener();
            }
            this.f9624e = cameraMotionListener;
        }
    }

    public n2(b bVar) throws Throwable {
        n2 n2Var;
        c cVar;
        d dVar;
        Handler handler;
        g1 g1Var;
        c.f.a.b.j3.l lVar = new c.f.a.b.j3.l();
        this.f9592c = lVar;
        try {
            Context applicationContext = bVar.f9605a.getApplicationContext();
            this.f9593d = applicationContext;
            c.f.a.b.s2.h1 h1Var = bVar.f9613i;
            this.f9602m = h1Var;
            this.O = bVar.f9615k;
            this.I = bVar.f9616l;
            this.C = bVar.q;
            this.K = bVar.p;
            this.s = bVar.x;
            cVar = new c();
            this.f9595f = cVar;
            dVar = new d();
            this.f9596g = dVar;
            this.f9597h = new CopyOnWriteArraySet<>();
            this.f9598i = new CopyOnWriteArraySet<>();
            this.f9599j = new CopyOnWriteArraySet<>();
            this.f9600k = new CopyOnWriteArraySet<>();
            this.f9601l = new CopyOnWriteArraySet<>();
            handler = new Handler(bVar.f9614j);
            h2[] h2VarArrA = bVar.f9606b.a(handler, cVar, cVar, cVar, cVar);
            this.f9591b = h2VarArrA;
            this.J = 1.0f;
            this.H = c.f.a.b.j3.x0.f9296a < 21 ? d1(0) : w0.a(applicationContext);
            this.L = Collections.emptyList();
            this.M = true;
            try {
                g1Var = new g1(h2VarArrA, bVar.f9609e, bVar.f9610f, bVar.f9611g, bVar.f9612h, h1Var, bVar.r, bVar.s, bVar.t, bVar.u, bVar.v, bVar.w, bVar.y, bVar.f9607c, bVar.f9614j, this, new a2.b.a().c(20, 21, 22, 23, 24, 25, 26, 27).e());
                n2Var = this;
            } catch (Throwable th) {
                th = th;
                n2Var = this;
            }
        } catch (Throwable th2) {
            th = th2;
            n2Var = this;
        }
        try {
            n2Var.f9594e = g1Var;
            g1Var.i0(cVar);
            g1Var.h0(cVar);
            if (bVar.f9608d > 0) {
                g1Var.q0(bVar.f9608d);
            }
            r0 r0Var = new r0(bVar.f9605a, handler, cVar);
            n2Var.f9603n = r0Var;
            r0Var.b(bVar.f9619o);
            s0 s0Var = new s0(bVar.f9605a, handler, cVar);
            n2Var.f9604o = s0Var;
            s0Var.m(bVar.f9617m ? n2Var.I : null);
            o2 o2Var = new o2(bVar.f9605a, handler, cVar);
            n2Var.p = o2Var;
            o2Var.h(c.f.a.b.j3.x0.e0(n2Var.I.f10158e));
            q2 q2Var = new q2(bVar.f9605a);
            n2Var.q = q2Var;
            q2Var.a(bVar.f9618n != 0);
            r2 r2Var = new r2(bVar.f9605a);
            n2Var.r = r2Var;
            r2Var.a(bVar.f9618n == 2);
            n2Var.R = V0(o2Var);
            n2Var.S = c.f.a.b.k3.e0.f9369a;
            n2Var.o1(1, 102, Integer.valueOf(n2Var.H));
            n2Var.o1(2, 102, Integer.valueOf(n2Var.H));
            n2Var.o1(1, 3, n2Var.I);
            n2Var.o1(2, 4, Integer.valueOf(n2Var.C));
            n2Var.o1(1, 101, Boolean.valueOf(n2Var.K));
            n2Var.o1(2, 6, dVar);
            n2Var.o1(6, 7, dVar);
            lVar.f();
        } catch (Throwable th3) {
            th = th3;
            n2Var.f9592c.f();
            throw th;
        }
    }

    public static c.f.a.b.w2.b V0(o2 o2Var) {
        return new c.f.a.b.w2.b(0, o2Var.d(), o2Var.c());
    }

    public static int Z0(boolean z, int i2) {
        return (!z || i2 == 1) ? 1 : 2;
    }

    @Override // c.f.a.b.a2
    public List<c.f.a.b.f3.c> A() {
        y1();
        return this.L;
    }

    @Override // c.f.a.b.a2
    public int B() {
        y1();
        return this.f9594e.B();
    }

    @Override // c.f.a.b.a2
    public void D(SurfaceView surfaceView) {
        y1();
        U0(surfaceView == null ? null : surfaceView.getHolder());
    }

    @Override // c.f.a.b.a2
    public int E() {
        y1();
        return this.f9594e.E();
    }

    @Override // c.f.a.b.a2
    public c.f.a.b.e3.a1 F() {
        y1();
        return this.f9594e.F();
    }

    @Override // c.f.a.b.a2
    public p2 G() {
        y1();
        return this.f9594e.G();
    }

    @Override // c.f.a.b.a2
    public Looper H() {
        return this.f9594e.H();
    }

    @Override // c.f.a.b.a2
    public boolean I() {
        y1();
        return this.f9594e.I();
    }

    @Override // c.f.a.b.a2
    public long J() {
        y1();
        return this.f9594e.J();
    }

    @Override // c.f.a.b.a2
    public void M(TextureView textureView) {
        y1();
        if (textureView == null) {
            T0();
            return;
        }
        l1();
        this.B = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            c.f.a.b.j3.z.i("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f9595f);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            u1(null);
            e1(0, 0);
        } else {
            t1(surfaceTexture);
            e1(textureView.getWidth(), textureView.getHeight());
        }
    }

    public void M0(c.f.a.b.s2.j1 j1Var) {
        c.f.a.b.j3.g.e(j1Var);
        this.f9602m.n0(j1Var);
    }

    @Override // c.f.a.b.a2
    public c.f.a.b.g3.l N() {
        y1();
        return this.f9594e.N();
    }

    @Deprecated
    public void N0(c.f.a.b.t2.r rVar) {
        c.f.a.b.j3.g.e(rVar);
        this.f9598i.add(rVar);
    }

    @Deprecated
    public void O0(c.f.a.b.w2.c cVar) {
        c.f.a.b.j3.g.e(cVar);
        this.f9601l.add(cVar);
    }

    @Override // c.f.a.b.a2
    public q1 P() {
        return this.f9594e.P();
    }

    @Deprecated
    public void P0(a2.c cVar) {
        c.f.a.b.j3.g.e(cVar);
        this.f9594e.i0(cVar);
    }

    @Override // c.f.a.b.a2
    public long Q() {
        y1();
        return this.f9594e.Q();
    }

    @Deprecated
    public void Q0(c.f.a.b.b3.f fVar) {
        c.f.a.b.j3.g.e(fVar);
        this.f9600k.add(fVar);
    }

    @Deprecated
    public void R0(c.f.a.b.f3.l lVar) {
        c.f.a.b.j3.g.e(lVar);
        this.f9599j.add(lVar);
    }

    @Deprecated
    public void S0(c.f.a.b.k3.b0 b0Var) {
        c.f.a.b.j3.g.e(b0Var);
        this.f9597h.add(b0Var);
    }

    public void T0() {
        y1();
        l1();
        u1(null);
        e1(0, 0);
    }

    public void U0(SurfaceHolder surfaceHolder) {
        y1();
        if (surfaceHolder == null || surfaceHolder != this.y) {
            return;
        }
        T0();
    }

    public boolean W0() {
        y1();
        return this.f9594e.p0();
    }

    public c.f.a.b.v2.d X0() {
        return this.G;
    }

    public k1 Y0() {
        return this.u;
    }

    @Override // c.f.a.b.f1
    public c.f.a.b.g3.o a() {
        y1();
        return this.f9594e.a();
    }

    @Override // c.f.a.b.a2
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public d1 u() {
        y1();
        return this.f9594e.u();
    }

    public c.f.a.b.v2.d b1() {
        return this.F;
    }

    @Override // c.f.a.b.a2
    public z1 c() {
        y1();
        return this.f9594e.c();
    }

    public k1 c1() {
        return this.t;
    }

    @Override // c.f.a.b.a2
    public void d(z1 z1Var) {
        y1();
        this.f9594e.d(z1Var);
    }

    public final int d1(int i2) {
        AudioTrack audioTrack = this.v;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i2) {
            this.v.release();
            this.v = null;
        }
        if (this.v == null) {
            this.v = new AudioTrack(3, 4000, 4, 2, 2, 0, i2);
        }
        return this.v.getAudioSessionId();
    }

    @Override // c.f.a.b.a2
    public boolean e() {
        y1();
        return this.f9594e.e();
    }

    public final void e1(int i2, int i3) {
        if (i2 == this.D && i3 == this.E) {
            return;
        }
        this.D = i2;
        this.E = i3;
        this.f9602m.d0(i2, i3);
        Iterator<c.f.a.b.k3.b0> it = this.f9597h.iterator();
        while (it.hasNext()) {
            it.next().d0(i2, i3);
        }
    }

    @Override // c.f.a.b.a2
    public long f() {
        y1();
        return this.f9594e.f();
    }

    public final void f1() {
        this.f9602m.a(this.K);
        Iterator<c.f.a.b.t2.r> it = this.f9598i.iterator();
        while (it.hasNext()) {
            it.next().a(this.K);
        }
    }

    @Override // c.f.a.b.a2
    public void g(int i2, long j2) {
        y1();
        this.f9602m.E1();
        this.f9594e.g(i2, j2);
    }

    public void g1() {
        AudioTrack audioTrack;
        y1();
        if (c.f.a.b.j3.x0.f9296a < 21 && (audioTrack = this.v) != null) {
            audioTrack.release();
            this.v = null;
        }
        this.f9603n.b(false);
        this.p.g();
        this.q.b(false);
        this.r.b(false);
        this.f9604o.i();
        this.f9594e.g1();
        this.f9602m.F1();
        l1();
        Surface surface = this.x;
        if (surface != null) {
            surface.release();
            this.x = null;
        }
        if (this.P) {
            ((c.f.a.b.j3.k0) c.f.a.b.j3.g.e(this.O)).d(0);
            this.P = false;
        }
        this.L = Collections.emptyList();
        this.Q = true;
    }

    @Override // c.f.a.b.a2
    public long getCurrentPosition() {
        y1();
        return this.f9594e.getCurrentPosition();
    }

    @Override // c.f.a.b.a2
    public long getDuration() {
        y1();
        return this.f9594e.getDuration();
    }

    @Override // c.f.a.b.a2
    public int getPlaybackState() {
        y1();
        return this.f9594e.getPlaybackState();
    }

    @Override // c.f.a.b.a2
    public int getRepeatMode() {
        y1();
        return this.f9594e.getRepeatMode();
    }

    @Override // c.f.a.b.a2
    public float getVolume() {
        return this.J;
    }

    @Override // c.f.a.b.a2
    public a2.b h() {
        y1();
        return this.f9594e.h();
    }

    @Deprecated
    public void h1(c.f.a.b.t2.r rVar) {
        this.f9598i.remove(rVar);
    }

    @Override // c.f.a.b.a2
    public boolean i() {
        y1();
        return this.f9594e.i();
    }

    @Deprecated
    public void i1(c.f.a.b.w2.c cVar) {
        this.f9601l.remove(cVar);
    }

    @Override // c.f.a.b.a2
    public void j(boolean z) {
        y1();
        this.f9594e.j(z);
    }

    @Deprecated
    public void j1(a2.c cVar) {
        this.f9594e.h1(cVar);
    }

    @Override // c.f.a.b.a2
    public int k() {
        y1();
        return this.f9594e.k();
    }

    @Deprecated
    public void k1(c.f.a.b.b3.f fVar) {
        this.f9600k.remove(fVar);
    }

    @Override // c.f.a.b.a2
    public int l() {
        y1();
        return this.f9594e.l();
    }

    public final void l1() {
        if (this.z != null) {
            this.f9594e.n0(this.f9596g).n(Constants.MAXIMUM_UPLOAD_PARTS).m(null).l();
            this.z.i(this.f9595f);
            this.z = null;
        }
        TextureView textureView = this.B;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f9595f) {
                c.f.a.b.j3.z.i("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.B.setSurfaceTextureListener(null);
            }
            this.B = null;
        }
        SurfaceHolder surfaceHolder = this.y;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f9595f);
            this.y = null;
        }
    }

    @Deprecated
    public void m1(c.f.a.b.f3.l lVar) {
        this.f9599j.remove(lVar);
    }

    @Override // c.f.a.b.a2
    public void n(TextureView textureView) {
        y1();
        if (textureView == null || textureView != this.B) {
            return;
        }
        T0();
    }

    @Deprecated
    public void n1(c.f.a.b.k3.b0 b0Var) {
        this.f9597h.remove(b0Var);
    }

    @Override // c.f.a.b.a2
    public c.f.a.b.k3.e0 o() {
        return this.S;
    }

    public final void o1(int i2, int i3, Object obj) {
        for (h2 h2Var : this.f9591b) {
            if (h2Var.getTrackType() == i2) {
                this.f9594e.n0(h2Var).n(i3).m(obj).l();
            }
        }
    }

    @Override // c.f.a.b.a2
    public void p(a2.e eVar) {
        c.f.a.b.j3.g.e(eVar);
        h1(eVar);
        n1(eVar);
        m1(eVar);
        k1(eVar);
        i1(eVar);
        j1(eVar);
    }

    public final void p1() {
        o1(1, 2, Float.valueOf(this.J * this.f9604o.g()));
    }

    @Override // c.f.a.b.a2
    public void prepare() {
        y1();
        boolean zI = i();
        int iP = this.f9604o.p(zI, 2);
        w1(zI, iP, Z0(zI, iP));
        this.f9594e.prepare();
    }

    @Override // c.f.a.b.a2
    public int q() {
        y1();
        return this.f9594e.q();
    }

    public void q1(c.f.a.b.t2.p pVar, boolean z) {
        y1();
        if (this.Q) {
            return;
        }
        if (!c.f.a.b.j3.x0.b(this.I, pVar)) {
            this.I = pVar;
            o1(1, 3, pVar);
            this.p.h(c.f.a.b.j3.x0.e0(pVar.f10158e));
            this.f9602m.J(pVar);
            Iterator<c.f.a.b.t2.r> it = this.f9598i.iterator();
            while (it.hasNext()) {
                it.next().J(pVar);
            }
        }
        s0 s0Var = this.f9604o;
        if (!z) {
            pVar = null;
        }
        s0Var.m(pVar);
        boolean zI = i();
        int iP = this.f9604o.p(zI, getPlaybackState());
        w1(zI, iP, Z0(zI, iP));
    }

    @Override // c.f.a.b.a2
    public void r(SurfaceView surfaceView) {
        y1();
        if (surfaceView instanceof c.f.a.b.k3.x) {
            l1();
            u1(surfaceView);
        } else {
            if (!(surfaceView instanceof c.f.a.b.k3.f0.l)) {
                v1(surfaceView == null ? null : surfaceView.getHolder());
                return;
            }
            l1();
            this.z = (c.f.a.b.k3.f0.l) surfaceView;
            this.f9594e.n0(this.f9596g).n(Constants.MAXIMUM_UPLOAD_PARTS).m(this.z).l();
            this.z.b(this.f9595f);
            u1(this.z.getVideoSurface());
        }
        s1(surfaceView.getHolder());
    }

    public void r1(List<p1> list, boolean z) {
        y1();
        this.f9594e.k1(list, z);
    }

    @Override // c.f.a.b.a2
    public int s() {
        y1();
        return this.f9594e.s();
    }

    public final void s1(SurfaceHolder surfaceHolder) {
        this.A = false;
        this.y = surfaceHolder;
        surfaceHolder.addCallback(this.f9595f);
        Surface surface = this.y.getSurface();
        if (surface == null || !surface.isValid()) {
            e1(0, 0);
        } else {
            Rect surfaceFrame = this.y.getSurfaceFrame();
            e1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // c.f.a.b.a2
    public void setRepeatMode(int i2) {
        y1();
        this.f9594e.setRepeatMode(i2);
    }

    public final void t1(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        u1(surface);
        this.x = surface;
    }

    public final void u1(Object obj) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        h2[] h2VarArr = this.f9591b;
        int length = h2VarArr.length;
        int i2 = 0;
        while (true) {
            z = true;
            if (i2 >= length) {
                break;
            }
            h2 h2Var = h2VarArr[i2];
            if (h2Var.getTrackType() == 2) {
                arrayList.add(this.f9594e.n0(h2Var).n(1).m(obj).l());
            }
            i2++;
        }
        Object obj2 = this.w;
        if (obj2 == null || obj2 == obj) {
            z = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d2) it.next()).a(this.s);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z = false;
            Object obj3 = this.w;
            Surface surface = this.x;
            if (obj3 == surface) {
                surface.release();
                this.x = null;
            }
        }
        this.w = obj;
        if (z) {
            this.f9594e.o1(false, d1.g(new j1(3), 1003));
        }
    }

    @Override // c.f.a.b.a2
    public void v(boolean z) {
        y1();
        int iP = this.f9604o.p(z, getPlaybackState());
        w1(z, iP, Z0(z, iP));
    }

    public void v1(SurfaceHolder surfaceHolder) {
        y1();
        if (surfaceHolder == null) {
            T0();
            return;
        }
        l1();
        this.A = true;
        this.y = surfaceHolder;
        surfaceHolder.addCallback(this.f9595f);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            u1(null);
            e1(0, 0);
        } else {
            u1(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            e1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // c.f.a.b.a2
    public long w() {
        y1();
        return this.f9594e.w();
    }

    public final void w1(boolean z, int i2, int i3) {
        int i4 = 0;
        boolean z2 = z && i2 != -1;
        if (z2 && i2 != 1) {
            i4 = 1;
        }
        this.f9594e.n1(z2, i4, i3);
    }

    @Override // c.f.a.b.a2
    public long x() {
        y1();
        return this.f9594e.x();
    }

    public final void x1() {
        int playbackState = getPlaybackState();
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                this.q.b(i() && !W0());
                this.r.b(i());
                return;
            } else if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        this.q.b(false);
        this.r.b(false);
    }

    @Override // c.f.a.b.a2
    public void y(a2.e eVar) {
        c.f.a.b.j3.g.e(eVar);
        N0(eVar);
        S0(eVar);
        R0(eVar);
        Q0(eVar);
        O0(eVar);
        P0(eVar);
    }

    public final void y1() {
        this.f9592c.c();
        if (Thread.currentThread() != H().getThread()) {
            String strD = c.f.a.b.j3.x0.D("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), H().getThread().getName());
            if (this.M) {
                throw new IllegalStateException(strD);
            }
            c.f.a.b.j3.z.j("SimpleExoPlayer", strD, this.N ? null : new IllegalStateException());
            this.N = true;
        }
    }

    @Override // c.f.a.b.a2
    public void z(int i2, List<p1> list) {
        y1();
        this.f9594e.z(i2, list);
    }
}
