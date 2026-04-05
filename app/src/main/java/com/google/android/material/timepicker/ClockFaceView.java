package com.google.android.material.timepicker;

import a.i.r.g0.c;
import a.i.r.x;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import c.f.a.d.d;
import c.f.a.d.f;
import c.f.a.d.h;
import c.f.a.d.k;
import c.f.a.d.l;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class ClockFaceView extends c.f.a.d.p0.b implements ClockHandView.d {
    public final ClockHandView B;
    public final Rect C;
    public final RectF D;
    public final SparseArray<TextView> E;
    public final a.i.r.a F;
    public final int[] G;
    public final float[] H;
    public final int I;
    public String[] J;
    public float K;
    public final ColorStateList L;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.v(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.B.g()) - ClockFaceView.this.I);
            return true;
        }
    }

    public class b extends a.i.r.a {
        public b() {
        }

        @Override // a.i.r.a
        public void g(View view, c cVar) {
            super.g(view, cVar);
            int iIntValue = ((Integer) view.getTag(f.f14795n)).intValue();
            if (iIntValue > 0) {
                cVar.u0((View) ClockFaceView.this.E.get(iIntValue - 1));
            }
            cVar.a0(c.C0042c.a(0, 1, iIntValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f.a.d.b.v);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.C = new Rect();
        this.D = new RectF();
        this.E = new SparseArray<>();
        this.H = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.b1, i2, k.v);
        Resources resources = getResources();
        ColorStateList colorStateListA = c.f.a.d.g0.c.a(context, typedArrayObtainStyledAttributes, l.d1);
        this.L = colorStateListA;
        LayoutInflater.from(context).inflate(h.f14833g, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(f.f14789h);
        this.B = clockHandView;
        this.I = resources.getDimensionPixelSize(d.f14713l);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.G = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = a.b.l.a.a.c(context, c.f.a.d.c.f14647f).getDefaultColor();
        ColorStateList colorStateListA2 = c.f.a.d.g0.c.a(context, typedArrayObtainStyledAttributes, l.c1);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.F = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, BuildConfig.FLAVOR);
        E(strArr, 0);
    }

    public final void C() {
        RectF rectFD = this.B.d();
        for (int i2 = 0; i2 < this.E.size(); i2++) {
            TextView textView = this.E.get(i2);
            if (textView != null) {
                textView.getDrawingRect(this.C);
                this.C.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.C);
                this.D.set(this.C);
                textView.getPaint().setShader(D(rectFD, this.D));
                textView.invalidate();
            }
        }
    }

    public final RadialGradient D(RectF rectF, RectF rectF2) {
        if (RectF.intersects(rectF, rectF2)) {
            return new RadialGradient(rectF.centerX() - this.D.left, rectF.centerY() - this.D.top, rectF.width() * 0.5f, this.G, this.H, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public void E(String[] strArr, int i2) {
        this.J = strArr;
        F(i2);
    }

    public final void F(int i2) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.E.size();
        for (int i3 = 0; i3 < Math.max(this.J.length, size); i3++) {
            TextView textView = this.E.get(i3);
            if (i3 >= this.J.length) {
                removeView(textView);
                this.E.remove(i3);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(h.f14832f, (ViewGroup) this, false);
                    this.E.put(i3, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.J[i3]);
                textView.setTag(f.f14795n, Integer.valueOf(i3));
                x.p0(textView, this.F);
                textView.setTextColor(this.L);
                if (i2 != 0) {
                    textView.setContentDescription(getResources().getString(i2, this.J[i3]));
                }
            }
        }
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void a(float f2, boolean z) {
        if (Math.abs(this.K - f2) > 0.001f) {
            this.K = f2;
            C();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        c.x0(accessibilityNodeInfo).Z(c.b.a(1, this.J.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        C();
    }

    @Override // c.f.a.d.p0.b
    public void v(int i2) {
        if (i2 != u()) {
            super.v(i2);
            this.B.j(u());
        }
    }
}
