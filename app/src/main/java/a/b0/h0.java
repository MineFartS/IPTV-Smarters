package a.b0;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class h0 extends g0 {
    @Override // a.b0.d0, a.b0.i0
    public float c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // a.b0.f0, a.b0.i0
    public void e(View view, int i2, int i3, int i4, int i5) {
        view.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    @Override // a.b0.d0, a.b0.i0
    public void f(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // a.b0.g0, a.b0.i0
    public void g(View view, int i2) {
        view.setTransitionVisibility(i2);
    }

    @Override // a.b0.e0, a.b0.i0
    public void h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // a.b0.e0, a.b0.i0
    public void i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
