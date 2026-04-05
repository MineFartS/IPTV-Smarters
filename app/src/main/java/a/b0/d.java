package a.b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class d extends j0 {

    public class a extends n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f899b;

        public a(View view) {
            this.f899b = view;
        }

        @Override // a.b0.m.f
        public void c(m mVar) {
            c0.g(this.f899b, 1.0f);
            c0.a(this.f899b);
            mVar.X(this);
        }
    }

    public static class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f902c = false;

        public b(View view) {
            this.f901b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.g(this.f901b, 1.0f);
            if (this.f902c) {
                this.f901b.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (a.i.r.x.Q(this.f901b) && this.f901b.getLayerType() == 0) {
                this.f902c = true;
                this.f901b.setLayerType(2, null);
            }
        }
    }

    public d(int i2) {
        r0(i2);
    }

    public static float u0(s sVar, float f2) {
        Float f3;
        return (sVar == null || (f3 = (Float) sVar.f996a.get("android:fade:transitionAlpha")) == null) ? f2 : f3.floatValue();
    }

    @Override // a.b0.j0, a.b0.m
    public void k(s sVar) {
        super.k(sVar);
        sVar.f996a.put("android:fade:transitionAlpha", Float.valueOf(c0.c(sVar.f997b)));
    }

    @Override // a.b0.j0
    public Animator n0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float fU0 = u0(sVar, 0.0f);
        return t0(view, fU0 != 1.0f ? fU0 : 0.0f, 1.0f);
    }

    @Override // a.b0.j0
    public Animator p0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        c0.e(view);
        return t0(view, u0(sVar, 1.0f), 0.0f);
    }

    public final Animator t0(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        c0.g(view, f2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, c0.f897b, f3);
        objectAnimatorOfFloat.addListener(new b(view));
        a(new a(view));
        return objectAnimatorOfFloat;
    }
}
