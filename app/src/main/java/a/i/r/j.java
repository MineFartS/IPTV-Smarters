package a.i.r;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static b a(MenuItem menuItem) {
        if (menuItem instanceof a.i.l.a.b) {
            return ((a.i.l.a.b) menuItem).b();
        }
        Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    @Deprecated
    public static View b(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static MenuItem c(MenuItem menuItem, b bVar) {
        if (menuItem instanceof a.i.l.a.b) {
            return ((a.i.l.a.b) menuItem).a(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void d(MenuItem menuItem, char c2, int i2) {
        if (menuItem instanceof a.i.l.a.b) {
            ((a.i.l.a.b) menuItem).setAlphabeticShortcut(c2, i2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c2, i2);
        }
    }

    public static void e(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof a.i.l.a.b) {
            ((a.i.l.a.b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    public static void f(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof a.i.l.a.b) {
            ((a.i.l.a.b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    public static void g(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof a.i.l.a.b) {
            ((a.i.l.a.b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    public static void h(MenuItem menuItem, char c2, int i2) {
        if (menuItem instanceof a.i.l.a.b) {
            ((a.i.l.a.b) menuItem).setNumericShortcut(c2, i2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c2, i2);
        }
    }

    public static void i(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof a.i.l.a.b) {
            ((a.i.l.a.b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
