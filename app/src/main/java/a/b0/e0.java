package a.b0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends d0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f922f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f923g = true;

    @Override // a.b0.i0
    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f922f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f922f = false;
            }
        }
    }

    @Override // a.b0.i0
    @SuppressLint({"NewApi"})
    public void i(View view, Matrix matrix) {
        if (f923g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f923g = false;
            }
        }
    }
}
