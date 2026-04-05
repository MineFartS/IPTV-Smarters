package a.y.e;

import a.i.r.x;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f3941a = new h();

    public static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f2 = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            if (childAt != view) {
                float fW = x.w(childAt);
                if (fW > f2) {
                    f2 = fW;
                }
            }
        }
        return f2;
    }

    @Override // a.y.e.g
    public void a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            int i2 = a.y.c.f3785a;
            Object tag = view.getTag(i2);
            if (tag instanceof Float) {
                x.w0(view, ((Float) tag).floatValue());
            }
            view.setTag(i2, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // a.y.e.g
    public void b(View view) {
    }

    @Override // a.y.e.g
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f2, float f3, int i2, boolean z) {
    }

    @Override // a.y.e.g
    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f2, float f3, int i2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21 && z) {
            int i3 = a.y.c.f3785a;
            if (view.getTag(i3) == null) {
                Float fValueOf = Float.valueOf(x.w(view));
                x.w0(view, e(recyclerView, view) + 1.0f);
                view.setTag(i3, fValueOf);
            }
        }
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }
}
