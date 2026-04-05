package c.f.a.b.h3;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import c.f.a.b.h3.e1;
import com.amazonaws.event.ProgressEvent;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public class i0 extends View implements e1 {
    public final float A;
    public int B;
    public long C;
    public int D;
    public Rect E;
    public ValueAnimator F;
    public float G;
    public boolean H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public long M;
    public int N;
    public long[] O;
    public boolean[] P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f8688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f8689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f8690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f8691e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f8692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f8693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f8694h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f8695i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f8696j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Paint f8697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Drawable f8698l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f8699m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f8700n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f8701o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final StringBuilder v;
    public final Formatter w;
    public final Runnable x;
    public final CopyOnWriteArraySet<e1.a> y;
    public final Point z;

    public i0(Context context, AttributeSet attributeSet, int i2, AttributeSet attributeSet2) {
        this(context, attributeSet, i2, attributeSet2, 0);
    }

    public i0(Context context, AttributeSet attributeSet, int i2, AttributeSet attributeSet2, int i3) {
        int i4;
        int iMax;
        super(context, attributeSet, i2);
        this.f8688b = new Rect();
        this.f8689c = new Rect();
        this.f8690d = new Rect();
        this.f8691e = new Rect();
        Paint paint = new Paint();
        this.f8692f = paint;
        Paint paint2 = new Paint();
        this.f8693g = paint2;
        Paint paint3 = new Paint();
        this.f8694h = paint3;
        Paint paint4 = new Paint();
        this.f8695i = paint4;
        Paint paint5 = new Paint();
        this.f8696j = paint5;
        Paint paint6 = new Paint();
        this.f8697k = paint6;
        paint6.setAntiAlias(true);
        this.y = new CopyOnWriteArraySet<>();
        this.z = new Point();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.A = f2;
        this.u = c(f2, -50);
        int iC = c(f2, 4);
        int iC2 = c(f2, 26);
        int iC3 = c(f2, 4);
        int iC4 = c(f2, 12);
        int iC5 = c(f2, 0);
        int iC6 = c(f2, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, y0.f8805d, i2, i3);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(y0.f8816o);
                this.f8698l = drawable;
                if (drawable != null) {
                    q(drawable);
                    iC2 = Math.max(drawable.getMinimumHeight(), iC2);
                }
                this.f8699m = typedArrayObtainStyledAttributes.getDimensionPixelSize(y0.f8809h, iC);
                this.f8700n = typedArrayObtainStyledAttributes.getDimensionPixelSize(y0.q, iC2);
                this.f8701o = typedArrayObtainStyledAttributes.getInt(y0.f8808g, 0);
                this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(y0.f8807f, iC3);
                this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(y0.p, iC4);
                this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(y0.f8814m, iC5);
                this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(y0.f8815n, iC6);
                int i5 = typedArrayObtainStyledAttributes.getInt(y0.f8812k, -1);
                int i6 = typedArrayObtainStyledAttributes.getInt(y0.f8813l, -1);
                int i7 = typedArrayObtainStyledAttributes.getInt(y0.f8810i, -855638017);
                int i8 = typedArrayObtainStyledAttributes.getInt(y0.r, 872415231);
                int i9 = typedArrayObtainStyledAttributes.getInt(y0.f8806e, -1291845888);
                int i10 = typedArrayObtainStyledAttributes.getInt(y0.f8811j, 872414976);
                paint.setColor(i5);
                paint6.setColor(i6);
                paint2.setColor(i7);
                paint3.setColor(i8);
                paint4.setColor(i9);
                paint5.setColor(i10);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } else {
            this.f8699m = iC;
            this.f8700n = iC2;
            this.f8701o = 0;
            this.p = iC3;
            this.q = iC4;
            this.r = iC5;
            this.s = iC6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f8698l = null;
        }
        StringBuilder sb = new StringBuilder();
        this.v = sb;
        this.w = new Formatter(sb, Locale.getDefault());
        this.x = new Runnable() { // from class: c.f.a.b.h3.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f8607b.j();
            }
        };
        Drawable drawable2 = this.f8698l;
        if (drawable2 != null) {
            iMax = drawable2.getMinimumWidth();
            i4 = 1;
        } else {
            i4 = 1;
            iMax = Math.max(this.r, Math.max(this.q, this.s));
        }
        this.t = (iMax + i4) / 2;
        this.G = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.F = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: c.f.a.b.h3.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f8636b.l(valueAnimator2);
            }
        });
        this.K = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.B = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int c(float f2, int i2) {
        return (int) ((i2 * f2) + 0.5f);
    }

    private long getPositionIncrement() {
        long j2 = this.C;
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        long j3 = this.K;
        if (j3 == -9223372036854775807L) {
            return 0L;
        }
        return j3 / ((long) this.B);
    }

    private String getProgressText() {
        return c.f.a.b.j3.x0.f0(this.v, this.w, this.L);
    }

    private long getScrubberPosition() {
        if (this.f8689c.width() <= 0 || this.K == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f8691e.width()) * this.K) / ((long) this.f8689c.width());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void j() {
        w(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void l(ValueAnimator valueAnimator) {
        this.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f8688b);
    }

    public static int n(float f2, int i2) {
        return (int) (i2 / f2);
    }

    public static boolean r(Drawable drawable, int i2) {
        return c.f.a.b.j3.x0.f9296a >= 23 && drawable.setLayoutDirection(i2);
    }

    @Override // c.f.a.b.h3.e1
    public void a(long[] jArr, boolean[] zArr, int i2) {
        c.f.a.b.j3.g.a(i2 == 0 || !(jArr == null || zArr == null));
        this.N = i2;
        this.O = jArr;
        this.P = zArr;
        x();
    }

    @Override // c.f.a.b.h3.e1
    public void b(e1.a aVar) {
        c.f.a.b.j3.g.e(aVar);
        this.y.add(aVar);
    }

    public final void d(Canvas canvas) {
        if (this.K <= 0) {
            return;
        }
        Rect rect = this.f8691e;
        int iR = c.f.a.b.j3.x0.r(rect.right, rect.left, this.f8689c.right);
        int iCenterY = this.f8691e.centerY();
        if (this.f8698l == null) {
            canvas.drawCircle(iR, iCenterY, (int) ((((this.I || isFocused()) ? this.s : isEnabled() ? this.q : this.r) * this.G) / 2.0f), this.f8697k);
            return;
        }
        int intrinsicWidth = ((int) (r2.getIntrinsicWidth() * this.G)) / 2;
        int intrinsicHeight = ((int) (this.f8698l.getIntrinsicHeight() * this.G)) / 2;
        this.f8698l.setBounds(iR - intrinsicWidth, iCenterY - intrinsicHeight, iR + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f8698l.draw(canvas);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y();
    }

    public final void e(Canvas canvas) {
        int iHeight = this.f8689c.height();
        int iCenterY = this.f8689c.centerY() - (iHeight / 2);
        int i2 = iHeight + iCenterY;
        if (this.K <= 0) {
            Rect rect = this.f8689c;
            canvas.drawRect(rect.left, iCenterY, rect.right, i2, this.f8694h);
            return;
        }
        Rect rect2 = this.f8690d;
        int i3 = rect2.left;
        int i4 = rect2.right;
        int iMax = Math.max(Math.max(this.f8689c.left, i4), this.f8691e.right);
        int i5 = this.f8689c.right;
        if (iMax < i5) {
            canvas.drawRect(iMax, iCenterY, i5, i2, this.f8694h);
        }
        int iMax2 = Math.max(i3, this.f8691e.right);
        if (i4 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i4, i2, this.f8693g);
        }
        if (this.f8691e.width() > 0) {
            Rect rect3 = this.f8691e;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i2, this.f8692f);
        }
        if (this.N == 0) {
            return;
        }
        long[] jArr = (long[]) c.f.a.b.j3.g.e(this.O);
        boolean[] zArr = (boolean[]) c.f.a.b.j3.g.e(this.P);
        int i6 = this.p / 2;
        for (int i7 = 0; i7 < this.N; i7++) {
            int iWidth = ((int) ((((long) this.f8689c.width()) * c.f.a.b.j3.x0.s(jArr[i7], 0L, this.K)) / this.K)) - i6;
            Rect rect4 = this.f8689c;
            canvas.drawRect(rect4.left + Math.min(rect4.width() - this.p, Math.max(0, iWidth)), iCenterY, r10 + this.p, i2, zArr[i7] ? this.f8696j : this.f8695i);
        }
    }

    public void f(long j2) {
        if (this.F.isStarted()) {
            this.F.cancel();
        }
        this.F.setFloatValues(this.G, 0.0f);
        this.F.setDuration(j2);
        this.F.start();
    }

    public void g(boolean z) {
        if (this.F.isStarted()) {
            this.F.cancel();
        }
        this.H = z;
        this.G = 0.0f;
        invalidate(this.f8688b);
    }

    @Override // c.f.a.b.h3.e1
    public long getPreferredUpdateDelay() {
        int iN = n(this.A, this.f8689c.width());
        if (iN != 0) {
            long j2 = this.K;
            if (j2 != 0 && j2 != -9223372036854775807L) {
                return j2 / ((long) iN);
            }
        }
        return Long.MAX_VALUE;
    }

    public final boolean h(float f2, float f3) {
        return this.f8688b.contains((int) f2, (int) f3);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8698l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void m(float f2) {
        Rect rect = this.f8691e;
        Rect rect2 = this.f8689c;
        rect.right = c.f.a.b.j3.x0.r((int) f2, rect2.left, rect2.right);
    }

    public final Point o(MotionEvent motionEvent) {
        this.z.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.z;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        e(canvas);
        d(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (!this.I || z) {
            return;
        }
        w(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.K <= 0) {
            return;
        }
        if (c.f.a.b.j3.x0.f9296a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(ProgressEvent.PART_FAILED_EVENT_CODE);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.p(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.x
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.x
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.I
            if (r0 == 0) goto L30
            r5 = 0
            r4.w(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.h3.i0.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int paddingBottom;
        int iMax;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i6 - getPaddingRight();
        int i8 = this.H ? 0 : this.t;
        if (this.f8701o == 1) {
            paddingBottom = (i7 - getPaddingBottom()) - this.f8700n;
            int paddingBottom2 = i7 - getPaddingBottom();
            int i9 = this.f8699m;
            iMax = (paddingBottom2 - i9) - Math.max(i8 - (i9 / 2), 0);
        } else {
            paddingBottom = (i7 - this.f8700n) / 2;
            iMax = (i7 - this.f8699m) / 2;
        }
        this.f8688b.set(paddingLeft, paddingBottom, paddingRight, this.f8700n + paddingBottom);
        Rect rect = this.f8689c;
        Rect rect2 = this.f8688b;
        rect.set(rect2.left + i8, iMax, rect2.right - i8, this.f8699m + iMax);
        if (c.f.a.b.j3.x0.f9296a >= 29) {
            s(i6, i7);
        }
        x();
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == 0) {
            size = this.f8700n;
        } else if (mode != 1073741824) {
            size = Math.min(this.f8700n, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i2), size);
        y();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        Drawable drawable = this.f8698l;
        if (drawable == null || !r(drawable, i2)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L6d
            long r2 = r7.K
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L6d
        L10:
            android.graphics.Point r0 = r7.o(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5a
            r5 = 3
            if (r3 == r4) goto L4b
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4b
            goto L6d
        L28:
            boolean r8 = r7.I
            if (r8 == 0) goto L6d
            int r8 = r7.u
            if (r0 >= r8) goto L37
            int r8 = r7.D
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            goto L3a
        L37:
            r7.D = r2
            float r8 = (float) r2
        L3a:
            r7.m(r8)
            long r0 = r7.getScrubberPosition()
            r7.z(r0)
        L44:
            r7.x()
            r7.invalidate()
            return r4
        L4b:
            boolean r0 = r7.I
            if (r0 == 0) goto L6d
            int r8 = r8.getAction()
            if (r8 != r5) goto L56
            r1 = 1
        L56:
            r7.w(r1)
            return r4
        L5a:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.h(r8, r0)
            if (r0 == 0) goto L6d
            r7.m(r8)
            long r0 = r7.getScrubberPosition()
            r7.v(r0)
            goto L44
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.h3.i0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(long j2) {
        long j3 = this.K;
        if (j3 <= 0) {
            return false;
        }
        long j4 = this.I ? this.J : this.L;
        long jS = c.f.a.b.j3.x0.s(j4 + j2, 0L, j3);
        if (jS == j4) {
            return false;
        }
        if (this.I) {
            z(jS);
        } else {
            v(jS);
        }
        x();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean performAccessibilityAction(int r7, android.os.Bundle r8) {
        /*
            r6 = this;
            boolean r8 = super.performAccessibilityAction(r7, r8)
            r0 = 1
            if (r8 == 0) goto L8
            return r0
        L8:
            long r1 = r6.K
            r3 = 0
            r8 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L12
            return r8
        L12:
            r1 = 8192(0x2000, float:1.148E-41)
            if (r7 != r1) goto L25
            long r1 = r6.getPositionIncrement()
            long r1 = -r1
            boolean r7 = r6.p(r1)
            if (r7 == 0) goto L34
        L21:
            r6.w(r8)
            goto L34
        L25:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r7 != r1) goto L39
            long r1 = r6.getPositionIncrement()
            boolean r7 = r6.p(r1)
            if (r7 == 0) goto L34
            goto L21
        L34:
            r7 = 4
            r6.sendAccessibilityEvent(r7)
            return r0
        L39:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.h3.i0.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    public final boolean q(Drawable drawable) {
        return c.f.a.b.j3.x0.f9296a >= 23 && r(drawable, getLayoutDirection());
    }

    public final void s(int i2, int i3) {
        Rect rect = this.E;
        if (rect != null && rect.width() == i2 && this.E.height() == i3) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i2, i3);
        this.E = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    public void setAdMarkerColor(int i2) {
        this.f8695i.setColor(i2);
        invalidate(this.f8688b);
    }

    public void setBufferedColor(int i2) {
        this.f8693g.setColor(i2);
        invalidate(this.f8688b);
    }

    @Override // c.f.a.b.h3.e1
    public void setBufferedPosition(long j2) {
        this.M = j2;
        x();
    }

    @Override // c.f.a.b.h3.e1
    public void setDuration(long j2) {
        this.K = j2;
        if (this.I && j2 == -9223372036854775807L) {
            w(true);
        }
        x();
    }

    @Override // android.view.View, c.f.a.b.h3.e1
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.I || z) {
            return;
        }
        w(true);
    }

    public void setKeyCountIncrement(int i2) {
        c.f.a.b.j3.g.a(i2 > 0);
        this.B = i2;
        this.C = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j2) {
        c.f.a.b.j3.g.a(j2 > 0);
        this.B = -1;
        this.C = j2;
    }

    public void setPlayedAdMarkerColor(int i2) {
        this.f8696j.setColor(i2);
        invalidate(this.f8688b);
    }

    public void setPlayedColor(int i2) {
        this.f8692f.setColor(i2);
        invalidate(this.f8688b);
    }

    @Override // c.f.a.b.h3.e1
    public void setPosition(long j2) {
        this.L = j2;
        setContentDescription(getProgressText());
        x();
    }

    public void setScrubberColor(int i2) {
        this.f8697k.setColor(i2);
        invalidate(this.f8688b);
    }

    public void setUnplayedColor(int i2) {
        this.f8694h.setColor(i2);
        invalidate(this.f8688b);
    }

    public void t() {
        if (this.F.isStarted()) {
            this.F.cancel();
        }
        this.H = false;
        this.G = 1.0f;
        invalidate(this.f8688b);
    }

    public void u(long j2) {
        if (this.F.isStarted()) {
            this.F.cancel();
        }
        this.H = false;
        this.F.setFloatValues(this.G, 1.0f);
        this.F.setDuration(j2);
        this.F.start();
    }

    public final void v(long j2) {
        this.J = j2;
        this.I = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<e1.a> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().j(this, j2);
        }
    }

    public final void w(boolean z) {
        removeCallbacks(this.x);
        this.I = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<e1.a> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().e(this, this.J, z);
        }
    }

    public final void x() {
        this.f8690d.set(this.f8689c);
        this.f8691e.set(this.f8689c);
        long j2 = this.I ? this.J : this.L;
        if (this.K > 0) {
            int iWidth = (int) ((((long) this.f8689c.width()) * this.M) / this.K);
            Rect rect = this.f8690d;
            Rect rect2 = this.f8689c;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f8689c.width()) * j2) / this.K);
            Rect rect3 = this.f8691e;
            Rect rect4 = this.f8689c;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f8690d;
            int i2 = this.f8689c.left;
            rect5.right = i2;
            this.f8691e.right = i2;
        }
        invalidate(this.f8688b);
    }

    public final void y() {
        Drawable drawable = this.f8698l;
        if (drawable != null && drawable.isStateful() && this.f8698l.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void z(long j2) {
        if (this.J == j2) {
            return;
        }
        this.J = j2;
        Iterator<e1.a> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().c(this, j2);
        }
    }
}
