package com.google.android.exoplayer2.ui;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c.f.a.b.a2;
import c.f.a.b.b2;
import c.f.a.b.c2;
import c.f.a.b.f3.c;
import c.f.a.b.g3.k;
import c.f.a.b.g3.l;
import c.f.a.b.h3.a1;
import c.f.a.b.h3.f0;
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
import c.f.a.b.w2.b;
import c.f.a.b.x1;
import c.f.a.b.z1;
import c.f.b.b.t;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public class StyledPlayerView extends FrameLayout implements f0 {
    public int A;
    public boolean B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f24034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AspectRatioFrameLayout f24035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f24036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f24037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f24038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f24039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SubtitleView f24040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f24041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f24042j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a1 f24043k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final FrameLayout f24044l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final FrameLayout f24045m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a2 f24046n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24047o;
    public a1.m p;
    public boolean q;
    public Drawable r;
    public int s;
    public boolean t;
    public q<? super x1> u;
    public CharSequence v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;

    public final class a implements a2.e, View.OnLayoutChangeListener, View.OnClickListener, a1.m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p2.b f24048b = new p2.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f24049c;

        public a() {
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
            if (StyledPlayerView.this.f24036d != null) {
                StyledPlayerView.this.f24036d.setVisibility(4);
            }
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void O(p1 p1Var, int i2) {
            c2.i(this, p1Var, i2);
        }

        @Override // c.f.a.b.f3.l
        public void Q(List<c> list) {
            if (StyledPlayerView.this.f24040h != null) {
                StyledPlayerView.this.f24040h.Q(list);
            }
        }

        @Override // c.f.a.b.a2.c
        public void Z(boolean z, int i2) {
            StyledPlayerView.this.J();
            StyledPlayerView.this.L();
        }

        @Override // c.f.a.b.t2.r
        public /* synthetic */ void a(boolean z) {
            c2.v(this, z);
        }

        @Override // c.f.a.b.k3.b0
        public void b(e0 e0Var) {
            StyledPlayerView.this.I();
        }

        @Override // c.f.a.b.a2.c
        public void b0(c.f.a.b.e3.a1 a1Var, l lVar) {
            a2 a2Var = (a2) g.e(StyledPlayerView.this.f24046n);
            p2 p2VarG = a2Var.G();
            if (p2VarG.q()) {
                this.f24049c = null;
            } else if (a2Var.F().d()) {
                Object obj = this.f24049c;
                if (obj != null) {
                    int iB = p2VarG.b(obj);
                    if (iB != -1) {
                        if (a2Var.s() == p2VarG.f(iB, this.f24048b).f9704d) {
                            return;
                        }
                    }
                    this.f24049c = null;
                }
            } else {
                this.f24049c = p2VarG.g(a2Var.l(), this.f24048b, true).f9703c;
            }
            StyledPlayerView.this.N(false);
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void d(z1 z1Var) {
            c2.m(this, z1Var);
        }

        @Override // c.f.a.b.k3.b0
        public /* synthetic */ void d0(int i2, int i3) {
            c2.w(this, i2, i3);
        }

        @Override // c.f.a.b.h3.a1.m
        public void e(int i2) {
            StyledPlayerView.this.K();
        }

        @Override // c.f.a.b.a2.c
        public void f(a2.f fVar, a2.f fVar2, int i2) {
            if (StyledPlayerView.this.w() && StyledPlayerView.this.y) {
                StyledPlayerView.this.u();
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
        public /* synthetic */ void k0(b bVar) {
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
            StyledPlayerView.this.H();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            StyledPlayerView.o((TextureView) view, StyledPlayerView.this.A);
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
            StyledPlayerView.this.J();
            StyledPlayerView.this.M();
            StyledPlayerView.this.L();
        }

        @Override // c.f.a.b.a2.c
        public /* synthetic */ void z(q1 q1Var) {
            c2.j(this, q1Var);
        }
    }

    public StyledPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StyledPlayerView(Context context, AttributeSet attributeSet, int i2) {
        boolean z;
        int i3;
        boolean z2;
        int integer;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        boolean z5;
        int i6;
        int i7;
        boolean z6;
        boolean z7;
        boolean z8;
        super(context, attributeSet, i2);
        a aVar = new a();
        this.f24034b = aVar;
        if (isInEditMode()) {
            this.f24035c = null;
            this.f24036d = null;
            this.f24037e = null;
            this.f24038f = false;
            this.f24039g = null;
            this.f24040h = null;
            this.f24041i = null;
            this.f24042j = null;
            this.f24043k = null;
            this.f24044l = null;
            this.f24045m = null;
            ImageView imageView = new ImageView(context);
            if (x0.f9296a >= 23) {
                r(getResources(), imageView);
            } else {
                q(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i8 = u0.f8776e;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, y0.i0, 0, 0);
            try {
                int i9 = y0.s0;
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i9);
                int color = typedArrayObtainStyledAttributes.getColor(i9, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(y0.o0, i8);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(y0.u0, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(y0.k0, 0);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(y0.v0, true);
                int i10 = typedArrayObtainStyledAttributes.getInt(y0.t0, 1);
                int i11 = typedArrayObtainStyledAttributes.getInt(y0.p0, 0);
                int i12 = typedArrayObtainStyledAttributes.getInt(y0.r0, 5000);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(y0.m0, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(y0.j0, true);
                integer = typedArrayObtainStyledAttributes.getInteger(y0.q0, 0);
                this.t = typedArrayObtainStyledAttributes.getBoolean(y0.n0, this.t);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(y0.l0, true);
                typedArrayObtainStyledAttributes.recycle();
                z3 = z11;
                z = z12;
                i3 = i11;
                z6 = z10;
                i6 = resourceId2;
                z5 = z9;
                z4 = zHasValue;
                i5 = color;
                i4 = i10;
                z2 = z13;
                i8 = resourceId;
                i7 = i12;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z = true;
            i3 = 0;
            z2 = true;
            integer = 0;
            z3 = true;
            i4 = 1;
            i5 = 0;
            z4 = false;
            z5 = true;
            i6 = 0;
            i7 = 5000;
            z6 = true;
        }
        LayoutInflater.from(context).inflate(i8, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(s0.f8761i);
        this.f24035c = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            D(aspectRatioFrameLayout, i3);
        }
        View viewFindViewById = findViewById(s0.O);
        this.f24036d = viewFindViewById;
        if (viewFindViewById != null && z4) {
            viewFindViewById.setBackgroundColor(i5);
        }
        if (aspectRatioFrameLayout == null || i4 == 0) {
            this.f24037e = null;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i4 == 2) {
                this.f24037e = new TextureView(context);
            } else if (i4 == 3) {
                try {
                    this.f24037e = (View) Class.forName("c.f.a.b.k3.f0.l").getConstructor(Context.class).newInstance(context);
                    z8 = true;
                    this.f24037e.setLayoutParams(layoutParams);
                    this.f24037e.setOnClickListener(aVar);
                    this.f24037e.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f24037e, 0);
                    z7 = z8;
                } catch (Exception e2) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            } else if (i4 != 4) {
                this.f24037e = new SurfaceView(context);
            } else {
                try {
                    this.f24037e = (View) Class.forName("c.f.a.b.k3.v").getConstructor(Context.class).newInstance(context);
                } catch (Exception e3) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e3);
                }
            }
            z8 = false;
            this.f24037e.setLayoutParams(layoutParams);
            this.f24037e.setOnClickListener(aVar);
            this.f24037e.setClickable(false);
            aspectRatioFrameLayout.addView(this.f24037e, 0);
            z7 = z8;
        }
        this.f24038f = z7;
        this.f24044l = (FrameLayout) findViewById(s0.f8753a);
        this.f24045m = (FrameLayout) findViewById(s0.A);
        ImageView imageView2 = (ImageView) findViewById(s0.f8754b);
        this.f24039g = imageView2;
        this.q = z5 && imageView2 != null;
        if (i6 != 0) {
            this.r = a.i.i.b.f(getContext(), i6);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(s0.R);
        this.f24040h = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.e();
        }
        View viewFindViewById2 = findViewById(s0.f8758f);
        this.f24041i = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.s = integer;
        TextView textView = (TextView) findViewById(s0.f8766n);
        this.f24042j = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i13 = s0.f8762j;
        a1 a1Var = (a1) findViewById(i13);
        View viewFindViewById3 = findViewById(s0.f8763k);
        if (a1Var != null) {
            this.f24043k = a1Var;
        } else if (viewFindViewById3 != null) {
            a1 a1Var2 = new a1(context, null, 0, attributeSet);
            this.f24043k = a1Var2;
            a1Var2.setId(i13);
            a1Var2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(a1Var2, iIndexOfChild);
        } else {
            this.f24043k = null;
        }
        a1 a1Var3 = this.f24043k;
        this.w = a1Var3 != null ? i7 : 0;
        this.z = z3;
        this.x = z;
        this.y = z2;
        this.f24047o = z6 && a1Var3 != null;
        if (a1Var3 != null) {
            a1Var3.b0();
            this.f24043k.R(aVar);
        }
        K();
    }

    public static void D(AspectRatioFrameLayout aspectRatioFrameLayout, int i2) {
        aspectRatioFrameLayout.setResizeMode(i2);
    }

    public static void o(TextureView textureView, int i2) {
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

    public void A() {
        View view = this.f24037e;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    @RequiresNonNull({"artworkView"})
    public final boolean B(q1 q1Var) {
        byte[] bArr = q1Var.f9741m;
        if (bArr == null) {
            return false;
        }
        return C(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    @RequiresNonNull({"artworkView"})
    public final boolean C(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                y(this.f24035c, intrinsicWidth / intrinsicHeight);
                this.f24039g.setImageDrawable(drawable);
                this.f24039g.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean E() {
        a2 a2Var = this.f24046n;
        if (a2Var == null) {
            return true;
        }
        int playbackState = a2Var.getPlaybackState();
        return this.x && !this.f24046n.G().q() && (playbackState == 1 || playbackState == 4 || !((a2) g.e(this.f24046n)).i());
    }

    public void F() {
        G(E());
    }

    public final void G(boolean z) {
        if (P()) {
            this.f24043k.setShowTimeoutMs(z ? 0 : this.w);
            this.f24043k.t0();
        }
    }

    public final boolean H() {
        if (P() && this.f24046n != null) {
            if (!this.f24043k.e0()) {
                x(true);
                return true;
            }
            if (this.z) {
                this.f24043k.a0();
                return true;
            }
        }
        return false;
    }

    public final void I() {
        a2 a2Var = this.f24046n;
        e0 e0VarO = a2Var != null ? a2Var.o() : e0.f9369a;
        int i2 = e0VarO.f9371c;
        int i3 = e0VarO.f9372d;
        int i4 = e0VarO.f9373e;
        float f2 = (i3 == 0 || i2 == 0) ? 0.0f : (i2 * e0VarO.f9374f) / i3;
        View view = this.f24037e;
        if (view instanceof TextureView) {
            if (f2 > 0.0f && (i4 == 90 || i4 == 270)) {
                f2 = 1.0f / f2;
            }
            if (this.A != 0) {
                view.removeOnLayoutChangeListener(this.f24034b);
            }
            this.A = i4;
            if (i4 != 0) {
                this.f24037e.addOnLayoutChangeListener(this.f24034b);
            }
            o((TextureView) this.f24037e, this.A);
        }
        y(this.f24035c, this.f24038f ? 0.0f : f2);
    }

    public final void J() {
        int i2;
        if (this.f24041i != null) {
            a2 a2Var = this.f24046n;
            boolean z = true;
            if (a2Var == null || a2Var.getPlaybackState() != 2 || ((i2 = this.s) != 2 && (i2 != 1 || !this.f24046n.i()))) {
                z = false;
            }
            this.f24041i.setVisibility(z ? 0 : 8);
        }
    }

    public final void K() {
        a1 a1Var = this.f24043k;
        String string = null;
        if (a1Var != null && this.f24047o) {
            if (!a1Var.e0()) {
                setContentDescription(getResources().getString(w0.f8795l));
                return;
            } else if (this.z) {
                string = getResources().getString(w0.f8788e);
            }
        }
        setContentDescription(string);
    }

    public final void L() {
        if (w() && this.y) {
            u();
        } else {
            x(false);
        }
    }

    public final void M() {
        q<? super x1> qVar;
        TextView textView = this.f24042j;
        if (textView != null) {
            CharSequence charSequence = this.v;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f24042j.setVisibility(0);
                return;
            }
            a2 a2Var = this.f24046n;
            x1 x1VarU = a2Var != null ? a2Var.u() : null;
            if (x1VarU == null || (qVar = this.u) == null) {
                this.f24042j.setVisibility(8);
            } else {
                this.f24042j.setText((CharSequence) qVar.a(x1VarU).second);
                this.f24042j.setVisibility(0);
            }
        }
    }

    public final void N(boolean z) {
        a2 a2Var = this.f24046n;
        if (a2Var == null || a2Var.F().d()) {
            if (this.t) {
                return;
            }
            t();
            p();
            return;
        }
        if (z && !this.t) {
            p();
        }
        l lVarN = a2Var.N();
        for (int i2 = 0; i2 < lVarN.f8488a; i2++) {
            k kVarA = lVarN.a(i2);
            if (kVarA != null) {
                for (int i3 = 0; i3 < kVarA.length(); i3++) {
                    if (d0.l(kVarA.g(i3).f9338m) == 2) {
                        t();
                        return;
                    }
                }
            }
        }
        p();
        if (O() && (B(a2Var.P()) || C(this.r))) {
            return;
        }
        t();
    }

    @EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    public final boolean O() {
        if (!this.q) {
            return false;
        }
        g.i(this.f24039g);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    public final boolean P() {
        if (!this.f24047o) {
            return false;
        }
        g.i(this.f24043k);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        a2 a2Var = this.f24046n;
        if (a2Var != null && a2Var.e()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zV = v(keyEvent.getKeyCode());
        if ((zV && P() && !this.f24043k.e0()) || s(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            x(true);
            return true;
        }
        if (!zV || !P()) {
            return false;
        }
        x(true);
        return false;
    }

    @Override // c.f.a.b.h3.f0
    public List<c.f.a.b.h3.e0> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f24045m;
        if (frameLayout != null) {
            arrayList.add(new c.f.a.b.h3.e0(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        a1 a1Var = this.f24043k;
        if (a1Var != null) {
            arrayList.add(new c.f.a.b.h3.e0(a1Var, 0));
        }
        return t.D(arrayList);
    }

    @Override // c.f.a.b.h3.f0
    public ViewGroup getAdViewGroup() {
        return (ViewGroup) g.j(this.f24044l, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.x;
    }

    public boolean getControllerHideOnTouch() {
        return this.z;
    }

    public int getControllerShowTimeoutMs() {
        return this.w;
    }

    public Drawable getDefaultArtwork() {
        return this.r;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f24045m;
    }

    public a2 getPlayer() {
        return this.f24046n;
    }

    public int getResizeMode() {
        g.i(this.f24035c);
        return this.f24035c.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f24040h;
    }

    public boolean getUseArtwork() {
        return this.q;
    }

    public boolean getUseController() {
        return this.f24047o;
    }

    public View getVideoSurfaceView() {
        return this.f24037e;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!P() || this.f24046n == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.B = true;
            return true;
        }
        if (action != 1 || !this.B) {
            return false;
        }
        this.B = false;
        return performClick();
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!P() || this.f24046n == null) {
            return false;
        }
        x(true);
        return true;
    }

    public final void p() {
        View view = this.f24036d;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return H();
    }

    public boolean s(KeyEvent keyEvent) {
        return P() && this.f24043k.T(keyEvent);
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        g.i(this.f24035c);
        this.f24035c.setAspectRatioListener(bVar);
    }

    @Deprecated
    public void setControlDispatcher(c.f.a.b.x0 x0Var) {
        g.i(this.f24043k);
        this.f24043k.setControlDispatcher(x0Var);
    }

    public void setControllerAutoShow(boolean z) {
        this.x = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.y = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        g.i(this.f24043k);
        this.z = z;
        K();
    }

    public void setControllerOnFullScreenModeChangedListener(a1.d dVar) {
        g.i(this.f24043k);
        this.f24043k.setOnFullScreenModeChangedListener(dVar);
    }

    public void setControllerShowTimeoutMs(int i2) {
        g.i(this.f24043k);
        this.w = i2;
        if (this.f24043k.e0()) {
            F();
        }
    }

    public void setControllerVisibilityListener(a1.m mVar) {
        g.i(this.f24043k);
        a1.m mVar2 = this.p;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            this.f24043k.o0(mVar2);
        }
        this.p = mVar;
        if (mVar != null) {
            this.f24043k.R(mVar);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        g.g(this.f24042j != null);
        this.v = charSequence;
        M();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.r != drawable) {
            this.r = drawable;
            N(false);
        }
    }

    public void setErrorMessageProvider(q<? super x1> qVar) {
        if (this.u != qVar) {
            this.u = qVar;
            M();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.t != z) {
            this.t = z;
            N(false);
        }
    }

    public void setPlayer(a2 a2Var) {
        g.g(Looper.myLooper() == Looper.getMainLooper());
        g.a(a2Var == null || a2Var.H() == Looper.getMainLooper());
        a2 a2Var2 = this.f24046n;
        if (a2Var2 == a2Var) {
            return;
        }
        if (a2Var2 != null) {
            a2Var2.p(this.f24034b);
            View view = this.f24037e;
            if (view instanceof TextureView) {
                a2Var2.n((TextureView) view);
            } else if (view instanceof SurfaceView) {
                a2Var2.D((SurfaceView) view);
            }
        }
        SubtitleView subtitleView = this.f24040h;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f24046n = a2Var;
        if (P()) {
            this.f24043k.setPlayer(a2Var);
        }
        J();
        M();
        N(true);
        if (a2Var == null) {
            u();
            return;
        }
        if (a2Var.C(26)) {
            View view2 = this.f24037e;
            if (view2 instanceof TextureView) {
                a2Var.M((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                a2Var.r((SurfaceView) view2);
            }
            I();
        }
        if (this.f24040h != null && a2Var.C(27)) {
            this.f24040h.setCues(a2Var.A());
        }
        a2Var.y(this.f24034b);
        x(false);
    }

    public void setRepeatToggleModes(int i2) {
        g.i(this.f24043k);
        this.f24043k.setRepeatToggleModes(i2);
    }

    public void setResizeMode(int i2) {
        g.i(this.f24035c);
        this.f24035c.setResizeMode(i2);
    }

    public void setShowBuffering(int i2) {
        if (this.s != i2) {
            this.s = i2;
            J();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        g.i(this.f24043k);
        this.f24043k.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        g.i(this.f24043k);
        this.f24043k.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        g.i(this.f24043k);
        this.f24043k.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        g.i(this.f24043k);
        this.f24043k.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        g.i(this.f24043k);
        this.f24043k.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        g.i(this.f24043k);
        this.f24043k.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        g.i(this.f24043k);
        this.f24043k.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        g.i(this.f24043k);
        this.f24043k.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i2) {
        View view = this.f24036d;
        if (view != null) {
            view.setBackgroundColor(i2);
        }
    }

    public void setUseArtwork(boolean z) {
        g.g((z && this.f24039g == null) ? false : true);
        if (this.q != z) {
            this.q = z;
            N(false);
        }
    }

    public void setUseController(boolean z) {
        a1 a1Var;
        a2 a2Var;
        g.g((z && this.f24043k == null) ? false : true);
        if (this.f24047o == z) {
            return;
        }
        this.f24047o = z;
        if (!P()) {
            a1 a1Var2 = this.f24043k;
            if (a1Var2 != null) {
                a1Var2.a0();
                a1Var = this.f24043k;
                a2Var = null;
            }
            K();
        }
        a1Var = this.f24043k;
        a2Var = this.f24046n;
        a1Var.setPlayer(a2Var);
        K();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.f24037e;
        if (view instanceof SurfaceView) {
            view.setVisibility(i2);
        }
    }

    public final void t() {
        ImageView imageView = this.f24039g;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f24039g.setVisibility(4);
        }
    }

    public void u() {
        a1 a1Var = this.f24043k;
        if (a1Var != null) {
            a1Var.a0();
        }
    }

    @SuppressLint({"InlinedApi"})
    public final boolean v(int i2) {
        return i2 == 19 || i2 == 270 || i2 == 22 || i2 == 271 || i2 == 20 || i2 == 269 || i2 == 21 || i2 == 268 || i2 == 23;
    }

    public final boolean w() {
        a2 a2Var = this.f24046n;
        return a2Var != null && a2Var.e() && this.f24046n.i();
    }

    public final void x(boolean z) {
        if (!(w() && this.y) && P()) {
            boolean z2 = this.f24043k.e0() && this.f24043k.getShowTimeoutMs() <= 0;
            boolean zE = E();
            if (z || z2 || zE) {
                G(zE);
            }
        }
    }

    public void y(AspectRatioFrameLayout aspectRatioFrameLayout, float f2) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f2);
        }
    }

    public void z() {
        View view = this.f24037e;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }
}
