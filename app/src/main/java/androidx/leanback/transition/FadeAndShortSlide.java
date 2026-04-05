package androidx.leanback.transition;

import a.n.l;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class FadeAndShortSlide extends Visibility {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f4430b = new DecelerateInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f4431c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f4432d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f4433e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f4434f = new d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f4435g = new e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f4436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Visibility f4437i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f4438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f4439k;

    public static class a extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            boolean z = viewGroup.getLayoutDirection() == 1;
            float translationX = view.getTranslationX();
            float fB = fadeAndShortSlide.b(viewGroup);
            return z ? translationX + fB : translationX - fB;
        }
    }

    public static class b extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            boolean z = viewGroup.getLayoutDirection() == 1;
            float translationX = view.getTranslationX();
            float fB = fadeAndShortSlide.b(viewGroup);
            return z ? translationX - fB : translationX + fB;
        }
    }

    public static class c extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            int width = iArr[0] + (view.getWidth() / 2);
            viewGroup.getLocationOnScreen(iArr);
            Rect epicenter = fadeAndShortSlide.getEpicenter();
            int width2 = epicenter == null ? iArr[0] + (viewGroup.getWidth() / 2) : epicenter.centerX();
            float translationX = view.getTranslationX();
            float fB = fadeAndShortSlide.b(viewGroup);
            return width < width2 ? translationX - fB : translationX + fB;
        }
    }

    public static class d extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY() + fadeAndShortSlide.c(viewGroup);
        }
    }

    public static class e extends g {
        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY() - fadeAndShortSlide.c(viewGroup);
        }
    }

    public class f extends g {
        public f() {
        }

        @Override // androidx.leanback.transition.FadeAndShortSlide.g
        public float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            int height = iArr[1] + (view.getHeight() / 2);
            viewGroup.getLocationOnScreen(iArr);
            Rect epicenter = FadeAndShortSlide.this.getEpicenter();
            int height2 = epicenter == null ? iArr[1] + (viewGroup.getHeight() / 2) : epicenter.centerY();
            float translationY = view.getTranslationY();
            float fC = fadeAndShortSlide.c(viewGroup);
            return height < height2 ? translationY - fC : translationY + fC;
        }
    }

    public static abstract class g {
        public float a(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationX();
        }

        public float b(FadeAndShortSlide fadeAndShortSlide, ViewGroup viewGroup, View view, int[] iArr) {
            return view.getTranslationY();
        }
    }

    public FadeAndShortSlide() {
        this(8388611);
    }

    public FadeAndShortSlide(int i2) {
        this.f4437i = new Fade();
        this.f4438j = -1.0f;
        this.f4439k = new f();
        e(i2);
    }

    public FadeAndShortSlide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4437i = new Fade();
        this.f4438j = -1.0f;
        this.f4439k = new f();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.e0);
        e(typedArrayObtainStyledAttributes.getInt(l.i0, 8388611));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(TransitionValues transitionValues) {
        int[] iArr = new int[2];
        transitionValues.view.getLocationOnScreen(iArr);
        transitionValues.values.put("android:fadeAndShortSlideTransition:screenPosition", iArr);
    }

    @Override // android.transition.Transition
    public Transition addListener(Transition.TransitionListener transitionListener) {
        this.f4437i.addListener(transitionListener);
        return super.addListener(transitionListener);
    }

    public float b(ViewGroup viewGroup) {
        float f2 = this.f4438j;
        return f2 >= 0.0f ? f2 : viewGroup.getWidth() / 4;
    }

    public float c(ViewGroup viewGroup) {
        float f2 = this.f4438j;
        return f2 >= 0.0f ? f2 : viewGroup.getHeight() / 4;
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public void captureEndValues(TransitionValues transitionValues) {
        this.f4437i.captureEndValues(transitionValues);
        super.captureEndValues(transitionValues);
        a(transitionValues);
    }

    @Override // android.transition.Visibility, android.transition.Transition
    public void captureStartValues(TransitionValues transitionValues) {
        this.f4437i.captureStartValues(transitionValues);
        super.captureStartValues(transitionValues);
        a(transitionValues);
    }

    @Override // android.transition.Transition
    public Transition clone() {
        FadeAndShortSlide fadeAndShortSlide = (FadeAndShortSlide) super.clone();
        fadeAndShortSlide.f4437i = (Visibility) this.f4437i.clone();
        return fadeAndShortSlide;
    }

    public void e(int i2) {
        g gVar;
        if (i2 == 48) {
            gVar = f4435g;
        } else if (i2 == 80) {
            gVar = f4434f;
        } else if (i2 == 112) {
            gVar = this.f4439k;
        } else if (i2 == 8388611) {
            gVar = f4431c;
        } else if (i2 == 8388613) {
            gVar = f4432d;
        } else {
            if (i2 != 8388615) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            gVar = f4433e;
        }
        this.f4436h = gVar;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues2.values.get("android:fadeAndShortSlideTransition:screenPosition");
        int i2 = iArr[0];
        int i3 = iArr[1];
        float translationX = view.getTranslationX();
        Animator animatorA = a.n.p.b.a(view, transitionValues2, i2, i3, this.f4436h.a(this, viewGroup, view, iArr), this.f4436h.b(this, viewGroup, view, iArr), translationX, view.getTranslationY(), f4430b, this);
        Animator animatorOnAppear = this.f4437i.onAppear(viewGroup, view, transitionValues, transitionValues2);
        if (animatorA == null) {
            return animatorOnAppear;
        }
        if (animatorOnAppear == null) {
            return animatorA;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animatorA).with(animatorOnAppear);
        return animatorSet;
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || viewGroup == view) {
            return null;
        }
        int[] iArr = (int[]) transitionValues.values.get("android:fadeAndShortSlideTransition:screenPosition");
        Animator animatorA = a.n.p.b.a(view, transitionValues, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f4436h.a(this, viewGroup, view, iArr), this.f4436h.b(this, viewGroup, view, iArr), f4430b, this);
        Animator animatorOnDisappear = this.f4437i.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        if (animatorA == null) {
            return animatorOnDisappear;
        }
        if (animatorOnDisappear == null) {
            return animatorA;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animatorA).with(animatorOnDisappear);
        return animatorSet;
    }

    @Override // android.transition.Transition
    public Transition removeListener(Transition.TransitionListener transitionListener) {
        this.f4437i.removeListener(transitionListener);
        return super.removeListener(transitionListener);
    }

    @Override // android.transition.Transition
    public void setEpicenterCallback(Transition.EpicenterCallback epicenterCallback) {
        this.f4437i.setEpicenterCallback(epicenterCallback);
        super.setEpicenterCallback(epicenterCallback);
    }
}
