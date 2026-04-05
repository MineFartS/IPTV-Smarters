package androidx.appcompat.widget;

import a.b.a;
import a.b.q.e;
import a.b.q.h;
import a.b.q.p0;
import a.b.q.r0;
import a.i.r.w;
import a.i.s.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements k, w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f4168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f4169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a.b.q.w f4170d;

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.r);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i2) {
        super(r0.b(context), attributeSet, i2);
        p0.a(this, getContext());
        h hVar = new h(this);
        this.f4168b = hVar;
        hVar.e(attributeSet, i2);
        e eVar = new e(this);
        this.f4169c = eVar;
        eVar.e(attributeSet, i2);
        a.b.q.w wVar = new a.b.q.w(this);
        this.f4170d = wVar;
        wVar.m(attributeSet, i2);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f4169c;
        if (eVar != null) {
            eVar.b();
        }
        a.b.q.w wVar = this.f4170d;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        h hVar = this.f4168b;
        return hVar != null ? hVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // a.i.r.w
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f4169c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // a.i.r.w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f4169c;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // a.i.s.k
    public ColorStateList getSupportButtonTintList() {
        h hVar = this.f4168b;
        if (hVar != null) {
            return hVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        h hVar = this.f4168b;
        if (hVar != null) {
            return hVar.d();
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f4169c;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f4169c;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(a.b.l.a.a.d(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        h hVar = this.f4168b;
        if (hVar != null) {
            hVar.f();
        }
    }

    @Override // a.i.r.w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f4169c;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // a.i.r.w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f4169c;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // a.i.s.k
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        h hVar = this.f4168b;
        if (hVar != null) {
            hVar.g(colorStateList);
        }
    }

    @Override // a.i.s.k
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        h hVar = this.f4168b;
        if (hVar != null) {
            hVar.h(mode);
        }
    }
}
