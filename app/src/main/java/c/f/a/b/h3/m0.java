package c.f.a.b.h3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c.f.a.b.a2;
import c.f.a.b.b2;
import c.f.a.b.c2;
import c.f.a.b.h3.e1;
import c.f.a.b.i1;
import c.f.a.b.p1;
import c.f.a.b.p2;
import c.f.a.b.q1;
import c.f.a.b.x1;
import c.f.a.b.z1;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class m0 extends FrameLayout {
    public final String A;
    public final Drawable B;
    public final Drawable C;
    public final float D;
    public final float E;
    public final String F;
    public final String G;
    public a2 H;
    public c.f.a.b.x0 I;
    public c J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public long W;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList<d> f8710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f8711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f8712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f8713f;
    public long[] f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f8714g;
    public boolean[] g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f8715h;
    public long[] h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f8716i;
    public boolean[] i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f8717j;
    public long j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ImageView f8718k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f8719l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f8720m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextView f8721n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final e1 f8722o;
    public final StringBuilder p;
    public final Formatter q;
    public final p2.b r;
    public final p2.c s;
    public final Runnable t;
    public final Runnable u;
    public final Drawable v;
    public final Drawable w;
    public final Drawable x;
    public final String y;
    public final String z;

    public final class b implements a2.e, e1.a, View.OnClickListener {
        public b() {
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void C(boolean z) {
            c2.u(this, z);
        }

        @Override // c.f.a.b.b3.f
        public /* synthetic */ void D(c.f.a.b.b3.a aVar) {
            c2.k(this, aVar);
        }

        @Override // c.f.a.b.a2.c
        public void E(a2 a2Var, a2.d dVar) {
            if (dVar.b(5, 6)) {
                m0.this.T();
            }
            if (dVar.b(5, 6, 8)) {
                m0.this.U();
            }
            if (dVar.a(9)) {
                m0.this.V();
            }
            if (dVar.a(10)) {
                m0.this.W();
            }
            if (dVar.b(9, 10, 12, 0)) {
                m0.this.S();
            }
            if (dVar.b(12, 0)) {
                m0.this.X();
            }
        }

        @Override // c.f.a.b.w2.c
        public /* synthetic */ void G(int i2, boolean z) {
            c2.e(this, i2, z);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void H(boolean z, int i2) {
            b2.k(this, z, i2);
        }

        @Override // c.f.a.b.t2.r
        public /* synthetic */ void J(c.f.a.b.t2.p pVar) {
            c2.a(this, pVar);
        }

        @Override // c.f.a.b.k3.b0
        public /* synthetic */ void L(int i2, int i3, int i4, float f2) {
            c.f.a.b.k3.a0.a(this, i2, i3, i4, f2);
        }

        @Override // c.f.a.b.k3.b0
        public /* synthetic */ void N() {
            c2.s(this);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void O(p1 p1Var, int i2) {
            c2.i(this, p1Var, i2);
        }

        @Override // c.f.a.b.f3.l
        public /* synthetic */ void Q(List list) {
            c2.c(this, list);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void Z(boolean z, int i2) {
            c2.l(this, z, i2);
        }

        @Override // c.f.a.b.t2.r
        public /* synthetic */ void a(boolean z) {
            c2.v(this, z);
        }

        @Override // c.f.a.b.k3.b0
        public /* synthetic */ void b(c.f.a.b.k3.e0 e0Var) {
            c2.z(this, e0Var);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void b0(c.f.a.b.e3.a1 a1Var, c.f.a.b.g3.l lVar) {
            c2.y(this, a1Var, lVar);
        }

        @Override // c.f.a.b.h3.e1.a
        public void c(e1 e1Var, long j2) {
            if (m0.this.f8721n != null) {
                m0.this.f8721n.setText(c.f.a.b.j3.x0.f0(m0.this.p, m0.this.q, j2));
            }
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void d(z1 z1Var) {
            c2.m(this, z1Var);
        }

        @Override // c.f.a.b.k3.b0
        public /* synthetic */ void d0(int i2, int i3) {
            c2.w(this, i2, i3);
        }

        @Override // c.f.a.b.h3.e1.a
        public void e(e1 e1Var, long j2, boolean z) {
            m0.this.N = false;
            if (z || m0.this.H == null) {
                return;
            }
            m0 m0Var = m0.this;
            m0Var.N(m0Var.H, j2);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void f(a2.f fVar, a2.f fVar2, int i2) {
            c2.r(this, fVar, fVar2, i2);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void g(int i2) {
            c2.o(this, i2);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void h(boolean z) {
            b2.d(this, z);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void h0(x1 x1Var) {
            c2.q(this, x1Var);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void i(int i2) {
            b2.l(this, i2);
        }

        @Override // c.f.a.b.h3.e1.a
        public void j(e1 e1Var, long j2) {
            m0.this.N = true;
            if (m0.this.f8721n != null) {
                m0.this.f8721n.setText(c.f.a.b.j3.x0.f0(m0.this.p, m0.this.q, j2));
            }
        }

        @Override // c.f.a.b.w2.c
        public /* synthetic */ void k0(c.f.a.b.w2.b bVar) {
            c2.d(this, bVar);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void l(List list) {
            b2.q(this, list);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void m0(boolean z) {
            c2.h(this, z);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a2 a2Var = m0.this.H;
            if (a2Var == null) {
                return;
            }
            if (m0.this.f8712e == view) {
                m0.this.I.j(a2Var);
                return;
            }
            if (m0.this.f8711d == view) {
                m0.this.I.i(a2Var);
                return;
            }
            if (m0.this.f8715h == view) {
                if (a2Var.getPlaybackState() != 4) {
                    m0.this.I.c(a2Var);
                    return;
                }
                return;
            }
            if (m0.this.f8716i == view) {
                m0.this.I.e(a2Var);
                return;
            }
            if (m0.this.f8713f == view) {
                m0.this.C(a2Var);
                return;
            }
            if (m0.this.f8714g == view) {
                m0.this.B(a2Var);
            } else if (m0.this.f8717j == view) {
                m0.this.I.b(a2Var, c.f.a.b.j3.l0.a(a2Var.getRepeatMode(), m0.this.Q));
            } else if (m0.this.f8718k == view) {
                m0.this.I.g(a2Var, !a2Var.I());
            }
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void onRepeatModeChanged(int i2) {
            c2.t(this, i2);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void p(boolean z) {
            c2.g(this, z);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void r() {
            b2.o(this);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void s(x1 x1Var) {
            c2.p(this, x1Var);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void t(a2.b bVar) {
            c2.b(this, bVar);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void v(p2 p2Var, int i2) {
            c2.x(this, p2Var, i2);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void x(int i2) {
            c2.n(this, i2);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void z(q1 q1Var) {
            c2.j(this, q1Var);
        }
    }

    public interface c {
        void a(long j2, long j3);
    }

    public interface d {
        void e(int i2);
    }

    static {
        i1.a("goog.exo.ui");
    }

    public m0(Context context, AttributeSet attributeSet, int i2, AttributeSet attributeSet2) {
        super(context, attributeSet, i2);
        int resourceId = u0.f8773b;
        this.O = 5000;
        this.Q = 0;
        this.P = 200;
        this.W = -9223372036854775807L;
        this.R = true;
        this.S = true;
        this.T = true;
        this.U = true;
        this.V = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, y0.w, 0, 0);
            try {
                this.O = typedArrayObtainStyledAttributes.getInt(y0.E, this.O);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(y0.x, resourceId);
                this.Q = E(typedArrayObtainStyledAttributes, this.Q);
                this.R = typedArrayObtainStyledAttributes.getBoolean(y0.C, this.R);
                this.S = typedArrayObtainStyledAttributes.getBoolean(y0.z, this.S);
                this.T = typedArrayObtainStyledAttributes.getBoolean(y0.B, this.T);
                this.U = typedArrayObtainStyledAttributes.getBoolean(y0.A, this.U);
                this.V = typedArrayObtainStyledAttributes.getBoolean(y0.D, this.V);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(y0.F, this.P));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f8710c = new CopyOnWriteArrayList<>();
        this.r = new p2.b();
        this.s = new p2.c();
        StringBuilder sb = new StringBuilder();
        this.p = sb;
        this.q = new Formatter(sb, Locale.getDefault());
        this.f0 = new long[0];
        this.g0 = new boolean[0];
        this.h0 = new long[0];
        this.i0 = new boolean[0];
        b bVar = new b();
        this.f8709b = bVar;
        this.I = new c.f.a.b.y0();
        this.t = new Runnable() { // from class: c.f.a.b.h3.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f8653b.U();
            }
        };
        this.u = new Runnable() { // from class: c.f.a.b.h3.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f8571b.F();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        int i3 = s0.H;
        e1 e1Var = (e1) findViewById(i3);
        View viewFindViewById = findViewById(s0.I);
        e1 e1Var2 = e1Var;
        if (e1Var != null) {
            this.f8722o = e1Var2;
        } else if (viewFindViewById != null) {
            i0 i0Var = new i0(context, null, 0, attributeSet2);
            i0Var.setId(i3);
            i0Var.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(i0Var, iIndexOfChild);
            e1Var2 = i0Var;
            this.f8722o = e1Var2;
        } else {
            this.f8722o = null;
        }
        this.f8720m = (TextView) findViewById(s0.f8765m);
        this.f8721n = (TextView) findViewById(s0.F);
        e1 e1Var3 = this.f8722o;
        if (e1Var3 != null) {
            e1Var3.b(bVar);
        }
        View viewFindViewById2 = findViewById(s0.C);
        this.f8713f = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(bVar);
        }
        View viewFindViewById3 = findViewById(s0.B);
        this.f8714g = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(bVar);
        }
        View viewFindViewById4 = findViewById(s0.G);
        this.f8711d = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(bVar);
        }
        View viewFindViewById5 = findViewById(s0.x);
        this.f8712e = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(bVar);
        }
        View viewFindViewById6 = findViewById(s0.K);
        this.f8716i = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(bVar);
        }
        View viewFindViewById7 = findViewById(s0.q);
        this.f8715h = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(bVar);
        }
        ImageView imageView = (ImageView) findViewById(s0.J);
        this.f8717j = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(bVar);
        }
        ImageView imageView2 = (ImageView) findViewById(s0.N);
        this.f8718k = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(bVar);
        }
        View viewFindViewById8 = findViewById(s0.U);
        this.f8719l = viewFindViewById8;
        setShowVrButton(false);
        R(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.D = resources.getInteger(t0.f8770b) / 100.0f;
        this.E = resources.getInteger(t0.f8769a) / 100.0f;
        this.v = resources.getDrawable(q0.f8736b);
        this.w = resources.getDrawable(q0.f8737c);
        this.x = resources.getDrawable(q0.f8735a);
        this.B = resources.getDrawable(q0.f8739e);
        this.C = resources.getDrawable(q0.f8738d);
        this.y = resources.getString(w0.f8793j);
        this.z = resources.getString(w0.f8794k);
        this.A = resources.getString(w0.f8792i);
        this.F = resources.getString(w0.f8797n);
        this.G = resources.getString(w0.f8796m);
    }

    public static int E(TypedArray typedArray, int i2) {
        return typedArray.getInt(y0.y, i2);
    }

    @SuppressLint({"InlinedApi"})
    public static boolean H(int i2) {
        return i2 == 90 || i2 == 89 || i2 == 85 || i2 == 79 || i2 == 126 || i2 == 127 || i2 == 87 || i2 == 88;
    }

    public static boolean z(p2 p2Var, p2.c cVar) {
        if (p2Var.p() > 100) {
            return false;
        }
        int iP = p2Var.p();
        for (int i2 = 0; i2 < iP; i2++) {
            if (p2Var.n(i2, cVar).r == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    public boolean A(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a2 a2Var = this.H;
        if (a2Var == null || !H(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (a2Var.getPlaybackState() == 4) {
                return true;
            }
            this.I.c(a2Var);
            return true;
        }
        if (keyCode == 89) {
            this.I.e(a2Var);
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            D(a2Var);
            return true;
        }
        if (keyCode == 87) {
            this.I.j(a2Var);
            return true;
        }
        if (keyCode == 88) {
            this.I.i(a2Var);
            return true;
        }
        if (keyCode == 126) {
            C(a2Var);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        B(a2Var);
        return true;
    }

    public final void B(a2 a2Var) {
        this.I.l(a2Var, false);
    }

    public final void C(a2 a2Var) {
        int playbackState = a2Var.getPlaybackState();
        if (playbackState == 1) {
            this.I.h(a2Var);
        } else if (playbackState == 4) {
            M(a2Var, a2Var.s(), -9223372036854775807L);
        }
        this.I.l(a2Var, true);
    }

    public final void D(a2 a2Var) {
        int playbackState = a2Var.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !a2Var.i()) {
            C(a2Var);
        } else {
            B(a2Var);
        }
    }

    public void F() {
        if (I()) {
            setVisibility(8);
            Iterator<d> it = this.f8710c.iterator();
            while (it.hasNext()) {
                it.next().e(getVisibility());
            }
            removeCallbacks(this.t);
            removeCallbacks(this.u);
            this.W = -9223372036854775807L;
        }
    }

    public final void G() {
        removeCallbacks(this.u);
        if (this.O <= 0) {
            this.W = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i2 = this.O;
        this.W = jUptimeMillis + ((long) i2);
        if (this.K) {
            postDelayed(this.u, i2);
        }
    }

    public boolean I() {
        return getVisibility() == 0;
    }

    public void K(d dVar) {
        this.f8710c.remove(dVar);
    }

    public final void L() {
        View view;
        View view2;
        boolean zO = O();
        if (!zO && (view2 = this.f8713f) != null) {
            view2.requestFocus();
        } else {
            if (!zO || (view = this.f8714g) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    public final boolean M(a2 a2Var, int i2, long j2) {
        return this.I.f(a2Var, i2, j2);
    }

    public final void N(a2 a2Var, long j2) {
        int iS;
        p2 p2VarG = a2Var.G();
        if (this.M && !p2VarG.q()) {
            int iP = p2VarG.p();
            iS = 0;
            while (true) {
                long jD = p2VarG.n(iS, this.s).d();
                if (j2 < jD) {
                    break;
                }
                if (iS == iP - 1) {
                    j2 = jD;
                    break;
                } else {
                    j2 -= jD;
                    iS++;
                }
            }
        } else {
            iS = a2Var.s();
        }
        M(a2Var, iS, j2);
        U();
    }

    public final boolean O() {
        a2 a2Var = this.H;
        return (a2Var == null || a2Var.getPlaybackState() == 4 || this.H.getPlaybackState() == 1 || !this.H.i()) ? false : true;
    }

    public void P() {
        if (!I()) {
            setVisibility(0);
            Iterator<d> it = this.f8710c.iterator();
            while (it.hasNext()) {
                it.next().e(getVisibility());
            }
            Q();
            L();
        }
        G();
    }

    public final void Q() {
        T();
        S();
        V();
        W();
        X();
    }

    public final void R(boolean z, boolean z2, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.D : this.E);
        view.setVisibility(z ? 0 : 8);
    }

    public final void S() {
        boolean z;
        boolean zC;
        boolean z2;
        boolean z3;
        if (I() && this.K) {
            a2 a2Var = this.H;
            boolean z4 = false;
            if (a2Var != null) {
                boolean zC2 = a2Var.C(4);
                boolean zC3 = a2Var.C(6);
                z3 = a2Var.C(10) && this.I.d();
                if (a2Var.C(11) && this.I.k()) {
                    z4 = true;
                }
                zC = a2Var.C(8);
                z = z4;
                z4 = zC3;
                z2 = zC2;
            } else {
                z = false;
                zC = false;
                z2 = false;
                z3 = false;
            }
            R(this.T, z4, this.f8711d);
            R(this.R, z3, this.f8716i);
            R(this.S, z, this.f8715h);
            R(this.U, zC, this.f8712e);
            e1 e1Var = this.f8722o;
            if (e1Var != null) {
                e1Var.setEnabled(z2);
            }
        }
    }

    public final void T() {
        boolean z;
        if (I() && this.K) {
            boolean zO = O();
            View view = this.f8713f;
            if (view != null) {
                z = (zO && view.isFocused()) | false;
                this.f8713f.setVisibility(zO ? 8 : 0);
            } else {
                z = false;
            }
            View view2 = this.f8714g;
            if (view2 != null) {
                z |= !zO && view2.isFocused();
                this.f8714g.setVisibility(zO ? 0 : 8);
            }
            if (z) {
                L();
            }
        }
    }

    public final void U() {
        long J;
        if (I() && this.K) {
            a2 a2Var = this.H;
            long jX = 0;
            if (a2Var != null) {
                jX = this.j0 + a2Var.x();
                J = this.j0 + a2Var.J();
            } else {
                J = 0;
            }
            TextView textView = this.f8721n;
            if (textView != null && !this.N) {
                textView.setText(c.f.a.b.j3.x0.f0(this.p, this.q, jX));
            }
            e1 e1Var = this.f8722o;
            if (e1Var != null) {
                e1Var.setPosition(jX);
                this.f8722o.setBufferedPosition(J);
            }
            c cVar = this.J;
            if (cVar != null) {
                cVar.a(jX, J);
            }
            removeCallbacks(this.t);
            int playbackState = a2Var == null ? 1 : a2Var.getPlaybackState();
            if (a2Var == null || !a2Var.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.t, 1000L);
                return;
            }
            e1 e1Var2 = this.f8722o;
            long jMin = Math.min(e1Var2 != null ? e1Var2.getPreferredUpdateDelay() : 1000L, 1000 - (jX % 1000));
            float f2 = a2Var.c().f10622c;
            postDelayed(this.t, c.f.a.b.j3.x0.s(f2 > 0.0f ? (long) (jMin / f2) : 1000L, this.P, 1000L));
        }
    }

    public final void V() {
        ImageView imageView;
        ImageView imageView2;
        String str;
        if (I() && this.K && (imageView = this.f8717j) != null) {
            if (this.Q == 0) {
                R(false, false, imageView);
                return;
            }
            a2 a2Var = this.H;
            if (a2Var == null) {
                R(true, false, imageView);
                this.f8717j.setImageDrawable(this.v);
                this.f8717j.setContentDescription(this.y);
                return;
            }
            R(true, true, imageView);
            int repeatMode = a2Var.getRepeatMode();
            if (repeatMode == 0) {
                this.f8717j.setImageDrawable(this.v);
                imageView2 = this.f8717j;
                str = this.y;
            } else {
                if (repeatMode != 1) {
                    if (repeatMode == 2) {
                        this.f8717j.setImageDrawable(this.x);
                        imageView2 = this.f8717j;
                        str = this.A;
                    }
                    this.f8717j.setVisibility(0);
                }
                this.f8717j.setImageDrawable(this.w);
                imageView2 = this.f8717j;
                str = this.z;
            }
            imageView2.setContentDescription(str);
            this.f8717j.setVisibility(0);
        }
    }

    public final void W() {
        ImageView imageView;
        ImageView imageView2;
        String str;
        if (I() && this.K && (imageView = this.f8718k) != null) {
            a2 a2Var = this.H;
            if (!this.V) {
                R(false, false, imageView);
                return;
            }
            if (a2Var != null) {
                R(true, true, imageView);
                this.f8718k.setImageDrawable(a2Var.I() ? this.B : this.C);
                imageView2 = this.f8718k;
                if (a2Var.I()) {
                    str = this.F;
                }
                imageView2.setContentDescription(str);
            }
            R(true, false, imageView);
            this.f8718k.setImageDrawable(this.C);
            imageView2 = this.f8718k;
            str = this.G;
            imageView2.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X() {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.h3.m0.X():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return A(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.u);
        } else if (motionEvent.getAction() == 1) {
            G();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a2 getPlayer() {
        return this.H;
    }

    public int getRepeatToggleModes() {
        return this.Q;
    }

    public boolean getShowShuffleButton() {
        return this.V;
    }

    public int getShowTimeoutMs() {
        return this.O;
    }

    public boolean getShowVrButton() {
        View view = this.f8719l;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        long j2 = this.W;
        if (j2 != -9223372036854775807L) {
            long jUptimeMillis = j2 - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                F();
            } else {
                postDelayed(this.u, jUptimeMillis);
            }
        } else if (I()) {
            G();
        }
        Q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        removeCallbacks(this.t);
        removeCallbacks(this.u);
    }

    @Deprecated
    public void setControlDispatcher(c.f.a.b.x0 x0Var) {
        if (this.I != x0Var) {
            this.I = x0Var;
            S();
        }
    }

    public void setPlayer(a2 a2Var) {
        boolean z = true;
        c.f.a.b.j3.g.g(Looper.myLooper() == Looper.getMainLooper());
        if (a2Var != null && a2Var.H() != Looper.getMainLooper()) {
            z = false;
        }
        c.f.a.b.j3.g.a(z);
        a2 a2Var2 = this.H;
        if (a2Var2 == a2Var) {
            return;
        }
        if (a2Var2 != null) {
            a2Var2.p(this.f8709b);
        }
        this.H = a2Var;
        if (a2Var != null) {
            a2Var.y(this.f8709b);
        }
        Q();
    }

    public void setProgressUpdateListener(c cVar) {
        this.J = cVar;
    }

    public void setRepeatToggleModes(int i2) {
        int i3;
        c.f.a.b.x0 x0Var;
        a2 a2Var;
        this.Q = i2;
        a2 a2Var2 = this.H;
        if (a2Var2 != null) {
            int repeatMode = a2Var2.getRepeatMode();
            if (i2 != 0 || repeatMode == 0) {
                i3 = 2;
                if (i2 == 1 && repeatMode == 2) {
                    this.I.b(this.H, 1);
                } else if (i2 == 2 && repeatMode == 1) {
                    x0Var = this.I;
                    a2Var = this.H;
                }
            } else {
                x0Var = this.I;
                a2Var = this.H;
                i3 = 0;
            }
            x0Var.b(a2Var, i3);
        }
        V();
    }

    public void setShowFastForwardButton(boolean z) {
        this.S = z;
        S();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.L = z;
        X();
    }

    public void setShowNextButton(boolean z) {
        this.U = z;
        S();
    }

    public void setShowPreviousButton(boolean z) {
        this.T = z;
        S();
    }

    public void setShowRewindButton(boolean z) {
        this.R = z;
        S();
    }

    public void setShowShuffleButton(boolean z) {
        this.V = z;
        W();
    }

    public void setShowTimeoutMs(int i2) {
        this.O = i2;
        if (I()) {
            G();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.f8719l;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i2) {
        this.P = c.f.a.b.j3.x0.r(i2, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f8719l;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            R(getShowVrButton(), onClickListener != null, this.f8719l);
        }
    }

    public void y(d dVar) {
        c.f.a.b.j3.g.e(dVar);
        this.f8710c.add(dVar);
    }
}
