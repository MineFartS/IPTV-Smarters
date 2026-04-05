package c.f.a.d.q;

import a.i.r.x;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import c.f.a.d.b;
import c.f.a.d.g0.c;
import c.f.a.d.j0.g;
import c.f.a.d.j0.k;
import c.f.a.d.j0.n;
import c.f.a.d.l;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f15219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialButton f15220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f15221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PorterDuff.Mode f15228j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f15229k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f15230l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ColorStateList f15231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f15232n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15233o = false;
    public boolean p = false;
    public boolean q = false;
    public boolean r;
    public LayerDrawable s;
    public int t;

    static {
        f15219a = Build.VERSION.SDK_INT >= 21;
    }

    public a(MaterialButton materialButton, k kVar) {
        this.f15220b = materialButton;
        this.f15221c = kVar;
    }

    public void A(ColorStateList colorStateList) {
        if (this.f15230l != colorStateList) {
            this.f15230l = colorStateList;
            I();
        }
    }

    public void B(int i2) {
        if (this.f15227i != i2) {
            this.f15227i = i2;
            I();
        }
    }

    public void C(ColorStateList colorStateList) {
        if (this.f15229k != colorStateList) {
            this.f15229k = colorStateList;
            if (f() != null) {
                a.i.j.l.a.o(f(), this.f15229k);
            }
        }
    }

    public void D(PorterDuff.Mode mode) {
        if (this.f15228j != mode) {
            this.f15228j = mode;
            if (f() == null || this.f15228j == null) {
                return;
            }
            a.i.j.l.a.p(f(), this.f15228j);
        }
    }

    public final void E(int i2, int i3) {
        int I = x.I(this.f15220b);
        int paddingTop = this.f15220b.getPaddingTop();
        int iH = x.H(this.f15220b);
        int paddingBottom = this.f15220b.getPaddingBottom();
        int i4 = this.f15224f;
        int i5 = this.f15225g;
        this.f15225g = i3;
        this.f15224f = i2;
        if (!this.p) {
            F();
        }
        x.B0(this.f15220b, I, (paddingTop + i2) - i4, iH, (paddingBottom + i3) - i5);
    }

    public final void F() {
        this.f15220b.setInternalBackground(a());
        g gVarF = f();
        if (gVarF != null) {
            gVarF.W(this.t);
        }
    }

    public final void G(k kVar) {
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    public void H(int i2, int i3) {
        Drawable drawable = this.f15232n;
        if (drawable != null) {
            drawable.setBounds(this.f15222d, this.f15224f, i3 - this.f15223e, i2 - this.f15225g);
        }
    }

    public final void I() {
        g gVarF = f();
        g gVarN = n();
        if (gVarF != null) {
            gVarF.e0(this.f15227i, this.f15230l);
            if (gVarN != null) {
                gVarN.d0(this.f15227i, this.f15233o ? c.f.a.d.w.a.c(this.f15220b, b.f14636m) : 0);
            }
        }
    }

    public final InsetDrawable J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f15222d, this.f15224f, this.f15223e, this.f15225g);
    }

    public final Drawable a() {
        g gVar = new g(this.f15221c);
        gVar.M(this.f15220b.getContext());
        a.i.j.l.a.o(gVar, this.f15229k);
        PorterDuff.Mode mode = this.f15228j;
        if (mode != null) {
            a.i.j.l.a.p(gVar, mode);
        }
        gVar.e0(this.f15227i, this.f15230l);
        g gVar2 = new g(this.f15221c);
        gVar2.setTint(0);
        gVar2.d0(this.f15227i, this.f15233o ? c.f.a.d.w.a.c(this.f15220b, b.f14636m) : 0);
        if (f15219a) {
            g gVar3 = new g(this.f15221c);
            this.f15232n = gVar3;
            a.i.j.l.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(c.f.a.d.h0.b.d(this.f15231m), J(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f15232n);
            this.s = rippleDrawable;
            return rippleDrawable;
        }
        c.f.a.d.h0.a aVar = new c.f.a.d.h0.a(this.f15221c);
        this.f15232n = aVar;
        a.i.j.l.a.o(aVar, c.f.a.d.h0.b.d(this.f15231m));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f15232n});
        this.s = layerDrawable;
        return J(layerDrawable);
    }

    public int b() {
        return this.f15226h;
    }

    public int c() {
        return this.f15225g;
    }

    public int d() {
        return this.f15224f;
    }

    public n e() {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (n) (this.s.getNumberOfLayers() > 2 ? this.s.getDrawable(2) : this.s.getDrawable(1));
    }

    public g f() {
        return g(false);
    }

    public final g g(boolean z) {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) (f15219a ? (LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable() : this.s).getDrawable(!z ? 1 : 0);
    }

    public ColorStateList h() {
        return this.f15231m;
    }

    public k i() {
        return this.f15221c;
    }

    public ColorStateList j() {
        return this.f15230l;
    }

    public int k() {
        return this.f15227i;
    }

    public ColorStateList l() {
        return this.f15229k;
    }

    public PorterDuff.Mode m() {
        return this.f15228j;
    }

    public final g n() {
        return g(true);
    }

    public boolean o() {
        return this.p;
    }

    public boolean p() {
        return this.r;
    }

    public void q(TypedArray typedArray) {
        this.f15222d = typedArray.getDimensionPixelOffset(l.t2, 0);
        this.f15223e = typedArray.getDimensionPixelOffset(l.u2, 0);
        this.f15224f = typedArray.getDimensionPixelOffset(l.v2, 0);
        this.f15225g = typedArray.getDimensionPixelOffset(l.w2, 0);
        int i2 = l.A2;
        if (typedArray.hasValue(i2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            this.f15226h = dimensionPixelSize;
            y(this.f15221c.w(dimensionPixelSize));
            this.q = true;
        }
        this.f15227i = typedArray.getDimensionPixelSize(l.K2, 0);
        this.f15228j = c.f.a.d.d0.k.e(typedArray.getInt(l.z2, -1), PorterDuff.Mode.SRC_IN);
        this.f15229k = c.a(this.f15220b.getContext(), typedArray, l.y2);
        this.f15230l = c.a(this.f15220b.getContext(), typedArray, l.J2);
        this.f15231m = c.a(this.f15220b.getContext(), typedArray, l.I2);
        this.r = typedArray.getBoolean(l.x2, false);
        this.t = typedArray.getDimensionPixelSize(l.B2, 0);
        int I = x.I(this.f15220b);
        int paddingTop = this.f15220b.getPaddingTop();
        int iH = x.H(this.f15220b);
        int paddingBottom = this.f15220b.getPaddingBottom();
        if (typedArray.hasValue(l.s2)) {
            s();
        } else {
            F();
        }
        x.B0(this.f15220b, I + this.f15222d, paddingTop + this.f15224f, iH + this.f15223e, paddingBottom + this.f15225g);
    }

    public void r(int i2) {
        if (f() != null) {
            f().setTint(i2);
        }
    }

    public void s() {
        this.p = true;
        this.f15220b.setSupportBackgroundTintList(this.f15229k);
        this.f15220b.setSupportBackgroundTintMode(this.f15228j);
    }

    public void t(boolean z) {
        this.r = z;
    }

    public void u(int i2) {
        if (this.q && this.f15226h == i2) {
            return;
        }
        this.f15226h = i2;
        this.q = true;
        y(this.f15221c.w(i2));
    }

    public void v(int i2) {
        E(this.f15224f, i2);
    }

    public void w(int i2) {
        E(i2, this.f15225g);
    }

    public void x(ColorStateList colorStateList) {
        if (this.f15231m != colorStateList) {
            this.f15231m = colorStateList;
            boolean z = f15219a;
            if (z && (this.f15220b.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f15220b.getBackground()).setColor(c.f.a.d.h0.b.d(colorStateList));
            } else {
                if (z || !(this.f15220b.getBackground() instanceof c.f.a.d.h0.a)) {
                    return;
                }
                ((c.f.a.d.h0.a) this.f15220b.getBackground()).setTintList(c.f.a.d.h0.b.d(colorStateList));
            }
        }
    }

    public void y(k kVar) {
        this.f15221c = kVar;
        G(kVar);
    }

    public void z(boolean z) {
        this.f15233o = z;
        I();
    }
}
