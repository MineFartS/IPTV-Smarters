package a.b0;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class d0 extends i0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f903e = true;

    @Override // a.b0.i0
    public void a(View view) {
    }

    @Override // a.b0.i0
    @SuppressLint({"NewApi"})
    public float c(View view) {
        if (f903e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f903e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // a.b0.i0
    public void d(View view) {
    }

    @Override // a.b0.i0
    @SuppressLint({"NewApi"})
    public void f(View view, float f2) {
        if (f903e) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                f903e = false;
            }
        }
        view.setAlpha(f2);
    }
}
