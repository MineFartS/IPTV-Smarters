package a.b.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f589a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s0 f592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s0 f593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s0 f594f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f591c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f590b = i.b();

    public e(View view) {
        this.f589a = view;
    }

    public final boolean a(Drawable drawable) {
        if (this.f594f == null) {
            this.f594f = new s0();
        }
        s0 s0Var = this.f594f;
        s0Var.a();
        ColorStateList colorStateListS = a.i.r.x.s(this.f589a);
        if (colorStateListS != null) {
            s0Var.f753d = true;
            s0Var.f750a = colorStateListS;
        }
        PorterDuff.Mode modeT = a.i.r.x.t(this.f589a);
        if (modeT != null) {
            s0Var.f752c = true;
            s0Var.f751b = modeT;
        }
        if (!s0Var.f753d && !s0Var.f752c) {
            return false;
        }
        i.i(drawable, s0Var, this.f589a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.f589a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            s0 s0Var = this.f593e;
            if (s0Var != null) {
                i.i(background, s0Var, this.f589a.getDrawableState());
                return;
            }
            s0 s0Var2 = this.f592d;
            if (s0Var2 != null) {
                i.i(background, s0Var2, this.f589a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        s0 s0Var = this.f593e;
        if (s0Var != null) {
            return s0Var.f750a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        s0 s0Var = this.f593e;
        if (s0Var != null) {
            return s0Var.f751b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i2) {
        Context context = this.f589a.getContext();
        int[] iArr = a.b.j.Z3;
        u0 u0VarV = u0.v(context, attributeSet, iArr, i2, 0);
        View view = this.f589a;
        a.i.r.x.n0(view, view.getContext(), iArr, attributeSet, u0VarV.r(), i2, 0);
        try {
            int i3 = a.b.j.a4;
            if (u0VarV.s(i3)) {
                this.f591c = u0VarV.n(i3, -1);
                ColorStateList colorStateListF = this.f590b.f(this.f589a.getContext(), this.f591c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            int i4 = a.b.j.b4;
            if (u0VarV.s(i4)) {
                a.i.r.x.t0(this.f589a, u0VarV.c(i4));
            }
            int i5 = a.b.j.c4;
            if (u0VarV.s(i5)) {
                a.i.r.x.u0(this.f589a, b0.e(u0VarV.k(i5, -1), null));
            }
        } finally {
            u0VarV.w();
        }
    }

    public void f(Drawable drawable) {
        this.f591c = -1;
        h(null);
        b();
    }

    public void g(int i2) {
        this.f591c = i2;
        i iVar = this.f590b;
        h(iVar != null ? iVar.f(this.f589a.getContext(), i2) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f592d == null) {
                this.f592d = new s0();
            }
            s0 s0Var = this.f592d;
            s0Var.f750a = colorStateList;
            s0Var.f753d = true;
        } else {
            this.f592d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f593e == null) {
            this.f593e = new s0();
        }
        s0 s0Var = this.f593e;
        s0Var.f750a = colorStateList;
        s0Var.f753d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f593e == null) {
            this.f593e = new s0();
        }
        s0 s0Var = this.f593e;
        s0Var.f751b = mode;
        s0Var.f752c = true;
        b();
    }

    public final boolean k() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 > 21 ? this.f592d != null : i2 == 21;
    }
}
