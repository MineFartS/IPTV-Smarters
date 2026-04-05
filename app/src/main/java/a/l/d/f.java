package a.l.d;

import a.i.n.b;
import a.l.d.z;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public class f {

    public class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f2366a;

        public a(Fragment fragment) {
            this.f2366a = fragment;
        }

        @Override // a.i.n.b.a
        public void a() {
            if (this.f2366a.getAnimatingAway() != null) {
                View animatingAway = this.f2366a.getAnimatingAway();
                this.f2366a.setAnimatingAway(null);
                animatingAway.clearAnimation();
            }
            this.f2366a.setAnimator(null);
        }
    }

    public class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f2368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ z.g f2369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a.i.n.b f2370d;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f2368b.getAnimatingAway() != null) {
                    b.this.f2368b.setAnimatingAway(null);
                    b bVar = b.this;
                    bVar.f2369c.a(bVar.f2368b, bVar.f2370d);
                }
            }
        }

        public b(ViewGroup viewGroup, Fragment fragment, z.g gVar, a.i.n.b bVar) {
            this.f2367a = viewGroup;
            this.f2368b = fragment;
            this.f2369c = gVar;
            this.f2370d = bVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2367a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f2373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Fragment f2374d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ z.g f2375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ a.i.n.b f2376f;

        public c(ViewGroup viewGroup, View view, Fragment fragment, z.g gVar, a.i.n.b bVar) {
            this.f2372b = viewGroup;
            this.f2373c = view;
            this.f2374d = fragment;
            this.f2375e = gVar;
            this.f2376f = bVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2372b.endViewTransition(this.f2373c);
            Animator animator2 = this.f2374d.getAnimator();
            this.f2374d.setAnimator(null);
            if (animator2 == null || this.f2372b.indexOfChild(this.f2373c) >= 0) {
                return;
            }
            this.f2375e.a(this.f2374d, this.f2376f);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f2377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f2378b;

        public d(Animator animator) {
            this.f2377a = null;
            this.f2378b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        public d(Animation animation) {
            this.f2377a = animation;
            this.f2378b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    public static class e extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ViewGroup f2379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final View f2380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2381d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2382e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f2383f;

        public e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2383f = true;
            this.f2379b = viewGroup;
            this.f2380c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation) {
            this.f2383f = true;
            if (this.f2381d) {
                return !this.f2382e;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.f2381d = true;
                a.i.r.u.a(this.f2379b, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j2, Transformation transformation, float f2) {
            this.f2383f = true;
            if (this.f2381d) {
                return !this.f2382e;
            }
            if (!super.getTransformation(j2, transformation, f2)) {
                this.f2381d = true;
                a.i.r.u.a(this.f2379b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2381d || !this.f2383f) {
                this.f2379b.endViewTransition(this.f2380c);
                this.f2382e = true;
            } else {
                this.f2383f = false;
                this.f2379b.post(this);
            }
        }
    }

    public static void a(Fragment fragment, d dVar, z.g gVar) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        a.i.n.b bVar = new a.i.n.b();
        bVar.d(new a(fragment));
        gVar.b(fragment, bVar);
        if (dVar.f2377a != null) {
            e eVar = new e(dVar.f2377a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, bVar));
            fragment.mView.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f2378b;
        fragment.setAnimator(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, bVar));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    public static int b(Fragment fragment, boolean z, boolean z2) {
        return z2 ? z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    public static d c(Context context, Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int iB = b(fragment, z, z2);
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            int i2 = a.l.b.f2220c;
            if (viewGroup.getTag(i2) != null) {
                fragment.mContainer.setTag(i2, null);
            }
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z, iB);
        if (animationOnCreateAnimation != null) {
            return new d(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z, iB);
        if (animatorOnCreateAnimator != null) {
            return new d(animatorOnCreateAnimator);
        }
        if (iB == 0 && nextTransition != 0) {
            iB = d(nextTransition, z);
        }
        if (iB != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iB));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iB);
                    if (animationLoadAnimation != null) {
                        return new d(animationLoadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iB);
                    if (animatorLoadAnimator != null) {
                        return new d(animatorLoadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (zEquals) {
                        throw e3;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iB);
                    if (animationLoadAnimation2 != null) {
                        return new d(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    public static int d(int i2, boolean z) {
        if (i2 == 4097) {
            return z ? a.l.a.f2216e : a.l.a.f2217f;
        }
        if (i2 == 4099) {
            return z ? a.l.a.f2214c : a.l.a.f2215d;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z ? a.l.a.f2212a : a.l.a.f2213b;
    }
}
