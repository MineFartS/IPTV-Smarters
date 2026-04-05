package c.f.a.d.d0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f14739a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f14740b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ValueAnimator f14741c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Animator.AnimatorListener f14742d = new a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f fVar = f.this;
            if (fVar.f14741c == animator) {
                fVar.f14741c = null;
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f14744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ValueAnimator f14745b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f14744a = iArr;
            this.f14745b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f14742d);
        this.f14739a.add(bVar);
    }

    public final void b() {
        ValueAnimator valueAnimator = this.f14741c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14741c = null;
        }
    }

    public void c() {
        ValueAnimator valueAnimator = this.f14741c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f14741c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.f14739a.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                bVar = null;
                break;
            }
            bVar = this.f14739a.get(i2);
            if (StateSet.stateSetMatches(bVar.f14744a, iArr)) {
                break;
            } else {
                i2++;
            }
        }
        b bVar2 = this.f14740b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.f14740b = bVar;
        if (bVar != null) {
            e(bVar);
        }
    }

    public final void e(b bVar) {
        ValueAnimator valueAnimator = bVar.f14745b;
        this.f14741c = valueAnimator;
        valueAnimator.start();
    }
}
