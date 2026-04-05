package com.google.android.material.transformation;

import a.i.r.x;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.f.a.d.f;
import c.f.a.d.m.h;
import c.f.a.d.m.i;
import c.f.a.d.m.j;
import c.f.a.d.v.d;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f24621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f24622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f24623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f24624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f24625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f24626h;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f24627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f24628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f24629d;

        public a(boolean z, View view, View view2) {
            this.f24627b = z;
            this.f24628c = view;
            this.f24629d = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f24627b) {
                return;
            }
            this.f24628c.setVisibility(4);
            this.f24629d.setAlpha(1.0f);
            this.f24629d.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f24627b) {
                this.f24628c.setVisibility(0);
                this.f24629d.setAlpha(0.0f);
                this.f24629d.setVisibility(4);
            }
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f24631b;

        public b(View view) {
            this.f24631b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f24631b.invalidate();
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c.f.a.d.v.d f24633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Drawable f24634c;

        public c(c.f.a.d.v.d dVar, Drawable drawable) {
            this.f24633b = dVar;
            this.f24634c = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f24633b.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f24633b.setCircularRevealOverlayDrawable(this.f24634c);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c.f.a.d.v.d f24636b;

        public d(c.f.a.d.v.d dVar) {
            this.f24636b = dVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.e revealInfo = this.f24636b.getRevealInfo();
            revealInfo.f15252c = Float.MAX_VALUE;
            this.f24636b.setRevealInfo(revealInfo);
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f24638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j f24639b;
    }

    public FabTransformationBehavior() {
        this.f24621c = new Rect();
        this.f24622d = new RectF();
        this.f24623e = new RectF();
        this.f24624f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24621c = new Rect();
        this.f24622d = new RectF();
        this.f24623e = new RectF();
        this.f24624f = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet J(View view, View view2, boolean z, boolean z2) {
        e eVarE0 = e0(view2.getContext(), z);
        if (z) {
            this.f24625g = view.getTranslationX();
            this.f24626h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            X(view, view2, z, z2, eVarE0, arrayList, arrayList2);
        }
        RectF rectF = this.f24622d;
        c0(view, view2, z, z2, eVarE0, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        W(view, view2, z, eVarE0, arrayList);
        Z(view, view2, z, z2, eVarE0, arrayList, arrayList2);
        Y(view, view2, z, z2, eVarE0, fWidth, fHeight, arrayList, arrayList2);
        V(view, view2, z, z2, eVarE0, arrayList, arrayList2);
        U(view, view2, z, z2, eVarE0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        c.f.a.d.m.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z, view2, view));
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            animatorSet.addListener(arrayList2.get(i2));
        }
        return animatorSet;
    }

    public final ViewGroup K(View view) {
        View viewFindViewById = view.findViewById(f.A);
        return viewFindViewById != null ? f0(viewFindViewById) : ((view instanceof c.f.a.d.q0.b) || (view instanceof c.f.a.d.q0.a)) ? f0(((ViewGroup) view).getChildAt(0)) : f0(view);
    }

    public final void L(View view, e eVar, i iVar, i iVar2, float f2, float f3, float f4, float f5, RectF rectF) {
        float fS = S(eVar, iVar, f2, f4);
        float fS2 = S(eVar, iVar2, f3, f5);
        Rect rect = this.f24621c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f24622d;
        rectF2.set(rect);
        RectF rectF3 = this.f24623e;
        T(view, rectF3);
        rectF3.offset(fS, fS2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    public final void M(View view, RectF rectF) {
        T(view, rectF);
        rectF.offset(this.f24625g, this.f24626h);
    }

    public final Pair<i, i> N(float f2, float f3, boolean z, e eVar) {
        i iVarE;
        h hVar;
        String str;
        if (f2 == 0.0f || f3 == 0.0f) {
            iVarE = eVar.f24638a.e("translationXLinear");
            hVar = eVar.f24638a;
            str = "translationYLinear";
        } else if ((!z || f3 >= 0.0f) && (z || f3 <= 0.0f)) {
            iVarE = eVar.f24638a.e("translationXCurveDownwards");
            hVar = eVar.f24638a;
            str = "translationYCurveDownwards";
        } else {
            iVarE = eVar.f24638a.e("translationXCurveUpwards");
            hVar = eVar.f24638a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(iVarE, hVar.e(str));
    }

    public final float O(View view, View view2, j jVar) {
        RectF rectF = this.f24622d;
        RectF rectF2 = this.f24623e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(-Q(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    public final float P(View view, View view2, j jVar) {
        RectF rectF = this.f24622d;
        RectF rectF2 = this.f24623e;
        M(view, rectF);
        T(view2, rectF2);
        rectF2.offset(0.0f, -R(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    public final float Q(View view, View view2, j jVar) {
        float fCenterX;
        float fCenterX2;
        float f2;
        RectF rectF = this.f24622d;
        RectF rectF2 = this.f24623e;
        M(view, rectF);
        T(view2, rectF2);
        int i2 = jVar.f15062a & 7;
        if (i2 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i2 == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (i2 != 5) {
                f2 = 0.0f;
                return f2 + jVar.f15063b;
            }
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        }
        f2 = fCenterX - fCenterX2;
        return f2 + jVar.f15063b;
    }

    public final float R(View view, View view2, j jVar) {
        float fCenterY;
        float fCenterY2;
        float f2;
        RectF rectF = this.f24622d;
        RectF rectF2 = this.f24623e;
        M(view, rectF);
        T(view2, rectF2);
        int i2 = jVar.f15062a & 112;
        if (i2 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i2 == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (i2 != 80) {
                f2 = 0.0f;
                return f2 + jVar.f15064c;
            }
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        }
        f2 = fCenterY - fCenterY2;
        return f2 + jVar.f15064c;
    }

    public final float S(e eVar, i iVar, float f2, float f3) {
        long jC = iVar.c();
        long jD = iVar.d();
        i iVarE = eVar.f24638a.e("expansion");
        return c.f.a.d.m.a.a(f2, f3, iVar.e().getInterpolation((((iVarE.c() + iVarE.d()) + 17) - jC) / jD));
    }

    public final void T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f24624f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public final void U(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup viewGroupK;
        ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof c.f.a.d.v.d) && c.f.a.d.v.c.f15245a == 0) || (viewGroupK = K(view2)) == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    c.f.a.d.m.d.f15048a.set(viewGroupK, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupK, c.f.a.d.m.d.f15048a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupK, c.f.a.d.m.d.f15048a, 0.0f);
            }
            eVar.f24638a.e("contentFade").a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof c.f.a.d.v.d) {
            c.f.a.d.v.d dVar = (c.f.a.d.v.d) view2;
            int iD0 = d0(view);
            int i2 = 16777215 & iD0;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(iD0);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(dVar, d.C0179d.f15249a, i2);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(dVar, d.C0179d.f15249a, iD0);
            }
            objectAnimatorOfInt.setEvaluator(c.f.a.d.m.c.b());
            eVar.f24638a.e("color").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    public final void W(View view, View view2, boolean z, e eVar, List<Animator> list) {
        float fQ = Q(view, view2, eVar.f24639b);
        float fR = R(view, view2, eVar.f24639b);
        Pair<i, i> pairN = N(fQ, fR, z, eVar);
        i iVar = (i) pairN.first;
        i iVar2 = (i) pairN.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            fQ = this.f24625g;
        }
        fArr[0] = fQ;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            fR = this.f24626h;
        }
        fArr2[0] = fR;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        iVar.a(objectAnimatorOfFloat);
        iVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    @TargetApi(21)
    public final void X(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fW = x.w(view2) - x.w(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-fW);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fW);
        }
        eVar.f24638a.e("elevation").a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y(View view, View view2, boolean z, boolean z2, e eVar, float f2, float f3, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animatorA;
        if (view2 instanceof c.f.a.d.v.d) {
            c.f.a.d.v.d dVar = (c.f.a.d.v.d) view2;
            float fO = O(view, view2, eVar.f24639b);
            float fP = P(view, view2, eVar.f24639b);
            ((FloatingActionButton) view).i(this.f24621c);
            float fWidth = this.f24621c.width() / 2.0f;
            i iVarE = eVar.f24638a.e("expansion");
            if (z) {
                if (!z2) {
                    dVar.setRevealInfo(new d.e(fO, fP, fWidth));
                }
                if (z2) {
                    fWidth = dVar.getRevealInfo().f15252c;
                }
                animatorA = c.f.a.d.v.a.a(dVar, fO, fP, c.f.a.d.e0.a.b(fO, fP, 0.0f, 0.0f, f2, f3));
                animatorA.addListener(new d(dVar));
                b0(view2, iVarE.c(), (int) fO, (int) fP, fWidth, list);
            } else {
                float f4 = dVar.getRevealInfo().f15252c;
                Animator animatorA2 = c.f.a.d.v.a.a(dVar, fO, fP, fWidth);
                int i2 = (int) fO;
                int i3 = (int) fP;
                b0(view2, iVarE.c(), i2, i3, f4, list);
                a0(view2, iVarE.c(), iVarE.d(), eVar.f24638a.f(), i2, i3, fWidth, list);
                animatorA = animatorA2;
            }
            iVarE.a(animatorA);
            list.add(animatorA);
            list2.add(c.f.a.d.v.a.b(dVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof c.f.a.d.v.d) && (view instanceof ImageView)) {
            c.f.a.d.v.d dVar = (c.f.a.d.v.d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z) {
                if (!z2) {
                    drawable.setAlpha(255);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, c.f.a.d.m.e.f15049a, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, c.f.a.d.m.e.f15049a, 255);
            }
            objectAnimatorOfInt.addUpdateListener(new b(view2));
            eVar.f24638a.e("iconFade").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new c(dVar, drawable));
        }
    }

    public final void a0(View view, long j2, long j3, long j4, int i2, int i3, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j5 = j2 + j3;
            if (j5 < j4) {
                Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i2, i3, f2, f2);
                animatorCreateCircularReveal.setStartDelay(j5);
                animatorCreateCircularReveal.setDuration(j4 - j5);
                list.add(animatorCreateCircularReveal);
            }
        }
    }

    public final void b0(View view, long j2, int i2, int i3, float f2, List<Animator> list) {
        if (Build.VERSION.SDK_INT < 21 || j2 <= 0) {
            return;
        }
        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i2, i3, f2, f2);
        animatorCreateCircularReveal.setStartDelay(0L);
        animatorCreateCircularReveal.setDuration(j2);
        list.add(animatorCreateCircularReveal);
    }

    public final void c0(View view, View view2, boolean z, boolean z2, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fQ = Q(view, view2, eVar.f24639b);
        float fR = R(view, view2, eVar.f24639b);
        Pair<i, i> pairN = N(fQ, fR, z, eVar);
        i iVar = (i) pairN.first;
        i iVar2 = (i) pairN.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fQ);
                view2.setTranslationY(-fR);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            L(view2, eVar, iVar, iVar2, -fQ, -fR, 0.0f, 0.0f, rectF);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fQ);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fR);
        }
        iVar.a(objectAnimatorOfFloat);
        iVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    public final int d0(View view) {
        ColorStateList colorStateListS = x.s(view);
        if (colorStateListS != null) {
            return colorStateListS.getColorForState(view.getDrawableState(), colorStateListS.getDefaultColor());
        }
        return 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    public abstract e e0(Context context, boolean z);

    public final ViewGroup f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f4339h == 0) {
            fVar.f4339h = 80;
        }
    }
}
