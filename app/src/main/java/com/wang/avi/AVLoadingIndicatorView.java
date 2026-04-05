package com.wang.avi;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import c.l.a.c;
import com.amazonaws.services.s3.model.InstructionFileId;

/* JADX INFO: loaded from: classes2.dex */
public class AVLoadingIndicatorView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.l.a.d.a f30050b = new c.l.a.d.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f30051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Runnable f30055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f30056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f30057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f30058j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f30059k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f30060l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.l.a.a f30061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f30062n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f30063o;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AVLoadingIndicatorView.this.f30052d = false;
            AVLoadingIndicatorView.this.f30051c = -1L;
            AVLoadingIndicatorView.this.setVisibility(8);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AVLoadingIndicatorView.this.f30053e = false;
            if (AVLoadingIndicatorView.this.f30054f) {
                return;
            }
            AVLoadingIndicatorView.this.f30051c = System.currentTimeMillis();
            AVLoadingIndicatorView.this.setVisibility(0);
        }
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30051c = -1L;
        this.f30052d = false;
        this.f30053e = false;
        this.f30054f = false;
        this.f30055g = new a();
        this.f30056h = new b();
        f(context, attributeSet, 0, c.l.a.b.f18838a);
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        c.l.a.a aVar = this.f30061m;
        if (aVar != null) {
            aVar.setHotspot(f2, f3);
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        k();
    }

    public void e(Canvas canvas) {
        c.l.a.a aVar = this.f30061m;
        if (aVar != null) {
            int iSave = canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            aVar.draw(canvas);
            canvas.restoreToCount(iSave);
            if (this.f30063o) {
                aVar.start();
                this.f30063o = false;
            }
        }
    }

    public final void f(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f30057i = 24;
        this.f30058j = 48;
        this.f30059k = 24;
        this.f30060l = 48;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f18839a, i2, i3);
        this.f30057i = typedArrayObtainStyledAttributes.getDimensionPixelSize(c.f18845g, this.f30057i);
        this.f30058j = typedArrayObtainStyledAttributes.getDimensionPixelSize(c.f18843e, this.f30058j);
        this.f30059k = typedArrayObtainStyledAttributes.getDimensionPixelSize(c.f18844f, this.f30059k);
        this.f30060l = typedArrayObtainStyledAttributes.getDimensionPixelSize(c.f18842d, this.f30060l);
        String string = typedArrayObtainStyledAttributes.getString(c.f18841c);
        this.f30062n = typedArrayObtainStyledAttributes.getColor(c.f18840b, -1);
        setIndicator(string);
        if (this.f30061m == null) {
            setIndicator(f30050b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void g() {
        removeCallbacks(this.f30055g);
        removeCallbacks(this.f30056h);
    }

    public c.l.a.a getIndicator() {
        return this.f30061m;
    }

    public void h() {
        if (getVisibility() != 0) {
            return;
        }
        if (this.f30061m instanceof Animatable) {
            this.f30063o = true;
        }
        postInvalidate();
    }

    public void i() {
        c.l.a.a aVar = this.f30061m;
        if (aVar instanceof Animatable) {
            aVar.stop();
            this.f30063o = false;
        }
        postInvalidate();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (!verifyDrawable(drawable)) {
            super.invalidateDrawable(drawable);
            return;
        }
        Rect bounds = drawable.getBounds();
        int scrollX = getScrollX() + getPaddingLeft();
        int scrollY = getScrollY() + getPaddingTop();
        invalidate(bounds.left + scrollX, bounds.top + scrollY, bounds.right + scrollX, bounds.bottom + scrollY);
    }

    public final void j(int i2, int i3) {
        int i4;
        int paddingRight = i2 - (getPaddingRight() + getPaddingLeft());
        int paddingTop = i3 - (getPaddingTop() + getPaddingBottom());
        if (this.f30061m != null) {
            float intrinsicWidth = r0.getIntrinsicWidth() / this.f30061m.getIntrinsicHeight();
            float f2 = paddingRight;
            float f3 = paddingTop;
            float f4 = f2 / f3;
            int i5 = 0;
            if (intrinsicWidth == f4) {
                i4 = 0;
            } else if (f4 > intrinsicWidth) {
                int i6 = (int) (f3 * intrinsicWidth);
                int i7 = (paddingRight - i6) / 2;
                i5 = i7;
                paddingRight = i6 + i7;
                i4 = 0;
            } else {
                int i8 = (int) (f2 * (1.0f / intrinsicWidth));
                int i9 = (paddingTop - i8) / 2;
                int i10 = i8 + i9;
                i4 = i9;
                paddingTop = i10;
            }
            this.f30061m.setBounds(i5, i4, paddingRight, paddingTop);
        }
    }

    public final void k() {
        int[] drawableState = getDrawableState();
        c.l.a.a aVar = this.f30061m;
        if (aVar == null || !aVar.isStateful()) {
            return;
        }
        this.f30061m.setState(drawableState);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h();
        g();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        i();
        super.onDetachedFromWindow();
        g();
    }

    @Override // android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        e(canvas);
    }

    @Override // android.view.View
    public synchronized void onMeasure(int i2, int i3) {
        int iMax;
        int iMax2;
        c.l.a.a aVar = this.f30061m;
        if (aVar != null) {
            iMax2 = Math.max(this.f30057i, Math.min(this.f30058j, aVar.getIntrinsicWidth()));
            iMax = Math.max(this.f30059k, Math.min(this.f30060l, aVar.getIntrinsicHeight()));
        } else {
            iMax = 0;
            iMax2 = 0;
        }
        k();
        setMeasuredDimension(View.resolveSizeAndState(iMax2 + getPaddingLeft() + getPaddingRight(), i2, 0), View.resolveSizeAndState(iMax + getPaddingTop() + getPaddingBottom(), i3, 0));
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        j(i2, i3);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (i2 == 8 || i2 == 4) {
            i();
        } else {
            h();
        }
    }

    public void setIndicator(c.l.a.a aVar) {
        c.l.a.a aVar2 = this.f30061m;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.setCallback(null);
                unscheduleDrawable(this.f30061m);
            }
            this.f30061m = aVar;
            setIndicatorColor(this.f30062n);
            if (aVar != null) {
                aVar.setCallback(this);
            }
            postInvalidate();
        }
    }

    public void setIndicator(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (!str.contains(InstructionFileId.DOT)) {
            sb.append(getClass().getPackage().getName());
            sb.append(".indicators");
            sb.append(InstructionFileId.DOT);
        }
        sb.append(str);
        try {
            setIndicator((c.l.a.a) Class.forName(sb.toString()).newInstance());
        } catch (ClassNotFoundException unused) {
            Log.e("AVLoadingIndicatorView", "Didn't find your class , check the name again !");
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        }
    }

    public void setIndicatorColor(int i2) {
        this.f30062n = i2;
        this.f30061m.i(i2);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (getVisibility() != i2) {
            super.setVisibility(i2);
            if (i2 == 8 || i2 == 4) {
                i();
            } else {
                h();
            }
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f30061m || super.verifyDrawable(drawable);
    }
}
