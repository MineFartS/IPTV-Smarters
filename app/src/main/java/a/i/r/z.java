package a.i.r;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(a.i.d.Y);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && x.L(viewGroup) == null) ? false : true;
    }
}
