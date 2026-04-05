package a.i.r.h0;

import android.graphics.Path;
import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static Interpolator a(Path path) {
        return Build.VERSION.SDK_INT >= 21 ? new PathInterpolator(path) : new a(path);
    }
}
