package a.b.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes.dex */
public class l extends ImageButton implements a.i.r.w, a.i.s.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f683c;

    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.a.E);
    }

    public l(Context context, AttributeSet attributeSet, int i2) {
        super(r0.b(context), attributeSet, i2);
        p0.a(this, getContext());
        e eVar = new e(this);
        this.f682b = eVar;
        eVar.e(attributeSet, i2);
        m mVar = new m(this);
        this.f683c = mVar;
        mVar.f(attributeSet, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f682b;
        if (eVar != null) {
            eVar.b();
        }
        m mVar = this.f683c;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // a.i.r.w
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f682b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // a.i.r.w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f682b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // a.i.s.m
    public ColorStateList getSupportImageTintList() {
        m mVar = this.f683c;
        if (mVar != null) {
            return mVar.c();
        }
        return null;
    }

    @Override // a.i.s.m
    public PorterDuff.Mode getSupportImageTintMode() {
        m mVar = this.f683c;
        if (mVar != null) {
            return mVar.d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f683c.e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f682b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f682b;
        if (eVar != null) {
            eVar.g(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m mVar = this.f683c;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m mVar = this.f683c;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        this.f683c.g(i2);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m mVar = this.f683c;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // a.i.r.w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f682b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // a.i.r.w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f682b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // a.i.s.m
    public void setSupportImageTintList(ColorStateList colorStateList) {
        m mVar = this.f683c;
        if (mVar != null) {
            mVar.h(colorStateList);
        }
    }

    @Override // a.i.s.m
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        m mVar = this.f683c;
        if (mVar != null) {
            mVar.i(mode);
        }
    }
}
