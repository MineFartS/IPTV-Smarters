package a.b.q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompoundButton f645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f646b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f647c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f648d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f649e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f650f;

    public h(CompoundButton compoundButton) {
        this.f645a = compoundButton;
    }

    public void a() {
        Drawable drawableA = a.i.s.c.a(this.f645a);
        if (drawableA != null) {
            if (this.f648d || this.f649e) {
                Drawable drawableMutate = a.i.j.l.a.r(drawableA).mutate();
                if (this.f648d) {
                    a.i.j.l.a.o(drawableMutate, this.f646b);
                }
                if (this.f649e) {
                    a.i.j.l.a.p(drawableMutate, this.f647c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f645a.getDrawableState());
                }
                this.f645a.setButtonDrawable(drawableMutate);
            }
        }
    }

    public int b(int i2) {
        Drawable drawableA;
        return (Build.VERSION.SDK_INT >= 17 || (drawableA = a.i.s.c.a(this.f645a)) == null) ? i2 : i2 + drawableA.getIntrinsicWidth();
    }

    public ColorStateList c() {
        return this.f646b;
    }

    public PorterDuff.Mode d() {
        return this.f647c;
    }

    public void e(AttributeSet attributeSet, int i2) {
        boolean z;
        int iN;
        int iN2;
        Context context = this.f645a.getContext();
        int[] iArr = a.b.j.R0;
        u0 u0VarV = u0.v(context, attributeSet, iArr, i2, 0);
        CompoundButton compoundButton = this.f645a;
        a.i.r.x.n0(compoundButton, compoundButton.getContext(), iArr, attributeSet, u0VarV.r(), i2, 0);
        try {
            int i3 = a.b.j.T0;
            if (!u0VarV.s(i3) || (iN2 = u0VarV.n(i3, 0)) == 0) {
                z = false;
            } else {
                try {
                    CompoundButton compoundButton2 = this.f645a;
                    compoundButton2.setButtonDrawable(a.b.l.a.a.d(compoundButton2.getContext(), iN2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                    z = false;
                }
            }
            if (!z) {
                int i4 = a.b.j.S0;
                if (u0VarV.s(i4) && (iN = u0VarV.n(i4, 0)) != 0) {
                    CompoundButton compoundButton3 = this.f645a;
                    compoundButton3.setButtonDrawable(a.b.l.a.a.d(compoundButton3.getContext(), iN));
                }
            }
            int i5 = a.b.j.U0;
            if (u0VarV.s(i5)) {
                a.i.s.c.c(this.f645a, u0VarV.c(i5));
            }
            int i6 = a.b.j.V0;
            if (u0VarV.s(i6)) {
                a.i.s.c.d(this.f645a, b0.e(u0VarV.k(i6, -1), null));
            }
        } finally {
            u0VarV.w();
        }
    }

    public void f() {
        if (this.f650f) {
            this.f650f = false;
        } else {
            this.f650f = true;
            a();
        }
    }

    public void g(ColorStateList colorStateList) {
        this.f646b = colorStateList;
        this.f648d = true;
        a();
    }

    public void h(PorterDuff.Mode mode) {
        this.f647c = mode;
        this.f649e = true;
        a();
    }
}
