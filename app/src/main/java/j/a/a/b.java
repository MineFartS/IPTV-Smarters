package j.a.a;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    public static class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f30421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f30422c;

        public a(g gVar, View view) {
            this.f30421b = gVar;
            this.f30422c = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f30421b.a(-1.0f, -1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), -1.0f);
            this.f30422c.invalidate();
        }
    }

    /* JADX INFO: renamed from: j.a.a.b$b, reason: collision with other inner class name */
    public static class C0309b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f30423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f30424c;

        public C0309b(g gVar, View view) {
            this.f30423b = gVar;
            this.f30424c = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f30423b.a(-1.0f, -1.0f, -1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            this.f30424c.invalidate();
        }
    }

    public static class c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f30425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f30426c;

        public c(g gVar, View view) {
            this.f30425b = gVar;
            this.f30426c = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f30425b.a(((Float) valueAnimator.getAnimatedValue()).floatValue(), -1.0f, -1.0f, -1.0f);
            this.f30426c.invalidate();
        }
    }

    public static class d implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f30427b;

        public d(g gVar) {
            this.f30427b = gVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f30427b.a(-1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), -1.0f, -1.0f);
        }
    }

    public static class e implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f30428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f30429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f30430d;

        public e(float f2, g gVar, View view) {
            this.f30428b = f2;
            this.f30429c = gVar;
            this.f30430d = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f30429c.a((285.0f - fFloatValue) + this.f30428b, -1.0f, fFloatValue, -1.0f);
            this.f30430d.invalidate();
        }
    }

    public static class f implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f30431b;

        public f(g gVar) {
            this.f30431b = gVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f30431b.a(-1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), -1.0f, -1.0f);
        }
    }

    public interface g {
        void a(float f2, float f3, float f4, float f5);
    }

    public static AnimatorSet a(View view, float f2, int i2, g gVar) {
        float f3 = (270.0f * f2) - 90.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(15.0f, 285.0f);
        long j2 = (i2 / 4) / 2;
        valueAnimatorOfFloat.setDuration(j2);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        valueAnimatorOfFloat.addUpdateListener(new c(gVar, view));
        float f4 = ((f2 + 0.5f) * 720.0f) / 4.0f;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat((f2 * 720.0f) / 4.0f, f4);
        valueAnimatorOfFloat2.setDuration(j2);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new d(gVar));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f3, (285.0f + f3) - 15.0f);
        valueAnimatorOfFloat3.setDuration(j2);
        valueAnimatorOfFloat3.setInterpolator(new DecelerateInterpolator(1.0f));
        valueAnimatorOfFloat3.addUpdateListener(new e(f3, gVar, view));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(f4, ((f2 + 1.0f) * 720.0f) / 4.0f);
        valueAnimatorOfFloat4.setDuration(j2);
        valueAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat4.addUpdateListener(new f(gVar));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(valueAnimatorOfFloat).with(valueAnimatorOfFloat2);
        animatorSet.play(valueAnimatorOfFloat3).with(valueAnimatorOfFloat4).after(valueAnimatorOfFloat2);
        return animatorSet;
    }

    public static ValueAnimator b(View view, float f2, float f3, g gVar) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f3);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new C0309b(gVar, view));
        return valueAnimatorOfFloat;
    }

    public static ValueAnimator c(View view, float f2, float f3, g gVar) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f3);
        valueAnimatorOfFloat.setDuration(5000L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(2.0f));
        valueAnimatorOfFloat.addUpdateListener(new a(gVar, view));
        return valueAnimatorOfFloat;
    }
}
