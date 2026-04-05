package c.f.a.d.h0;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import c.f.a.d.j0.g;
import c.f.a.d.j0.k;
import c.f.a.d.j0.n;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Drawable implements n, a.i.j.l.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f14842b;

    public static final class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f14843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f14844b;

        public b(b bVar) {
            this.f14843a = (g) bVar.f14843a.getConstantState().newDrawable();
            this.f14844b = bVar.f14844b;
        }

        public b(g gVar) {
            this.f14843a = gVar;
            this.f14844b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }
    }

    public a(b bVar) {
        this.f14842b = bVar;
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f14842b = new b(this.f14842b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f14842b;
        if (bVar.f14844b) {
            bVar.f14843a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f14842b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f14842b.f14843a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f14842b.f14843a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f14842b.f14843a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zE = c.f.a.d.h0.b.e(iArr);
        b bVar = this.f14842b;
        if (bVar.f14844b == zE) {
            return zOnStateChange;
        }
        bVar.f14844b = zE;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f14842b.f14843a.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f14842b.f14843a.setColorFilter(colorFilter);
    }

    @Override // c.f.a.d.j0.n
    public void setShapeAppearanceModel(k kVar) {
        this.f14842b.f14843a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable, a.i.j.l.b
    public void setTint(int i2) {
        this.f14842b.f14843a.setTint(i2);
    }

    @Override // android.graphics.drawable.Drawable, a.i.j.l.b
    public void setTintList(ColorStateList colorStateList) {
        this.f14842b.f14843a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, a.i.j.l.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f14842b.f14843a.setTintMode(mode);
    }
}
