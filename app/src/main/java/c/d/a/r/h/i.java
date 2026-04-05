package c.d.a.r.h;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class i extends c.d.a.n.k.f.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.d.a.n.k.f.b f5933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f5934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5935d;

    public static class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f5936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5937b;

        public a(Drawable.ConstantState constantState, int i2) {
            this.f5936a = constantState;
            this.f5937b = i2;
        }

        public a(a aVar) {
            this(aVar.f5936a, aVar.f5937b);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return newDrawable(null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new i(this, null, resources);
        }
    }

    public i(c.d.a.n.k.f.b bVar, int i2) {
        this(new a(bVar.getConstantState(), i2), bVar, null);
    }

    public i(a aVar, c.d.a.n.k.f.b bVar, Resources resources) {
        this.f5934c = aVar;
        if (bVar != null) {
            this.f5933b = bVar;
        } else {
            Drawable.ConstantState constantState = aVar.f5936a;
            this.f5933b = (c.d.a.n.k.f.b) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
    }

    @Override // c.d.a.n.k.f.b
    public boolean b() {
        return this.f5933b.b();
    }

    @Override // c.d.a.n.k.f.b
    public void c(int i2) {
        this.f5933b.c(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f5933b.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f5933b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(19)
    public int getAlpha() {
        return this.f5933b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(11)
    public Drawable.Callback getCallback() {
        return this.f5933b.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f5933b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f5934c;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f5933b.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f5934c.f5937b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f5934c.f5937b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f5933b.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f5933b.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f5933b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f5933b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        this.f5933b.invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f5933b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f5935d && super.mutate() == this) {
            this.f5933b = (c.d.a.n.k.f.b) this.f5933b.mutate();
            this.f5934c = new a(this.f5934c);
            this.f5935d = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j2) {
        super.scheduleSelf(runnable, j2);
        this.f5933b.scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f5933b.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i2, int i3, int i4, int i5) {
        super.setBounds(i2, i3, i4, i5);
        this.f5933b.setBounds(i2, i3, i4, i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f5933b.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i2) {
        this.f5933b.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i2, PorterDuff.Mode mode) {
        this.f5933b.setColorFilter(i2, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f5933b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f5933b.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f5933b.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return this.f5933b.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f5933b.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f5933b.stop();
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f5933b.unscheduleSelf(runnable);
    }
}
