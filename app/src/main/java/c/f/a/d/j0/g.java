package c.f.a.d.j0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import c.f.a.d.j0.k;
import c.f.a.d.j0.l;
import c.f.a.d.j0.m;
import java.util.BitSet;

/* JADX INFO: loaded from: classes2.dex */
public class g extends Drawable implements a.i.j.l.b, n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f14889b = g.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Paint f14890c = new Paint(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f14891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m.g[] f14892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m.g[] f14893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BitSet f14894g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Matrix f14896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f14897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f14898k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f14899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RectF f14900m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Region f14901n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Region f14902o;
    public k p;
    public final Paint q;
    public final Paint r;
    public final c.f.a.d.i0.a s;
    public final l.b t;
    public final l u;
    public PorterDuffColorFilter v;
    public PorterDuffColorFilter w;
    public final RectF x;
    public boolean y;

    public class a implements l.b {
        public a() {
        }

        @Override // c.f.a.d.j0.l.b
        public void a(m mVar, Matrix matrix, int i2) {
            g.this.f14894g.set(i2, mVar.e());
            g.this.f14892e[i2] = mVar.f(matrix);
        }

        @Override // c.f.a.d.j0.l.b
        public void b(m mVar, Matrix matrix, int i2) {
            g.this.f14894g.set(i2 + 4, mVar.e());
            g.this.f14893f[i2] = mVar.f(matrix);
        }
    }

    public class b implements k.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f14904a;

        public b(float f2) {
            this.f14904a = f2;
        }

        @Override // c.f.a.d.j0.k.c
        public c.f.a.d.j0.c a(c.f.a.d.j0.c cVar) {
            return cVar instanceof i ? cVar : new c.f.a.d.j0.b(this.f14904a, cVar);
        }
    }

    public static final class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k f14906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.f.a.d.a0.a f14907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorFilter f14908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ColorStateList f14909d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ColorStateList f14910e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ColorStateList f14911f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ColorStateList f14912g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f14913h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Rect f14914i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f14915j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f14916k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f14917l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f14918m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f14919n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f14920o;
        public float p;
        public int q;
        public int r;
        public int s;
        public int t;
        public boolean u;
        public Paint.Style v;

        public c(c cVar) {
            this.f14909d = null;
            this.f14910e = null;
            this.f14911f = null;
            this.f14912g = null;
            this.f14913h = PorterDuff.Mode.SRC_IN;
            this.f14914i = null;
            this.f14915j = 1.0f;
            this.f14916k = 1.0f;
            this.f14918m = 255;
            this.f14919n = 0.0f;
            this.f14920o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.f14906a = cVar.f14906a;
            this.f14907b = cVar.f14907b;
            this.f14917l = cVar.f14917l;
            this.f14908c = cVar.f14908c;
            this.f14909d = cVar.f14909d;
            this.f14910e = cVar.f14910e;
            this.f14913h = cVar.f14913h;
            this.f14912g = cVar.f14912g;
            this.f14918m = cVar.f14918m;
            this.f14915j = cVar.f14915j;
            this.s = cVar.s;
            this.q = cVar.q;
            this.u = cVar.u;
            this.f14916k = cVar.f14916k;
            this.f14919n = cVar.f14919n;
            this.f14920o = cVar.f14920o;
            this.p = cVar.p;
            this.r = cVar.r;
            this.t = cVar.t;
            this.f14911f = cVar.f14911f;
            this.v = cVar.v;
            if (cVar.f14914i != null) {
                this.f14914i = new Rect(cVar.f14914i);
            }
        }

        public c(k kVar, c.f.a.d.a0.a aVar) {
            this.f14909d = null;
            this.f14910e = null;
            this.f14911f = null;
            this.f14912g = null;
            this.f14913h = PorterDuff.Mode.SRC_IN;
            this.f14914i = null;
            this.f14915j = 1.0f;
            this.f14916k = 1.0f;
            this.f14918m = 255;
            this.f14919n = 0.0f;
            this.f14920o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.f14906a = kVar;
            this.f14907b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this, null);
            gVar.f14895h = true;
            return gVar;
        }
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(k.e(context, attributeSet, i2, i3).m());
    }

    public g(c cVar) {
        this.f14892e = new m.g[4];
        this.f14893f = new m.g[4];
        this.f14894g = new BitSet(8);
        this.f14896i = new Matrix();
        this.f14897j = new Path();
        this.f14898k = new Path();
        this.f14899l = new RectF();
        this.f14900m = new RectF();
        this.f14901n = new Region();
        this.f14902o = new Region();
        Paint paint = new Paint(1);
        this.q = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = new c.f.a.d.i0.a();
        this.u = Looper.getMainLooper().getThread() == Thread.currentThread() ? l.k() : new l();
        this.x = new RectF();
        this.y = true;
        this.f14891d = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f14890c;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        i0();
        h0(getState());
        this.t = new a();
    }

    public /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    public static int R(int i2, int i3) {
        return (i2 * (i3 + (i3 >>> 7))) >>> 8;
    }

    public static g m(Context context, float f2) {
        int iB = c.f.a.d.w.a.b(context, c.f.a.d.b.f14636m, g.class.getSimpleName());
        g gVar = new g();
        gVar.M(context);
        gVar.X(ColorStateList.valueOf(iB));
        gVar.W(f2);
        return gVar;
    }

    public int A() {
        double d2 = this.f14891d.s;
        double dCos = Math.cos(Math.toRadians(r0.t));
        Double.isNaN(d2);
        return (int) (d2 * dCos);
    }

    public int B() {
        return this.f14891d.r;
    }

    public k C() {
        return this.f14891d.f14906a;
    }

    public final float D() {
        if (L()) {
            return this.r.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public ColorStateList E() {
        return this.f14891d.f14912g;
    }

    public float F() {
        return this.f14891d.f14906a.r().a(u());
    }

    public float G() {
        return this.f14891d.f14906a.t().a(u());
    }

    public float H() {
        return this.f14891d.p;
    }

    public float I() {
        return w() + H();
    }

    public final boolean J() {
        c cVar = this.f14891d;
        int i2 = cVar.q;
        return i2 != 1 && cVar.r > 0 && (i2 == 2 || T());
    }

    public final boolean K() {
        Paint.Style style = this.f14891d.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean L() {
        Paint.Style style = this.f14891d.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.r.getStrokeWidth() > 0.0f;
    }

    public void M(Context context) {
        this.f14891d.f14907b = new c.f.a.d.a0.a(context);
        j0();
    }

    public final void N() {
        super.invalidateSelf();
    }

    public boolean O() {
        c.f.a.d.a0.a aVar = this.f14891d.f14907b;
        return aVar != null && aVar.d();
    }

    public boolean P() {
        return this.f14891d.f14906a.u(u());
    }

    public final void Q(Canvas canvas) {
        if (J()) {
            canvas.save();
            S(canvas);
            if (this.y) {
                int iWidth = (int) (this.x.width() - getBounds().width());
                int iHeight = (int) (this.x.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.x.width()) + (this.f14891d.r * 2) + iWidth, ((int) this.x.height()) + (this.f14891d.r * 2) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f2 = (getBounds().left - this.f14891d.r) - iWidth;
                float f3 = (getBounds().top - this.f14891d.r) - iHeight;
                canvas2.translate(-f2, -f3);
                n(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
                bitmapCreateBitmap.recycle();
            } else {
                n(canvas);
            }
            canvas.restore();
        }
    }

    public final void S(Canvas canvas) {
        int iZ = z();
        int iA = A();
        if (Build.VERSION.SDK_INT < 21 && this.y) {
            Rect clipBounds = canvas.getClipBounds();
            int i2 = this.f14891d.r;
            clipBounds.inset(-i2, -i2);
            clipBounds.offset(iZ, iA);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(iZ, iA);
    }

    public boolean T() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 < 21 || !(P() || this.f14897j.isConvex() || i2 >= 29);
    }

    public void U(float f2) {
        setShapeAppearanceModel(this.f14891d.f14906a.w(f2));
    }

    public void V(c.f.a.d.j0.c cVar) {
        setShapeAppearanceModel(this.f14891d.f14906a.x(cVar));
    }

    public void W(float f2) {
        c cVar = this.f14891d;
        if (cVar.f14920o != f2) {
            cVar.f14920o = f2;
            j0();
        }
    }

    public void X(ColorStateList colorStateList) {
        c cVar = this.f14891d;
        if (cVar.f14909d != colorStateList) {
            cVar.f14909d = colorStateList;
            onStateChange(getState());
        }
    }

    public void Y(float f2) {
        c cVar = this.f14891d;
        if (cVar.f14916k != f2) {
            cVar.f14916k = f2;
            this.f14895h = true;
            invalidateSelf();
        }
    }

    public void Z(int i2, int i3, int i4, int i5) {
        c cVar = this.f14891d;
        if (cVar.f14914i == null) {
            cVar.f14914i = new Rect();
        }
        this.f14891d.f14914i.set(i2, i3, i4, i5);
        invalidateSelf();
    }

    public void a0(float f2) {
        c cVar = this.f14891d;
        if (cVar.f14919n != f2) {
            cVar.f14919n = f2;
            j0();
        }
    }

    public void b0(int i2) {
        this.s.d(i2);
        this.f14891d.u = false;
        N();
    }

    public void c0(int i2) {
        c cVar = this.f14891d;
        if (cVar.t != i2) {
            cVar.t = i2;
            N();
        }
    }

    public void d0(float f2, int i2) {
        g0(f2);
        f0(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.q.setColorFilter(this.v);
        int alpha = this.q.getAlpha();
        this.q.setAlpha(R(alpha, this.f14891d.f14918m));
        this.r.setColorFilter(this.w);
        this.r.setStrokeWidth(this.f14891d.f14917l);
        int alpha2 = this.r.getAlpha();
        this.r.setAlpha(R(alpha2, this.f14891d.f14918m));
        if (this.f14895h) {
            i();
            g(u(), this.f14897j);
            this.f14895h = false;
        }
        Q(canvas);
        if (K()) {
            o(canvas);
        }
        if (L()) {
            r(canvas);
        }
        this.q.setAlpha(alpha);
        this.r.setAlpha(alpha2);
    }

    public void e0(float f2, ColorStateList colorStateList) {
        g0(f2);
        f0(colorStateList);
    }

    public final PorterDuffColorFilter f(Paint paint, boolean z) {
        int color;
        int iL;
        if (!z || (iL = l((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
    }

    public void f0(ColorStateList colorStateList) {
        c cVar = this.f14891d;
        if (cVar.f14910e != colorStateList) {
            cVar.f14910e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f14891d.f14915j != 1.0f) {
            this.f14896i.reset();
            Matrix matrix = this.f14896i;
            float f2 = this.f14891d.f14915j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f14896i);
        }
        path.computeBounds(this.x, true);
    }

    public void g0(float f2) {
        this.f14891d.f14917l = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f14891d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f14891d.q == 2) {
            return;
        }
        if (P()) {
            outline.setRoundRect(getBounds(), F() * this.f14891d.f14916k);
            return;
        }
        g(u(), this.f14897j);
        if (this.f14897j.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.f14897j);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f14891d.f14914i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f14901n.set(getBounds());
        g(u(), this.f14897j);
        this.f14902o.setPath(this.f14897j, this.f14901n);
        this.f14901n.op(this.f14902o, Region.Op.DIFFERENCE);
        return this.f14901n;
    }

    public final void h(RectF rectF, Path path) {
        l lVar = this.u;
        c cVar = this.f14891d;
        lVar.e(cVar.f14906a, cVar.f14916k, rectF, this.t, path);
    }

    public final boolean h0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f14891d.f14909d == null || color2 == (colorForState2 = this.f14891d.f14909d.getColorForState(iArr, (color2 = this.q.getColor())))) {
            z = false;
        } else {
            this.q.setColor(colorForState2);
            z = true;
        }
        if (this.f14891d.f14910e == null || color == (colorForState = this.f14891d.f14910e.getColorForState(iArr, (color = this.r.getColor())))) {
            return z;
        }
        this.r.setColor(colorForState);
        return true;
    }

    public final void i() {
        k kVarY = C().y(new b(-D()));
        this.p = kVarY;
        this.u.d(kVarY, this.f14891d.f14916k, v(), this.f14898k);
    }

    public final boolean i0() {
        PorterDuffColorFilter porterDuffColorFilter = this.v;
        PorterDuffColorFilter porterDuffColorFilter2 = this.w;
        c cVar = this.f14891d;
        this.v = k(cVar.f14912g, cVar.f14913h, this.q, true);
        c cVar2 = this.f14891d;
        this.w = k(cVar2.f14911f, cVar2.f14913h, this.r, false);
        c cVar3 = this.f14891d;
        if (cVar3.u) {
            this.s.d(cVar3.f14912g.getColorForState(getState(), 0));
        }
        return (a.i.q.d.a(porterDuffColorFilter, this.v) && a.i.q.d.a(porterDuffColorFilter2, this.w)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f14895h = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f14891d.f14912g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f14891d.f14911f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f14891d.f14910e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f14891d.f14909d) != null && colorStateList4.isStateful())));
    }

    public final PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final void j0() {
        float fI = I();
        this.f14891d.r = (int) Math.ceil(0.75f * fI);
        this.f14891d.s = (int) Math.ceil(fI * 0.25f);
        i0();
        N();
    }

    public final PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? f(paint, z) : j(colorStateList, mode, z);
    }

    public int l(int i2) {
        float fI = I() + y();
        c.f.a.d.a0.a aVar = this.f14891d.f14907b;
        return aVar != null ? aVar.c(i2, fI) : i2;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f14891d = new c(this.f14891d);
        return this;
    }

    public final void n(Canvas canvas) {
        if (this.f14894g.cardinality() > 0) {
            Log.w(f14889b, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f14891d.s != 0) {
            canvas.drawPath(this.f14897j, this.s.c());
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.f14892e[i2].b(this.s, this.f14891d.r, canvas);
            this.f14893f[i2].b(this.s, this.f14891d.r, canvas);
        }
        if (this.y) {
            int iZ = z();
            int iA = A();
            canvas.translate(-iZ, -iA);
            canvas.drawPath(this.f14897j, f14890c);
            canvas.translate(iZ, iA);
        }
    }

    public final void o(Canvas canvas) {
        q(canvas, this.q, this.f14897j, this.f14891d.f14906a, u());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f14895h = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = h0(iArr) || i0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f14891d.f14906a, rectF);
    }

    public final void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.t().a(rectF) * this.f14891d.f14916k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public final void r(Canvas canvas) {
        q(canvas, this.r, this.f14898k, this.p, v());
    }

    public float s() {
        return this.f14891d.f14906a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        c cVar = this.f14891d;
        if (cVar.f14918m != i2) {
            cVar.f14918m = i2;
            N();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f14891d.f14908c = colorFilter;
        N();
    }

    @Override // c.f.a.d.j0.n
    public void setShapeAppearanceModel(k kVar) {
        this.f14891d.f14906a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, a.i.j.l.b
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable, a.i.j.l.b
    public void setTintList(ColorStateList colorStateList) {
        this.f14891d.f14912g = colorStateList;
        i0();
        N();
    }

    @Override // android.graphics.drawable.Drawable, a.i.j.l.b
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f14891d;
        if (cVar.f14913h != mode) {
            cVar.f14913h = mode;
            i0();
            N();
        }
    }

    public float t() {
        return this.f14891d.f14906a.l().a(u());
    }

    public RectF u() {
        this.f14899l.set(getBounds());
        return this.f14899l;
    }

    public final RectF v() {
        this.f14900m.set(u());
        float fD = D();
        this.f14900m.inset(fD, fD);
        return this.f14900m;
    }

    public float w() {
        return this.f14891d.f14920o;
    }

    public ColorStateList x() {
        return this.f14891d.f14909d;
    }

    public float y() {
        return this.f14891d.f14919n;
    }

    public int z() {
        double d2 = this.f14891d.s;
        double dSin = Math.sin(Math.toRadians(r0.t));
        Double.isNaN(d2);
        return (int) (d2 * dSin);
    }
}
