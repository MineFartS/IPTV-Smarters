package a.b0;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class f0 extends e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f924h = true;

    @Override // a.b0.i0
    @SuppressLint({"NewApi"})
    public void e(View view, int i2, int i3, int i4, int i5) {
        if (f924h) {
            try {
                view.setLeftTopRightBottom(i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                f924h = false;
            }
        }
    }
}
