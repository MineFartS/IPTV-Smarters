package pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TextView;
import java.io.IOException;
import m.a.a.b;
import m.a.a.e;
import m.a.a.f;

/* JADX INFO: loaded from: classes2.dex */
public class GifTextView extends TextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f.a f31378b;

    public GifTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet, 0, 0);
    }

    public static void d(Drawable[] drawableArr, boolean z) {
        for (Drawable drawable : drawableArr) {
            if (drawable != null) {
                drawable.setVisible(z, false);
            }
        }
    }

    private void setCompoundDrawablesVisible(boolean z) {
        d(getCompoundDrawables(), z);
        d(getCompoundDrawablesRelative(), z);
    }

    public final void a() {
        if (this.f31378b.f31121b < 0) {
            return;
        }
        for (Drawable drawable : getCompoundDrawables()) {
            f.a(this.f31378b.f31121b, drawable);
        }
        for (Drawable drawable2 : getCompoundDrawablesRelative()) {
            f.a(this.f31378b.f31121b, drawable2);
        }
        f.a(this.f31378b.f31121b, getBackground());
    }

    public final Drawable b(int i2) {
        if (i2 == 0) {
            return null;
        }
        Resources resources = getResources();
        String resourceTypeName = resources.getResourceTypeName(i2);
        if (!isInEditMode() && f.f31119a.contains(resourceTypeName)) {
            try {
                return new b(resources, i2);
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i2, getContext().getTheme()) : resources.getDrawable(i2);
    }

    public final void c(AttributeSet attributeSet, int i2, int i3) {
        if (attributeSet != null) {
            Drawable drawableB = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableLeft", 0));
            Drawable drawableB2 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableTop", 0));
            Drawable drawableB3 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableRight", 0));
            Drawable drawableB4 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableBottom", 0));
            Drawable drawableB5 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableStart", 0));
            Drawable drawableB6 = b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableEnd", 0));
            if (getLayoutDirection() == 0) {
                if (drawableB5 != null) {
                    drawableB = drawableB5;
                }
                if (drawableB6 == null) {
                    drawableB6 = drawableB3;
                }
            } else {
                if (drawableB5 != null) {
                    drawableB3 = drawableB5;
                }
                if (drawableB6 == null) {
                    drawableB6 = drawableB;
                }
                drawableB = drawableB3;
            }
            setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB, drawableB2, drawableB6, drawableB4);
            setBackground(b(attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "background", 0)));
            this.f31378b = new f.a(this, attributeSet, i2, i3);
            a();
        }
        this.f31378b = new f.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setCompoundDrawablesVisible(true);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setCompoundDrawablesVisible(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        Drawable[] compoundDrawables = getCompoundDrawables();
        eVar.b(compoundDrawables[0], 0);
        eVar.b(compoundDrawables[1], 1);
        eVar.b(compoundDrawables[2], 2);
        eVar.b(compoundDrawables[3], 3);
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        eVar.b(compoundDrawablesRelative[0], 4);
        eVar.b(compoundDrawablesRelative[2], 5);
        eVar.b(getBackground(), 6);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Drawable[] drawableArr = new Drawable[7];
        if (this.f31378b.f31120a) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            System.arraycopy(compoundDrawables, 0, drawableArr, 0, compoundDrawables.length);
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            drawableArr[4] = compoundDrawablesRelative[0];
            drawableArr[5] = compoundDrawablesRelative[2];
            drawableArr[6] = getBackground();
        }
        return new e(super.onSaveInstanceState(), drawableArr);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        setBackground(b(i2));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        setCompoundDrawablesRelativeWithIntrinsicBounds(b(i2), b(i3), b(i4), b(i5));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        setCompoundDrawablesWithIntrinsicBounds(b(i2), b(i3), b(i4), b(i5));
    }

    public void setFreezesAnimation(boolean z) {
        this.f31378b.f31120a = z;
    }
}
