package androidx.leanback.transition;

import a.n.l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class SlideKitkat extends Visibility {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f4444b = new DecelerateInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TimeInterpolator f4445c = new AccelerateInterpolator();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f4446d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f4447e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f4448f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f4449g = new d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f4450h = new e();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f4451i = new f();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4452j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f4453k;

    public static class a extends h {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float a(View view) {
            return view.getTranslationX() - view.getWidth();
        }
    }

    public static class b extends i {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float a(View view) {
            return view.getTranslationY() - view.getHeight();
        }
    }

    public static class c extends h {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float a(View view) {
            return view.getTranslationX() + view.getWidth();
        }
    }

    public static class d extends i {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float a(View view) {
            return view.getTranslationY() + view.getHeight();
        }
    }

    public static class e extends h {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float a(View view) {
            return view.getLayoutDirection() == 1 ? view.getTranslationX() + view.getWidth() : view.getTranslationX() - view.getWidth();
        }
    }

    public static class f extends h {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float a(View view) {
            return view.getLayoutDirection() == 1 ? view.getTranslationX() - view.getWidth() : view.getTranslationX() + view.getWidth();
        }
    }

    public interface g {
        float a(View view);

        float b(View view);

        Property<View, Float> c();
    }

    public static abstract class h implements g {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float b(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.leanback.transition.SlideKitkat.g
        public Property<View, Float> c() {
            return View.TRANSLATION_X;
        }
    }

    public static abstract class i implements g {
        @Override // androidx.leanback.transition.SlideKitkat.g
        public float b(View view) {
            return view.getTranslationY();
        }

        @Override // androidx.leanback.transition.SlideKitkat.g
        public Property<View, Float> c() {
            return View.TRANSLATION_Y;
        }
    }

    public static class j extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f4454b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f4455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final View f4456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f4457e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f4458f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f4459g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Property<View, Float> f4460h;

        public j(View view, Property<View, Float> property, float f2, float f3, int i2) {
            this.f4460h = property;
            this.f4456d = view;
            this.f4458f = f2;
            this.f4457e = f3;
            this.f4459g = i2;
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4456d.setTag(a.n.f.x, new float[]{this.f4456d.getTranslationX(), this.f4456d.getTranslationY()});
            this.f4460h.set(this.f4456d, Float.valueOf(this.f4458f));
            this.f4454b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f4454b) {
                this.f4460h.set(this.f4456d, Float.valueOf(this.f4458f));
            }
            this.f4456d.setVisibility(this.f4459g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f4455c = this.f4460h.get(this.f4456d).floatValue();
            this.f4460h.set(this.f4456d, Float.valueOf(this.f4457e));
            this.f4456d.setVisibility(this.f4459g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f4460h.set(this.f4456d, Float.valueOf(this.f4455c));
            this.f4456d.setVisibility(0);
        }
    }

    public SlideKitkat() {
        b(80);
    }

    public SlideKitkat(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.e0);
        b(typedArrayObtainStyledAttributes.getInt(l.i0, 80));
        long j2 = typedArrayObtainStyledAttributes.getInt(l.g0, -1);
        if (j2 >= 0) {
            setDuration(j2);
        }
        long j3 = typedArrayObtainStyledAttributes.getInt(l.h0, -1);
        if (j3 > 0) {
            setStartDelay(j3);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(l.f0, 0);
        if (resourceId > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Animator a(View view, Property<View, Float> property, float f2, float f3, float f4, TimeInterpolator timeInterpolator, int i2) {
        int i3 = a.n.f.x;
        float[] fArr = (float[]) view.getTag(i3);
        if (fArr != null) {
            f2 = View.TRANSLATION_Y == property ? fArr[1] : fArr[0];
            view.setTag(i3, null);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, property, f2, f3);
        j jVar = new j(view, property, f4, f3, i2);
        objectAnimatorOfFloat.addListener(jVar);
        objectAnimatorOfFloat.addPauseListener(jVar);
        objectAnimatorOfFloat.setInterpolator(timeInterpolator);
        return objectAnimatorOfFloat;
    }

    public void b(int i2) {
        g gVar;
        if (i2 == 3) {
            gVar = f4446d;
        } else if (i2 == 5) {
            gVar = f4448f;
        } else if (i2 == 48) {
            gVar = f4447e;
        } else if (i2 == 80) {
            gVar = f4449g;
        } else if (i2 == 8388611) {
            gVar = f4450h;
        } else {
            if (i2 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            gVar = f4451i;
        }
        this.f4453k = gVar;
        this.f4452j = i2;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i2, TransitionValues transitionValues2, int i3) {
        View view = transitionValues2 != null ? transitionValues2.view : null;
        if (view == null) {
            return null;
        }
        float fB = this.f4453k.b(view);
        return a(view, this.f4453k.c(), this.f4453k.a(view), fB, fB, f4444b, 0);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i2, TransitionValues transitionValues2, int i3) {
        View view = transitionValues != null ? transitionValues.view : null;
        if (view == null) {
            return null;
        }
        float fB = this.f4453k.b(view);
        return a(view, this.f4453k.c(), fB, this.f4453k.a(view), fB, f4445c, 4);
    }
}
