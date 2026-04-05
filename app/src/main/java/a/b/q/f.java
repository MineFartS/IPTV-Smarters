package a.b.q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public class f extends Button implements a.i.r.w, a.i.s.b, a.i.s.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f607c;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.a.q);
    }

    public f(Context context, AttributeSet attributeSet, int i2) {
        super(r0.b(context), attributeSet, i2);
        p0.a(this, getContext());
        e eVar = new e(this);
        this.f606b = eVar;
        eVar.e(attributeSet, i2);
        w wVar = new w(this);
        this.f607c = wVar;
        wVar.m(attributeSet, i2);
        wVar.b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f606b;
        if (eVar != null) {
            eVar.b();
        }
        w wVar = this.f607c;
        if (wVar != null) {
            wVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (a.i.s.b.a0) {
            return super.getAutoSizeMaxTextSize();
        }
        w wVar = this.f607c;
        if (wVar != null) {
            return wVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (a.i.s.b.a0) {
            return super.getAutoSizeMinTextSize();
        }
        w wVar = this.f607c;
        if (wVar != null) {
            return wVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (a.i.s.b.a0) {
            return super.getAutoSizeStepGranularity();
        }
        w wVar = this.f607c;
        if (wVar != null) {
            return wVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (a.i.s.b.a0) {
            return super.getAutoSizeTextAvailableSizes();
        }
        w wVar = this.f607c;
        return wVar != null ? wVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (a.i.s.b.a0) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        w wVar = this.f607c;
        if (wVar != null) {
            return wVar.i();
        }
        return 0;
    }

    @Override // a.i.r.w
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f606b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // a.i.r.w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f606b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f607c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f607c.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        w wVar = this.f607c;
        if (wVar != null) {
            wVar.o(z, i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        w wVar = this.f607c;
        if (wVar == null || a.i.s.b.a0 || !wVar.l()) {
            return;
        }
        this.f607c.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (a.i.s.b.a0) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        w wVar = this.f607c;
        if (wVar != null) {
            wVar.t(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (a.i.s.b.a0) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        w wVar = this.f607c;
        if (wVar != null) {
            wVar.u(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (a.i.s.b.a0) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        w wVar = this.f607c;
        if (wVar != null) {
            wVar.v(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f606b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f606b;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.i.s.i.s(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        w wVar = this.f607c;
        if (wVar != null) {
            wVar.s(z);
        }
    }

    @Override // a.i.r.w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f606b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // a.i.r.w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f606b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // a.i.s.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f607c.w(colorStateList);
        this.f607c.b();
    }

    @Override // a.i.s.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f607c.x(mode);
        this.f607c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        w wVar = this.f607c;
        if (wVar != null) {
            wVar.q(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        if (a.i.s.b.a0) {
            super.setTextSize(i2, f2);
            return;
        }
        w wVar = this.f607c;
        if (wVar != null) {
            wVar.A(i2, f2);
        }
    }
}
