package a.b.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s0 f686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s0 f687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s0 f688d;

    public m(ImageView imageView) {
        this.f685a = imageView;
    }

    public final boolean a(Drawable drawable) {
        if (this.f688d == null) {
            this.f688d = new s0();
        }
        s0 s0Var = this.f688d;
        s0Var.a();
        ColorStateList colorStateListA = a.i.s.e.a(this.f685a);
        if (colorStateListA != null) {
            s0Var.f753d = true;
            s0Var.f750a = colorStateListA;
        }
        PorterDuff.Mode modeB = a.i.s.e.b(this.f685a);
        if (modeB != null) {
            s0Var.f752c = true;
            s0Var.f751b = modeB;
        }
        if (!s0Var.f753d && !s0Var.f752c) {
            return false;
        }
        i.i(drawable, s0Var, this.f685a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable drawable = this.f685a.getDrawable();
        if (drawable != null) {
            b0.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            s0 s0Var = this.f687c;
            if (s0Var != null) {
                i.i(drawable, s0Var, this.f685a.getDrawableState());
                return;
            }
            s0 s0Var2 = this.f686b;
            if (s0Var2 != null) {
                i.i(drawable, s0Var2, this.f685a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        s0 s0Var = this.f687c;
        if (s0Var != null) {
            return s0Var.f750a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        s0 s0Var = this.f687c;
        if (s0Var != null) {
            return s0Var.f751b;
        }
        return null;
    }

    public boolean e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f685a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i2) {
        int iN;
        Context context = this.f685a.getContext();
        int[] iArr = a.b.j.R;
        u0 u0VarV = u0.v(context, attributeSet, iArr, i2, 0);
        ImageView imageView = this.f685a;
        a.i.r.x.n0(imageView, imageView.getContext(), iArr, attributeSet, u0VarV.r(), i2, 0);
        try {
            Drawable drawable = this.f685a.getDrawable();
            if (drawable == null && (iN = u0VarV.n(a.b.j.S, -1)) != -1 && (drawable = a.b.l.a.a.d(this.f685a.getContext(), iN)) != null) {
                this.f685a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                b0.b(drawable);
            }
            int i3 = a.b.j.T;
            if (u0VarV.s(i3)) {
                a.i.s.e.c(this.f685a, u0VarV.c(i3));
            }
            int i4 = a.b.j.U;
            if (u0VarV.s(i4)) {
                a.i.s.e.d(this.f685a, b0.e(u0VarV.k(i4, -1), null));
            }
        } finally {
            u0VarV.w();
        }
    }

    public void g(int i2) {
        if (i2 != 0) {
            Drawable drawableD = a.b.l.a.a.d(this.f685a.getContext(), i2);
            if (drawableD != null) {
                b0.b(drawableD);
            }
            this.f685a.setImageDrawable(drawableD);
        } else {
            this.f685a.setImageDrawable(null);
        }
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (this.f687c == null) {
            this.f687c = new s0();
        }
        s0 s0Var = this.f687c;
        s0Var.f750a = colorStateList;
        s0Var.f753d = true;
        b();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.f687c == null) {
            this.f687c = new s0();
        }
        s0 s0Var = this.f687c;
        s0Var.f751b = mode;
        s0Var.f752c = true;
        b();
    }

    public final boolean j() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 > 21 ? this.f686b != null : i2 == 21;
    }
}
