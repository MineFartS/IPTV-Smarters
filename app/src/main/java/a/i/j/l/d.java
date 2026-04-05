package a.i.j.l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class d extends Drawable implements Drawable.Callback, c, b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f1831b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f1833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f1835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f1836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f1837h;

    public d(f fVar, Resources resources) {
        this.f1835f = fVar;
        e(resources);
    }

    public d(Drawable drawable) {
        this.f1835f = d();
        a(drawable);
    }

    @Override // a.i.j.l.c
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f1837h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1837h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f1835f;
            if (fVar != null) {
                fVar.f1840b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // a.i.j.l.c
    public final Drawable b() {
        return this.f1837h;
    }

    public boolean c() {
        return true;
    }

    public final f d() {
        return new f(this.f1835f);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f1837h.draw(canvas);
    }

    public final void e(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.f1835f;
        if (fVar == null || (constantState = fVar.f1840b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    public final boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        f fVar = this.f1835f;
        ColorStateList colorStateList = fVar.f1841c;
        PorterDuff.Mode mode = fVar.f1842d;
        if (colorStateList == null || mode == null) {
            this.f1834e = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f1834e || colorForState != this.f1832c || mode != this.f1833d) {
                setColorFilter(colorForState, mode);
                this.f1832c = colorForState;
                this.f1833d = mode;
                this.f1834e = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f1835f;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f1837h.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        f fVar = this.f1835f;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.f1835f.f1839a = getChangingConfigurations();
        return this.f1835f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f1837h.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f1837h.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f1837h.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return a.f(this.f1837h);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f1837h.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f1837h.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f1837h.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f1837h.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f1837h.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f1837h.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return a.h(this.f1837h);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        f fVar;
        ColorStateList colorStateList = (!c() || (fVar = this.f1835f) == null) ? null : fVar.f1841c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f1837h.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f1837h.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f1836g && super.mutate() == this) {
            this.f1835f = d();
            Drawable drawable = this.f1837h;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f1835f;
            if (fVar != null) {
                Drawable drawable2 = this.f1837h;
                fVar.f1840b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f1836g = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1837h;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        return a.m(this.f1837h, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
        return this.f1837h.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f1837h.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        a.j(this.f1837h, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i2) {
        this.f1837h.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1837h.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f1837h.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f1837h.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return f(iArr) || this.f1837h.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, a.i.j.l.b
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable, a.i.j.l.b
    public void setTintList(ColorStateList colorStateList) {
        this.f1835f.f1841c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, a.i.j.l.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1835f.f1842d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1837h.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
