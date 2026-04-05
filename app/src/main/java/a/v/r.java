package a.v;

import android.app.Activity;
import android.view.View;
import androidx.navigation.NavController;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static NavController a(Activity activity, int i2) {
        NavController navControllerC = c(a.i.h.a.r(activity, i2));
        if (navControllerC != null) {
            return navControllerC;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i2);
    }

    public static NavController b(View view) {
        NavController navControllerC = c(view);
        if (navControllerC != null) {
            return navControllerC;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    public static NavController c(View view) {
        while (view != null) {
            NavController navControllerD = d(view);
            if (navControllerD != null) {
                return navControllerD;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static NavController d(View view) {
        Object tag = view.getTag(u.f3631a);
        if (tag instanceof WeakReference) {
            tag = ((WeakReference) tag).get();
        } else if (!(tag instanceof NavController)) {
            return null;
        }
        return (NavController) tag;
    }

    public static void e(View view, NavController navController) {
        view.setTag(u.f3631a, navController);
    }
}
