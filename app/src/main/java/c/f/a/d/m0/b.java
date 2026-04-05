package c.f.a.d.m0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import c.f.a.d.d0.k;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static RectF a(TabLayout tabLayout, View view) {
        return view == null ? new RectF() : (tabLayout.y() || !(view instanceof TabLayout.i)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : b((TabLayout.i) view, 24);
    }

    public static RectF b(TabLayout.i iVar, int i2) {
        int contentWidth = iVar.getContentWidth();
        int contentHeight = iVar.getContentHeight();
        int iB = (int) k.b(iVar.getContext(), i2);
        if (contentWidth < iB) {
            contentWidth = iB;
        }
        int left = (iVar.getLeft() + iVar.getRight()) / 2;
        int top = (iVar.getTop() + iVar.getBottom()) / 2;
        int i3 = contentWidth / 2;
        return new RectF(left - i3, top - (contentHeight / 2), i3 + left, top + (left / 2));
    }

    public void c(TabLayout tabLayout, View view, View view2, float f2, Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        RectF rectFA2 = a(tabLayout, view2);
        drawable.setBounds(c.f.a.d.m.a.b((int) rectFA.left, (int) rectFA2.left, f2), drawable.getBounds().top, c.f.a.d.m.a.b((int) rectFA.right, (int) rectFA2.right, f2), drawable.getBounds().bottom);
    }

    public void d(TabLayout tabLayout, View view, Drawable drawable) {
        RectF rectFA = a(tabLayout, view);
        drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
    }
}
