package c.e.b.a.a.f.e;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static Interpolator a(float f2, float f3, float f4, float f5) {
        return Build.VERSION.SDK_INT >= 21 ? d.a(f2, f3, f4, f5) : e.a(f2, f3, f4, f5);
    }
}
