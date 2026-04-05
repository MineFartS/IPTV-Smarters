package c.f.a.d.k0;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.f.a.d.k0.e;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e.b f15008a;

    public a(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.K(0.1f);
        swipeDismissBehavior.J(0.6f);
        swipeDismissBehavior.L(0);
    }

    public boolean a(View view) {
        return view instanceof d;
    }

    public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (coordinatorLayout.C(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                e.b().e(this.f15008a);
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            e.b().f(this.f15008a);
        }
    }
}
