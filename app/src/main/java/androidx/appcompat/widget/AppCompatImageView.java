package androidx.appcompat.widget;

import a.b.q.e;
import a.b.q.p0;
import a.b.q.r0;
import a.i.r.w;
import a.i.s.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements w, m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f4171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.b.q.m f4172c;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i2) {
        super(r0.b(context), attributeSet, i2);
        p0.a(this, getContext());
        e eVar = new e(this);
        this.f4171b = eVar;
        eVar.e(attributeSet, i2);
        a.b.q.m mVar = new a.b.q.m(this);
        this.f4172c = mVar;
        mVar.f(attributeSet, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f4171b;
        if (eVar != null) {
            eVar.b();
        }
        a.b.q.m mVar = this.f4172c;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // a.i.r.w
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f4171b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // a.i.r.w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f4171b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // a.i.s.m
    public ColorStateList getSupportImageTintList() {
        a.b.q.m mVar = this.f4172c;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    @Override // a.i.s.m
    public PorterDuff.Mode getSupportImageTintMode() {
        a.b.q.m mVar = this.f4172c;
        if (mVar != null) {
            return mVar.d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f4172c.e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f4171b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f4171b;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        a.b.q.m mVar = this.f4172c;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        a.b.q.m mVar = this.f4172c;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        a.b.q.m mVar = this.f4172c;
        if (mVar != null) {
            mVar.g(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        a.b.q.m mVar = this.f4172c;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // a.i.r.w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f4171b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // a.i.r.w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f4171b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // a.i.s.m
    public void setSupportImageTintList(ColorStateList colorStateList) {
        a.b.q.m mVar = this.f4172c;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    @Override // a.i.s.m
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        a.b.q.m mVar = this.f4172c;
        if (mVar != null) {
            mVar.i(mode);
        }
    }
}
