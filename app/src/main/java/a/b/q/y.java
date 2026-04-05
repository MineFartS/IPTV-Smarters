package a.b.q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes.dex */
public class y extends ToggleButton implements a.i.r.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f859c;

    public y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public y(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        p0.a(this, getContext());
        e eVar = new e(this);
        this.f858b = eVar;
        eVar.e(attributeSet, i2);
        w wVar = new w(this);
        this.f859c = wVar;
        wVar.m(attributeSet, i2);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f858b;
        if (eVar != null) {
            eVar.b();
        }
        w wVar = this.f859c;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // a.i.r.w
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f858b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // a.i.r.w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f858b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f858b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f858b;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // a.i.r.w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f858b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // a.i.r.w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f858b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }
}
