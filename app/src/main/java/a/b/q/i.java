package a.b.q;

import a.b.q.k0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PorterDuff.Mode f651a = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static i f652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k0 f653c;

    public class a implements k0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f654a = {a.b.e.R, a.b.e.P, a.b.e.f56a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f655b = {a.b.e.f70o, a.b.e.B, a.b.e.t, a.b.e.p, a.b.e.q, a.b.e.s, a.b.e.r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f656c = {a.b.e.O, a.b.e.Q, a.b.e.f66k, a.b.e.K, a.b.e.L, a.b.e.M, a.b.e.N};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f657d = {a.b.e.w, a.b.e.f64i, a.b.e.v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f658e = {a.b.e.J, a.b.e.S};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f659f = {a.b.e.f58c, a.b.e.f62g, a.b.e.f59d, a.b.e.f63h};

        /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[RETURN] */
        @Override // a.b.q.k0.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = a.b.q.i.a()
                int[] r1 = r6.f654a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L17
                int r2 = a.b.a.w
            L14:
                r8 = -1
            L15:
                r1 = 1
                goto L44
            L17:
                int[] r1 = r6.f656c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L22
                int r2 = a.b.a.u
                goto L14
            L22:
                int[] r1 = r6.f657d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L2d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L14
            L2d:
                int r1 = a.b.e.u
                if (r8 != r1) goto L3c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L15
            L3c:
                int r1 = a.b.e.f67l
                if (r8 != r1) goto L41
                goto L14
            L41:
                r8 = -1
                r1 = 0
                r2 = 0
            L44:
                if (r1 == 0) goto L61
                boolean r1 = a.b.q.b0.a(r9)
                if (r1 == 0) goto L50
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L50:
                int r7 = a.b.q.p0.c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = a.b.q.i.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L60
                r9.setAlpha(r8)
            L60:
                return r5
            L61:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.q.i.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // a.b.q.k0.f
        public PorterDuff.Mode b(int i2) {
            if (i2 == a.b.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // a.b.q.k0.f
        public Drawable c(k0 k0Var, Context context, int i2) {
            int i3;
            if (i2 == a.b.e.f65j) {
                return new LayerDrawable(new Drawable[]{k0Var.j(context, a.b.e.f64i), k0Var.j(context, a.b.e.f66k)});
            }
            if (i2 == a.b.e.y) {
                i3 = a.b.d.f49i;
            } else if (i2 == a.b.e.x) {
                i3 = a.b.d.f50j;
            } else {
                if (i2 != a.b.e.z) {
                    return null;
                }
                i3 = a.b.d.f51k;
            }
            return l(k0Var, context, i3);
        }

        @Override // a.b.q.k0.f
        public ColorStateList d(Context context, int i2) {
            if (i2 == a.b.e.f68m) {
                return a.b.l.a.a.c(context, a.b.c.f37e);
            }
            if (i2 == a.b.e.I) {
                return a.b.l.a.a.c(context, a.b.c.f40h);
            }
            if (i2 == a.b.e.H) {
                return k(context);
            }
            if (i2 == a.b.e.f61f) {
                return j(context);
            }
            if (i2 == a.b.e.f57b) {
                return g(context);
            }
            if (i2 == a.b.e.f60e) {
                return i(context);
            }
            if (i2 == a.b.e.D || i2 == a.b.e.E) {
                return a.b.l.a.a.c(context, a.b.c.f39g);
            }
            if (f(this.f655b, i2)) {
                return p0.e(context, a.b.a.w);
            }
            if (f(this.f658e, i2)) {
                return a.b.l.a.a.c(context, a.b.c.f36d);
            }
            if (f(this.f659f, i2)) {
                return a.b.l.a.a.c(context, a.b.c.f35c);
            }
            if (i2 == a.b.e.A) {
                return a.b.l.a.a.c(context, a.b.c.f38f);
            }
            return null;
        }

        @Override // a.b.q.k0.f
        public boolean e(Context context, int i2, Drawable drawable) {
            Drawable drawableFindDrawableByLayerId;
            int iC;
            if (i2 == a.b.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.background);
                int i3 = a.b.a.w;
                m(drawableFindDrawableByLayerId2, p0.c(context, i3), i.f651a);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), p0.c(context, i3), i.f651a);
                drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
                iC = p0.c(context, a.b.a.u);
            } else {
                if (i2 != a.b.e.y && i2 != a.b.e.x && i2 != a.b.e.z) {
                    return false;
                }
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(R.id.background), p0.b(context, a.b.a.w), i.f651a);
                Drawable drawableFindDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
                int i4 = a.b.a.u;
                m(drawableFindDrawableByLayerId3, p0.c(context, i4), i.f651a);
                drawableFindDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.progress);
                iC = p0.c(context, i4);
            }
            m(drawableFindDrawableByLayerId, iC, i.f651a);
            return true;
        }

        public final boolean f(int[] iArr, int i2) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(Context context, int i2) {
            int iC = p0.c(context, a.b.a.v);
            return new ColorStateList(new int[][]{p0.f734b, p0.f737e, p0.f735c, p0.f741i}, new int[]{p0.b(context, a.b.a.t), a.i.j.a.i(iC, i2), a.i.j.a.i(iC, i2), i2});
        }

        public final ColorStateList i(Context context) {
            return h(context, p0.c(context, a.b.a.s));
        }

        public final ColorStateList j(Context context) {
            return h(context, p0.c(context, a.b.a.t));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i2 = a.b.a.z;
            ColorStateList colorStateListE = p0.e(context, i2);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = p0.f734b;
                iArr2[0] = p0.b(context, i2);
                iArr[1] = p0.f738f;
                iArr2[1] = p0.c(context, a.b.a.u);
                iArr[2] = p0.f741i;
                iArr2[2] = p0.c(context, i2);
            } else {
                iArr[0] = p0.f734b;
                iArr2[0] = colorStateListE.getColorForState(iArr[0], 0);
                iArr[1] = p0.f738f;
                iArr2[1] = p0.c(context, a.b.a.u);
                iArr[2] = p0.f741i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(k0 k0Var, Context context, int i2) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
            Drawable drawableJ = k0Var.j(context, a.b.e.F);
            Drawable drawableJ2 = k0Var.j(context, a.b.e.G);
            if ((drawableJ instanceof BitmapDrawable) && drawableJ.getIntrinsicWidth() == dimensionPixelSize && drawableJ.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableJ;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableJ.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableJ2 instanceof BitmapDrawable) && drawableJ2.getIntrinsicWidth() == dimensionPixelSize && drawableJ2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableJ2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableJ2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        public final void m(Drawable drawable, int i2, PorterDuff.Mode mode) {
            if (b0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = i.f651a;
            }
            drawable.setColorFilter(i.e(i2, mode));
        }
    }

    public static synchronized i b() {
        if (f652b == null) {
            h();
        }
        return f652b;
    }

    public static synchronized PorterDuffColorFilter e(int i2, PorterDuff.Mode mode) {
        return k0.l(i2, mode);
    }

    public static synchronized void h() {
        if (f652b == null) {
            i iVar = new i();
            f652b = iVar;
            iVar.f653c = k0.h();
            f652b.f653c.u(new a());
        }
    }

    public static void i(Drawable drawable, s0 s0Var, int[] iArr) {
        k0.w(drawable, s0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i2) {
        return this.f653c.j(context, i2);
    }

    public synchronized Drawable d(Context context, int i2, boolean z) {
        return this.f653c.k(context, i2, z);
    }

    public synchronized ColorStateList f(Context context, int i2) {
        return this.f653c.m(context, i2);
    }

    public synchronized void g(Context context) {
        this.f653c.s(context);
    }
}
