package a.b.q;

import a.i.i.e.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s0 f811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s0 f812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s0 f813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s0 f814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s0 f815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s0 f816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s0 f817h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x f818i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f819j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f820k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f821l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f822m;

    public class a extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f825c;

        public a(int i2, int i3, WeakReference weakReference) {
            this.f823a = i2;
            this.f824b = i3;
            this.f825c = weakReference;
        }

        @Override // a.i.i.e.f.a
        public void d(int i2) {
        }

        @Override // a.i.i.e.f.a
        public void e(Typeface typeface) {
            int i2;
            if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f823a) != -1) {
                typeface = Typeface.create(typeface, i2, (this.f824b & 2) != 0);
            }
            w.this.n(this.f825c, typeface);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Typeface f828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f829d;

        public b(TextView textView, Typeface typeface, int i2) {
            this.f827b = textView;
            this.f828c = typeface;
            this.f829d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f827b.setTypeface(this.f828c, this.f829d);
        }
    }

    public w(TextView textView) {
        this.f810a = textView;
        this.f818i = new x(textView);
    }

    public static s0 d(Context context, i iVar, int i2) {
        ColorStateList colorStateListF = iVar.f(context, i2);
        if (colorStateListF == null) {
            return null;
        }
        s0 s0Var = new s0();
        s0Var.f753d = true;
        s0Var.f750a = colorStateListF;
        return s0Var;
    }

    public void A(int i2, float f2) {
        if (a.i.s.b.a0 || l()) {
            return;
        }
        B(i2, f2);
    }

    public final void B(int i2, float f2) {
        this.f818i.y(i2, f2);
    }

    public final void C(Context context, u0 u0Var) {
        String strO;
        Typeface typefaceCreate;
        Typeface typeface;
        this.f819j = u0Var.k(a.b.j.i3, this.f819j);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int iK = u0Var.k(a.b.j.n3, -1);
            this.f820k = iK;
            if (iK != -1) {
                this.f819j = (this.f819j & 2) | 0;
            }
        }
        int i3 = a.b.j.m3;
        if (!u0Var.s(i3) && !u0Var.s(a.b.j.o3)) {
            int i4 = a.b.j.h3;
            if (u0Var.s(i4)) {
                this.f822m = false;
                int iK2 = u0Var.k(i4, 1);
                if (iK2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (iK2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (iK2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f821l = typeface;
                return;
            }
            return;
        }
        this.f821l = null;
        int i5 = a.b.j.o3;
        if (u0Var.s(i5)) {
            i3 = i5;
        }
        int i6 = this.f820k;
        int i7 = this.f819j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = u0Var.j(i3, this.f819j, new a(i6, i7, new WeakReference(this.f810a)));
                if (typefaceJ != null) {
                    if (i2 >= 28 && this.f820k != -1) {
                        typefaceJ = Typeface.create(Typeface.create(typefaceJ, 0), this.f820k, (this.f819j & 2) != 0);
                    }
                    this.f821l = typefaceJ;
                }
                this.f822m = this.f821l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f821l != null || (strO = u0Var.o(i3)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f820k == -1) {
            typefaceCreate = Typeface.create(strO, this.f819j);
        } else {
            typefaceCreate = Typeface.create(Typeface.create(strO, 0), this.f820k, (this.f819j & 2) != 0);
        }
        this.f821l = typefaceCreate;
    }

    public final void a(Drawable drawable, s0 s0Var) {
        if (drawable == null || s0Var == null) {
            return;
        }
        i.i(drawable, s0Var, this.f810a.getDrawableState());
    }

    public void b() {
        if (this.f811b != null || this.f812c != null || this.f813d != null || this.f814e != null) {
            Drawable[] compoundDrawables = this.f810a.getCompoundDrawables();
            a(compoundDrawables[0], this.f811b);
            a(compoundDrawables[1], this.f812c);
            a(compoundDrawables[2], this.f813d);
            a(compoundDrawables[3], this.f814e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f815f == null && this.f816g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f810a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f815f);
            a(compoundDrawablesRelative[2], this.f816g);
        }
    }

    public void c() {
        this.f818i.b();
    }

    public int e() {
        return this.f818i.j();
    }

    public int f() {
        return this.f818i.k();
    }

    public int g() {
        return this.f818i.l();
    }

    public int[] h() {
        return this.f818i.m();
    }

    public int i() {
        return this.f818i.n();
    }

    public ColorStateList j() {
        s0 s0Var = this.f817h;
        if (s0Var != null) {
            return s0Var.f750a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        s0 s0Var = this.f817h;
        if (s0Var != null) {
            return s0Var.f751b;
        }
        return null;
    }

    public boolean l() {
        return this.f818i.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a6  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instruction units count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.q.w.m(android.util.AttributeSet, int):void");
    }

    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f822m) {
            this.f821l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (a.i.r.x.T(textView)) {
                    textView.post(new b(textView, typeface, this.f819j));
                } else {
                    textView.setTypeface(typeface, this.f819j);
                }
            }
        }
    }

    public void o(boolean z, int i2, int i3, int i4, int i5) {
        if (a.i.s.b.a0) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i2) {
        String strO;
        ColorStateList colorStateListC;
        ColorStateList colorStateListC2;
        ColorStateList colorStateListC3;
        u0 u0VarT = u0.t(context, i2, a.b.j.f3);
        int i3 = a.b.j.q3;
        if (u0VarT.s(i3)) {
            s(u0VarT.a(i3, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23) {
            int i5 = a.b.j.j3;
            if (u0VarT.s(i5) && (colorStateListC3 = u0VarT.c(i5)) != null) {
                this.f810a.setTextColor(colorStateListC3);
            }
            int i6 = a.b.j.l3;
            if (u0VarT.s(i6) && (colorStateListC2 = u0VarT.c(i6)) != null) {
                this.f810a.setLinkTextColor(colorStateListC2);
            }
            int i7 = a.b.j.k3;
            if (u0VarT.s(i7) && (colorStateListC = u0VarT.c(i7)) != null) {
                this.f810a.setHintTextColor(colorStateListC);
            }
        }
        int i8 = a.b.j.g3;
        if (u0VarT.s(i8) && u0VarT.f(i8, -1) == 0) {
            this.f810a.setTextSize(0, 0.0f);
        }
        C(context, u0VarT);
        if (i4 >= 26) {
            int i9 = a.b.j.p3;
            if (u0VarT.s(i9) && (strO = u0VarT.o(i9)) != null) {
                this.f810a.setFontVariationSettings(strO);
            }
        }
        u0VarT.w();
        Typeface typeface = this.f821l;
        if (typeface != null) {
            this.f810a.setTypeface(typeface, this.f819j);
        }
    }

    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        a.i.r.i0.a.f(editorInfo, textView.getText());
    }

    public void s(boolean z) {
        this.f810a.setAllCaps(z);
    }

    public void t(int i2, int i3, int i4, int i5) {
        this.f818i.u(i2, i3, i4, i5);
    }

    public void u(int[] iArr, int i2) {
        this.f818i.v(iArr, i2);
    }

    public void v(int i2) {
        this.f818i.w(i2);
    }

    public void w(ColorStateList colorStateList) {
        if (this.f817h == null) {
            this.f817h = new s0();
        }
        s0 s0Var = this.f817h;
        s0Var.f750a = colorStateList;
        s0Var.f753d = colorStateList != null;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        if (this.f817h == null) {
            this.f817h = new s0();
        }
        s0 s0Var = this.f817h;
        s0Var.f751b = mode;
        s0Var.f752c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f810a.getCompoundDrawablesRelative();
            TextView textView = this.f810a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        if (i2 >= 17) {
            Drawable[] compoundDrawablesRelative2 = this.f810a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                TextView textView2 = this.f810a;
                Drawable drawable7 = compoundDrawablesRelative2[0];
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable8 = compoundDrawablesRelative2[2];
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative2[3];
                }
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                return;
            }
        }
        Drawable[] compoundDrawables = this.f810a.getCompoundDrawables();
        TextView textView3 = this.f810a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public final void z() {
        s0 s0Var = this.f817h;
        this.f811b = s0Var;
        this.f812c = s0Var;
        this.f813d = s0Var;
        this.f814e = s0Var;
        this.f815f = s0Var;
        this.f816g = s0Var;
    }
}
