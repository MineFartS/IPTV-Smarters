package com.google.android.exoplayer2.ui;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c.f.a.b.a2;
import c.f.a.b.b2;
import c.f.a.b.c2;
import c.f.a.b.e3.a1;
import c.f.a.b.g3.k;
import c.f.a.b.g3.l;
import c.f.a.b.h3.f0;
import c.f.a.b.h3.m0;
import c.f.a.b.h3.o0;
import c.f.a.b.h3.q0;
import c.f.a.b.h3.s0;
import c.f.a.b.h3.u0;
import c.f.a.b.h3.w0;
import c.f.a.b.h3.y0;
import c.f.a.b.j3.d0;
import c.f.a.b.j3.g;
import c.f.a.b.j3.q;
import c.f.a.b.j3.x0;
import c.f.a.b.k3.a0;
import c.f.a.b.k3.e0;
import c.f.a.b.p1;
import c.f.a.b.p2;
import c.f.a.b.q1;
import c.f.a.b.t2.p;
import c.f.a.b.x1;
import c.f.a.b.z1;
import c.f.b.b.t;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.achartengine.renderer.DefaultRenderer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public class PlayerView extends FrameLayout implements f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f24013b = false;
    public boolean A;
    public boolean A0;
    public int B;
    public ProgressBar B0;
    public TextView C;
    public String D;
    public Activity E;
    public PlayerView F;
    public c G;
    public Boolean H;
    public Boolean I;
    public Boolean J;
    public Boolean K;
    public Boolean L;
    public Boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public LinearLayout T;
    public Handler U;
    public Runnable V;
    public Handler W;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f24014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AspectRatioFrameLayout f24015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f24016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f24017f;
    public Runnable f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f24018g;
    public Animation g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f24019h;
    public Animation h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SubtitleView f24020i;
    public int i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f24021j;
    public LinearLayout j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final TextView f24022k;
    public Animation k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m0 f24023l;
    public Animation l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final FrameLayout f24024m;
    public LinearLayout m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final FrameLayout f24025n;
    public Animation n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a2 f24026o;
    public Animation o0;
    public boolean p;
    public Animation p0;
    public m0.d q;
    public RelativeLayout q0;
    public boolean r;
    public boolean r0;
    public Drawable s;
    public boolean s0;
    public int t;
    public String t0;
    public boolean u;
    public String u0;
    public q<? super x1> v;
    public Handler v0;
    public CharSequence w;
    public Context w0;
    public int x;
    public int x0;
    public boolean y;
    public Handler y0;
    public boolean z;
    public Handler z0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PlayerView.this.w();
        }
    }

    public final class b implements a2.e, View.OnLayoutChangeListener, m0.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p2.b f24028b = new p2.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f24029c;

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
        public /* synthetic */ void E(a2 a2Var, a2.d dVar) {
            c2.f(this, a2Var, dVar);
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
        public /* synthetic */ void J(p pVar) {
            c2.a(this, pVar);
        }

        @Override // c.f.a.b.k3.b0
        public /* synthetic */ void L(int i2, int i3, int i4, float f2) {
            a0.a(this, i2, i3, i4, f2);
        }

        @Override // c.f.a.b.k3.b0
        public void N() {
            if (PlayerView.this.f24016e != null) {
                PlayerView.this.f24016e.setVisibility(4);
            }
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void O(p1 p1Var, int i2) {
            c2.i(this, p1Var, i2);
        }

        @Override // c.f.a.b.f3.l
        public void Q(List<c.f.a.b.f3.c> list) {
            if (PlayerView.this.f24020i != null) {
                PlayerView.this.f24020i.Q(list);
            }
        }

        @Override // c.f.a.b.a2.c
        public void Z(boolean z, int i2) {
            PlayerView.this.L();
            PlayerView.this.N();
        }

        @Override // c.f.a.b.t2.r
        public /* synthetic */ void a(boolean z) {
            c2.v(this, z);
        }

        @Override // c.f.a.b.k3.b0
        public void b(e0 e0Var) {
            PlayerView.this.K();
        }

        @Override // c.f.a.b.a2.c
        public void b0(a1 a1Var, l lVar) {
            a2 a2Var = (a2) g.e(PlayerView.this.f24026o);
            p2 p2VarG = a2Var.G();
            if (p2VarG.q()) {
                this.f24029c = null;
            } else if (a2Var.F().d()) {
                Object obj = this.f24029c;
                if (obj != null) {
                    int iB = p2VarG.b(obj);
                    if (iB != -1) {
                        if (a2Var.s() == p2VarG.f(iB, this.f24028b).f9704d) {
                            return;
                        }
                    }
                    this.f24029c = null;
                }
            } else {
                this.f24029c = p2VarG.g(a2Var.l(), this.f24028b, true).f9703c;
            }
            PlayerView.this.P(false);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void d(z1 z1Var) {
            c2.m(this, z1Var);
        }

        @Override // c.f.a.b.k3.b0
        public /* synthetic */ void d0(int i2, int i3) {
            c2.w(this, i2, i3);
        }

        @Override // c.f.a.b.h3.m0.d
        public void e(int i2) {
            PlayerView.this.M();
        }

        @Override // c.f.a.b.a2.c
        public void f(a2.f fVar, a2.f fVar2, int i2) {
            if (PlayerView.this.y() && PlayerView.this.z) {
                PlayerView.this.v();
            }
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

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            PlayerView.n((TextureView) view, PlayerView.this.B);
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
        public void x(int i2) {
            PlayerView.this.L();
            PlayerView.this.O();
            PlayerView.this.N();
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void z(q1 q1Var) {
            c2.j(this, q1Var);
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f24031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f24032b;

        public c(Activity activity) {
            this.f24031a = activity;
        }

        public c a(int i2) {
            this.f24032b = this.f24031a.findViewById(i2);
            return this;
        }

        public c b(CharSequence charSequence) {
            View view = this.f24032b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerView(Context context, AttributeSet attributeSet, int i2) {
        b bVar;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        boolean z4;
        boolean z5;
        int i8;
        boolean z6;
        int i9;
        boolean z7;
        super(context, attributeSet, i2);
        this.D = "visible";
        Boolean bool = Boolean.FALSE;
        this.H = bool;
        this.I = bool;
        this.J = bool;
        this.K = bool;
        this.L = bool;
        this.M = bool;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.i0 = 0;
        this.s0 = false;
        this.x0 = 0;
        b bVar2 = new b();
        this.f24014c = bVar2;
        if (isInEditMode()) {
            this.f24015d = null;
            this.f24016e = null;
            this.f24017f = null;
            this.f24018g = false;
            this.f24019h = null;
            this.f24020i = null;
            this.f24021j = null;
            this.f24022k = null;
            this.f24023l = null;
            this.f24024m = null;
            this.f24025n = null;
            ImageView imageView = new ImageView(context);
            if (x0.f9296a >= 23) {
                r(getResources(), imageView);
            } else {
                q(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i10 = u0.f8774c;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, y0.G, 0, 0);
            try {
                int i11 = y0.Q;
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i11);
                int color = typedArrayObtainStyledAttributes.getColor(i11, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(y0.M, i10);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(y0.S, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(y0.I, 0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(y0.T, true);
                int i12 = typedArrayObtainStyledAttributes.getInt(y0.R, 1);
                int i13 = typedArrayObtainStyledAttributes.getInt(y0.N, 0);
                int i14 = typedArrayObtainStyledAttributes.getInt(y0.P, 5000);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(y0.K, true);
                z3 = typedArrayObtainStyledAttributes.getBoolean(y0.H, false);
                int integer = typedArrayObtainStyledAttributes.getInteger(y0.O, 0);
                this.u = typedArrayObtainStyledAttributes.getBoolean(y0.L, this.u);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(y0.J, true);
                typedArrayObtainStyledAttributes.recycle();
                i5 = i13;
                z = z10;
                i3 = resourceId;
                bVar = bVar2;
                i9 = i14;
                z2 = z11;
                i4 = integer;
                i7 = color;
                i6 = i12;
                z6 = z9;
                i8 = resourceId2;
                z5 = z8;
                z4 = zHasValue;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            bVar = bVar2;
            i3 = i10;
            i4 = 0;
            z = true;
            z2 = true;
            z3 = false;
            i5 = 0;
            i6 = 1;
            i7 = 0;
            z4 = false;
            z5 = true;
            i8 = 0;
            z6 = true;
            i9 = 5000;
        }
        LayoutInflater.from(context).inflate(i3, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(s0.f8761i);
        this.f24015d = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            F(aspectRatioFrameLayout, i5);
        }
        View viewFindViewById = findViewById(s0.O);
        this.f24016e = viewFindViewById;
        if (viewFindViewById != null && z4) {
            viewFindViewById.setBackgroundColor(i7);
        }
        if (aspectRatioFrameLayout == null || i6 == 0) {
            this.f24017f = null;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i6 == 2) {
                this.f24017f = new TextureView(context);
            } else if (i6 == 3) {
                try {
                    this.f24017f = (View) Class.forName("c.f.a.b.k3.f0.l").getConstructor(Context.class).newInstance(context);
                    z7 = true;
                    this.f24017f.setLayoutParams(layoutParams);
                    this.f24017f.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f24017f, 0);
                } catch (Exception e2) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            } else if (i6 != 4) {
                this.f24017f = new SurfaceView(context);
            } else {
                try {
                    this.f24017f = (View) Class.forName("c.f.a.b.k3.v").getConstructor(Context.class).newInstance(context);
                } catch (Exception e3) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e3);
                }
            }
            z7 = false;
            this.f24017f.setLayoutParams(layoutParams);
            this.f24017f.setClickable(false);
            aspectRatioFrameLayout.addView(this.f24017f, 0);
        }
        this.f24018g = z7;
        this.f24024m = (FrameLayout) findViewById(s0.f8753a);
        this.f24025n = (FrameLayout) findViewById(s0.A);
        ImageView imageView2 = (ImageView) findViewById(s0.f8754b);
        this.f24019h = imageView2;
        this.r = z5 && imageView2 != null;
        if (i8 != 0) {
            this.s = a.i.i.b.f(getContext(), i8);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(s0.R);
        this.f24020i = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.e();
        }
        View viewFindViewById2 = findViewById(s0.f8758f);
        this.f24021j = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.t = i4;
        TextView textView = (TextView) findViewById(s0.f8766n);
        this.f24022k = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i15 = s0.f8762j;
        m0 m0Var = (m0) findViewById(i15);
        View viewFindViewById3 = findViewById(s0.f8763k);
        if (m0Var != null) {
            this.f24023l = m0Var;
        } else if (viewFindViewById3 != null) {
            m0 m0Var2 = new m0(context, null, 0, attributeSet);
            this.f24023l = m0Var2;
            m0Var2.setId(i15);
            m0Var2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(m0Var2, iIndexOfChild);
        } else {
            this.f24023l = null;
        }
        m0 m0Var3 = this.f24023l;
        this.x = m0Var3 != null ? i9 : 0;
        this.A = z;
        this.y = z3;
        this.z = z2;
        this.p = z6 && m0Var3 != null;
        v();
        M();
        m0 m0Var4 = this.f24023l;
        if (m0Var4 != null) {
            m0Var4.y(bVar);
        }
        v();
    }

    public static void F(AspectRatioFrameLayout aspectRatioFrameLayout, int i2) {
        aspectRatioFrameLayout.setResizeMode(i2);
    }

    public static void n(TextureView textureView, int i2) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i2 != 0) {
            float f2 = width / 2.0f;
            float f3 = height / 2.0f;
            matrix.postRotate(i2, f2, f3);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f2, f3);
        }
        textureView.setTransform(matrix);
    }

    public static void q(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(q0.f8740f));
        imageView.setBackgroundColor(resources.getColor(o0.f8728a));
    }

    public static void r(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(q0.f8740f, null));
        imageView.setBackgroundColor(resources.getColor(o0.f8728a, null));
    }

    public void A(AspectRatioFrameLayout aspectRatioFrameLayout, float f2) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f2);
        }
    }

    public void B() {
        Handler handler = this.y0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void C(Activity activity, PlayerView playerView, LinearLayout linearLayout, Animation animation, Animation animation2, LinearLayout linearLayout2, Animation animation3, Animation animation4, LinearLayout linearLayout3, Animation animation5, Animation animation6, RelativeLayout relativeLayout, Animation animation7, ProgressBar progressBar) {
        this.E = activity;
        this.F = playerView;
        this.y0 = new Handler();
        this.z0 = new Handler();
        this.T = linearLayout;
        this.U = new Handler();
        this.W = new Handler();
        this.g0 = animation;
        this.h0 = animation2;
        this.j0 = linearLayout2;
        this.k0 = animation3;
        this.l0 = animation4;
        this.m0 = linearLayout3;
        this.n0 = animation5;
        this.o0 = animation6;
        this.q0 = relativeLayout;
        this.p0 = animation7;
        this.B0 = progressBar;
        this.G = new c(activity);
    }

    @RequiresNonNull({"artworkView"})
    public final boolean D(q1 q1Var) {
        byte[] bArr = q1Var.f9741m;
        if (bArr == null) {
            return false;
        }
        return E(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    @RequiresNonNull({"artworkView"})
    public final boolean E(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                A(this.f24015d, intrinsicWidth / intrinsicHeight);
                this.f24019h.setImageDrawable(drawable);
                this.f24019h.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean G() {
        a2 a2Var = this.f24026o;
        if (a2Var == null) {
            return true;
        }
        int playbackState = a2Var.getPlaybackState();
        return this.y && (playbackState == 1 || playbackState == 4 || !this.f24026o.i());
    }

    public void H() {
        I(G());
    }

    public final void I(boolean z) {
        if (R()) {
            this.f24023l.setShowTimeoutMs(z ? 0 : this.x);
            this.f24023l.P();
        }
    }

    public void J() {
        if (this.T.getVisibility() == 8) {
            this.m0.startAnimation(this.n0);
            this.m0.setVisibility(0);
        }
    }

    public final void K() {
        a2 a2Var = this.f24026o;
        e0 e0VarO = a2Var != null ? a2Var.o() : e0.f9369a;
        int i2 = e0VarO.f9371c;
        int i3 = e0VarO.f9372d;
        int i4 = e0VarO.f9373e;
        float f2 = (i3 == 0 || i2 == 0) ? 0.0f : (i2 * e0VarO.f9374f) / i3;
        View view = this.f24017f;
        if (view instanceof TextureView) {
            if (f2 > 0.0f && (i4 == 90 || i4 == 270)) {
                f2 = 1.0f / f2;
            }
            if (this.B != 0) {
                view.removeOnLayoutChangeListener(this.f24014c);
            }
            this.B = i4;
            if (i4 != 0) {
                this.f24017f.addOnLayoutChangeListener(this.f24014c);
            }
            n((TextureView) this.f24017f, this.B);
        }
        A(this.f24015d, this.f24018g ? 0.0f : f2);
    }

    public final void L() {
        int i2;
        if (this.f24021j != null) {
            a2 a2Var = this.f24026o;
            boolean z = true;
            if (a2Var == null || a2Var.getPlaybackState() != 2 || ((i2 = this.t) != 2 && (i2 != 1 || !this.f24026o.i()))) {
                z = false;
            }
            this.f24021j.setVisibility(z ? 0 : 8);
        }
    }

    public final void M() {
        m0 m0Var = this.f24023l;
        String string = null;
        if (m0Var != null && this.p) {
            if (m0Var.getVisibility() != 0) {
                setContentDescription(getResources().getString(w0.f8795l));
                return;
            } else if (this.A) {
                string = getResources().getString(w0.f8788e);
            }
        }
        setContentDescription(string);
    }

    public final void N() {
        if (y() && this.z) {
            v();
        } else {
            z(false);
        }
    }

    public final void O() {
        q<? super x1> qVar;
        TextView textView = this.f24022k;
        if (textView != null) {
            CharSequence charSequence = this.w;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f24022k.setVisibility(0);
                return;
            }
            a2 a2Var = this.f24026o;
            x1 x1VarU = a2Var != null ? a2Var.u() : null;
            if (x1VarU == null || (qVar = this.v) == null) {
                this.f24022k.setVisibility(8);
            } else {
                this.f24022k.setText((CharSequence) qVar.a(x1VarU).second);
                this.f24022k.setVisibility(0);
            }
        }
    }

    public final void P(boolean z) {
        a2 a2Var = this.f24026o;
        if (a2Var == null || a2Var.F().d()) {
            if (this.u) {
                return;
            }
            u();
            p();
            return;
        }
        if (z && !this.u) {
            p();
        }
        l lVarN = a2Var.N();
        for (int i2 = 0; i2 < lVarN.f8488a; i2++) {
            k kVarA = lVarN.a(i2);
            if (kVarA != null) {
                for (int i3 = 0; i3 < kVarA.length(); i3++) {
                    if (d0.l(kVarA.g(i3).f9338m) == 2) {
                        u();
                        return;
                    }
                }
            }
        }
        p();
        if (Q() && (D(a2Var.P()) || E(this.s))) {
            return;
        }
        u();
    }

    @EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    public final boolean Q() {
        if (!this.r) {
            return false;
        }
        g.i(this.f24019h);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    public final boolean R() {
        if (!this.p) {
            return false;
        }
        g.i(this.f24023l);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        a2 a2Var = this.f24026o;
        if (a2Var != null && a2Var.e()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zX = x(keyEvent.getKeyCode());
        if ((zX && R() && !this.f24023l.I()) || s(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            z(true);
            return true;
        }
        if (!zX || !R()) {
            return false;
        }
        z(true);
        return false;
    }

    @Override // c.f.a.b.h3.f0
    public List<c.f.a.b.h3.e0> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f24025n;
        if (frameLayout != null) {
            arrayList.add(new c.f.a.b.h3.e0(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        m0 m0Var = this.f24023l;
        if (m0Var != null) {
            arrayList.add(new c.f.a.b.h3.e0(m0Var, 0));
        }
        return t.D(arrayList);
    }

    @Override // c.f.a.b.h3.f0
    public ViewGroup getAdViewGroup() {
        return (ViewGroup) g.j(this.f24024m, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.y;
    }

    public boolean getControllerHideOnTouch() {
        return this.A;
    }

    public int getControllerShowTimeoutMs() {
        return this.x;
    }

    public int getCurrentWindowIndex() {
        return this.x0;
    }

    public Drawable getDefaultArtwork() {
        return this.s;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.A0);
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f24025n;
    }

    public a2 getPlayer() {
        return this.f24026o;
    }

    public int getResizeMode() {
        g.i(this.f24015d);
        return this.f24015d.getResizeMode();
    }

    public String getShowOrHideSubtitles() {
        return this.D;
    }

    public SubtitleView getSubtitleView() {
        return this.f24020i;
    }

    public boolean getUseArtwork() {
        return this.r;
    }

    public boolean getUseController() {
        return this.p;
    }

    public View getVideoSurfaceView() {
        return this.f24017f;
    }

    public void o(int i2) {
        a aVar = new a();
        this.f0 = aVar;
        this.W.postDelayed(aVar, i2);
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!R() || this.f24026o == null) {
            return false;
        }
        z(true);
        return true;
    }

    public final void p() {
        View view = this.f24016e;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public boolean s(KeyEvent keyEvent) {
        return R() && this.f24023l.A(keyEvent);
    }

    public void setAdjustViewBounds(boolean z) {
        if (this.r0 == z) {
            return;
        }
        this.r0 = z;
        if (z) {
            setBackground(null);
        } else {
            setBackgroundColor(DefaultRenderer.BACKGROUND_COLOR);
        }
        requestLayout();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        g.i(this.f24015d);
        this.f24015d.setAspectRatioListener(bVar);
    }

    public void setContext(Context context) {
        this.w0 = context;
    }

    @Deprecated
    public void setControlDispatcher(c.f.a.b.x0 x0Var) {
        g.i(this.f24023l);
        this.f24023l.setControlDispatcher(x0Var);
    }

    public void setControllerAutoShow(boolean z) {
        this.y = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.z = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        g.i(this.f24023l);
        this.A = z;
        M();
    }

    public void setControllerShowTimeoutMs(int i2) {
        g.i(this.f24023l);
        this.x = i2;
        if (this.f24023l.I()) {
            H();
        }
    }

    public void setControllerVisibilityListener(m0.d dVar) {
        g.i(this.f24023l);
        m0.d dVar2 = this.q;
        if (dVar2 == dVar) {
            return;
        }
        if (dVar2 != null) {
            this.f24023l.K(dVar2);
        }
        this.q = dVar;
        if (dVar != null) {
            this.f24023l.y(dVar);
        }
    }

    public void setCurrentChannelLogo(String str) {
        this.u0 = str;
    }

    public void setCurrentEpgChannelID(String str) {
        this.t0 = str;
    }

    public void setCurrentWindowIndex(int i2) {
        this.x0 = i2;
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        g.g(this.f24022k != null);
        this.w = charSequence;
        O();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.s != drawable) {
            this.s = drawable;
            P(false);
        }
    }

    public void setEPGHandler(Handler handler) {
        this.v0 = handler;
    }

    public void setErrorMessageProvider(q<? super x1> qVar) {
        if (this.v != qVar) {
            this.v = qVar;
            O();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.u != z) {
            this.u = z;
            P(false);
        }
    }

    public void setPlayer(a2 a2Var) {
        g.g(Looper.myLooper() == Looper.getMainLooper());
        g.a(a2Var == null || a2Var.H() == Looper.getMainLooper());
        a2 a2Var2 = this.f24026o;
        if (a2Var2 == a2Var) {
            return;
        }
        if (a2Var2 != null) {
            a2Var2.p(this.f24014c);
            if (a2Var2.C(26)) {
                View view = this.f24017f;
                if (view instanceof TextureView) {
                    a2Var2.n((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    a2Var2.D((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f24020i;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f24026o = a2Var;
        if (R()) {
            this.f24023l.setPlayer(a2Var);
        }
        L();
        O();
        P(true);
        if (a2Var == null) {
            v();
            return;
        }
        if (a2Var.C(26)) {
            View view2 = this.f24017f;
            if (view2 instanceof TextureView) {
                a2Var.M((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                a2Var.r((SurfaceView) view2);
            }
            K();
        }
        if (this.f24020i != null && a2Var.C(27)) {
            this.f24020i.setCues(a2Var.A());
        }
        a2Var.y(this.f24014c);
        z(false);
    }

    public void setRepeatToggleModes(int i2) {
        g.i(this.f24023l);
        this.f24023l.setRepeatToggleModes(i2);
    }

    public void setResizeMode(int i2) {
        g.i(this.f24015d);
        this.f24015d.setResizeMode(i2);
    }

    public void setShowBuffering(int i2) {
        if (this.t != i2) {
            this.t = i2;
            L();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        g.i(this.f24023l);
        this.f24023l.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        g.i(this.f24023l);
        this.f24023l.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        g.i(this.f24023l);
        this.f24023l.setShowNextButton(z);
    }

    public void setShowOrHideSubtitles(String str) {
        this.D = str;
    }

    public void setShowPreviousButton(boolean z) {
        g.i(this.f24023l);
        this.f24023l.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        g.i(this.f24023l);
        this.f24023l.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        g.i(this.f24023l);
        this.f24023l.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i2) {
        View view = this.f24016e;
        if (view != null) {
            view.setBackgroundColor(i2);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.G.a(s0.V).b(charSequence);
    }

    public void setUseArtwork(boolean z) {
        g.g((z && this.f24019h == null) ? false : true);
        if (this.r != z) {
            this.r = z;
            P(false);
        }
    }

    public void setUseController(boolean z) {
        m0 m0Var;
        a2 a2Var;
        g.g((z && this.f24023l == null) ? false : true);
        if (this.p == z) {
            return;
        }
        this.p = z;
        if (!R()) {
            m0 m0Var2 = this.f24023l;
            if (m0Var2 != null) {
                m0Var2.F();
                m0Var = this.f24023l;
                a2Var = null;
            }
            M();
        }
        m0Var = this.f24023l;
        a2Var = this.f24026o;
        m0Var.setPlayer(a2Var);
        M();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f24017f;
        if (view instanceof SurfaceView) {
            view.setVisibility(i2);
        }
    }

    public void t(Boolean bool) {
        this.A0 = bool.booleanValue();
    }

    public final void u() {
        ImageView imageView = this.f24019h;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f24019h.setVisibility(4);
        }
    }

    public void v() {
        m0 m0Var = this.f24023l;
        if (m0Var != null) {
            m0Var.F();
        }
    }

    public void w() {
        if (this.m0.getVisibility() == 0) {
            this.m0.startAnimation(this.o0);
            this.m0.setVisibility(8);
        }
    }

    @SuppressLint({"InlinedApi"})
    public final boolean x(int i2) {
        return i2 == 19 || i2 == 270 || i2 == 22 || i2 == 271 || i2 == 20 || i2 == 269 || i2 == 21 || i2 == 268 || i2 == 23;
    }

    public final boolean y() {
        a2 a2Var = this.f24026o;
        return a2Var != null && a2Var.e() && this.f24026o.i();
    }

    public final void z(boolean z) {
        if (!(y() && this.z) && R()) {
            boolean z2 = this.f24023l.I() && this.f24023l.getShowTimeoutMs() <= 0;
            boolean zG = G();
            if (z || z2 || zG) {
                I(zG);
            }
        }
    }
}
