package a.b.m.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f281e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f283g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f289m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f282f = 255;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f284h = -1;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: a.b.m.a.b$b, reason: collision with other inner class name */
    public static class C0006b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    public static class c implements Drawable.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Drawable.Callback f291b;

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f291b;
            this.f291b = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f291b = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.f291b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f291b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    public static abstract class d extends Drawable.ConstantState {
        public int A;
        public int B;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Resources f293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f294c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f295d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f297f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Drawable[] f298g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f299h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f300i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f301j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Rect f302k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f303l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f304m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f305n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f306o;
        public int p;
        public int q;
        public boolean r;
        public int s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x;
        public boolean y;
        public int z;

        public d(d dVar, b bVar, Resources resources) {
            this.f300i = false;
            this.f303l = false;
            this.x = true;
            this.A = 0;
            this.B = 0;
            this.f292a = bVar;
            this.f293b = resources != null ? resources : dVar != null ? dVar.f293b : null;
            int iF = b.f(resources, dVar != null ? dVar.f294c : 0);
            this.f294c = iF;
            if (dVar == null) {
                this.f298g = new Drawable[10];
                this.f299h = 0;
                return;
            }
            this.f295d = dVar.f295d;
            this.f296e = dVar.f296e;
            this.v = true;
            this.w = true;
            this.f300i = dVar.f300i;
            this.f303l = dVar.f303l;
            this.x = dVar.x;
            this.y = dVar.y;
            this.z = dVar.z;
            this.A = dVar.A;
            this.B = dVar.B;
            this.C = dVar.C;
            this.D = dVar.D;
            this.E = dVar.E;
            this.F = dVar.F;
            this.G = dVar.G;
            this.H = dVar.H;
            this.I = dVar.I;
            if (dVar.f294c == iF) {
                if (dVar.f301j) {
                    this.f302k = dVar.f302k != null ? new Rect(dVar.f302k) : null;
                    this.f301j = true;
                }
                if (dVar.f304m) {
                    this.f305n = dVar.f305n;
                    this.f306o = dVar.f306o;
                    this.p = dVar.p;
                    this.q = dVar.q;
                    this.f304m = true;
                }
            }
            if (dVar.r) {
                this.s = dVar.s;
                this.r = true;
            }
            if (dVar.t) {
                this.u = dVar.u;
                this.t = true;
            }
            Drawable[] drawableArr = dVar.f298g;
            this.f298g = new Drawable[drawableArr.length];
            this.f299h = dVar.f299h;
            SparseArray<Drawable.ConstantState> sparseArray = dVar.f297f;
            this.f297f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f299h);
            int i2 = this.f299h;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3] != null) {
                    Drawable.ConstantState constantState = drawableArr[i3].getConstantState();
                    if (constantState != null) {
                        this.f297f.put(i3, constantState);
                    } else {
                        this.f298g[i3] = drawableArr[i3];
                    }
                }
            }
        }

        public final int a(Drawable drawable) {
            int i2 = this.f299h;
            if (i2 >= this.f298g.length) {
                o(i2, i2 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f292a);
            this.f298g[i2] = drawable;
            this.f299h++;
            this.f296e = drawable.getChangingConfigurations() | this.f296e;
            p();
            this.f302k = null;
            this.f301j = false;
            this.f304m = false;
            this.v = false;
            return i2;
        }

        public final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i2 = this.f299h;
                Drawable[] drawableArr = this.f298g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null && a.i.j.l.a.b(drawableArr[i3])) {
                        a.i.j.l.a.a(drawableArr[i3], theme);
                        this.f296e |= drawableArr[i3].getChangingConfigurations();
                    }
                }
                y(C0006b.c(theme));
            }
        }

        public boolean c() {
            if (this.v) {
                return this.w;
            }
            e();
            this.v = true;
            int i2 = this.f299h;
            Drawable[] drawableArr = this.f298g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i2 = this.f299h;
            Drawable[] drawableArr = this.f298g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f297f.get(i3);
                    if (constantState != null && C0006b.a(constantState)) {
                        return true;
                    }
                } else if (a.i.j.l.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public void d() {
            this.f304m = true;
            e();
            int i2 = this.f299h;
            Drawable[] drawableArr = this.f298g;
            this.f306o = -1;
            this.f305n = -1;
            this.q = 0;
            this.p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f305n) {
                    this.f305n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f306o) {
                    this.f306o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.p) {
                    this.p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.q) {
                    this.q = minimumHeight;
                }
            }
        }

        public final void e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f297f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f298g[this.f297f.keyAt(i2)] = s(this.f297f.valueAt(i2).newDrawable(this.f293b));
                }
                this.f297f = null;
            }
        }

        public final int f() {
            return this.f298g.length;
        }

        public final Drawable g(int i2) {
            int iIndexOfKey;
            Drawable drawable = this.f298g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f297f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable drawableS = s(this.f297f.valueAt(iIndexOfKey).newDrawable(this.f293b));
            this.f298g[i2] = drawableS;
            this.f297f.removeAt(iIndexOfKey);
            if (this.f297f.size() == 0) {
                this.f297f = null;
            }
            return drawableS;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f295d | this.f296e;
        }

        public final int h() {
            return this.f299h;
        }

        public final int i() {
            if (!this.f304m) {
                d();
            }
            return this.f306o;
        }

        public final int j() {
            if (!this.f304m) {
                d();
            }
            return this.q;
        }

        public final int k() {
            if (!this.f304m) {
                d();
            }
            return this.p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f300i) {
                return null;
            }
            Rect rect2 = this.f302k;
            if (rect2 != null || this.f301j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i2 = this.f299h;
            Drawable[] drawableArr = this.f298g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i4 = rect3.left;
                    if (i4 > rect.left) {
                        rect.left = i4;
                    }
                    int i5 = rect3.top;
                    if (i5 > rect.top) {
                        rect.top = i5;
                    }
                    int i6 = rect3.right;
                    if (i6 > rect.right) {
                        rect.right = i6;
                    }
                    int i7 = rect3.bottom;
                    if (i7 > rect.bottom) {
                        rect.bottom = i7;
                    }
                }
            }
            this.f301j = true;
            this.f302k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f304m) {
                d();
            }
            return this.f305n;
        }

        public final int n() {
            if (this.r) {
                return this.s;
            }
            e();
            int i2 = this.f299h;
            Drawable[] drawableArr = this.f298g;
            int opacity = i2 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i3 = 1; i3 < i2; i3++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i3].getOpacity());
            }
            this.s = opacity;
            this.r = true;
            return opacity;
        }

        public void o(int i2, int i3) {
            Drawable[] drawableArr = new Drawable[i3];
            Drawable[] drawableArr2 = this.f298g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
            }
            this.f298g = drawableArr;
        }

        public void p() {
            this.r = false;
            this.t = false;
        }

        public final boolean q() {
            return this.f303l;
        }

        public abstract void r();

        public final Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                a.i.j.l.a.m(drawable, this.z);
            }
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f292a);
            return drawableMutate;
        }

        public final void t(boolean z) {
            this.f303l = z;
        }

        public final void u(int i2) {
            this.A = i2;
        }

        public final void v(int i2) {
            this.B = i2;
        }

        public final boolean w(int i2, int i3) {
            int i4 = this.f299h;
            Drawable[] drawableArr = this.f298g;
            boolean z = false;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5] != null) {
                    boolean zM = Build.VERSION.SDK_INT >= 23 ? a.i.j.l.a.m(drawableArr[i5], i2) : false;
                    if (i5 == i3) {
                        z = zM;
                    }
                }
            }
            this.z = i2;
            return z;
        }

        public final void x(boolean z) {
            this.f300i = z;
        }

        public final void y(Resources resources) {
            if (resources != null) {
                this.f293b = resources;
                int iF = b.f(resources, this.f294c);
                int i2 = this.f294c;
                this.f294c = iF;
                if (i2 != iF) {
                    this.f304m = false;
                    this.f301j = false;
                }
            }
        }
    }

    public static int f(Resources resources, int i2) {
        if (resources != null) {
            i2 = resources.getDisplayMetrics().densityDpi;
        }
        if (i2 == 0) {
            return 160;
        }
        return i2;
    }

    public void a(boolean z) {
        boolean z2;
        boolean z3 = true;
        this.f283g = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable = this.f280d;
        if (drawable != null) {
            long j2 = this.f287k;
            if (j2 == 0) {
                z2 = false;
            } else if (j2 <= jUptimeMillis) {
                drawable.setAlpha(this.f282f);
                this.f287k = 0L;
                z2 = false;
            } else {
                drawable.setAlpha(((255 - (((int) ((j2 - jUptimeMillis) * 255)) / this.f278b.A)) * this.f282f) / 255);
                z2 = true;
            }
        } else {
            this.f287k = 0L;
            z2 = false;
        }
        Drawable drawable2 = this.f281e;
        if (drawable2 != null) {
            long j3 = this.f288l;
            if (j3 == 0) {
                z3 = z2;
            } else if (j3 <= jUptimeMillis) {
                drawable2.setVisible(false, false);
                this.f281e = null;
                this.f288l = 0L;
                z3 = z2;
            } else {
                drawable2.setAlpha(((((int) ((j3 - jUptimeMillis) * 255)) / this.f278b.B) * this.f282f) / 255);
            }
        } else {
            this.f288l = 0L;
            z3 = z2;
        }
        if (z && z3) {
            scheduleSelf(this.f286j, jUptimeMillis + 16);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f278b.b(theme);
    }

    public d b() {
        throw null;
    }

    public int c() {
        return this.f284h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f278b.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f289m == null) {
            this.f289m = new c();
        }
        drawable.setCallback(this.f289m.b(drawable.getCallback()));
        try {
            if (this.f278b.A <= 0 && this.f283g) {
                drawable.setAlpha(this.f282f);
            }
            d dVar = this.f278b;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    a.i.j.l.a.o(drawable, dVar.F);
                }
                d dVar2 = this.f278b;
                if (dVar2.I) {
                    a.i.j.l.a.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f278b.x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                a.i.j.l.a.m(drawable, a.i.j.l.a.f(this));
            }
            if (i2 >= 19) {
                a.i.j.l.a.j(drawable, this.f278b.C);
            }
            Rect rect = this.f279c;
            if (i2 >= 21 && rect != null) {
                a.i.j.l.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f289m.a());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f280d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f281e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final boolean e() {
        return isAutoMirrored() && a.i.j.l.a.f(this) == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f284h
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            a.b.m.a.b$d r0 = r9.f278b
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f281e
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f280d
            if (r0 == 0) goto L29
            r9.f281e = r0
            a.b.m.a.b$d r0 = r9.f278b
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f288l = r0
            goto L35
        L29:
            r9.f281e = r4
            r9.f288l = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f280d
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            a.b.m.a.b$d r0 = r9.f278b
            int r1 = r0.f299h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f280d = r0
            r9.f284h = r10
            if (r0 == 0) goto L5a
            a.b.m.a.b$d r10 = r9.f278b
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f287k = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f280d = r4
            r10 = -1
            r9.f284h = r10
        L5a:
            long r0 = r9.f287k
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f288l
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f286j
            if (r0 != 0) goto L73
            a.b.m.a.b$a r0 = new a.b.m.a.b$a
            r0.<init>()
            r9.f286j = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.m.a.b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f282f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f278b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f278b.c()) {
            return null;
        }
        this.f278b.f295d = getChangingConfigurations();
        return this.f278b;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f280d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f279c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f278b.q()) {
            return this.f278b.i();
        }
        Drawable drawable = this.f280d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f278b.q()) {
            return this.f278b.m();
        }
        Drawable drawable = this.f280d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f278b.q()) {
            return this.f278b.j();
        }
        Drawable drawable = this.f280d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f278b.q()) {
            return this.f278b.k();
        }
        Drawable drawable = this.f280d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f280d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f278b.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f280d;
        if (drawable != null) {
            C0006b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect rectL = this.f278b.l();
        if (rectL != null) {
            rect.set(rectL);
            padding = (rectL.right | ((rectL.left | rectL.top) | rectL.bottom)) != 0;
        } else {
            Drawable drawable = this.f280d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i2 = rect.left;
            rect.left = rect.right;
            rect.right = i2;
        }
        return padding;
    }

    public void h(d dVar) {
        this.f278b = dVar;
        int i2 = this.f284h;
        if (i2 >= 0) {
            Drawable drawableG = dVar.g(i2);
            this.f280d = drawableG;
            if (drawableG != null) {
                d(drawableG);
            }
        }
        this.f281e = null;
    }

    public final void i(Resources resources) {
        this.f278b.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f278b;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable != this.f280d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f278b.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f281e;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f281e = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f280d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f283g) {
                this.f280d.setAlpha(this.f282f);
            }
        }
        if (this.f288l != 0) {
            this.f288l = 0L;
            z = true;
        }
        if (this.f287k != 0) {
            this.f287k = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f285i && super.mutate() == this) {
            d dVarB = b();
            dVarB.r();
            h(dVarB);
            this.f285i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f281e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f280d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        return this.f278b.w(i2, c());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f281e;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f280d;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f281e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f280d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable != this.f280d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.f283g && this.f282f == i2) {
            return;
        }
        this.f283g = true;
        this.f282f = i2;
        Drawable drawable = this.f280d;
        if (drawable != null) {
            if (this.f287k == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        d dVar = this.f278b;
        if (dVar.C != z) {
            dVar.C = z;
            Drawable drawable = this.f280d;
            if (drawable != null) {
                a.i.j.l.a.j(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f278b;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f280d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        d dVar = this.f278b;
        if (dVar.x != z) {
            dVar.x = z;
            Drawable drawable = this.f280d;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f280d;
        if (drawable != null) {
            a.i.j.l.a.k(drawable, f2, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f279c;
        if (rect == null) {
            this.f279c = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f280d;
        if (drawable != null) {
            a.i.j.l.a.l(drawable, i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable, a.i.j.l.b
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f278b;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            a.i.j.l.a.o(this.f280d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, a.i.j.l.b
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f278b;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            a.i.j.l.a.p(this.f280d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f281e;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f280d;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f280d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
