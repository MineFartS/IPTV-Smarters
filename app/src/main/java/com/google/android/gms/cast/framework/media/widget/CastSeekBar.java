package com.google.android.gms.cast.framework.media.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import c.f.a.c.d.u.i;
import c.f.a.c.d.u.j;
import c.f.a.c.d.u.o;
import c.f.a.c.d.u.p;
import c.f.a.c.f.q.n;
import c.f.a.c.f.t.l;
import com.amazonaws.event.ProgressEvent;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CastSeekBar extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f24190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f24192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<a> f24193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f24194f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f24195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f24196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f24197i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f24198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f24199k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f24200l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f24201m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f24202n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f24203o;
    public final int p;
    public int[] q;
    public Point r;
    public Runnable s;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24204a;

        public a(int i2) {
            this.f24204a = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f24204a == ((a) obj).f24204a;
        }

        public final int hashCode() {
            return Integer.valueOf(this.f24204a).hashCode();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f24205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f24206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f24207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f24208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f24209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f24210f;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f24205a == bVar.f24205a && this.f24206b == bVar.f24206b && this.f24207c == bVar.f24207c && this.f24208d == bVar.f24208d && this.f24209e == bVar.f24209e && this.f24210f == bVar.f24210f;
        }

        public final int hashCode() {
            return n.b(Integer.valueOf(this.f24205a), Integer.valueOf(this.f24206b), Integer.valueOf(this.f24207c), Integer.valueOf(this.f24208d), Integer.valueOf(this.f24209e), Boolean.valueOf(this.f24210f));
        }
    }

    public static abstract class c {
        public void a(CastSeekBar castSeekBar, int i2, boolean z) {
            throw null;
        }

        public void b(CastSeekBar castSeekBar) {
            throw null;
        }

        public void c(CastSeekBar castSeekBar) {
            throw null;
        }
    }

    public class d extends View.AccessibilityDelegate {
        public d() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SeekBar.class.getName());
            accessibilityEvent.setItemCount(CastSeekBar.this.f24190b.f24206b);
            accessibilityEvent.setCurrentItemIndex(CastSeekBar.this.getProgress());
        }

        @Override // android.view.View.AccessibilityDelegate
        @TargetApi(16)
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(SeekBar.class.getName());
            if (l.b() && view.isEnabled()) {
                accessibilityNodeInfo.addAction(ProgressEvent.PART_FAILED_EVENT_CODE);
                accessibilityNodeInfo.addAction(8192);
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        @TargetApi(16)
        public final boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            if (!view.isEnabled()) {
                return false;
            }
            if (super.performAccessibilityAction(view, i2, bundle)) {
                return true;
            }
            if (l.b() && (i2 == 4096 || i2 == 8192)) {
                CastSeekBar.this.e();
                CastSeekBar castSeekBar = CastSeekBar.this;
                int i3 = castSeekBar.f24190b.f24206b / 20;
                if (i2 == 8192) {
                    i3 = -i3;
                }
                castSeekBar.h(castSeekBar.getProgress() + i3);
                CastSeekBar.this.f();
            }
            return false;
        }
    }

    public CastSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CastSeekBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f24193e = new ArrayList();
        setAccessibilityDelegate(new d());
        Paint paint = new Paint(1);
        this.f24200l = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f24195g = context.getResources().getDimension(j.f11847f);
        this.f24196h = context.getResources().getDimension(j.f11846e);
        this.f24197i = context.getResources().getDimension(j.f11848g) / 2.0f;
        this.f24198j = context.getResources().getDimension(j.f11849h) / 2.0f;
        this.f24199k = context.getResources().getDimension(j.f11845d);
        b bVar = new b();
        this.f24190b = bVar;
        bVar.f24206b = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, p.f11901a, i.f11838a, o.f11899a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(p.t, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(p.u, 0);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(p.w, 0);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(p.f11902b, 0);
        this.f24201m = context.getResources().getColor(resourceId);
        this.f24202n = context.getResources().getColor(resourceId2);
        this.f24203o = context.getResources().getColor(resourceId3);
        this.p = context.getResources().getColor(resourceId4);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(Canvas canvas, int i2, int i3, int i4, int i5) {
        this.f24200l.setColor(i5);
        int i6 = this.f24190b.f24206b;
        float f2 = i4;
        float f3 = this.f24197i;
        canvas.drawRect(((i2 * 1.0f) / i6) * f2, -f3, ((i3 * 1.0f) / i6) * f2, f3, this.f24200l);
    }

    public final void b(b bVar) {
        if (this.f24191c) {
            return;
        }
        b bVar2 = new b();
        bVar2.f24205a = bVar.f24205a;
        bVar2.f24206b = bVar.f24206b;
        bVar2.f24207c = bVar.f24207c;
        bVar2.f24208d = bVar.f24208d;
        bVar2.f24209e = bVar.f24209e;
        bVar2.f24210f = bVar.f24210f;
        this.f24190b = bVar2;
        this.f24192d = null;
        c cVar = this.f24194f;
        if (cVar != null) {
            cVar.a(this, getProgress(), false);
        }
        postInvalidate();
    }

    public final void e() {
        this.f24191c = true;
        c cVar = this.f24194f;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public final void f() {
        this.f24191c = false;
        c cVar = this.f24194f;
        if (cVar != null) {
            cVar.b(this);
        }
    }

    public int getMaxProgress() {
        return this.f24190b.f24206b;
    }

    public int getProgress() {
        Integer num = this.f24192d;
        return num != null ? num.intValue() : this.f24190b.f24205a;
    }

    public final void h(int i2) {
        b bVar = this.f24190b;
        if (bVar.f24210f) {
            this.f24192d = Integer.valueOf(c.f.a.c.d.v.a.h(i2, bVar.f24208d, bVar.f24209e));
            c cVar = this.f24194f;
            if (cVar != null) {
                cVar.a(this, getProgress(), true);
            }
            Runnable runnable = this.s;
            if (runnable == null) {
                this.s = new Runnable(this) { // from class: c.f.a.c.d.u.u.m.b

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final CastSeekBar f12102b;

                    {
                        this.f12102b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f12102b.sendAccessibilityEvent(4);
                    }
                };
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.s, 200L);
            postInvalidate();
        }
    }

    public final int i(int i2) {
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        double d2 = i2;
        Double.isNaN(d2);
        double d3 = measuredWidth;
        Double.isNaN(d3);
        double d4 = (d2 * 1.0d) / d3;
        double d5 = this.f24190b.f24206b;
        Double.isNaN(d5);
        return (int) (d4 * d5);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        Runnable runnable = this.s;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        CastSeekBar castSeekBar;
        Canvas canvas2;
        int i4;
        int i5;
        int iSave = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int progress = getProgress();
        int iSave2 = canvas.save();
        canvas.translate(0.0f, measuredHeight / 2);
        b bVar = this.f24190b;
        if (bVar.f24210f) {
            int i6 = bVar.f24208d;
            if (i6 > 0) {
                a(canvas, 0, i6, measuredWidth, this.f24203o);
            }
            int i7 = this.f24190b.f24208d;
            if (progress > i7) {
                a(canvas, i7, progress, measuredWidth, this.f24201m);
            }
            int i8 = this.f24190b.f24209e;
            if (i8 > progress) {
                a(canvas, progress, i8, measuredWidth, this.f24202n);
            }
            b bVar2 = this.f24190b;
            i2 = bVar2.f24206b;
            i4 = bVar2.f24209e;
            if (i2 > i4) {
                i3 = this.f24203o;
                castSeekBar = this;
                canvas2 = canvas;
                castSeekBar.a(canvas2, i4, i2, measuredWidth, i3);
            }
        } else {
            int iMax = Math.max(bVar.f24207c, 0);
            if (iMax > 0) {
                a(canvas, 0, iMax, measuredWidth, this.f24203o);
            }
            if (progress > iMax) {
                a(canvas, iMax, progress, measuredWidth, this.f24201m);
            }
            i2 = this.f24190b.f24206b;
            if (i2 > progress) {
                i3 = this.f24203o;
                castSeekBar = this;
                canvas2 = canvas;
                i4 = progress;
                castSeekBar.a(canvas2, i4, i2, measuredWidth, i3);
            }
        }
        canvas.restoreToCount(iSave2);
        List<a> list = this.f24193e;
        if (list != null && !list.isEmpty()) {
            this.f24200l.setColor(this.p);
            int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            for (a aVar : this.f24193e) {
                if (aVar != null && (i5 = aVar.f24204a) >= 0) {
                    canvas.drawCircle((Math.min(i5, this.f24190b.f24206b) * measuredWidth2) / this.f24190b.f24206b, measuredHeight2 / 2, this.f24199k, this.f24200l);
                }
            }
        }
        if (isEnabled() && this.f24190b.f24210f) {
            this.f24200l.setColor(this.f24201m);
            int measuredWidth3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            double progress2 = getProgress();
            Double.isNaN(progress2);
            double d2 = this.f24190b.f24206b;
            Double.isNaN(d2);
            double d3 = (progress2 * 1.0d) / d2;
            double d4 = measuredWidth3;
            Double.isNaN(d4);
            int i9 = (int) (d3 * d4);
            int iSave3 = canvas.save();
            canvas.drawCircle(i9, measuredHeight3 / 2.0f, this.f24198j, this.f24200l);
            canvas.restoreToCount(iSave3);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public synchronized void onMeasure(int i2, int i3) {
        setMeasuredDimension(View.resolveSizeAndState((int) (this.f24195g + getPaddingLeft() + getPaddingRight()), i2, 0), View.resolveSizeAndState((int) (this.f24196h + getPaddingTop() + getPaddingBottom()), i3, 0));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !this.f24190b.f24210f) {
            return false;
        }
        if (this.r == null) {
            this.r = new Point();
        }
        if (this.q == null) {
            this.q = new int[2];
        }
        getLocationOnScreen(this.q);
        this.r.set((((int) motionEvent.getRawX()) - this.q[0]) - getPaddingLeft(), ((int) motionEvent.getRawY()) - this.q[1]);
        int action = motionEvent.getAction();
        if (action == 0) {
            e();
            h(i(this.r.x));
            return true;
        }
        if (action == 1) {
            h(i(this.r.x));
            f();
            return true;
        }
        if (action == 2) {
            h(i(this.r.x));
            return true;
        }
        if (action != 3) {
            return false;
        }
        this.f24191c = false;
        this.f24192d = null;
        c cVar = this.f24194f;
        if (cVar != null) {
            cVar.a(this, getProgress(), true);
            this.f24194f.b(this);
        }
        postInvalidate();
        return true;
    }

    public final void setAdBreaks(List<a> list) {
        if (n.a(this.f24193e, list)) {
            return;
        }
        this.f24193e = list == null ? null : new ArrayList(list);
        postInvalidate();
    }
}
