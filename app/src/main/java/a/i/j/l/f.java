package a.i.j.l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable.ConstantState f1840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f1841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f1842d;

    public f(f fVar) {
        this.f1841c = null;
        this.f1842d = d.f1831b;
        if (fVar != null) {
            this.f1839a = fVar.f1839a;
            this.f1840b = fVar.f1840b;
            this.f1841c = fVar.f1841c;
            this.f1842d = fVar.f1842d;
        }
    }

    public boolean a() {
        return this.f1840b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i2 = this.f1839a;
        Drawable.ConstantState constantState = this.f1840b;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new e(this, resources) : new d(this, resources);
    }
}
