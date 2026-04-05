package c.f.a.d.m;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f15059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15061e;

    public i(long j2, long j3) {
        this.f15057a = 0L;
        this.f15058b = 300L;
        this.f15059c = null;
        this.f15060d = 0;
        this.f15061e = 1;
        this.f15057a = j2;
        this.f15058b = j3;
    }

    public i(long j2, long j3, TimeInterpolator timeInterpolator) {
        this.f15057a = 0L;
        this.f15058b = 300L;
        this.f15059c = null;
        this.f15060d = 0;
        this.f15061e = 1;
        this.f15057a = j2;
        this.f15058b = j3;
        this.f15059c = timeInterpolator;
    }

    public static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f15060d = valueAnimator.getRepeatCount();
        iVar.f15061e = valueAnimator.getRepeatMode();
        return iVar;
    }

    public static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f15043b : interpolator instanceof AccelerateInterpolator ? a.f15044c : interpolator instanceof DecelerateInterpolator ? a.f15045d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f15057a;
    }

    public long d() {
        return this.f15058b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f15059c;
        return timeInterpolator != null ? timeInterpolator : a.f15043b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (c() == iVar.c() && d() == iVar.d() && g() == iVar.g() && h() == iVar.h()) {
            return e().getClass().equals(iVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f15060d;
    }

    public int h() {
        return this.f15061e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }
}
