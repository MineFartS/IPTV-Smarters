package a.n.q;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    public static Object a(View view, float f2, float f3, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return r0.a(view, f2, f3, i2);
        }
        return null;
    }

    public static void b(Object obj, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            r0.b(obj, f2);
        }
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 21;
    }
}
