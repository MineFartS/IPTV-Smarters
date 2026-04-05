package a.n.p;

import a.n.f;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class b {

    public static class a extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f2728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f2729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f2730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f2731e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f2732f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f2733g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f2734h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f2735i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final float f2736j;

        public a(View view, View view2, int i2, int i3, float f2, float f3) {
            this.f2729c = view;
            this.f2728b = view2;
            this.f2730d = i2 - Math.round(view.getTranslationX());
            this.f2731e = i3 - Math.round(view.getTranslationY());
            this.f2735i = f2;
            this.f2736j = f3;
            int i4 = f.H;
            int[] iArr = (int[]) view2.getTag(i4);
            this.f2732f = iArr;
            if (iArr != null) {
                view2.setTag(i4, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f2732f == null) {
                this.f2732f = new int[2];
            }
            this.f2732f[0] = Math.round(this.f2730d + this.f2729c.getTranslationX());
            this.f2732f[1] = Math.round(this.f2731e + this.f2729c.getTranslationY());
            this.f2728b.setTag(f.H, this.f2732f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f2733g = this.f2729c.getTranslationX();
            this.f2734h = this.f2729c.getTranslationY();
            this.f2729c.setTranslationX(this.f2735i);
            this.f2729c.setTranslationY(this.f2736j);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f2729c.setTranslationX(this.f2733g);
            this.f2729c.setTranslationY(this.f2734h);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f2729c.setTranslationX(this.f2735i);
            this.f2729c.setTranslationY(this.f2736j);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    public static Animator a(View view, TransitionValues transitionValues, int i2, int i3, float f2, float f3, float f4, float f5, TimeInterpolator timeInterpolator, Transition transition) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) transitionValues.view.getTag(f.H)) != null) {
            f2 = (r2[0] - i2) + translationX;
            f3 = (r2[1] - i3) + translationY;
        }
        int iRound = Math.round(f2 - translationX) + i2;
        int iRound2 = i3 + Math.round(f3 - translationY);
        view.setTranslationX(f2);
        view.setTranslationY(f3);
        if (f2 == f4 && f3 == f5) {
            return null;
        }
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, (Property<View, Float>) View.TRANSLATION_Y, path);
        a aVar = new a(view, transitionValues.view, iRound, iRound2, translationX, translationY);
        transition.addListener(aVar);
        objectAnimatorOfFloat.addListener(aVar);
        objectAnimatorOfFloat.addPauseListener(aVar);
        objectAnimatorOfFloat.setInterpolator(timeInterpolator);
        return objectAnimatorOfFloat;
    }
}
