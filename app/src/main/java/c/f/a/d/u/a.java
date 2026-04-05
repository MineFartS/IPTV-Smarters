package c.f.a.d.u;

import a.i.j.l.b;
import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import c.f.a.d.d0.h;
import c.f.a.d.d0.k;
import c.f.a.d.g0.d;
import c.f.a.d.j0.g;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes2.dex */
public class a extends g implements b, Drawable.Callback, h.b {
    public int A0;
    public ColorStateList B;
    public boolean B0;
    public ColorStateList C;
    public int C0;
    public float D;
    public int D0;
    public float E;
    public ColorFilter E0;
    public ColorStateList F;
    public PorterDuffColorFilter F0;
    public float G;
    public ColorStateList G0;
    public ColorStateList H;
    public PorterDuff.Mode H0;
    public CharSequence I;
    public int[] I0;
    public boolean J;
    public boolean J0;
    public Drawable K;
    public ColorStateList K0;
    public ColorStateList L;
    public WeakReference<InterfaceC0177a> L0;
    public float M;
    public TextUtils.TruncateAt M0;
    public boolean N;
    public boolean N0;
    public boolean O;
    public int O0;
    public Drawable P;
    public boolean P0;
    public Drawable Q;
    public ColorStateList R;
    public float S;
    public CharSequence T;
    public boolean U;
    public boolean V;
    public Drawable W;
    public ColorStateList X;
    public c.f.a.d.m.h Y;
    public c.f.a.d.m.h Z;
    public float f0;
    public float g0;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public final Context n0;
    public final Paint o0;
    public final Paint p0;
    public final Paint.FontMetrics q0;
    public final RectF r0;
    public final PointF s0;
    public final Path t0;
    public final h u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;
    public static final int[] z = {R.attr.state_enabled};
    public static final ShapeDrawable A = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: c.f.a.d.u.a$a, reason: collision with other inner class name */
    public interface InterfaceC0177a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.E = -1.0f;
        this.o0 = new Paint(1);
        this.q0 = new Paint.FontMetrics();
        this.r0 = new RectF();
        this.s0 = new PointF();
        this.t0 = new Path();
        this.D0 = 255;
        this.H0 = PorterDuff.Mode.SRC_IN;
        this.L0 = new WeakReference<>(null);
        M(context);
        this.n0 = context;
        h hVar = new h(this);
        this.u0 = hVar;
        this.I = BuildConfig.FLAVOR;
        hVar.e().density = context.getResources().getDisplayMetrics().density;
        this.p0 = null;
        int[] iArr = z;
        setState(iArr);
        l2(iArr);
        this.N0 = true;
        if (c.f.a.d.h0.b.f14845a) {
            A.setTint(-1);
        }
    }

    public static boolean n1(int[] iArr, int i2) {
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean r1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean s1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean t1(d dVar) {
        ColorStateList colorStateList;
        return (dVar == null || (colorStateList = dVar.f14806a) == null || !colorStateList.isStateful()) ? false : true;
    }

    public static a v0(Context context, AttributeSet attributeSet, int i2, int i3) {
        a aVar = new a(context, attributeSet, i2, i3);
        aVar.u1(attributeSet, i2, i3);
        return aVar;
    }

    public final void A0(Canvas canvas, Rect rect) {
        if (this.P0) {
            return;
        }
        this.o0.setColor(this.v0);
        this.o0.setStyle(Paint.Style.FILL);
        this.r0.set(rect);
        canvas.drawRoundRect(this.r0, I0(), I0(), this.o0);
    }

    public void A1(int i2) {
        z1(a.b.l.a.a.d(this.n0, i2));
    }

    public void A2(boolean z2) {
        this.N0 = z2;
    }

    public final void B0(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (O2()) {
            o0(rect, this.r0);
            RectF rectF = this.r0;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.P.setBounds(0, 0, (int) this.r0.width(), (int) this.r0.height());
            if (c.f.a.d.h0.b.f14845a) {
                this.Q.setBounds(this.P.getBounds());
                this.Q.jumpToCurrentState();
                drawable = this.Q;
            } else {
                drawable = this.P;
            }
            drawable.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    public void B1(ColorStateList colorStateList) {
        if (this.X != colorStateList) {
            this.X = colorStateList;
            if (u0()) {
                a.i.j.l.a.o(this.W, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void B2(c.f.a.d.m.h hVar) {
        this.Y = hVar;
    }

    public final void C0(Canvas canvas, Rect rect) {
        this.o0.setColor(this.z0);
        this.o0.setStyle(Paint.Style.FILL);
        this.r0.set(rect);
        if (!this.P0) {
            canvas.drawRoundRect(this.r0, I0(), I0(), this.o0);
        } else {
            h(new RectF(rect), this.t0);
            super.p(canvas, this.o0, this.t0, u());
        }
    }

    public void C1(int i2) {
        B1(a.b.l.a.a.c(this.n0, i2));
    }

    public void C2(int i2) {
        B2(c.f.a.d.m.h.c(this.n0, i2));
    }

    public final void D0(Canvas canvas, Rect rect) {
        Paint paint = this.p0;
        if (paint != null) {
            paint.setColor(a.i.j.a.m(DefaultRenderer.BACKGROUND_COLOR, 127));
            canvas.drawRect(rect, this.p0);
            if (N2() || M2()) {
                l0(rect, this.r0);
                canvas.drawRect(this.r0, this.p0);
            }
            if (this.I != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.p0);
            }
            if (O2()) {
                o0(rect, this.r0);
                canvas.drawRect(this.r0, this.p0);
            }
            this.p0.setColor(a.i.j.a.m(-65536, 127));
            n0(rect, this.r0);
            canvas.drawRect(this.r0, this.p0);
            this.p0.setColor(a.i.j.a.m(-16711936, 127));
            p0(rect, this.r0);
            canvas.drawRect(this.r0, this.p0);
        }
    }

    public void D1(int i2) {
        E1(this.n0.getResources().getBoolean(i2));
    }

    public void D2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        if (TextUtils.equals(this.I, charSequence)) {
            return;
        }
        this.I = charSequence;
        this.u0.i(true);
        invalidateSelf();
        v1();
    }

    public final void E0(Canvas canvas, Rect rect) {
        if (this.I != null) {
            Paint.Align alignT0 = t0(rect, this.s0);
            r0(rect, this.r0);
            if (this.u0.d() != null) {
                this.u0.e().drawableState = getState();
                this.u0.j(this.n0);
            }
            this.u0.e().setTextAlign(alignT0);
            int iSave = 0;
            boolean z2 = Math.round(this.u0.f(h1().toString())) > Math.round(this.r0.width());
            if (z2) {
                iSave = canvas.save();
                canvas.clipRect(this.r0);
            }
            CharSequence charSequenceEllipsize = this.I;
            if (z2 && this.M0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.u0.e(), this.r0.width(), this.M0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.s0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.u0.e());
            if (z2) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void E1(boolean z2) {
        if (this.V != z2) {
            boolean zM2 = M2();
            this.V = z2;
            boolean zM22 = M2();
            if (zM2 != zM22) {
                if (zM22) {
                    k0(this.W);
                } else {
                    P2(this.W);
                }
                invalidateSelf();
                v1();
            }
        }
    }

    public void E2(d dVar) {
        this.u0.h(dVar, this.n0);
    }

    public Drawable F0() {
        return this.W;
    }

    public void F1(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            onStateChange(getState());
        }
    }

    public void F2(int i2) {
        E2(new d(this.n0, i2));
    }

    public ColorStateList G0() {
        return this.X;
    }

    public void G1(int i2) {
        F1(a.b.l.a.a.c(this.n0, i2));
    }

    public void G2(float f2) {
        if (this.j0 != f2) {
            this.j0 = f2;
            invalidateSelf();
            v1();
        }
    }

    public ColorStateList H0() {
        return this.C;
    }

    @Deprecated
    public void H1(float f2) {
        if (this.E != f2) {
            this.E = f2;
            setShapeAppearanceModel(C().w(f2));
        }
    }

    public void H2(int i2) {
        G2(this.n0.getResources().getDimension(i2));
    }

    public float I0() {
        return this.P0 ? F() : this.E;
    }

    @Deprecated
    public void I1(int i2) {
        H1(this.n0.getResources().getDimension(i2));
    }

    public void I2(float f2) {
        if (this.i0 != f2) {
            this.i0 = f2;
            invalidateSelf();
            v1();
        }
    }

    public float J0() {
        return this.m0;
    }

    public void J1(float f2) {
        if (this.m0 != f2) {
            this.m0 = f2;
            invalidateSelf();
            v1();
        }
    }

    public void J2(int i2) {
        I2(this.n0.getResources().getDimension(i2));
    }

    public Drawable K0() {
        Drawable drawable = this.K;
        if (drawable != null) {
            return a.i.j.l.a.q(drawable);
        }
        return null;
    }

    public void K1(int i2) {
        J1(this.n0.getResources().getDimension(i2));
    }

    public void K2(boolean z2) {
        if (this.J0 != z2) {
            this.J0 = z2;
            Q2();
            onStateChange(getState());
        }
    }

    public float L0() {
        return this.M;
    }

    public void L1(Drawable drawable) {
        Drawable drawableK0 = K0();
        if (drawableK0 != drawable) {
            float fM0 = m0();
            this.K = drawable != null ? a.i.j.l.a.r(drawable).mutate() : null;
            float fM02 = m0();
            P2(drawableK0);
            if (N2()) {
                k0(this.K);
            }
            invalidateSelf();
            if (fM0 != fM02) {
                v1();
            }
        }
    }

    public boolean L2() {
        return this.N0;
    }

    public ColorStateList M0() {
        return this.L;
    }

    public void M1(int i2) {
        L1(a.b.l.a.a.d(this.n0, i2));
    }

    public final boolean M2() {
        return this.V && this.W != null && this.B0;
    }

    public float N0() {
        return this.D;
    }

    public void N1(float f2) {
        if (this.M != f2) {
            float fM0 = m0();
            this.M = f2;
            float fM02 = m0();
            invalidateSelf();
            if (fM0 != fM02) {
                v1();
            }
        }
    }

    public final boolean N2() {
        return this.J && this.K != null;
    }

    public float O0() {
        return this.f0;
    }

    public void O1(int i2) {
        N1(this.n0.getResources().getDimension(i2));
    }

    public final boolean O2() {
        return this.O && this.P != null;
    }

    public ColorStateList P0() {
        return this.F;
    }

    public void P1(ColorStateList colorStateList) {
        this.N = true;
        if (this.L != colorStateList) {
            this.L = colorStateList;
            if (N2()) {
                a.i.j.l.a.o(this.K, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void P2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public float Q0() {
        return this.G;
    }

    public void Q1(int i2) {
        P1(a.b.l.a.a.c(this.n0, i2));
    }

    public final void Q2() {
        this.K0 = this.J0 ? c.f.a.d.h0.b.d(this.H) : null;
    }

    public Drawable R0() {
        Drawable drawable = this.P;
        if (drawable != null) {
            return a.i.j.l.a.q(drawable);
        }
        return null;
    }

    public void R1(int i2) {
        S1(this.n0.getResources().getBoolean(i2));
    }

    @TargetApi(21)
    public final void R2() {
        this.Q = new RippleDrawable(c.f.a.d.h0.b.d(f1()), this.P, A);
    }

    public CharSequence S0() {
        return this.T;
    }

    public void S1(boolean z2) {
        if (this.J != z2) {
            boolean zN2 = N2();
            this.J = z2;
            boolean zN22 = N2();
            if (zN2 != zN22) {
                if (zN22) {
                    k0(this.K);
                } else {
                    P2(this.K);
                }
                invalidateSelf();
                v1();
            }
        }
    }

    public float T0() {
        return this.l0;
    }

    public void T1(float f2) {
        if (this.D != f2) {
            this.D = f2;
            invalidateSelf();
            v1();
        }
    }

    public float U0() {
        return this.S;
    }

    public void U1(int i2) {
        T1(this.n0.getResources().getDimension(i2));
    }

    public float V0() {
        return this.k0;
    }

    public void V1(float f2) {
        if (this.f0 != f2) {
            this.f0 = f2;
            invalidateSelf();
            v1();
        }
    }

    public int[] W0() {
        return this.I0;
    }

    public void W1(int i2) {
        V1(this.n0.getResources().getDimension(i2));
    }

    public ColorStateList X0() {
        return this.R;
    }

    public void X1(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            if (this.P0) {
                f0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void Y0(RectF rectF) {
        p0(getBounds(), rectF);
    }

    public void Y1(int i2) {
        X1(a.b.l.a.a.c(this.n0, i2));
    }

    public final float Z0() {
        Drawable drawable = this.B0 ? this.W : this.K;
        float fCeil = this.M;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(k.b(this.n0, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    public void Z1(float f2) {
        if (this.G != f2) {
            this.G = f2;
            this.o0.setStrokeWidth(f2);
            if (this.P0) {
                super.g0(f2);
            }
            invalidateSelf();
        }
    }

    @Override // c.f.a.d.d0.h.b
    public void a() {
        v1();
        invalidateSelf();
    }

    public final float a1() {
        Drawable drawable = this.B0 ? this.W : this.K;
        float f2 = this.M;
        return (f2 > 0.0f || drawable == null) ? f2 : drawable.getIntrinsicWidth();
    }

    public void a2(int i2) {
        Z1(this.n0.getResources().getDimension(i2));
    }

    public TextUtils.TruncateAt b1() {
        return this.M0;
    }

    public final void b2(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            onStateChange(getState());
        }
    }

    public c.f.a.d.m.h c1() {
        return this.Z;
    }

    public void c2(Drawable drawable) {
        Drawable drawableR0 = R0();
        if (drawableR0 != drawable) {
            float fQ0 = q0();
            this.P = drawable != null ? a.i.j.l.a.r(drawable).mutate() : null;
            if (c.f.a.d.h0.b.f14845a) {
                R2();
            }
            float fQ02 = q0();
            P2(drawableR0);
            if (O2()) {
                k0(this.P);
            }
            invalidateSelf();
            if (fQ0 != fQ02) {
                v1();
            }
        }
    }

    public float d1() {
        return this.h0;
    }

    public void d2(CharSequence charSequence) {
        if (this.T != charSequence) {
            this.T = a.i.p.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    @Override // c.f.a.d.j0.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i2 = this.D0;
        int iA = i2 < 255 ? c.f.a.d.r.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i2) : 0;
        A0(canvas, bounds);
        x0(canvas, bounds);
        if (this.P0) {
            super.draw(canvas);
        }
        z0(canvas, bounds);
        C0(canvas, bounds);
        y0(canvas, bounds);
        w0(canvas, bounds);
        if (this.N0) {
            E0(canvas, bounds);
        }
        B0(canvas, bounds);
        D0(canvas, bounds);
        if (this.D0 < 255) {
            canvas.restoreToCount(iA);
        }
    }

    public float e1() {
        return this.g0;
    }

    public void e2(float f2) {
        if (this.l0 != f2) {
            this.l0 = f2;
            invalidateSelf();
            if (O2()) {
                v1();
            }
        }
    }

    public ColorStateList f1() {
        return this.H;
    }

    public void f2(int i2) {
        e2(this.n0.getResources().getDimension(i2));
    }

    public c.f.a.d.m.h g1() {
        return this.Y;
    }

    public void g2(int i2) {
        c2(a.b.l.a.a.d(this.n0, i2));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.D0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.E0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.D;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f0 + m0() + this.i0 + this.u0.f(h1().toString()) + this.j0 + q0() + this.m0), this.O0);
    }

    @Override // c.f.a.d.j0.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // c.f.a.d.j0.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.P0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.E);
        } else {
            outline.setRoundRect(bounds, this.E);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public CharSequence h1() {
        return this.I;
    }

    public void h2(float f2) {
        if (this.S != f2) {
            this.S = f2;
            invalidateSelf();
            if (O2()) {
                v1();
            }
        }
    }

    public d i1() {
        return this.u0.d();
    }

    public void i2(int i2) {
        h2(this.n0.getResources().getDimension(i2));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // c.f.a.d.j0.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return r1(this.B) || r1(this.C) || r1(this.F) || (this.J0 && r1(this.K0)) || t1(this.u0.d()) || u0() || s1(this.K) || s1(this.W) || r1(this.G0);
    }

    public float j1() {
        return this.j0;
    }

    public void j2(float f2) {
        if (this.k0 != f2) {
            this.k0 = f2;
            invalidateSelf();
            if (O2()) {
                v1();
            }
        }
    }

    public final void k0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        a.i.j.l.a.m(drawable, a.i.j.l.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.P) {
            if (drawable.isStateful()) {
                drawable.setState(W0());
            }
            a.i.j.l.a.o(drawable, this.R);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.K;
        if (drawable == drawable2 && this.N) {
            a.i.j.l.a.o(drawable2, this.L);
        }
    }

    public float k1() {
        return this.i0;
    }

    public void k2(int i2) {
        j2(this.n0.getResources().getDimension(i2));
    }

    public final void l0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (N2() || M2()) {
            float f2 = this.f0 + this.g0;
            float fA1 = a1();
            if (a.i.j.l.a.f(this) == 0) {
                float f3 = rect.left + f2;
                rectF.left = f3;
                rectF.right = f3 + fA1;
            } else {
                float f4 = rect.right - f2;
                rectF.right = f4;
                rectF.left = f4 - fA1;
            }
            float fZ0 = Z0();
            float fExactCenterY = rect.exactCenterY() - (fZ0 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fZ0;
        }
    }

    public final ColorFilter l1() {
        ColorFilter colorFilter = this.E0;
        return colorFilter != null ? colorFilter : this.F0;
    }

    public boolean l2(int[] iArr) {
        if (Arrays.equals(this.I0, iArr)) {
            return false;
        }
        this.I0 = iArr;
        if (O2()) {
            return w1(getState(), iArr);
        }
        return false;
    }

    public float m0() {
        if (N2() || M2()) {
            return this.g0 + a1() + this.h0;
        }
        return 0.0f;
    }

    public boolean m1() {
        return this.J0;
    }

    public void m2(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            if (O2()) {
                a.i.j.l.a.o(this.P, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void n0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (O2()) {
            float f2 = this.m0 + this.l0 + this.S + this.k0 + this.j0;
            if (a.i.j.l.a.f(this) == 0) {
                rectF.right = rect.right - f2;
            } else {
                rectF.left = rect.left + f2;
            }
        }
    }

    public void n2(int i2) {
        m2(a.b.l.a.a.c(this.n0, i2));
    }

    public final void o0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (O2()) {
            float f2 = this.m0 + this.l0;
            if (a.i.j.l.a.f(this) == 0) {
                float f3 = rect.right - f2;
                rectF.right = f3;
                rectF.left = f3 - this.S;
            } else {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + this.S;
            }
            float fExactCenterY = rect.exactCenterY();
            float f5 = this.S;
            float f6 = fExactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    public boolean o1() {
        return this.U;
    }

    public void o2(boolean z2) {
        if (this.O != z2) {
            boolean zO2 = O2();
            this.O = z2;
            boolean zO22 = O2();
            if (zO2 != zO22) {
                if (zO22) {
                    k0(this.P);
                } else {
                    P2(this.P);
                }
                invalidateSelf();
                v1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (N2()) {
            zOnLayoutDirectionChanged |= a.i.j.l.a.m(this.K, i2);
        }
        if (M2()) {
            zOnLayoutDirectionChanged |= a.i.j.l.a.m(this.W, i2);
        }
        if (O2()) {
            zOnLayoutDirectionChanged |= a.i.j.l.a.m(this.P, i2);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
        boolean zOnLevelChange = super.onLevelChange(i2);
        if (N2()) {
            zOnLevelChange |= this.K.setLevel(i2);
        }
        if (M2()) {
            zOnLevelChange |= this.W.setLevel(i2);
        }
        if (O2()) {
            zOnLevelChange |= this.P.setLevel(i2);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // c.f.a.d.j0.g, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.P0) {
            super.onStateChange(iArr);
        }
        return w1(iArr, W0());
    }

    public final void p0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (O2()) {
            float f2 = this.m0 + this.l0 + this.S + this.k0 + this.j0;
            if (a.i.j.l.a.f(this) == 0) {
                float f3 = rect.right;
                rectF.right = f3;
                rectF.left = f3 - f2;
            } else {
                int i2 = rect.left;
                rectF.left = i2;
                rectF.right = i2 + f2;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean p1() {
        return s1(this.P);
    }

    public void p2(InterfaceC0177a interfaceC0177a) {
        this.L0 = new WeakReference<>(interfaceC0177a);
    }

    public float q0() {
        if (O2()) {
            return this.k0 + this.S + this.l0;
        }
        return 0.0f;
    }

    public boolean q1() {
        return this.O;
    }

    public void q2(TextUtils.TruncateAt truncateAt) {
        this.M0 = truncateAt;
    }

    public final void r0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.I != null) {
            float fM0 = this.f0 + m0() + this.i0;
            float fQ0 = this.m0 + q0() + this.j0;
            if (a.i.j.l.a.f(this) == 0) {
                rectF.left = rect.left + fM0;
                rectF.right = rect.right - fQ0;
            } else {
                rectF.left = rect.left + fQ0;
                rectF.right = rect.right - fM0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void r2(c.f.a.d.m.h hVar) {
        this.Z = hVar;
    }

    public final float s0() {
        this.u0.e().getFontMetrics(this.q0);
        Paint.FontMetrics fontMetrics = this.q0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public void s2(int i2) {
        r2(c.f.a.d.m.h.c(this.n0, i2));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // c.f.a.d.j0.g, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.D0 != i2) {
            this.D0 = i2;
            invalidateSelf();
        }
    }

    @Override // c.f.a.d.j0.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.E0 != colorFilter) {
            this.E0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // c.f.a.d.j0.g, android.graphics.drawable.Drawable, a.i.j.l.b
    public void setTintList(ColorStateList colorStateList) {
        if (this.G0 != colorStateList) {
            this.G0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // c.f.a.d.j0.g, android.graphics.drawable.Drawable, a.i.j.l.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.H0 != mode) {
            this.H0 = mode;
            this.F0 = c.f.a.d.z.a.a(this, this.G0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (N2()) {
            visible |= this.K.setVisible(z2, z3);
        }
        if (M2()) {
            visible |= this.W.setVisible(z2, z3);
        }
        if (O2()) {
            visible |= this.P.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public Paint.Align t0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.I != null) {
            float fM0 = this.f0 + m0() + this.i0;
            if (a.i.j.l.a.f(this) == 0) {
                pointF.x = rect.left + fM0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - fM0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - s0();
        }
        return align;
    }

    public void t2(float f2) {
        if (this.h0 != f2) {
            float fM0 = m0();
            this.h0 = f2;
            float fM02 = m0();
            invalidateSelf();
            if (fM0 != fM02) {
                v1();
            }
        }
    }

    public final boolean u0() {
        return this.V && this.W != null && this.U;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u1(android.util.AttributeSet r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.d.u.a.u1(android.util.AttributeSet, int, int):void");
    }

    public void u2(int i2) {
        t2(this.n0.getResources().getDimension(i2));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1() {
        InterfaceC0177a interfaceC0177a = this.L0.get();
        if (interfaceC0177a != null) {
            interfaceC0177a.a();
        }
    }

    public void v2(float f2) {
        if (this.g0 != f2) {
            float fM0 = m0();
            this.g0 = f2;
            float fM02 = m0();
            invalidateSelf();
            if (fM0 != fM02) {
                v1();
            }
        }
    }

    public final void w0(Canvas canvas, Rect rect) {
        if (M2()) {
            l0(rect, this.r0);
            RectF rectF = this.r0;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.W.setBounds(0, 0, (int) this.r0.width(), (int) this.r0.height());
            this.W.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    public final boolean w1(int[] iArr, int[] iArr2) {
        boolean z2;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.B;
        int iL = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.v0) : 0);
        boolean state = true;
        if (this.v0 != iL) {
            this.v0 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.C;
        int iL2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.w0) : 0);
        if (this.w0 != iL2) {
            this.w0 = iL2;
            zOnStateChange = true;
        }
        int iE = c.f.a.d.w.a.e(iL, iL2);
        if ((this.x0 != iE) | (x() == null)) {
            this.x0 = iE;
            X(ColorStateList.valueOf(iE));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.F;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.y0) : 0;
        if (this.y0 != colorForState) {
            this.y0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.K0 == null || !c.f.a.d.h0.b.e(iArr)) ? 0 : this.K0.getColorForState(iArr, this.z0);
        if (this.z0 != colorForState2) {
            this.z0 = colorForState2;
            if (this.J0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.u0.d() == null || this.u0.d().f14806a == null) ? 0 : this.u0.d().f14806a.getColorForState(iArr, this.A0);
        if (this.A0 != colorForState3) {
            this.A0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z3 = n1(getState(), R.attr.state_checked) && this.U;
        if (this.B0 == z3 || this.W == null) {
            z2 = false;
        } else {
            float fM0 = m0();
            this.B0 = z3;
            if (fM0 != m0()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                zOnStateChange = true;
                z2 = false;
            }
        }
        ColorStateList colorStateList4 = this.G0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.C0) : 0;
        if (this.C0 != colorForState4) {
            this.C0 = colorForState4;
            this.F0 = c.f.a.d.z.a.a(this, this.G0, this.H0);
        } else {
            state = zOnStateChange;
        }
        if (s1(this.K)) {
            state |= this.K.setState(iArr);
        }
        if (s1(this.W)) {
            state |= this.W.setState(iArr);
        }
        if (s1(this.P)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.P.setState(iArr3);
        }
        if (c.f.a.d.h0.b.f14845a && s1(this.Q)) {
            state |= this.Q.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            v1();
        }
        return state;
    }

    public void w2(int i2) {
        v2(this.n0.getResources().getDimension(i2));
    }

    public final void x0(Canvas canvas, Rect rect) {
        if (this.P0) {
            return;
        }
        this.o0.setColor(this.w0);
        this.o0.setStyle(Paint.Style.FILL);
        this.o0.setColorFilter(l1());
        this.r0.set(rect);
        canvas.drawRoundRect(this.r0, I0(), I0(), this.o0);
    }

    public void x1(boolean z2) {
        if (this.U != z2) {
            this.U = z2;
            float fM0 = m0();
            if (!z2 && this.B0) {
                this.B0 = false;
            }
            float fM02 = m0();
            invalidateSelf();
            if (fM0 != fM02) {
                v1();
            }
        }
    }

    public void x2(int i2) {
        this.O0 = i2;
    }

    public final void y0(Canvas canvas, Rect rect) {
        if (N2()) {
            l0(rect, this.r0);
            RectF rectF = this.r0;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.K.setBounds(0, 0, (int) this.r0.width(), (int) this.r0.height());
            this.K.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    public void y1(int i2) {
        x1(this.n0.getResources().getBoolean(i2));
    }

    public void y2(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            Q2();
            onStateChange(getState());
        }
    }

    public final void z0(Canvas canvas, Rect rect) {
        if (this.G <= 0.0f || this.P0) {
            return;
        }
        this.o0.setColor(this.y0);
        this.o0.setStyle(Paint.Style.STROKE);
        if (!this.P0) {
            this.o0.setColorFilter(l1());
        }
        RectF rectF = this.r0;
        float f2 = rect.left;
        float f3 = this.G;
        rectF.set(f2 + (f3 / 2.0f), rect.top + (f3 / 2.0f), rect.right - (f3 / 2.0f), rect.bottom - (f3 / 2.0f));
        float f4 = this.E - (this.G / 2.0f);
        canvas.drawRoundRect(this.r0, f4, f4, this.o0);
    }

    public void z1(Drawable drawable) {
        if (this.W != drawable) {
            float fM0 = m0();
            this.W = drawable;
            float fM02 = m0();
            P2(this.W);
            k0(this.W);
            invalidateSelf();
            if (fM0 != fM02) {
                v1();
            }
        }
    }

    public void z2(int i2) {
        y2(a.b.l.a.a.c(this.n0, i2));
    }
}
