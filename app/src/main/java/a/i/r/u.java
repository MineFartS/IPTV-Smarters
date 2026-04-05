package a.i.r;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f2091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewTreeObserver f2092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f2093d;

    public u(View view, Runnable runnable) {
        this.f2091b = view;
        this.f2092c = view.getViewTreeObserver();
        this.f2093d = runnable;
    }

    public static u a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        u uVar = new u(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(uVar);
        view.addOnAttachStateChangeListener(uVar);
        return uVar;
    }

    public void b() {
        (this.f2092c.isAlive() ? this.f2092c : this.f2091b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f2091b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f2093d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f2092c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
