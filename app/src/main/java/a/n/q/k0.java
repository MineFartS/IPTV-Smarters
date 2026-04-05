package a.n.q;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public static void a(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            l0.a(view, z, view.getResources().getDimensionPixelSize(a.n.c.t));
        }
    }

    public static void b(View view, boolean z, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            l0.a(view, z, i2);
        }
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 21;
    }
}
