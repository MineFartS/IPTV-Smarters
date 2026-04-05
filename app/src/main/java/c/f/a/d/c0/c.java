package c.f.a.d.c0;

import a.i.q.i;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import c.f.a.d.j0.g;
import c.f.a.d.j0.k;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class c extends b {

    public static class a extends g {
        public a(k kVar) {
            super(kVar);
        }

        @Override // c.f.a.d.j0.g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public c(FloatingActionButton floatingActionButton, c.f.a.d.i0.b bVar) {
        super(floatingActionButton, bVar);
    }

    @Override // c.f.a.d.c0.b
    public void A() {
    }

    @Override // c.f.a.d.c0.b
    public void C() {
        f0();
    }

    @Override // c.f.a.d.c0.b
    public void E(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f2 = 0.0f;
            if (this.F.isEnabled()) {
                this.F.setElevation(this.f14682o);
                if (this.F.isPressed()) {
                    floatingActionButton = this.F;
                    f2 = this.q;
                } else if (this.F.isFocused() || this.F.isHovered()) {
                    floatingActionButton = this.F;
                    f2 = this.p;
                }
                floatingActionButton.setTranslationZ(f2);
            }
            this.F.setElevation(0.0f);
            floatingActionButton = this.F;
            floatingActionButton.setTranslationZ(f2);
        }
    }

    @Override // c.f.a.d.c0.b
    public void F(float f2, float f3, float f4) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 21) {
            this.F.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(b.f14669b, j0(f2, f4));
            stateListAnimator.addState(b.f14670c, j0(f2, f3));
            stateListAnimator.addState(b.f14671d, j0(f2, f3));
            stateListAnimator.addState(b.f14672e, j0(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.F, "elevation", f2).setDuration(0L));
            if (i2 >= 22 && i2 <= 24) {
                FloatingActionButton floatingActionButton = this.F;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.F, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(b.f14668a);
            stateListAnimator.addState(b.f14673f, animatorSet);
            stateListAnimator.addState(b.f14674g, j0(0.0f, 0.0f));
            this.F.setStateListAnimator(stateListAnimator);
        }
        if (Z()) {
            f0();
        }
    }

    @Override // c.f.a.d.c0.b
    public boolean K() {
        return false;
    }

    @Override // c.f.a.d.c0.b
    public void V(ColorStateList colorStateList) {
        Drawable drawable = this.f14677j;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(c.f.a.d.h0.b.d(colorStateList));
        } else {
            super.V(colorStateList);
        }
    }

    @Override // c.f.a.d.c0.b
    public boolean Z() {
        return this.G.c() || !b0();
    }

    @Override // c.f.a.d.c0.b
    public void d0() {
    }

    public c.f.a.d.c0.a i0(int i2, ColorStateList colorStateList) {
        Context context = this.F.getContext();
        c.f.a.d.c0.a aVar = new c.f.a.d.c0.a((k) i.e(this.f14675h));
        aVar.e(a.i.i.b.d(context, c.f.a.d.c.f14646e), a.i.i.b.d(context, c.f.a.d.c.f14645d), a.i.i.b.d(context, c.f.a.d.c.f14643b), a.i.i.b.d(context, c.f.a.d.c.f14644c));
        aVar.d(i2);
        aVar.c(colorStateList);
        return aVar;
    }

    @Override // c.f.a.d.c0.b
    public g j() {
        return new a((k) i.e(this.f14675h));
    }

    public final Animator j0(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.F, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(this.F, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(b.f14668a);
        return animatorSet;
    }

    @Override // c.f.a.d.c0.b
    public float n() {
        return this.F.getElevation();
    }

    @Override // c.f.a.d.c0.b
    public void s(Rect rect) {
        if (this.G.c()) {
            super.s(rect);
        } else {
            int sizeDimension = !b0() ? (this.r - this.F.getSizeDimension()) / 2 : 0;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // c.f.a.d.c0.b
    public void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        Drawable layerDrawable;
        g gVarJ = j();
        this.f14676i = gVarJ;
        gVarJ.setTintList(colorStateList);
        if (mode != null) {
            this.f14676i.setTintMode(mode);
        }
        this.f14676i.M(this.F.getContext());
        if (i2 > 0) {
            this.f14678k = i0(i2, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) i.e(this.f14678k), (Drawable) i.e(this.f14676i)});
        } else {
            this.f14678k = null;
            layerDrawable = this.f14676i;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(c.f.a.d.h0.b.d(colorStateList2), layerDrawable, null);
        this.f14677j = rippleDrawable;
        this.f14679l = rippleDrawable;
    }
}
