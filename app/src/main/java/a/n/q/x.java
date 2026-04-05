package a.n.q;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class x extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f2971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f2973d;

    public x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public x(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f2973d = new Rect();
        if (context.getApplicationInfo().targetSdkVersion < 23 || Build.VERSION.SDK_INT < 23) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.foreground});
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                a(drawable);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            i.b(this, drawable);
            return;
        }
        if (this.f2971b != drawable) {
            this.f2971b = drawable;
            this.f2972c = true;
            setWillNotDraw(false);
            this.f2971b.setCallback(this);
            if (this.f2971b.isStateful()) {
                this.f2971b.setState(getDrawableState());
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f2971b;
        if (drawable != null) {
            if (this.f2972c) {
                this.f2972c = false;
                Rect rect = this.f2973d;
                rect.set(0, 0, getRight() - getLeft(), getBottom() - getTop());
                drawable.setBounds(rect);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2971b;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f2971b.setState(getDrawableState());
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2971b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        this.f2972c = z | this.f2972c;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2971b;
    }
}
