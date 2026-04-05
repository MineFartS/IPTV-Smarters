package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class lx extends iu implements lk {
    private nu A;
    private float B;
    private boolean C;
    private boolean D;
    private boolean E;
    private qb F;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lq[] f22364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final akv f22365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f22366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final jp f22367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final lv f22368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final lw f22369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArraySet<anf> f22370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CopyOnWriteArraySet<nw> f22371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CopyOnWriteArraySet<qc> f22372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final nl f22373k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ip f22374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final it f22375m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final mc f22376n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final mh f22377o;
    private final mi p;
    private final long q;
    private AudioTrack r;
    private Object s;
    private Surface t;
    private SurfaceHolder u;
    private boolean v;
    private int w;
    private int x;
    private int y;
    private int z;

    public lx(lu luVar) throws Throwable {
        lx lxVar;
        int iA;
        akv akvVar = new akv();
        this.f22365c = akvVar;
        try {
            Context applicationContext = luVar.f22347a.getApplicationContext();
            this.f22366d = applicationContext;
            nl nlVar = luVar.f22352f;
            this.f22373k = nlVar;
            this.A = luVar.f22354h;
            this.w = 1;
            this.C = false;
            this.q = 2000L;
            lv lvVar = new lv(this);
            this.f22368f = lvVar;
            lw lwVar = new lw(null);
            this.f22369g = lwVar;
            this.f22370h = new CopyOnWriteArraySet<>();
            this.f22371i = new CopyOnWriteArraySet<>();
            new CopyOnWriteArraySet();
            new CopyOnWriteArraySet();
            this.f22372j = new CopyOnWriteArraySet<>();
            Handler handler = new Handler(luVar.f22353g);
            lq[] lqVarArrA = luVar.f22361o.a(handler, lvVar, lvVar);
            this.f22364b = lqVarArrA;
            this.B = 1.0f;
            if (amn.f20135a < 21) {
                AudioTrack audioTrack = this.r;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.r.release();
                    this.r = null;
                }
                if (this.r == null) {
                    this.r = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                iA = this.r.getAudioSessionId();
            } else {
                iA = iw.a(applicationContext);
            }
            this.z = iA;
            Collections.emptyList();
            this.D = true;
            lf lfVar = new lf();
            lfVar.d(16, 17, 18, 19, 20, 21, 22, 23);
            try {
                jp jpVar = new jp(lqVarArrA, luVar.f22349c, luVar.p, luVar.f22351e, nlVar, true, luVar.f22357k, luVar.q, 500L, luVar.f22348b, luVar.f22353g, this, lfVar.a());
                lxVar = this;
                try {
                    lxVar.f22367e = jpVar;
                    jpVar.p(lvVar);
                    jpVar.o(lvVar);
                    ip ipVar = new ip(luVar.f22347a, handler, lvVar);
                    lxVar.f22374l = ipVar;
                    ipVar.a();
                    it itVar = new it(luVar.f22347a, handler, lvVar);
                    lxVar.f22375m = itVar;
                    itVar.e(null);
                    mc mcVar = new mc(luVar.f22347a, handler, lvVar);
                    lxVar.f22376n = mcVar;
                    int i2 = lxVar.A.f22567c;
                    mcVar.f(3);
                    mh mhVar = new mh(luVar.f22347a);
                    lxVar.f22377o = mhVar;
                    mhVar.a(false);
                    mi miVar = new mi(luVar.f22347a);
                    lxVar.p = miVar;
                    miVar.a(false);
                    lxVar.F = X(mcVar);
                    lxVar.aa(1, 102, Integer.valueOf(lxVar.z));
                    lxVar.aa(2, 102, Integer.valueOf(lxVar.z));
                    lxVar.aa(1, 3, lxVar.A);
                    lxVar.aa(2, 4, Integer.valueOf(lxVar.w));
                    lxVar.aa(1, 101, Boolean.valueOf(lxVar.C));
                    lxVar.aa(2, 6, lwVar);
                    lxVar.aa(6, 7, lwVar);
                    akvVar.d();
                } catch (Throwable th) {
                    th = th;
                    lxVar.f22365c.d();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                lxVar = this;
            }
        } catch (Throwable th3) {
            th = th3;
            lxVar = this;
        }
    }

    public static /* synthetic */ void G(lx lxVar) {
        int iJ = lxVar.j();
        boolean z = false;
        if (iJ != 2 && iJ != 3) {
            lxVar.f22377o.b(false);
            lxVar.p.b(false);
            return;
        }
        lxVar.ad();
        boolean zX = lxVar.f22367e.x();
        mh mhVar = lxVar.f22377o;
        if (lxVar.S() && !zX) {
            z = true;
        }
        mhVar.b(z);
        lxVar.p.b(lxVar.S());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int W(boolean z, int i2) {
        return (!z || i2 == 1) ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static qb X(mc mcVar) {
        return new qb(mcVar.b(), mcVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(int i2, int i3) {
        if (i2 == this.x && i3 == this.y) {
            return;
        }
        this.x = i2;
        this.y = i3;
        this.f22373k.aj(i2, i3);
        Iterator<anf> it = this.f22370h.iterator();
        while (it.hasNext()) {
            it.next().aj(i2, i3);
        }
    }

    private final void Z() {
        SurfaceHolder surfaceHolder = this.u;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f22368f);
            this.u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aa(int i2, int i3, Object obj) {
        lq[] lqVarArr = this.f22364b;
        int length = lqVarArr.length;
        for (int i4 = 0; i4 < 2; i4++) {
            lq lqVar = lqVarArr[i4];
            if (lqVar.b() == i2) {
                ln lnVarM = this.f22367e.m(lqVar);
                lnVarM.n(i3);
                lnVarM.m(obj);
                lnVarM.l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ab(Object obj) {
        ArrayList arrayList = new ArrayList();
        lq[] lqVarArr = this.f22364b;
        int length = lqVarArr.length;
        for (int i2 = 0; i2 < 2; i2++) {
            lq lqVar = lqVarArr[i2];
            if (lqVar.b() == 2) {
                ln lnVarM = this.f22367e.m(lqVar);
                lnVarM.n(1);
                lnVarM.m(obj);
                lnVarM.l();
                arrayList.add(lnVarM);
            }
        }
        Object obj2 = this.s;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ln) it.next()).j(2000L);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.f22367e.F(jb.b(new kb(3)));
            }
            Object obj3 = this.s;
            Surface surface = this.t;
            if (obj3 == surface) {
                surface.release();
                this.t = null;
            }
        }
        this.s = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ac(boolean z, int i2, int i3) {
        boolean z2 = z && i2 != -1;
        this.f22367e.w(z2, (!z2 || i2 == 1) ? 0 : 1, i3);
    }

    private final void ad() {
        this.f22365c.b();
        if (Thread.currentThread() != m().getThread()) {
            String strB = amn.B("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), m().getThread().getName());
            if (this.D) {
                throw new IllegalStateException(strB);
            }
            alj.b("SimpleExoPlayer", strB, this.E ? null : new IllegalStateException());
            this.E = true;
        }
    }

    public static /* synthetic */ void v(lx lxVar) {
        lxVar.f22373k.H(lxVar.C);
        Iterator<nw> it = lxVar.f22371i.iterator();
        while (it.hasNext()) {
            it.next().H(lxVar.C);
        }
    }

    public static /* synthetic */ void y(lx lxVar, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        lxVar.ab(surface);
        lxVar.t = surface;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final void A() {
        ad();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final void B() {
        ad();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final void C(int i2) {
        ad();
        this.f22373k.T();
        this.f22367e.C(i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final void E() {
        ad();
        this.f22375m.b(S(), 1);
        this.f22367e.E();
        Collections.emptyList();
    }

    public final void H(nn nnVar) {
        ajr.b(nnVar);
        this.f22373k.R(nnVar);
    }

    public final void I(anf anfVar) {
        ajr.b(anfVar);
        this.f22370h.add(anfVar);
    }

    @Deprecated
    public final void J(abi abiVar) {
        ad();
        List<abi> listSingletonList = Collections.singletonList(abiVar);
        ad();
        this.f22367e.D(listSingletonList);
        ad();
        boolean zS = S();
        int iB = this.f22375m.b(zS, 2);
        ac(zS, iB, W(zS, iB));
        this.f22367e.u();
    }

    public final void K() {
        AudioTrack audioTrack;
        ad();
        if (amn.f20135a < 21 && (audioTrack = this.r) != null) {
            audioTrack.release();
            this.r = null;
        }
        this.f22374l.a();
        this.f22376n.e();
        this.f22377o.b(false);
        this.p.b(false);
        this.f22375m.d();
        this.f22367e.v();
        this.f22373k.V();
        Z();
        Surface surface = this.t;
        if (surface != null) {
            surface.release();
            this.t = null;
        }
        Collections.emptyList();
    }

    public final void L(nn nnVar) {
        this.f22373k.W(nnVar);
    }

    public final void M(anf anfVar) {
        this.f22370h.remove(anfVar);
    }

    public final void N(boolean z) {
        ad();
        int iB = this.f22375m.b(z, j());
        ac(z, iB, W(z, iB));
    }

    public final void O(SurfaceHolder surfaceHolder) {
        ad();
        if (surfaceHolder == null) {
            ad();
            Z();
            ab(null);
            Y(0, 0);
            return;
        }
        Z();
        this.v = true;
        this.u = surfaceHolder;
        surfaceHolder.addCallback(this.f22368f);
        Surface surface = surfaceHolder.getSurface();
        if (surface == null || !surface.isValid()) {
            ab(null);
            Y(0, 0);
        } else {
            ab(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            Y(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void P(SurfaceView surfaceView) {
        ad();
        O(surfaceView == null ? null : surfaceView.getHolder());
    }

    public final boolean S() {
        ad();
        return this.f22367e.y();
    }

    public final void V() {
        ad();
        Z();
        ab(null);
        Y(0, 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final int c() {
        ad();
        return this.f22367e.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final int d() {
        ad();
        return this.f22367e.d();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final int e() {
        ad();
        return this.f22367e.e();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final int f() {
        ad();
        return this.f22367e.f();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final long h() {
        ad();
        return this.f22367e.h();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final long i() {
        ad();
        return this.f22367e.i();
    }

    public final int j() {
        ad();
        return this.f22367e.g();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final long k() {
        ad();
        return this.f22367e.k();
    }

    public final long l() {
        ad();
        return this.f22367e.j();
    }

    public final Looper m() {
        return this.f22367e.l();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final mg n() {
        ad();
        return this.f22367e.n();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.lk
    public final boolean z() {
        ad();
        return this.f22367e.z();
    }
}
