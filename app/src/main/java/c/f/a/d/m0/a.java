package c.f.a.d.m0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes2.dex */
public class a extends b {
    public static float e(float f2) {
        double d2 = f2;
        Double.isNaN(d2);
        return (float) (1.0d - Math.cos((d2 * 3.141592653589793d) / 2.0d));
    }

    public static float f(float f2) {
        double d2 = f2;
        Double.isNaN(d2);
        return (float) Math.sin((d2 * 3.141592653589793d) / 2.0d);
    }

    @Override // c.f.a.d.m0.b
    public void c(TabLayout tabLayout, View view, View view2, float f2, Drawable drawable) {
        float f3;
        float fE;
        RectF rectFA = b.a(tabLayout, view);
        RectF rectFA2 = b.a(tabLayout, view2);
        if (rectFA.left < rectFA2.left) {
            f3 = e(f2);
            fE = f(f2);
        } else {
            f3 = f(f2);
            fE = e(f2);
        }
        drawable.setBounds(c.f.a.d.m.a.b((int) rectFA.left, (int) rectFA2.left, f3), drawable.getBounds().top, c.f.a.d.m.a.b((int) rectFA.right, (int) rectFA2.right, fE), drawable.getBounds().bottom);
    }
}
