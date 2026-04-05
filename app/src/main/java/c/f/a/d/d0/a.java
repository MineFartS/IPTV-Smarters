package c.f.a.d.d0;

import a.i.r.x;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import c.f.a.d.d0.g;
import c.f.a.d.g0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f14717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Paint f14718b;
    public CharSequence A;
    public boolean B;
    public boolean C;
    public Bitmap D;
    public Paint E;
    public float F;
    public float G;
    public int[] H;
    public boolean I;
    public final TextPaint J;
    public final TextPaint K;
    public TimeInterpolator L;
    public TimeInterpolator M;
    public float N;
    public float O;
    public float P;
    public ColorStateList Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public StaticLayout X;
    public float Y;
    public float Z;
    public float a0;
    public CharSequence b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f14719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f14722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f14723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f14724h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f14729m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f14730n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f14731o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public Typeface u;
    public Typeface v;
    public Typeface w;
    public c.f.a.d.g0.a x;
    public c.f.a.d.g0.a y;
    public CharSequence z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14725i = 16;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14726j = 16;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f14727k = 15.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f14728l = 15.0f;
    public int c0 = 1;

    /* JADX INFO: renamed from: c.f.a.d.d0.a$a, reason: collision with other inner class name */
    public class C0165a implements a.InterfaceC0166a {
        public C0165a() {
        }

        @Override // c.f.a.d.g0.a.InterfaceC0166a
        public void a(Typeface typeface) {
            a.this.M(typeface);
        }
    }

    static {
        f14717a = Build.VERSION.SDK_INT < 18;
        Paint paint = null;
        f14718b = null;
        if (0 != 0) {
            paint.setAntiAlias(true);
            paint.setColor(-65281);
        }
    }

    public a(View view) {
        this.f14719c = view;
        TextPaint textPaint = new TextPaint(129);
        this.J = textPaint;
        this.K = new TextPaint(textPaint);
        this.f14723g = new Rect();
        this.f14722f = new Rect();
        this.f14724h = new RectF();
    }

    public static float C(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return c.f.a.d.m.a.a(f2, f3, f4);
    }

    public static boolean F(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    public static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((Color.alpha(i2) * f3) + (Color.alpha(i3) * f2)), (int) ((Color.red(i2) * f3) + (Color.red(i3) * f2)), (int) ((Color.green(i2) * f3) + (Color.green(i3) * f2)), (int) ((Color.blue(i2) * f3) + (Color.blue(i3) * f2)));
    }

    public static boolean z(float f2, float f3) {
        return Math.abs(f2 - f3) < 0.001f;
    }

    public final boolean A() {
        return x.C(this.f14719c) == 1;
    }

    public final boolean B() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f14730n;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f14729m) != null && colorStateList.isStateful());
    }

    public void D() {
        this.f14720d = this.f14723g.width() > 0 && this.f14723g.height() > 0 && this.f14722f.width() > 0 && this.f14722f.height() > 0;
    }

    public void E() {
        if (this.f14719c.getHeight() <= 0 || this.f14719c.getWidth() <= 0) {
            return;
        }
        b();
        d();
    }

    public void G(int i2, int i3, int i4, int i5) {
        if (F(this.f14723g, i2, i3, i4, i5)) {
            return;
        }
        this.f14723g.set(i2, i3, i4, i5);
        this.I = true;
        D();
    }

    public void H(Rect rect) {
        G(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void I(int i2) {
        c.f.a.d.g0.d dVar = new c.f.a.d.g0.d(this.f14719c.getContext(), i2);
        ColorStateList colorStateList = dVar.f14806a;
        if (colorStateList != null) {
            this.f14730n = colorStateList;
        }
        float f2 = dVar.f14819n;
        if (f2 != 0.0f) {
            this.f14728l = f2;
        }
        ColorStateList colorStateList2 = dVar.f14809d;
        if (colorStateList2 != null) {
            this.Q = colorStateList2;
        }
        this.O = dVar.f14814i;
        this.P = dVar.f14815j;
        this.N = dVar.f14816k;
        this.V = dVar.f14818m;
        c.f.a.d.g0.a aVar = this.y;
        if (aVar != null) {
            aVar.c();
        }
        this.y = new c.f.a.d.g0.a(new C0165a(), dVar.e());
        dVar.h(this.f14719c.getContext(), this.y);
        E();
    }

    public final void J(float f2) {
        this.Y = f2;
        x.g0(this.f14719c);
    }

    public void K(ColorStateList colorStateList) {
        if (this.f14730n != colorStateList) {
            this.f14730n = colorStateList;
            E();
        }
    }

    public void L(int i2) {
        if (this.f14726j != i2) {
            this.f14726j = i2;
            E();
        }
    }

    public void M(Typeface typeface) {
        if (N(typeface)) {
            E();
        }
    }

    public final boolean N(Typeface typeface) {
        c.f.a.d.g0.a aVar = this.y;
        if (aVar != null) {
            aVar.c();
        }
        if (this.u == typeface) {
            return false;
        }
        this.u = typeface;
        return true;
    }

    public void O(int i2, int i3, int i4, int i5) {
        if (F(this.f14722f, i2, i3, i4, i5)) {
            return;
        }
        this.f14722f.set(i2, i3, i4, i5);
        this.I = true;
        D();
    }

    public void P(Rect rect) {
        O(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void Q(float f2) {
        this.Z = f2;
        x.g0(this.f14719c);
    }

    public void R(ColorStateList colorStateList) {
        if (this.f14729m != colorStateList) {
            this.f14729m = colorStateList;
            E();
        }
    }

    public void S(int i2) {
        if (this.f14725i != i2) {
            this.f14725i = i2;
            E();
        }
    }

    public void T(float f2) {
        if (this.f14727k != f2) {
            this.f14727k = f2;
            E();
        }
    }

    public final boolean U(Typeface typeface) {
        c.f.a.d.g0.a aVar = this.x;
        if (aVar != null) {
            aVar.c();
        }
        if (this.v == typeface) {
            return false;
        }
        this.v = typeface;
        return true;
    }

    public void V(float f2) {
        float fA = a.i.m.a.a(f2, 0.0f, 1.0f);
        if (fA != this.f14721e) {
            this.f14721e = fA;
            d();
        }
    }

    public final void W(float f2) {
        g(f2);
        boolean z = f14717a && this.F != 1.0f;
        this.C = z;
        if (z) {
            l();
        }
        x.g0(this.f14719c);
    }

    public void X(TimeInterpolator timeInterpolator) {
        this.L = timeInterpolator;
        E();
    }

    public final boolean Y(int[] iArr) {
        this.H = iArr;
        if (!B()) {
            return false;
        }
        E();
        return true;
    }

    public void Z(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.z, charSequence)) {
            this.z = charSequence;
            this.A = null;
            h();
            E();
        }
    }

    public void a0(TimeInterpolator timeInterpolator) {
        this.M = timeInterpolator;
        E();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.d.d0.a.b():void");
    }

    public void b0(Typeface typeface) {
        boolean zN = N(typeface);
        boolean zU = U(typeface);
        if (zN || zU) {
            E();
        }
    }

    public float c() {
        if (this.z == null) {
            return 0.0f;
        }
        w(this.K);
        TextPaint textPaint = this.K;
        CharSequence charSequence = this.z;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final boolean c0() {
        return (this.c0 <= 1 || this.B || this.C) ? false : true;
    }

    public final void d() {
        f(this.f14721e);
    }

    public final boolean e(CharSequence charSequence) {
        return (A() ? a.i.p.e.f1945d : a.i.p.e.f1944c).a(charSequence, 0, charSequence.length());
    }

    public final void f(float f2) {
        TextPaint textPaint;
        int iR;
        y(f2);
        this.s = C(this.q, this.r, f2, this.L);
        this.t = C(this.f14731o, this.p, f2, this.L);
        W(C(this.f14727k, this.f14728l, f2, this.M));
        TimeInterpolator timeInterpolator = c.f.a.d.m.a.f15043b;
        J(1.0f - C(0.0f, 1.0f, 1.0f - f2, timeInterpolator));
        Q(C(1.0f, 0.0f, f2, timeInterpolator));
        if (this.f14730n != this.f14729m) {
            textPaint = this.J;
            iR = a(t(), r(), f2);
        } else {
            textPaint = this.J;
            iR = r();
        }
        textPaint.setColor(iR);
        if (Build.VERSION.SDK_INT >= 21) {
            float f3 = this.V;
            float f4 = this.W;
            if (f3 != f4) {
                this.J.setLetterSpacing(C(f4, f3, f2, timeInterpolator));
            } else {
                this.J.setLetterSpacing(f3);
            }
        }
        this.J.setShadowLayer(C(this.R, this.N, f2, null), C(this.S, this.O, f2, null), C(this.T, this.P, f2, null), a(s(this.U), s(this.Q), f2));
        x.g0(this.f14719c);
    }

    public final void g(float f2) {
        boolean z;
        float f3;
        boolean z2;
        if (this.z == null) {
            return;
        }
        float fWidth = this.f14723g.width();
        float fWidth2 = this.f14722f.width();
        if (z(f2, this.f14728l)) {
            f3 = this.f14728l;
            this.F = 1.0f;
            Typeface typeface = this.w;
            Typeface typeface2 = this.u;
            if (typeface != typeface2) {
                this.w = typeface2;
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            float f4 = this.f14727k;
            Typeface typeface3 = this.w;
            Typeface typeface4 = this.v;
            if (typeface3 != typeface4) {
                this.w = typeface4;
                z = true;
            } else {
                z = false;
            }
            if (z(f2, f4)) {
                this.F = 1.0f;
            } else {
                this.F = f2 / this.f14727k;
            }
            float f5 = this.f14728l / this.f14727k;
            fWidth = fWidth2 * f5 > fWidth ? Math.min(fWidth / f5, fWidth2) : fWidth2;
            f3 = f4;
            z2 = z;
        }
        if (fWidth > 0.0f) {
            z2 = this.G != f3 || this.I || z2;
            this.G = f3;
            this.I = false;
        }
        if (this.A == null || z2) {
            this.J.setTextSize(this.G);
            this.J.setTypeface(this.w);
            this.J.setLinearText(this.F != 1.0f);
            this.B = e(this.z);
            StaticLayout staticLayoutI = i(c0() ? this.c0 : 1, fWidth, this.B);
            this.X = staticLayoutI;
            this.A = staticLayoutI.getText();
        }
    }

    public final void h() {
        Bitmap bitmap = this.D;
        if (bitmap != null) {
            bitmap.recycle();
            this.D = null;
        }
    }

    public final StaticLayout i(int i2, float f2, boolean z) {
        StaticLayout staticLayoutA;
        try {
            staticLayoutA = g.c(this.z, this.J, (int) f2).e(TextUtils.TruncateAt.END).g(z).d(Layout.Alignment.ALIGN_NORMAL).f(false).h(i2).a();
        } catch (g.a e2) {
            Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
            staticLayoutA = null;
        }
        return (StaticLayout) a.i.q.i.e(staticLayoutA);
    }

    public void j(Canvas canvas) {
        int iSave = canvas.save();
        if (this.A == null || !this.f14720d) {
            return;
        }
        boolean z = false;
        float lineLeft = (this.s + this.X.getLineLeft(0)) - (this.a0 * 2.0f);
        this.J.setTextSize(this.G);
        float f2 = this.s;
        float f3 = this.t;
        if (this.C && this.D != null) {
            z = true;
        }
        float f4 = this.F;
        if (f4 != 1.0f) {
            canvas.scale(f4, f4, f2, f3);
        }
        if (z) {
            canvas.drawBitmap(this.D, f2, f3, this.E);
            canvas.restoreToCount(iSave);
            return;
        }
        if (c0()) {
            k(canvas, lineLeft, f3);
        } else {
            canvas.translate(f2, f3);
            this.X.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    public final void k(Canvas canvas, float f2, float f3) {
        int alpha = this.J.getAlpha();
        canvas.translate(f2, f3);
        float f4 = alpha;
        this.J.setAlpha((int) (this.Z * f4));
        this.X.draw(canvas);
        this.J.setAlpha((int) (this.Y * f4));
        int lineBaseline = this.X.getLineBaseline(0);
        CharSequence charSequence = this.b0;
        float f5 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, this.J);
        String strTrim = this.b0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.J.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.X.getLineEnd(0), str.length()), 0.0f, f5, (Paint) this.J);
    }

    public final void l() {
        if (this.D != null || this.f14722f.isEmpty() || TextUtils.isEmpty(this.A)) {
            return;
        }
        f(0.0f);
        int width = this.X.getWidth();
        int height = this.X.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.D = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.X.draw(new Canvas(this.D));
        if (this.E == null) {
            this.E = new Paint(3);
        }
    }

    public void m(RectF rectF, int i2, int i3) {
        this.B = e(this.z);
        rectF.left = p(i2, i3);
        rectF.top = this.f14723g.top;
        rectF.right = q(rectF, i2, i3);
        rectF.bottom = this.f14723g.top + o();
    }

    public ColorStateList n() {
        return this.f14730n;
    }

    public float o() {
        w(this.K);
        return -this.K.ascent();
    }

    public final float p(int i2, int i3) {
        return (i3 == 17 || (i3 & 7) == 1) ? (i2 / 2.0f) - (c() / 2.0f) : ((i3 & 8388613) == 8388613 || (i3 & 5) == 5) ? this.B ? this.f14723g.left : this.f14723g.right - c() : this.B ? this.f14723g.right - c() : this.f14723g.left;
    }

    public final float q(RectF rectF, int i2, int i3) {
        return (i3 == 17 || (i3 & 7) == 1) ? (i2 / 2.0f) + (c() / 2.0f) : ((i3 & 8388613) == 8388613 || (i3 & 5) == 5) ? this.B ? rectF.left + c() : this.f14723g.right : this.B ? this.f14723g.right : rectF.left + c();
    }

    public int r() {
        return s(this.f14730n);
    }

    public final int s(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.H;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final int t() {
        return s(this.f14729m);
    }

    public float u() {
        x(this.K);
        return -this.K.ascent();
    }

    public float v() {
        return this.f14721e;
    }

    public final void w(TextPaint textPaint) {
        textPaint.setTextSize(this.f14728l);
        textPaint.setTypeface(this.u);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.V);
        }
    }

    public final void x(TextPaint textPaint) {
        textPaint.setTextSize(this.f14727k);
        textPaint.setTypeface(this.v);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.W);
        }
    }

    public final void y(float f2) {
        this.f14724h.left = C(this.f14722f.left, this.f14723g.left, f2, this.L);
        this.f14724h.top = C(this.f14731o, this.p, f2, this.L);
        this.f14724h.right = C(this.f14722f.right, this.f14723g.right, f2, this.L);
        this.f14724h.bottom = C(this.f14722f.bottom, this.f14723g.bottom, f2, this.L);
    }
}
