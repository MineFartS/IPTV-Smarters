package androidx.leanback.widget;

import a.n.f;
import a.n.h;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class MediaNowPlayingView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f4479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f4480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f4481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ObjectAnimator f4482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ObjectAnimator f4483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ObjectAnimator f4484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearInterpolator f4485h;

    public MediaNowPlayingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        this.f4485h = linearInterpolator;
        LayoutInflater.from(context).inflate(h.f2635f, (ViewGroup) this, true);
        ImageView imageView = (ImageView) findViewById(f.f2610a);
        this.f4479b = imageView;
        ImageView imageView2 = (ImageView) findViewById(f.f2611b);
        this.f4480c = imageView2;
        ImageView imageView3 = (ImageView) findViewById(f.f2612c);
        this.f4481d = imageView3;
        imageView.setPivotY(imageView.getDrawable().getIntrinsicHeight());
        imageView2.setPivotY(imageView2.getDrawable().getIntrinsicHeight());
        imageView3.setPivotY(imageView3.getDrawable().getIntrinsicHeight());
        setDropScale(imageView);
        setDropScale(imageView2);
        setDropScale(imageView3);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "scaleY", 0.41666666f, 0.25f, 0.41666666f, 0.5833333f, 0.75f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.5f, 0.33333334f, 0.16666667f, 0.33333334f, 0.5f, 0.5833333f, 0.75f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.41666666f, 0.25f, 0.33333334f, 0.41666666f);
        this.f4482e = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setDuration(2320L);
        objectAnimatorOfFloat.setInterpolator(linearInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView2, "scaleY", 1.0f, 0.9166667f, 0.8333333f, 0.9166667f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.41666666f, 0.25f, 0.41666666f, 0.6666667f, 0.8333333f, 1.0f, 0.8333333f, 0.75f, 0.6666667f, 1.0f);
        this.f4483f = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setDuration(2080L);
        objectAnimatorOfFloat2.setInterpolator(linearInterpolator);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView3, "scaleY", 0.6666667f, 0.75f, 0.8333333f, 1.0f, 0.9166667f, 0.75f, 0.5833333f, 0.41666666f, 0.5833333f, 0.6666667f, 0.75f, 1.0f, 0.9166667f, 1.0f, 0.75f, 0.5833333f, 0.75f, 0.9166667f, 1.0f, 0.8333333f, 0.6666667f, 0.75f, 0.5833333f, 0.41666666f, 0.25f, 0.6666667f);
        this.f4484g = objectAnimatorOfFloat3;
        objectAnimatorOfFloat3.setRepeatCount(-1);
        objectAnimatorOfFloat3.setDuration(2000L);
        objectAnimatorOfFloat3.setInterpolator(linearInterpolator);
    }

    public static void setDropScale(View view) {
        view.setScaleY(0.083333336f);
    }

    public final void a() {
        b(this.f4482e);
        b(this.f4483f);
        b(this.f4484g);
        this.f4479b.setVisibility(0);
        this.f4480c.setVisibility(0);
        this.f4481d.setVisibility(0);
    }

    public final void b(Animator animator) {
        if (animator.isStarted()) {
            return;
        }
        animator.start();
    }

    public final void c() {
        d(this.f4482e, this.f4479b);
        d(this.f4483f, this.f4480c);
        d(this.f4484g, this.f4481d);
        this.f4479b.setVisibility(8);
        this.f4480c.setVisibility(8);
        this.f4481d.setVisibility(8);
    }

    public final void d(Animator animator, View view) {
        if (animator.isStarted()) {
            animator.cancel();
            setDropScale(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 == 8) {
            c();
        } else {
            a();
        }
    }
}
