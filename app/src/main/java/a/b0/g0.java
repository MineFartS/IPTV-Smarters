package a.b0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class g0 extends f0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f925i = true;

    @Override // a.b0.i0
    @SuppressLint({"NewApi"})
    public void g(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g(view, i2);
        } else if (f925i) {
            try {
                view.setTransitionVisibility(i2);
            } catch (NoSuchMethodError unused) {
                f925i = false;
            }
        }
    }
}
