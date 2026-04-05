package a.n.q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class s0 extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Rect f2917b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f2920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f2923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f2924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Paint f2926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2927l;

    public s0(Context context, int i2, boolean z, float f2, float f3, int i3) {
        super(context);
        this.f2922g = 1;
        this.f2923h = f2;
        this.f2924i = f3;
        a(i2, z, i3);
    }

    public static boolean b() {
        return q0.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r4, boolean r5, int r6) {
        /*
            r3 = this;
            boolean r0 = r3.f2918c
            if (r0 != 0) goto L4b
            r0 = 1
            r3.f2918c = r0
            r3.f2925j = r6
            r1 = 0
            if (r6 <= 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            r3.f2921f = r2
            r3.f2922g = r4
            r2 = 2
            if (r4 == r2) goto L23
            r2 = 3
            if (r4 == r2) goto L1a
            goto L29
        L1a:
            float r4 = r3.f2923h
            float r2 = r3.f2924i
            java.lang.Object r4 = a.n.q.q0.a(r3, r4, r2, r6)
            goto L27
        L23:
            java.lang.Object r4 = a.n.q.z0.a(r3)
        L27:
            r3.f2919d = r4
        L29:
            if (r5 == 0) goto L44
            r3.setWillNotDraw(r1)
            r3.f2927l = r1
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r3.f2926k = r4
            int r5 = r3.f2927l
            r4.setColor(r5)
            android.graphics.Paint r4 = r3.f2926k
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            r4.setStyle(r5)
            goto L4a
        L44:
            r3.setWillNotDraw(r0)
            r4 = 0
            r3.f2926k = r4
        L4a:
            return
        L4b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n.q.s0.a(int, boolean, int):void");
    }

    public void c(View view) {
        if (!this.f2918c || this.f2920e != null) {
            throw new IllegalStateException();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
            layoutParams.width = layoutParams.width == -1 ? -1 : -2;
            layoutParams.height = layoutParams.height == -1 ? -1 : -2;
            setLayoutParams(layoutParams);
            addView(view, layoutParams2);
        } else {
            addView(view);
        }
        if (this.f2921f && this.f2922g != 3) {
            k0.a(this, true);
        }
        this.f2920e = view;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2926k == null || this.f2927l == 0) {
            return;
        }
        canvas.drawRect(this.f2920e.getLeft(), this.f2920e.getTop(), this.f2920e.getRight(), this.f2920e.getBottom(), this.f2926k);
    }

    public int getShadowType() {
        return this.f2922g;
    }

    public View getWrappedView() {
        return this.f2920e;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View view;
        super.onLayout(z, i2, i3, i4, i5);
        if (!z || (view = this.f2920e) == null) {
            return;
        }
        Rect rect = f2917b;
        rect.left = (int) view.getPivotX();
        rect.top = (int) this.f2920e.getPivotY();
        offsetDescendantRectToMyCoords(this.f2920e, rect);
        setPivotX(rect.left);
        setPivotY(rect.top);
    }

    public void setOverlayColor(int i2) {
        Paint paint = this.f2926k;
        if (paint == null || i2 == this.f2927l) {
            return;
        }
        this.f2927l = i2;
        paint.setColor(i2);
        invalidate();
    }

    public void setShadowFocusLevel(float f2) {
        Object obj = this.f2919d;
        if (obj != null) {
            t0.k(obj, this.f2922g, f2);
        }
    }
}
